/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */

package com.twelvedata.client.errors;

import java.net.http.HttpHeaders;

/**
 * Base exception thrown for any Twelve Data API response that carries a
 * recognizable {@code {code, status, message}} JSON error body. Each documented
 * HTTP status maps to a nested subclass; an unmapped status with a valid body
 * surfaces as the base type.
 *
 * <p>Network and transport failures (DNS, timeouts, connection resets) are not
 * wrapped — they propagate as the underlying {@code java.io.IOException} or
 * other JDK runtime types.</p>
 */
public class TwelvedataApiException extends RuntimeException {

  private final int statusCode;
  private final long code;
  private final String status;
  private final HttpHeaders responseHeaders;
  private final String responseBody;

  public TwelvedataApiException(int statusCode, long code, String status, String message,
                                HttpHeaders responseHeaders, String responseBody) {
    super(message);
    this.statusCode = statusCode;
    this.code = code;
    this.status = status;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /** HTTP status code (e.g. 400, 401, 429). */
  public int getStatusCode() {
    return statusCode;
  }

  /** Twelve Data error code from the response body. */
  public long getCode() {
    return code;
  }

  /** Twelve Data status string from the response body (e.g. {@code "error"}). */
  public String getStatus() {
    return status;
  }

  /** Response headers, or {@code null} when not available. */
  public HttpHeaders getResponseHeaders() {
    return responseHeaders;
  }

  /** Raw response body, or {@code null} when not available. */
  public String getResponseBody() {
    return responseBody;
  }

  /** Thrown for HTTP 400 responses — invalid parameters were supplied to the API. */
  public static class BadRequestException extends TwelvedataApiException {
    public BadRequestException(long code, String status, String message,
                               HttpHeaders responseHeaders, String responseBody) {
      super(400, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 401 responses — invalid or missing API key. */
  public static class UnauthorizedException extends TwelvedataApiException {
    public UnauthorizedException(long code, String status, String message,
                                 HttpHeaders responseHeaders, String responseBody) {
      super(401, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 403 responses — access denied to the requested resource. */
  public static class ForbiddenException extends TwelvedataApiException {
    public ForbiddenException(long code, String status, String message,
                              HttpHeaders responseHeaders, String responseBody) {
      super(403, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 404 responses — the requested resource does not exist. */
  public static class NotFoundException extends TwelvedataApiException {
    public NotFoundException(long code, String status, String message,
                             HttpHeaders responseHeaders, String responseBody) {
      super(404, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 414 responses — a request parameter exceeds the maximum allowed length. */
  public static class ParameterTooLongException extends TwelvedataApiException {
    public ParameterTooLongException(long code, String status, String message,
                                     HttpHeaders responseHeaders, String responseBody) {
      super(414, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 429 responses — API rate limit exceeded. */
  public static class TooManyRequestsException extends TwelvedataApiException {
    public TooManyRequestsException(long code, String status, String message,
                                    HttpHeaders responseHeaders, String responseBody) {
      super(429, code, status, message, responseHeaders, responseBody);
    }
  }

  /** Thrown for HTTP 500 responses — unexpected server-side error. */
  public static class InternalServerErrorException extends TwelvedataApiException {
    public InternalServerErrorException(long code, String status, String message,
                                        HttpHeaders responseHeaders, String responseBody) {
      super(500, code, status, message, responseHeaders, responseBody);
    }
  }
}
