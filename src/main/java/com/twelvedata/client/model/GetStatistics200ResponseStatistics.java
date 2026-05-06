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
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsDividendsAndSplits;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsFinancials;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsStockPriceSummary;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsStockStatistics;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsValuationsMetrics;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Statistics of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatistics.JSON_PROPERTY_VALUATIONS_METRICS,
  GetStatistics200ResponseStatistics.JSON_PROPERTY_FINANCIALS,
  GetStatistics200ResponseStatistics.JSON_PROPERTY_STOCK_STATISTICS,
  GetStatistics200ResponseStatistics.JSON_PROPERTY_STOCK_PRICE_SUMMARY,
  GetStatistics200ResponseStatistics.JSON_PROPERTY_DIVIDENDS_AND_SPLITS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatistics {
  public static final String JSON_PROPERTY_VALUATIONS_METRICS = "valuations_metrics";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsValuationsMetrics valuationsMetrics;

  public static final String JSON_PROPERTY_FINANCIALS = "financials";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsFinancials financials;

  public static final String JSON_PROPERTY_STOCK_STATISTICS = "stock_statistics";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsStockStatistics stockStatistics;

  public static final String JSON_PROPERTY_STOCK_PRICE_SUMMARY = "stock_price_summary";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsStockPriceSummary stockPriceSummary;

  public static final String JSON_PROPERTY_DIVIDENDS_AND_SPLITS = "dividends_and_splits";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsDividendsAndSplits dividendsAndSplits;

  public GetStatistics200ResponseStatistics() { 
  }

  public GetStatistics200ResponseStatistics valuationsMetrics(@javax.annotation.Nullable GetStatistics200ResponseStatisticsValuationsMetrics valuationsMetrics) {
    this.valuationsMetrics = valuationsMetrics;
    return this;
  }

  /**
   * Get valuationsMetrics
   * @return valuationsMetrics
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUATIONS_METRICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsValuationsMetrics getValuationsMetrics() {
    return valuationsMetrics;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUATIONS_METRICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValuationsMetrics(@javax.annotation.Nullable GetStatistics200ResponseStatisticsValuationsMetrics valuationsMetrics) {
    this.valuationsMetrics = valuationsMetrics;
  }


  public GetStatistics200ResponseStatistics financials(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancials financials) {
    this.financials = financials;
    return this;
  }

  /**
   * Get financials
   * @return financials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsFinancials getFinancials() {
    return financials;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancials(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancials financials) {
    this.financials = financials;
  }


  public GetStatistics200ResponseStatistics stockStatistics(@javax.annotation.Nullable GetStatistics200ResponseStatisticsStockStatistics stockStatistics) {
    this.stockStatistics = stockStatistics;
    return this;
  }

  /**
   * Get stockStatistics
   * @return stockStatistics
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STOCK_STATISTICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsStockStatistics getStockStatistics() {
    return stockStatistics;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCK_STATISTICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockStatistics(@javax.annotation.Nullable GetStatistics200ResponseStatisticsStockStatistics stockStatistics) {
    this.stockStatistics = stockStatistics;
  }


  public GetStatistics200ResponseStatistics stockPriceSummary(@javax.annotation.Nullable GetStatistics200ResponseStatisticsStockPriceSummary stockPriceSummary) {
    this.stockPriceSummary = stockPriceSummary;
    return this;
  }

  /**
   * Get stockPriceSummary
   * @return stockPriceSummary
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STOCK_PRICE_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsStockPriceSummary getStockPriceSummary() {
    return stockPriceSummary;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCK_PRICE_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockPriceSummary(@javax.annotation.Nullable GetStatistics200ResponseStatisticsStockPriceSummary stockPriceSummary) {
    this.stockPriceSummary = stockPriceSummary;
  }


  public GetStatistics200ResponseStatistics dividendsAndSplits(@javax.annotation.Nullable GetStatistics200ResponseStatisticsDividendsAndSplits dividendsAndSplits) {
    this.dividendsAndSplits = dividendsAndSplits;
    return this;
  }

  /**
   * Get dividendsAndSplits
   * @return dividendsAndSplits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_AND_SPLITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsDividendsAndSplits getDividendsAndSplits() {
    return dividendsAndSplits;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_AND_SPLITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendsAndSplits(@javax.annotation.Nullable GetStatistics200ResponseStatisticsDividendsAndSplits dividendsAndSplits) {
    this.dividendsAndSplits = dividendsAndSplits;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatistics getStatistics200ResponseStatistics = (GetStatistics200ResponseStatistics) o;
    return Objects.equals(this.valuationsMetrics, getStatistics200ResponseStatistics.valuationsMetrics) &&
        Objects.equals(this.financials, getStatistics200ResponseStatistics.financials) &&
        Objects.equals(this.stockStatistics, getStatistics200ResponseStatistics.stockStatistics) &&
        Objects.equals(this.stockPriceSummary, getStatistics200ResponseStatistics.stockPriceSummary) &&
        Objects.equals(this.dividendsAndSplits, getStatistics200ResponseStatistics.dividendsAndSplits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valuationsMetrics, financials, stockStatistics, stockPriceSummary, dividendsAndSplits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatistics {\n");
    sb.append("    valuationsMetrics: ").append(toIndentedString(valuationsMetrics)).append("\n");
    sb.append("    financials: ").append(toIndentedString(financials)).append("\n");
    sb.append("    stockStatistics: ").append(toIndentedString(stockStatistics)).append("\n");
    sb.append("    stockPriceSummary: ").append(toIndentedString(stockPriceSummary)).append("\n");
    sb.append("    dividendsAndSplits: ").append(toIndentedString(dividendsAndSplits)).append("\n");
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

    // add `valuations_metrics` to the URL query string
    if (getValuationsMetrics() != null) {
      joiner.add(getValuationsMetrics().toUrlQueryString(prefix + "valuations_metrics" + suffix));
    }

    // add `financials` to the URL query string
    if (getFinancials() != null) {
      joiner.add(getFinancials().toUrlQueryString(prefix + "financials" + suffix));
    }

    // add `stock_statistics` to the URL query string
    if (getStockStatistics() != null) {
      joiner.add(getStockStatistics().toUrlQueryString(prefix + "stock_statistics" + suffix));
    }

    // add `stock_price_summary` to the URL query string
    if (getStockPriceSummary() != null) {
      joiner.add(getStockPriceSummary().toUrlQueryString(prefix + "stock_price_summary" + suffix));
    }

    // add `dividends_and_splits` to the URL query string
    if (getDividendsAndSplits() != null) {
      joiner.add(getDividendsAndSplits().toUrlQueryString(prefix + "dividends_and_splits" + suffix));
    }

    return joiner.toString();
  }
}

