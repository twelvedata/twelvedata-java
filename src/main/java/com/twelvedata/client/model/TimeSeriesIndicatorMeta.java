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
 * Common metadata fields for time series indicator responses
 */
@JsonPropertyOrder({
  TimeSeriesIndicatorMeta.JSON_PROPERTY_SYMBOL,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_INTERVAL,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_CURRENCY,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_EXCHANGE_TIMEZONE,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_EXCHANGE,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_MIC_CODE,
  TimeSeriesIndicatorMeta.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class TimeSeriesIndicatorMeta {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nullable
  private String symbol;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nullable
  private String interval;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE_TIMEZONE = "exchange_timezone";
  @javax.annotation.Nullable
  private String exchangeTimezone;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nullable
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public TimeSeriesIndicatorMeta() { 
  }

  public TimeSeriesIndicatorMeta symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The ticker symbol of an instrument for which data was requested.
   * @return symbol
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
  }


  public TimeSeriesIndicatorMeta interval(@javax.annotation.Nullable String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time gap between consecutive data points.
   * @return interval
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInterval() {
    return interval;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(@javax.annotation.Nullable String interval) {
    this.interval = interval;
  }


  public TimeSeriesIndicatorMeta currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of a traded instrument.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public TimeSeriesIndicatorMeta exchangeTimezone(@javax.annotation.Nullable String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
    return this;
  }

  /**
   * The timezone of the exchange where the instrument is traded.
   * @return exchangeTimezone
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXCHANGE_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExchangeTimezone() {
    return exchangeTimezone;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCHANGE_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeTimezone(@javax.annotation.Nullable String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
  }


  public TimeSeriesIndicatorMeta exchange(@javax.annotation.Nullable String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * The exchange name where the instrument is traded.
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


  public TimeSeriesIndicatorMeta micCode(@javax.annotation.Nullable String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * The Market Identifier Code (MIC) of the exchange where the instrument is traded.
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


  public TimeSeriesIndicatorMeta type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The asset class to which the instrument belongs.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  /**
   * Return true if this TimeSeriesIndicatorMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesIndicatorMeta timeSeriesIndicatorMeta = (TimeSeriesIndicatorMeta) o;
    return Objects.equals(this.symbol, timeSeriesIndicatorMeta.symbol) &&
        Objects.equals(this.interval, timeSeriesIndicatorMeta.interval) &&
        Objects.equals(this.currency, timeSeriesIndicatorMeta.currency) &&
        Objects.equals(this.exchangeTimezone, timeSeriesIndicatorMeta.exchangeTimezone) &&
        Objects.equals(this.exchange, timeSeriesIndicatorMeta.exchange) &&
        Objects.equals(this.micCode, timeSeriesIndicatorMeta.micCode) &&
        Objects.equals(this.type, timeSeriesIndicatorMeta.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, interval, currency, exchangeTimezone, exchange, micCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesIndicatorMeta {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchangeTimezone: ").append(toIndentedString(exchangeTimezone)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterval()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `exchange_timezone` to the URL query string
    if (getExchangeTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange_timezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchangeTimezone()))));
    }

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

