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
import com.twelvedata.client.model.IncomeStatementItemDepreciation;
import com.twelvedata.client.model.IncomeStatementItemDepreciationAndAmortization;
import com.twelvedata.client.model.IncomeStatementItemDividendsAndShares;
import com.twelvedata.client.model.IncomeStatementItemEarningsPerShare;
import com.twelvedata.client.model.IncomeStatementItemEbitda;
import com.twelvedata.client.model.IncomeStatementItemExpenses;
import com.twelvedata.client.model.IncomeStatementItemGrossProfit;
import com.twelvedata.client.model.IncomeStatementItemInterestIncomeAndExpense;
import com.twelvedata.client.model.IncomeStatementItemNetIncome;
import com.twelvedata.client.model.IncomeStatementItemOperatingIncome;
import com.twelvedata.client.model.IncomeStatementItemOtherIncomeAndExpenses;
import com.twelvedata.client.model.IncomeStatementItemPretaxIncome;
import com.twelvedata.client.model.IncomeStatementItemRevenue;
import com.twelvedata.client.model.IncomeStatementItemSpecialIncomeCharges;
import com.twelvedata.client.model.IncomeStatementItemTaxes;
import com.twelvedata.client.model.IncomeStatementItemUnusualItems;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * IncomeStatementItem represents a single income statement record
 */
@JsonPropertyOrder({
  IncomeStatementItem.JSON_PROPERTY_FISCAL_DATE,
  IncomeStatementItem.JSON_PROPERTY_YEAR,
  IncomeStatementItem.JSON_PROPERTY_REVENUE,
  IncomeStatementItem.JSON_PROPERTY_GROSS_PROFIT,
  IncomeStatementItem.JSON_PROPERTY_OPERATING_INCOME,
  IncomeStatementItem.JSON_PROPERTY_NET_INCOME,
  IncomeStatementItem.JSON_PROPERTY_EARNINGS_PER_SHARE,
  IncomeStatementItem.JSON_PROPERTY_EXPENSES,
  IncomeStatementItem.JSON_PROPERTY_INTEREST_INCOME_AND_EXPENSE,
  IncomeStatementItem.JSON_PROPERTY_OTHER_INCOME_AND_EXPENSES,
  IncomeStatementItem.JSON_PROPERTY_TAXES,
  IncomeStatementItem.JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION,
  IncomeStatementItem.JSON_PROPERTY_EBITDA,
  IncomeStatementItem.JSON_PROPERTY_DIVIDENDS_AND_SHARES,
  IncomeStatementItem.JSON_PROPERTY_UNUSUAL_ITEMS,
  IncomeStatementItem.JSON_PROPERTY_DEPRECIATION,
  IncomeStatementItem.JSON_PROPERTY_PRETAX_INCOME,
  IncomeStatementItem.JSON_PROPERTY_SPECIAL_INCOME_CHARGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItem {
  public static final String JSON_PROPERTY_FISCAL_DATE = "fiscal_date";
  @javax.annotation.Nonnull
  private String fiscalDate;

  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nonnull
  private Long year;

  public static final String JSON_PROPERTY_REVENUE = "revenue";
  @javax.annotation.Nullable
  private IncomeStatementItemRevenue revenue;

  public static final String JSON_PROPERTY_GROSS_PROFIT = "gross_profit";
  @javax.annotation.Nullable
  private IncomeStatementItemGrossProfit grossProfit;

  public static final String JSON_PROPERTY_OPERATING_INCOME = "operating_income";
  @javax.annotation.Nullable
  private IncomeStatementItemOperatingIncome operatingIncome;

  public static final String JSON_PROPERTY_NET_INCOME = "net_income";
  @javax.annotation.Nullable
  private IncomeStatementItemNetIncome netIncome;

  public static final String JSON_PROPERTY_EARNINGS_PER_SHARE = "earnings_per_share";
  @javax.annotation.Nullable
  private IncomeStatementItemEarningsPerShare earningsPerShare;

  public static final String JSON_PROPERTY_EXPENSES = "expenses";
  @javax.annotation.Nullable
  private IncomeStatementItemExpenses expenses;

  public static final String JSON_PROPERTY_INTEREST_INCOME_AND_EXPENSE = "interest_income_and_expense";
  @javax.annotation.Nullable
  private IncomeStatementItemInterestIncomeAndExpense interestIncomeAndExpense;

  public static final String JSON_PROPERTY_OTHER_INCOME_AND_EXPENSES = "other_income_and_expenses";
  @javax.annotation.Nullable
  private IncomeStatementItemOtherIncomeAndExpenses otherIncomeAndExpenses;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  @javax.annotation.Nullable
  private IncomeStatementItemTaxes taxes;

  public static final String JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION = "depreciation_and_amortization";
  @javax.annotation.Nullable
  private IncomeStatementItemDepreciationAndAmortization depreciationAndAmortization;

  public static final String JSON_PROPERTY_EBITDA = "ebitda";
  @javax.annotation.Nullable
  private IncomeStatementItemEbitda ebitda;

  public static final String JSON_PROPERTY_DIVIDENDS_AND_SHARES = "dividends_and_shares";
  @javax.annotation.Nullable
  private IncomeStatementItemDividendsAndShares dividendsAndShares;

  public static final String JSON_PROPERTY_UNUSUAL_ITEMS = "unusual_items";
  @javax.annotation.Nullable
  private IncomeStatementItemUnusualItems unusualItems;

  public static final String JSON_PROPERTY_DEPRECIATION = "depreciation";
  @javax.annotation.Nullable
  private IncomeStatementItemDepreciation depreciation;

  public static final String JSON_PROPERTY_PRETAX_INCOME = "pretax_income";
  @javax.annotation.Nullable
  private IncomeStatementItemPretaxIncome pretaxIncome;

  public static final String JSON_PROPERTY_SPECIAL_INCOME_CHARGES = "special_income_charges";
  @javax.annotation.Nullable
  private IncomeStatementItemSpecialIncomeCharges specialIncomeCharges;

  public IncomeStatementItem() { 
  }

  public IncomeStatementItem fiscalDate(@javax.annotation.Nonnull String fiscalDate) {
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


  public IncomeStatementItem year(@javax.annotation.Nonnull Long year) {
    this.year = year;
    return this;
  }

  /**
   * Fiscal year
   * @return year
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_YEAR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getYear() {
    return year;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setYear(@javax.annotation.Nonnull Long year) {
    this.year = year;
  }


  public IncomeStatementItem revenue(@javax.annotation.Nullable IncomeStatementItemRevenue revenue) {
    this.revenue = revenue;
    return this;
  }

  /**
   * Get revenue
   * @return revenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemRevenue getRevenue() {
    return revenue;
  }


  @JsonProperty(value = JSON_PROPERTY_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenue(@javax.annotation.Nullable IncomeStatementItemRevenue revenue) {
    this.revenue = revenue;
  }


  public IncomeStatementItem grossProfit(@javax.annotation.Nullable IncomeStatementItemGrossProfit grossProfit) {
    this.grossProfit = grossProfit;
    return this;
  }

  /**
   * Get grossProfit
   * @return grossProfit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemGrossProfit getGrossProfit() {
    return grossProfit;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossProfit(@javax.annotation.Nullable IncomeStatementItemGrossProfit grossProfit) {
    this.grossProfit = grossProfit;
  }


  public IncomeStatementItem operatingIncome(@javax.annotation.Nullable IncomeStatementItemOperatingIncome operatingIncome) {
    this.operatingIncome = operatingIncome;
    return this;
  }

  /**
   * Get operatingIncome
   * @return operatingIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemOperatingIncome getOperatingIncome() {
    return operatingIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingIncome(@javax.annotation.Nullable IncomeStatementItemOperatingIncome operatingIncome) {
    this.operatingIncome = operatingIncome;
  }


  public IncomeStatementItem netIncome(@javax.annotation.Nullable IncomeStatementItemNetIncome netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Get netIncome
   * @return netIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemNetIncome getNetIncome() {
    return netIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncome(@javax.annotation.Nullable IncomeStatementItemNetIncome netIncome) {
    this.netIncome = netIncome;
  }


  public IncomeStatementItem earningsPerShare(@javax.annotation.Nullable IncomeStatementItemEarningsPerShare earningsPerShare) {
    this.earningsPerShare = earningsPerShare;
    return this;
  }

  /**
   * Get earningsPerShare
   * @return earningsPerShare
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EARNINGS_PER_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemEarningsPerShare getEarningsPerShare() {
    return earningsPerShare;
  }


  @JsonProperty(value = JSON_PROPERTY_EARNINGS_PER_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarningsPerShare(@javax.annotation.Nullable IncomeStatementItemEarningsPerShare earningsPerShare) {
    this.earningsPerShare = earningsPerShare;
  }


  public IncomeStatementItem expenses(@javax.annotation.Nullable IncomeStatementItemExpenses expenses) {
    this.expenses = expenses;
    return this;
  }

  /**
   * Get expenses
   * @return expenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemExpenses getExpenses() {
    return expenses;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenses(@javax.annotation.Nullable IncomeStatementItemExpenses expenses) {
    this.expenses = expenses;
  }


  public IncomeStatementItem interestIncomeAndExpense(@javax.annotation.Nullable IncomeStatementItemInterestIncomeAndExpense interestIncomeAndExpense) {
    this.interestIncomeAndExpense = interestIncomeAndExpense;
    return this;
  }

  /**
   * Get interestIncomeAndExpense
   * @return interestIncomeAndExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME_AND_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemInterestIncomeAndExpense getInterestIncomeAndExpense() {
    return interestIncomeAndExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME_AND_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestIncomeAndExpense(@javax.annotation.Nullable IncomeStatementItemInterestIncomeAndExpense interestIncomeAndExpense) {
    this.interestIncomeAndExpense = interestIncomeAndExpense;
  }


  public IncomeStatementItem otherIncomeAndExpenses(@javax.annotation.Nullable IncomeStatementItemOtherIncomeAndExpenses otherIncomeAndExpenses) {
    this.otherIncomeAndExpenses = otherIncomeAndExpenses;
    return this;
  }

  /**
   * Get otherIncomeAndExpenses
   * @return otherIncomeAndExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_AND_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemOtherIncomeAndExpenses getOtherIncomeAndExpenses() {
    return otherIncomeAndExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_AND_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherIncomeAndExpenses(@javax.annotation.Nullable IncomeStatementItemOtherIncomeAndExpenses otherIncomeAndExpenses) {
    this.otherIncomeAndExpenses = otherIncomeAndExpenses;
  }


  public IncomeStatementItem taxes(@javax.annotation.Nullable IncomeStatementItemTaxes taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Get taxes
   * @return taxes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemTaxes getTaxes() {
    return taxes;
  }


  @JsonProperty(value = JSON_PROPERTY_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(@javax.annotation.Nullable IncomeStatementItemTaxes taxes) {
    this.taxes = taxes;
  }


  public IncomeStatementItem depreciationAndAmortization(@javax.annotation.Nullable IncomeStatementItemDepreciationAndAmortization depreciationAndAmortization) {
    this.depreciationAndAmortization = depreciationAndAmortization;
    return this;
  }

  /**
   * Get depreciationAndAmortization
   * @return depreciationAndAmortization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemDepreciationAndAmortization getDepreciationAndAmortization() {
    return depreciationAndAmortization;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAndAmortization(@javax.annotation.Nullable IncomeStatementItemDepreciationAndAmortization depreciationAndAmortization) {
    this.depreciationAndAmortization = depreciationAndAmortization;
  }


  public IncomeStatementItem ebitda(@javax.annotation.Nullable IncomeStatementItemEbitda ebitda) {
    this.ebitda = ebitda;
    return this;
  }

  /**
   * Get ebitda
   * @return ebitda
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemEbitda getEbitda() {
    return ebitda;
  }


  @JsonProperty(value = JSON_PROPERTY_EBITDA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitda(@javax.annotation.Nullable IncomeStatementItemEbitda ebitda) {
    this.ebitda = ebitda;
  }


  public IncomeStatementItem dividendsAndShares(@javax.annotation.Nullable IncomeStatementItemDividendsAndShares dividendsAndShares) {
    this.dividendsAndShares = dividendsAndShares;
    return this;
  }

  /**
   * Get dividendsAndShares
   * @return dividendsAndShares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_AND_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemDividendsAndShares getDividendsAndShares() {
    return dividendsAndShares;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_AND_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendsAndShares(@javax.annotation.Nullable IncomeStatementItemDividendsAndShares dividendsAndShares) {
    this.dividendsAndShares = dividendsAndShares;
  }


  public IncomeStatementItem unusualItems(@javax.annotation.Nullable IncomeStatementItemUnusualItems unusualItems) {
    this.unusualItems = unusualItems;
    return this;
  }

  /**
   * Get unusualItems
   * @return unusualItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemUnusualItems getUnusualItems() {
    return unusualItems;
  }


  @JsonProperty(value = JSON_PROPERTY_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnusualItems(@javax.annotation.Nullable IncomeStatementItemUnusualItems unusualItems) {
    this.unusualItems = unusualItems;
  }


  public IncomeStatementItem depreciation(@javax.annotation.Nullable IncomeStatementItemDepreciation depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Get depreciation
   * @return depreciation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemDepreciation getDepreciation() {
    return depreciation;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciation(@javax.annotation.Nullable IncomeStatementItemDepreciation depreciation) {
    this.depreciation = depreciation;
  }


  public IncomeStatementItem pretaxIncome(@javax.annotation.Nullable IncomeStatementItemPretaxIncome pretaxIncome) {
    this.pretaxIncome = pretaxIncome;
    return this;
  }

  /**
   * Get pretaxIncome
   * @return pretaxIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemPretaxIncome getPretaxIncome() {
    return pretaxIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPretaxIncome(@javax.annotation.Nullable IncomeStatementItemPretaxIncome pretaxIncome) {
    this.pretaxIncome = pretaxIncome;
  }


  public IncomeStatementItem specialIncomeCharges(@javax.annotation.Nullable IncomeStatementItemSpecialIncomeCharges specialIncomeCharges) {
    this.specialIncomeCharges = specialIncomeCharges;
    return this;
  }

  /**
   * Get specialIncomeCharges
   * @return specialIncomeCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemSpecialIncomeCharges getSpecialIncomeCharges() {
    return specialIncomeCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialIncomeCharges(@javax.annotation.Nullable IncomeStatementItemSpecialIncomeCharges specialIncomeCharges) {
    this.specialIncomeCharges = specialIncomeCharges;
  }


  /**
   * Return true if this IncomeStatementItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItem incomeStatementItem = (IncomeStatementItem) o;
    return Objects.equals(this.fiscalDate, incomeStatementItem.fiscalDate) &&
        Objects.equals(this.year, incomeStatementItem.year) &&
        Objects.equals(this.revenue, incomeStatementItem.revenue) &&
        Objects.equals(this.grossProfit, incomeStatementItem.grossProfit) &&
        Objects.equals(this.operatingIncome, incomeStatementItem.operatingIncome) &&
        Objects.equals(this.netIncome, incomeStatementItem.netIncome) &&
        Objects.equals(this.earningsPerShare, incomeStatementItem.earningsPerShare) &&
        Objects.equals(this.expenses, incomeStatementItem.expenses) &&
        Objects.equals(this.interestIncomeAndExpense, incomeStatementItem.interestIncomeAndExpense) &&
        Objects.equals(this.otherIncomeAndExpenses, incomeStatementItem.otherIncomeAndExpenses) &&
        Objects.equals(this.taxes, incomeStatementItem.taxes) &&
        Objects.equals(this.depreciationAndAmortization, incomeStatementItem.depreciationAndAmortization) &&
        Objects.equals(this.ebitda, incomeStatementItem.ebitda) &&
        Objects.equals(this.dividendsAndShares, incomeStatementItem.dividendsAndShares) &&
        Objects.equals(this.unusualItems, incomeStatementItem.unusualItems) &&
        Objects.equals(this.depreciation, incomeStatementItem.depreciation) &&
        Objects.equals(this.pretaxIncome, incomeStatementItem.pretaxIncome) &&
        Objects.equals(this.specialIncomeCharges, incomeStatementItem.specialIncomeCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalDate, year, revenue, grossProfit, operatingIncome, netIncome, earningsPerShare, expenses, interestIncomeAndExpense, otherIncomeAndExpenses, taxes, depreciationAndAmortization, ebitda, dividendsAndShares, unusualItems, depreciation, pretaxIncome, specialIncomeCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItem {\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    grossProfit: ").append(toIndentedString(grossProfit)).append("\n");
    sb.append("    operatingIncome: ").append(toIndentedString(operatingIncome)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    earningsPerShare: ").append(toIndentedString(earningsPerShare)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    interestIncomeAndExpense: ").append(toIndentedString(interestIncomeAndExpense)).append("\n");
    sb.append("    otherIncomeAndExpenses: ").append(toIndentedString(otherIncomeAndExpenses)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    depreciationAndAmortization: ").append(toIndentedString(depreciationAndAmortization)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    dividendsAndShares: ").append(toIndentedString(dividendsAndShares)).append("\n");
    sb.append("    unusualItems: ").append(toIndentedString(unusualItems)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    pretaxIncome: ").append(toIndentedString(pretaxIncome)).append("\n");
    sb.append("    specialIncomeCharges: ").append(toIndentedString(specialIncomeCharges)).append("\n");
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

    // add `year` to the URL query string
    if (getYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYear()))));
    }

    // add `revenue` to the URL query string
    if (getRevenue() != null) {
      joiner.add(getRevenue().toUrlQueryString(prefix + "revenue" + suffix));
    }

    // add `gross_profit` to the URL query string
    if (getGrossProfit() != null) {
      joiner.add(getGrossProfit().toUrlQueryString(prefix + "gross_profit" + suffix));
    }

    // add `operating_income` to the URL query string
    if (getOperatingIncome() != null) {
      joiner.add(getOperatingIncome().toUrlQueryString(prefix + "operating_income" + suffix));
    }

    // add `net_income` to the URL query string
    if (getNetIncome() != null) {
      joiner.add(getNetIncome().toUrlQueryString(prefix + "net_income" + suffix));
    }

    // add `earnings_per_share` to the URL query string
    if (getEarningsPerShare() != null) {
      joiner.add(getEarningsPerShare().toUrlQueryString(prefix + "earnings_per_share" + suffix));
    }

    // add `expenses` to the URL query string
    if (getExpenses() != null) {
      joiner.add(getExpenses().toUrlQueryString(prefix + "expenses" + suffix));
    }

    // add `interest_income_and_expense` to the URL query string
    if (getInterestIncomeAndExpense() != null) {
      joiner.add(getInterestIncomeAndExpense().toUrlQueryString(prefix + "interest_income_and_expense" + suffix));
    }

    // add `other_income_and_expenses` to the URL query string
    if (getOtherIncomeAndExpenses() != null) {
      joiner.add(getOtherIncomeAndExpenses().toUrlQueryString(prefix + "other_income_and_expenses" + suffix));
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      joiner.add(getTaxes().toUrlQueryString(prefix + "taxes" + suffix));
    }

    // add `depreciation_and_amortization` to the URL query string
    if (getDepreciationAndAmortization() != null) {
      joiner.add(getDepreciationAndAmortization().toUrlQueryString(prefix + "depreciation_and_amortization" + suffix));
    }

    // add `ebitda` to the URL query string
    if (getEbitda() != null) {
      joiner.add(getEbitda().toUrlQueryString(prefix + "ebitda" + suffix));
    }

    // add `dividends_and_shares` to the URL query string
    if (getDividendsAndShares() != null) {
      joiner.add(getDividendsAndShares().toUrlQueryString(prefix + "dividends_and_shares" + suffix));
    }

    // add `unusual_items` to the URL query string
    if (getUnusualItems() != null) {
      joiner.add(getUnusualItems().toUrlQueryString(prefix + "unusual_items" + suffix));
    }

    // add `depreciation` to the URL query string
    if (getDepreciation() != null) {
      joiner.add(getDepreciation().toUrlQueryString(prefix + "depreciation" + suffix));
    }

    // add `pretax_income` to the URL query string
    if (getPretaxIncome() != null) {
      joiner.add(getPretaxIncome().toUrlQueryString(prefix + "pretax_income" + suffix));
    }

    // add `special_income_charges` to the URL query string
    if (getSpecialIncomeCharges() != null) {
      joiner.add(getSpecialIncomeCharges().toUrlQueryString(prefix + "special_income_charges" + suffix));
    }

    return joiner.toString();
  }
}

