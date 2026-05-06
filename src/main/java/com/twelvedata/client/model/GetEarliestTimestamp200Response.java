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
 * GetEarliestTimestamp200Response
 */
@JsonPropertyOrder({
  GetEarliestTimestamp200Response.JSON_PROPERTY_DATETIME,
  GetEarliestTimestamp200Response.JSON_PROPERTY_UNIX_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEarliestTimestamp200Response {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_UNIX_TIME = "unix_time";
  @javax.annotation.Nonnull
  private Long unixTime;

  public GetEarliestTimestamp200Response() { 
  }

  public GetEarliestTimestamp200Response datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Earliest datetime, the format depends on interval
   * @return datetime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatetime() {
    return datetime;
  }


  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
  }


  public GetEarliestTimestamp200Response unixTime(@javax.annotation.Nonnull Long unixTime) {
    this.unixTime = unixTime;
    return this;
  }

  /**
   * Datetime converted to UNIX timestamp
   * @return unixTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_UNIX_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUnixTime() {
    return unixTime;
  }


  @JsonProperty(value = JSON_PROPERTY_UNIX_TIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnixTime(@javax.annotation.Nonnull Long unixTime) {
    this.unixTime = unixTime;
  }


  /**
   * Return true if this GetEarliestTimestamp_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEarliestTimestamp200Response getEarliestTimestamp200Response = (GetEarliestTimestamp200Response) o;
    return Objects.equals(this.datetime, getEarliestTimestamp200Response.datetime) &&
        Objects.equals(this.unixTime, getEarliestTimestamp200Response.unixTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, unixTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEarliestTimestamp200Response {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    unixTime: ").append(toIndentedString(unixTime)).append("\n");
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

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `unix_time` to the URL query string
    if (getUnixTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunix_time%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnixTime()))));
    }

    return joiner.toString();
  }
}

