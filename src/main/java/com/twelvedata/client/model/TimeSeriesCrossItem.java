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
 * TimeSeriesCrossItem represents a single data point in the time series
 */
@JsonPropertyOrder({
  TimeSeriesCrossItem.JSON_PROPERTY_DATETIME,
  TimeSeriesCrossItem.JSON_PROPERTY_OPEN,
  TimeSeriesCrossItem.JSON_PROPERTY_HIGH,
  TimeSeriesCrossItem.JSON_PROPERTY_LOW,
  TimeSeriesCrossItem.JSON_PROPERTY_CLOSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TimeSeriesCrossItem {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_OPEN = "open";
  @javax.annotation.Nonnull
  private String open;

  public static final String JSON_PROPERTY_HIGH = "high";
  @javax.annotation.Nonnull
  private String high;

  public static final String JSON_PROPERTY_LOW = "low";
  @javax.annotation.Nonnull
  private String low;

  public static final String JSON_PROPERTY_CLOSE = "close";
  @javax.annotation.Nonnull
  private String close;

  public TimeSeriesCrossItem() { 
  }

  public TimeSeriesCrossItem datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Datetime at local exchange time referring to when the bar with specified interval was opened
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


  public TimeSeriesCrossItem open(@javax.annotation.Nonnull String open) {
    this.open = open;
    return this;
  }

  /**
   * Price at the opening of the current bar
   * @return open
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOpen() {
    return open;
  }


  @JsonProperty(value = JSON_PROPERTY_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpen(@javax.annotation.Nonnull String open) {
    this.open = open;
  }


  public TimeSeriesCrossItem high(@javax.annotation.Nonnull String high) {
    this.high = high;
    return this;
  }

  /**
   * Highest price which occurred during the current bar
   * @return high
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HIGH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHigh() {
    return high;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHigh(@javax.annotation.Nonnull String high) {
    this.high = high;
  }


  public TimeSeriesCrossItem low(@javax.annotation.Nonnull String low) {
    this.low = low;
    return this;
  }

  /**
   * Lowest price which occurred during the current bar
   * @return low
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLow() {
    return low;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLow(@javax.annotation.Nonnull String low) {
    this.low = low;
  }


  public TimeSeriesCrossItem close(@javax.annotation.Nonnull String close) {
    this.close = close;
    return this;
  }

  /**
   * Close price at the end of the bar
   * @return close
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClose() {
    return close;
  }


  @JsonProperty(value = JSON_PROPERTY_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClose(@javax.annotation.Nonnull String close) {
    this.close = close;
  }


  /**
   * Return true if this TimeSeriesCrossItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesCrossItem timeSeriesCrossItem = (TimeSeriesCrossItem) o;
    return Objects.equals(this.datetime, timeSeriesCrossItem.datetime) &&
        Objects.equals(this.open, timeSeriesCrossItem.open) &&
        Objects.equals(this.high, timeSeriesCrossItem.high) &&
        Objects.equals(this.low, timeSeriesCrossItem.low) &&
        Objects.equals(this.close, timeSeriesCrossItem.close);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, open, high, low, close);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesCrossItem {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
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

    // add `open` to the URL query string
    if (getOpen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sopen%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOpen()))));
    }

    // add `high` to the URL query string
    if (getHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHigh()))));
    }

    // add `low` to the URL query string
    if (getLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLow()))));
    }

    // add `close` to the URL query string
    if (getClose() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclose%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClose()))));
    }

    return joiner.toString();
  }
}

