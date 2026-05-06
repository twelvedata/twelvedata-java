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
 * Cash flow from investing activities
 */
@JsonPropertyOrder({
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_INVESTING_CASH_FLOW,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_INVESTING_ACTIVITIES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_CASH_FROM_DISCONTINUED_INVESTING_ACTIVITIES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_OTHER_INVESTING_CHANGES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_INTEREST_RECEIVED_CFI,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_DIVIDENDS_RECEIVED_CFI,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_INVESTMENT_PURCHASE_AND_SALE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_SALE_OF_INVESTMENT,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_PURCHASE_OF_INVESTMENT,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_INVESTMENT_PROPERTIES_PURCHASE_AND_SALE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_SALE_OF_INVESTMENT_PROPERTIES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_PURCHASE_OF_INVESTMENT_PROPERTIES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_BUSINESS_PURCHASE_AND_SALE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_SALE_OF_BUSINESS,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_PURCHASE_OF_BUSINESS,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_INTANGIBLES_PURCHASE_AND_SALE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_SALE_OF_INTANGIBLES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_PURCHASE_OF_INTANGIBLES,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_NET_PPE_PURCHASE_AND_SALE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_SALE_OF_PPE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_PURCHASE_OF_PPE,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_CAPITAL_EXPENDITURE_REPORTED,
  CashFlowDataCashFlowFromInvestingActivities.JSON_PROPERTY_CAPITAL_EXPENDITURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataCashFlowFromInvestingActivities {
  public static final String JSON_PROPERTY_INVESTING_CASH_FLOW = "investing_cash_flow";
  @javax.annotation.Nullable
  private Double investingCashFlow;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_INVESTING_ACTIVITIES = "cash_flow_from_continuing_investing_activities";
  @javax.annotation.Nullable
  private Double cashFlowFromContinuingInvestingActivities;

  public static final String JSON_PROPERTY_CASH_FROM_DISCONTINUED_INVESTING_ACTIVITIES = "cash_from_discontinued_investing_activities";
  @javax.annotation.Nullable
  private Double cashFromDiscontinuedInvestingActivities;

  public static final String JSON_PROPERTY_NET_OTHER_INVESTING_CHANGES = "net_other_investing_changes";
  @javax.annotation.Nullable
  private Double netOtherInvestingChanges;

  public static final String JSON_PROPERTY_INTEREST_RECEIVED_CFI = "interest_received_cfi";
  @javax.annotation.Nullable
  private Double interestReceivedCfi;

  public static final String JSON_PROPERTY_DIVIDENDS_RECEIVED_CFI = "dividends_received_cfi";
  @javax.annotation.Nullable
  private Double dividendsReceivedCfi;

  public static final String JSON_PROPERTY_NET_INVESTMENT_PURCHASE_AND_SALE = "net_investment_purchase_and_sale";
  @javax.annotation.Nullable
  private Double netInvestmentPurchaseAndSale;

  public static final String JSON_PROPERTY_SALE_OF_INVESTMENT = "sale_of_investment";
  @javax.annotation.Nullable
  private Double saleOfInvestment;

  public static final String JSON_PROPERTY_PURCHASE_OF_INVESTMENT = "purchase_of_investment";
  @javax.annotation.Nullable
  private Double purchaseOfInvestment;

  public static final String JSON_PROPERTY_NET_INVESTMENT_PROPERTIES_PURCHASE_AND_SALE = "net_investment_properties_purchase_and_sale";
  @javax.annotation.Nullable
  private Double netInvestmentPropertiesPurchaseAndSale;

  public static final String JSON_PROPERTY_SALE_OF_INVESTMENT_PROPERTIES = "sale_of_investment_properties";
  @javax.annotation.Nullable
  private Double saleOfInvestmentProperties;

  public static final String JSON_PROPERTY_PURCHASE_OF_INVESTMENT_PROPERTIES = "purchase_of_investment_properties";
  @javax.annotation.Nullable
  private Double purchaseOfInvestmentProperties;

  public static final String JSON_PROPERTY_NET_BUSINESS_PURCHASE_AND_SALE = "net_business_purchase_and_sale";
  @javax.annotation.Nullable
  private Double netBusinessPurchaseAndSale;

  public static final String JSON_PROPERTY_SALE_OF_BUSINESS = "sale_of_business";
  @javax.annotation.Nullable
  private Double saleOfBusiness;

  public static final String JSON_PROPERTY_PURCHASE_OF_BUSINESS = "purchase_of_business";
  @javax.annotation.Nullable
  private Double purchaseOfBusiness;

  public static final String JSON_PROPERTY_NET_INTANGIBLES_PURCHASE_AND_SALE = "net_intangibles_purchase_and_sale";
  @javax.annotation.Nullable
  private Double netIntangiblesPurchaseAndSale;

  public static final String JSON_PROPERTY_SALE_OF_INTANGIBLES = "sale_of_intangibles";
  @javax.annotation.Nullable
  private Double saleOfIntangibles;

  public static final String JSON_PROPERTY_PURCHASE_OF_INTANGIBLES = "purchase_of_intangibles";
  @javax.annotation.Nullable
  private Double purchaseOfIntangibles;

  public static final String JSON_PROPERTY_NET_PPE_PURCHASE_AND_SALE = "net_ppe_purchase_and_sale";
  @javax.annotation.Nullable
  private Double netPpePurchaseAndSale;

  public static final String JSON_PROPERTY_SALE_OF_PPE = "sale_of_ppe";
  @javax.annotation.Nullable
  private Double saleOfPpe;

  public static final String JSON_PROPERTY_PURCHASE_OF_PPE = "purchase_of_ppe";
  @javax.annotation.Nullable
  private Double purchaseOfPpe;

  public static final String JSON_PROPERTY_CAPITAL_EXPENDITURE_REPORTED = "capital_expenditure_reported";
  @javax.annotation.Nullable
  private Double capitalExpenditureReported;

  public static final String JSON_PROPERTY_CAPITAL_EXPENDITURE = "capital_expenditure";
  @javax.annotation.Nullable
  private Double capitalExpenditure;

  public CashFlowDataCashFlowFromInvestingActivities() { 
  }

  public CashFlowDataCashFlowFromInvestingActivities investingCashFlow(@javax.annotation.Nullable Double investingCashFlow) {
    this.investingCashFlow = investingCashFlow;
    return this;
  }

  /**
   * Investing cash flow
   * @return investingCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestingCashFlow() {
    return investingCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTING_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestingCashFlow(@javax.annotation.Nullable Double investingCashFlow) {
    this.investingCashFlow = investingCashFlow;
  }


  public CashFlowDataCashFlowFromInvestingActivities cashFlowFromContinuingInvestingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingInvestingActivities) {
    this.cashFlowFromContinuingInvestingActivities = cashFlowFromContinuingInvestingActivities;
    return this;
  }

  /**
   * Cash flow from continuing investing activities
   * @return cashFlowFromContinuingInvestingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFlowFromContinuingInvestingActivities() {
    return cashFlowFromContinuingInvestingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_CONTINUING_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromContinuingInvestingActivities(@javax.annotation.Nullable Double cashFlowFromContinuingInvestingActivities) {
    this.cashFlowFromContinuingInvestingActivities = cashFlowFromContinuingInvestingActivities;
  }


  public CashFlowDataCashFlowFromInvestingActivities cashFromDiscontinuedInvestingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedInvestingActivities) {
    this.cashFromDiscontinuedInvestingActivities = cashFromDiscontinuedInvestingActivities;
    return this;
  }

  /**
   * Cash from discontinued investing activities
   * @return cashFromDiscontinuedInvestingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFromDiscontinuedInvestingActivities() {
    return cashFromDiscontinuedInvestingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FROM_DISCONTINUED_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFromDiscontinuedInvestingActivities(@javax.annotation.Nullable Double cashFromDiscontinuedInvestingActivities) {
    this.cashFromDiscontinuedInvestingActivities = cashFromDiscontinuedInvestingActivities;
  }


  public CashFlowDataCashFlowFromInvestingActivities netOtherInvestingChanges(@javax.annotation.Nullable Double netOtherInvestingChanges) {
    this.netOtherInvestingChanges = netOtherInvestingChanges;
    return this;
  }

  /**
   * Net other investing changes
   * @return netOtherInvestingChanges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_OTHER_INVESTING_CHANGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetOtherInvestingChanges() {
    return netOtherInvestingChanges;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_OTHER_INVESTING_CHANGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetOtherInvestingChanges(@javax.annotation.Nullable Double netOtherInvestingChanges) {
    this.netOtherInvestingChanges = netOtherInvestingChanges;
  }


  public CashFlowDataCashFlowFromInvestingActivities interestReceivedCfi(@javax.annotation.Nullable Double interestReceivedCfi) {
    this.interestReceivedCfi = interestReceivedCfi;
    return this;
  }

  /**
   * Interest received cfi
   * @return interestReceivedCfi
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED_CFI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestReceivedCfi() {
    return interestReceivedCfi;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_RECEIVED_CFI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestReceivedCfi(@javax.annotation.Nullable Double interestReceivedCfi) {
    this.interestReceivedCfi = interestReceivedCfi;
  }


  public CashFlowDataCashFlowFromInvestingActivities dividendsReceivedCfi(@javax.annotation.Nullable Double dividendsReceivedCfi) {
    this.dividendsReceivedCfi = dividendsReceivedCfi;
    return this;
  }

  /**
   * Dividends received cfi
   * @return dividendsReceivedCfi
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_RECEIVED_CFI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendsReceivedCfi() {
    return dividendsReceivedCfi;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_RECEIVED_CFI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendsReceivedCfi(@javax.annotation.Nullable Double dividendsReceivedCfi) {
    this.dividendsReceivedCfi = dividendsReceivedCfi;
  }


  public CashFlowDataCashFlowFromInvestingActivities netInvestmentPurchaseAndSale(@javax.annotation.Nullable Double netInvestmentPurchaseAndSale) {
    this.netInvestmentPurchaseAndSale = netInvestmentPurchaseAndSale;
    return this;
  }

  /**
   * Net investment purchase and sale
   * @return netInvestmentPurchaseAndSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INVESTMENT_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetInvestmentPurchaseAndSale() {
    return netInvestmentPurchaseAndSale;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INVESTMENT_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetInvestmentPurchaseAndSale(@javax.annotation.Nullable Double netInvestmentPurchaseAndSale) {
    this.netInvestmentPurchaseAndSale = netInvestmentPurchaseAndSale;
  }


  public CashFlowDataCashFlowFromInvestingActivities saleOfInvestment(@javax.annotation.Nullable Double saleOfInvestment) {
    this.saleOfInvestment = saleOfInvestment;
    return this;
  }

  /**
   * Sale of investment
   * @return saleOfInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfInvestment() {
    return saleOfInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfInvestment(@javax.annotation.Nullable Double saleOfInvestment) {
    this.saleOfInvestment = saleOfInvestment;
  }


  public CashFlowDataCashFlowFromInvestingActivities purchaseOfInvestment(@javax.annotation.Nullable Double purchaseOfInvestment) {
    this.purchaseOfInvestment = purchaseOfInvestment;
    return this;
  }

  /**
   * Purchase of investment
   * @return purchaseOfInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfInvestment() {
    return purchaseOfInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfInvestment(@javax.annotation.Nullable Double purchaseOfInvestment) {
    this.purchaseOfInvestment = purchaseOfInvestment;
  }


  public CashFlowDataCashFlowFromInvestingActivities netInvestmentPropertiesPurchaseAndSale(@javax.annotation.Nullable Double netInvestmentPropertiesPurchaseAndSale) {
    this.netInvestmentPropertiesPurchaseAndSale = netInvestmentPropertiesPurchaseAndSale;
    return this;
  }

  /**
   * Net investment properties purchase and sale
   * @return netInvestmentPropertiesPurchaseAndSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INVESTMENT_PROPERTIES_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetInvestmentPropertiesPurchaseAndSale() {
    return netInvestmentPropertiesPurchaseAndSale;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INVESTMENT_PROPERTIES_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetInvestmentPropertiesPurchaseAndSale(@javax.annotation.Nullable Double netInvestmentPropertiesPurchaseAndSale) {
    this.netInvestmentPropertiesPurchaseAndSale = netInvestmentPropertiesPurchaseAndSale;
  }


  public CashFlowDataCashFlowFromInvestingActivities saleOfInvestmentProperties(@javax.annotation.Nullable Double saleOfInvestmentProperties) {
    this.saleOfInvestmentProperties = saleOfInvestmentProperties;
    return this;
  }

  /**
   * Sale of investment properties
   * @return saleOfInvestmentProperties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfInvestmentProperties() {
    return saleOfInvestmentProperties;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfInvestmentProperties(@javax.annotation.Nullable Double saleOfInvestmentProperties) {
    this.saleOfInvestmentProperties = saleOfInvestmentProperties;
  }


  public CashFlowDataCashFlowFromInvestingActivities purchaseOfInvestmentProperties(@javax.annotation.Nullable Double purchaseOfInvestmentProperties) {
    this.purchaseOfInvestmentProperties = purchaseOfInvestmentProperties;
    return this;
  }

  /**
   * Purchase of investment properties
   * @return purchaseOfInvestmentProperties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfInvestmentProperties() {
    return purchaseOfInvestmentProperties;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfInvestmentProperties(@javax.annotation.Nullable Double purchaseOfInvestmentProperties) {
    this.purchaseOfInvestmentProperties = purchaseOfInvestmentProperties;
  }


  public CashFlowDataCashFlowFromInvestingActivities netBusinessPurchaseAndSale(@javax.annotation.Nullable Double netBusinessPurchaseAndSale) {
    this.netBusinessPurchaseAndSale = netBusinessPurchaseAndSale;
    return this;
  }

  /**
   * Net business purchase and sale
   * @return netBusinessPurchaseAndSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_BUSINESS_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetBusinessPurchaseAndSale() {
    return netBusinessPurchaseAndSale;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_BUSINESS_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetBusinessPurchaseAndSale(@javax.annotation.Nullable Double netBusinessPurchaseAndSale) {
    this.netBusinessPurchaseAndSale = netBusinessPurchaseAndSale;
  }


  public CashFlowDataCashFlowFromInvestingActivities saleOfBusiness(@javax.annotation.Nullable Double saleOfBusiness) {
    this.saleOfBusiness = saleOfBusiness;
    return this;
  }

  /**
   * Sale of business
   * @return saleOfBusiness
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfBusiness() {
    return saleOfBusiness;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfBusiness(@javax.annotation.Nullable Double saleOfBusiness) {
    this.saleOfBusiness = saleOfBusiness;
  }


  public CashFlowDataCashFlowFromInvestingActivities purchaseOfBusiness(@javax.annotation.Nullable Double purchaseOfBusiness) {
    this.purchaseOfBusiness = purchaseOfBusiness;
    return this;
  }

  /**
   * Purchase of business
   * @return purchaseOfBusiness
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfBusiness() {
    return purchaseOfBusiness;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_BUSINESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfBusiness(@javax.annotation.Nullable Double purchaseOfBusiness) {
    this.purchaseOfBusiness = purchaseOfBusiness;
  }


  public CashFlowDataCashFlowFromInvestingActivities netIntangiblesPurchaseAndSale(@javax.annotation.Nullable Double netIntangiblesPurchaseAndSale) {
    this.netIntangiblesPurchaseAndSale = netIntangiblesPurchaseAndSale;
    return this;
  }

  /**
   * Net intangibles purchase and sale
   * @return netIntangiblesPurchaseAndSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INTANGIBLES_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIntangiblesPurchaseAndSale() {
    return netIntangiblesPurchaseAndSale;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INTANGIBLES_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIntangiblesPurchaseAndSale(@javax.annotation.Nullable Double netIntangiblesPurchaseAndSale) {
    this.netIntangiblesPurchaseAndSale = netIntangiblesPurchaseAndSale;
  }


  public CashFlowDataCashFlowFromInvestingActivities saleOfIntangibles(@javax.annotation.Nullable Double saleOfIntangibles) {
    this.saleOfIntangibles = saleOfIntangibles;
    return this;
  }

  /**
   * Sale of intangibles
   * @return saleOfIntangibles
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfIntangibles() {
    return saleOfIntangibles;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfIntangibles(@javax.annotation.Nullable Double saleOfIntangibles) {
    this.saleOfIntangibles = saleOfIntangibles;
  }


  public CashFlowDataCashFlowFromInvestingActivities purchaseOfIntangibles(@javax.annotation.Nullable Double purchaseOfIntangibles) {
    this.purchaseOfIntangibles = purchaseOfIntangibles;
    return this;
  }

  /**
   * Purchase of intangibles
   * @return purchaseOfIntangibles
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfIntangibles() {
    return purchaseOfIntangibles;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfIntangibles(@javax.annotation.Nullable Double purchaseOfIntangibles) {
    this.purchaseOfIntangibles = purchaseOfIntangibles;
  }


  public CashFlowDataCashFlowFromInvestingActivities netPpePurchaseAndSale(@javax.annotation.Nullable Double netPpePurchaseAndSale) {
    this.netPpePurchaseAndSale = netPpePurchaseAndSale;
    return this;
  }

  /**
   * Net ppe purchase and sale
   * @return netPpePurchaseAndSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_PPE_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetPpePurchaseAndSale() {
    return netPpePurchaseAndSale;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_PPE_PURCHASE_AND_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetPpePurchaseAndSale(@javax.annotation.Nullable Double netPpePurchaseAndSale) {
    this.netPpePurchaseAndSale = netPpePurchaseAndSale;
  }


  public CashFlowDataCashFlowFromInvestingActivities saleOfPpe(@javax.annotation.Nullable Double saleOfPpe) {
    this.saleOfPpe = saleOfPpe;
    return this;
  }

  /**
   * Sale of ppe
   * @return saleOfPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfPpe() {
    return saleOfPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfPpe(@javax.annotation.Nullable Double saleOfPpe) {
    this.saleOfPpe = saleOfPpe;
  }


  public CashFlowDataCashFlowFromInvestingActivities purchaseOfPpe(@javax.annotation.Nullable Double purchaseOfPpe) {
    this.purchaseOfPpe = purchaseOfPpe;
    return this;
  }

  /**
   * Purchase of ppe
   * @return purchaseOfPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfPpe() {
    return purchaseOfPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfPpe(@javax.annotation.Nullable Double purchaseOfPpe) {
    this.purchaseOfPpe = purchaseOfPpe;
  }


  public CashFlowDataCashFlowFromInvestingActivities capitalExpenditureReported(@javax.annotation.Nullable Double capitalExpenditureReported) {
    this.capitalExpenditureReported = capitalExpenditureReported;
    return this;
  }

  /**
   * Capital expenditure reported
   * @return capitalExpenditureReported
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURE_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCapitalExpenditureReported() {
    return capitalExpenditureReported;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURE_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalExpenditureReported(@javax.annotation.Nullable Double capitalExpenditureReported) {
    this.capitalExpenditureReported = capitalExpenditureReported;
  }


  public CashFlowDataCashFlowFromInvestingActivities capitalExpenditure(@javax.annotation.Nullable Double capitalExpenditure) {
    this.capitalExpenditure = capitalExpenditure;
    return this;
  }

  /**
   * Capital expenditure
   * @return capitalExpenditure
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCapitalExpenditure() {
    return capitalExpenditure;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalExpenditure(@javax.annotation.Nullable Double capitalExpenditure) {
    this.capitalExpenditure = capitalExpenditure;
  }


  /**
   * Return true if this CashFlowData_cash_flow_from_investing_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataCashFlowFromInvestingActivities cashFlowDataCashFlowFromInvestingActivities = (CashFlowDataCashFlowFromInvestingActivities) o;
    return Objects.equals(this.investingCashFlow, cashFlowDataCashFlowFromInvestingActivities.investingCashFlow) &&
        Objects.equals(this.cashFlowFromContinuingInvestingActivities, cashFlowDataCashFlowFromInvestingActivities.cashFlowFromContinuingInvestingActivities) &&
        Objects.equals(this.cashFromDiscontinuedInvestingActivities, cashFlowDataCashFlowFromInvestingActivities.cashFromDiscontinuedInvestingActivities) &&
        Objects.equals(this.netOtherInvestingChanges, cashFlowDataCashFlowFromInvestingActivities.netOtherInvestingChanges) &&
        Objects.equals(this.interestReceivedCfi, cashFlowDataCashFlowFromInvestingActivities.interestReceivedCfi) &&
        Objects.equals(this.dividendsReceivedCfi, cashFlowDataCashFlowFromInvestingActivities.dividendsReceivedCfi) &&
        Objects.equals(this.netInvestmentPurchaseAndSale, cashFlowDataCashFlowFromInvestingActivities.netInvestmentPurchaseAndSale) &&
        Objects.equals(this.saleOfInvestment, cashFlowDataCashFlowFromInvestingActivities.saleOfInvestment) &&
        Objects.equals(this.purchaseOfInvestment, cashFlowDataCashFlowFromInvestingActivities.purchaseOfInvestment) &&
        Objects.equals(this.netInvestmentPropertiesPurchaseAndSale, cashFlowDataCashFlowFromInvestingActivities.netInvestmentPropertiesPurchaseAndSale) &&
        Objects.equals(this.saleOfInvestmentProperties, cashFlowDataCashFlowFromInvestingActivities.saleOfInvestmentProperties) &&
        Objects.equals(this.purchaseOfInvestmentProperties, cashFlowDataCashFlowFromInvestingActivities.purchaseOfInvestmentProperties) &&
        Objects.equals(this.netBusinessPurchaseAndSale, cashFlowDataCashFlowFromInvestingActivities.netBusinessPurchaseAndSale) &&
        Objects.equals(this.saleOfBusiness, cashFlowDataCashFlowFromInvestingActivities.saleOfBusiness) &&
        Objects.equals(this.purchaseOfBusiness, cashFlowDataCashFlowFromInvestingActivities.purchaseOfBusiness) &&
        Objects.equals(this.netIntangiblesPurchaseAndSale, cashFlowDataCashFlowFromInvestingActivities.netIntangiblesPurchaseAndSale) &&
        Objects.equals(this.saleOfIntangibles, cashFlowDataCashFlowFromInvestingActivities.saleOfIntangibles) &&
        Objects.equals(this.purchaseOfIntangibles, cashFlowDataCashFlowFromInvestingActivities.purchaseOfIntangibles) &&
        Objects.equals(this.netPpePurchaseAndSale, cashFlowDataCashFlowFromInvestingActivities.netPpePurchaseAndSale) &&
        Objects.equals(this.saleOfPpe, cashFlowDataCashFlowFromInvestingActivities.saleOfPpe) &&
        Objects.equals(this.purchaseOfPpe, cashFlowDataCashFlowFromInvestingActivities.purchaseOfPpe) &&
        Objects.equals(this.capitalExpenditureReported, cashFlowDataCashFlowFromInvestingActivities.capitalExpenditureReported) &&
        Objects.equals(this.capitalExpenditure, cashFlowDataCashFlowFromInvestingActivities.capitalExpenditure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investingCashFlow, cashFlowFromContinuingInvestingActivities, cashFromDiscontinuedInvestingActivities, netOtherInvestingChanges, interestReceivedCfi, dividendsReceivedCfi, netInvestmentPurchaseAndSale, saleOfInvestment, purchaseOfInvestment, netInvestmentPropertiesPurchaseAndSale, saleOfInvestmentProperties, purchaseOfInvestmentProperties, netBusinessPurchaseAndSale, saleOfBusiness, purchaseOfBusiness, netIntangiblesPurchaseAndSale, saleOfIntangibles, purchaseOfIntangibles, netPpePurchaseAndSale, saleOfPpe, purchaseOfPpe, capitalExpenditureReported, capitalExpenditure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataCashFlowFromInvestingActivities {\n");
    sb.append("    investingCashFlow: ").append(toIndentedString(investingCashFlow)).append("\n");
    sb.append("    cashFlowFromContinuingInvestingActivities: ").append(toIndentedString(cashFlowFromContinuingInvestingActivities)).append("\n");
    sb.append("    cashFromDiscontinuedInvestingActivities: ").append(toIndentedString(cashFromDiscontinuedInvestingActivities)).append("\n");
    sb.append("    netOtherInvestingChanges: ").append(toIndentedString(netOtherInvestingChanges)).append("\n");
    sb.append("    interestReceivedCfi: ").append(toIndentedString(interestReceivedCfi)).append("\n");
    sb.append("    dividendsReceivedCfi: ").append(toIndentedString(dividendsReceivedCfi)).append("\n");
    sb.append("    netInvestmentPurchaseAndSale: ").append(toIndentedString(netInvestmentPurchaseAndSale)).append("\n");
    sb.append("    saleOfInvestment: ").append(toIndentedString(saleOfInvestment)).append("\n");
    sb.append("    purchaseOfInvestment: ").append(toIndentedString(purchaseOfInvestment)).append("\n");
    sb.append("    netInvestmentPropertiesPurchaseAndSale: ").append(toIndentedString(netInvestmentPropertiesPurchaseAndSale)).append("\n");
    sb.append("    saleOfInvestmentProperties: ").append(toIndentedString(saleOfInvestmentProperties)).append("\n");
    sb.append("    purchaseOfInvestmentProperties: ").append(toIndentedString(purchaseOfInvestmentProperties)).append("\n");
    sb.append("    netBusinessPurchaseAndSale: ").append(toIndentedString(netBusinessPurchaseAndSale)).append("\n");
    sb.append("    saleOfBusiness: ").append(toIndentedString(saleOfBusiness)).append("\n");
    sb.append("    purchaseOfBusiness: ").append(toIndentedString(purchaseOfBusiness)).append("\n");
    sb.append("    netIntangiblesPurchaseAndSale: ").append(toIndentedString(netIntangiblesPurchaseAndSale)).append("\n");
    sb.append("    saleOfIntangibles: ").append(toIndentedString(saleOfIntangibles)).append("\n");
    sb.append("    purchaseOfIntangibles: ").append(toIndentedString(purchaseOfIntangibles)).append("\n");
    sb.append("    netPpePurchaseAndSale: ").append(toIndentedString(netPpePurchaseAndSale)).append("\n");
    sb.append("    saleOfPpe: ").append(toIndentedString(saleOfPpe)).append("\n");
    sb.append("    purchaseOfPpe: ").append(toIndentedString(purchaseOfPpe)).append("\n");
    sb.append("    capitalExpenditureReported: ").append(toIndentedString(capitalExpenditureReported)).append("\n");
    sb.append("    capitalExpenditure: ").append(toIndentedString(capitalExpenditure)).append("\n");
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

    // add `investing_cash_flow` to the URL query string
    if (getInvestingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvesting_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestingCashFlow()))));
    }

    // add `cash_flow_from_continuing_investing_activities` to the URL query string
    if (getCashFlowFromContinuingInvestingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_flow_from_continuing_investing_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFlowFromContinuingInvestingActivities()))));
    }

    // add `cash_from_discontinued_investing_activities` to the URL query string
    if (getCashFromDiscontinuedInvestingActivities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_from_discontinued_investing_activities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFromDiscontinuedInvestingActivities()))));
    }

    // add `net_other_investing_changes` to the URL query string
    if (getNetOtherInvestingChanges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_other_investing_changes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetOtherInvestingChanges()))));
    }

    // add `interest_received_cfi` to the URL query string
    if (getInterestReceivedCfi() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_received_cfi%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestReceivedCfi()))));
    }

    // add `dividends_received_cfi` to the URL query string
    if (getDividendsReceivedCfi() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividends_received_cfi%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendsReceivedCfi()))));
    }

    // add `net_investment_purchase_and_sale` to the URL query string
    if (getNetInvestmentPurchaseAndSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_investment_purchase_and_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetInvestmentPurchaseAndSale()))));
    }

    // add `sale_of_investment` to the URL query string
    if (getSaleOfInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfInvestment()))));
    }

    // add `purchase_of_investment` to the URL query string
    if (getPurchaseOfInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfInvestment()))));
    }

    // add `net_investment_properties_purchase_and_sale` to the URL query string
    if (getNetInvestmentPropertiesPurchaseAndSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_investment_properties_purchase_and_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetInvestmentPropertiesPurchaseAndSale()))));
    }

    // add `sale_of_investment_properties` to the URL query string
    if (getSaleOfInvestmentProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_investment_properties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfInvestmentProperties()))));
    }

    // add `purchase_of_investment_properties` to the URL query string
    if (getPurchaseOfInvestmentProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_investment_properties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfInvestmentProperties()))));
    }

    // add `net_business_purchase_and_sale` to the URL query string
    if (getNetBusinessPurchaseAndSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_business_purchase_and_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetBusinessPurchaseAndSale()))));
    }

    // add `sale_of_business` to the URL query string
    if (getSaleOfBusiness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_business%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfBusiness()))));
    }

    // add `purchase_of_business` to the URL query string
    if (getPurchaseOfBusiness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_business%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfBusiness()))));
    }

    // add `net_intangibles_purchase_and_sale` to the URL query string
    if (getNetIntangiblesPurchaseAndSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_intangibles_purchase_and_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIntangiblesPurchaseAndSale()))));
    }

    // add `sale_of_intangibles` to the URL query string
    if (getSaleOfIntangibles() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_intangibles%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfIntangibles()))));
    }

    // add `purchase_of_intangibles` to the URL query string
    if (getPurchaseOfIntangibles() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_intangibles%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfIntangibles()))));
    }

    // add `net_ppe_purchase_and_sale` to the URL query string
    if (getNetPpePurchaseAndSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_ppe_purchase_and_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetPpePurchaseAndSale()))));
    }

    // add `sale_of_ppe` to the URL query string
    if (getSaleOfPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfPpe()))));
    }

    // add `purchase_of_ppe` to the URL query string
    if (getPurchaseOfPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfPpe()))));
    }

    // add `capital_expenditure_reported` to the URL query string
    if (getCapitalExpenditureReported() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital_expenditure_reported%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapitalExpenditureReported()))));
    }

    // add `capital_expenditure` to the URL query string
    if (getCapitalExpenditure() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital_expenditure%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapitalExpenditure()))));
    }

    return joiner.toString();
  }
}

