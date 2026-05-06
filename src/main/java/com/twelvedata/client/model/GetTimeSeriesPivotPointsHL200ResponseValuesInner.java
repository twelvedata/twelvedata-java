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
 * GetTimeSeriesPivotPointsHL200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesPivotPointsHL200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesPivotPointsHL200ResponseValuesInner.JSON_PROPERTY_PIVOT_POINT_H,
  GetTimeSeriesPivotPointsHL200ResponseValuesInner.JSON_PROPERTY_PIVOT_POINT_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesPivotPointsHL200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_PIVOT_POINT_H = "pivot_point_h";
  @javax.annotation.Nonnull
  private Long pivotPointH;

  public static final String JSON_PROPERTY_PIVOT_POINT_L = "pivot_point_l";
  @javax.annotation.Nonnull
  private Long pivotPointL;

  public GetTimeSeriesPivotPointsHL200ResponseValuesInner() { 
  }

  public GetTimeSeriesPivotPointsHL200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesPivotPointsHL200ResponseValuesInner pivotPointH(@javax.annotation.Nonnull Long pivotPointH) {
    this.pivotPointH = pivotPointH;
    return this;
  }

  /**
   * &#x60;1&#x60; if it is a high pivot point, otherwise &#x60;0&#x60;
   * @return pivotPointH
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PIVOT_POINT_H, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPivotPointH() {
    return pivotPointH;
  }


  @JsonProperty(value = JSON_PROPERTY_PIVOT_POINT_H, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPivotPointH(@javax.annotation.Nonnull Long pivotPointH) {
    this.pivotPointH = pivotPointH;
  }


  public GetTimeSeriesPivotPointsHL200ResponseValuesInner pivotPointL(@javax.annotation.Nonnull Long pivotPointL) {
    this.pivotPointL = pivotPointL;
    return this;
  }

  /**
   * &#x60;1&#x60; if it is a low pivot point, otherwise &#x60;0&#x60;
   * @return pivotPointL
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PIVOT_POINT_L, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPivotPointL() {
    return pivotPointL;
  }


  @JsonProperty(value = JSON_PROPERTY_PIVOT_POINT_L, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPivotPointL(@javax.annotation.Nonnull Long pivotPointL) {
    this.pivotPointL = pivotPointL;
  }


  /**
   * Return true if this GetTimeSeriesPivotPointsHL_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesPivotPointsHL200ResponseValuesInner getTimeSeriesPivotPointsHL200ResponseValuesInner = (GetTimeSeriesPivotPointsHL200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesPivotPointsHL200ResponseValuesInner.datetime) &&
        Objects.equals(this.pivotPointH, getTimeSeriesPivotPointsHL200ResponseValuesInner.pivotPointH) &&
        Objects.equals(this.pivotPointL, getTimeSeriesPivotPointsHL200ResponseValuesInner.pivotPointL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, pivotPointH, pivotPointL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesPivotPointsHL200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    pivotPointH: ").append(toIndentedString(pivotPointH)).append("\n");
    sb.append("    pivotPointL: ").append(toIndentedString(pivotPointL)).append("\n");
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

    // add `pivot_point_h` to the URL query string
    if (getPivotPointH() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spivot_point_h%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPivotPointH()))));
    }

    // add `pivot_point_l` to the URL query string
    if (getPivotPointL() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spivot_point_l%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPivotPointL()))));
    }

    return joiner.toString();
  }
}

