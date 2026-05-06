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
 * Other income and expenses information
 */
@JsonPropertyOrder({
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_OTHER_INCOME_EXPENSE,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_OTHER_NON_OPERATING_INCOME_EXPENSES,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_SPECIAL_INCOME_CHARGES,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_GAIN_ON_SALE_OF_PPE,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_GAIN_ON_SALE_OF_BUSINESS,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_GAIN_ON_SALE_OF_SECURITY,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_OTHER_SPECIAL_CHARGES,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_WRITE_OFF,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_IMPAIRMENT_OF_CAPITAL_ASSETS,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_RESTRUCTURING_AND_MERGER_ACQUISITION,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_SECURITIES_AMORTIZATION,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST_NET_OF_TAX,
  IncomeStatementItemOtherIncomeAndExpenses.JSON_PROPERTY_TOTAL_OTHER_FINANCE_COST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemOtherIncomeAndExpenses {
  public static final String JSON_PROPERTY_OTHER_INCOME_EXPENSE = "other_income_expense";
  @javax.annotation.Nullable
  private Double otherIncomeExpense;

  public static final String JSON_PROPERTY_OTHER_NON_OPERATING_INCOME_EXPENSES = "other_non_operating_income_expenses";
  @javax.annotation.Nullable
  private Double otherNonOperatingIncomeExpenses;

  public static final String JSON_PROPERTY_SPECIAL_INCOME_CHARGES = "special_income_charges";
  @javax.annotation.Nullable
  private Double specialIncomeCharges;

  public static final String JSON_PROPERTY_GAIN_ON_SALE_OF_PPE = "gain_on_sale_of_ppe";
  @javax.annotation.Nullable
  private Double gainOnSaleOfPpe;

  public static final String JSON_PROPERTY_GAIN_ON_SALE_OF_BUSINESS = "gain_on_sale_of_business";
  @javax.annotation.Nullable
  private Double gainOnSaleOfBusiness;

  public static final String JSON_PROPERTY_GAIN_ON_SALE_OF_SECURITY = "gain_on_sale_of_security";
  @javax.annotation.Nullable
  private Double gainOnSaleOfSecurity;

  public static final String JSON_PROPERTY_OTHER_SPECIAL_CHARGES = "other_special_charges";
  @javax.annotation.Nullable
  private Double otherSpecialCharges;

  public static final String JSON_PROPERTY_WRITE_OFF = "write_off";
  @javax.annotation.Nullable
  private Double writeOff;

  public static final String JSON_PROPERTY_IMPAIRMENT_OF_CAPITAL_ASSETS = "impairment_of_capital_assets";
  @javax.annotation.Nullable
  private Double impairmentOfCapitalAssets;

  public static final String JSON_PROPERTY_RESTRUCTURING_AND_MERGER_ACQUISITION = "restructuring_and_merger_acquisition";
  @javax.annotation.Nullable
  private Double restructuringAndMergerAcquisition;

  public static final String JSON_PROPERTY_SECURITIES_AMORTIZATION = "securities_amortization";
  @javax.annotation.Nullable
  private Double securitiesAmortization;

  public static final String JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST = "earnings_from_equity_interest";
  @javax.annotation.Nullable
  private Double earningsFromEquityInterest;

  public static final String JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST_NET_OF_TAX = "earnings_from_equity_interest_net_of_tax";
  @javax.annotation.Nullable
  private Double earningsFromEquityInterestNetOfTax;

  public static final String JSON_PROPERTY_TOTAL_OTHER_FINANCE_COST = "total_other_finance_cost";
  @javax.annotation.Nullable
  private Double totalOtherFinanceCost;

  public IncomeStatementItemOtherIncomeAndExpenses() { 
  }

  public IncomeStatementItemOtherIncomeAndExpenses otherIncomeExpense(@javax.annotation.Nullable Double otherIncomeExpense) {
    this.otherIncomeExpense = otherIncomeExpense;
    return this;
  }

  /**
   * Other income expense
   * @return otherIncomeExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherIncomeExpense() {
    return otherIncomeExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherIncomeExpense(@javax.annotation.Nullable Double otherIncomeExpense) {
    this.otherIncomeExpense = otherIncomeExpense;
  }


  public IncomeStatementItemOtherIncomeAndExpenses otherNonOperatingIncomeExpenses(@javax.annotation.Nullable Double otherNonOperatingIncomeExpenses) {
    this.otherNonOperatingIncomeExpenses = otherNonOperatingIncomeExpenses;
    return this;
  }

  /**
   * Other non operating income expenses
   * @return otherNonOperatingIncomeExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_OPERATING_INCOME_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonOperatingIncomeExpenses() {
    return otherNonOperatingIncomeExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_OPERATING_INCOME_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonOperatingIncomeExpenses(@javax.annotation.Nullable Double otherNonOperatingIncomeExpenses) {
    this.otherNonOperatingIncomeExpenses = otherNonOperatingIncomeExpenses;
  }


  public IncomeStatementItemOtherIncomeAndExpenses specialIncomeCharges(@javax.annotation.Nullable Double specialIncomeCharges) {
    this.specialIncomeCharges = specialIncomeCharges;
    return this;
  }

  /**
   * Special income charges
   * @return specialIncomeCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSpecialIncomeCharges() {
    return specialIncomeCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialIncomeCharges(@javax.annotation.Nullable Double specialIncomeCharges) {
    this.specialIncomeCharges = specialIncomeCharges;
  }


  public IncomeStatementItemOtherIncomeAndExpenses gainOnSaleOfPpe(@javax.annotation.Nullable Double gainOnSaleOfPpe) {
    this.gainOnSaleOfPpe = gainOnSaleOfPpe;
    return this;
  }

  /**
   * Gain on sale of PPE
   * @return gainOnSaleOfPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainOnSaleOfPpe() {
    return gainOnSaleOfPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainOnSaleOfPpe(@javax.annotation.Nullable Double gainOnSaleOfPpe) {
    this.gainOnSaleOfPpe = gainOnSaleOfPpe;
  }


  public IncomeStatementItemOtherIncomeAndExpenses gainOnSaleOfBusiness(@javax.annotation.Nullable Double gainOnSaleOfBusiness) {
    this.gainOnSaleOfBusiness = gainOnSaleOfBusiness;
    return this;
  }

  /**
   * Gain on sale of business
   * @return gainOnSaleOfBusiness
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainOnSaleOfBusiness() {
    return gainOnSaleOfBusiness;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainOnSaleOfBusiness(@javax.annotation.Nullable Double gainOnSaleOfBusiness) {
    this.gainOnSaleOfBusiness = gainOnSaleOfBusiness;
  }


  public IncomeStatementItemOtherIncomeAndExpenses gainOnSaleOfSecurity(@javax.annotation.Nullable Double gainOnSaleOfSecurity) {
    this.gainOnSaleOfSecurity = gainOnSaleOfSecurity;
    return this;
  }

  /**
   * Gain on sale of security
   * @return gainOnSaleOfSecurity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainOnSaleOfSecurity() {
    return gainOnSaleOfSecurity;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_ON_SALE_OF_SECURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainOnSaleOfSecurity(@javax.annotation.Nullable Double gainOnSaleOfSecurity) {
    this.gainOnSaleOfSecurity = gainOnSaleOfSecurity;
  }


  public IncomeStatementItemOtherIncomeAndExpenses otherSpecialCharges(@javax.annotation.Nullable Double otherSpecialCharges) {
    this.otherSpecialCharges = otherSpecialCharges;
    return this;
  }

  /**
   * Other special charges
   * @return otherSpecialCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_SPECIAL_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherSpecialCharges() {
    return otherSpecialCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_SPECIAL_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherSpecialCharges(@javax.annotation.Nullable Double otherSpecialCharges) {
    this.otherSpecialCharges = otherSpecialCharges;
  }


  public IncomeStatementItemOtherIncomeAndExpenses writeOff(@javax.annotation.Nullable Double writeOff) {
    this.writeOff = writeOff;
    return this;
  }

  /**
   * Write off
   * @return writeOff
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WRITE_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWriteOff() {
    return writeOff;
  }


  @JsonProperty(value = JSON_PROPERTY_WRITE_OFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWriteOff(@javax.annotation.Nullable Double writeOff) {
    this.writeOff = writeOff;
  }


  public IncomeStatementItemOtherIncomeAndExpenses impairmentOfCapitalAssets(@javax.annotation.Nullable Double impairmentOfCapitalAssets) {
    this.impairmentOfCapitalAssets = impairmentOfCapitalAssets;
    return this;
  }

  /**
   * Impairment of capital assets
   * @return impairmentOfCapitalAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMPAIRMENT_OF_CAPITAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getImpairmentOfCapitalAssets() {
    return impairmentOfCapitalAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPAIRMENT_OF_CAPITAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpairmentOfCapitalAssets(@javax.annotation.Nullable Double impairmentOfCapitalAssets) {
    this.impairmentOfCapitalAssets = impairmentOfCapitalAssets;
  }


  public IncomeStatementItemOtherIncomeAndExpenses restructuringAndMergerAcquisition(@javax.annotation.Nullable Double restructuringAndMergerAcquisition) {
    this.restructuringAndMergerAcquisition = restructuringAndMergerAcquisition;
    return this;
  }

  /**
   * Restructuring and merger acquisition
   * @return restructuringAndMergerAcquisition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESTRUCTURING_AND_MERGER_ACQUISITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRestructuringAndMergerAcquisition() {
    return restructuringAndMergerAcquisition;
  }


  @JsonProperty(value = JSON_PROPERTY_RESTRUCTURING_AND_MERGER_ACQUISITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestructuringAndMergerAcquisition(@javax.annotation.Nullable Double restructuringAndMergerAcquisition) {
    this.restructuringAndMergerAcquisition = restructuringAndMergerAcquisition;
  }


  public IncomeStatementItemOtherIncomeAndExpenses securitiesAmortization(@javax.annotation.Nullable Double securitiesAmortization) {
    this.securitiesAmortization = securitiesAmortization;
    return this;
  }

  /**
   * Securities amortization
   * @return securitiesAmortization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECURITIES_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSecuritiesAmortization() {
    return securitiesAmortization;
  }


  @JsonProperty(value = JSON_PROPERTY_SECURITIES_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecuritiesAmortization(@javax.annotation.Nullable Double securitiesAmortization) {
    this.securitiesAmortization = securitiesAmortization;
  }


  public IncomeStatementItemOtherIncomeAndExpenses earningsFromEquityInterest(@javax.annotation.Nullable Double earningsFromEquityInterest) {
    this.earningsFromEquityInterest = earningsFromEquityInterest;
    return this;
  }

  /**
   * Earnings from equity interest
   * @return earningsFromEquityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEarningsFromEquityInterest() {
    return earningsFromEquityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarningsFromEquityInterest(@javax.annotation.Nullable Double earningsFromEquityInterest) {
    this.earningsFromEquityInterest = earningsFromEquityInterest;
  }


  public IncomeStatementItemOtherIncomeAndExpenses earningsFromEquityInterestNetOfTax(@javax.annotation.Nullable Double earningsFromEquityInterestNetOfTax) {
    this.earningsFromEquityInterestNetOfTax = earningsFromEquityInterestNetOfTax;
    return this;
  }

  /**
   * Earnings from equity interest net of tax
   * @return earningsFromEquityInterestNetOfTax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST_NET_OF_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEarningsFromEquityInterestNetOfTax() {
    return earningsFromEquityInterestNetOfTax;
  }


  @JsonProperty(value = JSON_PROPERTY_EARNINGS_FROM_EQUITY_INTEREST_NET_OF_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarningsFromEquityInterestNetOfTax(@javax.annotation.Nullable Double earningsFromEquityInterestNetOfTax) {
    this.earningsFromEquityInterestNetOfTax = earningsFromEquityInterestNetOfTax;
  }


  public IncomeStatementItemOtherIncomeAndExpenses totalOtherFinanceCost(@javax.annotation.Nullable Double totalOtherFinanceCost) {
    this.totalOtherFinanceCost = totalOtherFinanceCost;
    return this;
  }

  /**
   * Total other finance cost
   * @return totalOtherFinanceCost
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_OTHER_FINANCE_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalOtherFinanceCost() {
    return totalOtherFinanceCost;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_OTHER_FINANCE_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalOtherFinanceCost(@javax.annotation.Nullable Double totalOtherFinanceCost) {
    this.totalOtherFinanceCost = totalOtherFinanceCost;
  }


  /**
   * Return true if this IncomeStatementItem_other_income_and_expenses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemOtherIncomeAndExpenses incomeStatementItemOtherIncomeAndExpenses = (IncomeStatementItemOtherIncomeAndExpenses) o;
    return Objects.equals(this.otherIncomeExpense, incomeStatementItemOtherIncomeAndExpenses.otherIncomeExpense) &&
        Objects.equals(this.otherNonOperatingIncomeExpenses, incomeStatementItemOtherIncomeAndExpenses.otherNonOperatingIncomeExpenses) &&
        Objects.equals(this.specialIncomeCharges, incomeStatementItemOtherIncomeAndExpenses.specialIncomeCharges) &&
        Objects.equals(this.gainOnSaleOfPpe, incomeStatementItemOtherIncomeAndExpenses.gainOnSaleOfPpe) &&
        Objects.equals(this.gainOnSaleOfBusiness, incomeStatementItemOtherIncomeAndExpenses.gainOnSaleOfBusiness) &&
        Objects.equals(this.gainOnSaleOfSecurity, incomeStatementItemOtherIncomeAndExpenses.gainOnSaleOfSecurity) &&
        Objects.equals(this.otherSpecialCharges, incomeStatementItemOtherIncomeAndExpenses.otherSpecialCharges) &&
        Objects.equals(this.writeOff, incomeStatementItemOtherIncomeAndExpenses.writeOff) &&
        Objects.equals(this.impairmentOfCapitalAssets, incomeStatementItemOtherIncomeAndExpenses.impairmentOfCapitalAssets) &&
        Objects.equals(this.restructuringAndMergerAcquisition, incomeStatementItemOtherIncomeAndExpenses.restructuringAndMergerAcquisition) &&
        Objects.equals(this.securitiesAmortization, incomeStatementItemOtherIncomeAndExpenses.securitiesAmortization) &&
        Objects.equals(this.earningsFromEquityInterest, incomeStatementItemOtherIncomeAndExpenses.earningsFromEquityInterest) &&
        Objects.equals(this.earningsFromEquityInterestNetOfTax, incomeStatementItemOtherIncomeAndExpenses.earningsFromEquityInterestNetOfTax) &&
        Objects.equals(this.totalOtherFinanceCost, incomeStatementItemOtherIncomeAndExpenses.totalOtherFinanceCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherIncomeExpense, otherNonOperatingIncomeExpenses, specialIncomeCharges, gainOnSaleOfPpe, gainOnSaleOfBusiness, gainOnSaleOfSecurity, otherSpecialCharges, writeOff, impairmentOfCapitalAssets, restructuringAndMergerAcquisition, securitiesAmortization, earningsFromEquityInterest, earningsFromEquityInterestNetOfTax, totalOtherFinanceCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemOtherIncomeAndExpenses {\n");
    sb.append("    otherIncomeExpense: ").append(toIndentedString(otherIncomeExpense)).append("\n");
    sb.append("    otherNonOperatingIncomeExpenses: ").append(toIndentedString(otherNonOperatingIncomeExpenses)).append("\n");
    sb.append("    specialIncomeCharges: ").append(toIndentedString(specialIncomeCharges)).append("\n");
    sb.append("    gainOnSaleOfPpe: ").append(toIndentedString(gainOnSaleOfPpe)).append("\n");
    sb.append("    gainOnSaleOfBusiness: ").append(toIndentedString(gainOnSaleOfBusiness)).append("\n");
    sb.append("    gainOnSaleOfSecurity: ").append(toIndentedString(gainOnSaleOfSecurity)).append("\n");
    sb.append("    otherSpecialCharges: ").append(toIndentedString(otherSpecialCharges)).append("\n");
    sb.append("    writeOff: ").append(toIndentedString(writeOff)).append("\n");
    sb.append("    impairmentOfCapitalAssets: ").append(toIndentedString(impairmentOfCapitalAssets)).append("\n");
    sb.append("    restructuringAndMergerAcquisition: ").append(toIndentedString(restructuringAndMergerAcquisition)).append("\n");
    sb.append("    securitiesAmortization: ").append(toIndentedString(securitiesAmortization)).append("\n");
    sb.append("    earningsFromEquityInterest: ").append(toIndentedString(earningsFromEquityInterest)).append("\n");
    sb.append("    earningsFromEquityInterestNetOfTax: ").append(toIndentedString(earningsFromEquityInterestNetOfTax)).append("\n");
    sb.append("    totalOtherFinanceCost: ").append(toIndentedString(totalOtherFinanceCost)).append("\n");
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

    // add `other_income_expense` to the URL query string
    if (getOtherIncomeExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_income_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherIncomeExpense()))));
    }

    // add `other_non_operating_income_expenses` to the URL query string
    if (getOtherNonOperatingIncomeExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_operating_income_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonOperatingIncomeExpenses()))));
    }

    // add `special_income_charges` to the URL query string
    if (getSpecialIncomeCharges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sspecial_income_charges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSpecialIncomeCharges()))));
    }

    // add `gain_on_sale_of_ppe` to the URL query string
    if (getGainOnSaleOfPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_on_sale_of_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainOnSaleOfPpe()))));
    }

    // add `gain_on_sale_of_business` to the URL query string
    if (getGainOnSaleOfBusiness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_on_sale_of_business%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainOnSaleOfBusiness()))));
    }

    // add `gain_on_sale_of_security` to the URL query string
    if (getGainOnSaleOfSecurity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_on_sale_of_security%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainOnSaleOfSecurity()))));
    }

    // add `other_special_charges` to the URL query string
    if (getOtherSpecialCharges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_special_charges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherSpecialCharges()))));
    }

    // add `write_off` to the URL query string
    if (getWriteOff() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swrite_off%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWriteOff()))));
    }

    // add `impairment_of_capital_assets` to the URL query string
    if (getImpairmentOfCapitalAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simpairment_of_capital_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImpairmentOfCapitalAssets()))));
    }

    // add `restructuring_and_merger_acquisition` to the URL query string
    if (getRestructuringAndMergerAcquisition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srestructuring_and_merger_acquisition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRestructuringAndMergerAcquisition()))));
    }

    // add `securities_amortization` to the URL query string
    if (getSecuritiesAmortization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecurities_amortization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecuritiesAmortization()))));
    }

    // add `earnings_from_equity_interest` to the URL query string
    if (getEarningsFromEquityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%searnings_from_equity_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEarningsFromEquityInterest()))));
    }

    // add `earnings_from_equity_interest_net_of_tax` to the URL query string
    if (getEarningsFromEquityInterestNetOfTax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%searnings_from_equity_interest_net_of_tax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEarningsFromEquityInterestNetOfTax()))));
    }

    // add `total_other_finance_cost` to the URL query string
    if (getTotalOtherFinanceCost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_other_finance_cost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalOtherFinanceCost()))));
    }

    return joiner.toString();
  }
}

