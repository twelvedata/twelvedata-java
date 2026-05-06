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
 * GetTimeSeriesStochRsi200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesStochRsi200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesStochRsi200ResponseValuesInner.JSON_PROPERTY_K,
  GetTimeSeriesStochRsi200ResponseValuesInner.JSON_PROPERTY_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesStochRsi200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_K = "k";
  @javax.annotation.Nonnull
  private String k;

  public static final String JSON_PROPERTY_D = "d";
  @javax.annotation.Nonnull
  private String d;

  public GetTimeSeriesStochRsi200ResponseValuesInner() { 
  }

  public GetTimeSeriesStochRsi200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesStochRsi200ResponseValuesInner k(@javax.annotation.Nonnull String k) {
    this.k = k;
    return this;
  }

  /**
   * K value
   * @return k
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_K, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getK() {
    return k;
  }


  @JsonProperty(value = JSON_PROPERTY_K, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setK(@javax.annotation.Nonnull String k) {
    this.k = k;
  }


  public GetTimeSeriesStochRsi200ResponseValuesInner d(@javax.annotation.Nonnull String d) {
    this.d = d;
    return this;
  }

  /**
   * D value
   * @return d
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_D, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getD() {
    return d;
  }


  @JsonProperty(value = JSON_PROPERTY_D, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setD(@javax.annotation.Nonnull String d) {
    this.d = d;
  }


  /**
   * Return true if this GetTimeSeriesStochRsi_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesStochRsi200ResponseValuesInner getTimeSeriesStochRsi200ResponseValuesInner = (GetTimeSeriesStochRsi200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesStochRsi200ResponseValuesInner.datetime) &&
        Objects.equals(this.k, getTimeSeriesStochRsi200ResponseValuesInner.k) &&
        Objects.equals(this.d, getTimeSeriesStochRsi200ResponseValuesInner.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, k, d);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesStochRsi200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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

    // add `k` to the URL query string
    if (getK() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sk%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getK()))));
    }

    // add `d` to the URL query string
    if (getD() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sd%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getD()))));
    }

    return joiner.toString();
  }
}

