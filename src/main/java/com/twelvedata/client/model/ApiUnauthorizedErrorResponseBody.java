/*
 * Twelve Data API client for Java
 *
 * NOTE: This code is auto generated, please do not edit it manually.
 */


package com.twelvedata.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ApiUnauthorizedErrorResponseBody
 */
@JsonPropertyOrder({
  ApiUnauthorizedErrorResponseBody.JSON_PROPERTY_CODE,
  ApiUnauthorizedErrorResponseBody.JSON_PROPERTY_MESSAGE,
  ApiUnauthorizedErrorResponseBody.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ApiUnauthorizedErrorResponseBody {
  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nonnull
  private Long code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public ApiUnauthorizedErrorResponseBody() { 
  }

  public ApiUnauthorizedErrorResponseBody code(@javax.annotation.Nonnull Long code) {
    this.code = code;
    return this;
  }

  /**
   * Error code
   * @return code
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nonnull Long code) {
    this.code = code;
  }


  public ApiUnauthorizedErrorResponseBody message(@javax.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }


  public ApiUnauthorizedErrorResponseBody status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Error status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  /**
   * Return true if this ApiUnauthorizedErrorResponseBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUnauthorizedErrorResponseBody apiUnauthorizedErrorResponseBody = (ApiUnauthorizedErrorResponseBody) o;
    return Objects.equals(this.code, apiUnauthorizedErrorResponseBody.code) &&
        Objects.equals(this.message, apiUnauthorizedErrorResponseBody.message) &&
        Objects.equals(this.status, apiUnauthorizedErrorResponseBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUnauthorizedErrorResponseBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `code` to the URL query string
    if (getCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCode()))));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMessage()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

