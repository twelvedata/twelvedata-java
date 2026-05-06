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
 * GetTimeSeriesVwap200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesVwap200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesVwap200ResponseValuesInner.JSON_PROPERTY_VWAP_LOWER,
  GetTimeSeriesVwap200ResponseValuesInner.JSON_PROPERTY_VWAP,
  GetTimeSeriesVwap200ResponseValuesInner.JSON_PROPERTY_VWAP_UPPER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesVwap200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_VWAP_LOWER = "vwap_lower";
  @javax.annotation.Nullable
  private String vwapLower;

  public static final String JSON_PROPERTY_VWAP = "vwap";
  @javax.annotation.Nonnull
  private String vwap;

  public static final String JSON_PROPERTY_VWAP_UPPER = "vwap_upper";
  @javax.annotation.Nullable
  private String vwapUpper;

  public GetTimeSeriesVwap200ResponseValuesInner() { 
  }

  public GetTimeSeriesVwap200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesVwap200ResponseValuesInner vwapLower(@javax.annotation.Nullable String vwapLower) {
    this.vwapLower = vwapLower;
    return this;
  }

  /**
   * VWAP lower value
   * @return vwapLower
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VWAP_LOWER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVwapLower() {
    return vwapLower;
  }


  @JsonProperty(value = JSON_PROPERTY_VWAP_LOWER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVwapLower(@javax.annotation.Nullable String vwapLower) {
    this.vwapLower = vwapLower;
  }


  public GetTimeSeriesVwap200ResponseValuesInner vwap(@javax.annotation.Nonnull String vwap) {
    this.vwap = vwap;
    return this;
  }

  /**
   * VWAP value
   * @return vwap
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VWAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVwap() {
    return vwap;
  }


  @JsonProperty(value = JSON_PROPERTY_VWAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVwap(@javax.annotation.Nonnull String vwap) {
    this.vwap = vwap;
  }


  public GetTimeSeriesVwap200ResponseValuesInner vwapUpper(@javax.annotation.Nullable String vwapUpper) {
    this.vwapUpper = vwapUpper;
    return this;
  }

  /**
   * VWAP upper value
   * @return vwapUpper
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VWAP_UPPER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVwapUpper() {
    return vwapUpper;
  }


  @JsonProperty(value = JSON_PROPERTY_VWAP_UPPER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVwapUpper(@javax.annotation.Nullable String vwapUpper) {
    this.vwapUpper = vwapUpper;
  }


  /**
   * Return true if this GetTimeSeriesVwap_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesVwap200ResponseValuesInner getTimeSeriesVwap200ResponseValuesInner = (GetTimeSeriesVwap200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesVwap200ResponseValuesInner.datetime) &&
        Objects.equals(this.vwapLower, getTimeSeriesVwap200ResponseValuesInner.vwapLower) &&
        Objects.equals(this.vwap, getTimeSeriesVwap200ResponseValuesInner.vwap) &&
        Objects.equals(this.vwapUpper, getTimeSeriesVwap200ResponseValuesInner.vwapUpper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, vwapLower, vwap, vwapUpper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesVwap200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    vwapLower: ").append(toIndentedString(vwapLower)).append("\n");
    sb.append("    vwap: ").append(toIndentedString(vwap)).append("\n");
    sb.append("    vwapUpper: ").append(toIndentedString(vwapUpper)).append("\n");
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

    // add `vwap_lower` to the URL query string
    if (getVwapLower() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svwap_lower%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVwapLower()))));
    }

    // add `vwap` to the URL query string
    if (getVwap() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svwap%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVwap()))));
    }

    // add `vwap_upper` to the URL query string
    if (getVwapUpper() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svwap_upper%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVwapUpper()))));
    }

    return joiner.toString();
  }
}

