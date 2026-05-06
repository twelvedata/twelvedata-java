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
 * MarketMoversResponseValue
 */
@JsonPropertyOrder({
  MarketMoversResponseValue.JSON_PROPERTY_SYMBOL,
  MarketMoversResponseValue.JSON_PROPERTY_NAME,
  MarketMoversResponseValue.JSON_PROPERTY_EXCHANGE,
  MarketMoversResponseValue.JSON_PROPERTY_MIC_CODE,
  MarketMoversResponseValue.JSON_PROPERTY_DATETIME,
  MarketMoversResponseValue.JSON_PROPERTY_LAST,
  MarketMoversResponseValue.JSON_PROPERTY_HIGH,
  MarketMoversResponseValue.JSON_PROPERTY_LOW,
  MarketMoversResponseValue.JSON_PROPERTY_VOLUME,
  MarketMoversResponseValue.JSON_PROPERTY_CHANGE,
  MarketMoversResponseValue.JSON_PROPERTY_PERCENT_CHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class MarketMoversResponseValue {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nullable
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_LAST = "last";
  @javax.annotation.Nonnull
  private Double last;

  public static final String JSON_PROPERTY_HIGH = "high";
  @javax.annotation.Nonnull
  private Double high;

  public static final String JSON_PROPERTY_LOW = "low";
  @javax.annotation.Nonnull
  private Double low;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  @javax.annotation.Nonnull
  private Long volume;

  public static final String JSON_PROPERTY_CHANGE = "change";
  @javax.annotation.Nonnull
  private Double change;

  public static final String JSON_PROPERTY_PERCENT_CHANGE = "percent_change";
  @javax.annotation.Nonnull
  private Double percentChange;

  public MarketMoversResponseValue() { 
  }

  public MarketMoversResponseValue symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The exchange symbol ticker
   * @return symbol
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
  }


  public MarketMoversResponseValue name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The official name of the instrument
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public MarketMoversResponseValue exchange(@javax.annotation.Nullable String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange where instrument is traded
   * @return exchange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExchange() {
    return exchange;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchange(@javax.annotation.Nullable String exchange) {
    this.exchange = exchange;
  }


  public MarketMoversResponseValue micCode(@javax.annotation.Nullable String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
   * @return micCode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMicCode() {
    return micCode;
  }


  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMicCode(@javax.annotation.Nullable String micCode) {
    this.micCode = micCode;
  }


  public MarketMoversResponseValue datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * The last updated datetime timestamp
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


  public MarketMoversResponseValue last(@javax.annotation.Nonnull Double last) {
    this.last = last;
    return this;
  }

  /**
   * The latest available price for the symbol today
   * @return last
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LAST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLast() {
    return last;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLast(@javax.annotation.Nonnull Double last) {
    this.last = last;
  }


  public MarketMoversResponseValue high(@javax.annotation.Nonnull Double high) {
    this.high = high;
    return this;
  }

  /**
   * The highest price for the symbol today
   * @return high
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HIGH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getHigh() {
    return high;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHigh(@javax.annotation.Nonnull Double high) {
    this.high = high;
  }


  public MarketMoversResponseValue low(@javax.annotation.Nonnull Double low) {
    this.low = low;
    return this;
  }

  /**
   * The lowest price for the symbol today
   * @return low
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLow() {
    return low;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLow(@javax.annotation.Nonnull Double low) {
    this.low = low;
  }


  public MarketMoversResponseValue volume(@javax.annotation.Nonnull Long volume) {
    this.volume = volume;
    return this;
  }

  /**
   * The trading volume of the symbol today
   * @return volume
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVolume() {
    return volume;
  }


  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVolume(@javax.annotation.Nonnull Long volume) {
    this.volume = volume;
  }


  public MarketMoversResponseValue change(@javax.annotation.Nonnull Double change) {
    this.change = change;
    return this;
  }

  /**
   * The value of the change since the previous day
   * @return change
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getChange() {
    return change;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChange(@javax.annotation.Nonnull Double change) {
    this.change = change;
  }


  public MarketMoversResponseValue percentChange(@javax.annotation.Nonnull Double percentChange) {
    this.percentChange = percentChange;
    return this;
  }

  /**
   * The percentage change since the previous day
   * @return percentChange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPercentChange() {
    return percentChange;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentChange(@javax.annotation.Nonnull Double percentChange) {
    this.percentChange = percentChange;
  }


  /**
   * Return true if this MarketMoversResponseValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketMoversResponseValue marketMoversResponseValue = (MarketMoversResponseValue) o;
    return Objects.equals(this.symbol, marketMoversResponseValue.symbol) &&
        Objects.equals(this.name, marketMoversResponseValue.name) &&
        Objects.equals(this.exchange, marketMoversResponseValue.exchange) &&
        Objects.equals(this.micCode, marketMoversResponseValue.micCode) &&
        Objects.equals(this.datetime, marketMoversResponseValue.datetime) &&
        Objects.equals(this.last, marketMoversResponseValue.last) &&
        Objects.equals(this.high, marketMoversResponseValue.high) &&
        Objects.equals(this.low, marketMoversResponseValue.low) &&
        Objects.equals(this.volume, marketMoversResponseValue.volume) &&
        Objects.equals(this.change, marketMoversResponseValue.change) &&
        Objects.equals(this.percentChange, marketMoversResponseValue.percentChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, exchange, micCode, datetime, last, high, low, volume, change, percentChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketMoversResponseValue {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
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

    // add `symbol` to the URL query string
    if (getSymbol() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssymbol%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSymbol()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `last` to the URL query string
    if (getLast() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLast()))));
    }

    // add `high` to the URL query string
    if (getHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHigh()))));
    }

    // add `low` to the URL query string
    if (getLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLow()))));
    }

    // add `volume` to the URL query string
    if (getVolume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svolume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVolume()))));
    }

    // add `change` to the URL query string
    if (getChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChange()))));
    }

    // add `percent_change` to the URL query string
    if (getPercentChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentChange()))));
    }

    return joiner.toString();
  }
}

