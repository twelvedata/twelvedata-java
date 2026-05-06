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
 * GetTimeSeriesAroon200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesAroon200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesAroon200ResponseValuesInner.JSON_PROPERTY_AROON_DOWN,
  GetTimeSeriesAroon200ResponseValuesInner.JSON_PROPERTY_AROON_UP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesAroon200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_AROON_DOWN = "aroon_down";
  @javax.annotation.Nonnull
  private String aroonDown;

  public static final String JSON_PROPERTY_AROON_UP = "aroon_up";
  @javax.annotation.Nonnull
  private String aroonUp;

  public GetTimeSeriesAroon200ResponseValuesInner() { 
  }

  public GetTimeSeriesAroon200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesAroon200ResponseValuesInner aroonDown(@javax.annotation.Nonnull String aroonDown) {
    this.aroonDown = aroonDown;
    return this;
  }

  /**
   * Aroon down value
   * @return aroonDown
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AROON_DOWN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAroonDown() {
    return aroonDown;
  }


  @JsonProperty(value = JSON_PROPERTY_AROON_DOWN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAroonDown(@javax.annotation.Nonnull String aroonDown) {
    this.aroonDown = aroonDown;
  }


  public GetTimeSeriesAroon200ResponseValuesInner aroonUp(@javax.annotation.Nonnull String aroonUp) {
    this.aroonUp = aroonUp;
    return this;
  }

  /**
   * Aroon up value
   * @return aroonUp
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AROON_UP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAroonUp() {
    return aroonUp;
  }


  @JsonProperty(value = JSON_PROPERTY_AROON_UP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAroonUp(@javax.annotation.Nonnull String aroonUp) {
    this.aroonUp = aroonUp;
  }


  /**
   * Return true if this GetTimeSeriesAroon_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesAroon200ResponseValuesInner getTimeSeriesAroon200ResponseValuesInner = (GetTimeSeriesAroon200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesAroon200ResponseValuesInner.datetime) &&
        Objects.equals(this.aroonDown, getTimeSeriesAroon200ResponseValuesInner.aroonDown) &&
        Objects.equals(this.aroonUp, getTimeSeriesAroon200ResponseValuesInner.aroonUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, aroonDown, aroonUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesAroon200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    aroonDown: ").append(toIndentedString(aroonDown)).append("\n");
    sb.append("    aroonUp: ").append(toIndentedString(aroonUp)).append("\n");
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

    // add `aroon_down` to the URL query string
    if (getAroonDown() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saroon_down%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAroonDown()))));
    }

    // add `aroon_up` to the URL query string
    if (getAroonUp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saroon_up%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAroonUp()))));
    }

    return joiner.toString();
  }
}

