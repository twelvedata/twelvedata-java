## API errors

Every documented non-2xx response is surfaced as a typed subclass of `com.twelvedata.client.errors.TwelvedataApiException` (extends `java.lang.RuntimeException`). The wiring is installed by `Twelvedata.newApiClient` — no opt-in required.

| HTTP Status | Exception | Description |
|---|---|---|
| 400 | `TwelvedataApiException.BadRequestException` | Invalid parameters were supplied to the API |
| 401 | `TwelvedataApiException.UnauthorizedException` | Invalid or missing API key |
| 403 | `TwelvedataApiException.ForbiddenException` | Access denied to the requested resource |
| 404 | `TwelvedataApiException.NotFoundException` | The requested resource does not exist |
| 414 | `TwelvedataApiException.ParameterTooLongException` | A request parameter exceeds the maximum allowed length |
| 429 | `TwelvedataApiException.TooManyRequestsException` | API rate limit exceeded |
| 500 | `TwelvedataApiException.InternalServerErrorException` | Unexpected server-side error |

A non-2xx response with a body that does **not** match the Twelve Data error shape — empty body, HTML, malformed JSON — falls through to the generator's `com.twelvedata.client.ApiException` with the original status and body intact. Network and transport errors (DNS, timeouts, connection resets) propagate as the standard `java.net.http` / `java.io.IOException` types.

Every `TwelvedataApiException` exposes:
- `getStatusCode()` — HTTP status code (e.g. 400, 401)
- `getCode()` — Twelve Data error code from the response body
- `getStatus()` — Twelve Data status string from the response body
- `getMessage()` — human-readable error message

`getResponseHeaders()` and `getResponseBody()` are also available when you need the raw response.

For the complete list of API error codes and their meanings, see the [Twelve Data Errors documentation](https://twelvedata.com/docs/introduction/errors).

```java
package com.example;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.APIGetPriceRequest;
import com.twelvedata.client.errors.TwelvedataApiException;
import com.twelvedata.client.model.GetPrice200Response;

public class App {
    public static void main(String[] args) {
        ApiClient client = Twelvedata.newApiClient("YOUR_API_KEY_HERE");
        MarketDataApi api = new MarketDataApi(client);

        try {
            GetPrice200Response response = api.getPrice(
                APIGetPriceRequest.newBuilder()
                    .symbol("AAPL")
                    .build()
            );
            System.out.println(response);
        } catch (TwelvedataApiException.TooManyRequestsException e) {
            // API rate limit exceeded — back off and retry
        } catch (TwelvedataApiException.UnauthorizedException e) {
            // Invalid or missing API key
        } catch (TwelvedataApiException e) {
            // Any other Twelve Data API error (400, 403, 404, 414, 500, …)
            System.err.println("API error [" + e.getStatusCode() + "]: " + e.getMessage());
        } catch (Exception e) {
            // Network / transport / unknown error
            System.err.println("Unexpected error: " + e);
        }
    }
}
```

### Customising the HTTP client

If you build your own `ApiClient` (custom timeouts, proxy, instrumentation) instead of using `Twelvedata.newApiClient`, call `Twelvedata.installErrorHandling(client)` to keep typed errors working. It composes with any response interceptor you've already attached.

```java
ApiClient client = new ApiClient();
client.setHttpClientBuilder(java.net.http.HttpClient.newBuilder()
    .connectTimeout(java.time.Duration.ofSeconds(30)));
Twelvedata.installErrorHandling(client);
```

## WebSocket errors

All WebSocket errors extend `com.twelvedata.client.ws.TwelvedataWebSocketException`. They are surfaced in two places: `connect()` completes its `CompletableFuture` exceptionally with the first error it encounters, and any error after a successful connection is delivered via `TwelvedataWebSocketListener.onError`. Fatal errors (e.g. an invalid API key) suppress the auto-reconnect loop so the client fails fast instead of retrying indefinitely.

| Exception | Raised when |
|---|---|
| `TwelvedataWebSocketException.AuthException` | API key is missing, invalid, or rejected by the server during the upgrade handshake. **Not retried.** |
| `TwelvedataWebSocketException.ConnectionException` | Socket failed to open, a send failed, or the server returned an unexpected non-auth response. |
| `TwelvedataWebSocketException.TimeoutException` | No pong reply received within `pingTimeoutMs`. Triggers a reconnect. Exposes `getTimeoutMs()`. |
| `TwelvedataWebSocketException.ReconnectException` | Reconnect attempts were exhausted (hit `reconnect.maxAttempts`). Exposes `getAttempts()`. |

```java
package com.example;

import java.util.concurrent.CompletionException;

import com.twelvedata.client.ws.TwelvedataWebSocketClient;
import com.twelvedata.client.ws.TwelvedataWebSocketException;
import com.twelvedata.client.ws.TwelvedataWebSocketListener;
import com.twelvedata.client.ws.TwelvedataWebSocketOptions;

public class App {
    public static void main(String[] args) throws InterruptedException {
        TwelvedataWebSocketClient client = new TwelvedataWebSocketClient(
            TwelvedataWebSocketOptions.builder()
                .apiKey("YOUR_API_KEY_HERE") // defaults to System.getenv("TWELVEDATA_API_KEY")
                .build());

        client.addListener(new TwelvedataWebSocketListener() {
            @Override
            public void onError(TwelvedataWebSocketException error) {
                System.err.println("WebSocket error [" + error.getClass().getSimpleName() + "]: " + error.getMessage());

                if (error instanceof TwelvedataWebSocketException.ReconnectException) {
                    // Retries exhausted — client is inert until connect() is called again.
                }
            }
        });

        try {
            client.connect().join();
        } catch (CompletionException ex) {
            if (ex.getCause() instanceof TwelvedataWebSocketException.AuthException) {
                // Invalid / missing API key — not retried; fail fast.
                System.exit(1);
            }
            throw ex;
        }

        client.subscribe("AAPL");

        // The WS runs on daemon threads; keep the main thread alive so events
        // can be delivered. Ctrl-C triggers the shutdown hook, which closes
        // the connection cleanly.
        Runtime.getRuntime().addShutdownHook(new Thread(client::disconnect));
        Thread.currentThread().join();
    }
}
```
