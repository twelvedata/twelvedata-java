# Twelve Data API client for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.twelvedata/twelvedata-java)](https://central.sonatype.com/artifact/com.twelvedata/twelvedata-java)
[![License](https://img.shields.io/github/license/twelvedata/twelvedata-java?v=2)](https://github.com/twelvedata/twelvedata-java/blob/master/LICENSE)
[![Issues](https://img.shields.io/github/issues/twelvedata/twelvedata-java)](https://github.com/twelvedata/twelvedata-java/issues)

Twelve Data official library. This package supports all main features of the service:
- Real-time and historical market data: time series, quotes, end-of-day prices, exchange rates, and market movers.
- Fundamentals: financial statements, earnings, dividends, splits, company profiles, and key statistics.
- 100+ technical indicators: SMA, EMA, RSI, MACD, Bollinger Bands, Ichimoku, and many more.
- Analysis & estimates: analyst ratings, price targets, EPS trends, revenue and growth estimates.
- ETFs and mutual funds: summaries, composition, performance, risk, and ratings.

🔑 **API key** is required. If you don't have it yet, get it by [signing up here](https://twelvedata.com/pricing).

## Requirements
JDK 11 or later.

## Installation

Maven (`pom.xml`):

```xml
<dependency>
  <groupId>com.twelvedata</groupId>
  <artifactId>twelvedata-java</artifactId>
  <version>1.0.4</version>
</dependency>
```

Gradle (`build.gradle`):

```groovy
implementation 'com.twelvedata:twelvedata-java:1.0.4'
```

🔗 View the package on [Maven Central](https://central.sonatype.com/artifact/com.twelvedata/twelvedata-java).

## Quick start

### 1. Set up a new project

**Maven** (`pom.xml`):

```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.5 \
    -DjavaCompilerVersion=11 \
    -DinteractiveMode=false
cd my-app
```

Add the Twelve Data dependency to `pom.xml` inside `<dependencies>`:

```xml
<dependency>
  <groupId>com.twelvedata</groupId>
  <artifactId>twelvedata-java</artifactId>
  <version>1.0.4</version>
</dependency>
```

**Gradle** (`build.gradle`):

```bash
mkdir my-app && cd my-app
gradle init --type java-application --dsl groovy \
    --package com.example --project-name my-app \
    --java-version 11 --test-framework junit-jupiter \
    --no-split-project
```

Add the Twelve Data dependency to `build.gradle` inside `dependencies { ... }`:

```groovy
implementation 'com.twelvedata:twelvedata-java:1.0.4'
```

### 2. Replace `src/main/java/com/example/App.java`

```java
package com.example;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.APIGetTimeSeriesRequest;
import com.twelvedata.client.errors.TwelvedataApiException;
import com.twelvedata.client.model.GetTimeSeries200Response;
import com.twelvedata.client.model.IntervalEnum;

public class App {
    public static void main(String[] args) {
        ApiClient client = Twelvedata.newApiClient("YOUR_API_KEY_HERE"); // defaults to System.getenv("TWELVEDATA_API_KEY")
        MarketDataApi api = new MarketDataApi(client);

        try {
            GetTimeSeries200Response response = api.getTimeSeries(
                APIGetTimeSeriesRequest.newBuilder()
                    .interval(IntervalEnum._1DAY)
                    .symbol("AAPL")
                    .outputsize(5L)
                    .build()
            );
            System.out.println(response);
        } catch (TwelvedataApiException e) {
            System.err.println("API error [" + e.getStatusCode() + "]: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e);
        }
    }
}
```

### 3. Run

Maven:

```bash
mvn -q compile exec:java -Dexec.mainClass=com.example.App
```

Gradle:

```bash
./gradlew run
```

👀 Check the full example and other examples [here](https://github.com/twelvedata/twelvedata-java/tree/master/examples).
## WebSocket

The library ships with a WebSocket client for streaming real-time prices from
Twelve Data. It handles authorization, sends both application-level heartbeats
and protocol-level pings, detects dead connections, and automatically
reconnects with exponential backoff — re-subscribing to your active symbols on
the way back up.

> WebSocket streaming is available on the **Pro** (individual) and **Venture**
> (business) plans and above. **Basic** and **Grow** plans are limited to one
> connection and up to 8 simultaneous subscriptions from the
> [trial symbol list](https://support.twelvedata.com/en/articles/5335783-trial).
> See the [WebSocket FAQ](https://support.twelvedata.com/en/articles/5194610-websocket-faq)
> for more details.
### Usage

```java
package com.example;

import java.util.concurrent.CompletionException;

import com.twelvedata.client.ws.PriceEvent;
import com.twelvedata.client.ws.ReconnectingEvent;
import com.twelvedata.client.ws.SubscribeStatusEvent;
import com.twelvedata.client.ws.TwelvedataWebSocketClient;
import com.twelvedata.client.ws.TwelvedataWebSocketException;
import com.twelvedata.client.ws.TwelvedataWebSocketListener;
import com.twelvedata.client.ws.TwelvedataWebSocketOptions;

public class App {
    public static void main(String[] args) {
        TwelvedataWebSocketClient client = new TwelvedataWebSocketClient(
            TwelvedataWebSocketOptions.builder()
                .apiKey("YOUR_API_KEY_HERE") // defaults to System.getenv("TWELVEDATA_API_KEY")
                .build());

        client.addListener(new TwelvedataWebSocketListener() {
            @Override
            public void onPrice(PriceEvent event) {
                System.out.println(event.getSymbol() + " @ " + event.getPrice() + " (" + event.getTimestamp() + ")");
            }

            @Override
            public void onSubscribeStatus(SubscribeStatusEvent event) {
                System.out.println("Subscribed: " + event.getSuccess());
                if (!event.getFails().isEmpty()) {
                    System.err.println("Failed: " + event.getFails());
                }
            }

            @Override
            public void onReconnecting(ReconnectingEvent event) {
                System.out.println("Reconnecting (attempt " + event.getAttempt() + ") in " + event.getDelayMs() + "ms");
            }

            @Override
            public void onError(TwelvedataWebSocketException error) {
                System.err.println("WebSocket error: " + error.getClass().getSimpleName() + ": " + error.getMessage());
            }
        });

        try {
            client.connect().join();
        } catch (CompletionException ex) {
            if (ex.getCause() instanceof TwelvedataWebSocketException.AuthException) {
                // Invalid / missing API key — not retried.
                System.exit(1);
            }
            throw ex;
        }

        client.subscribe("AAPL,EUR/USD,BTC/USD");

        // Later, if you want to stop:
        // client.unsubscribe("BTC/USD");
        // client.disconnect();
    }
}
```

For the full list of WebSocket error types and recommended handling, see
[WebSocket errors](error_handling.md#websocket-errors).

### WebSocket client configuration

All timing and retry knobs are exposed as constants on `WebSocketConstants` and can be overridden via the options builder:

```java
import com.twelvedata.client.ws.ReconnectOptions;
import com.twelvedata.client.ws.TwelvedataWebSocketClient;
import com.twelvedata.client.ws.TwelvedataWebSocketOptions;
import com.twelvedata.client.ws.WebSocketConstants;

TwelvedataWebSocketClient client = new TwelvedataWebSocketClient(
    TwelvedataWebSocketOptions.builder()
        .apiKey(System.getenv("TWELVEDATA_API_KEY")) // optional; falls back to env var
        .heartbeatIntervalMs(WebSocketConstants.DEFAULT_HEARTBEAT_INTERVAL_MS) // 10_000 by default
        .pingIntervalMs(30_000L)
        .pingTimeoutMs(10_000L)
        .reconnect(ReconnectOptions.builder()
            .initialDelayMs(1_000L)
            .maxDelayMs(30_000L)
            .maxAttempts(10)
            .backoffFactor(2.0)
            .build())
        // Pass `.reconnect(null)` to disable automatic reconnection entirely.
        .build());
```

👀 Check the full example and other examples [here](https://github.com/twelvedata/twelvedata-java/tree/master/examples).

## Error Handling

See [error_handling.md](error_handling.md) for error types, properties, and usage examples.

For the complete list of API error codes and their meanings, see the [Twelve Data Errors documentation](https://twelvedata.com/docs/introduction/errors).

## API Reference

See [api_reference.md](api_reference.md) for the complete list of API endpoints and models.

## Documentation
Delve deeper with our [official documentation](https://twelvedata.com/docs).

## Examples
Explore practical scenarios in the [examples](https://github.com/twelvedata/twelvedata-java/tree/master/examples) directory.

## Support
- 🌐 Visit our [contact page](https://twelvedata.com/contact).
- 🛠 Or our [support center](https://support.twelvedata.com/).

## Stay updated
- Follow us on [𝕏](https://twitter.com/TwelveData).
- Follow us on [Telegram](https://t.me/twelvedata).

## Contributing
1. Fork and clone: `$ git clone https://github.com/twelvedata/twelvedata-java .`.
2. Branch out: `$ git checkout -b my-feature`.
3. Commit changes and test.
4. Push your branch and open a pull request with a comprehensive description.

For more guidance on contributing, see the [GitHub Docs](https://docs.github.com/en/get-started/quickstart/contributing-to-projects) on GitHub.

## License

This project is licensed under the MIT. See the `LICENSE` file in this repository for more details.