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
 * Income statement information
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_REVENUE_TTM,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_REVENUE_PER_SHARE_TTM,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_QUARTERLY_REVENUE_GROWTH,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_GROSS_PROFIT_TTM,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_EBITDA,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_NET_INCOME_TO_COMMON_TTM,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_DILUTED_EPS_TTM,
  GetStatistics200ResponseStatisticsFinancialsIncomeStatement.JSON_PROPERTY_QUARTERLY_EARNINGS_GROWTH_YOY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsFinancialsIncomeStatement {
  public static final String JSON_PROPERTY_REVENUE_TTM = "revenue_ttm";
  @javax.annotation.Nullable
  private Double revenueTtm;

  public static final String JSON_PROPERTY_REVENUE_PER_SHARE_TTM = "revenue_per_share_ttm";
  @javax.annotation.Nullable
  private Double revenuePerShareTtm;

  public static final String JSON_PROPERTY_QUARTERLY_REVENUE_GROWTH = "quarterly_revenue_growth";
  @javax.annotation.Nullable
  private Double quarterlyRevenueGrowth;

  public static final String JSON_PROPERTY_GROSS_PROFIT_TTM = "gross_profit_ttm";
  @javax.annotation.Nullable
  private Double grossProfitTtm;

  public static final String JSON_PROPERTY_EBITDA = "ebitda";
  @javax.annotation.Nullable
  private Double ebitda;

  public static final String JSON_PROPERTY_NET_INCOME_TO_COMMON_TTM = "net_income_to_common_ttm";
  @javax.annotation.Nullable
  private Double netIncomeToCommonTtm;

  public static final String JSON_PROPERTY_DILUTED_EPS_TTM = "diluted_eps_ttm";
  @javax.annotation.Nullable
  private Double dilutedEpsTtm;

  public static final String JSON_PROPERTY_QUARTERLY_EARNINGS_GROWTH_YOY = "quarterly_earnings_growth_yoy";
  @javax.annotation.Nullable
  private Double quarterlyEarningsGrowthYoy;

  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement() { 
  }

  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement revenueTtm(@javax.annotation.Nullable Double revenueTtm) {
    this.revenueTtm = revenueTtm;
    return this;
  }

  /**
   * Refers to total revenue over the last 12 months
   * @return revenueTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REVENUE_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRevenueTtm() {
    return revenueTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_REVENUE_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenueTtm(@javax.annotation.Nullable Double revenueTtm) {
    this.revenueTtm = revenueTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement revenuePerShareTtm(@javax.annotation.Nullable Double revenuePerShareTtm) {
    this.revenuePerShareTtm = revenuePerShareTtm;
    return this;
  }

  /**
   * Refers to revenue per share over the last 12 months
   * @return revenuePerShareTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REVENUE_PER_SHARE_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRevenuePerShareTtm() {
    return revenuePerShareTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_REVENUE_PER_SHARE_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenuePerShareTtm(@javax.annotation.Nullable Double revenuePerShareTtm) {
    this.revenuePerShareTtm = revenuePerShareTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement quarterlyRevenueGrowth(@javax.annotation.Nullable Double quarterlyRevenueGrowth) {
    this.quarterlyRevenueGrowth = quarterlyRevenueGrowth;
    return this;
  }

  /**
   * Refers to quarterly revenue growth year over year
   * @return quarterlyRevenueGrowth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_REVENUE_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQuarterlyRevenueGrowth() {
    return quarterlyRevenueGrowth;
  }


  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_REVENUE_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarterlyRevenueGrowth(@javax.annotation.Nullable Double quarterlyRevenueGrowth) {
    this.quarterlyRevenueGrowth = quarterlyRevenueGrowth;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement grossProfitTtm(@javax.annotation.Nullable Double grossProfitTtm) {
    this.grossProfitTtm = grossProfitTtm;
    return this;
  }

  /**
   * Refers to gross profit over the last 12 months
   * @return grossProfitTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrossProfitTtm() {
    return grossProfitTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossProfitTtm(@javax.annotation.Nullable Double grossProfitTtm) {
    this.grossProfitTtm = grossProfitTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement ebitda(@javax.annotation.Nullable Double ebitda) {
    this.ebitda = ebitda;
    return this;
  }

  /**
   * Refers to EBITDA (earnings before interest, taxes, depreciation, and amortization) measure; EBITDA is not calculated for banks
   * @return ebitda
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEbitda() {
    return ebitda;
  }


  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitda(@javax.annotation.Nullable Double ebitda) {
    this.ebitda = ebitda;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement netIncomeToCommonTtm(@javax.annotation.Nullable Double netIncomeToCommonTtm) {
    this.netIncomeToCommonTtm = netIncomeToCommonTtm;
    return this;
  }

  /**
   * Refers to net income applicable to common shares over the last 12 months
   * @return netIncomeToCommonTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_TO_COMMON_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeToCommonTtm() {
    return netIncomeToCommonTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_TO_COMMON_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeToCommonTtm(@javax.annotation.Nullable Double netIncomeToCommonTtm) {
    this.netIncomeToCommonTtm = netIncomeToCommonTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement dilutedEpsTtm(@javax.annotation.Nullable Double dilutedEpsTtm) {
    this.dilutedEpsTtm = dilutedEpsTtm;
    return this;
  }

  /**
   * Refers to diluted EPS measure over the last 12 months
   * @return dilutedEpsTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedEpsTtm() {
    return dilutedEpsTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedEpsTtm(@javax.annotation.Nullable Double dilutedEpsTtm) {
    this.dilutedEpsTtm = dilutedEpsTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement quarterlyEarningsGrowthYoy(@javax.annotation.Nullable Double quarterlyEarningsGrowthYoy) {
    this.quarterlyEarningsGrowthYoy = quarterlyEarningsGrowthYoy;
    return this;
  }

  /**
   * Refers to quarterly earnings growth year over year
   * @return quarterlyEarningsGrowthYoy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_EARNINGS_GROWTH_YOY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQuarterlyEarningsGrowthYoy() {
    return quarterlyEarningsGrowthYoy;
  }


  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_EARNINGS_GROWTH_YOY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarterlyEarningsGrowthYoy(@javax.annotation.Nullable Double quarterlyEarningsGrowthYoy) {
    this.quarterlyEarningsGrowthYoy = quarterlyEarningsGrowthYoy;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_financials_income_statement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsFinancialsIncomeStatement getStatistics200ResponseStatisticsFinancialsIncomeStatement = (GetStatistics200ResponseStatisticsFinancialsIncomeStatement) o;
    return Objects.equals(this.revenueTtm, getStatistics200ResponseStatisticsFinancialsIncomeStatement.revenueTtm) &&
        Objects.equals(this.revenuePerShareTtm, getStatistics200ResponseStatisticsFinancialsIncomeStatement.revenuePerShareTtm) &&
        Objects.equals(this.quarterlyRevenueGrowth, getStatistics200ResponseStatisticsFinancialsIncomeStatement.quarterlyRevenueGrowth) &&
        Objects.equals(this.grossProfitTtm, getStatistics200ResponseStatisticsFinancialsIncomeStatement.grossProfitTtm) &&
        Objects.equals(this.ebitda, getStatistics200ResponseStatisticsFinancialsIncomeStatement.ebitda) &&
        Objects.equals(this.netIncomeToCommonTtm, getStatistics200ResponseStatisticsFinancialsIncomeStatement.netIncomeToCommonTtm) &&
        Objects.equals(this.dilutedEpsTtm, getStatistics200ResponseStatisticsFinancialsIncomeStatement.dilutedEpsTtm) &&
        Objects.equals(this.quarterlyEarningsGrowthYoy, getStatistics200ResponseStatisticsFinancialsIncomeStatement.quarterlyEarningsGrowthYoy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revenueTtm, revenuePerShareTtm, quarterlyRevenueGrowth, grossProfitTtm, ebitda, netIncomeToCommonTtm, dilutedEpsTtm, quarterlyEarningsGrowthYoy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsFinancialsIncomeStatement {\n");
    sb.append("    revenueTtm: ").append(toIndentedString(revenueTtm)).append("\n");
    sb.append("    revenuePerShareTtm: ").append(toIndentedString(revenuePerShareTtm)).append("\n");
    sb.append("    quarterlyRevenueGrowth: ").append(toIndentedString(quarterlyRevenueGrowth)).append("\n");
    sb.append("    grossProfitTtm: ").append(toIndentedString(grossProfitTtm)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    netIncomeToCommonTtm: ").append(toIndentedString(netIncomeToCommonTtm)).append("\n");
    sb.append("    dilutedEpsTtm: ").append(toIndentedString(dilutedEpsTtm)).append("\n");
    sb.append("    quarterlyEarningsGrowthYoy: ").append(toIndentedString(quarterlyEarningsGrowthYoy)).append("\n");
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

    // add `revenue_ttm` to the URL query string
    if (getRevenueTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srevenue_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRevenueTtm()))));
    }

    // add `revenue_per_share_ttm` to the URL query string
    if (getRevenuePerShareTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srevenue_per_share_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRevenuePerShareTtm()))));
    }

    // add `quarterly_revenue_growth` to the URL query string
    if (getQuarterlyRevenueGrowth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squarterly_revenue_growth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuarterlyRevenueGrowth()))));
    }

    // add `gross_profit_ttm` to the URL query string
    if (getGrossProfitTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_profit_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossProfitTtm()))));
    }

    // add `ebitda` to the URL query string
    if (getEbitda() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sebitda%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEbitda()))));
    }

    // add `net_income_to_common_ttm` to the URL query string
    if (getNetIncomeToCommonTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_to_common_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeToCommonTtm()))));
    }

    // add `diluted_eps_ttm` to the URL query string
    if (getDilutedEpsTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_eps_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedEpsTtm()))));
    }

    // add `quarterly_earnings_growth_yoy` to the URL query string
    if (getQuarterlyEarningsGrowthYoy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squarterly_earnings_growth_yoy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuarterlyEarningsGrowthYoy()))));
    }

    return joiner.toString();
  }
}

