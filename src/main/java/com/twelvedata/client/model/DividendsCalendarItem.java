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
 * DividendsCalendarItem represents details of a dividend
 */
@JsonPropertyOrder({
  DividendsCalendarItem.JSON_PROPERTY_SYMBOL,
  DividendsCalendarItem.JSON_PROPERTY_MIC_CODE,
  DividendsCalendarItem.JSON_PROPERTY_EXCHANGE,
  DividendsCalendarItem.JSON_PROPERTY_EX_DATE,
  DividendsCalendarItem.JSON_PROPERTY_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class DividendsCalendarItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nullable
  private String symbol;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nullable
  private String exchange;

  public static final String JSON_PROPERTY_EX_DATE = "ex_date";
  @javax.annotation.Nonnull
  private String exDate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Double amount;

  public DividendsCalendarItem() { 
  }

  public DividendsCalendarItem symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Ticker symbol of instrument
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


  public DividendsCalendarItem micCode(@javax.annotation.Nullable String micCode) {
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


  public DividendsCalendarItem exchange(@javax.annotation.Nullable String exchange) {
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


  public DividendsCalendarItem exDate(@javax.annotation.Nonnull String exDate) {
    this.exDate = exDate;
    return this;
  }

  /**
   * Stands for the ex date
   * @return exDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EX_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExDate() {
    return exDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EX_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExDate(@javax.annotation.Nonnull String exDate) {
    this.exDate = exDate;
  }


  public DividendsCalendarItem amount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Dividend payment amount
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAmount() {
    return amount;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
  }


  /**
   * Return true if this DividendsCalendarItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DividendsCalendarItem dividendsCalendarItem = (DividendsCalendarItem) o;
    return Objects.equals(this.symbol, dividendsCalendarItem.symbol) &&
        Objects.equals(this.micCode, dividendsCalendarItem.micCode) &&
        Objects.equals(this.exchange, dividendsCalendarItem.exchange) &&
        Objects.equals(this.exDate, dividendsCalendarItem.exDate) &&
        Objects.equals(this.amount, dividendsCalendarItem.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, micCode, exchange, exDate, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividendsCalendarItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `ex_date` to the URL query string
    if (getExDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sex_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExDate()))));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmount()))));
    }

    return joiner.toString();
  }
}

