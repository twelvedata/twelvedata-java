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
 * GetTimeSeriesHtSine200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesHtSine200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesHtSine200ResponseValuesInner.JSON_PROPERTY_HT_SINE,
  GetTimeSeriesHtSine200ResponseValuesInner.JSON_PROPERTY_HT_LEADSINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesHtSine200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_HT_SINE = "ht_sine";
  @javax.annotation.Nonnull
  private String htSine;

  public static final String JSON_PROPERTY_HT_LEADSINE = "ht_leadsine";
  @javax.annotation.Nonnull
  private String htLeadsine;

  public GetTimeSeriesHtSine200ResponseValuesInner() { 
  }

  public GetTimeSeriesHtSine200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesHtSine200ResponseValuesInner htSine(@javax.annotation.Nonnull String htSine) {
    this.htSine = htSine;
    return this;
  }

  /**
   * ht_sine value
   * @return htSine
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HT_SINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHtSine() {
    return htSine;
  }


  @JsonProperty(value = JSON_PROPERTY_HT_SINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHtSine(@javax.annotation.Nonnull String htSine) {
    this.htSine = htSine;
  }


  public GetTimeSeriesHtSine200ResponseValuesInner htLeadsine(@javax.annotation.Nonnull String htLeadsine) {
    this.htLeadsine = htLeadsine;
    return this;
  }

  /**
   * ht_leadsine value
   * @return htLeadsine
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HT_LEADSINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHtLeadsine() {
    return htLeadsine;
  }


  @JsonProperty(value = JSON_PROPERTY_HT_LEADSINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHtLeadsine(@javax.annotation.Nonnull String htLeadsine) {
    this.htLeadsine = htLeadsine;
  }


  /**
   * Return true if this GetTimeSeriesHtSine_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesHtSine200ResponseValuesInner getTimeSeriesHtSine200ResponseValuesInner = (GetTimeSeriesHtSine200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesHtSine200ResponseValuesInner.datetime) &&
        Objects.equals(this.htSine, getTimeSeriesHtSine200ResponseValuesInner.htSine) &&
        Objects.equals(this.htLeadsine, getTimeSeriesHtSine200ResponseValuesInner.htLeadsine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, htSine, htLeadsine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesHtSine200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    htSine: ").append(toIndentedString(htSine)).append("\n");
    sb.append("    htLeadsine: ").append(toIndentedString(htLeadsine)).append("\n");
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

    // add `ht_sine` to the URL query string
    if (getHtSine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sht_sine%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHtSine()))));
    }

    // add `ht_leadsine` to the URL query string
    if (getHtLeadsine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sht_leadsine%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHtLeadsine()))));
    }

    return joiner.toString();
  }
}

