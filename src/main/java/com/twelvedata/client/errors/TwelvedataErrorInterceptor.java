/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */

package com.twelvedata.client.errors;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.ApiException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Response interceptor that translates Twelve Data API error responses into
 * {@link TwelvedataApiException} or one of its typed subclasses.
 *
 * <p>Installed by default via {@code Twelvedata.newApiClient(...)}. Callers
 * who construct their own {@link com.twelvedata.client.ApiClient} can install it
 * with {@code Twelvedata.installErrorHandling(client)} to keep typed errors
 * working alongside their own customisation.</p>
 *
 * <p>Behaviour for non-2xx responses:</p>
 * <ul>
 *   <li>Body parses as {@code {code, status, message}} and the HTTP status is
 *       documented &rarr; throws the matching nested subclass
 *       (e.g. {@link TwelvedataApiException.UnauthorizedException}).</li>
 *   <li>Body parses but the HTTP status is not documented &rarr; throws the
 *       base {@link TwelvedataApiException}.</li>
 *   <li>Body is empty / not JSON / missing required fields &rarr; throws the
 *       generator's {@link com.twelvedata.client.ApiException} with the original
 *       status and body, matching the default non-error-aware behaviour.</li>
 * </ul>
 *
 * <p>2xx responses pass through untouched — the body stream is not read.</p>
 */
public final class TwelvedataErrorInterceptor implements Consumer<HttpResponse<InputStream>> {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  @FunctionalInterface
  private interface ErrorFactory {
    TwelvedataApiException create(long code, String status, String message,
                                  HttpHeaders headers, String body);
  }

  private static final Map<Integer, ErrorFactory> ERROR_MAP = Map.of(
      400, TwelvedataApiException.BadRequestException::new,
      401, TwelvedataApiException.UnauthorizedException::new,
      403, TwelvedataApiException.ForbiddenException::new,
      404, TwelvedataApiException.NotFoundException::new,
      414, TwelvedataApiException.ParameterTooLongException::new,
      429, TwelvedataApiException.TooManyRequestsException::new,
      500, TwelvedataApiException.InternalServerErrorException::new
  );

  @Override
  public void accept(HttpResponse<InputStream> response) {
    int statusCode = response.statusCode();
    if (statusCode / 100 == 2) {
      return;
    }

    String body = readBody(response);
    HttpHeaders headers = response.headers();

    JsonNode node;
    try {
      node = MAPPER.readTree(body);
    } catch (IOException e) {
      sneakyThrow(buildFallback(statusCode, headers, body));
      return;
    }

    if (!isErrorBody(node)) {
      sneakyThrow(buildFallback(statusCode, headers, body));
      return;
    }

    long code = node.get("code").asLong();
    String status = node.get("status").asText();
    String message = node.get("message").asText();

    ErrorFactory factory = ERROR_MAP.get(statusCode);
    if (factory != null) {
      throw factory.create(code, status, message, headers, body);
    }
    throw new TwelvedataApiException(statusCode, code, status, message, headers, body);
  }

  private static String readBody(HttpResponse<InputStream> response) {
    // Use ApiClient.getResponseBody so a gzipped error body is decoded the
    // same way the success path decodes a 2xx body — otherwise a server that
    // sets Content-Encoding: gzip on errors would leave us with binary bytes
    // that fail JSON detection and skip the typed-exception path.
    try (InputStream body = ApiClient.getResponseBody(response)) {
      if (body == null) {
        return "";
      }
      return new String(body.readAllBytes(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      return "";
    }
  }

  private static boolean isErrorBody(JsonNode node) {
    return node != null
        && node.isObject()
        && node.hasNonNull("code") && node.get("code").isNumber()
        && node.hasNonNull("status") && node.get("status").isTextual()
        && node.hasNonNull("message") && node.get("message").isTextual();
  }

  private static ApiException buildFallback(int statusCode, HttpHeaders headers, String body) {
    String message = "API call failed with: " + statusCode + " - "
        + (body == null || body.isEmpty() ? "[no body]" : body);
    return new ApiException(statusCode, message, headers, body);
  }

  @SuppressWarnings("unchecked")
  private static <E extends Throwable> void sneakyThrow(Throwable e) throws E {
    throw (E) e;
  }
}
