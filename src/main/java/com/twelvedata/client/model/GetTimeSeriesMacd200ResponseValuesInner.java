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
 * GetTimeSeriesMacd200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesMacd200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesMacd200ResponseValuesInner.JSON_PROPERTY_MACD,
  GetTimeSeriesMacd200ResponseValuesInner.JSON_PROPERTY_MACD_SIGNAL,
  GetTimeSeriesMacd200ResponseValuesInner.JSON_PROPERTY_MACD_HIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMacd200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_MACD = "macd";
  @javax.annotation.Nonnull
  private String macd;

  public static final String JSON_PROPERTY_MACD_SIGNAL = "macd_signal";
  @javax.annotation.Nonnull
  private String macdSignal;

  public static final String JSON_PROPERTY_MACD_HIST = "macd_hist";
  @javax.annotation.Nonnull
  private String macdHist;

  public GetTimeSeriesMacd200ResponseValuesInner() { 
  }

  public GetTimeSeriesMacd200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesMacd200ResponseValuesInner macd(@javax.annotation.Nonnull String macd) {
    this.macd = macd;
    return this;
  }

  /**
   * MACD value
   * @return macd
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacd() {
    return macd;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacd(@javax.annotation.Nonnull String macd) {
    this.macd = macd;
  }


  public GetTimeSeriesMacd200ResponseValuesInner macdSignal(@javax.annotation.Nonnull String macdSignal) {
    this.macdSignal = macdSignal;
    return this;
  }

  /**
   * MACD signal line value
   * @return macdSignal
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD_SIGNAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacdSignal() {
    return macdSignal;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD_SIGNAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacdSignal(@javax.annotation.Nonnull String macdSignal) {
    this.macdSignal = macdSignal;
  }


  public GetTimeSeriesMacd200ResponseValuesInner macdHist(@javax.annotation.Nonnull String macdHist) {
    this.macdHist = macdHist;
    return this;
  }

  /**
   * MACD histogram value
   * @return macdHist
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MACD_HIST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMacdHist() {
    return macdHist;
  }


  @JsonProperty(value = JSON_PROPERTY_MACD_HIST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMacdHist(@javax.annotation.Nonnull String macdHist) {
    this.macdHist = macdHist;
  }


  /**
   * Return true if this GetTimeSeriesMacd_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMacd200ResponseValuesInner getTimeSeriesMacd200ResponseValuesInner = (GetTimeSeriesMacd200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesMacd200ResponseValuesInner.datetime) &&
        Objects.equals(this.macd, getTimeSeriesMacd200ResponseValuesInner.macd) &&
        Objects.equals(this.macdSignal, getTimeSeriesMacd200ResponseValuesInner.macdSignal) &&
        Objects.equals(this.macdHist, getTimeSeriesMacd200ResponseValuesInner.macdHist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, macd, macdSignal, macdHist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMacd200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    macd: ").append(toIndentedString(macd)).append("\n");
    sb.append("    macdSignal: ").append(toIndentedString(macdSignal)).append("\n");
    sb.append("    macdHist: ").append(toIndentedString(macdHist)).append("\n");
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

    // add `macd` to the URL query string
    if (getMacd() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacd()))));
    }

    // add `macd_signal` to the URL query string
    if (getMacdSignal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd_signal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacdSignal()))));
    }

    // add `macd_hist` to the URL query string
    if (getMacdHist() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smacd_hist%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMacdHist()))));
    }

    return joiner.toString();
  }
}

