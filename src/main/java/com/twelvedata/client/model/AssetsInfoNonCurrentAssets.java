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
import com.twelvedata.client.model.AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Non-current assets information
 */
@JsonPropertyOrder({
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_FINANCIAL_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_AND_ADVANCES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_OTHER_INVESTMENTS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENT_IN_FINANCIAL_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_HELD_TO_MATURITY_SECURITIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_AVAILABLE_FOR_SALE_SECURITIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_FINANCIAL_ASSETS_DESIGNATED_AS_FAIR_VALUE_THROUGH_PROFIT_OR_LOSS_TOTAL,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_TRADING_SECURITIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_LONG_TERM_EQUITY_INVESTMENT,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_IN_JOINT_VENTURES_AT_COST,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_IN_OTHER_VENTURES_UNDER_EQUITY_METHOD,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_IN_ASSOCIATES_AT_COST,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_IN_SUBSIDIARIES_AT_COST,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_INVESTMENT_PROPERTIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_GOODWILL_AND_OTHER_INTANGIBLE_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NET_PPE,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_GROSS_PPE,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_ACCUMULATED_DEPRECIATION,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_LEASES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_OTHER_PROPERTIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_BUILDINGS_AND_IMPROVEMENTS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_LAND_AND_IMPROVEMENTS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_PROPERTIES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NON_CURRENT_ACCOUNTS_RECEIVABLE,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NON_CURRENT_NOTE_RECEIVABLES,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_NON_CURRENT,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NON_CURRENT_PREPAID_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NON_CURRENT_DEFERRED_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_ASSETS,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_DEFINED_PENSION_BENEFIT,
  AssetsInfoNonCurrentAssets.JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoNonCurrentAssets {
  public static final String JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS = "total_non_current_assets";
  @javax.annotation.Nullable
  private Double totalNonCurrentAssets;

  public static final String JSON_PROPERTY_FINANCIAL_ASSETS = "financial_assets";
  @javax.annotation.Nullable
  private Double financialAssets;

  public static final String JSON_PROPERTY_INVESTMENTS_AND_ADVANCES = "investments_and_advances";
  @javax.annotation.Nullable
  private Double investmentsAndAdvances;

  public static final String JSON_PROPERTY_OTHER_INVESTMENTS = "other_investments";
  @javax.annotation.Nullable
  private Double otherInvestments;

  public static final String JSON_PROPERTY_INVESTMENT_IN_FINANCIAL_ASSETS = "investment_in_financial_assets";
  @javax.annotation.Nullable
  private Double investmentInFinancialAssets;

  public static final String JSON_PROPERTY_HELD_TO_MATURITY_SECURITIES = "held_to_maturity_securities";
  @javax.annotation.Nullable
  private Double heldToMaturitySecurities;

  public static final String JSON_PROPERTY_AVAILABLE_FOR_SALE_SECURITIES = "available_for_sale_securities";
  @javax.annotation.Nullable
  private Double availableForSaleSecurities;

  public static final String JSON_PROPERTY_FINANCIAL_ASSETS_DESIGNATED_AS_FAIR_VALUE_THROUGH_PROFIT_OR_LOSS_TOTAL = "financial_assets_designated_as_fair_value_through_profit_or_loss_total";
  @javax.annotation.Nullable
  private Double financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal;

  public static final String JSON_PROPERTY_TRADING_SECURITIES = "trading_securities";
  @javax.annotation.Nullable
  private Double tradingSecurities;

  public static final String JSON_PROPERTY_LONG_TERM_EQUITY_INVESTMENT = "long_term_equity_investment";
  @javax.annotation.Nullable
  private Double longTermEquityInvestment;

  public static final String JSON_PROPERTY_INVESTMENTS_IN_JOINT_VENTURES_AT_COST = "investments_in_joint_ventures_at_cost";
  @javax.annotation.Nullable
  private Double investmentsInJointVenturesAtCost;

  public static final String JSON_PROPERTY_INVESTMENTS_IN_OTHER_VENTURES_UNDER_EQUITY_METHOD = "investments_in_other_ventures_under_equity_method";
  @javax.annotation.Nullable
  private Double investmentsInOtherVenturesUnderEquityMethod;

  public static final String JSON_PROPERTY_INVESTMENTS_IN_ASSOCIATES_AT_COST = "investments_in_associates_at_cost";
  @javax.annotation.Nullable
  private Double investmentsInAssociatesAtCost;

  public static final String JSON_PROPERTY_INVESTMENTS_IN_SUBSIDIARIES_AT_COST = "investments_in_subsidiaries_at_cost";
  @javax.annotation.Nullable
  private Double investmentsInSubsidiariesAtCost;

  public static final String JSON_PROPERTY_INVESTMENT_PROPERTIES = "investment_properties";
  @javax.annotation.Nullable
  private Double investmentProperties;

  public static final String JSON_PROPERTY_GOODWILL_AND_OTHER_INTANGIBLE_ASSETS = "goodwill_and_other_intangible_assets";
  @javax.annotation.Nullable
  private AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets goodwillAndOtherIntangibleAssets;

  public static final String JSON_PROPERTY_NET_PPE = "net_ppe";
  @javax.annotation.Nullable
  private Double netPpe;

  public static final String JSON_PROPERTY_GROSS_PPE = "gross_ppe";
  @javax.annotation.Nullable
  private Double grossPpe;

  public static final String JSON_PROPERTY_ACCUMULATED_DEPRECIATION = "accumulated_depreciation";
  @javax.annotation.Nullable
  private Double accumulatedDepreciation;

  public static final String JSON_PROPERTY_LEASES = "leases";
  @javax.annotation.Nullable
  private Double leases;

  public static final String JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS = "construction_in_progress";
  @javax.annotation.Nullable
  private Double constructionInProgress;

  public static final String JSON_PROPERTY_OTHER_PROPERTIES = "other_properties";
  @javax.annotation.Nullable
  private Double otherProperties;

  public static final String JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT = "machinery_furniture_equipment";
  @javax.annotation.Nullable
  private Double machineryFurnitureEquipment;

  public static final String JSON_PROPERTY_BUILDINGS_AND_IMPROVEMENTS = "buildings_and_improvements";
  @javax.annotation.Nullable
  private Double buildingsAndImprovements;

  public static final String JSON_PROPERTY_LAND_AND_IMPROVEMENTS = "land_and_improvements";
  @javax.annotation.Nullable
  private Double landAndImprovements;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @javax.annotation.Nullable
  private Double properties;

  public static final String JSON_PROPERTY_NON_CURRENT_ACCOUNTS_RECEIVABLE = "non_current_accounts_receivable";
  @javax.annotation.Nullable
  private Double nonCurrentAccountsReceivable;

  public static final String JSON_PROPERTY_NON_CURRENT_NOTE_RECEIVABLES = "non_current_note_receivables";
  @javax.annotation.Nullable
  private Double nonCurrentNoteReceivables;

  public static final String JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_NON_CURRENT = "due_from_related_parties_non_current";
  @javax.annotation.Nullable
  private Double dueFromRelatedPartiesNonCurrent;

  public static final String JSON_PROPERTY_NON_CURRENT_PREPAID_ASSETS = "non_current_prepaid_assets";
  @javax.annotation.Nullable
  private Double nonCurrentPrepaidAssets;

  public static final String JSON_PROPERTY_NON_CURRENT_DEFERRED_ASSETS = "non_current_deferred_assets";
  @javax.annotation.Nullable
  private Double nonCurrentDeferredAssets;

  public static final String JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_ASSETS = "non_current_deferred_taxes_assets";
  @javax.annotation.Nullable
  private Double nonCurrentDeferredTaxesAssets;

  public static final String JSON_PROPERTY_DEFINED_PENSION_BENEFIT = "defined_pension_benefit";
  @javax.annotation.Nullable
  private Double definedPensionBenefit;

  public static final String JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS = "other_non_current_assets";
  @javax.annotation.Nullable
  private Double otherNonCurrentAssets;

  public AssetsInfoNonCurrentAssets() { 
  }

  public AssetsInfoNonCurrentAssets totalNonCurrentAssets(@javax.annotation.Nullable Double totalNonCurrentAssets) {
    this.totalNonCurrentAssets = totalNonCurrentAssets;
    return this;
  }

  /**
   * Total non current assets
   * @return totalNonCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalNonCurrentAssets() {
    return totalNonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNonCurrentAssets(@javax.annotation.Nullable Double totalNonCurrentAssets) {
    this.totalNonCurrentAssets = totalNonCurrentAssets;
  }


  public AssetsInfoNonCurrentAssets financialAssets(@javax.annotation.Nullable Double financialAssets) {
    this.financialAssets = financialAssets;
    return this;
  }

  /**
   * Financial assets
   * @return financialAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFinancialAssets() {
    return financialAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancialAssets(@javax.annotation.Nullable Double financialAssets) {
    this.financialAssets = financialAssets;
  }


  public AssetsInfoNonCurrentAssets investmentsAndAdvances(@javax.annotation.Nullable Double investmentsAndAdvances) {
    this.investmentsAndAdvances = investmentsAndAdvances;
    return this;
  }

  /**
   * Investments and advances
   * @return investmentsAndAdvances
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_AND_ADVANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsAndAdvances() {
    return investmentsAndAdvances;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_AND_ADVANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsAndAdvances(@javax.annotation.Nullable Double investmentsAndAdvances) {
    this.investmentsAndAdvances = investmentsAndAdvances;
  }


  public AssetsInfoNonCurrentAssets otherInvestments(@javax.annotation.Nullable Double otherInvestments) {
    this.otherInvestments = otherInvestments;
    return this;
  }

  /**
   * Other investments
   * @return otherInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherInvestments() {
    return otherInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherInvestments(@javax.annotation.Nullable Double otherInvestments) {
    this.otherInvestments = otherInvestments;
  }


  public AssetsInfoNonCurrentAssets investmentInFinancialAssets(@javax.annotation.Nullable Double investmentInFinancialAssets) {
    this.investmentInFinancialAssets = investmentInFinancialAssets;
    return this;
  }

  /**
   * Investment in financial assets
   * @return investmentInFinancialAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_IN_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentInFinancialAssets() {
    return investmentInFinancialAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_IN_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentInFinancialAssets(@javax.annotation.Nullable Double investmentInFinancialAssets) {
    this.investmentInFinancialAssets = investmentInFinancialAssets;
  }


  public AssetsInfoNonCurrentAssets heldToMaturitySecurities(@javax.annotation.Nullable Double heldToMaturitySecurities) {
    this.heldToMaturitySecurities = heldToMaturitySecurities;
    return this;
  }

  /**
   * Held to maturity securities
   * @return heldToMaturitySecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HELD_TO_MATURITY_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHeldToMaturitySecurities() {
    return heldToMaturitySecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_HELD_TO_MATURITY_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeldToMaturitySecurities(@javax.annotation.Nullable Double heldToMaturitySecurities) {
    this.heldToMaturitySecurities = heldToMaturitySecurities;
  }


  public AssetsInfoNonCurrentAssets availableForSaleSecurities(@javax.annotation.Nullable Double availableForSaleSecurities) {
    this.availableForSaleSecurities = availableForSaleSecurities;
    return this;
  }

  /**
   * Available for sale securities
   * @return availableForSaleSecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVAILABLE_FOR_SALE_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAvailableForSaleSecurities() {
    return availableForSaleSecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_AVAILABLE_FOR_SALE_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableForSaleSecurities(@javax.annotation.Nullable Double availableForSaleSecurities) {
    this.availableForSaleSecurities = availableForSaleSecurities;
  }


  public AssetsInfoNonCurrentAssets financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal(@javax.annotation.Nullable Double financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal) {
    this.financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal = financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal;
    return this;
  }

  /**
   * Financial assets designated as fair value through profit or loss total
   * @return financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS_DESIGNATED_AS_FAIR_VALUE_THROUGH_PROFIT_OR_LOSS_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFinancialAssetsDesignatedAsFairValueThroughProfitOrLossTotal() {
    return financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS_DESIGNATED_AS_FAIR_VALUE_THROUGH_PROFIT_OR_LOSS_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancialAssetsDesignatedAsFairValueThroughProfitOrLossTotal(@javax.annotation.Nullable Double financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal) {
    this.financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal = financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal;
  }


  public AssetsInfoNonCurrentAssets tradingSecurities(@javax.annotation.Nullable Double tradingSecurities) {
    this.tradingSecurities = tradingSecurities;
    return this;
  }

  /**
   * Trading securities
   * @return tradingSecurities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRADING_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTradingSecurities() {
    return tradingSecurities;
  }


  @JsonProperty(value = JSON_PROPERTY_TRADING_SECURITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingSecurities(@javax.annotation.Nullable Double tradingSecurities) {
    this.tradingSecurities = tradingSecurities;
  }


  public AssetsInfoNonCurrentAssets longTermEquityInvestment(@javax.annotation.Nullable Double longTermEquityInvestment) {
    this.longTermEquityInvestment = longTermEquityInvestment;
    return this;
  }

  /**
   * Long term equity investment
   * @return longTermEquityInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_EQUITY_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermEquityInvestment() {
    return longTermEquityInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_EQUITY_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermEquityInvestment(@javax.annotation.Nullable Double longTermEquityInvestment) {
    this.longTermEquityInvestment = longTermEquityInvestment;
  }


  public AssetsInfoNonCurrentAssets investmentsInJointVenturesAtCost(@javax.annotation.Nullable Double investmentsInJointVenturesAtCost) {
    this.investmentsInJointVenturesAtCost = investmentsInJointVenturesAtCost;
    return this;
  }

  /**
   * Investments in joint ventures at cost
   * @return investmentsInJointVenturesAtCost
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_JOINT_VENTURES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsInJointVenturesAtCost() {
    return investmentsInJointVenturesAtCost;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_JOINT_VENTURES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsInJointVenturesAtCost(@javax.annotation.Nullable Double investmentsInJointVenturesAtCost) {
    this.investmentsInJointVenturesAtCost = investmentsInJointVenturesAtCost;
  }


  public AssetsInfoNonCurrentAssets investmentsInOtherVenturesUnderEquityMethod(@javax.annotation.Nullable Double investmentsInOtherVenturesUnderEquityMethod) {
    this.investmentsInOtherVenturesUnderEquityMethod = investmentsInOtherVenturesUnderEquityMethod;
    return this;
  }

  /**
   * Investments in other ventures under equity method
   * @return investmentsInOtherVenturesUnderEquityMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_OTHER_VENTURES_UNDER_EQUITY_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsInOtherVenturesUnderEquityMethod() {
    return investmentsInOtherVenturesUnderEquityMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_OTHER_VENTURES_UNDER_EQUITY_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsInOtherVenturesUnderEquityMethod(@javax.annotation.Nullable Double investmentsInOtherVenturesUnderEquityMethod) {
    this.investmentsInOtherVenturesUnderEquityMethod = investmentsInOtherVenturesUnderEquityMethod;
  }


  public AssetsInfoNonCurrentAssets investmentsInAssociatesAtCost(@javax.annotation.Nullable Double investmentsInAssociatesAtCost) {
    this.investmentsInAssociatesAtCost = investmentsInAssociatesAtCost;
    return this;
  }

  /**
   * Investments in associates at cost
   * @return investmentsInAssociatesAtCost
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_ASSOCIATES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsInAssociatesAtCost() {
    return investmentsInAssociatesAtCost;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_ASSOCIATES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsInAssociatesAtCost(@javax.annotation.Nullable Double investmentsInAssociatesAtCost) {
    this.investmentsInAssociatesAtCost = investmentsInAssociatesAtCost;
  }


  public AssetsInfoNonCurrentAssets investmentsInSubsidiariesAtCost(@javax.annotation.Nullable Double investmentsInSubsidiariesAtCost) {
    this.investmentsInSubsidiariesAtCost = investmentsInSubsidiariesAtCost;
    return this;
  }

  /**
   * Investments in subsidiaries at cost
   * @return investmentsInSubsidiariesAtCost
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_SUBSIDIARIES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsInSubsidiariesAtCost() {
    return investmentsInSubsidiariesAtCost;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_IN_SUBSIDIARIES_AT_COST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsInSubsidiariesAtCost(@javax.annotation.Nullable Double investmentsInSubsidiariesAtCost) {
    this.investmentsInSubsidiariesAtCost = investmentsInSubsidiariesAtCost;
  }


  public AssetsInfoNonCurrentAssets investmentProperties(@javax.annotation.Nullable Double investmentProperties) {
    this.investmentProperties = investmentProperties;
    return this;
  }

  /**
   * Investment properties
   * @return investmentProperties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentProperties() {
    return investmentProperties;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentProperties(@javax.annotation.Nullable Double investmentProperties) {
    this.investmentProperties = investmentProperties;
  }


  public AssetsInfoNonCurrentAssets goodwillAndOtherIntangibleAssets(@javax.annotation.Nullable AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets goodwillAndOtherIntangibleAssets) {
    this.goodwillAndOtherIntangibleAssets = goodwillAndOtherIntangibleAssets;
    return this;
  }

  /**
   * Get goodwillAndOtherIntangibleAssets
   * @return goodwillAndOtherIntangibleAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GOODWILL_AND_OTHER_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets getGoodwillAndOtherIntangibleAssets() {
    return goodwillAndOtherIntangibleAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_GOODWILL_AND_OTHER_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodwillAndOtherIntangibleAssets(@javax.annotation.Nullable AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets goodwillAndOtherIntangibleAssets) {
    this.goodwillAndOtherIntangibleAssets = goodwillAndOtherIntangibleAssets;
  }


  public AssetsInfoNonCurrentAssets netPpe(@javax.annotation.Nullable Double netPpe) {
    this.netPpe = netPpe;
    return this;
  }

  /**
   * Net ppe
   * @return netPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetPpe() {
    return netPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetPpe(@javax.annotation.Nullable Double netPpe) {
    this.netPpe = netPpe;
  }


  public AssetsInfoNonCurrentAssets grossPpe(@javax.annotation.Nullable Double grossPpe) {
    this.grossPpe = grossPpe;
    return this;
  }

  /**
   * Gross ppe
   * @return grossPpe
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrossPpe() {
    return grossPpe;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_PPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossPpe(@javax.annotation.Nullable Double grossPpe) {
    this.grossPpe = grossPpe;
  }


  public AssetsInfoNonCurrentAssets accumulatedDepreciation(@javax.annotation.Nullable Double accumulatedDepreciation) {
    this.accumulatedDepreciation = accumulatedDepreciation;
    return this;
  }

  /**
   * Accumulated depreciation
   * @return accumulatedDepreciation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCUMULATED_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccumulatedDepreciation() {
    return accumulatedDepreciation;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCUMULATED_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedDepreciation(@javax.annotation.Nullable Double accumulatedDepreciation) {
    this.accumulatedDepreciation = accumulatedDepreciation;
  }


  public AssetsInfoNonCurrentAssets leases(@javax.annotation.Nullable Double leases) {
    this.leases = leases;
    return this;
  }

  /**
   * Leases
   * @return leases
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LEASES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLeases() {
    return leases;
  }


  @JsonProperty(value = JSON_PROPERTY_LEASES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeases(@javax.annotation.Nullable Double leases) {
    this.leases = leases;
  }


  public AssetsInfoNonCurrentAssets constructionInProgress(@javax.annotation.Nullable Double constructionInProgress) {
    this.constructionInProgress = constructionInProgress;
    return this;
  }

  /**
   * Construction in progress
   * @return constructionInProgress
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getConstructionInProgress() {
    return constructionInProgress;
  }


  @JsonProperty(value = JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructionInProgress(@javax.annotation.Nullable Double constructionInProgress) {
    this.constructionInProgress = constructionInProgress;
  }


  public AssetsInfoNonCurrentAssets otherProperties(@javax.annotation.Nullable Double otherProperties) {
    this.otherProperties = otherProperties;
    return this;
  }

  /**
   * Other properties
   * @return otherProperties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherProperties() {
    return otherProperties;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherProperties(@javax.annotation.Nullable Double otherProperties) {
    this.otherProperties = otherProperties;
  }


  public AssetsInfoNonCurrentAssets machineryFurnitureEquipment(@javax.annotation.Nullable Double machineryFurnitureEquipment) {
    this.machineryFurnitureEquipment = machineryFurnitureEquipment;
    return this;
  }

  /**
   * Machinery furniture equipment
   * @return machineryFurnitureEquipment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMachineryFurnitureEquipment() {
    return machineryFurnitureEquipment;
  }


  @JsonProperty(value = JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMachineryFurnitureEquipment(@javax.annotation.Nullable Double machineryFurnitureEquipment) {
    this.machineryFurnitureEquipment = machineryFurnitureEquipment;
  }


  public AssetsInfoNonCurrentAssets buildingsAndImprovements(@javax.annotation.Nullable Double buildingsAndImprovements) {
    this.buildingsAndImprovements = buildingsAndImprovements;
    return this;
  }

  /**
   * Buildings and improvements
   * @return buildingsAndImprovements
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BUILDINGS_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBuildingsAndImprovements() {
    return buildingsAndImprovements;
  }


  @JsonProperty(value = JSON_PROPERTY_BUILDINGS_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingsAndImprovements(@javax.annotation.Nullable Double buildingsAndImprovements) {
    this.buildingsAndImprovements = buildingsAndImprovements;
  }


  public AssetsInfoNonCurrentAssets landAndImprovements(@javax.annotation.Nullable Double landAndImprovements) {
    this.landAndImprovements = landAndImprovements;
    return this;
  }

  /**
   * Land and improvements
   * @return landAndImprovements
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAND_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLandAndImprovements() {
    return landAndImprovements;
  }


  @JsonProperty(value = JSON_PROPERTY_LAND_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandAndImprovements(@javax.annotation.Nullable Double landAndImprovements) {
    this.landAndImprovements = landAndImprovements;
  }


  public AssetsInfoNonCurrentAssets properties(@javax.annotation.Nullable Double properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Properties
   * @return properties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProperties() {
    return properties;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(@javax.annotation.Nullable Double properties) {
    this.properties = properties;
  }


  public AssetsInfoNonCurrentAssets nonCurrentAccountsReceivable(@javax.annotation.Nullable Double nonCurrentAccountsReceivable) {
    this.nonCurrentAccountsReceivable = nonCurrentAccountsReceivable;
    return this;
  }

  /**
   * Non current accounts receivable
   * @return nonCurrentAccountsReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentAccountsReceivable() {
    return nonCurrentAccountsReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentAccountsReceivable(@javax.annotation.Nullable Double nonCurrentAccountsReceivable) {
    this.nonCurrentAccountsReceivable = nonCurrentAccountsReceivable;
  }


  public AssetsInfoNonCurrentAssets nonCurrentNoteReceivables(@javax.annotation.Nullable Double nonCurrentNoteReceivables) {
    this.nonCurrentNoteReceivables = nonCurrentNoteReceivables;
    return this;
  }

  /**
   * Non current note receivables
   * @return nonCurrentNoteReceivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_NOTE_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentNoteReceivables() {
    return nonCurrentNoteReceivables;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_NOTE_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentNoteReceivables(@javax.annotation.Nullable Double nonCurrentNoteReceivables) {
    this.nonCurrentNoteReceivables = nonCurrentNoteReceivables;
  }


  public AssetsInfoNonCurrentAssets dueFromRelatedPartiesNonCurrent(@javax.annotation.Nullable Double dueFromRelatedPartiesNonCurrent) {
    this.dueFromRelatedPartiesNonCurrent = dueFromRelatedPartiesNonCurrent;
    return this;
  }

  /**
   * Due from related parties non current
   * @return dueFromRelatedPartiesNonCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDueFromRelatedPartiesNonCurrent() {
    return dueFromRelatedPartiesNonCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_NON_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueFromRelatedPartiesNonCurrent(@javax.annotation.Nullable Double dueFromRelatedPartiesNonCurrent) {
    this.dueFromRelatedPartiesNonCurrent = dueFromRelatedPartiesNonCurrent;
  }


  public AssetsInfoNonCurrentAssets nonCurrentPrepaidAssets(@javax.annotation.Nullable Double nonCurrentPrepaidAssets) {
    this.nonCurrentPrepaidAssets = nonCurrentPrepaidAssets;
    return this;
  }

  /**
   * Non current prepaid assets
   * @return nonCurrentPrepaidAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentPrepaidAssets() {
    return nonCurrentPrepaidAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentPrepaidAssets(@javax.annotation.Nullable Double nonCurrentPrepaidAssets) {
    this.nonCurrentPrepaidAssets = nonCurrentPrepaidAssets;
  }


  public AssetsInfoNonCurrentAssets nonCurrentDeferredAssets(@javax.annotation.Nullable Double nonCurrentDeferredAssets) {
    this.nonCurrentDeferredAssets = nonCurrentDeferredAssets;
    return this;
  }

  /**
   * Non current deferred assets
   * @return nonCurrentDeferredAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentDeferredAssets() {
    return nonCurrentDeferredAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentDeferredAssets(@javax.annotation.Nullable Double nonCurrentDeferredAssets) {
    this.nonCurrentDeferredAssets = nonCurrentDeferredAssets;
  }


  public AssetsInfoNonCurrentAssets nonCurrentDeferredTaxesAssets(@javax.annotation.Nullable Double nonCurrentDeferredTaxesAssets) {
    this.nonCurrentDeferredTaxesAssets = nonCurrentDeferredTaxesAssets;
    return this;
  }

  /**
   * Non current deferred taxes assets
   * @return nonCurrentDeferredTaxesAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNonCurrentDeferredTaxesAssets() {
    return nonCurrentDeferredTaxesAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_DEFERRED_TAXES_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentDeferredTaxesAssets(@javax.annotation.Nullable Double nonCurrentDeferredTaxesAssets) {
    this.nonCurrentDeferredTaxesAssets = nonCurrentDeferredTaxesAssets;
  }


  public AssetsInfoNonCurrentAssets definedPensionBenefit(@javax.annotation.Nullable Double definedPensionBenefit) {
    this.definedPensionBenefit = definedPensionBenefit;
    return this;
  }

  /**
   * Defined pension benefit
   * @return definedPensionBenefit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFINED_PENSION_BENEFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDefinedPensionBenefit() {
    return definedPensionBenefit;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFINED_PENSION_BENEFIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefinedPensionBenefit(@javax.annotation.Nullable Double definedPensionBenefit) {
    this.definedPensionBenefit = definedPensionBenefit;
  }


  public AssetsInfoNonCurrentAssets otherNonCurrentAssets(@javax.annotation.Nullable Double otherNonCurrentAssets) {
    this.otherNonCurrentAssets = otherNonCurrentAssets;
    return this;
  }

  /**
   * Other non current assets
   * @return otherNonCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonCurrentAssets() {
    return otherNonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonCurrentAssets(@javax.annotation.Nullable Double otherNonCurrentAssets) {
    this.otherNonCurrentAssets = otherNonCurrentAssets;
  }


  /**
   * Return true if this AssetsInfo_non_current_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoNonCurrentAssets assetsInfoNonCurrentAssets = (AssetsInfoNonCurrentAssets) o;
    return Objects.equals(this.totalNonCurrentAssets, assetsInfoNonCurrentAssets.totalNonCurrentAssets) &&
        Objects.equals(this.financialAssets, assetsInfoNonCurrentAssets.financialAssets) &&
        Objects.equals(this.investmentsAndAdvances, assetsInfoNonCurrentAssets.investmentsAndAdvances) &&
        Objects.equals(this.otherInvestments, assetsInfoNonCurrentAssets.otherInvestments) &&
        Objects.equals(this.investmentInFinancialAssets, assetsInfoNonCurrentAssets.investmentInFinancialAssets) &&
        Objects.equals(this.heldToMaturitySecurities, assetsInfoNonCurrentAssets.heldToMaturitySecurities) &&
        Objects.equals(this.availableForSaleSecurities, assetsInfoNonCurrentAssets.availableForSaleSecurities) &&
        Objects.equals(this.financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal, assetsInfoNonCurrentAssets.financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal) &&
        Objects.equals(this.tradingSecurities, assetsInfoNonCurrentAssets.tradingSecurities) &&
        Objects.equals(this.longTermEquityInvestment, assetsInfoNonCurrentAssets.longTermEquityInvestment) &&
        Objects.equals(this.investmentsInJointVenturesAtCost, assetsInfoNonCurrentAssets.investmentsInJointVenturesAtCost) &&
        Objects.equals(this.investmentsInOtherVenturesUnderEquityMethod, assetsInfoNonCurrentAssets.investmentsInOtherVenturesUnderEquityMethod) &&
        Objects.equals(this.investmentsInAssociatesAtCost, assetsInfoNonCurrentAssets.investmentsInAssociatesAtCost) &&
        Objects.equals(this.investmentsInSubsidiariesAtCost, assetsInfoNonCurrentAssets.investmentsInSubsidiariesAtCost) &&
        Objects.equals(this.investmentProperties, assetsInfoNonCurrentAssets.investmentProperties) &&
        Objects.equals(this.goodwillAndOtherIntangibleAssets, assetsInfoNonCurrentAssets.goodwillAndOtherIntangibleAssets) &&
        Objects.equals(this.netPpe, assetsInfoNonCurrentAssets.netPpe) &&
        Objects.equals(this.grossPpe, assetsInfoNonCurrentAssets.grossPpe) &&
        Objects.equals(this.accumulatedDepreciation, assetsInfoNonCurrentAssets.accumulatedDepreciation) &&
        Objects.equals(this.leases, assetsInfoNonCurrentAssets.leases) &&
        Objects.equals(this.constructionInProgress, assetsInfoNonCurrentAssets.constructionInProgress) &&
        Objects.equals(this.otherProperties, assetsInfoNonCurrentAssets.otherProperties) &&
        Objects.equals(this.machineryFurnitureEquipment, assetsInfoNonCurrentAssets.machineryFurnitureEquipment) &&
        Objects.equals(this.buildingsAndImprovements, assetsInfoNonCurrentAssets.buildingsAndImprovements) &&
        Objects.equals(this.landAndImprovements, assetsInfoNonCurrentAssets.landAndImprovements) &&
        Objects.equals(this.properties, assetsInfoNonCurrentAssets.properties) &&
        Objects.equals(this.nonCurrentAccountsReceivable, assetsInfoNonCurrentAssets.nonCurrentAccountsReceivable) &&
        Objects.equals(this.nonCurrentNoteReceivables, assetsInfoNonCurrentAssets.nonCurrentNoteReceivables) &&
        Objects.equals(this.dueFromRelatedPartiesNonCurrent, assetsInfoNonCurrentAssets.dueFromRelatedPartiesNonCurrent) &&
        Objects.equals(this.nonCurrentPrepaidAssets, assetsInfoNonCurrentAssets.nonCurrentPrepaidAssets) &&
        Objects.equals(this.nonCurrentDeferredAssets, assetsInfoNonCurrentAssets.nonCurrentDeferredAssets) &&
        Objects.equals(this.nonCurrentDeferredTaxesAssets, assetsInfoNonCurrentAssets.nonCurrentDeferredTaxesAssets) &&
        Objects.equals(this.definedPensionBenefit, assetsInfoNonCurrentAssets.definedPensionBenefit) &&
        Objects.equals(this.otherNonCurrentAssets, assetsInfoNonCurrentAssets.otherNonCurrentAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNonCurrentAssets, financialAssets, investmentsAndAdvances, otherInvestments, investmentInFinancialAssets, heldToMaturitySecurities, availableForSaleSecurities, financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal, tradingSecurities, longTermEquityInvestment, investmentsInJointVenturesAtCost, investmentsInOtherVenturesUnderEquityMethod, investmentsInAssociatesAtCost, investmentsInSubsidiariesAtCost, investmentProperties, goodwillAndOtherIntangibleAssets, netPpe, grossPpe, accumulatedDepreciation, leases, constructionInProgress, otherProperties, machineryFurnitureEquipment, buildingsAndImprovements, landAndImprovements, properties, nonCurrentAccountsReceivable, nonCurrentNoteReceivables, dueFromRelatedPartiesNonCurrent, nonCurrentPrepaidAssets, nonCurrentDeferredAssets, nonCurrentDeferredTaxesAssets, definedPensionBenefit, otherNonCurrentAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoNonCurrentAssets {\n");
    sb.append("    totalNonCurrentAssets: ").append(toIndentedString(totalNonCurrentAssets)).append("\n");
    sb.append("    financialAssets: ").append(toIndentedString(financialAssets)).append("\n");
    sb.append("    investmentsAndAdvances: ").append(toIndentedString(investmentsAndAdvances)).append("\n");
    sb.append("    otherInvestments: ").append(toIndentedString(otherInvestments)).append("\n");
    sb.append("    investmentInFinancialAssets: ").append(toIndentedString(investmentInFinancialAssets)).append("\n");
    sb.append("    heldToMaturitySecurities: ").append(toIndentedString(heldToMaturitySecurities)).append("\n");
    sb.append("    availableForSaleSecurities: ").append(toIndentedString(availableForSaleSecurities)).append("\n");
    sb.append("    financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal: ").append(toIndentedString(financialAssetsDesignatedAsFairValueThroughProfitOrLossTotal)).append("\n");
    sb.append("    tradingSecurities: ").append(toIndentedString(tradingSecurities)).append("\n");
    sb.append("    longTermEquityInvestment: ").append(toIndentedString(longTermEquityInvestment)).append("\n");
    sb.append("    investmentsInJointVenturesAtCost: ").append(toIndentedString(investmentsInJointVenturesAtCost)).append("\n");
    sb.append("    investmentsInOtherVenturesUnderEquityMethod: ").append(toIndentedString(investmentsInOtherVenturesUnderEquityMethod)).append("\n");
    sb.append("    investmentsInAssociatesAtCost: ").append(toIndentedString(investmentsInAssociatesAtCost)).append("\n");
    sb.append("    investmentsInSubsidiariesAtCost: ").append(toIndentedString(investmentsInSubsidiariesAtCost)).append("\n");
    sb.append("    investmentProperties: ").append(toIndentedString(investmentProperties)).append("\n");
    sb.append("    goodwillAndOtherIntangibleAssets: ").append(toIndentedString(goodwillAndOtherIntangibleAssets)).append("\n");
    sb.append("    netPpe: ").append(toIndentedString(netPpe)).append("\n");
    sb.append("    grossPpe: ").append(toIndentedString(grossPpe)).append("\n");
    sb.append("    accumulatedDepreciation: ").append(toIndentedString(accumulatedDepreciation)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    constructionInProgress: ").append(toIndentedString(constructionInProgress)).append("\n");
    sb.append("    otherProperties: ").append(toIndentedString(otherProperties)).append("\n");
    sb.append("    machineryFurnitureEquipment: ").append(toIndentedString(machineryFurnitureEquipment)).append("\n");
    sb.append("    buildingsAndImprovements: ").append(toIndentedString(buildingsAndImprovements)).append("\n");
    sb.append("    landAndImprovements: ").append(toIndentedString(landAndImprovements)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    nonCurrentAccountsReceivable: ").append(toIndentedString(nonCurrentAccountsReceivable)).append("\n");
    sb.append("    nonCurrentNoteReceivables: ").append(toIndentedString(nonCurrentNoteReceivables)).append("\n");
    sb.append("    dueFromRelatedPartiesNonCurrent: ").append(toIndentedString(dueFromRelatedPartiesNonCurrent)).append("\n");
    sb.append("    nonCurrentPrepaidAssets: ").append(toIndentedString(nonCurrentPrepaidAssets)).append("\n");
    sb.append("    nonCurrentDeferredAssets: ").append(toIndentedString(nonCurrentDeferredAssets)).append("\n");
    sb.append("    nonCurrentDeferredTaxesAssets: ").append(toIndentedString(nonCurrentDeferredTaxesAssets)).append("\n");
    sb.append("    definedPensionBenefit: ").append(toIndentedString(definedPensionBenefit)).append("\n");
    sb.append("    otherNonCurrentAssets: ").append(toIndentedString(otherNonCurrentAssets)).append("\n");
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

    // add `total_non_current_assets` to the URL query string
    if (getTotalNonCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_non_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalNonCurrentAssets()))));
    }

    // add `financial_assets` to the URL query string
    if (getFinancialAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinancial_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinancialAssets()))));
    }

    // add `investments_and_advances` to the URL query string
    if (getInvestmentsAndAdvances() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_and_advances%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsAndAdvances()))));
    }

    // add `other_investments` to the URL query string
    if (getOtherInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherInvestments()))));
    }

    // add `investment_in_financial_assets` to the URL query string
    if (getInvestmentInFinancialAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestment_in_financial_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentInFinancialAssets()))));
    }

    // add `held_to_maturity_securities` to the URL query string
    if (getHeldToMaturitySecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheld_to_maturity_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeldToMaturitySecurities()))));
    }

    // add `available_for_sale_securities` to the URL query string
    if (getAvailableForSaleSecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%savailable_for_sale_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvailableForSaleSecurities()))));
    }

    // add `financial_assets_designated_as_fair_value_through_profit_or_loss_total` to the URL query string
    if (getFinancialAssetsDesignatedAsFairValueThroughProfitOrLossTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinancial_assets_designated_as_fair_value_through_profit_or_loss_total%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinancialAssetsDesignatedAsFairValueThroughProfitOrLossTotal()))));
    }

    // add `trading_securities` to the URL query string
    if (getTradingSecurities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strading_securities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTradingSecurities()))));
    }

    // add `long_term_equity_investment` to the URL query string
    if (getLongTermEquityInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_equity_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermEquityInvestment()))));
    }

    // add `investments_in_joint_ventures_at_cost` to the URL query string
    if (getInvestmentsInJointVenturesAtCost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_in_joint_ventures_at_cost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsInJointVenturesAtCost()))));
    }

    // add `investments_in_other_ventures_under_equity_method` to the URL query string
    if (getInvestmentsInOtherVenturesUnderEquityMethod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_in_other_ventures_under_equity_method%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsInOtherVenturesUnderEquityMethod()))));
    }

    // add `investments_in_associates_at_cost` to the URL query string
    if (getInvestmentsInAssociatesAtCost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_in_associates_at_cost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsInAssociatesAtCost()))));
    }

    // add `investments_in_subsidiaries_at_cost` to the URL query string
    if (getInvestmentsInSubsidiariesAtCost() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_in_subsidiaries_at_cost%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsInSubsidiariesAtCost()))));
    }

    // add `investment_properties` to the URL query string
    if (getInvestmentProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestment_properties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentProperties()))));
    }

    // add `goodwill_and_other_intangible_assets` to the URL query string
    if (getGoodwillAndOtherIntangibleAssets() != null) {
      joiner.add(getGoodwillAndOtherIntangibleAssets().toUrlQueryString(prefix + "goodwill_and_other_intangible_assets" + suffix));
    }

    // add `net_ppe` to the URL query string
    if (getNetPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetPpe()))));
    }

    // add `gross_ppe` to the URL query string
    if (getGrossPpe() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_ppe%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossPpe()))));
    }

    // add `accumulated_depreciation` to the URL query string
    if (getAccumulatedDepreciation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccumulated_depreciation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccumulatedDepreciation()))));
    }

    // add `leases` to the URL query string
    if (getLeases() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sleases%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLeases()))));
    }

    // add `construction_in_progress` to the URL query string
    if (getConstructionInProgress() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconstruction_in_progress%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConstructionInProgress()))));
    }

    // add `other_properties` to the URL query string
    if (getOtherProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_properties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherProperties()))));
    }

    // add `machinery_furniture_equipment` to the URL query string
    if (getMachineryFurnitureEquipment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smachinery_furniture_equipment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMachineryFurnitureEquipment()))));
    }

    // add `buildings_and_improvements` to the URL query string
    if (getBuildingsAndImprovements() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbuildings_and_improvements%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBuildingsAndImprovements()))));
    }

    // add `land_and_improvements` to the URL query string
    if (getLandAndImprovements() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sland_and_improvements%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLandAndImprovements()))));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sproperties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProperties()))));
    }

    // add `non_current_accounts_receivable` to the URL query string
    if (getNonCurrentAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_accounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentAccountsReceivable()))));
    }

    // add `non_current_note_receivables` to the URL query string
    if (getNonCurrentNoteReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_note_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentNoteReceivables()))));
    }

    // add `due_from_related_parties_non_current` to the URL query string
    if (getDueFromRelatedPartiesNonCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdue_from_related_parties_non_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDueFromRelatedPartiesNonCurrent()))));
    }

    // add `non_current_prepaid_assets` to the URL query string
    if (getNonCurrentPrepaidAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_prepaid_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentPrepaidAssets()))));
    }

    // add `non_current_deferred_assets` to the URL query string
    if (getNonCurrentDeferredAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_deferred_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentDeferredAssets()))));
    }

    // add `non_current_deferred_taxes_assets` to the URL query string
    if (getNonCurrentDeferredTaxesAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snon_current_deferred_taxes_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonCurrentDeferredTaxesAssets()))));
    }

    // add `defined_pension_benefit` to the URL query string
    if (getDefinedPensionBenefit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefined_pension_benefit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefinedPensionBenefit()))));
    }

    // add `other_non_current_assets` to the URL query string
    if (getOtherNonCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCurrentAssets()))));
    }

    return joiner.toString();
  }
}

