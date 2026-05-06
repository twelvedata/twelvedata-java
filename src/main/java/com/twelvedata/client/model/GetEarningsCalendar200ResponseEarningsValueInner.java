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
 * GetEarningsCalendar200ResponseEarningsValueInner
 */
@JsonPropertyOrder({
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_SYMBOL,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_NAME,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_CURRENCY,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_EXCHANGE,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_MIC_CODE,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_COUNTRY,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_TIME,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_EPS_ESTIMATE,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_EPS_ACTUAL,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_DIFFERENCE,
  GetEarningsCalendar200ResponseEarningsValueInner.JSON_PROPERTY_SURPRISE_PRC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEarningsCalendar200ResponseEarningsValueInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nullable
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nullable
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nullable
  private String micCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable
  private String country;

  public static final String JSON_PROPERTY_TIME = "time";
  @javax.annotation.Nullable
  private String time;

  public static final String JSON_PROPERTY_EPS_ESTIMATE = "eps_estimate";
  @javax.annotation.Nullable
  private Double epsEstimate;

  public static final String JSON_PROPERTY_EPS_ACTUAL = "eps_actual";
  @javax.annotation.Nullable
  private Double epsActual;

  public static final String JSON_PROPERTY_DIFFERENCE = "difference";
  @javax.annotation.Nullable
  private Double difference;

  public static final String JSON_PROPERTY_SURPRISE_PRC = "surprise_prc";
  @javax.annotation.Nullable
  private Double surprisePrc;

  public GetEarningsCalendar200ResponseEarningsValueInner() { 
  }

  public GetEarningsCalendar200ResponseEarningsValueInner symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Instrument symbol (ticker)
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


  public GetEarningsCalendar200ResponseEarningsValueInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of instrument
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


  public GetEarningsCalendar200ResponseEarningsValueInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency in which instrument is traded by ISO 4217 standard
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


  public GetEarningsCalendar200ResponseEarningsValueInner exchange(@javax.annotation.Nullable String exchange) {
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


  public GetEarningsCalendar200ResponseEarningsValueInner micCode(@javax.annotation.Nullable String micCode) {
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


  public GetEarningsCalendar200ResponseEarningsValueInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where exchange is located
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetEarningsCalendar200ResponseEarningsValueInner time(@javax.annotation.Nullable String time) {
    this.time = time;
    return this;
  }

  /**
   * Can be either of the following values: &#x60;Pre Market&#x60;, &#x60;After Hours&#x60;, &#x60;Time Not Supplied&#x60;
   * @return time
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTime() {
    return time;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(@javax.annotation.Nullable String time) {
    this.time = time;
  }


  public GetEarningsCalendar200ResponseEarningsValueInner epsEstimate(@javax.annotation.Nullable Double epsEstimate) {
    this.epsEstimate = epsEstimate;
    return this;
  }

  /**
   * Analyst estimate of the future company earning
   * @return epsEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsEstimate() {
    return epsEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsEstimate(@javax.annotation.Nullable Double epsEstimate) {
    this.epsEstimate = epsEstimate;
  }


  public GetEarningsCalendar200ResponseEarningsValueInner epsActual(@javax.annotation.Nullable Double epsActual) {
    this.epsActual = epsActual;
    return this;
  }

  /**
   * Actual value of reported earning
   * @return epsActual
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_ACTUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsActual() {
    return epsActual;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_ACTUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsActual(@javax.annotation.Nullable Double epsActual) {
    this.epsActual = epsActual;
  }


  public GetEarningsCalendar200ResponseEarningsValueInner difference(@javax.annotation.Nullable Double difference) {
    this.difference = difference;
    return this;
  }

  /**
   * Delta between &#x60;eps_actual&#x60; and &#x60;eps_estimate&#x60;
   * @return difference
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIFFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDifference() {
    return difference;
  }


  @JsonProperty(value = JSON_PROPERTY_DIFFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDifference(@javax.annotation.Nullable Double difference) {
    this.difference = difference;
  }


  public GetEarningsCalendar200ResponseEarningsValueInner surprisePrc(@javax.annotation.Nullable Double surprisePrc) {
    this.surprisePrc = surprisePrc;
    return this;
  }

  /**
   * Surprise in percentage of the &#x60;eps_actual&#x60; related to &#x60;eps_estimate&#x60;
   * @return surprisePrc
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SURPRISE_PRC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSurprisePrc() {
    return surprisePrc;
  }


  @JsonProperty(value = JSON_PROPERTY_SURPRISE_PRC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurprisePrc(@javax.annotation.Nullable Double surprisePrc) {
    this.surprisePrc = surprisePrc;
  }


  /**
   * Return true if this GetEarningsCalendar_200_response_earnings_value_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEarningsCalendar200ResponseEarningsValueInner getEarningsCalendar200ResponseEarningsValueInner = (GetEarningsCalendar200ResponseEarningsValueInner) o;
    return Objects.equals(this.symbol, getEarningsCalendar200ResponseEarningsValueInner.symbol) &&
        Objects.equals(this.name, getEarningsCalendar200ResponseEarningsValueInner.name) &&
        Objects.equals(this.currency, getEarningsCalendar200ResponseEarningsValueInner.currency) &&
        Objects.equals(this.exchange, getEarningsCalendar200ResponseEarningsValueInner.exchange) &&
        Objects.equals(this.micCode, getEarningsCalendar200ResponseEarningsValueInner.micCode) &&
        Objects.equals(this.country, getEarningsCalendar200ResponseEarningsValueInner.country) &&
        Objects.equals(this.time, getEarningsCalendar200ResponseEarningsValueInner.time) &&
        Objects.equals(this.epsEstimate, getEarningsCalendar200ResponseEarningsValueInner.epsEstimate) &&
        Objects.equals(this.epsActual, getEarningsCalendar200ResponseEarningsValueInner.epsActual) &&
        Objects.equals(this.difference, getEarningsCalendar200ResponseEarningsValueInner.difference) &&
        Objects.equals(this.surprisePrc, getEarningsCalendar200ResponseEarningsValueInner.surprisePrc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, currency, exchange, micCode, country, time, epsEstimate, epsActual, difference, surprisePrc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEarningsCalendar200ResponseEarningsValueInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    epsEstimate: ").append(toIndentedString(epsEstimate)).append("\n");
    sb.append("    epsActual: ").append(toIndentedString(epsActual)).append("\n");
    sb.append("    difference: ").append(toIndentedString(difference)).append("\n");
    sb.append("    surprisePrc: ").append(toIndentedString(surprisePrc)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTime()))));
    }

    // add `eps_estimate` to the URL query string
    if (getEpsEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsEstimate()))));
    }

    // add `eps_actual` to the URL query string
    if (getEpsActual() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_actual%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsActual()))));
    }

    // add `difference` to the URL query string
    if (getDifference() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdifference%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDifference()))));
    }

    // add `surprise_prc` to the URL query string
    if (getSurprisePrc() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssurprise_prc%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSurprisePrc()))));
    }

    return joiner.toString();
  }
}

