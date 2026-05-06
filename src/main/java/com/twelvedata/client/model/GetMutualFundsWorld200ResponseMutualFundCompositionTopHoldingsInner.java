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
 * GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.JSON_PROPERTY_SYMBOL,
  GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.JSON_PROPERTY_NAME,
  GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.JSON_PROPERTY_EXCHANGE,
  GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.JSON_PROPERTY_MIC_CODE,
  GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.JSON_PROPERTY_WEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nullable
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nullable
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  @javax.annotation.Nullable
  private Double weight;

  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Symbol ticker of a holding instrument
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


  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of a holding instrument
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner exchange(@javax.annotation.Nullable String exchange) {
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


  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner micCode(@javax.annotation.Nullable String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market Identifier Code (MIC) under ISO 10383 standard
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


  public GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner weight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of a holding instrument in overall portfolio composition
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWeight() {
    return weight;
  }


  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_composition_top_holdings_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner = (GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner) o;
    return Objects.equals(this.symbol, getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.symbol) &&
        Objects.equals(this.name, getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.name) &&
        Objects.equals(this.exchange, getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.exchange) &&
        Objects.equals(this.micCode, getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.micCode) &&
        Objects.equals(this.weight, getMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, exchange, micCode, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

    // add `weight` to the URL query string
    if (getWeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sweight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWeight()))));
    }

    return joiner.toString();
  }
}

