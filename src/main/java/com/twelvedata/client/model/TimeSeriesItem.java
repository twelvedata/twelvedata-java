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
 * TimeSeriesItem
 */
@JsonPropertyOrder({
  TimeSeriesItem.JSON_PROPERTY_DATETIME,
  TimeSeriesItem.JSON_PROPERTY_OPEN,
  TimeSeriesItem.JSON_PROPERTY_HIGH,
  TimeSeriesItem.JSON_PROPERTY_LOW,
  TimeSeriesItem.JSON_PROPERTY_CLOSE,
  TimeSeriesItem.JSON_PROPERTY_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TimeSeriesItem {
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

  public static final String JSON_PROPERTY_VOLUME = "volume";
  @javax.annotation.Nullable
  private String volume;

  public TimeSeriesItem() { 
  }

  public TimeSeriesItem datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Datetime at local exchange time referring to when the bar with specified interval was opened.
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


  public TimeSeriesItem open(@javax.annotation.Nonnull String open) {
    this.open = open;
    return this;
  }

  /**
   * Price at the opening of current bar
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


  public TimeSeriesItem high(@javax.annotation.Nonnull String high) {
    this.high = high;
    return this;
  }

  /**
   * Highest price which occurred during the current bar.
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


  public TimeSeriesItem low(@javax.annotation.Nonnull String low) {
    this.low = low;
    return this;
  }

  /**
   * Lowest price which occurred during the current bar.
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


  public TimeSeriesItem close(@javax.annotation.Nonnull String close) {
    this.close = close;
    return this;
  }

  /**
   * Close price at the end of the bar.
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


  public TimeSeriesItem volume(@javax.annotation.Nullable String volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Trading volume which occurred during the current bar
   * @return volume
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVolume() {
    return volume;
  }


  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(@javax.annotation.Nullable String volume) {
    this.volume = volume;
  }


  /**
   * Return true if this TimeSeriesItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesItem timeSeriesItem = (TimeSeriesItem) o;
    return Objects.equals(this.datetime, timeSeriesItem.datetime) &&
        Objects.equals(this.open, timeSeriesItem.open) &&
        Objects.equals(this.high, timeSeriesItem.high) &&
        Objects.equals(this.low, timeSeriesItem.low) &&
        Objects.equals(this.close, timeSeriesItem.close) &&
        Objects.equals(this.volume, timeSeriesItem.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, open, high, low, close, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesItem {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

    // add `volume` to the URL query string
    if (getVolume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svolume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVolume()))));
    }

    return joiner.toString();
  }
}

