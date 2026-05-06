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
 * Cash flow from financing activities
 */
@JsonPropertyOrder({
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_FINANCING_CASH_FLOW,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_FINANCING_ACTIVITIES,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_CASH_FROM_DISCONTINUED_FINANCING_ACTIVITIES,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_OTHER_FINANCING_CHARGES,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_INTEREST_PAID_CFF,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_PROCEEDS_FROM_STOCK_OPTION_EXERCISED,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_CASH_DIVIDENDS_PAID,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_PREFERRED_STOCK_DIVIDEND_PAID,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_COMMON_STOCK_DIVIDEND_PAID,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_PREFERRED_STOCK_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_PREFERRED_STOCK_PAYMENTS,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_PREFERRED_STOCK_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_COMMON_STOCK_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_COMMON_STOCK_PAYMENTS,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_COMMON_STOCK_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_REPURCHASE_OF_CAPITAL_STOCK,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_ISSUANCE_PAYMENTS_OF_DEBT,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_SHORT_TERM_DEBT_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_SHORT_TERM_DEBT_PAYMENTS,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_NET_LONG_TERM_DEBT_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_ISSUANCE_OF_DEBT,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_REPAYMENT_OF_DEBT,
  CashFlowDataCashFlowFromFinancingActivities.JSON_PROPERTY_ISSUANCE_OF_CAPITAL_STOCK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataCashFlowFromFinancingActivities {
  public static final String JSON_PROPERTY_FINANCING_CASH_FLOW = "financing_cash_flow";
  @javax.annotation.Nullable
  private Double financingCashFlow;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_FINANCING_ACTIVITIES = "cash_flow_from_continuing_financing_activities";
  @javax.annotation.Nullable
  private Double cashFlowFromContinuingFinancingActivities;

  public static final String JSON_PROPERTY_CASH_FROM_DISCONTINUED_FINANCING_ACTIVITIES = "cash_from_discontinued_financing_activities";
  @javax.annotation.Nullable
  private Double cashFromDiscontinuedFinancingActivities;

  public static final String JSON_PROPERTY_NET_OTHER_FINANCING_CHARGES = "net_other_financing_charges";
  @javax.annotation.Nullable
  private Double netOtherFinancingCharges;

  public static final String JSON_PROPERTY_INTEREST_PAID_CFF = "interest_paid_cff";
  @javax.annotation.Nullable
  private Double interestPaidCff;

  public static final String JSON_PROPERTY_PROCEEDS_FROM_STOCK_OPTION_EXERCISED = "proceeds_from_stock_option_exercised";
  @javax.annotation.Nullable
  private Double proceedsFromStockOptionExercised;

  public static final String JSON_PROPERTY_CASH_DIVIDENDS_PAID = "cash_dividends_paid";
  @javax.annotation.Nullable
  private Double cashDividendsPaid;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_DIVIDEND_PAID = "preferred_stock_dividend_paid";
  @javax.annotation.Nullable
  private Double preferredStockDividendPaid;

  public static final String JSON_PROPERTY_COMMON_STOCK_DIVIDEND_PAID = "common_stock_dividend_paid";
  @javax.annotation.Nullable
  private Double commonStockDividendPaid;

  public static final String JSON_PROPERTY_NET_PREFERRED_STOCK_ISSUANCE = "net_preferred_stock_issuance";
  @javax.annotation.Nullable
  private Double netPreferredStockIssuance;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_PAYMENTS = "preferred_stock_payments";
  @javax.annotation.Nullable
  private Double preferredStockPayments;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_ISSUANCE = "preferred_stock_issuance";
  @javax.annotation.Nullable
  private Double preferredStockIssuance;

  public static final String JSON_PROPERTY_NET_COMMON_STOCK_ISSUANCE = "net_common_stock_issuance";
  @javax.annotation.Nullable
  private Double netCommonStockIssuance;

  public static final String JSON_PROPERTY_COMMON_STOCK_PAYMENTS = "common_stock_payments";
  @javax.annotation.Nullable
  private Double commonStockPayments;

  public static final String JSON_PROPERTY_COMMON_STOCK_ISSUANCE = "common_stock_issuance";
  @javax.annotation.Nullable
  private Double commonStockIssuance;

  public static final String JSON_PROPERTY_REPURCHASE_OF_CAPITAL_STOCK = "repurchase_of_capital_stock";
  @javax.annotation.Nullable
  private Double repurchaseOfCapitalStock;

  public static final String JSON_PROPERTY_NET_ISSUANCE_PAYMENTS_OF_DEBT = "net_issuance_payments_of_debt";
  @javax.annotation.Nullable
  private Double netIssuancePaymentsOfDebt;

  public static final String JSON_PROPERTY_NET_SHORT_TERM_DEBT_ISSUANCE = "net_short_term_debt_issuance";
  @javax.annotation.Nullable
  private Double netShortTermDebtIssuance;

  public static final String JSON_PROPERTY_SHORT_TERM_DEBT_PAYMENTS = "short_term_debt_payments";
  @javax.annotation.Nullable
  private Double shortTermDebtPayments;

  public static final String JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE = "short_term_debt_issuance";
  @javax.annotation.Nullable
  private Double shortTermDebtIssuance;

  public static final String JSON_PROPERTY_NET_LONG_TERM_DEBT_ISSUANCE = "net_long_term_debt_issuance";
  @javax.annotation.Nullable
  private Double netLongTermDebtIssuance;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS = "long_term_debt_payments";
  @javax.annotation.Nullable
  private Double longTermDebtPayments;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE = "long_term_debt_issuance";
  @javax.annotation.Nullable
  private Double longTermDebtIssuance;

  public static final String JSON_PROPERTY_ISSUANCE_OF_DEBT = "issuance_of_debt";
  @javax.annotation.Nullable
  private Double issuanceOfDebt;

  public static final String JSON_PROPERTY_REPAYMENT_OF_DEBT = "repayment_of_debt";
  @javax.annotation.Nullable
  private Double repaymentOfDebt;

  public static final String JSON_PROPERTY_ISSUANCE_OF_CAPITAL_STOCK = "issuance_of_capital_stock";
  @javax.annotation.Nullable
  private Double issuanceOfCapitalStock;

  public CashFlowDataCashFlowFromFinancingActivities() { 
  }

  public CashFlowDataCashFlowFromFinancingActivities financingCashFlow(@javax.annotation.Nullable Double financingCashFlow) {
    this.financingCashFlow = financingCashFlow;
    return this;
  }

  /**
   * Financing cash flow
   * @return financingCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFinancingCashFlow() {
    return financingCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingCashFlow(@javax.annotation.Nullable Double financingCashFlow) {
    this.financingCashFlow = financingCashFlow;
  }


  public CashFlowDataCashFlowFromFinancingActivities cashFlowFromContinuingFinancingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingFinancingActivities) {
    this.cashFlowFromContinuingFinancingActivities = cashFlowFromContinuingFinancingActivities;
    return this;
  }

  /**
   * Cash flow from continuing financing activities
   * @return cashFlowFromContinuingFinancingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFlowFromContinuingFinancingActivities() {
    return cashFlowFromContinuingFinancingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromContinuingFinancingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingFinancingActivities) {
    this.cashFlowFromContinuingFinancingActivities = cashFlowFromContinuingFinancingActivities;
  }


  public CashFlowDataCashFlowFromFinancingActivities cashFromDiscontinuedFinancingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedFinancingActivities) {
    this.cashFromDiscontinuedFinancingActivities = cashFromDiscontinuedFinancingActivities;
    return this;
  }

  /**
   * Cash from discontinued financing activities
   * @return cashFromDiscontinuedFinancingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFromDiscontinuedFinancingActivities() {
    return cashFromDiscontinuedFinancingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFromDiscontinuedFinancingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedFinancingActivities) {
    this.cashFromDiscontinuedFinancingActivities = cashFromDiscontinuedFinancingActivities;
  }


  public CashFlowDataCashFlowFromFinancingActivities netOtherFinancingCharges(@javax.annotation.Nullable Double netOtherFinancingCharges) {
    this.netOtherFinancingCharges = netOtherFinancingCharges;
    return this;
  }

  /**
   * Net other financing charges
   * @return netOtherFinancingCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_OTHER_FINANCING_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetOtherFinancingCharges() {
    return netOtherFinancingCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_OTHER_FINANCING_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetOtherFinancingCharges(@javax.annotation.Nullable Double netOtherFinancingCharges) {
    this.netOtherFinancingCharges = netOtherFinancingCharges;
  }


  public CashFlowDataCashFlowFromFinancingActivities interestPaidCff(@javax.annotation.Nullable Double interestPaidCff) {
    this.interestPaidCff = interestPaidCff;
    return this;
  }

  /**
   * Interest paid cff
   * @return interestPaidCff
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_CFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPaidCff() {
    return interestPaidCff;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_CFF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPaidCff(@javax.annotation.Nullable Double interestPaidCff) {
    this.interestPaidCff = interestPaidCff;
  }


  public CashFlowDataCashFlowFromFinancingActivities proceedsFromStockOptionExercised(@javax.annotation.Nullable Double proceedsFromStockOptionExercised) {
    this.proceedsFromStockOptionExercised = proceedsFromStockOptionExercised;
    return this;
  }

  /**
   * Proceeds from stock option exercised
   * @return proceedsFromStockOptionExercised
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCEEDS_FROM_STOCK_OPTION_EXERCISED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProceedsFromStockOptionExercised() {
    return proceedsFromStockOptionExercised;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCEEDS_FROM_STOCK_OPTION_EXERCISED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProceedsFromStockOptionExercised(@javax.annotation.Nullable Double proceedsFromStockOptionExercised) {
    this.proceedsFromStockOptionExercised = proceedsFromStockOptionExercised;
  }


  public CashFlowDataCashFlowFromFinancingActivities cashDividendsPaid(@javax.annotation.Nullable Double cashDividendsPaid) {
    this.cashDividendsPaid = cashDividendsPaid;
    return this;
  }

  /**
   * Cash dividends paid
   * @return cashDividendsPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_DIVIDENDS_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashDividendsPaid() {
    return cashDividendsPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_DIVIDENDS_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashDividendsPaid(@javax.annotation.Nullable Double cashDividendsPaid) {
    this.cashDividendsPaid = cashDividendsPaid;
  }


  public CashFlowDataCashFlowFromFinancingActivities preferredStockDividendPaid(@javax.annotation.Nullable Double preferredStockDividendPaid) {
    this.preferredStockDividendPaid = preferredStockDividendPaid;
    return this;
  }

  /**
   * Preferred stock dividend paid
   * @return preferredStockDividendPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStockDividendPaid() {
    return preferredStockDividendPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockDividendPaid(@javax.annotation.Nullable Double preferredStockDividendPaid) {
    this.preferredStockDividendPaid = preferredStockDividendPaid;
  }


  public CashFlowDataCashFlowFromFinancingActivities commonStockDividendPaid(@javax.annotation.Nullable Double commonStockDividendPaid) {
    this.commonStockDividendPaid = commonStockDividendPaid;
    return this;
  }

  /**
   * Common stock dividend paid
   * @return commonStockDividendPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStockDividendPaid() {
    return commonStockDividendPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStockDividendPaid(@javax.annotation.Nullable Double commonStockDividendPaid) {
    this.commonStockDividendPaid = commonStockDividendPaid;
  }


  public CashFlowDataCashFlowFromFinancingActivities netPreferredStockIssuance(@javax.annotation.Nullable Double netPreferredStockIssuance) {
    this.netPreferredStockIssuance = netPreferredStockIssuance;
    return this;
  }

  /**
   * Net preferred stock issuance
   * @return netPreferredStockIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_PREFERRED_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetPreferredStockIssuance() {
    return netPreferredStockIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_PREFERRED_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetPreferredStockIssuance(@javax.annotation.Nullable Double netPreferredStockIssuance) {
    this.netPreferredStockIssuance = netPreferredStockIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities preferredStockPayments(@javax.annotation.Nullable Double preferredStockPayments) {
    this.preferredStockPayments = preferredStockPayments;
    return this;
  }

  /**
   * Preferred stock payments
   * @return preferredStockPayments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStockPayments() {
    return preferredStockPayments;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockPayments(@javax.annotation.Nullable Double preferredStockPayments) {
    this.preferredStockPayments = preferredStockPayments;
  }


  public CashFlowDataCashFlowFromFinancingActivities preferredStockIssuance(@javax.annotation.Nullable Double preferredStockIssuance) {
    this.preferredStockIssuance = preferredStockIssuance;
    return this;
  }

  /**
   * Preferred stock issuance
   * @return preferredStockIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStockIssuance() {
    return preferredStockIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockIssuance(@javax.annotation.Nullable Double preferredStockIssuance) {
    this.preferredStockIssuance = preferredStockIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities netCommonStockIssuance(@javax.annotation.Nullable Double netCommonStockIssuance) {
    this.netCommonStockIssuance = netCommonStockIssuance;
    return this;
  }

  /**
   * Net common stock issuance
   * @return netCommonStockIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_COMMON_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetCommonStockIssuance() {
    return netCommonStockIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_COMMON_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetCommonStockIssuance(@javax.annotation.Nullable Double netCommonStockIssuance) {
    this.netCommonStockIssuance = netCommonStockIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities commonStockPayments(@javax.annotation.Nullable Double commonStockPayments) {
    this.commonStockPayments = commonStockPayments;
    return this;
  }

  /**
   * Common stock payments
   * @return commonStockPayments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStockPayments() {
    return commonStockPayments;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStockPayments(@javax.annotation.Nullable Double commonStockPayments) {
    this.commonStockPayments = commonStockPayments;
  }


  public CashFlowDataCashFlowFromFinancingActivities commonStockIssuance(@javax.annotation.Nullable Double commonStockIssuance) {
    this.commonStockIssuance = commonStockIssuance;
    return this;
  }

  /**
   * Common stock issuance
   * @return commonStockIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStockIssuance() {
    return commonStockIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStockIssuance(@javax.annotation.Nullable Double commonStockIssuance) {
    this.commonStockIssuance = commonStockIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities repurchaseOfCapitalStock(@javax.annotation.Nullable Double repurchaseOfCapitalStock) {
    this.repurchaseOfCapitalStock = repurchaseOfCapitalStock;
    return this;
  }

  /**
   * Repurchase of capital stock
   * @return repurchaseOfCapitalStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPURCHASE_OF_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRepurchaseOfCapitalStock() {
    return repurchaseOfCapitalStock;
  }


  @JsonProperty(value = JSON_PROPERTY_REPURCHASE_OF_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepurchaseOfCapitalStock(@javax.annotation.Nullable Double repurchaseOfCapitalStock) {
    this.repurchaseOfCapitalStock = repurchaseOfCapitalStock;
  }


  public CashFlowDataCashFlowFromFinancingActivities netIssuancePaymentsOfDebt(@javax.annotation.Nullable Double netIssuancePaymentsOfDebt) {
    this.netIssuancePaymentsOfDebt = netIssuancePaymentsOfDebt;
    return this;
  }

  /**
   * Net issuance payments of debt
   * @return netIssuancePaymentsOfDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_ISSUANCE_PAYMENTS_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIssuancePaymentsOfDebt() {
    return netIssuancePaymentsOfDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_ISSUANCE_PAYMENTS_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIssuancePaymentsOfDebt(@javax.annotation.Nullable Double netIssuancePaymentsOfDebt) {
    this.netIssuancePaymentsOfDebt = netIssuancePaymentsOfDebt;
  }


  public CashFlowDataCashFlowFromFinancingActivities netShortTermDebtIssuance(@javax.annotation.Nullable Double netShortTermDebtIssuance) {
    this.netShortTermDebtIssuance = netShortTermDebtIssuance;
    return this;
  }

  /**
   * Net short term debt issuance
   * @return netShortTermDebtIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_SHORT_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetShortTermDebtIssuance() {
    return netShortTermDebtIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_SHORT_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetShortTermDebtIssuance(@javax.annotation.Nullable Double netShortTermDebtIssuance) {
    this.netShortTermDebtIssuance = netShortTermDebtIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities shortTermDebtPayments(@javax.annotation.Nullable Double shortTermDebtPayments) {
    this.shortTermDebtPayments = shortTermDebtPayments;
    return this;
  }

  /**
   * Short term debt payments
   * @return shortTermDebtPayments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShortTermDebtPayments() {
    return shortTermDebtPayments;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortTermDebtPayments(@javax.annotation.Nullable Double shortTermDebtPayments) {
    this.shortTermDebtPayments = shortTermDebtPayments;
  }


  public CashFlowDataCashFlowFromFinancingActivities shortTermDebtIssuance(@javax.annotation.Nullable Double shortTermDebtIssuance) {
    this.shortTermDebtIssuance = shortTermDebtIssuance;
    return this;
  }

  /**
   * Short term debt issuance
   * @return shortTermDebtIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShortTermDebtIssuance() {
    return shortTermDebtIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortTermDebtIssuance(@javax.annotation.Nullable Double shortTermDebtIssuance) {
    this.shortTermDebtIssuance = shortTermDebtIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities netLongTermDebtIssuance(@javax.annotation.Nullable Double netLongTermDebtIssuance) {
    this.netLongTermDebtIssuance = netLongTermDebtIssuance;
    return this;
  }

  /**
   * Net long term debt issuance
   * @return netLongTermDebtIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_LONG_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetLongTermDebtIssuance() {
    return netLongTermDebtIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_LONG_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetLongTermDebtIssuance(@javax.annotation.Nullable Double netLongTermDebtIssuance) {
    this.netLongTermDebtIssuance = netLongTermDebtIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities longTermDebtPayments(@javax.annotation.Nullable Double longTermDebtPayments) {
    this.longTermDebtPayments = longTermDebtPayments;
    return this;
  }

  /**
   * Long term debt payments
   * @return longTermDebtPayments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermDebtPayments() {
    return longTermDebtPayments;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermDebtPayments(@javax.annotation.Nullable Double longTermDebtPayments) {
    this.longTermDebtPayments = longTermDebtPayments;
  }


  public CashFlowDataCashFlowFromFinancingActivities longTermDebtIssuance(@javax.annotation.Nullable Double longTermDebtIssuance) {
    this.longTermDebtIssuance = longTermDebtIssuance;
    return this;
  }

  /**
   * Long term debt issuance
   * @return longTermDebtIssuance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermDebtIssuance() {
    return longTermDebtIssuance;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermDebtIssuance(@javax.annotation.Nullable Double longTermDebtIssuance) {
    this.longTermDebtIssuance = longTermDebtIssuance;
  }


  public CashFlowDataCashFlowFromFinancingActivities issuanceOfDebt(@javax.annotation.Nullable Double issuanceOfDebt) {
    this.issuanceOfDebt = issuanceOfDebt;
    return this;
  }

  /**
   * Issuance of debt
   * @return issuanceOfDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ISSUANCE_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIssuanceOfDebt() {
    return issuanceOfDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_ISSUANCE_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuanceOfDebt(@javax.annotation.Nullable Double issuanceOfDebt) {
    this.issuanceOfDebt = issuanceOfDebt;
  }


  public CashFlowDataCashFlowFromFinancingActivities repaymentOfDebt(@javax.annotation.Nullable Double repaymentOfDebt) {
    this.repaymentOfDebt = repaymentOfDebt;
    return this;
  }

  /**
   * Repayment of debt
   * @return repaymentOfDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPAYMENT_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRepaymentOfDebt() {
    return repaymentOfDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_REPAYMENT_OF_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepaymentOfDebt(@javax.annotation.Nullable Double repaymentOfDebt) {
    this.repaymentOfDebt = repaymentOfDebt;
  }


  public CashFlowDataCashFlowFromFinancingActivities issuanceOfCapitalStock(@javax.annotation.Nullable Double issuanceOfCapitalStock) {
    this.issuanceOfCapitalStock = issuanceOfCapitalStock;
    return this;
  }

  /**
   * Issuance of capital stock
   * @return issuanceOfCapitalStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ISSUANCE_OF_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIssuanceOfCapitalStock() {
    return issuanceOfCapitalStock;
  }


  @JsonProperty(value = JSON_PROPERTY_ISSUANCE_OF_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuanceOfCapitalStock(@javax.annotation.Nullable Double issuanceOfCapitalStock) {
    this.issuanceOfCapitalStock = issuanceOfCapitalStock;
  }


  /**
   * Return true if this CashFlowData_cash_flow_from_financing_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataCashFlowFromFinancingActivities cashFlowDataCashFlowFromFinancingActivities = (CashFlowDataCashFlowFromFinancingActivities) o;
    return Objects.equals(this.financingCashFlow, cashFlowDataCashFlowFromFinancingActivities.financingCashFlow) &&
        Objects.equals(this.cashFlowFromContinuingFinancingActivities, cashFlowDataCashFlowFromFinancingActivities.cashFlowFromContinuingFinancingActivities) &&
        Objects.equals(this.cashFromDiscontinuedFinancingActivities, cashFlowDataCashFlowFromFinancingActivities.cashFromDiscontinuedFinancingActivities) &&
        Objects.equals(this.netOtherFinancingCharges, cashFlowDataCashFlowFromFinancingActivities.netOtherFinancingCharges) &&
        Objects.equals(this.interestPaidCff, cashFlowDataCashFlowFromFinancingActivities.interestPaidCff) &&
        Objects.equals(this.proceedsFromStockOptionExercised, cashFlowDataCashFlowFromFinancingActivities.proceedsFromStockOptionExercised) &&
        Objects.equals(this.cashDividendsPaid, cashFlowDataCashFlowFromFinancingActivities.cashDividendsPaid) &&
        Objects.equals(this.preferredStockDividendPaid, cashFlowDataCashFlowFromFinancingActivities.preferredStockDividendPaid) &&
        Objects.equals(this.commonStockDividendPaid, cashFlowDataCashFlowFromFinancingActivities.commonStockDividendPaid) &&
        Objects.equals(this.netPreferredStockIssuance, cashFlowDataCashFlowFromFinancingActivities.netPreferredStockIssuance) &&
        Objects.equals(this.preferredStockPayments, cashFlowDataCashFlowFromFinancingActivities.preferredStockPayments) &&
        Objects.equals(this.preferredStockIssuance, cashFlowDataCashFlowFromFinancingActivities.preferredStockIssuance) &&
        Objects.equals(this.netCommonStockIssuance, cashFlowDataCashFlowFromFinancingActivities.netCommonStockIssuance) &&
        Objects.equals(this.commonStockPayments, cashFlowDataCashFlowFromFinancingActivities.commonStockPayments) &&
        Objects.equals(this.commonStockIssuance, cashFlowDataCashFlowFromFinancingActivities.commonStockIssuance) &&
        Objects.equals(this.repurchaseOfCapitalStock, cashFlowDataCashFlowFromFinancingActivities.repurchaseOfCapitalStock) &&
        Objects.equals(this.netIssuancePaymentsOfDebt, cashFlowDataCashFlowFromFinancingActivities.netIssuancePaymentsOfDebt) &&
        Objects.equals(this.netShortTermDebtIssuance, cashFlowDataCashFlowFromFinancingActivities.netShortTermDebtIssuance) &&
        Objects.equals(this.shortTermDebtPayments, cashFlowDataCashFlowFromFinancingActivities.shortTermDebtPayments) &&
        Objects.equals(this.shortTermDebtIssuance, cashFlowDataCashFlowFromFinancingActivities.shortTermDebtIssuance) &&
        Objects.equals(this.netLongTermDebtIssuance, cashFlowDataCashFlowFromFinancingActivities.netLongTermDebtIssuance) &&
        Objects.equals(this.longTermDebtPayments, cashFlowDataCashFlowFromFinancingActivities.longTermDebtPayments) &&
        Objects.equals(this.longTermDebtIssuance, cashFlowDataCashFlowFromFinancingActivities.longTermDebtIssuance) &&
        Objects.equals(this.issuanceOfDebt, cashFlowDataCashFlowFromFinancingActivities.issuanceOfDebt) &&
        Objects.equals(this.repaymentOfDebt, cashFlowDataCashFlowFromFinancingActivities.repaymentOfDebt) &&
        Objects.equals(this.issuanceOfCapitalStock, cashFlowDataCashFlowFromFinancingActivities.issuanceOfCapitalStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financingCashFlow, cashFlowFromContinuingFinancingActivities, cashFromDiscontinuedFinancingActivities, netOtherFinancingCharges, interestPaidCff, proceedsFromStockOptionExercised, cashDividendsPaid, preferredStockDividendPaid, commonStockDividendPaid, netPreferredStockIssuance, preferredStockPayments, preferredStockIssuance, netCommonStockIssuance, commonStockPayments, commonStockIssuance, repurchaseOfCapitalStock, netIssuancePaymentsOfDebt, netShortTermDebtIssuance, shortTermDebtPayments, shortTermDebtIssuance, netLongTermDebtIssuance, longTermDebtPayments, longTermDebtIssuance, issuanceOfDebt, repaymentOfDebt, issuanceOfCapitalStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataCashFlowFromFinancingActivities {\n");
    sb.append("    financingCashFlow: ").append(toIndentedString(financingCashFlow)).append("\n");
    sb.append("    cashFlowFromContinuingFinancingActivities: ").append(toIndentedString(cashFlowFromContinuingFinancingActivities)).append("\n");
    sb.append("    cashFromDiscontinuedFinancingActivities: ").append(toIndentedString(cashFromDiscontinuedFinancingActivities)).append("\n");
    sb.append("    netOtherFinancingCharges: ").append(toIndentedString(netOtherFinancingCharges)).append("\n");
    sb.append("    interestPaidCff: ").append(toIndentedString(interestPaidCff)).append("\n");
    sb.append("    proceedsFromStockOptionExercised: ").append(toIndentedString(proceedsFromStockOptionExercised)).append("\n");
    sb.append("    cashDividendsPaid: ").append(toIndentedString(cashDividendsPaid)).append("\n");
    sb.append("    preferredStockDividendPaid: ").append(toIndentedString(preferredStockDividendPaid)).append("\n");
    sb.append("    commonStockDividendPaid: ").append(toIndentedString(commonStockDividendPaid)).append("\n");
    sb.append("    netPreferredStockIssuance: ").append(toIndentedString(netPreferredStockIssuance)).append("\n");
    sb.append("    preferredStockPayments: ").append(toIndentedString(preferredStockPayments)).append("\n");
    sb.append("    preferredStockIssuance: ").append(toIndentedString(preferredStockIssuance)).append("\n");
    sb.append("    netCommonStockIssuance: ").append(toIndentedString(netCommonStockIssuance)).append("\n");
    sb.append("    commonStockPayments: ").append(toIndentedString(commonStockPayments)).append("\n");
    sb.append("    commonStockIssuance: ").append(toIndentedString(commonStockIssuance)).append("\n");
    sb.append("    repurchaseOfCapitalStock: ").append(toIndentedString(repurchaseOfCapitalStock)).append("\n");
    sb.append("    netIssuancePaymentsOfDebt: ").append(toIndentedString(netIssuancePaymentsOfDebt)).append("\n");
    sb.append("    netShortTermDebtIssuance: ").append(toIndentedString(netShortTermDebtIssuance)).append("\n");
    sb.append("    shortTermDebtPayments: ").append(toIndentedString(shortTermDebtPayments)).append("\n");
    sb.append("    shortTermDebtIssuance: ").append(toIndentedString(shortTermDebtIssuance)).append("\n");
    sb.append("    netLongTermDebtIssuance: ").append(toIndentedString(netLongTermDebtIssuance)).append("\n");
    sb.append("    longTermDebtPayments: ").append(toIndentedString(longTermDebtPayments)).append("\n");
    sb.append("    longTermDebtIssuance: ").append(toIndentedString(longTermDebtIssuance)).append("\n");
    sb.append("    issuanceOfDebt: ").append(toIndentedString(issuanceOfDebt)).append("\n");
    sb.append("    repaymentOfDebt: ").append(toIndentedString(repaymentOfDebt)).append("\n");
    sb.append("    issuanceOfCapitalStock: ").append(toIndentedString(issuanceOfCapitalStock)).append("\n");
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

    // add `financing_cash_flow` to the URL query string
    if (getFinancingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinancing_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinancingCashFlow()))));
    }

    // add `cash_flow_from_continuing_financing_activities` to the URL query string
    if (getCashFlowFromContinuingFinancingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_flow_from_continuing_financing_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFlowFromContinuingFinancingActivities()))));
    }

    // add `cash_from_discontinued_financing_activities` to the URL query string
    if (getCashFromDiscontinuedFinancingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_from_discontinued_financing_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFromDiscontinuedFinancingActivities()))));
    }

    // add `net_other_financing_charges` to the URL query string
    if (getNetOtherFinancingCharges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_other_financing_charges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetOtherFinancingCharges()))));
    }

    // add `interest_paid_cff` to the URL query string
    if (getInterestPaidCff() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_paid_cff%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPaidCff()))));
    }

    // add `proceeds_from_stock_option_exercised` to the URL query string
    if (getProceedsFromStockOptionExercised() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sproceeds_from_stock_option_exercised%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProceedsFromStockOptionExercised()))));
    }

    // add `cash_dividends_paid` to the URL query string
    if (getCashDividendsPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_dividends_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashDividendsPaid()))));
    }

    // add `preferred_stock_dividend_paid` to the URL query string
    if (getPreferredStockDividendPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_dividend_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockDividendPaid()))));
    }

    // add `common_stock_dividend_paid` to the URL query string
    if (getCommonStockDividendPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_dividend_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockDividendPaid()))));
    }

    // add `net_preferred_stock_issuance` to the URL query string
    if (getNetPreferredStockIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_preferred_stock_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetPreferredStockIssuance()))));
    }

    // add `preferred_stock_payments` to the URL query string
    if (getPreferredStockPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockPayments()))));
    }

    // add `preferred_stock_issuance` to the URL query string
    if (getPreferredStockIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockIssuance()))));
    }

    // add `net_common_stock_issuance` to the URL query string
    if (getNetCommonStockIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_common_stock_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetCommonStockIssuance()))));
    }

    // add `common_stock_payments` to the URL query string
    if (getCommonStockPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockPayments()))));
    }

    // add `common_stock_issuance` to the URL query string
    if (getCommonStockIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockIssuance()))));
    }

    // add `repurchase_of_capital_stock` to the URL query string
    if (getRepurchaseOfCapitalStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srepurchase_of_capital_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRepurchaseOfCapitalStock()))));
    }

    // add `net_issuance_payments_of_debt` to the URL query string
    if (getNetIssuancePaymentsOfDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_issuance_payments_of_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIssuancePaymentsOfDebt()))));
    }

    // add `net_short_term_debt_issuance` to the URL query string
    if (getNetShortTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_short_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetShortTermDebtIssuance()))));
    }

    // add `short_term_debt_payments` to the URL query string
    if (getShortTermDebtPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_term_debt_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortTermDebtPayments()))));
    }

    // add `short_term_debt_issuance` to the URL query string
    if (getShortTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortTermDebtIssuance()))));
    }

    // add `net_long_term_debt_issuance` to the URL query string
    if (getNetLongTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_long_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetLongTermDebtIssuance()))));
    }

    // add `long_term_debt_payments` to the URL query string
    if (getLongTermDebtPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebtPayments()))));
    }

    // add `long_term_debt_issuance` to the URL query string
    if (getLongTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebtIssuance()))));
    }

    // add `issuance_of_debt` to the URL query string
    if (getIssuanceOfDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sissuance_of_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIssuanceOfDebt()))));
    }

    // add `repayment_of_debt` to the URL query string
    if (getRepaymentOfDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srepayment_of_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRepaymentOfDebt()))));
    }

    // add `issuance_of_capital_stock` to the URL query string
    if (getIssuanceOfCapitalStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sissuance_of_capital_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIssuanceOfCapitalStock()))));
    }

    return joiner.toString();
  }
}

