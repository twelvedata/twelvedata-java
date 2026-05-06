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
 * Valuation metrics of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_MARKET_CAPITALIZATION,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_ENTERPRISE_VALUE,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_TRAILING_PE,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_FORWARD_PE,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_PEG_RATIO,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_PRICE_TO_SALES_TTM,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_PRICE_TO_BOOK_MRQ,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_ENTERPRISE_TO_REVENUE,
  GetStatistics200ResponseStatisticsValuationsMetrics.JSON_PROPERTY_ENTERPRISE_TO_EBITDA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsValuationsMetrics {
  public static final String JSON_PROPERTY_MARKET_CAPITALIZATION = "market_capitalization";
  @javax.annotation.Nullable
  private Double marketCapitalization;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE = "enterprise_value";
  @javax.annotation.Nullable
  private Double enterpriseValue;

  public static final String JSON_PROPERTY_TRAILING_PE = "trailing_pe";
  @javax.annotation.Nullable
  private Double trailingPe;

  public static final String JSON_PROPERTY_FORWARD_PE = "forward_pe";
  @javax.annotation.Nullable
  private Double forwardPe;

  public static final String JSON_PROPERTY_PEG_RATIO = "peg_ratio";
  @javax.annotation.Nullable
  private Double pegRatio;

  public static final String JSON_PROPERTY_PRICE_TO_SALES_TTM = "price_to_sales_ttm";
  @javax.annotation.Nullable
  private Double priceToSalesTtm;

  public static final String JSON_PROPERTY_PRICE_TO_BOOK_MRQ = "price_to_book_mrq";
  @javax.annotation.Nullable
  private Double priceToBookMrq;

  public static final String JSON_PROPERTY_ENTERPRISE_TO_REVENUE = "enterprise_to_revenue";
  @javax.annotation.Nullable
  private Double enterpriseToRevenue;

  public static final String JSON_PROPERTY_ENTERPRISE_TO_EBITDA = "enterprise_to_ebitda";
  @javax.annotation.Nullable
  private Double enterpriseToEbitda;

  public GetStatistics200ResponseStatisticsValuationsMetrics() { 
  }

  public GetStatistics200ResponseStatisticsValuationsMetrics marketCapitalization(@javax.annotation.Nullable Double marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
    return this;
  }

  /**
   * Refers to the market value of the company&#39;s outstanding shares
   * @return marketCapitalization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MARKET_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMarketCapitalization() {
    return marketCapitalization;
  }


  @JsonProperty(value = JSON_PROPERTY_MARKET_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketCapitalization(@javax.annotation.Nullable Double marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics enterpriseValue(@javax.annotation.Nullable Double enterpriseValue) {
    this.enterpriseValue = enterpriseValue;
    return this;
  }

  /**
   * Refers to enterprise value (EV) of the company, often used as a more comprehensive alternative to market capitalization
   * @return enterpriseValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEnterpriseValue() {
    return enterpriseValue;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValue(@javax.annotation.Nullable Double enterpriseValue) {
    this.enterpriseValue = enterpriseValue;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics trailingPe(@javax.annotation.Nullable Double trailingPe) {
    this.trailingPe = trailingPe;
    return this;
  }

  /**
   * Refers to the trailing price-to-earnings (P/E). It is calculated by taking the current stock price and dividing it by the trailing earnings per share (EPS) for the past 12 months
   * @return trailingPe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAILING_PE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTrailingPe() {
    return trailingPe;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAILING_PE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrailingPe(@javax.annotation.Nullable Double trailingPe) {
    this.trailingPe = trailingPe;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics forwardPe(@javax.annotation.Nullable Double forwardPe) {
    this.forwardPe = forwardPe;
    return this;
  }

  /**
   * Refers to the forward price-to-earnings ratio. It is calculated by dividing the current share price by the estimated future earnings per share
   * @return forwardPe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FORWARD_PE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getForwardPe() {
    return forwardPe;
  }


  @JsonProperty(value = JSON_PROPERTY_FORWARD_PE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardPe(@javax.annotation.Nullable Double forwardPe) {
    this.forwardPe = forwardPe;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics pegRatio(@javax.annotation.Nullable Double pegRatio) {
    this.pegRatio = pegRatio;
    return this;
  }

  /**
   * The price/earnings to growth (PEG) ratio is a price-to-earnings ratio divided by the growth rate of the earnings
   * @return pegRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PEG_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPegRatio() {
    return pegRatio;
  }


  @JsonProperty(value = JSON_PROPERTY_PEG_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPegRatio(@javax.annotation.Nullable Double pegRatio) {
    this.pegRatio = pegRatio;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics priceToSalesTtm(@javax.annotation.Nullable Double priceToSalesTtm) {
    this.priceToSalesTtm = priceToSalesTtm;
    return this;
  }

  /**
   * The price-to-sales (P/S) ratio is a valuation ratio that compares the market capitalization to its revenues over the last 12 months
   * @return priceToSalesTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToSalesTtm() {
    return priceToSalesTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToSalesTtm(@javax.annotation.Nullable Double priceToSalesTtm) {
    this.priceToSalesTtm = priceToSalesTtm;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics priceToBookMrq(@javax.annotation.Nullable Double priceToBookMrq) {
    this.priceToBookMrq = priceToBookMrq;
    return this;
  }

  /**
   * The price-to-book (P/B) ratio is equal to the current share price divided by the book value of all shares (BVPS) over the last quarter
   * @return priceToBookMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToBookMrq() {
    return priceToBookMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToBookMrq(@javax.annotation.Nullable Double priceToBookMrq) {
    this.priceToBookMrq = priceToBookMrq;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics enterpriseToRevenue(@javax.annotation.Nullable Double enterpriseToRevenue) {
    this.enterpriseToRevenue = enterpriseToRevenue;
    return this;
  }

  /**
   * The enterprise value-to-revenue multiple (EV/R) is a measure that compares enterprise value to revenue
   * @return enterpriseToRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_TO_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEnterpriseToRevenue() {
    return enterpriseToRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_TO_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseToRevenue(@javax.annotation.Nullable Double enterpriseToRevenue) {
    this.enterpriseToRevenue = enterpriseToRevenue;
  }


  public GetStatistics200ResponseStatisticsValuationsMetrics enterpriseToEbitda(@javax.annotation.Nullable Double enterpriseToEbitda) {
    this.enterpriseToEbitda = enterpriseToEbitda;
    return this;
  }

  /**
   * The enterprise value-to-ebitda multiple (EV/EBITDA) is a measure that compares enterprise value to EBITDA
   * @return enterpriseToEbitda
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_TO_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEnterpriseToEbitda() {
    return enterpriseToEbitda;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE_TO_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseToEbitda(@javax.annotation.Nullable Double enterpriseToEbitda) {
    this.enterpriseToEbitda = enterpriseToEbitda;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_valuations_metrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsValuationsMetrics getStatistics200ResponseStatisticsValuationsMetrics = (GetStatistics200ResponseStatisticsValuationsMetrics) o;
    return Objects.equals(this.marketCapitalization, getStatistics200ResponseStatisticsValuationsMetrics.marketCapitalization) &&
        Objects.equals(this.enterpriseValue, getStatistics200ResponseStatisticsValuationsMetrics.enterpriseValue) &&
        Objects.equals(this.trailingPe, getStatistics200ResponseStatisticsValuationsMetrics.trailingPe) &&
        Objects.equals(this.forwardPe, getStatistics200ResponseStatisticsValuationsMetrics.forwardPe) &&
        Objects.equals(this.pegRatio, getStatistics200ResponseStatisticsValuationsMetrics.pegRatio) &&
        Objects.equals(this.priceToSalesTtm, getStatistics200ResponseStatisticsValuationsMetrics.priceToSalesTtm) &&
        Objects.equals(this.priceToBookMrq, getStatistics200ResponseStatisticsValuationsMetrics.priceToBookMrq) &&
        Objects.equals(this.enterpriseToRevenue, getStatistics200ResponseStatisticsValuationsMetrics.enterpriseToRevenue) &&
        Objects.equals(this.enterpriseToEbitda, getStatistics200ResponseStatisticsValuationsMetrics.enterpriseToEbitda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketCapitalization, enterpriseValue, trailingPe, forwardPe, pegRatio, priceToSalesTtm, priceToBookMrq, enterpriseToRevenue, enterpriseToEbitda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsValuationsMetrics {\n");
    sb.append("    marketCapitalization: ").append(toIndentedString(marketCapitalization)).append("\n");
    sb.append("    enterpriseValue: ").append(toIndentedString(enterpriseValue)).append("\n");
    sb.append("    trailingPe: ").append(toIndentedString(trailingPe)).append("\n");
    sb.append("    forwardPe: ").append(toIndentedString(forwardPe)).append("\n");
    sb.append("    pegRatio: ").append(toIndentedString(pegRatio)).append("\n");
    sb.append("    priceToSalesTtm: ").append(toIndentedString(priceToSalesTtm)).append("\n");
    sb.append("    priceToBookMrq: ").append(toIndentedString(priceToBookMrq)).append("\n");
    sb.append("    enterpriseToRevenue: ").append(toIndentedString(enterpriseToRevenue)).append("\n");
    sb.append("    enterpriseToEbitda: ").append(toIndentedString(enterpriseToEbitda)).append("\n");
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

    // add `market_capitalization` to the URL query string
    if (getMarketCapitalization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smarket_capitalization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMarketCapitalization()))));
    }

    // add `enterprise_value` to the URL query string
    if (getEnterpriseValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senterprise_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnterpriseValue()))));
    }

    // add `trailing_pe` to the URL query string
    if (getTrailingPe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strailing_pe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrailingPe()))));
    }

    // add `forward_pe` to the URL query string
    if (getForwardPe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforward_pe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForwardPe()))));
    }

    // add `peg_ratio` to the URL query string
    if (getPegRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speg_ratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPegRatio()))));
    }

    // add `price_to_sales_ttm` to the URL query string
    if (getPriceToSalesTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_sales_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToSalesTtm()))));
    }

    // add `price_to_book_mrq` to the URL query string
    if (getPriceToBookMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_book_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToBookMrq()))));
    }

    // add `enterprise_to_revenue` to the URL query string
    if (getEnterpriseToRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senterprise_to_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnterpriseToRevenue()))));
    }

    // add `enterprise_to_ebitda` to the URL query string
    if (getEnterpriseToEbitda() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senterprise_to_ebitda%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnterpriseToEbitda()))));
    }

    return joiner.toString();
  }
}

