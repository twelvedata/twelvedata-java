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
 * GetTimeSeriesKeltner200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesKeltner200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesKeltner200ResponseValuesInner.JSON_PROPERTY_UPPER_LINE,
  GetTimeSeriesKeltner200ResponseValuesInner.JSON_PROPERTY_MIDDLE_LINE,
  GetTimeSeriesKeltner200ResponseValuesInner.JSON_PROPERTY_LOWER_LINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesKeltner200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_UPPER_LINE = "upper_line";
  @javax.annotation.Nonnull
  private String upperLine;

  public static final String JSON_PROPERTY_MIDDLE_LINE = "middle_line";
  @javax.annotation.Nonnull
  private String middleLine;

  public static final String JSON_PROPERTY_LOWER_LINE = "lower_line";
  @javax.annotation.Nonnull
  private String lowerLine;

  public GetTimeSeriesKeltner200ResponseValuesInner() { 
  }

  public GetTimeSeriesKeltner200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesKeltner200ResponseValuesInner upperLine(@javax.annotation.Nonnull String upperLine) {
    this.upperLine = upperLine;
    return this;
  }

  /**
   * Upper line value
   * @return upperLine
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_UPPER_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpperLine() {
    return upperLine;
  }


  @JsonProperty(value = JSON_PROPERTY_UPPER_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpperLine(@javax.annotation.Nonnull String upperLine) {
    this.upperLine = upperLine;
  }


  public GetTimeSeriesKeltner200ResponseValuesInner middleLine(@javax.annotation.Nonnull String middleLine) {
    this.middleLine = middleLine;
    return this;
  }

  /**
   * Middle line value
   * @return middleLine
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MIDDLE_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMiddleLine() {
    return middleLine;
  }


  @JsonProperty(value = JSON_PROPERTY_MIDDLE_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMiddleLine(@javax.annotation.Nonnull String middleLine) {
    this.middleLine = middleLine;
  }


  public GetTimeSeriesKeltner200ResponseValuesInner lowerLine(@javax.annotation.Nonnull String lowerLine) {
    this.lowerLine = lowerLine;
    return this;
  }

  /**
   * Lower line value
   * @return lowerLine
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LOWER_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLowerLine() {
    return lowerLine;
  }


  @JsonProperty(value = JSON_PROPERTY_LOWER_LINE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLowerLine(@javax.annotation.Nonnull String lowerLine) {
    this.lowerLine = lowerLine;
  }


  /**
   * Return true if this GetTimeSeriesKeltner_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesKeltner200ResponseValuesInner getTimeSeriesKeltner200ResponseValuesInner = (GetTimeSeriesKeltner200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesKeltner200ResponseValuesInner.datetime) &&
        Objects.equals(this.upperLine, getTimeSeriesKeltner200ResponseValuesInner.upperLine) &&
        Objects.equals(this.middleLine, getTimeSeriesKeltner200ResponseValuesInner.middleLine) &&
        Objects.equals(this.lowerLine, getTimeSeriesKeltner200ResponseValuesInner.lowerLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, upperLine, middleLine, lowerLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesKeltner200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    upperLine: ").append(toIndentedString(upperLine)).append("\n");
    sb.append("    middleLine: ").append(toIndentedString(middleLine)).append("\n");
    sb.append("    lowerLine: ").append(toIndentedString(lowerLine)).append("\n");
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

    // add `upper_line` to the URL query string
    if (getUpperLine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supper_line%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpperLine()))));
    }

    // add `middle_line` to the URL query string
    if (getMiddleLine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smiddle_line%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMiddleLine()))));
    }

    // add `lower_line` to the URL query string
    if (getLowerLine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slower_line%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLowerLine()))));
    }

    return joiner.toString();
  }
}

