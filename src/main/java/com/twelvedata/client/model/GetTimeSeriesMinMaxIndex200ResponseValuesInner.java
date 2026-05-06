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
 * GetTimeSeriesMinMaxIndex200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesMinMaxIndex200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesMinMaxIndex200ResponseValuesInner.JSON_PROPERTY_MINIDX,
  GetTimeSeriesMinMaxIndex200ResponseValuesInner.JSON_PROPERTY_MAXIDX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMinMaxIndex200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_MINIDX = "minidx";
  @javax.annotation.Nonnull
  private String minidx;

  public static final String JSON_PROPERTY_MAXIDX = "maxidx";
  @javax.annotation.Nonnull
  private String maxidx;

  public GetTimeSeriesMinMaxIndex200ResponseValuesInner() { 
  }

  public GetTimeSeriesMinMaxIndex200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Datetime in local market time for equities and in UTC for forex and cryptocurrencies referring to when the bar with specified interval was opened
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


  public GetTimeSeriesMinMaxIndex200ResponseValuesInner minidx(@javax.annotation.Nonnull String minidx) {
    this.minidx = minidx;
    return this;
  }

  /**
   * Index of the lowest value over the specified period
   * @return minidx
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MINIDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMinidx() {
    return minidx;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinidx(@javax.annotation.Nonnull String minidx) {
    this.minidx = minidx;
  }


  public GetTimeSeriesMinMaxIndex200ResponseValuesInner maxidx(@javax.annotation.Nonnull String maxidx) {
    this.maxidx = maxidx;
    return this;
  }

  /**
   * Index of the highest value over the specified period
   * @return maxidx
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MAXIDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMaxidx() {
    return maxidx;
  }


  @JsonProperty(value = JSON_PROPERTY_MAXIDX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxidx(@javax.annotation.Nonnull String maxidx) {
    this.maxidx = maxidx;
  }


  /**
   * Return true if this GetTimeSeriesMinMaxIndex_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMinMaxIndex200ResponseValuesInner getTimeSeriesMinMaxIndex200ResponseValuesInner = (GetTimeSeriesMinMaxIndex200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesMinMaxIndex200ResponseValuesInner.datetime) &&
        Objects.equals(this.minidx, getTimeSeriesMinMaxIndex200ResponseValuesInner.minidx) &&
        Objects.equals(this.maxidx, getTimeSeriesMinMaxIndex200ResponseValuesInner.maxidx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, minidx, maxidx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMinMaxIndex200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    minidx: ").append(toIndentedString(minidx)).append("\n");
    sb.append("    maxidx: ").append(toIndentedString(maxidx)).append("\n");
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

    // add `minidx` to the URL query string
    if (getMinidx() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminidx%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinidx()))));
    }

    // add `maxidx` to the URL query string
    if (getMaxidx() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxidx%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxidx()))));
    }

    return joiner.toString();
  }
}

