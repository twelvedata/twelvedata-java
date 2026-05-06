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
import com.twelvedata.client.model.AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Non-current liabilities information
 */
@JsonPropertyOrder({
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES_NET_MINORITY_INTEREST,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_LONG_TERM_PROVISIONS,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_NON_CURRENT_PENSION_AND_OTHER_POSTRETIREMENT_BENEFIT_PLANS,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_NON_CURRENT_ACCRUED_EXPENSES,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_DUE_TO_RELATED_PARTIES_NON_CURRENT,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_TRADE_AND_OTHER_PAYABLES_NON_CURRENT,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_NON_CURRENT_DEFERRED_LIABILITIES,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_NON_CURRENT_DEFERRED_REVENUE,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_LIABILITIES,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_PREFERRED_SECURITIES_OUTSIDE_STOCK_EQUITY,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_CAPITAL_LEASE_OBLIGATIONS,
  AssetsInfoLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_RESTRICTED_COMMON_STOCK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoLiabilitiesNonCurrentLiabilities {
  public static final String JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES_NET_MINORITY_INTEREST = "total_non_current_liabilities_net_minority_interest";
  @javax.annotation.Nullable
  private Double totalNonCurrentLiabilitiesNetMinorityInterest;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION = "long_term_debt_and_capital_lease_obligation";
  @javax.annotation.Nullable
  private AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation longTermDebtAndCapitalLeaseObligation;

  public static final String JSON_PROPERTY_LONG_TERM_PROVISIONS = "long_term_provisions";
  @javax.annotation.Nullable
  private Double longTermProvisions;

  public static final String JSON_PROPERTY_NON_CURRENT_PENSION_AND_OTHER_POSTRETIREMENT_BENEFIT_PLANS = "non_current_pension_and_other_postretirement_benefit_plans";
  @javax.annotation.Nullable
  private Double nonCurrentPensionAndOtherPostretirementBenefitPlans;

  public static final String JSON_PROPERTY_NON_CURRENT_ACCRUED_EXPENSES = "non_current_accrued_expenses";
  @javax.annotation.Nullable
  private Double nonCurrentAccruedExpenses;

  public static final String JSON_PROPERTY_DUE_TO_RELATED_PARTIES_NON_CURRENT = "due_to_related_parties_non_current";
  @javax.annotation.Nullable
  private Double dueToRelatedPartiesNonCurrent;

  public static final String JSON_PROPERTY_TRADE_AND_OTHER_PAYABLES_NON_CURRENT = "trade_and_other_payables_non_current";
  @javax.annotation.Nullable
  private Double tradeAndOtherPayablesNonCurrent;

  public static final String JSON_PROPERTY_NON_CURRENT_DEFERRED_LIABILITIES = "non_current_deferred_liabilities";
  @javax.annotation.Nullable
  private Double nonCurrentDeferredLiabilities;

  public static final String JSON_PROPERTY_NON_CURRENT_DEFERRED_REVENUE = "non_current_deferred_revenue";
  @javax.annotation.Nullable
  private Double nonCurrentDeferredRevenue;

  public static final String JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_LIABILITIES = "non_current_deferred_taxes_liabilities";
  @javax.annotation.Nullable
  private Double nonCurrentDeferredTaxesLiabilities;

  public static final String JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES = "other_non_current_liabilities";
  @javax.annotation.Nullable
  private Double otherNonCurrentLiabilities;

  public static final String JSON_PROPERTY_PREFERRED_SECURITIES_OUTSIDE_STOCK_EQUITY = "preferred_securities_outside_stock_equity";
  @javax.annotation.Nullable
  private Double preferredSecuritiesOutsideStockEquity;

  public static final String JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES = "derivative_product_liabilities";
  @javax.annotation.Nullable
  private Double derivativeProductLiabilities;

  public static final String JSON_PROPERTY_CAPITAL_LEASE_OBLIGATIONS = "capital_lease_obligations";
  @javax.annotation.Nullable
  private Double capitalLeaseObligations;

  public static final String JSON_PROPERTY_RESTRICTED_COMMON_STOCK = "restricted_common_stock";
  @javax.annotation.Nullable
  private Double restrictedCommonStock;

  public AssetsInfoLiabilitiesNonCurrentLiabilities() { 
  }

  public AssetsInfoLiabilitiesNonCurrentLiabilities totalNonCurrentLiabilitiesNetMinorityInterest(@javax.annotation.Nullable Double totalNonCurrentLiabilitiesNetMinorityInterest) {
    this.totalNonCurrentLiabilitiesNetMinorityInterest = totalNonCurrentLiabilitiesNetMinorityInterest;
    return this;
  }

  /**
   * Total non current liabilities net minority interest
   * @return totalNonCurrentLiabilitiesNetMinorityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalNonCurrentLiabilitiesNetMinorityInterest() {
    return totalNonCurrentLiabilitiesNetMinorityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNonCurrentLiabilitiesNetMinorityInterest(@javax.annotation.Nullable Double totalNonCurrentLiabilitiesNetMinorityInterest) {
    this.totalNonCurrentLiabilitiesNetMinorityInterest = totalNonCurrentLiabilitiesNetMinorityInterest;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities longTermDebtAndCapitalLeaseObligation(@javax.annotation.Nullable AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation longTermDebtAndCapitalLeaseObligation) {
    this.longTermDebtAndCapitalLeaseObligation = longTermDebtAndCapitalLeaseObligation;
    return this;
  }

  /**
   * Get longTermDebtAndCapitalLeaseObligation
   * @return longTermDebtAndCapitalLeaseObligation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation getLongTermDebtAndCapitalLeaseObligation() {
    return longTermDebtAndCapitalLeaseObligation;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermDebtAndCapitalLeaseObligation(@javax.annotation.Nullable AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation longTermDebtAndCapitalLeaseObligation) {
    this.longTermDebtAndCapitalLeaseObligation = longTermDebtAndCapitalLeaseObligation;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities longTermProvisions(@javax.annotation.Nullable Double longTermProvisions) {
    this.longTermProvisions = longTermProvisions;
    return this;
  }

  /**
   * Long term provisions
   * @return longTermProvisions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermProvisions() {
    return longTermProvisions;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermProvisions(@javax.annotation.Nullable Double longTermProvisions) {
    this.longTermProvisions = longTermProvisions;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentPensionAndOtherPostretirementBenefitPlans(@javax.annotation.Nullable Double nonCurrentPensionAndOtherPostretirementBenefitPlans) {
    this.nonCurrentPensionAndOtherPostretirementBenefitPlans = nonCurrentPensionAndOtherPostretirementBenefitPlans;
    return this;
  }

  /**
   * Non current pension and other postretirement benefit plans
   * @return nonCurrentPensionAndOtherPostretirementBenefitPlans
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_PENSION_AND_OTHER_POSTRETIREMENT_BENEFIT_PLANS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentPensionAndOtherPostretirementBenefitPlans() {
    return nonCurrentPensionAndOtherPostretirementBenefitPlans;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_PENSION_AND_OTHER_POSTRETIREMENT_BENEFIT_PLANS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentPensionAndOtherPostretirementBenefitPlans(@javax.annotation.Nullable Double nonCurrentPensionAndOtherPostretirementBenefitPlans) {
    this.nonCurrentPensionAndOtherPostretirementBenefitPlans = nonCurrentPensionAndOtherPostretirementBenefitPlans;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentAccruedExpenses(@javax.annotation.Nullable Double nonCurrentAccruedExpenses) {
    this.nonCurrentAccruedExpenses = nonCurrentAccruedExpenses;
    return this;
  }

  /**
   * Non current accrued expenses
   * @return nonCurrentAccruedExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentAccruedExpenses() {
    return nonCurrentAccruedExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentAccruedExpenses(@javax.annotation.Nullable Double nonCurrentAccruedExpenses) {
    this.nonCurrentAccruedExpenses = nonCurrentAccruedExpenses;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities dueToRelatedPartiesNonCurrent(@javax.annotation.Nullable Double dueToRelatedPartiesNonCurrent) {
    this.dueToRelatedPartiesNonCurrent = dueToRelatedPartiesNonCurrent;
    return this;
  }

  /**
   * Due to related parties non current
   * @return dueToRelatedPartiesNonCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUE_TO_RELATED_PARTIES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDueToRelatedPartiesNonCurrent() {
    return dueToRelatedPartiesNonCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_TO_RELATED_PARTIES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueToRelatedPartiesNonCurrent(@javax.annotation.Nullable Double dueToRelatedPartiesNonCurrent) {
    this.dueToRelatedPartiesNonCurrent = dueToRelatedPartiesNonCurrent;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities tradeAndOtherPayablesNonCurrent(@javax.annotation.Nullable Double tradeAndOtherPayablesNonCurrent) {
    this.tradeAndOtherPayablesNonCurrent = tradeAndOtherPayablesNonCurrent;
    return this;
  }

  /**
   * Trade and other payables non current
   * @return tradeAndOtherPayablesNonCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRADE_AND_OTHER_PAYABLES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTradeAndOtherPayablesNonCurrent() {
    return tradeAndOtherPayablesNonCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_TRADE_AND_OTHER_PAYABLES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeAndOtherPayablesNonCurrent(@javax.annotation.Nullable Double tradeAndOtherPayablesNonCurrent) {
    this.tradeAndOtherPayablesNonCurrent = tradeAndOtherPayablesNonCurrent;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentDeferredLiabilities(@javax.annotation.Nullable Double nonCurrentDeferredLiabilities) {
    this.nonCurrentDeferredLiabilities = nonCurrentDeferredLiabilities;
    return this;
  }

  /**
   * Non current deferred liabilities
   * @return nonCurrentDeferredLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentDeferredLiabilities() {
    return nonCurrentDeferredLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentDeferredLiabilities(@javax.annotation.Nullable Double nonCurrentDeferredLiabilities) {
    this.nonCurrentDeferredLiabilities = nonCurrentDeferredLiabilities;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentDeferredRevenue(@javax.annotation.Nullable Double nonCurrentDeferredRevenue) {
    this.nonCurrentDeferredRevenue = nonCurrentDeferredRevenue;
    return this;
  }

  /**
   * Non current deferred revenue
   * @return nonCurrentDeferredRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentDeferredRevenue() {
    return nonCurrentDeferredRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentDeferredRevenue(@javax.annotation.Nullable Double nonCurrentDeferredRevenue) {
    this.nonCurrentDeferredRevenue = nonCurrentDeferredRevenue;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentDeferredTaxesLiabilities(@javax.annotation.Nullable Double nonCurrentDeferredTaxesLiabilities) {
    this.nonCurrentDeferredTaxesLiabilities = nonCurrentDeferredTaxesLiabilities;
    return this;
  }

  /**
   * Non current deferred taxes liabilities
   * @return nonCurrentDeferredTaxesLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentDeferredTaxesLiabilities() {
    return nonCurrentDeferredTaxesLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentDeferredTaxesLiabilities(@javax.annotation.Nullable Double nonCurrentDeferredTaxesLiabilities) {
    this.nonCurrentDeferredTaxesLiabilities = nonCurrentDeferredTaxesLiabilities;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities otherNonCurrentLiabilities(@javax.annotation.Nullable Double otherNonCurrentLiabilities) {
    this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
    return this;
  }

  /**
   * Other non current liabilities
   * @return otherNonCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonCurrentLiabilities() {
    return otherNonCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonCurrentLiabilities(@javax.annotation.Nullable Double otherNonCurrentLiabilities) {
    this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities preferredSecuritiesOutsideStockEquity(@javax.annotation.Nullable Double preferredSecuritiesOutsideStockEquity) {
    this.preferredSecuritiesOutsideStockEquity = preferredSecuritiesOutsideStockEquity;
    return this;
  }

  /**
   * Preferred securities outside stock equity
   * @return preferredSecuritiesOutsideStockEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_SECURITIES_OUTSIDE_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredSecuritiesOutsideStockEquity() {
    return preferredSecuritiesOutsideStockEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_SECURITIES_OUTSIDE_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredSecuritiesOutsideStockEquity(@javax.annotation.Nullable Double preferredSecuritiesOutsideStockEquity) {
    this.preferredSecuritiesOutsideStockEquity = preferredSecuritiesOutsideStockEquity;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities derivativeProductLiabilities(@javax.annotation.Nullable Double derivativeProductLiabilities) {
    this.derivativeProductLiabilities = derivativeProductLiabilities;
    return this;
  }

  /**
   * Derivative product liabilities
   * @return derivativeProductLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDerivativeProductLiabilities() {
    return derivativeProductLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDerivativeProductLiabilities(@javax.annotation.Nullable Double derivativeProductLiabilities) {
    this.derivativeProductLiabilities = derivativeProductLiabilities;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities capitalLeaseObligations(@javax.annotation.Nullable Double capitalLeaseObligations) {
    this.capitalLeaseObligations = capitalLeaseObligations;
    return this;
  }

  /**
   * Capital lease obligations
   * @return capitalLeaseObligations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_LEASE_OBLIGATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCapitalLeaseObligations() {
    return capitalLeaseObligations;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_LEASE_OBLIGATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalLeaseObligations(@javax.annotation.Nullable Double capitalLeaseObligations) {
    this.capitalLeaseObligations = capitalLeaseObligations;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilities restrictedCommonStock(@javax.annotation.Nullable Double restrictedCommonStock) {
    this.restrictedCommonStock = restrictedCommonStock;
    return this;
  }

  /**
   * Restricted common stock
   * @return restrictedCommonStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESTRICTED_COMMON_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRestrictedCommonStock() {
    return restrictedCommonStock;
  }


  @JsonProperty(value = JSON_PROPERTY_RESTRICTED_COMMON_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictedCommonStock(@javax.annotation.Nullable Double restrictedCommonStock) {
    this.restrictedCommonStock = restrictedCommonStock;
  }


  /**
   * Return true if this AssetsInfo_liabilities_non_current_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoLiabilitiesNonCurrentLiabilities assetsInfoLiabilitiesNonCurrentLiabilities = (AssetsInfoLiabilitiesNonCurrentLiabilities) o;
    return Objects.equals(this.totalNonCurrentLiabilitiesNetMinorityInterest, assetsInfoLiabilitiesNonCurrentLiabilities.totalNonCurrentLiabilitiesNetMinorityInterest) &&
        Objects.equals(this.longTermDebtAndCapitalLeaseObligation, assetsInfoLiabilitiesNonCurrentLiabilities.longTermDebtAndCapitalLeaseObligation) &&
        Objects.equals(this.longTermProvisions, assetsInfoLiabilitiesNonCurrentLiabilities.longTermProvisions) &&
        Objects.equals(this.nonCurrentPensionAndOtherPostretirementBenefitPlans, assetsInfoLiabilitiesNonCurrentLiabilities.nonCurrentPensionAndOtherPostretirementBenefitPlans) &&
        Objects.equals(this.nonCurrentAccruedExpenses, assetsInfoLiabilitiesNonCurrentLiabilities.nonCurrentAccruedExpenses) &&
        Objects.equals(this.dueToRelatedPartiesNonCurrent, assetsInfoLiabilitiesNonCurrentLiabilities.dueToRelatedPartiesNonCurrent) &&
        Objects.equals(this.tradeAndOtherPayablesNonCurrent, assetsInfoLiabilitiesNonCurrentLiabilities.tradeAndOtherPayablesNonCurrent) &&
        Objects.equals(this.nonCurrentDeferredLiabilities, assetsInfoLiabilitiesNonCurrentLiabilities.nonCurrentDeferredLiabilities) &&
        Objects.equals(this.nonCurrentDeferredRevenue, assetsInfoLiabilitiesNonCurrentLiabilities.nonCurrentDeferredRevenue) &&
        Objects.equals(this.nonCurrentDeferredTaxesLiabilities, assetsInfoLiabilitiesNonCurrentLiabilities.nonCurrentDeferredTaxesLiabilities) &&
        Objects.equals(this.otherNonCurrentLiabilities, assetsInfoLiabilitiesNonCurrentLiabilities.otherNonCurrentLiabilities) &&
        Objects.equals(this.preferredSecuritiesOutsideStockEquity, assetsInfoLiabilitiesNonCurrentLiabilities.preferredSecuritiesOutsideStockEquity) &&
        Objects.equals(this.derivativeProductLiabilities, assetsInfoLiabilitiesNonCurrentLiabilities.derivativeProductLiabilities) &&
        Objects.equals(this.capitalLeaseObligations, assetsInfoLiabilitiesNonCurrentLiabilities.capitalLeaseObligations) &&
        Objects.equals(this.restrictedCommonStock, assetsInfoLiabilitiesNonCurrentLiabilities.restrictedCommonStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNonCurrentLiabilitiesNetMinorityInterest, longTermDebtAndCapitalLeaseObligation, longTermProvisions, nonCurrentPensionAndOtherPostretirementBenefitPlans, nonCurrentAccruedExpenses, dueToRelatedPartiesNonCurrent, tradeAndOtherPayablesNonCurrent, nonCurrentDeferredLiabilities, nonCurrentDeferredRevenue, nonCurrentDeferredTaxesLiabilities, otherNonCurrentLiabilities, preferredSecuritiesOutsideStockEquity, derivativeProductLiabilities, capitalLeaseObligations, restrictedCommonStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoLiabilitiesNonCurrentLiabilities {\n");
    sb.append("    totalNonCurrentLiabilitiesNetMinorityInterest: ").append(toIndentedString(totalNonCurrentLiabilitiesNetMinorityInterest)).append("\n");
    sb.append("    longTermDebtAndCapitalLeaseObligation: ").append(toIndentedString(longTermDebtAndCapitalLeaseObligation)).append("\n");
    sb.append("    longTermProvisions: ").append(toIndentedString(longTermProvisions)).append("\n");
    sb.append("    nonCurrentPensionAndOtherPostretirementBenefitPlans: ").append(toIndentedString(nonCurrentPensionAndOtherPostretirementBenefitPlans)).append("\n");
    sb.append("    nonCurrentAccruedExpenses: ").append(toIndentedString(nonCurrentAccruedExpenses)).append("\n");
    sb.append("    dueToRelatedPartiesNonCurrent: ").append(toIndentedString(dueToRelatedPartiesNonCurrent)).append("\n");
    sb.append("    tradeAndOtherPayablesNonCurrent: ").append(toIndentedString(tradeAndOtherPayablesNonCurrent)).append("\n");
    sb.append("    nonCurrentDeferredLiabilities: ").append(toIndentedString(nonCurrentDeferredLiabilities)).append("\n");
    sb.append("    nonCurrentDeferredRevenue: ").append(toIndentedString(nonCurrentDeferredRevenue)).append("\n");
    sb.append("    nonCurrentDeferredTaxesLiabilities: ").append(toIndentedString(nonCurrentDeferredTaxesLiabilities)).append("\n");
    sb.append("    otherNonCurrentLiabilities: ").append(toIndentedString(otherNonCurrentLiabilities)).append("\n");
    sb.append("    preferredSecuritiesOutsideStockEquity: ").append(toIndentedString(preferredSecuritiesOutsideStockEquity)).append("\n");
    sb.append("    derivativeProductLiabilities: ").append(toIndentedString(derivativeProductLiabilities)).append("\n");
    sb.append("    capitalLeaseObligations: ").append(toIndentedString(capitalLeaseObligations)).append("\n");
    sb.append("    restrictedCommonStock: ").append(toIndentedString(restrictedCommonStock)).append("\n");
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

    // add `total_non_current_liabilities_net_minority_interest` to the URL query string
    if (getTotalNonCurrentLiabilitiesNetMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_non_current_liabilities_net_minority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalNonCurrentLiabilitiesNetMinorityInterest()))));
    }

    // add `long_term_debt_and_capital_lease_obligation` to the URL query string
    if (getLongTermDebtAndCapitalLeaseObligation() != null) {
      joiner.add(getLongTermDebtAndCapitalLeaseObligation().toUrlQueryString(prefix + "long_term_debt_and_capital_lease_obligation" + suffix));
    }

    // add `long_term_provisions` to the URL query string
    if (getLongTermProvisions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_provisions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermProvisions()))));
    }

    // add `non_current_pension_and_other_postretirement_benefit_plans` to the URL query string
    if (getNonCurrentPensionAndOtherPostretirementBenefitPlans() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_pension_and_other_postretirement_benefit_plans%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentPensionAndOtherPostretirementBenefitPlans()))));
    }

    // add `non_current_accrued_expenses` to the URL query string
    if (getNonCurrentAccruedExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_accrued_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentAccruedExpenses()))));
    }

    // add `due_to_related_parties_non_current` to the URL query string
    if (getDueToRelatedPartiesNonCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdue_to_related_parties_non_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDueToRelatedPartiesNonCurrent()))));
    }

    // add `trade_and_other_payables_non_current` to the URL query string
    if (getTradeAndOtherPayablesNonCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strade_and_other_payables_non_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTradeAndOtherPayablesNonCurrent()))));
    }

    // add `non_current_deferred_liabilities` to the URL query string
    if (getNonCurrentDeferredLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_deferred_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentDeferredLiabilities()))));
    }

    // add `non_current_deferred_revenue` to the URL query string
    if (getNonCurrentDeferredRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_deferred_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentDeferredRevenue()))));
    }

    // add `non_current_deferred_taxes_liabilities` to the URL query string
    if (getNonCurrentDeferredTaxesLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_deferred_taxes_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentDeferredTaxesLiabilities()))));
    }

    // add `other_non_current_liabilities` to the URL query string
    if (getOtherNonCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCurrentLiabilities()))));
    }

    // add `preferred_securities_outside_stock_equity` to the URL query string
    if (getPreferredSecuritiesOutsideStockEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_securities_outside_stock_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredSecuritiesOutsideStockEquity()))));
    }

    // add `derivative_product_liabilities` to the URL query string
    if (getDerivativeProductLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sderivative_product_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDerivativeProductLiabilities()))));
    }

    // add `capital_lease_obligations` to the URL query string
    if (getCapitalLeaseObligations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital_lease_obligations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapitalLeaseObligations()))));
    }

    // add `restricted_common_stock` to the URL query string
    if (getRestrictedCommonStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srestricted_common_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRestrictedCommonStock()))));
    }

    return joiner.toString();
  }
}

