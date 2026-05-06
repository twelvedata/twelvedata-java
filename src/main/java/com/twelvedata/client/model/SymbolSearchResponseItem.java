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
import com.twelvedata.client.model.SymbolSearchResponseItemAccess;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * SymbolSearchResponseItem represents details of a symbol search result
 */
@JsonPropertyOrder({
  SymbolSearchResponseItem.JSON_PROPERTY_SYMBOL,
  SymbolSearchResponseItem.JSON_PROPERTY_INSTRUMENT_NAME,
  SymbolSearchResponseItem.JSON_PROPERTY_EXCHANGE,
  SymbolSearchResponseItem.JSON_PROPERTY_MIC_CODE,
  SymbolSearchResponseItem.JSON_PROPERTY_EXCHANGE_TIMEZONE,
  SymbolSearchResponseItem.JSON_PROPERTY_INSTRUMENT_TYPE,
  SymbolSearchResponseItem.JSON_PROPERTY_COUNTRY,
  SymbolSearchResponseItem.JSON_PROPERTY_CURRENCY,
  SymbolSearchResponseItem.JSON_PROPERTY_ACCESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class SymbolSearchResponseItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_INSTRUMENT_NAME = "instrument_name";
  @javax.annotation.Nonnull
  private String instrumentName;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_EXCHANGE_TIMEZONE = "exchange_timezone";
  @javax.annotation.Nonnull
  private String exchangeTimezone;

  public static final String JSON_PROPERTY_INSTRUMENT_TYPE = "instrument_type";
  @javax.annotation.Nonnull
  private String instrumentType;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private SymbolSearchResponseItemAccess access;

  public SymbolSearchResponseItem() { 
  }

  public SymbolSearchResponseItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Ticker symbol of instrument
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


  public SymbolSearchResponseItem instrumentName(@javax.annotation.Nonnull String instrumentName) {
    this.instrumentName = instrumentName;
    return this;
  }

  /**
   * Name of exchange
   * @return instrumentName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INSTRUMENT_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstrumentName() {
    return instrumentName;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTRUMENT_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstrumentName(@javax.annotation.Nonnull String instrumentName) {
    this.instrumentName = instrumentName;
  }


  public SymbolSearchResponseItem exchange(@javax.annotation.Nonnull String exchange) {
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


  public SymbolSearchResponseItem micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
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


  public SymbolSearchResponseItem exchangeTimezone(@javax.annotation.Nonnull String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
    return this;
  }

  /**
   * Time zone where exchange is located
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


  public SymbolSearchResponseItem instrumentType(@javax.annotation.Nonnull String instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Type of instrument
   * @return instrumentType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INSTRUMENT_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstrumentType() {
    return instrumentType;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTRUMENT_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstrumentType(@javax.annotation.Nonnull String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public SymbolSearchResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country to which stock exchange belongs to
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public SymbolSearchResponseItem currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency in which the instrument is traded
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


  public SymbolSearchResponseItem access(@javax.annotation.Nullable SymbolSearchResponseItemAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SymbolSearchResponseItemAccess getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable SymbolSearchResponseItemAccess access) {
    this.access = access;
  }


  /**
   * Return true if this SymbolSearchResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolSearchResponseItem symbolSearchResponseItem = (SymbolSearchResponseItem) o;
    return Objects.equals(this.symbol, symbolSearchResponseItem.symbol) &&
        Objects.equals(this.instrumentName, symbolSearchResponseItem.instrumentName) &&
        Objects.equals(this.exchange, symbolSearchResponseItem.exchange) &&
        Objects.equals(this.micCode, symbolSearchResponseItem.micCode) &&
        Objects.equals(this.exchangeTimezone, symbolSearchResponseItem.exchangeTimezone) &&
        Objects.equals(this.instrumentType, symbolSearchResponseItem.instrumentType) &&
        Objects.equals(this.country, symbolSearchResponseItem.country) &&
        Objects.equals(this.currency, symbolSearchResponseItem.currency) &&
        Objects.equals(this.access, symbolSearchResponseItem.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, instrumentName, exchange, micCode, exchangeTimezone, instrumentType, country, currency, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolSearchResponseItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    instrumentName: ").append(toIndentedString(instrumentName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    exchangeTimezone: ").append(toIndentedString(exchangeTimezone)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

    // add `instrument_name` to the URL query string
    if (getInstrumentName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstrument_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstrumentName()))));
    }

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `exchange_timezone` to the URL query string
    if (getExchangeTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange_timezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchangeTimezone()))));
    }

    // add `instrument_type` to the URL query string
    if (getInstrumentType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstrument_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstrumentType()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `access` to the URL query string
    if (getAccess() != null) {
      joiner.add(getAccess().toUrlQueryString(prefix + "access" + suffix));
    }

    return joiner.toString();
  }
}

