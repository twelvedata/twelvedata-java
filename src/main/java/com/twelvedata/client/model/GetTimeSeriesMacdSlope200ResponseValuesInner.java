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
 * GetTimeSeriesMacdSlope200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesMacdSlope200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesMacdSlope200ResponseValuesInner.JSON_PROPERTY_MACD_SLOPE,
  GetTimeSeriesMacdSlope200ResponseValuesInner.JSON_PROPERTY_MACD_SIGNAL_SLOPE,
  GetTimeSeriesMacdSlope200ResponseValuesInner.JSON_PROPERTY_MACD_HIST_SLOPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMacdSlope200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_MACD_SLOPE = "macd_slope";
  @javax.annotation.Nonnull
  private String macdSlope;

  public static final String JSON_PROPERTY_MACD_SIGNAL_SLOPE = "macd_signal_slope";
  @javax.annotation.Nonnull
  private String macdSignalSlope;

  public static final String JSON_PROPERTY_MACD_HIST_SLOPE = "macd_hist_slope";
  @javax.annotation.Nonnull
  private String macdHistSlope;

  public GetTimeSeriesMacdSlope200ResponseValuesInner() { 
  }

  public GetTimeSeriesMacdSlope200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesMacdSlope200ResponseValuesInner macdSlope(@javax.annotation.Nonnull String macdSlope) {
    this.macdSlope = macdSlope;
    return this;
  }

  /**
   * MACD slope value
   * @return macdSlope
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacdSlope() {
    return macdSlope;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacdSlope(@javax.annotation.Nonnull String macdSlope) {
    this.macdSlope = macdSlope;
  }


  public GetTimeSeriesMacdSlope200ResponseValuesInner macdSignalSlope(@javax.annotation.Nonnull String macdSignalSlope) {
    this.macdSignalSlope = macdSignalSlope;
    return this;
  }

  /**
   * MACD signal slope value
   * @return macdSignalSlope
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD_SIGNAL_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacdSignalSlope() {
    return macdSignalSlope;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD_SIGNAL_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacdSignalSlope(@javax.annotation.Nonnull String macdSignalSlope) {
    this.macdSignalSlope = macdSignalSlope;
  }


  public GetTimeSeriesMacdSlope200ResponseValuesInner macdHistSlope(@javax.annotation.Nonnull String macdHistSlope) {
    this.macdHistSlope = macdHistSlope;
    return this;
  }

  /**
   * MACD histogram slope value
   * @return macdHistSlope
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD_HIST_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacdHistSlope() {
    return macdHistSlope;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD_HIST_SLOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacdHistSlope(@javax.annotation.Nonnull String macdHistSlope) {
    this.macdHistSlope = macdHistSlope;
  }


  /**
   * Return true if this GetTimeSeriesMacdSlope_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMacdSlope200ResponseValuesInner getTimeSeriesMacdSlope200ResponseValuesInner = (GetTimeSeriesMacdSlope200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesMacdSlope200ResponseValuesInner.datetime) &&
        Objects.equals(this.macdSlope, getTimeSeriesMacdSlope200ResponseValuesInner.macdSlope) &&
        Objects.equals(this.macdSignalSlope, getTimeSeriesMacdSlope200ResponseValuesInner.macdSignalSlope) &&
        Objects.equals(this.macdHistSlope, getTimeSeriesMacdSlope200ResponseValuesInner.macdHistSlope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, macdSlope, macdSignalSlope, macdHistSlope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMacdSlope200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    macdSlope: ").append(toIndentedString(macdSlope)).append("\n");
    sb.append("    macdSignalSlope: ").append(toIndentedString(macdSignalSlope)).append("\n");
    sb.append("    macdHistSlope: ").append(toIndentedString(macdHistSlope)).append("\n");
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

    // add `macd_slope` to the URL query string
    if (getMacdSlope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd_slope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacdSlope()))));
    }

    // add `macd_signal_slope` to the URL query string
    if (getMacdSignalSlope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd_signal_slope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacdSignalSlope()))));
    }

    // add `macd_hist_slope` to the URL query string
    if (getMacdHistSlope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd_hist_slope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacdHistSlope()))));
    }

    return joiner.toString();
  }
}

