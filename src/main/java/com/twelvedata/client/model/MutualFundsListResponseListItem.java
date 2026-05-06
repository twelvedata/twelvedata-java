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
 * MutualFundsListResponseListItem
 */
@JsonPropertyOrder({
  MutualFundsListResponseListItem.JSON_PROPERTY_SYMBOL,
  MutualFundsListResponseListItem.JSON_PROPERTY_NAME,
  MutualFundsListResponseListItem.JSON_PROPERTY_COUNTRY,
  MutualFundsListResponseListItem.JSON_PROPERTY_FUND_FAMILY,
  MutualFundsListResponseListItem.JSON_PROPERTY_FUND_TYPE,
  MutualFundsListResponseListItem.JSON_PROPERTY_PERFORMANCE_RATING,
  MutualFundsListResponseListItem.JSON_PROPERTY_RISK_RATING,
  MutualFundsListResponseListItem.JSON_PROPERTY_CURRENCY,
  MutualFundsListResponseListItem.JSON_PROPERTY_EXCHANGE,
  MutualFundsListResponseListItem.JSON_PROPERTY_MIC_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class MutualFundsListResponseListItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_FUND_FAMILY = "fund_family";
  @javax.annotation.Nonnull
  private String fundFamily;

  public static final String JSON_PROPERTY_FUND_TYPE = "fund_type";
  @javax.annotation.Nonnull
  private String fundType;

  public static final String JSON_PROPERTY_PERFORMANCE_RATING = "performance_rating";
  @javax.annotation.Nullable
  private Long performanceRating;

  public static final String JSON_PROPERTY_RISK_RATING = "risk_rating";
  @javax.annotation.Nullable
  private Long riskRating;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public MutualFundsListResponseListItem() { 
  }

  public MutualFundsListResponseListItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Fund symbol ticker
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


  public MutualFundsListResponseListItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Fund name
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


  public MutualFundsListResponseListItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of fund incorporation
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


  public MutualFundsListResponseListItem fundFamily(@javax.annotation.Nonnull String fundFamily) {
    this.fundFamily = fundFamily;
    return this;
  }

  /**
   * Investment company that manages the fund
   * @return fundFamily
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFundFamily() {
    return fundFamily;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundFamily(@javax.annotation.Nonnull String fundFamily) {
    this.fundFamily = fundFamily;
  }


  public MutualFundsListResponseListItem fundType(@javax.annotation.Nonnull String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Type of fund
   * @return fundType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFundType() {
    return fundType;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundType(@javax.annotation.Nonnull String fundType) {
    this.fundType = fundType;
  }


  public MutualFundsListResponseListItem performanceRating(@javax.annotation.Nullable Long performanceRating) {
    this.performanceRating = performanceRating;
    return this;
  }

  /**
   * Performance rating from &#x60;0&#x60; to &#x60;5&#x60;
   * @return performanceRating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPerformanceRating() {
    return performanceRating;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformanceRating(@javax.annotation.Nullable Long performanceRating) {
    this.performanceRating = performanceRating;
  }


  public MutualFundsListResponseListItem riskRating(@javax.annotation.Nullable Long riskRating) {
    this.riskRating = riskRating;
    return this;
  }

  /**
   * Risk rating from &#x60;0&#x60; to &#x60;5&#x60;
   * @return riskRating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RISK_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRiskRating() {
    return riskRating;
  }


  @JsonProperty(value = JSON_PROPERTY_RISK_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskRating(@javax.annotation.Nullable Long riskRating) {
    this.riskRating = riskRating;
  }


  public MutualFundsListResponseListItem currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code in which the fund is denominated
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


  public MutualFundsListResponseListItem exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange name where the fund is listed
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


  public MutualFundsListResponseListItem micCode(@javax.annotation.Nonnull String micCode) {
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


  /**
   * Return true if this MutualFundsListResponseListItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFundsListResponseListItem mutualFundsListResponseListItem = (MutualFundsListResponseListItem) o;
    return Objects.equals(this.symbol, mutualFundsListResponseListItem.symbol) &&
        Objects.equals(this.name, mutualFundsListResponseListItem.name) &&
        Objects.equals(this.country, mutualFundsListResponseListItem.country) &&
        Objects.equals(this.fundFamily, mutualFundsListResponseListItem.fundFamily) &&
        Objects.equals(this.fundType, mutualFundsListResponseListItem.fundType) &&
        Objects.equals(this.performanceRating, mutualFundsListResponseListItem.performanceRating) &&
        Objects.equals(this.riskRating, mutualFundsListResponseListItem.riskRating) &&
        Objects.equals(this.currency, mutualFundsListResponseListItem.currency) &&
        Objects.equals(this.exchange, mutualFundsListResponseListItem.exchange) &&
        Objects.equals(this.micCode, mutualFundsListResponseListItem.micCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, country, fundFamily, fundType, performanceRating, riskRating, currency, exchange, micCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFundsListResponseListItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fundFamily: ").append(toIndentedString(fundFamily)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    performanceRating: ").append(toIndentedString(performanceRating)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `fund_family` to the URL query string
    if (getFundFamily() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_family%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundFamily()))));
    }

    // add `fund_type` to the URL query string
    if (getFundType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundType()))));
    }

    // add `performance_rating` to the URL query string
    if (getPerformanceRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sperformance_rating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPerformanceRating()))));
    }

    // add `risk_rating` to the URL query string
    if (getRiskRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srisk_rating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRiskRating()))));
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

    return joiner.toString();
  }
}

