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
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_EARNINGS,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_EARNINGS_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_BOOK,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_BOOK_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_SALES,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_SALES_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_CASHFLOW,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_PRICE_TO_CASHFLOW_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_3YEAR_EARNINGS_GROWTH,
  GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.JSON_PROPERTY_3YEAR_EARNINGS_GROWTHS_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics {
  public static final String JSON_PROPERTY_PRICE_TO_EARNINGS = "price_to_earnings";
  @javax.annotation.Nullable
  private Double priceToEarnings;

  public static final String JSON_PROPERTY_PRICE_TO_EARNINGS_CATEGORY = "price_to_earnings_category";
  @javax.annotation.Nullable
  private Double priceToEarningsCategory;

  public static final String JSON_PROPERTY_PRICE_TO_BOOK = "price_to_book";
  @javax.annotation.Nullable
  private Double priceToBook;

  public static final String JSON_PROPERTY_PRICE_TO_BOOK_CATEGORY = "price_to_book_category";
  @javax.annotation.Nullable
  private Double priceToBookCategory;

  public static final String JSON_PROPERTY_PRICE_TO_SALES = "price_to_sales";
  @javax.annotation.Nullable
  private Double priceToSales;

  public static final String JSON_PROPERTY_PRICE_TO_SALES_CATEGORY = "price_to_sales_category";
  @javax.annotation.Nullable
  private Double priceToSalesCategory;

  public static final String JSON_PROPERTY_PRICE_TO_CASHFLOW = "price_to_cashflow";
  @javax.annotation.Nullable
  private Double priceToCashflow;

  public static final String JSON_PROPERTY_PRICE_TO_CASHFLOW_CATEGORY = "price_to_cashflow_category";
  @javax.annotation.Nullable
  private Double priceToCashflowCategory;

  public static final String JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION = "median_market_capitalization";
  @javax.annotation.Nullable
  private Long medianMarketCapitalization;

  public static final String JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION_CATEGORY = "median_market_capitalization_category";
  @javax.annotation.Nullable
  private Long medianMarketCapitalizationCategory;

  public static final String JSON_PROPERTY_3YEAR_EARNINGS_GROWTH = "3_year_earnings_growth";
  @javax.annotation.Nullable
  private Double _3yearEarningsGrowth;

  public static final String JSON_PROPERTY_3YEAR_EARNINGS_GROWTHS_CATEGORY = "3_year_earnings_growths_category";
  @javax.annotation.Nullable
  private Double _3yearEarningsGrowthsCategory;

  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToEarnings(@javax.annotation.Nullable Double priceToEarnings) {
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


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToEarningsCategory(@javax.annotation.Nullable Double priceToEarningsCategory) {
    this.priceToEarningsCategory = priceToEarningsCategory;
    return this;
  }

  /**
   * Average price to earnings metric of funds in the same category
   * @return priceToEarningsCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_EARNINGS_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToEarningsCategory() {
    return priceToEarningsCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_EARNINGS_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToEarningsCategory(@javax.annotation.Nullable Double priceToEarningsCategory) {
    this.priceToEarningsCategory = priceToEarningsCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToBook(@javax.annotation.Nullable Double priceToBook) {
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


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToBookCategory(@javax.annotation.Nullable Double priceToBookCategory) {
    this.priceToBookCategory = priceToBookCategory;
    return this;
  }

  /**
   * Average price to book metric of funds in the same category
   * @return priceToBookCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToBookCategory() {
    return priceToBookCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_BOOK_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToBookCategory(@javax.annotation.Nullable Double priceToBookCategory) {
    this.priceToBookCategory = priceToBookCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToSales(@javax.annotation.Nullable Double priceToSales) {
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


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToSalesCategory(@javax.annotation.Nullable Double priceToSalesCategory) {
    this.priceToSalesCategory = priceToSalesCategory;
    return this;
  }

  /**
   * Average price to sales metric of funds in the same category
   * @return priceToSalesCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToSalesCategory() {
    return priceToSalesCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_SALES_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToSalesCategory(@javax.annotation.Nullable Double priceToSalesCategory) {
    this.priceToSalesCategory = priceToSalesCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToCashflow(@javax.annotation.Nullable Double priceToCashflow) {
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


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics priceToCashflowCategory(@javax.annotation.Nullable Double priceToCashflowCategory) {
    this.priceToCashflowCategory = priceToCashflowCategory;
    return this;
  }

  /**
   * Average price to cashflow metric of funds in the same category
   * @return priceToCashflowCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_CASHFLOW_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceToCashflowCategory() {
    return priceToCashflowCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TO_CASHFLOW_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceToCashflowCategory(@javax.annotation.Nullable Double priceToCashflowCategory) {
    this.priceToCashflowCategory = priceToCashflowCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics medianMarketCapitalization(@javax.annotation.Nullable Long medianMarketCapitalization) {
    this.medianMarketCapitalization = medianMarketCapitalization;
    return this;
  }

  /**
   * Median market capitalization of a fund
   * @return medianMarketCapitalization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMedianMarketCapitalization() {
    return medianMarketCapitalization;
  }


  @JsonProperty(value = JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedianMarketCapitalization(@javax.annotation.Nullable Long medianMarketCapitalization) {
    this.medianMarketCapitalization = medianMarketCapitalization;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics medianMarketCapitalizationCategory(@javax.annotation.Nullable Long medianMarketCapitalizationCategory) {
    this.medianMarketCapitalizationCategory = medianMarketCapitalizationCategory;
    return this;
  }

  /**
   * Median market capitalization of funds in the same category
   * @return medianMarketCapitalizationCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMedianMarketCapitalizationCategory() {
    return medianMarketCapitalizationCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_MEDIAN_MARKET_CAPITALIZATION_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedianMarketCapitalizationCategory(@javax.annotation.Nullable Long medianMarketCapitalizationCategory) {
    this.medianMarketCapitalizationCategory = medianMarketCapitalizationCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics _3yearEarningsGrowth(@javax.annotation.Nullable Double _3yearEarningsGrowth) {
    this._3yearEarningsGrowth = _3yearEarningsGrowth;
    return this;
  }

  /**
   * Earnings growth over the last three years
   * @return _3yearEarningsGrowth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_3YEAR_EARNINGS_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get3yearEarningsGrowth() {
    return _3yearEarningsGrowth;
  }


  @JsonProperty(value = JSON_PROPERTY_3YEAR_EARNINGS_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set3yearEarningsGrowth(@javax.annotation.Nullable Double _3yearEarningsGrowth) {
    this._3yearEarningsGrowth = _3yearEarningsGrowth;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics _3yearEarningsGrowthsCategory(@javax.annotation.Nullable Double _3yearEarningsGrowthsCategory) {
    this._3yearEarningsGrowthsCategory = _3yearEarningsGrowthsCategory;
    return this;
  }

  /**
   * Earnings growth over the last three years of funds in the same category
   * @return _3yearEarningsGrowthsCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_3YEAR_EARNINGS_GROWTHS_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get3yearEarningsGrowthsCategory() {
    return _3yearEarningsGrowthsCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_3YEAR_EARNINGS_GROWTHS_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set3yearEarningsGrowthsCategory(@javax.annotation.Nullable Double _3yearEarningsGrowthsCategory) {
    this._3yearEarningsGrowthsCategory = _3yearEarningsGrowthsCategory;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_risk_valuation_metrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics = (GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics) o;
    return Objects.equals(this.priceToEarnings, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToEarnings) &&
        Objects.equals(this.priceToEarningsCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToEarningsCategory) &&
        Objects.equals(this.priceToBook, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToBook) &&
        Objects.equals(this.priceToBookCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToBookCategory) &&
        Objects.equals(this.priceToSales, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToSales) &&
        Objects.equals(this.priceToSalesCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToSalesCategory) &&
        Objects.equals(this.priceToCashflow, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToCashflow) &&
        Objects.equals(this.priceToCashflowCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.priceToCashflowCategory) &&
        Objects.equals(this.medianMarketCapitalization, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.medianMarketCapitalization) &&
        Objects.equals(this.medianMarketCapitalizationCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics.medianMarketCapitalizationCategory) &&
        Objects.equals(this._3yearEarningsGrowth, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics._3yearEarningsGrowth) &&
        Objects.equals(this._3yearEarningsGrowthsCategory, getMutualFundsWorld200ResponseMutualFundRiskValuationMetrics._3yearEarningsGrowthsCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceToEarnings, priceToEarningsCategory, priceToBook, priceToBookCategory, priceToSales, priceToSalesCategory, priceToCashflow, priceToCashflowCategory, medianMarketCapitalization, medianMarketCapitalizationCategory, _3yearEarningsGrowth, _3yearEarningsGrowthsCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics {\n");
    sb.append("    priceToEarnings: ").append(toIndentedString(priceToEarnings)).append("\n");
    sb.append("    priceToEarningsCategory: ").append(toIndentedString(priceToEarningsCategory)).append("\n");
    sb.append("    priceToBook: ").append(toIndentedString(priceToBook)).append("\n");
    sb.append("    priceToBookCategory: ").append(toIndentedString(priceToBookCategory)).append("\n");
    sb.append("    priceToSales: ").append(toIndentedString(priceToSales)).append("\n");
    sb.append("    priceToSalesCategory: ").append(toIndentedString(priceToSalesCategory)).append("\n");
    sb.append("    priceToCashflow: ").append(toIndentedString(priceToCashflow)).append("\n");
    sb.append("    priceToCashflowCategory: ").append(toIndentedString(priceToCashflowCategory)).append("\n");
    sb.append("    medianMarketCapitalization: ").append(toIndentedString(medianMarketCapitalization)).append("\n");
    sb.append("    medianMarketCapitalizationCategory: ").append(toIndentedString(medianMarketCapitalizationCategory)).append("\n");
    sb.append("    _3yearEarningsGrowth: ").append(toIndentedString(_3yearEarningsGrowth)).append("\n");
    sb.append("    _3yearEarningsGrowthsCategory: ").append(toIndentedString(_3yearEarningsGrowthsCategory)).append("\n");
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

    // add `price_to_earnings_category` to the URL query string
    if (getPriceToEarningsCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_earnings_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToEarningsCategory()))));
    }

    // add `price_to_book` to the URL query string
    if (getPriceToBook() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_book%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToBook()))));
    }

    // add `price_to_book_category` to the URL query string
    if (getPriceToBookCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_book_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToBookCategory()))));
    }

    // add `price_to_sales` to the URL query string
    if (getPriceToSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_sales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToSales()))));
    }

    // add `price_to_sales_category` to the URL query string
    if (getPriceToSalesCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_sales_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToSalesCategory()))));
    }

    // add `price_to_cashflow` to the URL query string
    if (getPriceToCashflow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_cashflow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToCashflow()))));
    }

    // add `price_to_cashflow_category` to the URL query string
    if (getPriceToCashflowCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_to_cashflow_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceToCashflowCategory()))));
    }

    // add `median_market_capitalization` to the URL query string
    if (getMedianMarketCapitalization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smedian_market_capitalization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMedianMarketCapitalization()))));
    }

    // add `median_market_capitalization_category` to the URL query string
    if (getMedianMarketCapitalizationCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smedian_market_capitalization_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMedianMarketCapitalizationCategory()))));
    }

    // add `3_year_earnings_growth` to the URL query string
    if (get3yearEarningsGrowth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s3_year_earnings_growth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get3yearEarningsGrowth()))));
    }

    // add `3_year_earnings_growths_category` to the URL query string
    if (get3yearEarningsGrowthsCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s3_year_earnings_growths_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get3yearEarningsGrowthsCategory()))));
    }

    return joiner.toString();
  }
}

