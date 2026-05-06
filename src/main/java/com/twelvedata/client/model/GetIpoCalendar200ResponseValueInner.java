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
 * GetIpoCalendar200ResponseValueInner
 */
@JsonPropertyOrder({
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_SYMBOL,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_NAME,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_EXCHANGE,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_MIC_CODE,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_PRICE_RANGE_LOW,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_PRICE_RANGE_HIGH,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_OFFER_PRICE,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_CURRENCY,
  GetIpoCalendar200ResponseValueInner.JSON_PROPERTY_SHARES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetIpoCalendar200ResponseValueInner {
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
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_PRICE_RANGE_LOW = "price_range_low";
  @javax.annotation.Nullable
  private Double priceRangeLow;

  public static final String JSON_PROPERTY_PRICE_RANGE_HIGH = "price_range_high";
  @javax.annotation.Nullable
  private Double priceRangeHigh;

  public static final String JSON_PROPERTY_OFFER_PRICE = "offer_price";
  @javax.annotation.Nullable
  private Double offerPrice;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_SHARES = "shares";
  @javax.annotation.Nullable
  private Long shares;

  public GetIpoCalendar200ResponseValueInner() { 
  }

  public GetIpoCalendar200ResponseValueInner symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Ticker of the company
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


  public GetIpoCalendar200ResponseValueInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the company
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


  public GetIpoCalendar200ResponseValueInner exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange name where the company is listed
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


  public GetIpoCalendar200ResponseValueInner micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market Identifier Code (MIC) under ISO 10383 standard
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


  public GetIpoCalendar200ResponseValueInner priceRangeLow(@javax.annotation.Nullable Double priceRangeLow) {
    this.priceRangeLow = priceRangeLow;
    return this;
  }

  /**
   * The lower bound of stock price range if available
   * @return priceRangeLow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_RANGE_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceRangeLow() {
    return priceRangeLow;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_RANGE_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceRangeLow(@javax.annotation.Nullable Double priceRangeLow) {
    this.priceRangeLow = priceRangeLow;
  }


  public GetIpoCalendar200ResponseValueInner priceRangeHigh(@javax.annotation.Nullable Double priceRangeHigh) {
    this.priceRangeHigh = priceRangeHigh;
    return this;
  }

  /**
   * The upper bound of stock price range if available
   * @return priceRangeHigh
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_RANGE_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceRangeHigh() {
    return priceRangeHigh;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_RANGE_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceRangeHigh(@javax.annotation.Nullable Double priceRangeHigh) {
    this.priceRangeHigh = priceRangeHigh;
  }


  public GetIpoCalendar200ResponseValueInner offerPrice(@javax.annotation.Nullable Double offerPrice) {
    this.offerPrice = offerPrice;
    return this;
  }

  /**
   * Initial offer price if available
   * @return offerPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OFFER_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOfferPrice() {
    return offerPrice;
  }


  @JsonProperty(value = JSON_PROPERTY_OFFER_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferPrice(@javax.annotation.Nullable Double offerPrice) {
    this.offerPrice = offerPrice;
  }


  public GetIpoCalendar200ResponseValueInner currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of the stock
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


  public GetIpoCalendar200ResponseValueInner shares(@javax.annotation.Nullable Long shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Number of shares, if available
   * @return shares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShares() {
    return shares;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShares(@javax.annotation.Nullable Long shares) {
    this.shares = shares;
  }


  /**
   * Return true if this GetIpoCalendar_200_response_value_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIpoCalendar200ResponseValueInner getIpoCalendar200ResponseValueInner = (GetIpoCalendar200ResponseValueInner) o;
    return Objects.equals(this.symbol, getIpoCalendar200ResponseValueInner.symbol) &&
        Objects.equals(this.name, getIpoCalendar200ResponseValueInner.name) &&
        Objects.equals(this.exchange, getIpoCalendar200ResponseValueInner.exchange) &&
        Objects.equals(this.micCode, getIpoCalendar200ResponseValueInner.micCode) &&
        Objects.equals(this.priceRangeLow, getIpoCalendar200ResponseValueInner.priceRangeLow) &&
        Objects.equals(this.priceRangeHigh, getIpoCalendar200ResponseValueInner.priceRangeHigh) &&
        Objects.equals(this.offerPrice, getIpoCalendar200ResponseValueInner.offerPrice) &&
        Objects.equals(this.currency, getIpoCalendar200ResponseValueInner.currency) &&
        Objects.equals(this.shares, getIpoCalendar200ResponseValueInner.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, exchange, micCode, priceRangeLow, priceRangeHigh, offerPrice, currency, shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIpoCalendar200ResponseValueInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    priceRangeLow: ").append(toIndentedString(priceRangeLow)).append("\n");
    sb.append("    priceRangeHigh: ").append(toIndentedString(priceRangeHigh)).append("\n");
    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

    // add `price_range_low` to the URL query string
    if (getPriceRangeLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_range_low%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceRangeLow()))));
    }

    // add `price_range_high` to the URL query string
    if (getPriceRangeHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_range_high%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceRangeHigh()))));
    }

    // add `offer_price` to the URL query string
    if (getOfferPrice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soffer_price%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOfferPrice()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `shares` to the URL query string
    if (getShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShares()))));
    }

    return joiner.toString();
  }
}

