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
 * GetCurrencyConversion200Response
 */
@JsonPropertyOrder({
  GetCurrencyConversion200Response.JSON_PROPERTY_SYMBOL,
  GetCurrencyConversion200Response.JSON_PROPERTY_RATE,
  GetCurrencyConversion200Response.JSON_PROPERTY_AMOUNT,
  GetCurrencyConversion200Response.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetCurrencyConversion200Response {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_RATE = "rate";
  @javax.annotation.Nonnull
  private Double rate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private Double amount;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @javax.annotation.Nonnull
  private Long timestamp;

  public GetCurrencyConversion200Response() { 
  }

  public GetCurrencyConversion200Response symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Requested currency symbol
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


  public GetCurrencyConversion200Response rate(@javax.annotation.Nonnull Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Real-time exchange rate for the corresponding symbol
   * @return rate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRate() {
    return rate;
  }


  @JsonProperty(value = JSON_PROPERTY_RATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRate(@javax.annotation.Nonnull Double rate) {
    this.rate = rate;
  }


  public GetCurrencyConversion200Response amount(@javax.annotation.Nullable Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of converted currency
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmount() {
    return amount;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(@javax.annotation.Nullable Double amount) {
    this.amount = amount;
  }


  public GetCurrencyConversion200Response timestamp(@javax.annotation.Nonnull Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Unix timestamp of the rate
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


  /**
   * Return true if this GetCurrencyConversion_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCurrencyConversion200Response getCurrencyConversion200Response = (GetCurrencyConversion200Response) o;
    return Objects.equals(this.symbol, getCurrencyConversion200Response.symbol) &&
        Objects.equals(this.rate, getCurrencyConversion200Response.rate) &&
        Objects.equals(this.amount, getCurrencyConversion200Response.amount) &&
        Objects.equals(this.timestamp, getCurrencyConversion200Response.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, rate, amount, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCurrencyConversion200Response {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

    // add `rate` to the URL query string
    if (getRate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRate()))));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmount()))));
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimestamp()))));
    }

    return joiner.toString();
  }
}

