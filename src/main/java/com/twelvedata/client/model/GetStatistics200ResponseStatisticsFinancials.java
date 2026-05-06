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
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsFinancialsBalanceSheet;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsFinancialsCashFlow;
import com.twelvedata.client.model.GetStatistics200ResponseStatisticsFinancialsIncomeStatement;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Financial information of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_FISCAL_YEAR_ENDS,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_MOST_RECENT_QUARTER,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_GROSS_MARGIN,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_PROFIT_MARGIN,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_OPERATING_MARGIN,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_RETURN_ON_ASSETS_TTM,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_RETURN_ON_EQUITY_TTM,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_INCOME_STATEMENT,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_BALANCE_SHEET,
  GetStatistics200ResponseStatisticsFinancials.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsFinancials {
  public static final String JSON_PROPERTY_FISCAL_YEAR_ENDS = "fiscal_year_ends";
  @javax.annotation.Nullable
  private String fiscalYearEnds;

  public static final String JSON_PROPERTY_MOST_RECENT_QUARTER = "most_recent_quarter";
  @javax.annotation.Nullable
  private String mostRecentQuarter;

  public static final String JSON_PROPERTY_GROSS_MARGIN = "gross_margin";
  @javax.annotation.Nullable
  private Double grossMargin;

  public static final String JSON_PROPERTY_PROFIT_MARGIN = "profit_margin";
  @javax.annotation.Nullable
  private Double profitMargin;

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operating_margin";
  @javax.annotation.Nullable
  private Double operatingMargin;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS_TTM = "return_on_assets_ttm";
  @javax.annotation.Nullable
  private Double returnOnAssetsTtm;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY_TTM = "return_on_equity_ttm";
  @javax.annotation.Nullable
  private Double returnOnEquityTtm;

  public static final String JSON_PROPERTY_INCOME_STATEMENT = "income_statement";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsFinancialsIncomeStatement incomeStatement;

  public static final String JSON_PROPERTY_BALANCE_SHEET = "balance_sheet";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsFinancialsBalanceSheet balanceSheet;

  public static final String JSON_PROPERTY_CASH_FLOW = "cash_flow";
  @javax.annotation.Nullable
  private GetStatistics200ResponseStatisticsFinancialsCashFlow cashFlow;

  public GetStatistics200ResponseStatisticsFinancials() { 
  }

  public GetStatistics200ResponseStatisticsFinancials fiscalYearEnds(@javax.annotation.Nullable String fiscalYearEnds) {
    this.fiscalYearEnds = fiscalYearEnds;
    return this;
  }

  /**
   * Refers to the completion of the last 12-month accounting period
   * @return fiscalYearEnds
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FISCAL_YEAR_ENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFiscalYearEnds() {
    return fiscalYearEnds;
  }


  @JsonProperty(value = JSON_PROPERTY_FISCAL_YEAR_ENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYearEnds(@javax.annotation.Nullable String fiscalYearEnds) {
    this.fiscalYearEnds = fiscalYearEnds;
  }


  public GetStatistics200ResponseStatisticsFinancials mostRecentQuarter(@javax.annotation.Nullable String mostRecentQuarter) {
    this.mostRecentQuarter = mostRecentQuarter;
    return this;
  }

  /**
   * The most recent quarter (MRQ) refers to the fiscal quarter that most recently ended
   * @return mostRecentQuarter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MOST_RECENT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMostRecentQuarter() {
    return mostRecentQuarter;
  }


  @JsonProperty(value = JSON_PROPERTY_MOST_RECENT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostRecentQuarter(@javax.annotation.Nullable String mostRecentQuarter) {
    this.mostRecentQuarter = mostRecentQuarter;
  }


  public GetStatistics200ResponseStatisticsFinancials grossMargin(@javax.annotation.Nullable Double grossMargin) {
    this.grossMargin = grossMargin;
    return this;
  }

  /**
   * The portion of a company&#39;s revenue left over after direct costs are subtracted
   * @return grossMargin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrossMargin() {
    return grossMargin;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossMargin(@javax.annotation.Nullable Double grossMargin) {
    this.grossMargin = grossMargin;
  }


  public GetStatistics200ResponseStatisticsFinancials profitMargin(@javax.annotation.Nullable Double profitMargin) {
    this.profitMargin = profitMargin;
    return this;
  }

  /**
   * Refers to gross profit margin. Calculated by dividing net income by sales revenue
   * @return profitMargin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFIT_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProfitMargin() {
    return profitMargin;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFIT_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfitMargin(@javax.annotation.Nullable Double profitMargin) {
    this.profitMargin = profitMargin;
  }


  public GetStatistics200ResponseStatisticsFinancials operatingMargin(@javax.annotation.Nullable Double operatingMargin) {
    this.operatingMargin = operatingMargin;
    return this;
  }

  /**
   * Operating margin is calculated by dividing operating income by net sales
   * @return operatingMargin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingMargin() {
    return operatingMargin;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_MARGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMargin(@javax.annotation.Nullable Double operatingMargin) {
    this.operatingMargin = operatingMargin;
  }


  public GetStatistics200ResponseStatisticsFinancials returnOnAssetsTtm(@javax.annotation.Nullable Double returnOnAssetsTtm) {
    this.returnOnAssetsTtm = returnOnAssetsTtm;
    return this;
  }

  /**
   * Return on assets (ROA) is calculated by dividing net income by total assets
   * @return returnOnAssetsTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETURN_ON_ASSETS_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReturnOnAssetsTtm() {
    return returnOnAssetsTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_RETURN_ON_ASSETS_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssetsTtm(@javax.annotation.Nullable Double returnOnAssetsTtm) {
    this.returnOnAssetsTtm = returnOnAssetsTtm;
  }


  public GetStatistics200ResponseStatisticsFinancials returnOnEquityTtm(@javax.annotation.Nullable Double returnOnEquityTtm) {
    this.returnOnEquityTtm = returnOnEquityTtm;
    return this;
  }

  /**
   * Return on equity (ROE) is calculated by dividing net income by average shareholders&#39; equity
   * @return returnOnEquityTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETURN_ON_EQUITY_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReturnOnEquityTtm() {
    return returnOnEquityTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_RETURN_ON_EQUITY_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquityTtm(@javax.annotation.Nullable Double returnOnEquityTtm) {
    this.returnOnEquityTtm = returnOnEquityTtm;
  }


  public GetStatistics200ResponseStatisticsFinancials incomeStatement(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsIncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

  /**
   * Get incomeStatement
   * @return incomeStatement
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsFinancialsIncomeStatement getIncomeStatement() {
    return incomeStatement;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeStatement(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsIncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
  }


  public GetStatistics200ResponseStatisticsFinancials balanceSheet(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsBalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

  /**
   * Get balanceSheet
   * @return balanceSheet
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BALANCE_SHEET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsFinancialsBalanceSheet getBalanceSheet() {
    return balanceSheet;
  }


  @JsonProperty(value = JSON_PROPERTY_BALANCE_SHEET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceSheet(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsBalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }


  public GetStatistics200ResponseStatisticsFinancials cashFlow(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsCashFlow cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

  /**
   * Get cashFlow
   * @return cashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetStatistics200ResponseStatisticsFinancialsCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(@javax.annotation.Nullable GetStatistics200ResponseStatisticsFinancialsCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_financials object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsFinancials getStatistics200ResponseStatisticsFinancials = (GetStatistics200ResponseStatisticsFinancials) o;
    return Objects.equals(this.fiscalYearEnds, getStatistics200ResponseStatisticsFinancials.fiscalYearEnds) &&
        Objects.equals(this.mostRecentQuarter, getStatistics200ResponseStatisticsFinancials.mostRecentQuarter) &&
        Objects.equals(this.grossMargin, getStatistics200ResponseStatisticsFinancials.grossMargin) &&
        Objects.equals(this.profitMargin, getStatistics200ResponseStatisticsFinancials.profitMargin) &&
        Objects.equals(this.operatingMargin, getStatistics200ResponseStatisticsFinancials.operatingMargin) &&
        Objects.equals(this.returnOnAssetsTtm, getStatistics200ResponseStatisticsFinancials.returnOnAssetsTtm) &&
        Objects.equals(this.returnOnEquityTtm, getStatistics200ResponseStatisticsFinancials.returnOnEquityTtm) &&
        Objects.equals(this.incomeStatement, getStatistics200ResponseStatisticsFinancials.incomeStatement) &&
        Objects.equals(this.balanceSheet, getStatistics200ResponseStatisticsFinancials.balanceSheet) &&
        Objects.equals(this.cashFlow, getStatistics200ResponseStatisticsFinancials.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYearEnds, mostRecentQuarter, grossMargin, profitMargin, operatingMargin, returnOnAssetsTtm, returnOnEquityTtm, incomeStatement, balanceSheet, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsFinancials {\n");
    sb.append("    fiscalYearEnds: ").append(toIndentedString(fiscalYearEnds)).append("\n");
    sb.append("    mostRecentQuarter: ").append(toIndentedString(mostRecentQuarter)).append("\n");
    sb.append("    grossMargin: ").append(toIndentedString(grossMargin)).append("\n");
    sb.append("    profitMargin: ").append(toIndentedString(profitMargin)).append("\n");
    sb.append("    operatingMargin: ").append(toIndentedString(operatingMargin)).append("\n");
    sb.append("    returnOnAssetsTtm: ").append(toIndentedString(returnOnAssetsTtm)).append("\n");
    sb.append("    returnOnEquityTtm: ").append(toIndentedString(returnOnEquityTtm)).append("\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
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

    // add `fiscal_year_ends` to the URL query string
    if (getFiscalYearEnds() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiscal_year_ends%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiscalYearEnds()))));
    }

    // add `most_recent_quarter` to the URL query string
    if (getMostRecentQuarter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smost_recent_quarter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMostRecentQuarter()))));
    }

    // add `gross_margin` to the URL query string
    if (getGrossMargin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_margin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossMargin()))));
    }

    // add `profit_margin` to the URL query string
    if (getProfitMargin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprofit_margin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProfitMargin()))));
    }

    // add `operating_margin` to the URL query string
    if (getOperatingMargin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_margin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingMargin()))));
    }

    // add `return_on_assets_ttm` to the URL query string
    if (getReturnOnAssetsTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreturn_on_assets_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReturnOnAssetsTtm()))));
    }

    // add `return_on_equity_ttm` to the URL query string
    if (getReturnOnEquityTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreturn_on_equity_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReturnOnEquityTtm()))));
    }

    // add `income_statement` to the URL query string
    if (getIncomeStatement() != null) {
      joiner.add(getIncomeStatement().toUrlQueryString(prefix + "income_statement" + suffix));
    }

    // add `balance_sheet` to the URL query string
    if (getBalanceSheet() != null) {
      joiner.add(getBalanceSheet().toUrlQueryString(prefix + "balance_sheet" + suffix));
    }

    // add `cash_flow` to the URL query string
    if (getCashFlow() != null) {
      joiner.add(getCashFlow().toUrlQueryString(prefix + "cash_flow" + suffix));
    }

    return joiner.toString();
  }
}

