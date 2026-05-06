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
 * GetTimeSeriesKst200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesKst200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesKst200ResponseValuesInner.JSON_PROPERTY_KST,
  GetTimeSeriesKst200ResponseValuesInner.JSON_PROPERTY_KST_SIGNAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesKst200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_KST = "kst";
  @javax.annotation.Nonnull
  private String kst;

  public static final String JSON_PROPERTY_KST_SIGNAL = "kst_signal";
  @javax.annotation.Nonnull
  private String kstSignal;

  public GetTimeSeriesKst200ResponseValuesInner() { 
  }

  public GetTimeSeriesKst200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesKst200ResponseValuesInner kst(@javax.annotation.Nonnull String kst) {
    this.kst = kst;
    return this;
  }

  /**
   * KST value
   * @return kst
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_KST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKst() {
    return kst;
  }


  @JsonProperty(value = JSON_PROPERTY_KST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKst(@javax.annotation.Nonnull String kst) {
    this.kst = kst;
  }


  public GetTimeSeriesKst200ResponseValuesInner kstSignal(@javax.annotation.Nonnull String kstSignal) {
    this.kstSignal = kstSignal;
    return this;
  }

  /**
   * KST signal value
   * @return kstSignal
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_KST_SIGNAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKstSignal() {
    return kstSignal;
  }


  @JsonProperty(value = JSON_PROPERTY_KST_SIGNAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKstSignal(@javax.annotation.Nonnull String kstSignal) {
    this.kstSignal = kstSignal;
  }


  /**
   * Return true if this GetTimeSeriesKst_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesKst200ResponseValuesInner getTimeSeriesKst200ResponseValuesInner = (GetTimeSeriesKst200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesKst200ResponseValuesInner.datetime) &&
        Objects.equals(this.kst, getTimeSeriesKst200ResponseValuesInner.kst) &&
        Objects.equals(this.kstSignal, getTimeSeriesKst200ResponseValuesInner.kstSignal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, kst, kstSignal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesKst200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    kst: ").append(toIndentedString(kst)).append("\n");
    sb.append("    kstSignal: ").append(toIndentedString(kstSignal)).append("\n");
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

    // add `kst` to the URL query string
    if (getKst() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skst%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKst()))));
    }

    // add `kst_signal` to the URL query string
    if (getKstSignal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skst_signal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKstSignal()))));
    }

    return joiner.toString();
  }
}

