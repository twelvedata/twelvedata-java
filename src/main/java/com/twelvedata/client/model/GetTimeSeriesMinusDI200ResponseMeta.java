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
import com.twelvedata.client.model.GetTimeSeriesMinusDI200ResponseMetaIndicator;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Json object with request general information
 */
@JsonPropertyOrder({
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_SYMBOL,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_INTERVAL,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_CURRENCY,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_EXCHANGE_TIMEZONE,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_EXCHANGE,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_MIC_CODE,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_TYPE,
  GetTimeSeriesMinusDI200ResponseMeta.JSON_PROPERTY_INDICATOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMinusDI200ResponseMeta {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nonnull
  private String interval;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE_TIMEZONE = "exchange_timezone";
  @javax.annotation.Nonnull
  private String exchangeTimezone;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_INDICATOR = "indicator";
  @javax.annotation.Nonnull
  private GetTimeSeriesMinusDI200ResponseMetaIndicator indicator;

  public GetTimeSeriesMinusDI200ResponseMeta() { 
  }

  public GetTimeSeriesMinusDI200ResponseMeta symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The ticker symbol of an instrument for which data was requested.
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


  public GetTimeSeriesMinusDI200ResponseMeta interval(@javax.annotation.Nonnull String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time gap between consecutive data points.
   * @return interval
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInterval() {
    return interval;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(@javax.annotation.Nonnull String interval) {
    this.interval = interval;
  }


  public GetTimeSeriesMinusDI200ResponseMeta currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of a traded instrument.
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public GetTimeSeriesMinusDI200ResponseMeta exchangeTimezone(@javax.annotation.Nonnull String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
    return this;
  }

  /**
   * The timezone of the exchange where the instrument is traded.
   * @return exchangeTimezone
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EXCHANGE_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExchangeTimezone() {
    return exchangeTimezone;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCHANGE_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeTimezone(@javax.annotation.Nonnull String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
  }


  public GetTimeSeriesMinusDI200ResponseMeta exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * The exchange name where the instrument is traded.
   * @return exchange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExchange() {
    return exchange;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
  }


  public GetTimeSeriesMinusDI200ResponseMeta micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * The Market Identifier Code (MIC) of the exchange where the instrument is traded.
   * @return micCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMicCode() {
    return micCode;
  }


  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMicCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
  }


  public GetTimeSeriesMinusDI200ResponseMeta type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * The asset class to which the instrument belongs.
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public GetTimeSeriesMinusDI200ResponseMeta indicator(@javax.annotation.Nonnull GetTimeSeriesMinusDI200ResponseMetaIndicator indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INDICATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetTimeSeriesMinusDI200ResponseMetaIndicator getIndicator() {
    return indicator;
  }


  @JsonProperty(value = JSON_PROPERTY_INDICATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndicator(@javax.annotation.Nonnull GetTimeSeriesMinusDI200ResponseMetaIndicator indicator) {
    this.indicator = indicator;
  }


  /**
   * Return true if this GetTimeSeriesMinusDI_200_response_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMinusDI200ResponseMeta getTimeSeriesMinusDI200ResponseMeta = (GetTimeSeriesMinusDI200ResponseMeta) o;
    return Objects.equals(this.symbol, getTimeSeriesMinusDI200ResponseMeta.symbol) &&
        Objects.equals(this.interval, getTimeSeriesMinusDI200ResponseMeta.interval) &&
        Objects.equals(this.currency, getTimeSeriesMinusDI200ResponseMeta.currency) &&
        Objects.equals(this.exchangeTimezone, getTimeSeriesMinusDI200ResponseMeta.exchangeTimezone) &&
        Objects.equals(this.exchange, getTimeSeriesMinusDI200ResponseMeta.exchange) &&
        Objects.equals(this.micCode, getTimeSeriesMinusDI200ResponseMeta.micCode) &&
        Objects.equals(this.type, getTimeSeriesMinusDI200ResponseMeta.type) &&
        Objects.equals(this.indicator, getTimeSeriesMinusDI200ResponseMeta.indicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, interval, currency, exchangeTimezone, exchange, micCode, type, indicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMinusDI200ResponseMeta {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchangeTimezone: ").append(toIndentedString(exchangeTimezone)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
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

    // add `indicator` to the URL query string
    if (getIndicator() != null) {
      joiner.add(getIndicator().toUrlQueryString(prefix + "indicator" + suffix));
    }

    return joiner.toString();
  }
}

