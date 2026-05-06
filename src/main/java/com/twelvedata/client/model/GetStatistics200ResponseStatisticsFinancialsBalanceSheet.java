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
 * Balance sheet information
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_TOTAL_CASH_MRQ,
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_TOTAL_CASH_PER_SHARE_MRQ,
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_TOTAL_DEBT_MRQ,
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_TOTAL_DEBT_TO_EQUITY_MRQ,
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_CURRENT_RATIO_MRQ,
  GetStatistics200ResponseStatisticsFinancialsBalanceSheet.JSON_PROPERTY_BOOK_VALUE_PER_SHARE_MRQ
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsFinancialsBalanceSheet {
  public static final String JSON_PROPERTY_TOTAL_CASH_MRQ = "total_cash_mrq";
  @javax.annotation.Nullable
  private Double totalCashMrq;

  public static final String JSON_PROPERTY_TOTAL_CASH_PER_SHARE_MRQ = "total_cash_per_share_mrq";
  @javax.annotation.Nullable
  private Double totalCashPerShareMrq;

  public static final String JSON_PROPERTY_TOTAL_DEBT_MRQ = "total_debt_mrq";
  @javax.annotation.Nullable
  private Double totalDebtMrq;

  public static final String JSON_PROPERTY_TOTAL_DEBT_TO_EQUITY_MRQ = "total_debt_to_equity_mrq";
  @javax.annotation.Nullable
  private Double totalDebtToEquityMrq;

  public static final String JSON_PROPERTY_CURRENT_RATIO_MRQ = "current_ratio_mrq";
  @javax.annotation.Nullable
  private Double currentRatioMrq;

  public static final String JSON_PROPERTY_BOOK_VALUE_PER_SHARE_MRQ = "book_value_per_share_mrq";
  @javax.annotation.Nullable
  private Double bookValuePerShareMrq;

  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet() { 
  }

  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet totalCashMrq(@javax.annotation.Nullable Double totalCashMrq) {
    this.totalCashMrq = totalCashMrq;
    return this;
  }

  /**
   * Refers to total cash measure for the most recent quarter
   * @return totalCashMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_CASH_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalCashMrq() {
    return totalCashMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_CASH_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCashMrq(@javax.annotation.Nullable Double totalCashMrq) {
    this.totalCashMrq = totalCashMrq;
  }


  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet totalCashPerShareMrq(@javax.annotation.Nullable Double totalCashPerShareMrq) {
    this.totalCashPerShareMrq = totalCashPerShareMrq;
    return this;
  }

  /**
   * Refers to total cash per share measure for the most recent quarter
   * @return totalCashPerShareMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_CASH_PER_SHARE_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalCashPerShareMrq() {
    return totalCashPerShareMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_CASH_PER_SHARE_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCashPerShareMrq(@javax.annotation.Nullable Double totalCashPerShareMrq) {
    this.totalCashPerShareMrq = totalCashPerShareMrq;
  }


  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet totalDebtMrq(@javax.annotation.Nullable Double totalDebtMrq) {
    this.totalDebtMrq = totalDebtMrq;
    return this;
  }

  /**
   * Refers to total debt measure for the most recent quarter
   * @return totalDebtMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalDebtMrq() {
    return totalDebtMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDebtMrq(@javax.annotation.Nullable Double totalDebtMrq) {
    this.totalDebtMrq = totalDebtMrq;
  }


  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet totalDebtToEquityMrq(@javax.annotation.Nullable Double totalDebtToEquityMrq) {
    this.totalDebtToEquityMrq = totalDebtToEquityMrq;
    return this;
  }

  /**
   * Refers to total debt to equity measure for the most recent quarter
   * @return totalDebtToEquityMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT_TO_EQUITY_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalDebtToEquityMrq() {
    return totalDebtToEquityMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT_TO_EQUITY_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDebtToEquityMrq(@javax.annotation.Nullable Double totalDebtToEquityMrq) {
    this.totalDebtToEquityMrq = totalDebtToEquityMrq;
  }


  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet currentRatioMrq(@javax.annotation.Nullable Double currentRatioMrq) {
    this.currentRatioMrq = currentRatioMrq;
    return this;
  }

  /**
   * Refers to current ratio (total assets / total liabilities) ratio for the most recent quarter
   * @return currentRatioMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_RATIO_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentRatioMrq() {
    return currentRatioMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_RATIO_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentRatioMrq(@javax.annotation.Nullable Double currentRatioMrq) {
    this.currentRatioMrq = currentRatioMrq;
  }


  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet bookValuePerShareMrq(@javax.annotation.Nullable Double bookValuePerShareMrq) {
    this.bookValuePerShareMrq = bookValuePerShareMrq;
    return this;
  }

  /**
   * Refers to book value per share (BVPS) ratio for the most recent quarter
   * @return bookValuePerShareMrq
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BOOK_VALUE_PER_SHARE_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBookValuePerShareMrq() {
    return bookValuePerShareMrq;
  }


  @JsonProperty(value = JSON_PROPERTY_BOOK_VALUE_PER_SHARE_MRQ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookValuePerShareMrq(@javax.annotation.Nullable Double bookValuePerShareMrq) {
    this.bookValuePerShareMrq = bookValuePerShareMrq;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_financials_balance_sheet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsFinancialsBalanceSheet getStatistics200ResponseStatisticsFinancialsBalanceSheet = (GetStatistics200ResponseStatisticsFinancialsBalanceSheet) o;
    return Objects.equals(this.totalCashMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.totalCashMrq) &&
        Objects.equals(this.totalCashPerShareMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.totalCashPerShareMrq) &&
        Objects.equals(this.totalDebtMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.totalDebtMrq) &&
        Objects.equals(this.totalDebtToEquityMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.totalDebtToEquityMrq) &&
        Objects.equals(this.currentRatioMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.currentRatioMrq) &&
        Objects.equals(this.bookValuePerShareMrq, getStatistics200ResponseStatisticsFinancialsBalanceSheet.bookValuePerShareMrq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCashMrq, totalCashPerShareMrq, totalDebtMrq, totalDebtToEquityMrq, currentRatioMrq, bookValuePerShareMrq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsFinancialsBalanceSheet {\n");
    sb.append("    totalCashMrq: ").append(toIndentedString(totalCashMrq)).append("\n");
    sb.append("    totalCashPerShareMrq: ").append(toIndentedString(totalCashPerShareMrq)).append("\n");
    sb.append("    totalDebtMrq: ").append(toIndentedString(totalDebtMrq)).append("\n");
    sb.append("    totalDebtToEquityMrq: ").append(toIndentedString(totalDebtToEquityMrq)).append("\n");
    sb.append("    currentRatioMrq: ").append(toIndentedString(currentRatioMrq)).append("\n");
    sb.append("    bookValuePerShareMrq: ").append(toIndentedString(bookValuePerShareMrq)).append("\n");
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

    // add `total_cash_mrq` to the URL query string
    if (getTotalCashMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_cash_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCashMrq()))));
    }

    // add `total_cash_per_share_mrq` to the URL query string
    if (getTotalCashPerShareMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_cash_per_share_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCashPerShareMrq()))));
    }

    // add `total_debt_mrq` to the URL query string
    if (getTotalDebtMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_debt_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalDebtMrq()))));
    }

    // add `total_debt_to_equity_mrq` to the URL query string
    if (getTotalDebtToEquityMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_debt_to_equity_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalDebtToEquityMrq()))));
    }

    // add `current_ratio_mrq` to the URL query string
    if (getCurrentRatioMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_ratio_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentRatioMrq()))));
    }

    // add `book_value_per_share_mrq` to the URL query string
    if (getBookValuePerShareMrq() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbook_value_per_share_mrq%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBookValuePerShareMrq()))));
    }

    return joiner.toString();
  }
}

