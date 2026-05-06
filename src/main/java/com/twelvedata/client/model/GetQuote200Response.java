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
import com.twelvedata.client.model.GetQuote200ResponseFiftyTwoWeek;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetQuote200Response
 */
@JsonPropertyOrder({
  GetQuote200Response.JSON_PROPERTY_SYMBOL,
  GetQuote200Response.JSON_PROPERTY_NAME,
  GetQuote200Response.JSON_PROPERTY_EXCHANGE,
  GetQuote200Response.JSON_PROPERTY_MIC_CODE,
  GetQuote200Response.JSON_PROPERTY_CURRENCY,
  GetQuote200Response.JSON_PROPERTY_DATETIME,
  GetQuote200Response.JSON_PROPERTY_TIMESTAMP,
  GetQuote200Response.JSON_PROPERTY_LAST_QUOTE_AT,
  GetQuote200Response.JSON_PROPERTY_OPEN,
  GetQuote200Response.JSON_PROPERTY_HIGH,
  GetQuote200Response.JSON_PROPERTY_LOW,
  GetQuote200Response.JSON_PROPERTY_CLOSE,
  GetQuote200Response.JSON_PROPERTY_VOLUME,
  GetQuote200Response.JSON_PROPERTY_PREVIOUS_CLOSE,
  GetQuote200Response.JSON_PROPERTY_CHANGE,
  GetQuote200Response.JSON_PROPERTY_PERCENT_CHANGE,
  GetQuote200Response.JSON_PROPERTY_AVERAGE_VOLUME,
  GetQuote200Response.JSON_PROPERTY_ROLLING1D_CHANGE,
  GetQuote200Response.JSON_PROPERTY_ROLLING7D_CHANGE,
  GetQuote200Response.JSON_PROPERTY_ROLLING_CHANGE,
  GetQuote200Response.JSON_PROPERTY_IS_MARKET_OPEN,
  GetQuote200Response.JSON_PROPERTY_FIFTY_TWO_WEEK,
  GetQuote200Response.JSON_PROPERTY_EXTENDED_CHANGE,
  GetQuote200Response.JSON_PROPERTY_EXTENDED_PERCENT_CHANGE,
  GetQuote200Response.JSON_PROPERTY_EXTENDED_PRICE,
  GetQuote200Response.JSON_PROPERTY_EXTENDED_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetQuote200Response {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @javax.annotation.Nonnull
  private Long timestamp;

  public static final String JSON_PROPERTY_LAST_QUOTE_AT = "last_quote_at";
  @javax.annotation.Nullable
  private Long lastQuoteAt;

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

  public static final String JSON_PROPERTY_PREVIOUS_CLOSE = "previous_close";
  @javax.annotation.Nonnull
  private String previousClose;

  public static final String JSON_PROPERTY_CHANGE = "change";
  @javax.annotation.Nonnull
  private String change;

  public static final String JSON_PROPERTY_PERCENT_CHANGE = "percent_change";
  @javax.annotation.Nonnull
  private String percentChange;

  public static final String JSON_PROPERTY_AVERAGE_VOLUME = "average_volume";
  @javax.annotation.Nullable
  private String averageVolume;

  public static final String JSON_PROPERTY_ROLLING1D_CHANGE = "rolling_1d_change";
  @javax.annotation.Nullable
  private String rolling1dChange;

  public static final String JSON_PROPERTY_ROLLING7D_CHANGE = "rolling_7d_change";
  @javax.annotation.Nullable
  private String rolling7dChange;

  public static final String JSON_PROPERTY_ROLLING_CHANGE = "rolling_change";
  @javax.annotation.Nullable
  private String rollingChange;

  public static final String JSON_PROPERTY_IS_MARKET_OPEN = "is_market_open";
  @javax.annotation.Nonnull
  private Boolean isMarketOpen;

  public static final String JSON_PROPERTY_FIFTY_TWO_WEEK = "fifty_two_week";
  @javax.annotation.Nonnull
  private GetQuote200ResponseFiftyTwoWeek fiftyTwoWeek;

  public static final String JSON_PROPERTY_EXTENDED_CHANGE = "extended_change";
  @javax.annotation.Nullable
  private String extendedChange;

  public static final String JSON_PROPERTY_EXTENDED_PERCENT_CHANGE = "extended_percent_change";
  @javax.annotation.Nullable
  private String extendedPercentChange;

  public static final String JSON_PROPERTY_EXTENDED_PRICE = "extended_price";
  @javax.annotation.Nullable
  private String extendedPrice;

  public static final String JSON_PROPERTY_EXTENDED_TIMESTAMP = "extended_timestamp";
  @javax.annotation.Nullable
  private Long extendedTimestamp;

  public GetQuote200Response() { 
  }

  public GetQuote200Response symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Symbol passed
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


  public GetQuote200Response name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the instrument
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


  public GetQuote200Response exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange where instrument is traded
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


  public GetQuote200Response micCode(@javax.annotation.Nullable String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard. Available for stocks, ETFs, mutual funds, bonds
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


  public GetQuote200Response currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency in which the equity is denominated. Available for stocks, ETFs, mutual funds, bonds
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


  public GetQuote200Response datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Datetime in defined timezone referring to when the bar with specified interval was opened
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


  public GetQuote200Response timestamp(@javax.annotation.Nonnull Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Unix timestamp representing the opening candle of the specified interval
   * @return timestamp
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(@javax.annotation.Nonnull Long timestamp) {
    this.timestamp = timestamp;
  }


  public GetQuote200Response lastQuoteAt(@javax.annotation.Nullable Long lastQuoteAt) {
    this.lastQuoteAt = lastQuoteAt;
    return this;
  }

  /**
   * Unix timestamp of last minute candle
   * @return lastQuoteAt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_QUOTE_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastQuoteAt() {
    return lastQuoteAt;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_QUOTE_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastQuoteAt(@javax.annotation.Nullable Long lastQuoteAt) {
    this.lastQuoteAt = lastQuoteAt;
  }


  public GetQuote200Response open(@javax.annotation.Nonnull String open) {
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


  public GetQuote200Response high(@javax.annotation.Nonnull String high) {
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


  public GetQuote200Response low(@javax.annotation.Nonnull String low) {
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


  public GetQuote200Response close(@javax.annotation.Nonnull String close) {
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


  public GetQuote200Response volume(@javax.annotation.Nullable String volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Trading volume during the bar. Available not for all instrument types
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


  public GetQuote200Response previousClose(@javax.annotation.Nonnull String previousClose) {
    this.previousClose = previousClose;
    return this;
  }

  /**
   * Close price at the end of the previous bar
   * @return previousClose
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PREVIOUS_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPreviousClose() {
    return previousClose;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIOUS_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviousClose(@javax.annotation.Nonnull String previousClose) {
    this.previousClose = previousClose;
  }


  public GetQuote200Response change(@javax.annotation.Nonnull String change) {
    this.change = change;
    return this;
  }

  /**
   * Close - previous_close
   * @return change
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChange() {
    return change;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChange(@javax.annotation.Nonnull String change) {
    this.change = change;
  }


  public GetQuote200Response percentChange(@javax.annotation.Nonnull String percentChange) {
    this.percentChange = percentChange;
    return this;
  }

  /**
   * (Close - previous_close) / previous_close * 100
   * @return percentChange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPercentChange() {
    return percentChange;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentChange(@javax.annotation.Nonnull String percentChange) {
    this.percentChange = percentChange;
  }


  public GetQuote200Response averageVolume(@javax.annotation.Nullable String averageVolume) {
    this.averageVolume = averageVolume;
    return this;
  }

  /**
   * Average volume of the specified period. Available not for all instrument types
   * @return averageVolume
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVERAGE_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAverageVolume() {
    return averageVolume;
  }


  @JsonProperty(value = JSON_PROPERTY_AVERAGE_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageVolume(@javax.annotation.Nullable String averageVolume) {
    this.averageVolume = averageVolume;
  }


  public GetQuote200Response rolling1dChange(@javax.annotation.Nullable String rolling1dChange) {
    this.rolling1dChange = rolling1dChange;
    return this;
  }

  /**
   * Percent change in price between the current and the backward one, where period is 1 day. Available for crypto
   * @return rolling1dChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLLING1D_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRolling1dChange() {
    return rolling1dChange;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLLING1D_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRolling1dChange(@javax.annotation.Nullable String rolling1dChange) {
    this.rolling1dChange = rolling1dChange;
  }


  public GetQuote200Response rolling7dChange(@javax.annotation.Nullable String rolling7dChange) {
    this.rolling7dChange = rolling7dChange;
    return this;
  }

  /**
   * Percent change in price between the current and the backward one, where period is 7 days. Available for crypto
   * @return rolling7dChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLLING7D_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRolling7dChange() {
    return rolling7dChange;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLLING7D_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRolling7dChange(@javax.annotation.Nullable String rolling7dChange) {
    this.rolling7dChange = rolling7dChange;
  }


  public GetQuote200Response rollingChange(@javax.annotation.Nullable String rollingChange) {
    this.rollingChange = rollingChange;
    return this;
  }

  /**
   * Percent change in price between the current and the backward one, where period specified in request param rolling_period. Available for crypto
   * @return rollingChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLLING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRollingChange() {
    return rollingChange;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLLING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRollingChange(@javax.annotation.Nullable String rollingChange) {
    this.rollingChange = rollingChange;
  }


  public GetQuote200Response isMarketOpen(@javax.annotation.Nonnull Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
    return this;
  }

  /**
   * True if market is open; false if closed
   * @return isMarketOpen
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_IS_MARKET_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMarketOpen() {
    return isMarketOpen;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_MARKET_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMarketOpen(@javax.annotation.Nonnull Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
  }


  public GetQuote200Response fiftyTwoWeek(@javax.annotation.Nonnull GetQuote200ResponseFiftyTwoWeek fiftyTwoWeek) {
    this.fiftyTwoWeek = fiftyTwoWeek;
    return this;
  }

  /**
   * Get fiftyTwoWeek
   * @return fiftyTwoWeek
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetQuote200ResponseFiftyTwoWeek getFiftyTwoWeek() {
    return fiftyTwoWeek;
  }


  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiftyTwoWeek(@javax.annotation.Nonnull GetQuote200ResponseFiftyTwoWeek fiftyTwoWeek) {
    this.fiftyTwoWeek = fiftyTwoWeek;
  }


  public GetQuote200Response extendedChange(@javax.annotation.Nullable String extendedChange) {
    this.extendedChange = extendedChange;
    return this;
  }

  /**
   * Diff between the regular close price and the latest extended price. Displayed only if prepost is true
   * @return extendedChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTENDED_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtendedChange() {
    return extendedChange;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTENDED_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedChange(@javax.annotation.Nullable String extendedChange) {
    this.extendedChange = extendedChange;
  }


  public GetQuote200Response extendedPercentChange(@javax.annotation.Nullable String extendedPercentChange) {
    this.extendedPercentChange = extendedPercentChange;
    return this;
  }

  /**
   * Percent change in price between the regular close price and the latest extended price. Displayed only if prepost is true
   * @return extendedPercentChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTENDED_PERCENT_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtendedPercentChange() {
    return extendedPercentChange;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTENDED_PERCENT_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedPercentChange(@javax.annotation.Nullable String extendedPercentChange) {
    this.extendedPercentChange = extendedPercentChange;
  }


  public GetQuote200Response extendedPrice(@javax.annotation.Nullable String extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

  /**
   * Latest extended price. Displayed only if prepost is true
   * @return extendedPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTENDED_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtendedPrice() {
    return extendedPrice;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTENDED_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedPrice(@javax.annotation.Nullable String extendedPrice) {
    this.extendedPrice = extendedPrice;
  }


  public GetQuote200Response extendedTimestamp(@javax.annotation.Nullable Long extendedTimestamp) {
    this.extendedTimestamp = extendedTimestamp;
    return this;
  }

  /**
   * Unix timestamp of the last extended price. Displayed only if prepost is true
   * @return extendedTimestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTENDED_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtendedTimestamp() {
    return extendedTimestamp;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTENDED_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedTimestamp(@javax.annotation.Nullable Long extendedTimestamp) {
    this.extendedTimestamp = extendedTimestamp;
  }


  /**
   * Return true if this GetQuote_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQuote200Response getQuote200Response = (GetQuote200Response) o;
    return Objects.equals(this.symbol, getQuote200Response.symbol) &&
        Objects.equals(this.name, getQuote200Response.name) &&
        Objects.equals(this.exchange, getQuote200Response.exchange) &&
        Objects.equals(this.micCode, getQuote200Response.micCode) &&
        Objects.equals(this.currency, getQuote200Response.currency) &&
        Objects.equals(this.datetime, getQuote200Response.datetime) &&
        Objects.equals(this.timestamp, getQuote200Response.timestamp) &&
        Objects.equals(this.lastQuoteAt, getQuote200Response.lastQuoteAt) &&
        Objects.equals(this.open, getQuote200Response.open) &&
        Objects.equals(this.high, getQuote200Response.high) &&
        Objects.equals(this.low, getQuote200Response.low) &&
        Objects.equals(this.close, getQuote200Response.close) &&
        Objects.equals(this.volume, getQuote200Response.volume) &&
        Objects.equals(this.previousClose, getQuote200Response.previousClose) &&
        Objects.equals(this.change, getQuote200Response.change) &&
        Objects.equals(this.percentChange, getQuote200Response.percentChange) &&
        Objects.equals(this.averageVolume, getQuote200Response.averageVolume) &&
        Objects.equals(this.rolling1dChange, getQuote200Response.rolling1dChange) &&
        Objects.equals(this.rolling7dChange, getQuote200Response.rolling7dChange) &&
        Objects.equals(this.rollingChange, getQuote200Response.rollingChange) &&
        Objects.equals(this.isMarketOpen, getQuote200Response.isMarketOpen) &&
        Objects.equals(this.fiftyTwoWeek, getQuote200Response.fiftyTwoWeek) &&
        Objects.equals(this.extendedChange, getQuote200Response.extendedChange) &&
        Objects.equals(this.extendedPercentChange, getQuote200Response.extendedPercentChange) &&
        Objects.equals(this.extendedPrice, getQuote200Response.extendedPrice) &&
        Objects.equals(this.extendedTimestamp, getQuote200Response.extendedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, exchange, micCode, currency, datetime, timestamp, lastQuoteAt, open, high, low, close, volume, previousClose, change, percentChange, averageVolume, rolling1dChange, rolling7dChange, rollingChange, isMarketOpen, fiftyTwoWeek, extendedChange, extendedPercentChange, extendedPrice, extendedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuote200Response {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    lastQuoteAt: ").append(toIndentedString(lastQuoteAt)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    averageVolume: ").append(toIndentedString(averageVolume)).append("\n");
    sb.append("    rolling1dChange: ").append(toIndentedString(rolling1dChange)).append("\n");
    sb.append("    rolling7dChange: ").append(toIndentedString(rolling7dChange)).append("\n");
    sb.append("    rollingChange: ").append(toIndentedString(rollingChange)).append("\n");
    sb.append("    isMarketOpen: ").append(toIndentedString(isMarketOpen)).append("\n");
    sb.append("    fiftyTwoWeek: ").append(toIndentedString(fiftyTwoWeek)).append("\n");
    sb.append("    extendedChange: ").append(toIndentedString(extendedChange)).append("\n");
    sb.append("    extendedPercentChange: ").append(toIndentedString(extendedPercentChange)).append("\n");
    sb.append("    extendedPrice: ").append(toIndentedString(extendedPrice)).append("\n");
    sb.append("    extendedTimestamp: ").append(toIndentedString(extendedTimestamp)).append("\n");
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

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimestamp()))));
    }

    // add `last_quote_at` to the URL query string
    if (getLastQuoteAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_quote_at%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastQuoteAt()))));
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

    // add `previous_close` to the URL query string
    if (getPreviousClose() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprevious_close%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreviousClose()))));
    }

    // add `change` to the URL query string
    if (getChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChange()))));
    }

    // add `percent_change` to the URL query string
    if (getPercentChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentChange()))));
    }

    // add `average_volume` to the URL query string
    if (getAverageVolume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saverage_volume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAverageVolume()))));
    }

    // add `rolling_1d_change` to the URL query string
    if (getRolling1dChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srolling_1d_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRolling1dChange()))));
    }

    // add `rolling_7d_change` to the URL query string
    if (getRolling7dChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srolling_7d_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRolling7dChange()))));
    }

    // add `rolling_change` to the URL query string
    if (getRollingChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srolling_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRollingChange()))));
    }

    // add `is_market_open` to the URL query string
    if (getIsMarketOpen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sis_market_open%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsMarketOpen()))));
    }

    // add `fifty_two_week` to the URL query string
    if (getFiftyTwoWeek() != null) {
      joiner.add(getFiftyTwoWeek().toUrlQueryString(prefix + "fifty_two_week" + suffix));
    }

    // add `extended_change` to the URL query string
    if (getExtendedChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextended_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtendedChange()))));
    }

    // add `extended_percent_change` to the URL query string
    if (getExtendedPercentChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextended_percent_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtendedPercentChange()))));
    }

    // add `extended_price` to the URL query string
    if (getExtendedPrice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextended_price%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtendedPrice()))));
    }

    // add `extended_timestamp` to the URL query string
    if (getExtendedTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextended_timestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtendedTimestamp()))));
    }

    return joiner.toString();
  }
}

