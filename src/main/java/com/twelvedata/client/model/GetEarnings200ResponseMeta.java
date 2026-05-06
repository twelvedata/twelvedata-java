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
 * Metadata about the instrument
 */
@JsonPropertyOrder({
  GetEarnings200ResponseMeta.JSON_PROPERTY_SYMBOL,
  GetEarnings200ResponseMeta.JSON_PROPERTY_NAME,
  GetEarnings200ResponseMeta.JSON_PROPERTY_CURRENCY,
  GetEarnings200ResponseMeta.JSON_PROPERTY_EXCHANGE,
  GetEarnings200ResponseMeta.JSON_PROPERTY_MIC_CODE,
  GetEarnings200ResponseMeta.JSON_PROPERTY_EXCHANGE_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEarnings200ResponseMeta {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_EXCHANGE_TIMEZONE = "exchange_timezone";
  @javax.annotation.Nonnull
  private String exchangeTimezone;

  public GetEarnings200ResponseMeta() { 
  }

  public GetEarnings200ResponseMeta symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Symbol of the instrument
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


  public GetEarnings200ResponseMeta name(@javax.annotation.Nonnull String name) {
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


  public GetEarnings200ResponseMeta currency(@javax.annotation.Nonnull String currency) {
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


  public GetEarnings200ResponseMeta exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange where the instrument is traded
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


  public GetEarnings200ResponseMeta micCode(@javax.annotation.Nonnull String micCode) {
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


  public GetEarnings200ResponseMeta exchangeTimezone(@javax.annotation.Nonnull String exchangeTimezone) {
    this.exchangeTimezone = exchangeTimezone;
    return this;
  }

  /**
   * Timezone of the exchange
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


  /**
   * Return true if this GetEarnings_200_response_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEarnings200ResponseMeta getEarnings200ResponseMeta = (GetEarnings200ResponseMeta) o;
    return Objects.equals(this.symbol, getEarnings200ResponseMeta.symbol) &&
        Objects.equals(this.name, getEarnings200ResponseMeta.name) &&
        Objects.equals(this.currency, getEarnings200ResponseMeta.currency) &&
        Objects.equals(this.exchange, getEarnings200ResponseMeta.exchange) &&
        Objects.equals(this.micCode, getEarnings200ResponseMeta.micCode) &&
        Objects.equals(this.exchangeTimezone, getEarnings200ResponseMeta.exchangeTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, currency, exchange, micCode, exchangeTimezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEarnings200ResponseMeta {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    exchangeTimezone: ").append(toIndentedString(exchangeTimezone)).append("\n");
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

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
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

    return joiner.toString();
  }
}

