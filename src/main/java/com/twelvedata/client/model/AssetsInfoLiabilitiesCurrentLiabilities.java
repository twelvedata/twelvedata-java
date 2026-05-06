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
import com.twelvedata.client.model.AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Current liabilities information
 */
@JsonPropertyOrder({
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_DEBT_AND_CAPITAL_LEASE_OBLIGATION,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_DEBT,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_CAPITAL_LEASE_OBLIGATION,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_OTHER_CURRENT_BORROWINGS,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_LINE_OF_CREDIT,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_COMMERCIAL_PAPER,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_NOTES_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_PROVISIONS,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_PAYABLES_AND_ACCRUED_EXPENSES,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_PENSION_AND_OTHER_POST_RETIREMENT_BENEFIT_PLANS_CURRENT,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_EMPLOYEE_BENEFITS,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_DEFERRED_LIABILITIES,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_DEFERRED_REVENUE,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_CURRENT_DEFERRED_TAXES_LIABILITIES,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_OTHER_CURRENT_LIABILITIES,
  AssetsInfoLiabilitiesCurrentLiabilities.JSON_PROPERTY_LIABILITIES_HELD_FOR_SALE_NON_CURRENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoLiabilitiesCurrentLiabilities {
  public static final String JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES = "total_current_liabilities";
  @javax.annotation.Nullable
  private Double totalCurrentLiabilities;

  public static final String JSON_PROPERTY_CURRENT_DEBT_AND_CAPITAL_LEASE_OBLIGATION = "current_debt_and_capital_lease_obligation";
  @javax.annotation.Nullable
  private Double currentDebtAndCapitalLeaseObligation;

  public static final String JSON_PROPERTY_CURRENT_DEBT = "current_debt";
  @javax.annotation.Nullable
  private Double currentDebt;

  public static final String JSON_PROPERTY_CURRENT_CAPITAL_LEASE_OBLIGATION = "current_capital_lease_obligation";
  @javax.annotation.Nullable
  private Double currentCapitalLeaseObligation;

  public static final String JSON_PROPERTY_OTHER_CURRENT_BORROWINGS = "other_current_borrowings";
  @javax.annotation.Nullable
  private Double otherCurrentBorrowings;

  public static final String JSON_PROPERTY_LINE_OF_CREDIT = "line_of_credit";
  @javax.annotation.Nullable
  private Double lineOfCredit;

  public static final String JSON_PROPERTY_COMMERCIAL_PAPER = "commercial_paper";
  @javax.annotation.Nullable
  private Double commercialPaper;

  public static final String JSON_PROPERTY_CURRENT_NOTES_PAYABLE = "current_notes_payable";
  @javax.annotation.Nullable
  private Double currentNotesPayable;

  public static final String JSON_PROPERTY_CURRENT_PROVISIONS = "current_provisions";
  @javax.annotation.Nullable
  private Double currentProvisions;

  public static final String JSON_PROPERTY_PAYABLES_AND_ACCRUED_EXPENSES = "payables_and_accrued_expenses";
  @javax.annotation.Nullable
  private AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses payablesAndAccruedExpenses;

  public static final String JSON_PROPERTY_PENSION_AND_OTHER_POST_RETIREMENT_BENEFIT_PLANS_CURRENT = "pension_and_other_post_retirement_benefit_plans_current";
  @javax.annotation.Nullable
  private Double pensionAndOtherPostRetirementBenefitPlansCurrent;

  public static final String JSON_PROPERTY_EMPLOYEE_BENEFITS = "employee_benefits";
  @javax.annotation.Nullable
  private Double employeeBenefits;

  public static final String JSON_PROPERTY_CURRENT_DEFERRED_LIABILITIES = "current_deferred_liabilities";
  @javax.annotation.Nullable
  private Double currentDeferredLiabilities;

  public static final String JSON_PROPERTY_CURRENT_DEFERRED_REVENUE = "current_deferred_revenue";
  @javax.annotation.Nullable
  private Double currentDeferredRevenue;

  public static final String JSON_PROPERTY_CURRENT_DEFERRED_TAXES_LIABILITIES = "current_deferred_taxes_liabilities";
  @javax.annotation.Nullable
  private Double currentDeferredTaxesLiabilities;

  public static final String JSON_PROPERTY_OTHER_CURRENT_LIABILITIES = "other_current_liabilities";
  @javax.annotation.Nullable
  private Double otherCurrentLiabilities;

  public static final String JSON_PROPERTY_LIABILITIES_HELD_FOR_SALE_NON_CURRENT = "liabilities_held_for_sale_non_current";
  @javax.annotation.Nullable
  private Double liabilitiesHeldForSaleNonCurrent;

  public AssetsInfoLiabilitiesCurrentLiabilities() { 
  }

  public AssetsInfoLiabilitiesCurrentLiabilities totalCurrentLiabilities(@javax.annotation.Nullable Double totalCurrentLiabilities) {
    this.totalCurrentLiabilities = totalCurrentLiabilities;
    return this;
  }

  /**
   * Total current liabilities
   * @return totalCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalCurrentLiabilities() {
    return totalCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCurrentLiabilities(@javax.annotation.Nullable Double totalCurrentLiabilities) {
    this.totalCurrentLiabilities = totalCurrentLiabilities;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentDebtAndCapitalLeaseObligation(@javax.annotation.Nullable Double currentDebtAndCapitalLeaseObligation) {
    this.currentDebtAndCapitalLeaseObligation = currentDebtAndCapitalLeaseObligation;
    return this;
  }

  /**
   * Current debt and capital lease obligation
   * @return currentDebtAndCapitalLeaseObligation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDebtAndCapitalLeaseObligation() {
    return currentDebtAndCapitalLeaseObligation;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDebtAndCapitalLeaseObligation(@javax.annotation.Nullable Double currentDebtAndCapitalLeaseObligation) {
    this.currentDebtAndCapitalLeaseObligation = currentDebtAndCapitalLeaseObligation;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentDebt(@javax.annotation.Nullable Double currentDebt) {
    this.currentDebt = currentDebt;
    return this;
  }

  /**
   * Current debt
   * @return currentDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDebt() {
    return currentDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDebt(@javax.annotation.Nullable Double currentDebt) {
    this.currentDebt = currentDebt;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentCapitalLeaseObligation(@javax.annotation.Nullable Double currentCapitalLeaseObligation) {
    this.currentCapitalLeaseObligation = currentCapitalLeaseObligation;
    return this;
  }

  /**
   * Current capital lease obligation
   * @return currentCapitalLeaseObligation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentCapitalLeaseObligation() {
    return currentCapitalLeaseObligation;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCapitalLeaseObligation(@javax.annotation.Nullable Double currentCapitalLeaseObligation) {
    this.currentCapitalLeaseObligation = currentCapitalLeaseObligation;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities otherCurrentBorrowings(@javax.annotation.Nullable Double otherCurrentBorrowings) {
    this.otherCurrentBorrowings = otherCurrentBorrowings;
    return this;
  }

  /**
   * Other current borrowings
   * @return otherCurrentBorrowings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_BORROWINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCurrentBorrowings() {
    return otherCurrentBorrowings;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_BORROWINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCurrentBorrowings(@javax.annotation.Nullable Double otherCurrentBorrowings) {
    this.otherCurrentBorrowings = otherCurrentBorrowings;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities lineOfCredit(@javax.annotation.Nullable Double lineOfCredit) {
    this.lineOfCredit = lineOfCredit;
    return this;
  }

  /**
   * Line of credit
   * @return lineOfCredit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_OF_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLineOfCredit() {
    return lineOfCredit;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_OF_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineOfCredit(@javax.annotation.Nullable Double lineOfCredit) {
    this.lineOfCredit = lineOfCredit;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities commercialPaper(@javax.annotation.Nullable Double commercialPaper) {
    this.commercialPaper = commercialPaper;
    return this;
  }

  /**
   * Commercial paper
   * @return commercialPaper
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMERCIAL_PAPER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommercialPaper() {
    return commercialPaper;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMERCIAL_PAPER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommercialPaper(@javax.annotation.Nullable Double commercialPaper) {
    this.commercialPaper = commercialPaper;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentNotesPayable(@javax.annotation.Nullable Double currentNotesPayable) {
    this.currentNotesPayable = currentNotesPayable;
    return this;
  }

  /**
   * Current notes payable
   * @return currentNotesPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_NOTES_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentNotesPayable() {
    return currentNotesPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_NOTES_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentNotesPayable(@javax.annotation.Nullable Double currentNotesPayable) {
    this.currentNotesPayable = currentNotesPayable;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentProvisions(@javax.annotation.Nullable Double currentProvisions) {
    this.currentProvisions = currentProvisions;
    return this;
  }

  /**
   * Current provisions
   * @return currentProvisions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentProvisions() {
    return currentProvisions;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentProvisions(@javax.annotation.Nullable Double currentProvisions) {
    this.currentProvisions = currentProvisions;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities payablesAndAccruedExpenses(@javax.annotation.Nullable AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses payablesAndAccruedExpenses) {
    this.payablesAndAccruedExpenses = payablesAndAccruedExpenses;
    return this;
  }

  /**
   * Get payablesAndAccruedExpenses
   * @return payablesAndAccruedExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAYABLES_AND_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses getPayablesAndAccruedExpenses() {
    return payablesAndAccruedExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYABLES_AND_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayablesAndAccruedExpenses(@javax.annotation.Nullable AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses payablesAndAccruedExpenses) {
    this.payablesAndAccruedExpenses = payablesAndAccruedExpenses;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities pensionAndOtherPostRetirementBenefitPlansCurrent(@javax.annotation.Nullable Double pensionAndOtherPostRetirementBenefitPlansCurrent) {
    this.pensionAndOtherPostRetirementBenefitPlansCurrent = pensionAndOtherPostRetirementBenefitPlansCurrent;
    return this;
  }

  /**
   * Pension and other post retirement benefit plans current
   * @return pensionAndOtherPostRetirementBenefitPlansCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PENSION_AND_OTHER_POST_RETIREMENT_BENEFIT_PLANS_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPensionAndOtherPostRetirementBenefitPlansCurrent() {
    return pensionAndOtherPostRetirementBenefitPlansCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_PENSION_AND_OTHER_POST_RETIREMENT_BENEFIT_PLANS_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPensionAndOtherPostRetirementBenefitPlansCurrent(@javax.annotation.Nullable Double pensionAndOtherPostRetirementBenefitPlansCurrent) {
    this.pensionAndOtherPostRetirementBenefitPlansCurrent = pensionAndOtherPostRetirementBenefitPlansCurrent;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities employeeBenefits(@javax.annotation.Nullable Double employeeBenefits) {
    this.employeeBenefits = employeeBenefits;
    return this;
  }

  /**
   * Employee benefits
   * @return employeeBenefits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_BENEFITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEmployeeBenefits() {
    return employeeBenefits;
  }


  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_BENEFITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployeeBenefits(@javax.annotation.Nullable Double employeeBenefits) {
    this.employeeBenefits = employeeBenefits;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentDeferredLiabilities(@javax.annotation.Nullable Double currentDeferredLiabilities) {
    this.currentDeferredLiabilities = currentDeferredLiabilities;
    return this;
  }

  /**
   * Current deferred liabilities
   * @return currentDeferredLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDeferredLiabilities() {
    return currentDeferredLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDeferredLiabilities(@javax.annotation.Nullable Double currentDeferredLiabilities) {
    this.currentDeferredLiabilities = currentDeferredLiabilities;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentDeferredRevenue(@javax.annotation.Nullable Double currentDeferredRevenue) {
    this.currentDeferredRevenue = currentDeferredRevenue;
    return this;
  }

  /**
   * Current deferred revenue
   * @return currentDeferredRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDeferredRevenue() {
    return currentDeferredRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDeferredRevenue(@javax.annotation.Nullable Double currentDeferredRevenue) {
    this.currentDeferredRevenue = currentDeferredRevenue;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities currentDeferredTaxesLiabilities(@javax.annotation.Nullable Double currentDeferredTaxesLiabilities) {
    this.currentDeferredTaxesLiabilities = currentDeferredTaxesLiabilities;
    return this;
  }

  /**
   * Current deferred taxes liabilities
   * @return currentDeferredTaxesLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_TAXES_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDeferredTaxesLiabilities() {
    return currentDeferredTaxesLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_TAXES_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDeferredTaxesLiabilities(@javax.annotation.Nullable Double currentDeferredTaxesLiabilities) {
    this.currentDeferredTaxesLiabilities = currentDeferredTaxesLiabilities;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities otherCurrentLiabilities(@javax.annotation.Nullable Double otherCurrentLiabilities) {
    this.otherCurrentLiabilities = otherCurrentLiabilities;
    return this;
  }

  /**
   * Other current liabilities
   * @return otherCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCurrentLiabilities() {
    return otherCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCurrentLiabilities(@javax.annotation.Nullable Double otherCurrentLiabilities) {
    this.otherCurrentLiabilities = otherCurrentLiabilities;
  }


  public AssetsInfoLiabilitiesCurrentLiabilities liabilitiesHeldForSaleNonCurrent(@javax.annotation.Nullable Double liabilitiesHeldForSaleNonCurrent) {
    this.liabilitiesHeldForSaleNonCurrent = liabilitiesHeldForSaleNonCurrent;
    return this;
  }

  /**
   * Liabilities held for sale non current
   * @return liabilitiesHeldForSaleNonCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIABILITIES_HELD_FOR_SALE_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLiabilitiesHeldForSaleNonCurrent() {
    return liabilitiesHeldForSaleNonCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_LIABILITIES_HELD_FOR_SALE_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiabilitiesHeldForSaleNonCurrent(@javax.annotation.Nullable Double liabilitiesHeldForSaleNonCurrent) {
    this.liabilitiesHeldForSaleNonCurrent = liabilitiesHeldForSaleNonCurrent;
  }


  /**
   * Return true if this AssetsInfo_liabilities_current_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoLiabilitiesCurrentLiabilities assetsInfoLiabilitiesCurrentLiabilities = (AssetsInfoLiabilitiesCurrentLiabilities) o;
    return Objects.equals(this.totalCurrentLiabilities, assetsInfoLiabilitiesCurrentLiabilities.totalCurrentLiabilities) &&
        Objects.equals(this.currentDebtAndCapitalLeaseObligation, assetsInfoLiabilitiesCurrentLiabilities.currentDebtAndCapitalLeaseObligation) &&
        Objects.equals(this.currentDebt, assetsInfoLiabilitiesCurrentLiabilities.currentDebt) &&
        Objects.equals(this.currentCapitalLeaseObligation, assetsInfoLiabilitiesCurrentLiabilities.currentCapitalLeaseObligation) &&
        Objects.equals(this.otherCurrentBorrowings, assetsInfoLiabilitiesCurrentLiabilities.otherCurrentBorrowings) &&
        Objects.equals(this.lineOfCredit, assetsInfoLiabilitiesCurrentLiabilities.lineOfCredit) &&
        Objects.equals(this.commercialPaper, assetsInfoLiabilitiesCurrentLiabilities.commercialPaper) &&
        Objects.equals(this.currentNotesPayable, assetsInfoLiabilitiesCurrentLiabilities.currentNotesPayable) &&
        Objects.equals(this.currentProvisions, assetsInfoLiabilitiesCurrentLiabilities.currentProvisions) &&
        Objects.equals(this.payablesAndAccruedExpenses, assetsInfoLiabilitiesCurrentLiabilities.payablesAndAccruedExpenses) &&
        Objects.equals(this.pensionAndOtherPostRetirementBenefitPlansCurrent, assetsInfoLiabilitiesCurrentLiabilities.pensionAndOtherPostRetirementBenefitPlansCurrent) &&
        Objects.equals(this.employeeBenefits, assetsInfoLiabilitiesCurrentLiabilities.employeeBenefits) &&
        Objects.equals(this.currentDeferredLiabilities, assetsInfoLiabilitiesCurrentLiabilities.currentDeferredLiabilities) &&
        Objects.equals(this.currentDeferredRevenue, assetsInfoLiabilitiesCurrentLiabilities.currentDeferredRevenue) &&
        Objects.equals(this.currentDeferredTaxesLiabilities, assetsInfoLiabilitiesCurrentLiabilities.currentDeferredTaxesLiabilities) &&
        Objects.equals(this.otherCurrentLiabilities, assetsInfoLiabilitiesCurrentLiabilities.otherCurrentLiabilities) &&
        Objects.equals(this.liabilitiesHeldForSaleNonCurrent, assetsInfoLiabilitiesCurrentLiabilities.liabilitiesHeldForSaleNonCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCurrentLiabilities, currentDebtAndCapitalLeaseObligation, currentDebt, currentCapitalLeaseObligation, otherCurrentBorrowings, lineOfCredit, commercialPaper, currentNotesPayable, currentProvisions, payablesAndAccruedExpenses, pensionAndOtherPostRetirementBenefitPlansCurrent, employeeBenefits, currentDeferredLiabilities, currentDeferredRevenue, currentDeferredTaxesLiabilities, otherCurrentLiabilities, liabilitiesHeldForSaleNonCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoLiabilitiesCurrentLiabilities {\n");
    sb.append("    totalCurrentLiabilities: ").append(toIndentedString(totalCurrentLiabilities)).append("\n");
    sb.append("    currentDebtAndCapitalLeaseObligation: ").append(toIndentedString(currentDebtAndCapitalLeaseObligation)).append("\n");
    sb.append("    currentDebt: ").append(toIndentedString(currentDebt)).append("\n");
    sb.append("    currentCapitalLeaseObligation: ").append(toIndentedString(currentCapitalLeaseObligation)).append("\n");
    sb.append("    otherCurrentBorrowings: ").append(toIndentedString(otherCurrentBorrowings)).append("\n");
    sb.append("    lineOfCredit: ").append(toIndentedString(lineOfCredit)).append("\n");
    sb.append("    commercialPaper: ").append(toIndentedString(commercialPaper)).append("\n");
    sb.append("    currentNotesPayable: ").append(toIndentedString(currentNotesPayable)).append("\n");
    sb.append("    currentProvisions: ").append(toIndentedString(currentProvisions)).append("\n");
    sb.append("    payablesAndAccruedExpenses: ").append(toIndentedString(payablesAndAccruedExpenses)).append("\n");
    sb.append("    pensionAndOtherPostRetirementBenefitPlansCurrent: ").append(toIndentedString(pensionAndOtherPostRetirementBenefitPlansCurrent)).append("\n");
    sb.append("    employeeBenefits: ").append(toIndentedString(employeeBenefits)).append("\n");
    sb.append("    currentDeferredLiabilities: ").append(toIndentedString(currentDeferredLiabilities)).append("\n");
    sb.append("    currentDeferredRevenue: ").append(toIndentedString(currentDeferredRevenue)).append("\n");
    sb.append("    currentDeferredTaxesLiabilities: ").append(toIndentedString(currentDeferredTaxesLiabilities)).append("\n");
    sb.append("    otherCurrentLiabilities: ").append(toIndentedString(otherCurrentLiabilities)).append("\n");
    sb.append("    liabilitiesHeldForSaleNonCurrent: ").append(toIndentedString(liabilitiesHeldForSaleNonCurrent)).append("\n");
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

    // add `total_current_liabilities` to the URL query string
    if (getTotalCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCurrentLiabilities()))));
    }

    // add `current_debt_and_capital_lease_obligation` to the URL query string
    if (getCurrentDebtAndCapitalLeaseObligation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_debt_and_capital_lease_obligation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDebtAndCapitalLeaseObligation()))));
    }

    // add `current_debt` to the URL query string
    if (getCurrentDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDebt()))));
    }

    // add `current_capital_lease_obligation` to the URL query string
    if (getCurrentCapitalLeaseObligation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_capital_lease_obligation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentCapitalLeaseObligation()))));
    }

    // add `other_current_borrowings` to the URL query string
    if (getOtherCurrentBorrowings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_current_borrowings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCurrentBorrowings()))));
    }

    // add `line_of_credit` to the URL query string
    if (getLineOfCredit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sline_of_credit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineOfCredit()))));
    }

    // add `commercial_paper` to the URL query string
    if (getCommercialPaper() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommercial_paper%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommercialPaper()))));
    }

    // add `current_notes_payable` to the URL query string
    if (getCurrentNotesPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_notes_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentNotesPayable()))));
    }

    // add `current_provisions` to the URL query string
    if (getCurrentProvisions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_provisions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentProvisions()))));
    }

    // add `payables_and_accrued_expenses` to the URL query string
    if (getPayablesAndAccruedExpenses() != null) {
      joiner.add(getPayablesAndAccruedExpenses().toUrlQueryString(prefix + "payables_and_accrued_expenses" + suffix));
    }

    // add `pension_and_other_post_retirement_benefit_plans_current` to the URL query string
    if (getPensionAndOtherPostRetirementBenefitPlansCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spension_and_other_post_retirement_benefit_plans_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPensionAndOtherPostRetirementBenefitPlansCurrent()))));
    }

    // add `employee_benefits` to the URL query string
    if (getEmployeeBenefits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semployee_benefits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmployeeBenefits()))));
    }

    // add `current_deferred_liabilities` to the URL query string
    if (getCurrentDeferredLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_deferred_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDeferredLiabilities()))));
    }

    // add `current_deferred_revenue` to the URL query string
    if (getCurrentDeferredRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_deferred_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDeferredRevenue()))));
    }

    // add `current_deferred_taxes_liabilities` to the URL query string
    if (getCurrentDeferredTaxesLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_deferred_taxes_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDeferredTaxesLiabilities()))));
    }

    // add `other_current_liabilities` to the URL query string
    if (getOtherCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCurrentLiabilities()))));
    }

    // add `liabilities_held_for_sale_non_current` to the URL query string
    if (getLiabilitiesHeldForSaleNonCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sliabilities_held_for_sale_non_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLiabilitiesHeldForSaleNonCurrent()))));
    }

    return joiner.toString();
  }
}

