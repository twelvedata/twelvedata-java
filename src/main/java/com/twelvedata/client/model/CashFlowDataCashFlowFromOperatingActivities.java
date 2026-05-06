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
 * Cash flow from operating activities
 */
@JsonPropertyOrder({
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATIONS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_OPERATING_CASH_FLOW,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_OPERATING_ACTIVITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CASH_FROM_DISCONTINUED_OPERATING_ACTIVITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CASH_FLOW_FROM_DISCONTINUED_OPERATION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_FREE_CASH_FLOW,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CASH_FLOWS_FROM_USED_IN_OPERATING_ACTIVITIES_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_TAXES_REFUND_PAID,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_TAXES_REFUND_PAID_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_INTEREST_RECEIVED,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_INTEREST_RECEIVED_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_INTEREST_PAID,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_INTEREST_PAID_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DIVIDEND_RECEIVED,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DIVIDEND_RECEIVED_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DIVIDEND_PAID,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DIVIDEND_PAID_DIRECT,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_WORKING_CAPITAL,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_OTHER_WORKING_CAPITAL,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_RECEIVABLES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGES_IN_ACCOUNT_RECEIVABLES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_PAYABLES_AND_ACCRUED_EXPENSE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_ACCRUED_EXPENSE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_DIVIDEND_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_ACCOUNT_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_TAX_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_INCOME_TAX_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_INTEREST_PAYABLE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_LIABILITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_ASSETS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_INVENTORY,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_CHANGE_IN_PREPAID_ASSETS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_OTHER_NON_CASH_ITEMS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_EXCESS_TAX_BENEFIT_FROM_STOCK_BASED_COMPENSATION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_STOCK_BASED_COMPENSATION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_UNREALIZED_GAIN_LOSS_ON_INVESTMENT_SECURITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_PROVISION_AND_WRITE_OFF_OF_ASSETS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_ASSET_IMPAIRMENT_CHARGE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_AMORTIZATION_OF_SECURITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEFERRED_TAX,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEFERRED_INCOME_TAX,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEPLETION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_AMORTIZATION_CASH_FLOW,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_DEPRECIATION,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_OPERATING_GAINS_LOSSES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_PENSION_AND_EMPLOYEE_BENEFIT_EXPENSE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_EARNINGS_LOSSES_FROM_EQUITY_INVESTMENTS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_GAIN_LOSS_ON_INVESTMENT_SECURITIES,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_NET_FOREIGN_CURRENCY_EXCHANGE_GAIN_LOSS,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_PPE,
  CashFlowDataCashFlowFromOperatingActivities.JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_BUSINESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataCashFlowFromOperatingActivities {
  public static final String JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATIONS = "net_income_from_continuing_operations";
  @javax.annotation.Nullable
  private Double netIncomeFromContinuingOperations;

  public static final String JSON_PROPERTY_OPERATING_CASH_FLOW = "operating_cash_flow";
  @javax.annotation.Nullable
  private Double operatingCashFlow;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_OPERATING_ACTIVITIES = "cash_flow_from_continuing_operating_activities";
  @javax.annotation.Nullable
  private Double cashFlowFromContinuingOperatingActivities;

  public static final String JSON_PROPERTY_CASH_FROM_DISCONTINUED_OPERATING_ACTIVITIES = "cash_from_discontinued_operating_activities";
  @javax.annotation.Nullable
  private Double cashFromDiscontinuedOperatingActivities;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_DISCONTINUED_OPERATION = "cash_flow_from_discontinued_operation";
  @javax.annotation.Nullable
  private Double cashFlowFromDiscontinuedOperation;

  public static final String JSON_PROPERTY_FREE_CASH_FLOW = "free_cash_flow";
  @javax.annotation.Nullable
  private Double freeCashFlow;

  public static final String JSON_PROPERTY_CASH_FLOWS_FROM_USED_IN_OPERATING_ACTIVITIES_DIRECT = "cash_flows_from_used_in_operating_activities_direct";
  @javax.annotation.Nullable
  private Double cashFlowsFromUsedInOperatingActivitiesDirect;

  public static final String JSON_PROPERTY_TAXES_REFUND_PAID = "taxes_refund_paid";
  @javax.annotation.Nullable
  private Double taxesRefundPaid;

  public static final String JSON_PROPERTY_TAXES_REFUND_PAID_DIRECT = "taxes_refund_paid_direct";
  @javax.annotation.Nullable
  private Double taxesRefundPaidDirect;

  public static final String JSON_PROPERTY_INTEREST_RECEIVED = "interest_received";
  @javax.annotation.Nullable
  private Double interestReceived;

  public static final String JSON_PROPERTY_INTEREST_RECEIVED_DIRECT = "interest_received_direct";
  @javax.annotation.Nullable
  private Double interestReceivedDirect;

  public static final String JSON_PROPERTY_INTEREST_PAID = "interest_paid";
  @javax.annotation.Nullable
  private Double interestPaid;

  public static final String JSON_PROPERTY_INTEREST_PAID_DIRECT = "interest_paid_direct";
  @javax.annotation.Nullable
  private Double interestPaidDirect;

  public static final String JSON_PROPERTY_DIVIDEND_RECEIVED = "dividend_received";
  @javax.annotation.Nullable
  private Double dividendReceived;

  public static final String JSON_PROPERTY_DIVIDEND_RECEIVED_DIRECT = "dividend_received_direct";
  @javax.annotation.Nullable
  private Double dividendReceivedDirect;

  public static final String JSON_PROPERTY_DIVIDEND_PAID = "dividend_paid";
  @javax.annotation.Nullable
  private Double dividendPaid;

  public static final String JSON_PROPERTY_DIVIDEND_PAID_DIRECT = "dividend_paid_direct";
  @javax.annotation.Nullable
  private Double dividendPaidDirect;

  public static final String JSON_PROPERTY_CHANGE_IN_WORKING_CAPITAL = "change_in_working_capital";
  @javax.annotation.Nullable
  private Double changeInWorkingCapital;

  public static final String JSON_PROPERTY_CHANGE_IN_OTHER_WORKING_CAPITAL = "change_in_other_working_capital";
  @javax.annotation.Nullable
  private Double changeInOtherWorkingCapital;

  public static final String JSON_PROPERTY_CHANGE_IN_RECEIVABLES = "change_in_receivables";
  @javax.annotation.Nullable
  private Double changeInReceivables;

  public static final String JSON_PROPERTY_CHANGES_IN_ACCOUNT_RECEIVABLES = "changes_in_account_receivables";
  @javax.annotation.Nullable
  private Double changesInAccountReceivables;

  public static final String JSON_PROPERTY_CHANGE_IN_PAYABLES_AND_ACCRUED_EXPENSE = "change_in_payables_and_accrued_expense";
  @javax.annotation.Nullable
  private Double changeInPayablesAndAccruedExpense;

  public static final String JSON_PROPERTY_CHANGE_IN_ACCRUED_EXPENSE = "change_in_accrued_expense";
  @javax.annotation.Nullable
  private Double changeInAccruedExpense;

  public static final String JSON_PROPERTY_CHANGE_IN_PAYABLE = "change_in_payable";
  @javax.annotation.Nullable
  private Double changeInPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_DIVIDEND_PAYABLE = "change_in_dividend_payable";
  @javax.annotation.Nullable
  private Double changeInDividendPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_ACCOUNT_PAYABLE = "change_in_account_payable";
  @javax.annotation.Nullable
  private Double changeInAccountPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_TAX_PAYABLE = "change_in_tax_payable";
  @javax.annotation.Nullable
  private Double changeInTaxPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_INCOME_TAX_PAYABLE = "change_in_income_tax_payable";
  @javax.annotation.Nullable
  private Double changeInIncomeTaxPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_INTEREST_PAYABLE = "change_in_interest_payable";
  @javax.annotation.Nullable
  private Double changeInInterestPayable;

  public static final String JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_LIABILITIES = "change_in_other_current_liabilities";
  @javax.annotation.Nullable
  private Double changeInOtherCurrentLiabilities;

  public static final String JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_ASSETS = "change_in_other_current_assets";
  @javax.annotation.Nullable
  private Double changeInOtherCurrentAssets;

  public static final String JSON_PROPERTY_CHANGE_IN_INVENTORY = "change_in_inventory";
  @javax.annotation.Nullable
  private Double changeInInventory;

  public static final String JSON_PROPERTY_CHANGE_IN_PREPAID_ASSETS = "change_in_prepaid_assets";
  @javax.annotation.Nullable
  private Double changeInPrepaidAssets;

  public static final String JSON_PROPERTY_OTHER_NON_CASH_ITEMS = "other_non_cash_items";
  @javax.annotation.Nullable
  private Double otherNonCashItems;

  public static final String JSON_PROPERTY_EXCESS_TAX_BENEFIT_FROM_STOCK_BASED_COMPENSATION = "excess_tax_benefit_from_stock_based_compensation";
  @javax.annotation.Nullable
  private Double excessTaxBenefitFromStockBasedCompensation;

  public static final String JSON_PROPERTY_STOCK_BASED_COMPENSATION = "stock_based_compensation";
  @javax.annotation.Nullable
  private Double stockBasedCompensation;

  public static final String JSON_PROPERTY_UNREALIZED_GAIN_LOSS_ON_INVESTMENT_SECURITIES = "unrealized_gain_loss_on_investment_securities";
  @javax.annotation.Nullable
  private Double unrealizedGainLossOnInvestmentSecurities;

  public static final String JSON_PROPERTY_PROVISION_AND_WRITE_OFF_OF_ASSETS = "provision_and_write_off_of_assets";
  @javax.annotation.Nullable
  private Double provisionAndWriteOffOfAssets;

  public static final String JSON_PROPERTY_ASSET_IMPAIRMENT_CHARGE = "asset_impairment_charge";
  @javax.annotation.Nullable
  private Double assetImpairmentCharge;

  public static final String JSON_PROPERTY_AMORTIZATION_OF_SECURITIES = "amortization_of_securities";
  @javax.annotation.Nullable
  private Double amortizationOfSecurities;

  public static final String JSON_PROPERTY_DEFERRED_TAX = "deferred_tax";
  @javax.annotation.Nullable
  private Double deferredTax;

  public static final String JSON_PROPERTY_DEFERRED_INCOME_TAX = "deferred_income_tax";
  @javax.annotation.Nullable
  private Double deferredIncomeTax;

  public static final String JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION = "depreciation_amortization_depletion";
  @javax.annotation.Nullable
  private Double depreciationAmortizationDepletion;

  public static final String JSON_PROPERTY_DEPLETION = "depletion";
  @javax.annotation.Nullable
  private Double depletion;

  public static final String JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION = "depreciation_and_amortization";
  @javax.annotation.Nullable
  private Double depreciationAndAmortization;

  public static final String JSON_PROPERTY_AMORTIZATION_CASH_FLOW = "amortization_cash_flow";
  @javax.annotation.Nullable
  private Double amortizationCashFlow;

  public static final String JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES = "amortization_of_intangibles";
  @javax.annotation.Nullable
  private Double amortizationOfIntangibles;

  public static final String JSON_PROPERTY_DEPRECIATION = "depreciation";
  @javax.annotation.Nullable
  private Double depreciation;

  public static final String JSON_PROPERTY_OPERATING_GAINS_LOSSES = "operating_gains_losses";
  @javax.annotation.Nullable
  private Double operatingGainsLosses;

  public static final String JSON_PROPERTY_PENSION_AND_EMPLOYEE_BENEFIT_EXPENSE = "pension_and_employee_benefit_expense";
  @javax.annotation.Nullable
  private Double pensionAndEmployeeBenefitExpense;

  public static final String JSON_PROPERTY_EARNINGS_LOSSES_FROM_EQUITY_INVESTMENTS = "earnings_losses_from_equity_investments";
  @javax.annotation.Nullable
  private Double earningsLossesFromEquityInvestments;

  public static final String JSON_PROPERTY_GAIN_LOSS_ON_INVESTMENT_SECURITIES = "gain_loss_on_investment_securities";
  @javax.annotation.Nullable
  private Double gainLossOnInvestmentSecurities;

  public static final String JSON_PROPERTY_NET_FOREIGN_CURRENCY_EXCHANGE_GAIN_LOSS = "net_foreign_currency_exchange_gain_loss";
  @javax.annotation.Nullable
  private Double netForeignCurrencyExchangeGainLoss;

  public static final String JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_PPE = "gain_loss_on_sale_of_ppe";
  @javax.annotation.Nullable
  private Double gainLossOnSaleOfPpe;

  public static final String JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_BUSINESS = "gain_loss_on_sale_of_business";
  @javax.annotation.Nullable
  private Double gainLossOnSaleOfBusiness;

  public CashFlowDataCashFlowFromOperatingActivities() { 
  }

  public CashFlowDataCashFlowFromOperatingActivities netIncomeFromContinuingOperations(@javax.annotation.Nullable Double netIncomeFromContinuingOperations) {
    this.netIncomeFromContinuingOperations = netIncomeFromContinuingOperations;
    return this;
  }

  /**
   * Net income from continuing operations
   * @return netIncomeFromContinuingOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeFromContinuingOperations() {
    return netIncomeFromContinuingOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeFromContinuingOperations(@javax.annotation.Nullable Double netIncomeFromContinuingOperations) {
    this.netIncomeFromContinuingOperations = netIncomeFromContinuingOperations;
  }


  public CashFlowDataCashFlowFromOperatingActivities operatingCashFlow(@javax.annotation.Nullable Double operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
    return this;
  }

  /**
   * Operating cash flow
   * @return operatingCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingCashFlow() {
    return operatingCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingCashFlow(@javax.annotation.Nullable Double operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
  }


  public CashFlowDataCashFlowFromOperatingActivities cashFlowFromContinuingOperatingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingOperatingActivities) {
    this.cashFlowFromContinuingOperatingActivities = cashFlowFromContinuingOperatingActivities;
    return this;
  }

  /**
   * Cash flow from continuing operating activities
   * @return cashFlowFromContinuingOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFlowFromContinuingOperatingActivities() {
    return cashFlowFromContinuingOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromContinuingOperatingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingOperatingActivities) {
    this.cashFlowFromContinuingOperatingActivities = cashFlowFromContinuingOperatingActivities;
  }


  public CashFlowDataCashFlowFromOperatingActivities cashFromDiscontinuedOperatingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedOperatingActivities) {
    this.cashFromDiscontinuedOperatingActivities = cashFromDiscontinuedOperatingActivities;
    return this;
  }

  /**
   * Cash from discontinued operating activities
   * @return cashFromDiscontinuedOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFromDiscontinuedOperatingActivities() {
    return cashFromDiscontinuedOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFromDiscontinuedOperatingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedOperatingActivities) {
    this.cashFromDiscontinuedOperatingActivities = cashFromDiscontinuedOperatingActivities;
  }


  public CashFlowDataCashFlowFromOperatingActivities cashFlowFromDiscontinuedOperation(@javax.annotation.Nullable Double cashFlowFromDiscontinuedOperation) {
    this.cashFlowFromDiscontinuedOperation = cashFlowFromDiscontinuedOperation;
    return this;
  }

  /**
   * Cash flow from discontinued operation
   * @return cashFlowFromDiscontinuedOperation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_DISCONTINUED_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFlowFromDiscontinuedOperation() {
    return cashFlowFromDiscontinuedOperation;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_DISCONTINUED_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromDiscontinuedOperation(@javax.annotation.Nullable Double cashFlowFromDiscontinuedOperation) {
    this.cashFlowFromDiscontinuedOperation = cashFlowFromDiscontinuedOperation;
  }


  public CashFlowDataCashFlowFromOperatingActivities freeCashFlow(@javax.annotation.Nullable Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
    return this;
  }

  /**
   * Free cash flow
   * @return freeCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FREE_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFreeCashFlow() {
    return freeCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_FREE_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeCashFlow(@javax.annotation.Nullable Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
  }


  public CashFlowDataCashFlowFromOperatingActivities cashFlowsFromUsedInOperatingActivitiesDirect(@javax.annotation.Nullable Double cashFlowsFromUsedInOperatingActivitiesDirect) {
    this.cashFlowsFromUsedInOperatingActivitiesDirect = cashFlowsFromUsedInOperatingActivitiesDirect;
    return this;
  }

  /**
   * Cash flows from used in operating activities direct
   * @return cashFlowsFromUsedInOperatingActivitiesDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOWS_FROM_USED_IN_OPERATING_ACTIVITIES_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFlowsFromUsedInOperatingActivitiesDirect() {
    return cashFlowsFromUsedInOperatingActivitiesDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOWS_FROM_USED_IN_OPERATING_ACTIVITIES_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowsFromUsedInOperatingActivitiesDirect(@javax.annotation.Nullable Double cashFlowsFromUsedInOperatingActivitiesDirect) {
    this.cashFlowsFromUsedInOperatingActivitiesDirect = cashFlowsFromUsedInOperatingActivitiesDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities taxesRefundPaid(@javax.annotation.Nullable Double taxesRefundPaid) {
    this.taxesRefundPaid = taxesRefundPaid;
    return this;
  }

  /**
   * Taxes refund paid
   * @return taxesRefundPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAXES_REFUND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxesRefundPaid() {
    return taxesRefundPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_TAXES_REFUND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxesRefundPaid(@javax.annotation.Nullable Double taxesRefundPaid) {
    this.taxesRefundPaid = taxesRefundPaid;
  }


  public CashFlowDataCashFlowFromOperatingActivities taxesRefundPaidDirect(@javax.annotation.Nullable Double taxesRefundPaidDirect) {
    this.taxesRefundPaidDirect = taxesRefundPaidDirect;
    return this;
  }

  /**
   * Taxes refund paid direct
   * @return taxesRefundPaidDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAXES_REFUND_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxesRefundPaidDirect() {
    return taxesRefundPaidDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_TAXES_REFUND_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxesRefundPaidDirect(@javax.annotation.Nullable Double taxesRefundPaidDirect) {
    this.taxesRefundPaidDirect = taxesRefundPaidDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities interestReceived(@javax.annotation.Nullable Double interestReceived) {
    this.interestReceived = interestReceived;
    return this;
  }

  /**
   * Interest received
   * @return interestReceived
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestReceived() {
    return interestReceived;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestReceived(@javax.annotation.Nullable Double interestReceived) {
    this.interestReceived = interestReceived;
  }


  public CashFlowDataCashFlowFromOperatingActivities interestReceivedDirect(@javax.annotation.Nullable Double interestReceivedDirect) {
    this.interestReceivedDirect = interestReceivedDirect;
    return this;
  }

  /**
   * Interest received direct
   * @return interestReceivedDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestReceivedDirect() {
    return interestReceivedDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestReceivedDirect(@javax.annotation.Nullable Double interestReceivedDirect) {
    this.interestReceivedDirect = interestReceivedDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities interestPaid(@javax.annotation.Nullable Double interestPaid) {
    this.interestPaid = interestPaid;
    return this;
  }

  /**
   * Interest paid
   * @return interestPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPaid() {
    return interestPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPaid(@javax.annotation.Nullable Double interestPaid) {
    this.interestPaid = interestPaid;
  }


  public CashFlowDataCashFlowFromOperatingActivities interestPaidDirect(@javax.annotation.Nullable Double interestPaidDirect) {
    this.interestPaidDirect = interestPaidDirect;
    return this;
  }

  /**
   * Interest paid direct
   * @return interestPaidDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPaidDirect() {
    return interestPaidDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPaidDirect(@javax.annotation.Nullable Double interestPaidDirect) {
    this.interestPaidDirect = interestPaidDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities dividendReceived(@javax.annotation.Nullable Double dividendReceived) {
    this.dividendReceived = dividendReceived;
    return this;
  }

  /**
   * Dividend received
   * @return dividendReceived
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_RECEIVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendReceived() {
    return dividendReceived;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_RECEIVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendReceived(@javax.annotation.Nullable Double dividendReceived) {
    this.dividendReceived = dividendReceived;
  }


  public CashFlowDataCashFlowFromOperatingActivities dividendReceivedDirect(@javax.annotation.Nullable Double dividendReceivedDirect) {
    this.dividendReceivedDirect = dividendReceivedDirect;
    return this;
  }

  /**
   * Dividend received direct
   * @return dividendReceivedDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_RECEIVED_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendReceivedDirect() {
    return dividendReceivedDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_RECEIVED_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendReceivedDirect(@javax.annotation.Nullable Double dividendReceivedDirect) {
    this.dividendReceivedDirect = dividendReceivedDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities dividendPaid(@javax.annotation.Nullable Double dividendPaid) {
    this.dividendPaid = dividendPaid;
    return this;
  }

  /**
   * Dividend paid
   * @return dividendPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendPaid() {
    return dividendPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendPaid(@javax.annotation.Nullable Double dividendPaid) {
    this.dividendPaid = dividendPaid;
  }


  public CashFlowDataCashFlowFromOperatingActivities dividendPaidDirect(@javax.annotation.Nullable Double dividendPaidDirect) {
    this.dividendPaidDirect = dividendPaidDirect;
    return this;
  }

  /**
   * Dividend paid direct
   * @return dividendPaidDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendPaidDirect() {
    return dividendPaidDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PAID_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendPaidDirect(@javax.annotation.Nullable Double dividendPaidDirect) {
    this.dividendPaidDirect = dividendPaidDirect;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInWorkingCapital(@javax.annotation.Nullable Double changeInWorkingCapital) {
    this.changeInWorkingCapital = changeInWorkingCapital;
    return this;
  }

  /**
   * Change in working capital
   * @return changeInWorkingCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInWorkingCapital() {
    return changeInWorkingCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInWorkingCapital(@javax.annotation.Nullable Double changeInWorkingCapital) {
    this.changeInWorkingCapital = changeInWorkingCapital;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInOtherWorkingCapital(@javax.annotation.Nullable Double changeInOtherWorkingCapital) {
    this.changeInOtherWorkingCapital = changeInOtherWorkingCapital;
    return this;
  }

  /**
   * Change in other working capital
   * @return changeInOtherWorkingCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInOtherWorkingCapital() {
    return changeInOtherWorkingCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInOtherWorkingCapital(@javax.annotation.Nullable Double changeInOtherWorkingCapital) {
    this.changeInOtherWorkingCapital = changeInOtherWorkingCapital;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInReceivables(@javax.annotation.Nullable Double changeInReceivables) {
    this.changeInReceivables = changeInReceivables;
    return this;
  }

  /**
   * Change in receivables
   * @return changeInReceivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInReceivables() {
    return changeInReceivables;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInReceivables(@javax.annotation.Nullable Double changeInReceivables) {
    this.changeInReceivables = changeInReceivables;
  }


  public CashFlowDataCashFlowFromOperatingActivities changesInAccountReceivables(@javax.annotation.Nullable Double changesInAccountReceivables) {
    this.changesInAccountReceivables = changesInAccountReceivables;
    return this;
  }

  /**
   * Changes in account receivables
   * @return changesInAccountReceivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGES_IN_ACCOUNT_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangesInAccountReceivables() {
    return changesInAccountReceivables;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGES_IN_ACCOUNT_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangesInAccountReceivables(@javax.annotation.Nullable Double changesInAccountReceivables) {
    this.changesInAccountReceivables = changesInAccountReceivables;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInPayablesAndAccruedExpense(@javax.annotation.Nullable Double changeInPayablesAndAccruedExpense) {
    this.changeInPayablesAndAccruedExpense = changeInPayablesAndAccruedExpense;
    return this;
  }

  /**
   * Change in payables and accrued expense
   * @return changeInPayablesAndAccruedExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PAYABLES_AND_ACCRUED_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInPayablesAndAccruedExpense() {
    return changeInPayablesAndAccruedExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PAYABLES_AND_ACCRUED_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInPayablesAndAccruedExpense(@javax.annotation.Nullable Double changeInPayablesAndAccruedExpense) {
    this.changeInPayablesAndAccruedExpense = changeInPayablesAndAccruedExpense;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInAccruedExpense(@javax.annotation.Nullable Double changeInAccruedExpense) {
    this.changeInAccruedExpense = changeInAccruedExpense;
    return this;
  }

  /**
   * Change in accrued expense
   * @return changeInAccruedExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_ACCRUED_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInAccruedExpense() {
    return changeInAccruedExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_ACCRUED_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInAccruedExpense(@javax.annotation.Nullable Double changeInAccruedExpense) {
    this.changeInAccruedExpense = changeInAccruedExpense;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInPayable(@javax.annotation.Nullable Double changeInPayable) {
    this.changeInPayable = changeInPayable;
    return this;
  }

  /**
   * Change in payable
   * @return changeInPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInPayable() {
    return changeInPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInPayable(@javax.annotation.Nullable Double changeInPayable) {
    this.changeInPayable = changeInPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInDividendPayable(@javax.annotation.Nullable Double changeInDividendPayable) {
    this.changeInDividendPayable = changeInDividendPayable;
    return this;
  }

  /**
   * Change in dividend payable
   * @return changeInDividendPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_DIVIDEND_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInDividendPayable() {
    return changeInDividendPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_DIVIDEND_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInDividendPayable(@javax.annotation.Nullable Double changeInDividendPayable) {
    this.changeInDividendPayable = changeInDividendPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInAccountPayable(@javax.annotation.Nullable Double changeInAccountPayable) {
    this.changeInAccountPayable = changeInAccountPayable;
    return this;
  }

  /**
   * Change in account payable
   * @return changeInAccountPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_ACCOUNT_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInAccountPayable() {
    return changeInAccountPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_ACCOUNT_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInAccountPayable(@javax.annotation.Nullable Double changeInAccountPayable) {
    this.changeInAccountPayable = changeInAccountPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInTaxPayable(@javax.annotation.Nullable Double changeInTaxPayable) {
    this.changeInTaxPayable = changeInTaxPayable;
    return this;
  }

  /**
   * Change in tax payable
   * @return changeInTaxPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInTaxPayable() {
    return changeInTaxPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInTaxPayable(@javax.annotation.Nullable Double changeInTaxPayable) {
    this.changeInTaxPayable = changeInTaxPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInIncomeTaxPayable(@javax.annotation.Nullable Double changeInIncomeTaxPayable) {
    this.changeInIncomeTaxPayable = changeInIncomeTaxPayable;
    return this;
  }

  /**
   * Change in income tax payable
   * @return changeInIncomeTaxPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INCOME_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInIncomeTaxPayable() {
    return changeInIncomeTaxPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INCOME_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInIncomeTaxPayable(@javax.annotation.Nullable Double changeInIncomeTaxPayable) {
    this.changeInIncomeTaxPayable = changeInIncomeTaxPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInInterestPayable(@javax.annotation.Nullable Double changeInInterestPayable) {
    this.changeInInterestPayable = changeInInterestPayable;
    return this;
  }

  /**
   * Change in interest payable
   * @return changeInInterestPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INTEREST_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInInterestPayable() {
    return changeInInterestPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INTEREST_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInInterestPayable(@javax.annotation.Nullable Double changeInInterestPayable) {
    this.changeInInterestPayable = changeInInterestPayable;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInOtherCurrentLiabilities(@javax.annotation.Nullable Double changeInOtherCurrentLiabilities) {
    this.changeInOtherCurrentLiabilities = changeInOtherCurrentLiabilities;
    return this;
  }

  /**
   * Change in other current liabilities
   * @return changeInOtherCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInOtherCurrentLiabilities() {
    return changeInOtherCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInOtherCurrentLiabilities(@javax.annotation.Nullable Double changeInOtherCurrentLiabilities) {
    this.changeInOtherCurrentLiabilities = changeInOtherCurrentLiabilities;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInOtherCurrentAssets(@javax.annotation.Nullable Double changeInOtherCurrentAssets) {
    this.changeInOtherCurrentAssets = changeInOtherCurrentAssets;
    return this;
  }

  /**
   * Change in other current assets
   * @return changeInOtherCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInOtherCurrentAssets() {
    return changeInOtherCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_OTHER_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInOtherCurrentAssets(@javax.annotation.Nullable Double changeInOtherCurrentAssets) {
    this.changeInOtherCurrentAssets = changeInOtherCurrentAssets;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInInventory(@javax.annotation.Nullable Double changeInInventory) {
    this.changeInInventory = changeInInventory;
    return this;
  }

  /**
   * Change in inventory
   * @return changeInInventory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInInventory() {
    return changeInInventory;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInInventory(@javax.annotation.Nullable Double changeInInventory) {
    this.changeInInventory = changeInInventory;
  }


  public CashFlowDataCashFlowFromOperatingActivities changeInPrepaidAssets(@javax.annotation.Nullable Double changeInPrepaidAssets) {
    this.changeInPrepaidAssets = changeInPrepaidAssets;
    return this;
  }

  /**
   * Change in prepaid assets
   * @return changeInPrepaidAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangeInPrepaidAssets() {
    return changeInPrepaidAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE_IN_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeInPrepaidAssets(@javax.annotation.Nullable Double changeInPrepaidAssets) {
    this.changeInPrepaidAssets = changeInPrepaidAssets;
  }


  public CashFlowDataCashFlowFromOperatingActivities otherNonCashItems(@javax.annotation.Nullable Double otherNonCashItems) {
    this.otherNonCashItems = otherNonCashItems;
    return this;
  }

  /**
   * Other non cash items
   * @return otherNonCashItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CASH_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonCashItems() {
    return otherNonCashItems;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CASH_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonCashItems(@javax.annotation.Nullable Double otherNonCashItems) {
    this.otherNonCashItems = otherNonCashItems;
  }


  public CashFlowDataCashFlowFromOperatingActivities excessTaxBenefitFromStockBasedCompensation(@javax.annotation.Nullable Double excessTaxBenefitFromStockBasedCompensation) {
    this.excessTaxBenefitFromStockBasedCompensation = excessTaxBenefitFromStockBasedCompensation;
    return this;
  }

  /**
   * Excess tax benefit from stock based compensation
   * @return excessTaxBenefitFromStockBasedCompensation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXCESS_TAX_BENEFIT_FROM_STOCK_BASED_COMPENSATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExcessTaxBenefitFromStockBasedCompensation() {
    return excessTaxBenefitFromStockBasedCompensation;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCESS_TAX_BENEFIT_FROM_STOCK_BASED_COMPENSATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcessTaxBenefitFromStockBasedCompensation(@javax.annotation.Nullable Double excessTaxBenefitFromStockBasedCompensation) {
    this.excessTaxBenefitFromStockBasedCompensation = excessTaxBenefitFromStockBasedCompensation;
  }


  public CashFlowDataCashFlowFromOperatingActivities stockBasedCompensation(@javax.annotation.Nullable Double stockBasedCompensation) {
    this.stockBasedCompensation = stockBasedCompensation;
    return this;
  }

  /**
   * Stock based compensation
   * @return stockBasedCompensation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STOCK_BASED_COMPENSATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStockBasedCompensation() {
    return stockBasedCompensation;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCK_BASED_COMPENSATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockBasedCompensation(@javax.annotation.Nullable Double stockBasedCompensation) {
    this.stockBasedCompensation = stockBasedCompensation;
  }


  public CashFlowDataCashFlowFromOperatingActivities unrealizedGainLossOnInvestmentSecurities(@javax.annotation.Nullable Double unrealizedGainLossOnInvestmentSecurities) {
    this.unrealizedGainLossOnInvestmentSecurities = unrealizedGainLossOnInvestmentSecurities;
    return this;
  }

  /**
   * Unrealized gain loss on investment securities
   * @return unrealizedGainLossOnInvestmentSecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UNREALIZED_GAIN_LOSS_ON_INVESTMENT_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUnrealizedGainLossOnInvestmentSecurities() {
    return unrealizedGainLossOnInvestmentSecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_UNREALIZED_GAIN_LOSS_ON_INVESTMENT_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnrealizedGainLossOnInvestmentSecurities(@javax.annotation.Nullable Double unrealizedGainLossOnInvestmentSecurities) {
    this.unrealizedGainLossOnInvestmentSecurities = unrealizedGainLossOnInvestmentSecurities;
  }


  public CashFlowDataCashFlowFromOperatingActivities provisionAndWriteOffOfAssets(@javax.annotation.Nullable Double provisionAndWriteOffOfAssets) {
    this.provisionAndWriteOffOfAssets = provisionAndWriteOffOfAssets;
    return this;
  }

  /**
   * Provision and write off of assets
   * @return provisionAndWriteOffOfAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_AND_WRITE_OFF_OF_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProvisionAndWriteOffOfAssets() {
    return provisionAndWriteOffOfAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_AND_WRITE_OFF_OF_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionAndWriteOffOfAssets(@javax.annotation.Nullable Double provisionAndWriteOffOfAssets) {
    this.provisionAndWriteOffOfAssets = provisionAndWriteOffOfAssets;
  }


  public CashFlowDataCashFlowFromOperatingActivities assetImpairmentCharge(@javax.annotation.Nullable Double assetImpairmentCharge) {
    this.assetImpairmentCharge = assetImpairmentCharge;
    return this;
  }

  /**
   * Asset impairment charge
   * @return assetImpairmentCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSET_IMPAIRMENT_CHARGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAssetImpairmentCharge() {
    return assetImpairmentCharge;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSET_IMPAIRMENT_CHARGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetImpairmentCharge(@javax.annotation.Nullable Double assetImpairmentCharge) {
    this.assetImpairmentCharge = assetImpairmentCharge;
  }


  public CashFlowDataCashFlowFromOperatingActivities amortizationOfSecurities(@javax.annotation.Nullable Double amortizationOfSecurities) {
    this.amortizationOfSecurities = amortizationOfSecurities;
    return this;
  }

  /**
   * Amortization of securities
   * @return amortizationOfSecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmortizationOfSecurities() {
    return amortizationOfSecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmortizationOfSecurities(@javax.annotation.Nullable Double amortizationOfSecurities) {
    this.amortizationOfSecurities = amortizationOfSecurities;
  }


  public CashFlowDataCashFlowFromOperatingActivities deferredTax(@javax.annotation.Nullable Double deferredTax) {
    this.deferredTax = deferredTax;
    return this;
  }

  /**
   * Deferred tax
   * @return deferredTax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFERRED_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDeferredTax() {
    return deferredTax;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFERRED_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredTax(@javax.annotation.Nullable Double deferredTax) {
    this.deferredTax = deferredTax;
  }


  public CashFlowDataCashFlowFromOperatingActivities deferredIncomeTax(@javax.annotation.Nullable Double deferredIncomeTax) {
    this.deferredIncomeTax = deferredIncomeTax;
    return this;
  }

  /**
   * Deferred income tax
   * @return deferredIncomeTax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFERRED_INCOME_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDeferredIncomeTax() {
    return deferredIncomeTax;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFERRED_INCOME_TAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredIncomeTax(@javax.annotation.Nullable Double deferredIncomeTax) {
    this.deferredIncomeTax = deferredIncomeTax;
  }


  public CashFlowDataCashFlowFromOperatingActivities depreciationAmortizationDepletion(@javax.annotation.Nullable Double depreciationAmortizationDepletion) {
    this.depreciationAmortizationDepletion = depreciationAmortizationDepletion;
    return this;
  }

  /**
   * Depreciation amortization depletion
   * @return depreciationAmortizationDepletion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciationAmortizationDepletion() {
    return depreciationAmortizationDepletion;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAmortizationDepletion(@javax.annotation.Nullable Double depreciationAmortizationDepletion) {
    this.depreciationAmortizationDepletion = depreciationAmortizationDepletion;
  }


  public CashFlowDataCashFlowFromOperatingActivities depletion(@javax.annotation.Nullable Double depletion) {
    this.depletion = depletion;
    return this;
  }

  /**
   * Depletion
   * @return depletion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepletion() {
    return depletion;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepletion(@javax.annotation.Nullable Double depletion) {
    this.depletion = depletion;
  }


  public CashFlowDataCashFlowFromOperatingActivities depreciationAndAmortization(@javax.annotation.Nullable Double depreciationAndAmortization) {
    this.depreciationAndAmortization = depreciationAndAmortization;
    return this;
  }

  /**
   * Depreciation and amortization
   * @return depreciationAndAmortization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciationAndAmortization() {
    return depreciationAndAmortization;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAndAmortization(@javax.annotation.Nullable Double depreciationAndAmortization) {
    this.depreciationAndAmortization = depreciationAndAmortization;
  }


  public CashFlowDataCashFlowFromOperatingActivities amortizationCashFlow(@javax.annotation.Nullable Double amortizationCashFlow) {
    this.amortizationCashFlow = amortizationCashFlow;
    return this;
  }

  /**
   * Amortization cash flow
   * @return amortizationCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmortizationCashFlow() {
    return amortizationCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmortizationCashFlow(@javax.annotation.Nullable Double amortizationCashFlow) {
    this.amortizationCashFlow = amortizationCashFlow;
  }


  public CashFlowDataCashFlowFromOperatingActivities amortizationOfIntangibles(@javax.annotation.Nullable Double amortizationOfIntangibles) {
    this.amortizationOfIntangibles = amortizationOfIntangibles;
    return this;
  }

  /**
   * Amortization of intangibles
   * @return amortizationOfIntangibles
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmortizationOfIntangibles() {
    return amortizationOfIntangibles;
  }


  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmortizationOfIntangibles(@javax.annotation.Nullable Double amortizationOfIntangibles) {
    this.amortizationOfIntangibles = amortizationOfIntangibles;
  }


  public CashFlowDataCashFlowFromOperatingActivities depreciation(@javax.annotation.Nullable Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Depreciation
   * @return depreciation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciation() {
    return depreciation;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciation(@javax.annotation.Nullable Double depreciation) {
    this.depreciation = depreciation;
  }


  public CashFlowDataCashFlowFromOperatingActivities operatingGainsLosses(@javax.annotation.Nullable Double operatingGainsLosses) {
    this.operatingGainsLosses = operatingGainsLosses;
    return this;
  }

  /**
   * Operating gains losses
   * @return operatingGainsLosses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingGainsLosses() {
    return operatingGainsLosses;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingGainsLosses(@javax.annotation.Nullable Double operatingGainsLosses) {
    this.operatingGainsLosses = operatingGainsLosses;
  }


  public CashFlowDataCashFlowFromOperatingActivities pensionAndEmployeeBenefitExpense(@javax.annotation.Nullable Double pensionAndEmployeeBenefitExpense) {
    this.pensionAndEmployeeBenefitExpense = pensionAndEmployeeBenefitExpense;
    return this;
  }

  /**
   * Pension and employee benefit expense
   * @return pensionAndEmployeeBenefitExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PENSION_AND_EMPLOYEE_BENEFIT_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPensionAndEmployeeBenefitExpense() {
    return pensionAndEmployeeBenefitExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_PENSION_AND_EMPLOYEE_BENEFIT_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPensionAndEmployeeBenefitExpense(@javax.annotation.Nullable Double pensionAndEmployeeBenefitExpense) {
    this.pensionAndEmployeeBenefitExpense = pensionAndEmployeeBenefitExpense;
  }


  public CashFlowDataCashFlowFromOperatingActivities earningsLossesFromEquityInvestments(@javax.annotation.Nullable Double earningsLossesFromEquityInvestments) {
    this.earningsLossesFromEquityInvestments = earningsLossesFromEquityInvestments;
    return this;
  }

  /**
   * Earnings losses from equity investments
   * @return earningsLossesFromEquityInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EARNINGS_LOSSES_FROM_EQUITY_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEarningsLossesFromEquityInvestments() {
    return earningsLossesFromEquityInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_EARNINGS_LOSSES_FROM_EQUITY_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarningsLossesFromEquityInvestments(@javax.annotation.Nullable Double earningsLossesFromEquityInvestments) {
    this.earningsLossesFromEquityInvestments = earningsLossesFromEquityInvestments;
  }


  public CashFlowDataCashFlowFromOperatingActivities gainLossOnInvestmentSecurities(@javax.annotation.Nullable Double gainLossOnInvestmentSecurities) {
    this.gainLossOnInvestmentSecurities = gainLossOnInvestmentSecurities;
    return this;
  }

  /**
   * Gain loss on investment securities
   * @return gainLossOnInvestmentSecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_INVESTMENT_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainLossOnInvestmentSecurities() {
    return gainLossOnInvestmentSecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_INVESTMENT_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainLossOnInvestmentSecurities(@javax.annotation.Nullable Double gainLossOnInvestmentSecurities) {
    this.gainLossOnInvestmentSecurities = gainLossOnInvestmentSecurities;
  }


  public CashFlowDataCashFlowFromOperatingActivities netForeignCurrencyExchangeGainLoss(@javax.annotation.Nullable Double netForeignCurrencyExchangeGainLoss) {
    this.netForeignCurrencyExchangeGainLoss = netForeignCurrencyExchangeGainLoss;
    return this;
  }

  /**
   * Net foreign currency exchange gain loss
   * @return netForeignCurrencyExchangeGainLoss
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_FOREIGN_CURRENCY_EXCHANGE_GAIN_LOSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetForeignCurrencyExchangeGainLoss() {
    return netForeignCurrencyExchangeGainLoss;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_FOREIGN_CURRENCY_EXCHANGE_GAIN_LOSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetForeignCurrencyExchangeGainLoss(@javax.annotation.Nullable Double netForeignCurrencyExchangeGainLoss) {
    this.netForeignCurrencyExchangeGainLoss = netForeignCurrencyExchangeGainLoss;
  }


  public CashFlowDataCashFlowFromOperatingActivities gainLossOnSaleOfPpe(@javax.annotation.Nullable Double gainLossOnSaleOfPpe) {
    this.gainLossOnSaleOfPpe = gainLossOnSaleOfPpe;
    return this;
  }

  /**
   * Gain loss on sale of ppe
   * @return gainLossOnSaleOfPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainLossOnSaleOfPpe() {
    return gainLossOnSaleOfPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainLossOnSaleOfPpe(@javax.annotation.Nullable Double gainLossOnSaleOfPpe) {
    this.gainLossOnSaleOfPpe = gainLossOnSaleOfPpe;
  }


  public CashFlowDataCashFlowFromOperatingActivities gainLossOnSaleOfBusiness(@javax.annotation.Nullable Double gainLossOnSaleOfBusiness) {
    this.gainLossOnSaleOfBusiness = gainLossOnSaleOfBusiness;
    return this;
  }

  /**
   * Gain loss on sale of business
   * @return gainLossOnSaleOfBusiness
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainLossOnSaleOfBusiness() {
    return gainLossOnSaleOfBusiness;
  }


  @JsonProperty(value = JSON_PROPERTY_GAIN_LOSS_ON_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainLossOnSaleOfBusiness(@javax.annotation.Nullable Double gainLossOnSaleOfBusiness) {
    this.gainLossOnSaleOfBusiness = gainLossOnSaleOfBusiness;
  }


  /**
   * Return true if this CashFlowData_cash_flow_from_operating_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataCashFlowFromOperatingActivities cashFlowDataCashFlowFromOperatingActivities = (CashFlowDataCashFlowFromOperatingActivities) o;
    return Objects.equals(this.netIncomeFromContinuingOperations, cashFlowDataCashFlowFromOperatingActivities.netIncomeFromContinuingOperations) &&
        Objects.equals(this.operatingCashFlow, cashFlowDataCashFlowFromOperatingActivities.operatingCashFlow) &&
        Objects.equals(this.cashFlowFromContinuingOperatingActivities, cashFlowDataCashFlowFromOperatingActivities.cashFlowFromContinuingOperatingActivities) &&
        Objects.equals(this.cashFromDiscontinuedOperatingActivities, cashFlowDataCashFlowFromOperatingActivities.cashFromDiscontinuedOperatingActivities) &&
        Objects.equals(this.cashFlowFromDiscontinuedOperation, cashFlowDataCashFlowFromOperatingActivities.cashFlowFromDiscontinuedOperation) &&
        Objects.equals(this.freeCashFlow, cashFlowDataCashFlowFromOperatingActivities.freeCashFlow) &&
        Objects.equals(this.cashFlowsFromUsedInOperatingActivitiesDirect, cashFlowDataCashFlowFromOperatingActivities.cashFlowsFromUsedInOperatingActivitiesDirect) &&
        Objects.equals(this.taxesRefundPaid, cashFlowDataCashFlowFromOperatingActivities.taxesRefundPaid) &&
        Objects.equals(this.taxesRefundPaidDirect, cashFlowDataCashFlowFromOperatingActivities.taxesRefundPaidDirect) &&
        Objects.equals(this.interestReceived, cashFlowDataCashFlowFromOperatingActivities.interestReceived) &&
        Objects.equals(this.interestReceivedDirect, cashFlowDataCashFlowFromOperatingActivities.interestReceivedDirect) &&
        Objects.equals(this.interestPaid, cashFlowDataCashFlowFromOperatingActivities.interestPaid) &&
        Objects.equals(this.interestPaidDirect, cashFlowDataCashFlowFromOperatingActivities.interestPaidDirect) &&
        Objects.equals(this.dividendReceived, cashFlowDataCashFlowFromOperatingActivities.dividendReceived) &&
        Objects.equals(this.dividendReceivedDirect, cashFlowDataCashFlowFromOperatingActivities.dividendReceivedDirect) &&
        Objects.equals(this.dividendPaid, cashFlowDataCashFlowFromOperatingActivities.dividendPaid) &&
        Objects.equals(this.dividendPaidDirect, cashFlowDataCashFlowFromOperatingActivities.dividendPaidDirect) &&
        Objects.equals(this.changeInWorkingCapital, cashFlowDataCashFlowFromOperatingActivities.changeInWorkingCapital) &&
        Objects.equals(this.changeInOtherWorkingCapital, cashFlowDataCashFlowFromOperatingActivities.changeInOtherWorkingCapital) &&
        Objects.equals(this.changeInReceivables, cashFlowDataCashFlowFromOperatingActivities.changeInReceivables) &&
        Objects.equals(this.changesInAccountReceivables, cashFlowDataCashFlowFromOperatingActivities.changesInAccountReceivables) &&
        Objects.equals(this.changeInPayablesAndAccruedExpense, cashFlowDataCashFlowFromOperatingActivities.changeInPayablesAndAccruedExpense) &&
        Objects.equals(this.changeInAccruedExpense, cashFlowDataCashFlowFromOperatingActivities.changeInAccruedExpense) &&
        Objects.equals(this.changeInPayable, cashFlowDataCashFlowFromOperatingActivities.changeInPayable) &&
        Objects.equals(this.changeInDividendPayable, cashFlowDataCashFlowFromOperatingActivities.changeInDividendPayable) &&
        Objects.equals(this.changeInAccountPayable, cashFlowDataCashFlowFromOperatingActivities.changeInAccountPayable) &&
        Objects.equals(this.changeInTaxPayable, cashFlowDataCashFlowFromOperatingActivities.changeInTaxPayable) &&
        Objects.equals(this.changeInIncomeTaxPayable, cashFlowDataCashFlowFromOperatingActivities.changeInIncomeTaxPayable) &&
        Objects.equals(this.changeInInterestPayable, cashFlowDataCashFlowFromOperatingActivities.changeInInterestPayable) &&
        Objects.equals(this.changeInOtherCurrentLiabilities, cashFlowDataCashFlowFromOperatingActivities.changeInOtherCurrentLiabilities) &&
        Objects.equals(this.changeInOtherCurrentAssets, cashFlowDataCashFlowFromOperatingActivities.changeInOtherCurrentAssets) &&
        Objects.equals(this.changeInInventory, cashFlowDataCashFlowFromOperatingActivities.changeInInventory) &&
        Objects.equals(this.changeInPrepaidAssets, cashFlowDataCashFlowFromOperatingActivities.changeInPrepaidAssets) &&
        Objects.equals(this.otherNonCashItems, cashFlowDataCashFlowFromOperatingActivities.otherNonCashItems) &&
        Objects.equals(this.excessTaxBenefitFromStockBasedCompensation, cashFlowDataCashFlowFromOperatingActivities.excessTaxBenefitFromStockBasedCompensation) &&
        Objects.equals(this.stockBasedCompensation, cashFlowDataCashFlowFromOperatingActivities.stockBasedCompensation) &&
        Objects.equals(this.unrealizedGainLossOnInvestmentSecurities, cashFlowDataCashFlowFromOperatingActivities.unrealizedGainLossOnInvestmentSecurities) &&
        Objects.equals(this.provisionAndWriteOffOfAssets, cashFlowDataCashFlowFromOperatingActivities.provisionAndWriteOffOfAssets) &&
        Objects.equals(this.assetImpairmentCharge, cashFlowDataCashFlowFromOperatingActivities.assetImpairmentCharge) &&
        Objects.equals(this.amortizationOfSecurities, cashFlowDataCashFlowFromOperatingActivities.amortizationOfSecurities) &&
        Objects.equals(this.deferredTax, cashFlowDataCashFlowFromOperatingActivities.deferredTax) &&
        Objects.equals(this.deferredIncomeTax, cashFlowDataCashFlowFromOperatingActivities.deferredIncomeTax) &&
        Objects.equals(this.depreciationAmortizationDepletion, cashFlowDataCashFlowFromOperatingActivities.depreciationAmortizationDepletion) &&
        Objects.equals(this.depletion, cashFlowDataCashFlowFromOperatingActivities.depletion) &&
        Objects.equals(this.depreciationAndAmortization, cashFlowDataCashFlowFromOperatingActivities.depreciationAndAmortization) &&
        Objects.equals(this.amortizationCashFlow, cashFlowDataCashFlowFromOperatingActivities.amortizationCashFlow) &&
        Objects.equals(this.amortizationOfIntangibles, cashFlowDataCashFlowFromOperatingActivities.amortizationOfIntangibles) &&
        Objects.equals(this.depreciation, cashFlowDataCashFlowFromOperatingActivities.depreciation) &&
        Objects.equals(this.operatingGainsLosses, cashFlowDataCashFlowFromOperatingActivities.operatingGainsLosses) &&
        Objects.equals(this.pensionAndEmployeeBenefitExpense, cashFlowDataCashFlowFromOperatingActivities.pensionAndEmployeeBenefitExpense) &&
        Objects.equals(this.earningsLossesFromEquityInvestments, cashFlowDataCashFlowFromOperatingActivities.earningsLossesFromEquityInvestments) &&
        Objects.equals(this.gainLossOnInvestmentSecurities, cashFlowDataCashFlowFromOperatingActivities.gainLossOnInvestmentSecurities) &&
        Objects.equals(this.netForeignCurrencyExchangeGainLoss, cashFlowDataCashFlowFromOperatingActivities.netForeignCurrencyExchangeGainLoss) &&
        Objects.equals(this.gainLossOnSaleOfPpe, cashFlowDataCashFlowFromOperatingActivities.gainLossOnSaleOfPpe) &&
        Objects.equals(this.gainLossOnSaleOfBusiness, cashFlowDataCashFlowFromOperatingActivities.gainLossOnSaleOfBusiness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netIncomeFromContinuingOperations, operatingCashFlow, cashFlowFromContinuingOperatingActivities, cashFromDiscontinuedOperatingActivities, cashFlowFromDiscontinuedOperation, freeCashFlow, cashFlowsFromUsedInOperatingActivitiesDirect, taxesRefundPaid, taxesRefundPaidDirect, interestReceived, interestReceivedDirect, interestPaid, interestPaidDirect, dividendReceived, dividendReceivedDirect, dividendPaid, dividendPaidDirect, changeInWorkingCapital, changeInOtherWorkingCapital, changeInReceivables, changesInAccountReceivables, changeInPayablesAndAccruedExpense, changeInAccruedExpense, changeInPayable, changeInDividendPayable, changeInAccountPayable, changeInTaxPayable, changeInIncomeTaxPayable, changeInInterestPayable, changeInOtherCurrentLiabilities, changeInOtherCurrentAssets, changeInInventory, changeInPrepaidAssets, otherNonCashItems, excessTaxBenefitFromStockBasedCompensation, stockBasedCompensation, unrealizedGainLossOnInvestmentSecurities, provisionAndWriteOffOfAssets, assetImpairmentCharge, amortizationOfSecurities, deferredTax, deferredIncomeTax, depreciationAmortizationDepletion, depletion, depreciationAndAmortization, amortizationCashFlow, amortizationOfIntangibles, depreciation, operatingGainsLosses, pensionAndEmployeeBenefitExpense, earningsLossesFromEquityInvestments, gainLossOnInvestmentSecurities, netForeignCurrencyExchangeGainLoss, gainLossOnSaleOfPpe, gainLossOnSaleOfBusiness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataCashFlowFromOperatingActivities {\n");
    sb.append("    netIncomeFromContinuingOperations: ").append(toIndentedString(netIncomeFromContinuingOperations)).append("\n");
    sb.append("    operatingCashFlow: ").append(toIndentedString(operatingCashFlow)).append("\n");
    sb.append("    cashFlowFromContinuingOperatingActivities: ").append(toIndentedString(cashFlowFromContinuingOperatingActivities)).append("\n");
    sb.append("    cashFromDiscontinuedOperatingActivities: ").append(toIndentedString(cashFromDiscontinuedOperatingActivities)).append("\n");
    sb.append("    cashFlowFromDiscontinuedOperation: ").append(toIndentedString(cashFlowFromDiscontinuedOperation)).append("\n");
    sb.append("    freeCashFlow: ").append(toIndentedString(freeCashFlow)).append("\n");
    sb.append("    cashFlowsFromUsedInOperatingActivitiesDirect: ").append(toIndentedString(cashFlowsFromUsedInOperatingActivitiesDirect)).append("\n");
    sb.append("    taxesRefundPaid: ").append(toIndentedString(taxesRefundPaid)).append("\n");
    sb.append("    taxesRefundPaidDirect: ").append(toIndentedString(taxesRefundPaidDirect)).append("\n");
    sb.append("    interestReceived: ").append(toIndentedString(interestReceived)).append("\n");
    sb.append("    interestReceivedDirect: ").append(toIndentedString(interestReceivedDirect)).append("\n");
    sb.append("    interestPaid: ").append(toIndentedString(interestPaid)).append("\n");
    sb.append("    interestPaidDirect: ").append(toIndentedString(interestPaidDirect)).append("\n");
    sb.append("    dividendReceived: ").append(toIndentedString(dividendReceived)).append("\n");
    sb.append("    dividendReceivedDirect: ").append(toIndentedString(dividendReceivedDirect)).append("\n");
    sb.append("    dividendPaid: ").append(toIndentedString(dividendPaid)).append("\n");
    sb.append("    dividendPaidDirect: ").append(toIndentedString(dividendPaidDirect)).append("\n");
    sb.append("    changeInWorkingCapital: ").append(toIndentedString(changeInWorkingCapital)).append("\n");
    sb.append("    changeInOtherWorkingCapital: ").append(toIndentedString(changeInOtherWorkingCapital)).append("\n");
    sb.append("    changeInReceivables: ").append(toIndentedString(changeInReceivables)).append("\n");
    sb.append("    changesInAccountReceivables: ").append(toIndentedString(changesInAccountReceivables)).append("\n");
    sb.append("    changeInPayablesAndAccruedExpense: ").append(toIndentedString(changeInPayablesAndAccruedExpense)).append("\n");
    sb.append("    changeInAccruedExpense: ").append(toIndentedString(changeInAccruedExpense)).append("\n");
    sb.append("    changeInPayable: ").append(toIndentedString(changeInPayable)).append("\n");
    sb.append("    changeInDividendPayable: ").append(toIndentedString(changeInDividendPayable)).append("\n");
    sb.append("    changeInAccountPayable: ").append(toIndentedString(changeInAccountPayable)).append("\n");
    sb.append("    changeInTaxPayable: ").append(toIndentedString(changeInTaxPayable)).append("\n");
    sb.append("    changeInIncomeTaxPayable: ").append(toIndentedString(changeInIncomeTaxPayable)).append("\n");
    sb.append("    changeInInterestPayable: ").append(toIndentedString(changeInInterestPayable)).append("\n");
    sb.append("    changeInOtherCurrentLiabilities: ").append(toIndentedString(changeInOtherCurrentLiabilities)).append("\n");
    sb.append("    changeInOtherCurrentAssets: ").append(toIndentedString(changeInOtherCurrentAssets)).append("\n");
    sb.append("    changeInInventory: ").append(toIndentedString(changeInInventory)).append("\n");
    sb.append("    changeInPrepaidAssets: ").append(toIndentedString(changeInPrepaidAssets)).append("\n");
    sb.append("    otherNonCashItems: ").append(toIndentedString(otherNonCashItems)).append("\n");
    sb.append("    excessTaxBenefitFromStockBasedCompensation: ").append(toIndentedString(excessTaxBenefitFromStockBasedCompensation)).append("\n");
    sb.append("    stockBasedCompensation: ").append(toIndentedString(stockBasedCompensation)).append("\n");
    sb.append("    unrealizedGainLossOnInvestmentSecurities: ").append(toIndentedString(unrealizedGainLossOnInvestmentSecurities)).append("\n");
    sb.append("    provisionAndWriteOffOfAssets: ").append(toIndentedString(provisionAndWriteOffOfAssets)).append("\n");
    sb.append("    assetImpairmentCharge: ").append(toIndentedString(assetImpairmentCharge)).append("\n");
    sb.append("    amortizationOfSecurities: ").append(toIndentedString(amortizationOfSecurities)).append("\n");
    sb.append("    deferredTax: ").append(toIndentedString(deferredTax)).append("\n");
    sb.append("    deferredIncomeTax: ").append(toIndentedString(deferredIncomeTax)).append("\n");
    sb.append("    depreciationAmortizationDepletion: ").append(toIndentedString(depreciationAmortizationDepletion)).append("\n");
    sb.append("    depletion: ").append(toIndentedString(depletion)).append("\n");
    sb.append("    depreciationAndAmortization: ").append(toIndentedString(depreciationAndAmortization)).append("\n");
    sb.append("    amortizationCashFlow: ").append(toIndentedString(amortizationCashFlow)).append("\n");
    sb.append("    amortizationOfIntangibles: ").append(toIndentedString(amortizationOfIntangibles)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    operatingGainsLosses: ").append(toIndentedString(operatingGainsLosses)).append("\n");
    sb.append("    pensionAndEmployeeBenefitExpense: ").append(toIndentedString(pensionAndEmployeeBenefitExpense)).append("\n");
    sb.append("    earningsLossesFromEquityInvestments: ").append(toIndentedString(earningsLossesFromEquityInvestments)).append("\n");
    sb.append("    gainLossOnInvestmentSecurities: ").append(toIndentedString(gainLossOnInvestmentSecurities)).append("\n");
    sb.append("    netForeignCurrencyExchangeGainLoss: ").append(toIndentedString(netForeignCurrencyExchangeGainLoss)).append("\n");
    sb.append("    gainLossOnSaleOfPpe: ").append(toIndentedString(gainLossOnSaleOfPpe)).append("\n");
    sb.append("    gainLossOnSaleOfBusiness: ").append(toIndentedString(gainLossOnSaleOfBusiness)).append("\n");
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

    // add `net_income_from_continuing_operations` to the URL query string
    if (getNetIncomeFromContinuingOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_from_continuing_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeFromContinuingOperations()))));
    }

    // add `operating_cash_flow` to the URL query string
    if (getOperatingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingCashFlow()))));
    }

    // add `cash_flow_from_continuing_operating_activities` to the URL query string
    if (getCashFlowFromContinuingOperatingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_flow_from_continuing_operating_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFlowFromContinuingOperatingActivities()))));
    }

    // add `cash_from_discontinued_operating_activities` to the URL query string
    if (getCashFromDiscontinuedOperatingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_from_discontinued_operating_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFromDiscontinuedOperatingActivities()))));
    }

    // add `cash_flow_from_discontinued_operation` to the URL query string
    if (getCashFlowFromDiscontinuedOperation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_flow_from_discontinued_operation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFlowFromDiscontinuedOperation()))));
    }

    // add `free_cash_flow` to the URL query string
    if (getFreeCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfree_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFreeCashFlow()))));
    }

    // add `cash_flows_from_used_in_operating_activities_direct` to the URL query string
    if (getCashFlowsFromUsedInOperatingActivitiesDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_flows_from_used_in_operating_activities_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFlowsFromUsedInOperatingActivitiesDirect()))));
    }

    // add `taxes_refund_paid` to the URL query string
    if (getTaxesRefundPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%staxes_refund_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxesRefundPaid()))));
    }

    // add `taxes_refund_paid_direct` to the URL query string
    if (getTaxesRefundPaidDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%staxes_refund_paid_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxesRefundPaidDirect()))));
    }

    // add `interest_received` to the URL query string
    if (getInterestReceived() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_received%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestReceived()))));
    }

    // add `interest_received_direct` to the URL query string
    if (getInterestReceivedDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_received_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestReceivedDirect()))));
    }

    // add `interest_paid` to the URL query string
    if (getInterestPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPaid()))));
    }

    // add `interest_paid_direct` to the URL query string
    if (getInterestPaidDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_paid_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPaidDirect()))));
    }

    // add `dividend_received` to the URL query string
    if (getDividendReceived() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_received%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendReceived()))));
    }

    // add `dividend_received_direct` to the URL query string
    if (getDividendReceivedDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_received_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendReceivedDirect()))));
    }

    // add `dividend_paid` to the URL query string
    if (getDividendPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendPaid()))));
    }

    // add `dividend_paid_direct` to the URL query string
    if (getDividendPaidDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_paid_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendPaidDirect()))));
    }

    // add `change_in_working_capital` to the URL query string
    if (getChangeInWorkingCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_working_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInWorkingCapital()))));
    }

    // add `change_in_other_working_capital` to the URL query string
    if (getChangeInOtherWorkingCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_other_working_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInOtherWorkingCapital()))));
    }

    // add `change_in_receivables` to the URL query string
    if (getChangeInReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInReceivables()))));
    }

    // add `changes_in_account_receivables` to the URL query string
    if (getChangesInAccountReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schanges_in_account_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangesInAccountReceivables()))));
    }

    // add `change_in_payables_and_accrued_expense` to the URL query string
    if (getChangeInPayablesAndAccruedExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_payables_and_accrued_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInPayablesAndAccruedExpense()))));
    }

    // add `change_in_accrued_expense` to the URL query string
    if (getChangeInAccruedExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_accrued_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInAccruedExpense()))));
    }

    // add `change_in_payable` to the URL query string
    if (getChangeInPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInPayable()))));
    }

    // add `change_in_dividend_payable` to the URL query string
    if (getChangeInDividendPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_dividend_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInDividendPayable()))));
    }

    // add `change_in_account_payable` to the URL query string
    if (getChangeInAccountPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_account_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInAccountPayable()))));
    }

    // add `change_in_tax_payable` to the URL query string
    if (getChangeInTaxPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_tax_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInTaxPayable()))));
    }

    // add `change_in_income_tax_payable` to the URL query string
    if (getChangeInIncomeTaxPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_income_tax_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInIncomeTaxPayable()))));
    }

    // add `change_in_interest_payable` to the URL query string
    if (getChangeInInterestPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_interest_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInInterestPayable()))));
    }

    // add `change_in_other_current_liabilities` to the URL query string
    if (getChangeInOtherCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_other_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInOtherCurrentLiabilities()))));
    }

    // add `change_in_other_current_assets` to the URL query string
    if (getChangeInOtherCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_other_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInOtherCurrentAssets()))));
    }

    // add `change_in_inventory` to the URL query string
    if (getChangeInInventory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_inventory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInInventory()))));
    }

    // add `change_in_prepaid_assets` to the URL query string
    if (getChangeInPrepaidAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange_in_prepaid_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangeInPrepaidAssets()))));
    }

    // add `other_non_cash_items` to the URL query string
    if (getOtherNonCashItems() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_cash_items%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCashItems()))));
    }

    // add `excess_tax_benefit_from_stock_based_compensation` to the URL query string
    if (getExcessTaxBenefitFromStockBasedCompensation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexcess_tax_benefit_from_stock_based_compensation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExcessTaxBenefitFromStockBasedCompensation()))));
    }

    // add `stock_based_compensation` to the URL query string
    if (getStockBasedCompensation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstock_based_compensation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStockBasedCompensation()))));
    }

    // add `unrealized_gain_loss_on_investment_securities` to the URL query string
    if (getUnrealizedGainLossOnInvestmentSecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunrealized_gain_loss_on_investment_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnrealizedGainLossOnInvestmentSecurities()))));
    }

    // add `provision_and_write_off_of_assets` to the URL query string
    if (getProvisionAndWriteOffOfAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovision_and_write_off_of_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionAndWriteOffOfAssets()))));
    }

    // add `asset_impairment_charge` to the URL query string
    if (getAssetImpairmentCharge() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sasset_impairment_charge%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssetImpairmentCharge()))));
    }

    // add `amortization_of_securities` to the URL query string
    if (getAmortizationOfSecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samortization_of_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmortizationOfSecurities()))));
    }

    // add `deferred_tax` to the URL query string
    if (getDeferredTax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeferred_tax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeferredTax()))));
    }

    // add `deferred_income_tax` to the URL query string
    if (getDeferredIncomeTax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeferred_income_tax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeferredIncomeTax()))));
    }

    // add `depreciation_amortization_depletion` to the URL query string
    if (getDepreciationAmortizationDepletion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation_amortization_depletion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciationAmortizationDepletion()))));
    }

    // add `depletion` to the URL query string
    if (getDepletion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepletion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepletion()))));
    }

    // add `depreciation_and_amortization` to the URL query string
    if (getDepreciationAndAmortization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation_and_amortization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciationAndAmortization()))));
    }

    // add `amortization_cash_flow` to the URL query string
    if (getAmortizationCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samortization_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmortizationCashFlow()))));
    }

    // add `amortization_of_intangibles` to the URL query string
    if (getAmortizationOfIntangibles() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samortization_of_intangibles%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmortizationOfIntangibles()))));
    }

    // add `depreciation` to the URL query string
    if (getDepreciation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciation()))));
    }

    // add `operating_gains_losses` to the URL query string
    if (getOperatingGainsLosses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_gains_losses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingGainsLosses()))));
    }

    // add `pension_and_employee_benefit_expense` to the URL query string
    if (getPensionAndEmployeeBenefitExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spension_and_employee_benefit_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPensionAndEmployeeBenefitExpense()))));
    }

    // add `earnings_losses_from_equity_investments` to the URL query string
    if (getEarningsLossesFromEquityInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%searnings_losses_from_equity_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEarningsLossesFromEquityInvestments()))));
    }

    // add `gain_loss_on_investment_securities` to the URL query string
    if (getGainLossOnInvestmentSecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_loss_on_investment_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainLossOnInvestmentSecurities()))));
    }

    // add `net_foreign_currency_exchange_gain_loss` to the URL query string
    if (getNetForeignCurrencyExchangeGainLoss() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_foreign_currency_exchange_gain_loss%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetForeignCurrencyExchangeGainLoss()))));
    }

    // add `gain_loss_on_sale_of_ppe` to the URL query string
    if (getGainLossOnSaleOfPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_loss_on_sale_of_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainLossOnSaleOfPpe()))));
    }

    // add `gain_loss_on_sale_of_business` to the URL query string
    if (getGainLossOnSaleOfBusiness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgain_loss_on_sale_of_business%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainLossOnSaleOfBusiness()))));
    }

    return joiner.toString();
  }
}

