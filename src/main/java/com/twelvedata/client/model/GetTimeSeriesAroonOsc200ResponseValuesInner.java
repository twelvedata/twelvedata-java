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
 * GetTimeSeriesAroonOsc200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesAroonOsc200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesAroonOsc200ResponseValuesInner.JSON_PROPERTY_AROONOSC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesAroonOsc200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_AROONOSC = "aroonosc";
  @javax.annotation.Nonnull
  private String aroonosc;

  public GetTimeSeriesAroonOsc200ResponseValuesInner() { 
  }

  public GetTimeSeriesAroonOsc200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesAroonOsc200ResponseValuesInner aroonosc(@javax.annotation.Nonnull String aroonosc) {
    this.aroonosc = aroonosc;
    return this;
  }

  /**
   * Aroon oscillator value
   * @return aroonosc
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AROONOSC, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAroonosc() {
    return aroonosc;
  }


  @JsonProperty(value = JSON_PROPERTY_AROONOSC, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAroonosc(@javax.annotation.Nonnull String aroonosc) {
    this.aroonosc = aroonosc;
  }


  /**
   * Return true if this GetTimeSeriesAroonOsc_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesAroonOsc200ResponseValuesInner getTimeSeriesAroonOsc200ResponseValuesInner = (GetTimeSeriesAroonOsc200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesAroonOsc200ResponseValuesInner.datetime) &&
        Objects.equals(this.aroonosc, getTimeSeriesAroonOsc200ResponseValuesInner.aroonosc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, aroonosc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesAroonOsc200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    aroonosc: ").append(toIndentedString(aroonosc)).append("\n");
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

    // add `aroonosc` to the URL query string
    if (getAroonosc() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saroonosc%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAroonosc()))));
    }

    return joiner.toString();
  }
}

