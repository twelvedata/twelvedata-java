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
 * Json object with request general information
 */
@JsonPropertyOrder({
  CrossMeta.JSON_PROPERTY_BASE_INSTRUMENT,
  CrossMeta.JSON_PROPERTY_BASE_CURRENCY,
  CrossMeta.JSON_PROPERTY_BASE_EXCHANGE,
  CrossMeta.JSON_PROPERTY_INTERVAL,
  CrossMeta.JSON_PROPERTY_QUOTE_INSTRUMENT,
  CrossMeta.JSON_PROPERTY_QUOTE_CURRENCY,
  CrossMeta.JSON_PROPERTY_QUOTE_EXCHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CrossMeta {
  public static final String JSON_PROPERTY_BASE_INSTRUMENT = "base_instrument";
  @javax.annotation.Nonnull
  private String baseInstrument;

  public static final String JSON_PROPERTY_BASE_CURRENCY = "base_currency";
  @javax.annotation.Nonnull
  private String baseCurrency;

  public static final String JSON_PROPERTY_BASE_EXCHANGE = "base_exchange";
  @javax.annotation.Nonnull
  private String baseExchange;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nonnull
  private String interval;

  public static final String JSON_PROPERTY_QUOTE_INSTRUMENT = "quote_instrument";
  @javax.annotation.Nonnull
  private String quoteInstrument;

  public static final String JSON_PROPERTY_QUOTE_CURRENCY = "quote_currency";
  @javax.annotation.Nonnull
  private String quoteCurrency;

  public static final String JSON_PROPERTY_QUOTE_EXCHANGE = "quote_exchange";
  @javax.annotation.Nonnull
  private String quoteExchange;

  public CrossMeta() { 
  }

  public CrossMeta baseInstrument(@javax.annotation.Nonnull String baseInstrument) {
    this.baseInstrument = baseInstrument;
    return this;
  }

  /**
   * Base instrument symbol
   * @return baseInstrument
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_INSTRUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseInstrument() {
    return baseInstrument;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_INSTRUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseInstrument(@javax.annotation.Nonnull String baseInstrument) {
    this.baseInstrument = baseInstrument;
  }


  public CrossMeta baseCurrency(@javax.annotation.Nonnull String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Base currency
   * @return baseCurrency
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseCurrency() {
    return baseCurrency;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseCurrency(@javax.annotation.Nonnull String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public CrossMeta baseExchange(@javax.annotation.Nonnull String baseExchange) {
    this.baseExchange = baseExchange;
    return this;
  }

  /**
   * Base exchange
   * @return baseExchange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseExchange() {
    return baseExchange;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseExchange(@javax.annotation.Nonnull String baseExchange) {
    this.baseExchange = baseExchange;
  }


  public CrossMeta interval(@javax.annotation.Nonnull String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Interval between two consecutive points in time series
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


  public CrossMeta quoteInstrument(@javax.annotation.Nonnull String quoteInstrument) {
    this.quoteInstrument = quoteInstrument;
    return this;
  }

  /**
   * Quote instrument symbol
   * @return quoteInstrument
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_QUOTE_INSTRUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuoteInstrument() {
    return quoteInstrument;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTE_INSTRUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuoteInstrument(@javax.annotation.Nonnull String quoteInstrument) {
    this.quoteInstrument = quoteInstrument;
  }


  public CrossMeta quoteCurrency(@javax.annotation.Nonnull String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
    return this;
  }

  /**
   * Quote currency
   * @return quoteCurrency
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_QUOTE_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuoteCurrency() {
    return quoteCurrency;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTE_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuoteCurrency(@javax.annotation.Nonnull String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }


  public CrossMeta quoteExchange(@javax.annotation.Nonnull String quoteExchange) {
    this.quoteExchange = quoteExchange;
    return this;
  }

  /**
   * Quote exchange
   * @return quoteExchange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_QUOTE_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuoteExchange() {
    return quoteExchange;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTE_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuoteExchange(@javax.annotation.Nonnull String quoteExchange) {
    this.quoteExchange = quoteExchange;
  }


  /**
   * Return true if this CrossMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossMeta crossMeta = (CrossMeta) o;
    return Objects.equals(this.baseInstrument, crossMeta.baseInstrument) &&
        Objects.equals(this.baseCurrency, crossMeta.baseCurrency) &&
        Objects.equals(this.baseExchange, crossMeta.baseExchange) &&
        Objects.equals(this.interval, crossMeta.interval) &&
        Objects.equals(this.quoteInstrument, crossMeta.quoteInstrument) &&
        Objects.equals(this.quoteCurrency, crossMeta.quoteCurrency) &&
        Objects.equals(this.quoteExchange, crossMeta.quoteExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseInstrument, baseCurrency, baseExchange, interval, quoteInstrument, quoteCurrency, quoteExchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossMeta {\n");
    sb.append("    baseInstrument: ").append(toIndentedString(baseInstrument)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    baseExchange: ").append(toIndentedString(baseExchange)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    quoteInstrument: ").append(toIndentedString(quoteInstrument)).append("\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
    sb.append("    quoteExchange: ").append(toIndentedString(quoteExchange)).append("\n");
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

    // add `base_instrument` to the URL query string
    if (getBaseInstrument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbase_instrument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseInstrument()))));
    }

    // add `base_currency` to the URL query string
    if (getBaseCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbase_currency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseCurrency()))));
    }

    // add `base_exchange` to the URL query string
    if (getBaseExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbase_exchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseExchange()))));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterval()))));
    }

    // add `quote_instrument` to the URL query string
    if (getQuoteInstrument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squote_instrument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuoteInstrument()))));
    }

    // add `quote_currency` to the URL query string
    if (getQuoteCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squote_currency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuoteCurrency()))));
    }

    // add `quote_exchange` to the URL query string
    if (getQuoteExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squote_exchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuoteExchange()))));
    }

    return joiner.toString();
  }
}

