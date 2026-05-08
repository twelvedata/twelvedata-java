/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */

package com.twelvedata.client;

import com.twelvedata.client.errors.TwelvedataErrorInterceptor;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

/**
 * Twelvedata builds a pre-configured {@link ApiClient} for the Twelve Data API.
 *
 * <p>The API key is taken from the first non-empty value of: the explicit
 * argument or the {@code TWELVEDATA_API_KEY} env variable. The base URL is
 * taken from the explicit argument, or the {@code TWELVEDATA_API_BASE_URL}
 * env variable, or the spec default.</p>
 *
 * <p>Every outbound request is tagged with a {@code source=client-java} query
 * parameter unless the caller has already set {@code source} on that request.</p>
 */
public final class Twelvedata {

  private static final String API_KEY_ENV_VAR  = "TWELVEDATA_API_KEY";
  private static final String BASE_URL_ENV_VAR = "TWELVEDATA_API_BASE_URL";
  private static final String API_KEY_PREFIX   = "apikey ";
  private static final String SOURCE_PARAM     = "source";
  private static final String SOURCE_VALUE     = "client-java";

  private Twelvedata() {}

  /**
   * Returns an {@link ApiClient} configured from the {@code TWELVEDATA_API_KEY}
   * env variable.
   *
   * @throws IllegalStateException if the env variable is not set.
   */
  public static ApiClient newApiClient() {
    return newApiClient(null, null);
  }

  /**
   * Returns an {@link ApiClient} configured with the given API key, falling back
   * to the {@code TWELVEDATA_API_KEY} env variable when {@code apiKey} is null
   * or empty.
   *
   * @throws IllegalStateException if neither source provides a key.
   */
  public static ApiClient newApiClient(String apiKey) {
    return newApiClient(apiKey, null);
  }

  /**
   * Returns an {@link ApiClient} configured with the given API key and base
   * URL. Either argument may be null; the corresponding env variable
   * ({@code TWELVEDATA_API_KEY} / {@code TWELVEDATA_API_BASE_URL}) is used as
   * a fallback.
   *
   * @throws IllegalStateException if no API key can be resolved.
   */
  public static ApiClient newApiClient(String apiKey, String baseUrl) {
    String resolvedKey = firstNonEmpty(apiKey, System.getenv(API_KEY_ENV_VAR));
    if (resolvedKey == null) {
      throw new IllegalStateException(API_KEY_ENV_VAR + " environment variable is not set");
    }

    ApiClient client = new ApiClient();
    String resolvedBaseUrl = firstNonEmpty(baseUrl, System.getenv(BASE_URL_ENV_VAR));
    if (resolvedBaseUrl != null) {
      client.updateBaseUri(resolvedBaseUrl);
    }

    String authHeader = API_KEY_PREFIX + resolvedKey;
    client.setRequestInterceptor(builder -> {
      // HttpRequest.Builder.header(...) appends — calling it for a header the
      // caller already supplied via the per-request `headers` map would put two
      // values on the wire. Inspect the built copy and skip-set if present.
      HttpHeaders existing = builder.copy().build().headers();
      if (existing.firstValue("Authorization").isEmpty()) {
        builder.header("Authorization", authHeader);
      }
      if (existing.firstValue("X-API-Version").isEmpty()) {
        builder.header("X-API-Version", "last");
      }
      URI current = builder.copy().build().uri();
      URI rewritten = appendSourceIfMissing(current);
      if (!rewritten.equals(current)) {
        builder.uri(rewritten);
      }
    });
    installErrorHandling(client);
    return client;
  }

  /**
   * Installs the Twelve Data response interceptor on a user-supplied
   * {@link ApiClient} so non-2xx responses surface as
   * {@link com.twelvedata.client.errors.TwelvedataApiException} subclasses.
   *
   * <p>Composes with any response interceptor already attached to {@code client}:
   * the Twelve Data error handler runs first so it can read the response body
   * before any other interceptor consumes it. On non-2xx the handler throws and
   * the existing interceptor is bypassed; on 2xx the existing interceptor runs
   * with the body still intact. Use this when you build the {@code ApiClient}
   * yourself (e.g. to set custom timeouts or a proxy) instead of going through
   * {@link #newApiClient()}.</p>
   */
  public static void installErrorHandling(ApiClient client) {
    Consumer<HttpResponse<InputStream>> existing = client.getResponseInterceptor();
    Consumer<HttpResponse<InputStream>> handler = new TwelvedataErrorInterceptor();
    client.setResponseInterceptor(existing != null ? handler.andThen(existing) : handler);
  }

  private static URI appendSourceIfMissing(URI uri) {
    String query = uri.getRawQuery();
    if (query != null) {
      for (String pair : query.split("&")) {
        int eq = pair.indexOf('=');
        String name = eq >= 0 ? pair.substring(0, eq) : pair;
        if (SOURCE_PARAM.equals(name)) {
          return uri;
        }
      }
    }
    String addition = SOURCE_PARAM + "=" + SOURCE_VALUE;
    String newQuery = (query == null || query.isEmpty()) ? addition : query + "&" + addition;

    // Build the URI from an already-encoded string: the multi-arg URI constructor
    // re-quotes `%` as `%25`, double-encoding values like `EUR%2FUSD` from getRawQuery().
    StringBuilder sb = new StringBuilder();
    sb.append(uri.getScheme()).append("://").append(uri.getRawAuthority()).append(uri.getRawPath());
    sb.append('?').append(newQuery);
    if (uri.getRawFragment() != null) {
      sb.append('#').append(uri.getRawFragment());
    }
    return URI.create(sb.toString());
  }

  private static String firstNonEmpty(String... values) {
    for (String v : values) {
      if (v != null && !v.isEmpty()) {
        return v;
      }
    }
    return null;
  }
}
