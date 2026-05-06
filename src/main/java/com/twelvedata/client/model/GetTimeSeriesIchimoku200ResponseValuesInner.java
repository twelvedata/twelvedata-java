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
 * GetTimeSeriesIchimoku200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_TENKAN_SEN,
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_KIJUN_SEN,
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_SENKOU_SPAN_A,
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_SENKOU_SPAN_B,
  GetTimeSeriesIchimoku200ResponseValuesInner.JSON_PROPERTY_CHIKOU_SPAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesIchimoku200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_TENKAN_SEN = "tenkan_sen";
  @javax.annotation.Nullable
  private String tenkanSen;

  public static final String JSON_PROPERTY_KIJUN_SEN = "kijun_sen";
  @javax.annotation.Nullable
  private String kijunSen;

  public static final String JSON_PROPERTY_SENKOU_SPAN_A = "senkou_span_a";
  @javax.annotation.Nonnull
  private String senkouSpanA;

  public static final String JSON_PROPERTY_SENKOU_SPAN_B = "senkou_span_b";
  @javax.annotation.Nonnull
  private String senkouSpanB;

  public static final String JSON_PROPERTY_CHIKOU_SPAN = "chikou_span";
  @javax.annotation.Nullable
  private String chikouSpan;

  public GetTimeSeriesIchimoku200ResponseValuesInner() { 
  }

  public GetTimeSeriesIchimoku200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesIchimoku200ResponseValuesInner tenkanSen(@javax.annotation.Nullable String tenkanSen) {
    this.tenkanSen = tenkanSen;
    return this;
  }

  /**
   * Tenkan-sen value
   * @return tenkanSen
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENKAN_SEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenkanSen() {
    return tenkanSen;
  }


  @JsonProperty(value = JSON_PROPERTY_TENKAN_SEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenkanSen(@javax.annotation.Nullable String tenkanSen) {
    this.tenkanSen = tenkanSen;
  }


  public GetTimeSeriesIchimoku200ResponseValuesInner kijunSen(@javax.annotation.Nullable String kijunSen) {
    this.kijunSen = kijunSen;
    return this;
  }

  /**
   * Kijun-sen value
   * @return kijunSen
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KIJUN_SEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKijunSen() {
    return kijunSen;
  }


  @JsonProperty(value = JSON_PROPERTY_KIJUN_SEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKijunSen(@javax.annotation.Nullable String kijunSen) {
    this.kijunSen = kijunSen;
  }


  public GetTimeSeriesIchimoku200ResponseValuesInner senkouSpanA(@javax.annotation.Nonnull String senkouSpanA) {
    this.senkouSpanA = senkouSpanA;
    return this;
  }

  /**
   * Senkou span A value
   * @return senkouSpanA
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SENKOU_SPAN_A, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSenkouSpanA() {
    return senkouSpanA;
  }


  @JsonProperty(value = JSON_PROPERTY_SENKOU_SPAN_A, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenkouSpanA(@javax.annotation.Nonnull String senkouSpanA) {
    this.senkouSpanA = senkouSpanA;
  }


  public GetTimeSeriesIchimoku200ResponseValuesInner senkouSpanB(@javax.annotation.Nonnull String senkouSpanB) {
    this.senkouSpanB = senkouSpanB;
    return this;
  }

  /**
   * Senkou span B value
   * @return senkouSpanB
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SENKOU_SPAN_B, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSenkouSpanB() {
    return senkouSpanB;
  }


  @JsonProperty(value = JSON_PROPERTY_SENKOU_SPAN_B, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenkouSpanB(@javax.annotation.Nonnull String senkouSpanB) {
    this.senkouSpanB = senkouSpanB;
  }


  public GetTimeSeriesIchimoku200ResponseValuesInner chikouSpan(@javax.annotation.Nullable String chikouSpan) {
    this.chikouSpan = chikouSpan;
    return this;
  }

  /**
   * Chikou span value
   * @return chikouSpan
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHIKOU_SPAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChikouSpan() {
    return chikouSpan;
  }


  @JsonProperty(value = JSON_PROPERTY_CHIKOU_SPAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChikouSpan(@javax.annotation.Nullable String chikouSpan) {
    this.chikouSpan = chikouSpan;
  }


  /**
   * Return true if this GetTimeSeriesIchimoku_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesIchimoku200ResponseValuesInner getTimeSeriesIchimoku200ResponseValuesInner = (GetTimeSeriesIchimoku200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesIchimoku200ResponseValuesInner.datetime) &&
        Objects.equals(this.tenkanSen, getTimeSeriesIchimoku200ResponseValuesInner.tenkanSen) &&
        Objects.equals(this.kijunSen, getTimeSeriesIchimoku200ResponseValuesInner.kijunSen) &&
        Objects.equals(this.senkouSpanA, getTimeSeriesIchimoku200ResponseValuesInner.senkouSpanA) &&
        Objects.equals(this.senkouSpanB, getTimeSeriesIchimoku200ResponseValuesInner.senkouSpanB) &&
        Objects.equals(this.chikouSpan, getTimeSeriesIchimoku200ResponseValuesInner.chikouSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, tenkanSen, kijunSen, senkouSpanA, senkouSpanB, chikouSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesIchimoku200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    tenkanSen: ").append(toIndentedString(tenkanSen)).append("\n");
    sb.append("    kijunSen: ").append(toIndentedString(kijunSen)).append("\n");
    sb.append("    senkouSpanA: ").append(toIndentedString(senkouSpanA)).append("\n");
    sb.append("    senkouSpanB: ").append(toIndentedString(senkouSpanB)).append("\n");
    sb.append("    chikouSpan: ").append(toIndentedString(chikouSpan)).append("\n");
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

    // add `tenkan_sen` to the URL query string
    if (getTenkanSen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenkan_sen%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenkanSen()))));
    }

    // add `kijun_sen` to the URL query string
    if (getKijunSen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skijun_sen%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKijunSen()))));
    }

    // add `senkou_span_a` to the URL query string
    if (getSenkouSpanA() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssenkou_span_a%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSenkouSpanA()))));
    }

    // add `senkou_span_b` to the URL query string
    if (getSenkouSpanB() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssenkou_span_b%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSenkouSpanB()))));
    }

    // add `chikou_span` to the URL query string
    if (getChikouSpan() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schikou_span%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChikouSpan()))));
    }

    return joiner.toString();
  }
}

