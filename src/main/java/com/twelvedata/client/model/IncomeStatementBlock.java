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
import com.twelvedata.client.model.IncomeStatementBlockNonOperatingInterest;
import com.twelvedata.client.model.IncomeStatementBlockOperatingExpense;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * IncomeStatementBlock
 */
@JsonPropertyOrder({
  IncomeStatementBlock.JSON_PROPERTY_FISCAL_DATE,
  IncomeStatementBlock.JSON_PROPERTY_QUARTER,
  IncomeStatementBlock.JSON_PROPERTY_YEAR,
  IncomeStatementBlock.JSON_PROPERTY_SALES,
  IncomeStatementBlock.JSON_PROPERTY_COST_OF_GOODS,
  IncomeStatementBlock.JSON_PROPERTY_GROSS_PROFIT,
  IncomeStatementBlock.JSON_PROPERTY_OPERATING_EXPENSE,
  IncomeStatementBlock.JSON_PROPERTY_OPERATING_INCOME,
  IncomeStatementBlock.JSON_PROPERTY_NON_OPERATING_INTEREST,
  IncomeStatementBlock.JSON_PROPERTY_OTHER_INCOME_EXPENSE,
  IncomeStatementBlock.JSON_PROPERTY_PRETAX_INCOME,
  IncomeStatementBlock.JSON_PROPERTY_INCOME_TAX,
  IncomeStatementBlock.JSON_PROPERTY_NET_INCOME,
  IncomeStatementBlock.JSON_PROPERTY_EPS_BASIC,
  IncomeStatementBlock.JSON_PROPERTY_EPS_DILUTED,
  IncomeStatementBlock.JSON_PROPERTY_BASIC_SHARES_OUTSTANDING,
  IncomeStatementBlock.JSON_PROPERTY_DILUTED_SHARES_OUTSTANDING,
  IncomeStatementBlock.JSON_PROPERTY_EBIT,
  IncomeStatementBlock.JSON_PROPERTY_EBITDA,
  IncomeStatementBlock.JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS,
  IncomeStatementBlock.JSON_PROPERTY_MINORITY_INTERESTS,
  IncomeStatementBlock.JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementBlock {
  public static final String JSON_PROPERTY_FISCAL_DATE = "fiscal_date";
  @javax.annotation.Nonnull
  private String fiscalDate;

  public static final String JSON_PROPERTY_QUARTER = "quarter";
  @javax.annotation.Nullable
  private Long quarter;

  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Long year;

  public static final String JSON_PROPERTY_SALES = "sales";
  @javax.annotation.Nullable
  private Long sales;

  public static final String JSON_PROPERTY_COST_OF_GOODS = "cost_of_goods";
  @javax.annotation.Nullable
  private Long costOfGoods;

  public static final String JSON_PROPERTY_GROSS_PROFIT = "gross_profit";
  @javax.annotation.Nullable
  private Long grossProfit;

  public static final String JSON_PROPERTY_OPERATING_EXPENSE = "operating_expense";
  @javax.annotation.Nullable
  private IncomeStatementBlockOperatingExpense operatingExpense;

  public static final String JSON_PROPERTY_OPERATING_INCOME = "operating_income";
  @javax.annotation.Nullable
  private Long operatingIncome;

  public static final String JSON_PROPERTY_NON_OPERATING_INTEREST = "non_operating_interest";
  @javax.annotation.Nullable
  private IncomeStatementBlockNonOperatingInterest nonOperatingInterest;

  public static final String JSON_PROPERTY_OTHER_INCOME_EXPENSE = "other_income_expense";
  @javax.annotation.Nullable
  private Long otherIncomeExpense;

  public static final String JSON_PROPERTY_PRETAX_INCOME = "pretax_income";
  @javax.annotation.Nullable
  private Long pretaxIncome;

  public static final String JSON_PROPERTY_INCOME_TAX = "income_tax";
  @javax.annotation.Nullable
  private Long incomeTax;

  public static final String JSON_PROPERTY_NET_INCOME = "net_income";
  @javax.annotation.Nullable
  private Long netIncome;

  public static final String JSON_PROPERTY_EPS_BASIC = "eps_basic";
  @javax.annotation.Nullable
  private Double epsBasic;

  public static final String JSON_PROPERTY_EPS_DILUTED = "eps_diluted";
  @javax.annotation.Nullable
  private Double epsDiluted;

  public static final String JSON_PROPERTY_BASIC_SHARES_OUTSTANDING = "basic_shares_outstanding";
  @javax.annotation.Nullable
  private Long basicSharesOutstanding;

  public static final String JSON_PROPERTY_DILUTED_SHARES_OUTSTANDING = "diluted_shares_outstanding";
  @javax.annotation.Nullable
  private Long dilutedSharesOutstanding;

  public static final String JSON_PROPERTY_EBIT = "ebit";
  @javax.annotation.Nullable
  private Long ebit;

  public static final String JSON_PROPERTY_EBITDA = "ebitda";
  @javax.annotation.Nullable
  private Long ebitda;

  public static final String JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS = "net_income_continuous_operations";
  @javax.annotation.Nullable
  private Long netIncomeContinuousOperations;

  public static final String JSON_PROPERTY_MINORITY_INTERESTS = "minority_interests";
  @javax.annotation.Nullable
  private Long minorityInterests;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS = "preferred_stock_dividends";
  @javax.annotation.Nullable
  private Long preferredStockDividends;

  public IncomeStatementBlock() { 
  }

  public IncomeStatementBlock fiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
    return this;
  }

  /**
   * Date of fiscal period ending
   * @return fiscalDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFiscalDate() {
    return fiscalDate;
  }


  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
  }


  public IncomeStatementBlock quarter(@javax.annotation.Nullable Long quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * Fiscal quarter. Visible when &#x60;&amp;period&#x3D;quarterly&#x60;
   * @return quarter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQuarter() {
    return quarter;
  }


  @JsonProperty(value = JSON_PROPERTY_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarter(@javax.annotation.Nullable Long quarter) {
    this.quarter = quarter;
  }


  public IncomeStatementBlock year(@javax.annotation.Nullable Long year) {
    this.year = year;
    return this;
  }

  /**
   * Fiscal year
   * @return year
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getYear() {
    return year;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(@javax.annotation.Nullable Long year) {
    this.year = year;
  }


  public IncomeStatementBlock sales(@javax.annotation.Nullable Long sales) {
    this.sales = sales;
    return this;
  }

  /**
   * Refers to total reported revenue
   * @return sales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSales() {
    return sales;
  }


  @JsonProperty(value = JSON_PROPERTY_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(@javax.annotation.Nullable Long sales) {
    this.sales = sales;
  }


  public IncomeStatementBlock costOfGoods(@javax.annotation.Nullable Long costOfGoods) {
    this.costOfGoods = costOfGoods;
    return this;
  }

  /**
   * Refers to cost of revenue
   * @return costOfGoods
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COST_OF_GOODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCostOfGoods() {
    return costOfGoods;
  }


  @JsonProperty(value = JSON_PROPERTY_COST_OF_GOODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostOfGoods(@javax.annotation.Nullable Long costOfGoods) {
    this.costOfGoods = costOfGoods;
  }


  public IncomeStatementBlock grossProfit(@javax.annotation.Nullable Long grossProfit) {
    this.grossProfit = grossProfit;
    return this;
  }

  /**
   * Refers to net gross profit: &#x60;sales&#x60; - &#x60;cost_of_goods&#x60;
   * @return grossProfit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGrossProfit() {
    return grossProfit;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossProfit(@javax.annotation.Nullable Long grossProfit) {
    this.grossProfit = grossProfit;
  }


  public IncomeStatementBlock operatingExpense(@javax.annotation.Nullable IncomeStatementBlockOperatingExpense operatingExpense) {
    this.operatingExpense = operatingExpense;
    return this;
  }

  /**
   * Get operatingExpense
   * @return operatingExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementBlockOperatingExpense getOperatingExpense() {
    return operatingExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingExpense(@javax.annotation.Nullable IncomeStatementBlockOperatingExpense operatingExpense) {
    this.operatingExpense = operatingExpense;
  }


  public IncomeStatementBlock operatingIncome(@javax.annotation.Nullable Long operatingIncome) {
    this.operatingIncome = operatingIncome;
    return this;
  }

  /**
   * Refers to net operating income: &#x60;gross_profit&#x60; - &#x60;research_and_development&#x60; - &#x60;selling_general_and_administrative&#x60;
   * @return operatingIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOperatingIncome() {
    return operatingIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingIncome(@javax.annotation.Nullable Long operatingIncome) {
    this.operatingIncome = operatingIncome;
  }


  public IncomeStatementBlock nonOperatingInterest(@javax.annotation.Nullable IncomeStatementBlockNonOperatingInterest nonOperatingInterest) {
    this.nonOperatingInterest = nonOperatingInterest;
    return this;
  }

  /**
   * Get nonOperatingInterest
   * @return nonOperatingInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_OPERATING_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementBlockNonOperatingInterest getNonOperatingInterest() {
    return nonOperatingInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_OPERATING_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonOperatingInterest(@javax.annotation.Nullable IncomeStatementBlockNonOperatingInterest nonOperatingInterest) {
    this.nonOperatingInterest = nonOperatingInterest;
  }


  public IncomeStatementBlock otherIncomeExpense(@javax.annotation.Nullable Long otherIncomeExpense) {
    this.otherIncomeExpense = otherIncomeExpense;
    return this;
  }

  /**
   * Refers to other incomes or expenses
   * @return otherIncomeExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOtherIncomeExpense() {
    return otherIncomeExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherIncomeExpense(@javax.annotation.Nullable Long otherIncomeExpense) {
    this.otherIncomeExpense = otherIncomeExpense;
  }


  public IncomeStatementBlock pretaxIncome(@javax.annotation.Nullable Long pretaxIncome) {
    this.pretaxIncome = pretaxIncome;
    return this;
  }

  /**
   * Refers to earnings before tax: &#x60;operating_income&#x60; + &#x60;net_non_operating_interest&#x60; - &#x60;other_income_expense&#x60;
   * @return pretaxIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPretaxIncome() {
    return pretaxIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPretaxIncome(@javax.annotation.Nullable Long pretaxIncome) {
    this.pretaxIncome = pretaxIncome;
  }


  public IncomeStatementBlock incomeTax(@javax.annotation.Nullable Long incomeTax) {
    this.incomeTax = incomeTax;
    return this;
  }

  /**
   * Refers to a tax provision
   * @return incomeTax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncomeTax() {
    return incomeTax;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeTax(@javax.annotation.Nullable Long incomeTax) {
    this.incomeTax = incomeTax;
  }


  public IncomeStatementBlock netIncome(@javax.annotation.Nullable Long netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Refers to net income: &#x60;pretax_income&#x60; - &#x60;income_tax&#x60;
   * @return netIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetIncome() {
    return netIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncome(@javax.annotation.Nullable Long netIncome) {
    this.netIncome = netIncome;
  }


  public IncomeStatementBlock epsBasic(@javax.annotation.Nullable Double epsBasic) {
    this.epsBasic = epsBasic;
    return this;
  }

  /**
   * Refers to earnings per share (EPS)
   * @return epsBasic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_BASIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsBasic() {
    return epsBasic;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_BASIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsBasic(@javax.annotation.Nullable Double epsBasic) {
    this.epsBasic = epsBasic;
  }


  public IncomeStatementBlock epsDiluted(@javax.annotation.Nullable Double epsDiluted) {
    this.epsDiluted = epsDiluted;
    return this;
  }

  /**
   * Refers to diluted earnings per share (EPS)
   * @return epsDiluted
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_DILUTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsDiluted() {
    return epsDiluted;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_DILUTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsDiluted(@javax.annotation.Nullable Double epsDiluted) {
    this.epsDiluted = epsDiluted;
  }


  public IncomeStatementBlock basicSharesOutstanding(@javax.annotation.Nullable Long basicSharesOutstanding) {
    this.basicSharesOutstanding = basicSharesOutstanding;
    return this;
  }

  /**
   * Refers for the shares outstanding held by all its shareholders
   * @return basicSharesOutstanding
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBasicSharesOutstanding() {
    return basicSharesOutstanding;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicSharesOutstanding(@javax.annotation.Nullable Long basicSharesOutstanding) {
    this.basicSharesOutstanding = basicSharesOutstanding;
  }


  public IncomeStatementBlock dilutedSharesOutstanding(@javax.annotation.Nullable Long dilutedSharesOutstanding) {
    this.dilutedSharesOutstanding = dilutedSharesOutstanding;
    return this;
  }

  /**
   * Refers to the total number of shares a company would have if all dilutive securities were exercised and converted into shares
   * @return dilutedSharesOutstanding
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDilutedSharesOutstanding() {
    return dilutedSharesOutstanding;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedSharesOutstanding(@javax.annotation.Nullable Long dilutedSharesOutstanding) {
    this.dilutedSharesOutstanding = dilutedSharesOutstanding;
  }


  public IncomeStatementBlock ebit(@javax.annotation.Nullable Long ebit) {
    this.ebit = ebit;
    return this;
  }

  /**
   * Refers to earnings before interest and taxes (EBIT) measure
   * @return ebit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEbit() {
    return ebit;
  }


  @JsonProperty(value = JSON_PROPERTY_EBIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbit(@javax.annotation.Nullable Long ebit) {
    this.ebit = ebit;
  }


  public IncomeStatementBlock ebitda(@javax.annotation.Nullable Long ebitda) {
    this.ebitda = ebitda;
    return this;
  }

  /**
   * Refers to EBITDA (earnings before interest, taxes, depreciation, and amortization) measure
   * @return ebitda
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEbitda() {
    return ebitda;
  }


  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitda(@javax.annotation.Nullable Long ebitda) {
    this.ebitda = ebitda;
  }


  public IncomeStatementBlock netIncomeContinuousOperations(@javax.annotation.Nullable Long netIncomeContinuousOperations) {
    this.netIncomeContinuousOperations = netIncomeContinuousOperations;
    return this;
  }

  /**
   * Refers to the after-tax earnings that a business has generated from its operational activities
   * @return netIncomeContinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetIncomeContinuousOperations() {
    return netIncomeContinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeContinuousOperations(@javax.annotation.Nullable Long netIncomeContinuousOperations) {
    this.netIncomeContinuousOperations = netIncomeContinuousOperations;
  }


  public IncomeStatementBlock minorityInterests(@javax.annotation.Nullable Long minorityInterests) {
    this.minorityInterests = minorityInterests;
    return this;
  }

  /**
   * Refers to amount of minority interests paid out
   * @return minorityInterests
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinorityInterests() {
    return minorityInterests;
  }


  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinorityInterests(@javax.annotation.Nullable Long minorityInterests) {
    this.minorityInterests = minorityInterests;
  }


  public IncomeStatementBlock preferredStockDividends(@javax.annotation.Nullable Long preferredStockDividends) {
    this.preferredStockDividends = preferredStockDividends;
    return this;
  }

  /**
   * Refers to dividend that is allocated to and paid on a company&#39;s preferred shares
   * @return preferredStockDividends
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPreferredStockDividends() {
    return preferredStockDividends;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockDividends(@javax.annotation.Nullable Long preferredStockDividends) {
    this.preferredStockDividends = preferredStockDividends;
  }


  /**
   * Return true if this IncomeStatementBlock object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementBlock incomeStatementBlock = (IncomeStatementBlock) o;
    return Objects.equals(this.fiscalDate, incomeStatementBlock.fiscalDate) &&
        Objects.equals(this.quarter, incomeStatementBlock.quarter) &&
        Objects.equals(this.year, incomeStatementBlock.year) &&
        Objects.equals(this.sales, incomeStatementBlock.sales) &&
        Objects.equals(this.costOfGoods, incomeStatementBlock.costOfGoods) &&
        Objects.equals(this.grossProfit, incomeStatementBlock.grossProfit) &&
        Objects.equals(this.operatingExpense, incomeStatementBlock.operatingExpense) &&
        Objects.equals(this.operatingIncome, incomeStatementBlock.operatingIncome) &&
        Objects.equals(this.nonOperatingInterest, incomeStatementBlock.nonOperatingInterest) &&
        Objects.equals(this.otherIncomeExpense, incomeStatementBlock.otherIncomeExpense) &&
        Objects.equals(this.pretaxIncome, incomeStatementBlock.pretaxIncome) &&
        Objects.equals(this.incomeTax, incomeStatementBlock.incomeTax) &&
        Objects.equals(this.netIncome, incomeStatementBlock.netIncome) &&
        Objects.equals(this.epsBasic, incomeStatementBlock.epsBasic) &&
        Objects.equals(this.epsDiluted, incomeStatementBlock.epsDiluted) &&
        Objects.equals(this.basicSharesOutstanding, incomeStatementBlock.basicSharesOutstanding) &&
        Objects.equals(this.dilutedSharesOutstanding, incomeStatementBlock.dilutedSharesOutstanding) &&
        Objects.equals(this.ebit, incomeStatementBlock.ebit) &&
        Objects.equals(this.ebitda, incomeStatementBlock.ebitda) &&
        Objects.equals(this.netIncomeContinuousOperations, incomeStatementBlock.netIncomeContinuousOperations) &&
        Objects.equals(this.minorityInterests, incomeStatementBlock.minorityInterests) &&
        Objects.equals(this.preferredStockDividends, incomeStatementBlock.preferredStockDividends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalDate, quarter, year, sales, costOfGoods, grossProfit, operatingExpense, operatingIncome, nonOperatingInterest, otherIncomeExpense, pretaxIncome, incomeTax, netIncome, epsBasic, epsDiluted, basicSharesOutstanding, dilutedSharesOutstanding, ebit, ebitda, netIncomeContinuousOperations, minorityInterests, preferredStockDividends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementBlock {\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    costOfGoods: ").append(toIndentedString(costOfGoods)).append("\n");
    sb.append("    grossProfit: ").append(toIndentedString(grossProfit)).append("\n");
    sb.append("    operatingExpense: ").append(toIndentedString(operatingExpense)).append("\n");
    sb.append("    operatingIncome: ").append(toIndentedString(operatingIncome)).append("\n");
    sb.append("    nonOperatingInterest: ").append(toIndentedString(nonOperatingInterest)).append("\n");
    sb.append("    otherIncomeExpense: ").append(toIndentedString(otherIncomeExpense)).append("\n");
    sb.append("    pretaxIncome: ").append(toIndentedString(pretaxIncome)).append("\n");
    sb.append("    incomeTax: ").append(toIndentedString(incomeTax)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    epsBasic: ").append(toIndentedString(epsBasic)).append("\n");
    sb.append("    epsDiluted: ").append(toIndentedString(epsDiluted)).append("\n");
    sb.append("    basicSharesOutstanding: ").append(toIndentedString(basicSharesOutstanding)).append("\n");
    sb.append("    dilutedSharesOutstanding: ").append(toIndentedString(dilutedSharesOutstanding)).append("\n");
    sb.append("    ebit: ").append(toIndentedString(ebit)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    netIncomeContinuousOperations: ").append(toIndentedString(netIncomeContinuousOperations)).append("\n");
    sb.append("    minorityInterests: ").append(toIndentedString(minorityInterests)).append("\n");
    sb.append("    preferredStockDividends: ").append(toIndentedString(preferredStockDividends)).append("\n");
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

    // add `fiscal_date` to the URL query string
    if (getFiscalDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiscal_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiscalDate()))));
    }

    // add `quarter` to the URL query string
    if (getQuarter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squarter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuarter()))));
    }

    // add `year` to the URL query string
    if (getYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYear()))));
    }

    // add `sales` to the URL query string
    if (getSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSales()))));
    }

    // add `cost_of_goods` to the URL query string
    if (getCostOfGoods() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scost_of_goods%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCostOfGoods()))));
    }

    // add `gross_profit` to the URL query string
    if (getGrossProfit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_profit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossProfit()))));
    }

    // add `operating_expense` to the URL query string
    if (getOperatingExpense() != null) {
      joiner.add(getOperatingExpense().toUrlQueryString(prefix + "operating_expense" + suffix));
    }

    // add `operating_income` to the URL query string
    if (getOperatingIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingIncome()))));
    }

    // add `non_operating_interest` to the URL query string
    if (getNonOperatingInterest() != null) {
      joiner.add(getNonOperatingInterest().toUrlQueryString(prefix + "non_operating_interest" + suffix));
    }

    // add `other_income_expense` to the URL query string
    if (getOtherIncomeExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_income_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherIncomeExpense()))));
    }

    // add `pretax_income` to the URL query string
    if (getPretaxIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spretax_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPretaxIncome()))));
    }

    // add `income_tax` to the URL query string
    if (getIncomeTax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sincome_tax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncomeTax()))));
    }

    // add `net_income` to the URL query string
    if (getNetIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncome()))));
    }

    // add `eps_basic` to the URL query string
    if (getEpsBasic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_basic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsBasic()))));
    }

    // add `eps_diluted` to the URL query string
    if (getEpsDiluted() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_diluted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsDiluted()))));
    }

    // add `basic_shares_outstanding` to the URL query string
    if (getBasicSharesOutstanding() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_shares_outstanding%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicSharesOutstanding()))));
    }

    // add `diluted_shares_outstanding` to the URL query string
    if (getDilutedSharesOutstanding() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_shares_outstanding%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedSharesOutstanding()))));
    }

    // add `ebit` to the URL query string
    if (getEbit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sebit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEbit()))));
    }

    // add `ebitda` to the URL query string
    if (getEbitda() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sebitda%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEbitda()))));
    }

    // add `net_income_continuous_operations` to the URL query string
    if (getNetIncomeContinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_continuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeContinuousOperations()))));
    }

    // add `minority_interests` to the URL query string
    if (getMinorityInterests() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminority_interests%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinorityInterests()))));
    }

    // add `preferred_stock_dividends` to the URL query string
    if (getPreferredStockDividends() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_dividends%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockDividends()))));
    }

    return joiner.toString();
  }
}

