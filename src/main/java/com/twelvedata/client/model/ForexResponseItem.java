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
 * ForexResponseItem represents details of a forex pair
 */
@JsonPropertyOrder({
  ForexResponseItem.JSON_PROPERTY_SYMBOL,
  ForexResponseItem.JSON_PROPERTY_CURRENCY_GROUP,
  ForexResponseItem.JSON_PROPERTY_CURRENCY_BASE,
  ForexResponseItem.JSON_PROPERTY_CURRENCY_QUOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ForexResponseItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_CURRENCY_GROUP = "currency_group";
  @javax.annotation.Nonnull
  private String currencyGroup;

  public static final String JSON_PROPERTY_CURRENCY_BASE = "currency_base";
  @javax.annotation.Nonnull
  private String currencyBase;

  public static final String JSON_PROPERTY_CURRENCY_QUOTE = "currency_quote";
  @javax.annotation.Nonnull
  private String currencyQuote;

  public ForexResponseItem() { 
  }

  public ForexResponseItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Currency pair according to ISO 4217 standard codes with slash(/) delimiter
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


  public ForexResponseItem currencyGroup(@javax.annotation.Nonnull String currencyGroup) {
    this.currencyGroup = currencyGroup;
    return this;
  }

  /**
   * Group to which currency pair belongs to, could be: Major, Minor, Exotic and Exotic-Cross
   * @return currencyGroup
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrencyGroup() {
    return currencyGroup;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyGroup(@javax.annotation.Nonnull String currencyGroup) {
    this.currencyGroup = currencyGroup;
  }


  public ForexResponseItem currencyBase(@javax.annotation.Nonnull String currencyBase) {
    this.currencyBase = currencyBase;
    return this;
  }

  /**
   * Base currency name according to ISO 4217 standard
   * @return currencyBase
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY_BASE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrencyBase() {
    return currencyBase;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY_BASE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyBase(@javax.annotation.Nonnull String currencyBase) {
    this.currencyBase = currencyBase;
  }


  public ForexResponseItem currencyQuote(@javax.annotation.Nonnull String currencyQuote) {
    this.currencyQuote = currencyQuote;
    return this;
  }

  /**
   * Quote currency name according to ISO 4217 standard
   * @return currencyQuote
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY_QUOTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrencyQuote() {
    return currencyQuote;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY_QUOTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyQuote(@javax.annotation.Nonnull String currencyQuote) {
    this.currencyQuote = currencyQuote;
  }


  /**
   * Return true if this ForexResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexResponseItem forexResponseItem = (ForexResponseItem) o;
    return Objects.equals(this.symbol, forexResponseItem.symbol) &&
        Objects.equals(this.currencyGroup, forexResponseItem.currencyGroup) &&
        Objects.equals(this.currencyBase, forexResponseItem.currencyBase) &&
        Objects.equals(this.currencyQuote, forexResponseItem.currencyQuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, currencyGroup, currencyBase, currencyQuote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForexResponseItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    currencyGroup: ").append(toIndentedString(currencyGroup)).append("\n");
    sb.append("    currencyBase: ").append(toIndentedString(currencyBase)).append("\n");
    sb.append("    currencyQuote: ").append(toIndentedString(currencyQuote)).append("\n");
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

    // add `currency_group` to the URL query string
    if (getCurrencyGroup() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency_group%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrencyGroup()))));
    }

    // add `currency_base` to the URL query string
    if (getCurrencyBase() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency_base%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrencyBase()))));
    }

    // add `currency_quote` to the URL query string
    if (getCurrencyQuote() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency_quote%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrencyQuote()))));
    }

    return joiner.toString();
  }
}

