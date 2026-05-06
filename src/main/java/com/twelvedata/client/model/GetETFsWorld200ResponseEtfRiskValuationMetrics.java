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
 * Valuation ratios and metrics of the fund and its category
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_EARNINGS,
  GetETFsWorld200ResponseEtfRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_BOOK,
  GetETFsWorld200ResponseEtfRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_SALES,
  GetETFsWorld200ResponseEtfRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_CASHFLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfRiskValuationMetrics {
  public static final String JSON_PROPERTY_PRICE_TO_EARNINGS = "price_to_earnings";
  @javax.annotation.Nullable
  private Double priceToEarnings;

  public static final String JSON_PROPERTY_PRICE_TO_BOOK = "price_to_book";
  @javax.annotation.Nullable
  private Double priceToBook;

  public static final String JSON_PROPERTY_PRICE_TO_SALES = "price_to_sales";
  @javax.annotation.Nullable
  private Double priceToSales;

  public static final String JSON_PROPERTY_PRICE_TO_CASHFLOW = "price_to_cashflow";
  @javax.annotation.Nullable
  private Double priceToCashflow;

  public GetETFsWorld200ResponseEtfRiskValuationMetrics() { 
  }

  public GetETFsWorld200ResponseEtfRiskValuationMetrics priceToEarnings(@javax.annotation.Nullable Double priceToEarnings) {
    this.priceToEarnings = priceToEarnings;
    return this;
  }

  /**
   * Fund price to earnings metric
   * @return priceToEarnings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToEarnings() {
    return priceToEarnings;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToEarnings(@javax.annotation.Nullable Double priceToEarnings) {
    this.priceToEarnings = priceToEarnings;
  }


  public GetETFsWorld200ResponseEtfRiskValuationMetrics priceToBook(@javax.annotation.Nullable Double priceToBook) {
    this.priceToBook = priceToBook;
    return this;
  }

  /**
   * Fund price to book metric
   * @return priceToBook
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToBook() {
    return priceToBook;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToBook(@javax.annotation.Nullable Double priceToBook) {
    this.priceToBook = priceToBook;
  }


  public GetETFsWorld200ResponseEtfRiskValuationMetrics priceToSales(@javax.annotation.Nullable Double priceToSales) {
    this.priceToSales = priceToSales;
    return this;
  }

  /**
   * Fund price to sales metric
   * @return priceToSales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToSales() {
    return priceToSales;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToSales(@javax.annotation.Nullable Double priceToSales) {
    this.priceToSales = priceToSales;
  }


  public GetETFsWorld200ResponseEtfRiskValuationMetrics priceToCashflow(@javax.annotation.Nullable Double priceToCashflow) {
    this.priceToCashflow = priceToCashflow;
    return this;
  }

  /**
   * Fund price to cashflow metric
   * @return priceToCashflow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_CASHFLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToCashflow() {
    return priceToCashflow;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_CASHFLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToCashflow(@javax.annotation.Nullable Double priceToCashflow) {
    this.priceToCashflow = priceToCashflow;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_risk_valuation_metrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfRiskValuationMetrics getETFsWorld200ResponseEtfRiskValuationMetrics = (GetETFsWorld200ResponseEtfRiskValuationMetrics) o;
    return Objects.equals(this.priceToEarnings, getETFsWorld200ResponseEtfRiskValuationMetrics.priceToEarnings) &&
        Objects.equals(this.priceToBook, getETFsWorld200ResponseEtfRiskValuationMetrics.priceToBook) &&
        Objects.equals(this.priceToSales, getETFsWorld200ResponseEtfRiskValuationMetrics.priceToSales) &&
        Objects.equals(this.priceToCashflow, getETFsWorld200ResponseEtfRiskValuationMetrics.priceToCashflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceToEarnings, priceToBook, priceToSales, priceToCashflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfRiskValuationMetrics {\n");
    sb.append("    priceToEarnings: ").append(toIndentedString(priceToEarnings)).append("\n");
    sb.append("    priceToBook: ").append(toIndentedString(priceToBook)).append("\n");
    sb.append("    priceToSales: ").append(toIndentedString(priceToSales)).append("\n");
    sb.append("    priceToCashflow: ").append(toIndentedString(priceToCashflow)).append("\n");
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

    // add `price_to_earnings` to the URL query string
    if (getPriceToEarnings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_earnings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToEarnings()))));
    }

    // add `price_to_book` to the URL query string
    if (getPriceToBook() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_book%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToBook()))));
    }

    // add `price_to_sales` to the URL query string
    if (getPriceToSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_sales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToSales()))));
    }

    // add `price_to_cashflow` to the URL query string
    if (getPriceToCashflow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_cashflow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToCashflow()))));
    }

    return joiner.toString();
  }
}

