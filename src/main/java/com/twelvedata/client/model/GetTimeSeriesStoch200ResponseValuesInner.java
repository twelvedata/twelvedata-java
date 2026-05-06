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
 * GetTimeSeriesStoch200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesStoch200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesStoch200ResponseValuesInner.JSON_PROPERTY_SLOW_K,
  GetTimeSeriesStoch200ResponseValuesInner.JSON_PROPERTY_SLOW_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesStoch200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_SLOW_K = "slow_k";
  @javax.annotation.Nonnull
  private String slowK;

  public static final String JSON_PROPERTY_SLOW_D = "slow_d";
  @javax.annotation.Nonnull
  private String slowD;

  public GetTimeSeriesStoch200ResponseValuesInner() { 
  }

  public GetTimeSeriesStoch200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesStoch200ResponseValuesInner slowK(@javax.annotation.Nonnull String slowK) {
    this.slowK = slowK;
    return this;
  }

  /**
   * slow_k value
   * @return slowK
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_K, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlowK() {
    return slowK;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_K, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowK(@javax.annotation.Nonnull String slowK) {
    this.slowK = slowK;
  }


  public GetTimeSeriesStoch200ResponseValuesInner slowD(@javax.annotation.Nonnull String slowD) {
    this.slowD = slowD;
    return this;
  }

  /**
   * slow_d value
   * @return slowD
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_D, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlowD() {
    return slowD;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_D, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowD(@javax.annotation.Nonnull String slowD) {
    this.slowD = slowD;
  }


  /**
   * Return true if this GetTimeSeriesStoch_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesStoch200ResponseValuesInner getTimeSeriesStoch200ResponseValuesInner = (GetTimeSeriesStoch200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesStoch200ResponseValuesInner.datetime) &&
        Objects.equals(this.slowK, getTimeSeriesStoch200ResponseValuesInner.slowK) &&
        Objects.equals(this.slowD, getTimeSeriesStoch200ResponseValuesInner.slowD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, slowK, slowD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesStoch200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    slowK: ").append(toIndentedString(slowK)).append("\n");
    sb.append("    slowD: ").append(toIndentedString(slowD)).append("\n");
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

    // add `slow_k` to the URL query string
    if (getSlowK() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_k%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowK()))));
    }

    // add `slow_d` to the URL query string
    if (getSlowD() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_d%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowD()))));
    }

    return joiner.toString();
  }
}

