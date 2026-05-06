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
 * Earnings per share information
 */
@JsonPropertyOrder({
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_DILUTED_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_BASIC_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_NORMALIZED_DILUTED_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_NORMALIZED_BASIC_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_REPORTED_NORMALIZED_DILUTED_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_REPORTED_NORMALIZED_BASIC_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_EPS_OTHER_GAINS_LOSSES,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_DILUTED_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_ACCOUNTING_CHANGE,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_EXTRAORDINARY,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_DISCONTINUOUS_OPERATIONS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_CONTINUOUS_OPERATIONS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_EPS_OTHER_GAINS_LOSSES,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_BASIC_EPS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_ACCOUNTING_CHANGE,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_EXTRAORDINARY,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_DISCONTINUOUS_OPERATIONS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_BASIC_CONTINUOUS_OPERATIONS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_DILUTED_NI_AVAIL_TO_COMMON_STOCKHOLDERS,
  IncomeStatementItemEarningsPerShare.JSON_PROPERTY_AVERAGE_DILUTION_EARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemEarningsPerShare {
  public static final String JSON_PROPERTY_DILUTED_EPS = "diluted_eps";
  @javax.annotation.Nullable
  private Double dilutedEps;

  public static final String JSON_PROPERTY_BASIC_EPS = "basic_eps";
  @javax.annotation.Nullable
  private Double basicEps;

  public static final String JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_DILUTED_EPS = "continuing_and_discontinued_diluted_eps";
  @javax.annotation.Nullable
  private Double continuingAndDiscontinuedDilutedEps;

  public static final String JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_BASIC_EPS = "continuing_and_discontinued_basic_eps";
  @javax.annotation.Nullable
  private Double continuingAndDiscontinuedBasicEps;

  public static final String JSON_PROPERTY_NORMALIZED_DILUTED_EPS = "normalized_diluted_eps";
  @javax.annotation.Nullable
  private Double normalizedDilutedEps;

  public static final String JSON_PROPERTY_NORMALIZED_BASIC_EPS = "normalized_basic_eps";
  @javax.annotation.Nullable
  private Double normalizedBasicEps;

  public static final String JSON_PROPERTY_REPORTED_NORMALIZED_DILUTED_EPS = "reported_normalized_diluted_eps";
  @javax.annotation.Nullable
  private Double reportedNormalizedDilutedEps;

  public static final String JSON_PROPERTY_REPORTED_NORMALIZED_BASIC_EPS = "reported_normalized_basic_eps";
  @javax.annotation.Nullable
  private Double reportedNormalizedBasicEps;

  public static final String JSON_PROPERTY_DILUTED_EPS_OTHER_GAINS_LOSSES = "diluted_eps_other_gains_losses";
  @javax.annotation.Nullable
  private Double dilutedEpsOtherGainsLosses;

  public static final String JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_DILUTED_EPS = "tax_loss_carryforward_diluted_eps";
  @javax.annotation.Nullable
  private Double taxLossCarryforwardDilutedEps;

  public static final String JSON_PROPERTY_DILUTED_ACCOUNTING_CHANGE = "diluted_accounting_change";
  @javax.annotation.Nullable
  private Double dilutedAccountingChange;

  public static final String JSON_PROPERTY_DILUTED_EXTRAORDINARY = "diluted_extraordinary";
  @javax.annotation.Nullable
  private Double dilutedExtraordinary;

  public static final String JSON_PROPERTY_DILUTED_DISCONTINUOUS_OPERATIONS = "diluted_discontinuous_operations";
  @javax.annotation.Nullable
  private Double dilutedDiscontinuousOperations;

  public static final String JSON_PROPERTY_DILUTED_CONTINUOUS_OPERATIONS = "diluted_continuous_operations";
  @javax.annotation.Nullable
  private Double dilutedContinuousOperations;

  public static final String JSON_PROPERTY_BASIC_EPS_OTHER_GAINS_LOSSES = "basic_eps_other_gains_losses";
  @javax.annotation.Nullable
  private Double basicEpsOtherGainsLosses;

  public static final String JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_BASIC_EPS = "tax_loss_carryforward_basic_eps";
  @javax.annotation.Nullable
  private Double taxLossCarryforwardBasicEps;

  public static final String JSON_PROPERTY_BASIC_ACCOUNTING_CHANGE = "basic_accounting_change";
  @javax.annotation.Nullable
  private Double basicAccountingChange;

  public static final String JSON_PROPERTY_BASIC_EXTRAORDINARY = "basic_extraordinary";
  @javax.annotation.Nullable
  private Double basicExtraordinary;

  public static final String JSON_PROPERTY_BASIC_DISCONTINUOUS_OPERATIONS = "basic_discontinuous_operations";
  @javax.annotation.Nullable
  private Double basicDiscontinuousOperations;

  public static final String JSON_PROPERTY_BASIC_CONTINUOUS_OPERATIONS = "basic_continuous_operations";
  @javax.annotation.Nullable
  private Double basicContinuousOperations;

  public static final String JSON_PROPERTY_DILUTED_NI_AVAIL_TO_COMMON_STOCKHOLDERS = "diluted_ni_avail_to_common_stockholders";
  @javax.annotation.Nullable
  private Double dilutedNiAvailToCommonStockholders;

  public static final String JSON_PROPERTY_AVERAGE_DILUTION_EARNINGS = "average_dilution_earnings";
  @javax.annotation.Nullable
  private Double averageDilutionEarnings;

  public IncomeStatementItemEarningsPerShare() { 
  }

  public IncomeStatementItemEarningsPerShare dilutedEps(@javax.annotation.Nullable Double dilutedEps) {
    this.dilutedEps = dilutedEps;
    return this;
  }

  /**
   * Diluted EPS
   * @return dilutedEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedEps() {
    return dilutedEps;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedEps(@javax.annotation.Nullable Double dilutedEps) {
    this.dilutedEps = dilutedEps;
  }


  public IncomeStatementItemEarningsPerShare basicEps(@javax.annotation.Nullable Double basicEps) {
    this.basicEps = basicEps;
    return this;
  }

  /**
   * Basic EPS
   * @return basicEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicEps() {
    return basicEps;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicEps(@javax.annotation.Nullable Double basicEps) {
    this.basicEps = basicEps;
  }


  public IncomeStatementItemEarningsPerShare continuingAndDiscontinuedDilutedEps(@javax.annotation.Nullable Double continuingAndDiscontinuedDilutedEps) {
    this.continuingAndDiscontinuedDilutedEps = continuingAndDiscontinuedDilutedEps;
    return this;
  }

  /**
   * Continuing and discontinued diluted EPS
   * @return continuingAndDiscontinuedDilutedEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContinuingAndDiscontinuedDilutedEps() {
    return continuingAndDiscontinuedDilutedEps;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContinuingAndDiscontinuedDilutedEps(@javax.annotation.Nullable Double continuingAndDiscontinuedDilutedEps) {
    this.continuingAndDiscontinuedDilutedEps = continuingAndDiscontinuedDilutedEps;
  }


  public IncomeStatementItemEarningsPerShare continuingAndDiscontinuedBasicEps(@javax.annotation.Nullable Double continuingAndDiscontinuedBasicEps) {
    this.continuingAndDiscontinuedBasicEps = continuingAndDiscontinuedBasicEps;
    return this;
  }

  /**
   * Continuing and discontinued basic EPS
   * @return continuingAndDiscontinuedBasicEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getContinuingAndDiscontinuedBasicEps() {
    return continuingAndDiscontinuedBasicEps;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTINUING_AND_DISCONTINUED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContinuingAndDiscontinuedBasicEps(@javax.annotation.Nullable Double continuingAndDiscontinuedBasicEps) {
    this.continuingAndDiscontinuedBasicEps = continuingAndDiscontinuedBasicEps;
  }


  public IncomeStatementItemEarningsPerShare normalizedDilutedEps(@javax.annotation.Nullable Double normalizedDilutedEps) {
    this.normalizedDilutedEps = normalizedDilutedEps;
    return this;
  }

  /**
   * Normalized diluted EPS
   * @return normalizedDilutedEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNormalizedDilutedEps() {
    return normalizedDilutedEps;
  }


  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedDilutedEps(@javax.annotation.Nullable Double normalizedDilutedEps) {
    this.normalizedDilutedEps = normalizedDilutedEps;
  }


  public IncomeStatementItemEarningsPerShare normalizedBasicEps(@javax.annotation.Nullable Double normalizedBasicEps) {
    this.normalizedBasicEps = normalizedBasicEps;
    return this;
  }

  /**
   * Normalized basic EPS
   * @return normalizedBasicEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNormalizedBasicEps() {
    return normalizedBasicEps;
  }


  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedBasicEps(@javax.annotation.Nullable Double normalizedBasicEps) {
    this.normalizedBasicEps = normalizedBasicEps;
  }


  public IncomeStatementItemEarningsPerShare reportedNormalizedDilutedEps(@javax.annotation.Nullable Double reportedNormalizedDilutedEps) {
    this.reportedNormalizedDilutedEps = reportedNormalizedDilutedEps;
    return this;
  }

  /**
   * Reported normalized diluted EPS
   * @return reportedNormalizedDilutedEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORTED_NORMALIZED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReportedNormalizedDilutedEps() {
    return reportedNormalizedDilutedEps;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORTED_NORMALIZED_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedNormalizedDilutedEps(@javax.annotation.Nullable Double reportedNormalizedDilutedEps) {
    this.reportedNormalizedDilutedEps = reportedNormalizedDilutedEps;
  }


  public IncomeStatementItemEarningsPerShare reportedNormalizedBasicEps(@javax.annotation.Nullable Double reportedNormalizedBasicEps) {
    this.reportedNormalizedBasicEps = reportedNormalizedBasicEps;
    return this;
  }

  /**
   * Reported normalized basic EPS
   * @return reportedNormalizedBasicEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORTED_NORMALIZED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReportedNormalizedBasicEps() {
    return reportedNormalizedBasicEps;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORTED_NORMALIZED_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedNormalizedBasicEps(@javax.annotation.Nullable Double reportedNormalizedBasicEps) {
    this.reportedNormalizedBasicEps = reportedNormalizedBasicEps;
  }


  public IncomeStatementItemEarningsPerShare dilutedEpsOtherGainsLosses(@javax.annotation.Nullable Double dilutedEpsOtherGainsLosses) {
    this.dilutedEpsOtherGainsLosses = dilutedEpsOtherGainsLosses;
    return this;
  }

  /**
   * Diluted EPS other gains losses
   * @return dilutedEpsOtherGainsLosses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS_OTHER_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedEpsOtherGainsLosses() {
    return dilutedEpsOtherGainsLosses;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_EPS_OTHER_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedEpsOtherGainsLosses(@javax.annotation.Nullable Double dilutedEpsOtherGainsLosses) {
    this.dilutedEpsOtherGainsLosses = dilutedEpsOtherGainsLosses;
  }


  public IncomeStatementItemEarningsPerShare taxLossCarryforwardDilutedEps(@javax.annotation.Nullable Double taxLossCarryforwardDilutedEps) {
    this.taxLossCarryforwardDilutedEps = taxLossCarryforwardDilutedEps;
    return this;
  }

  /**
   * Tax loss carryforward diluted EPS
   * @return taxLossCarryforwardDilutedEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxLossCarryforwardDilutedEps() {
    return taxLossCarryforwardDilutedEps;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_DILUTED_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxLossCarryforwardDilutedEps(@javax.annotation.Nullable Double taxLossCarryforwardDilutedEps) {
    this.taxLossCarryforwardDilutedEps = taxLossCarryforwardDilutedEps;
  }


  public IncomeStatementItemEarningsPerShare dilutedAccountingChange(@javax.annotation.Nullable Double dilutedAccountingChange) {
    this.dilutedAccountingChange = dilutedAccountingChange;
    return this;
  }

  /**
   * Diluted accounting change
   * @return dilutedAccountingChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_ACCOUNTING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedAccountingChange() {
    return dilutedAccountingChange;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_ACCOUNTING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedAccountingChange(@javax.annotation.Nullable Double dilutedAccountingChange) {
    this.dilutedAccountingChange = dilutedAccountingChange;
  }


  public IncomeStatementItemEarningsPerShare dilutedExtraordinary(@javax.annotation.Nullable Double dilutedExtraordinary) {
    this.dilutedExtraordinary = dilutedExtraordinary;
    return this;
  }

  /**
   * Diluted extraordinary
   * @return dilutedExtraordinary
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedExtraordinary() {
    return dilutedExtraordinary;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedExtraordinary(@javax.annotation.Nullable Double dilutedExtraordinary) {
    this.dilutedExtraordinary = dilutedExtraordinary;
  }


  public IncomeStatementItemEarningsPerShare dilutedDiscontinuousOperations(@javax.annotation.Nullable Double dilutedDiscontinuousOperations) {
    this.dilutedDiscontinuousOperations = dilutedDiscontinuousOperations;
    return this;
  }

  /**
   * Diluted discontinuous operations
   * @return dilutedDiscontinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedDiscontinuousOperations() {
    return dilutedDiscontinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedDiscontinuousOperations(@javax.annotation.Nullable Double dilutedDiscontinuousOperations) {
    this.dilutedDiscontinuousOperations = dilutedDiscontinuousOperations;
  }


  public IncomeStatementItemEarningsPerShare dilutedContinuousOperations(@javax.annotation.Nullable Double dilutedContinuousOperations) {
    this.dilutedContinuousOperations = dilutedContinuousOperations;
    return this;
  }

  /**
   * Diluted continuous operations
   * @return dilutedContinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedContinuousOperations() {
    return dilutedContinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedContinuousOperations(@javax.annotation.Nullable Double dilutedContinuousOperations) {
    this.dilutedContinuousOperations = dilutedContinuousOperations;
  }


  public IncomeStatementItemEarningsPerShare basicEpsOtherGainsLosses(@javax.annotation.Nullable Double basicEpsOtherGainsLosses) {
    this.basicEpsOtherGainsLosses = basicEpsOtherGainsLosses;
    return this;
  }

  /**
   * Basic EPS other gains losses
   * @return basicEpsOtherGainsLosses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_EPS_OTHER_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicEpsOtherGainsLosses() {
    return basicEpsOtherGainsLosses;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_EPS_OTHER_GAINS_LOSSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicEpsOtherGainsLosses(@javax.annotation.Nullable Double basicEpsOtherGainsLosses) {
    this.basicEpsOtherGainsLosses = basicEpsOtherGainsLosses;
  }


  public IncomeStatementItemEarningsPerShare taxLossCarryforwardBasicEps(@javax.annotation.Nullable Double taxLossCarryforwardBasicEps) {
    this.taxLossCarryforwardBasicEps = taxLossCarryforwardBasicEps;
    return this;
  }

  /**
   * Tax loss carryforward basic EPS
   * @return taxLossCarryforwardBasicEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxLossCarryforwardBasicEps() {
    return taxLossCarryforwardBasicEps;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_LOSS_CARRYFORWARD_BASIC_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxLossCarryforwardBasicEps(@javax.annotation.Nullable Double taxLossCarryforwardBasicEps) {
    this.taxLossCarryforwardBasicEps = taxLossCarryforwardBasicEps;
  }


  public IncomeStatementItemEarningsPerShare basicAccountingChange(@javax.annotation.Nullable Double basicAccountingChange) {
    this.basicAccountingChange = basicAccountingChange;
    return this;
  }

  /**
   * Basic accounting change
   * @return basicAccountingChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_ACCOUNTING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicAccountingChange() {
    return basicAccountingChange;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_ACCOUNTING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicAccountingChange(@javax.annotation.Nullable Double basicAccountingChange) {
    this.basicAccountingChange = basicAccountingChange;
  }


  public IncomeStatementItemEarningsPerShare basicExtraordinary(@javax.annotation.Nullable Double basicExtraordinary) {
    this.basicExtraordinary = basicExtraordinary;
    return this;
  }

  /**
   * Basic extraordinary
   * @return basicExtraordinary
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicExtraordinary() {
    return basicExtraordinary;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicExtraordinary(@javax.annotation.Nullable Double basicExtraordinary) {
    this.basicExtraordinary = basicExtraordinary;
  }


  public IncomeStatementItemEarningsPerShare basicDiscontinuousOperations(@javax.annotation.Nullable Double basicDiscontinuousOperations) {
    this.basicDiscontinuousOperations = basicDiscontinuousOperations;
    return this;
  }

  /**
   * Basic discontinuous operations
   * @return basicDiscontinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicDiscontinuousOperations() {
    return basicDiscontinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicDiscontinuousOperations(@javax.annotation.Nullable Double basicDiscontinuousOperations) {
    this.basicDiscontinuousOperations = basicDiscontinuousOperations;
  }


  public IncomeStatementItemEarningsPerShare basicContinuousOperations(@javax.annotation.Nullable Double basicContinuousOperations) {
    this.basicContinuousOperations = basicContinuousOperations;
    return this;
  }

  /**
   * Basic continuous operations
   * @return basicContinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicContinuousOperations() {
    return basicContinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicContinuousOperations(@javax.annotation.Nullable Double basicContinuousOperations) {
    this.basicContinuousOperations = basicContinuousOperations;
  }


  public IncomeStatementItemEarningsPerShare dilutedNiAvailToCommonStockholders(@javax.annotation.Nullable Double dilutedNiAvailToCommonStockholders) {
    this.dilutedNiAvailToCommonStockholders = dilutedNiAvailToCommonStockholders;
    return this;
  }

  /**
   * Diluted NI available to common stockholders
   * @return dilutedNiAvailToCommonStockholders
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_NI_AVAIL_TO_COMMON_STOCKHOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedNiAvailToCommonStockholders() {
    return dilutedNiAvailToCommonStockholders;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_NI_AVAIL_TO_COMMON_STOCKHOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedNiAvailToCommonStockholders(@javax.annotation.Nullable Double dilutedNiAvailToCommonStockholders) {
    this.dilutedNiAvailToCommonStockholders = dilutedNiAvailToCommonStockholders;
  }


  public IncomeStatementItemEarningsPerShare averageDilutionEarnings(@javax.annotation.Nullable Double averageDilutionEarnings) {
    this.averageDilutionEarnings = averageDilutionEarnings;
    return this;
  }

  /**
   * Average dilution earnings
   * @return averageDilutionEarnings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVERAGE_DILUTION_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAverageDilutionEarnings() {
    return averageDilutionEarnings;
  }


  @JsonProperty(value = JSON_PROPERTY_AVERAGE_DILUTION_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageDilutionEarnings(@javax.annotation.Nullable Double averageDilutionEarnings) {
    this.averageDilutionEarnings = averageDilutionEarnings;
  }


  /**
   * Return true if this IncomeStatementItem_earnings_per_share object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemEarningsPerShare incomeStatementItemEarningsPerShare = (IncomeStatementItemEarningsPerShare) o;
    return Objects.equals(this.dilutedEps, incomeStatementItemEarningsPerShare.dilutedEps) &&
        Objects.equals(this.basicEps, incomeStatementItemEarningsPerShare.basicEps) &&
        Objects.equals(this.continuingAndDiscontinuedDilutedEps, incomeStatementItemEarningsPerShare.continuingAndDiscontinuedDilutedEps) &&
        Objects.equals(this.continuingAndDiscontinuedBasicEps, incomeStatementItemEarningsPerShare.continuingAndDiscontinuedBasicEps) &&
        Objects.equals(this.normalizedDilutedEps, incomeStatementItemEarningsPerShare.normalizedDilutedEps) &&
        Objects.equals(this.normalizedBasicEps, incomeStatementItemEarningsPerShare.normalizedBasicEps) &&
        Objects.equals(this.reportedNormalizedDilutedEps, incomeStatementItemEarningsPerShare.reportedNormalizedDilutedEps) &&
        Objects.equals(this.reportedNormalizedBasicEps, incomeStatementItemEarningsPerShare.reportedNormalizedBasicEps) &&
        Objects.equals(this.dilutedEpsOtherGainsLosses, incomeStatementItemEarningsPerShare.dilutedEpsOtherGainsLosses) &&
        Objects.equals(this.taxLossCarryforwardDilutedEps, incomeStatementItemEarningsPerShare.taxLossCarryforwardDilutedEps) &&
        Objects.equals(this.dilutedAccountingChange, incomeStatementItemEarningsPerShare.dilutedAccountingChange) &&
        Objects.equals(this.dilutedExtraordinary, incomeStatementItemEarningsPerShare.dilutedExtraordinary) &&
        Objects.equals(this.dilutedDiscontinuousOperations, incomeStatementItemEarningsPerShare.dilutedDiscontinuousOperations) &&
        Objects.equals(this.dilutedContinuousOperations, incomeStatementItemEarningsPerShare.dilutedContinuousOperations) &&
        Objects.equals(this.basicEpsOtherGainsLosses, incomeStatementItemEarningsPerShare.basicEpsOtherGainsLosses) &&
        Objects.equals(this.taxLossCarryforwardBasicEps, incomeStatementItemEarningsPerShare.taxLossCarryforwardBasicEps) &&
        Objects.equals(this.basicAccountingChange, incomeStatementItemEarningsPerShare.basicAccountingChange) &&
        Objects.equals(this.basicExtraordinary, incomeStatementItemEarningsPerShare.basicExtraordinary) &&
        Objects.equals(this.basicDiscontinuousOperations, incomeStatementItemEarningsPerShare.basicDiscontinuousOperations) &&
        Objects.equals(this.basicContinuousOperations, incomeStatementItemEarningsPerShare.basicContinuousOperations) &&
        Objects.equals(this.dilutedNiAvailToCommonStockholders, incomeStatementItemEarningsPerShare.dilutedNiAvailToCommonStockholders) &&
        Objects.equals(this.averageDilutionEarnings, incomeStatementItemEarningsPerShare.averageDilutionEarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dilutedEps, basicEps, continuingAndDiscontinuedDilutedEps, continuingAndDiscontinuedBasicEps, normalizedDilutedEps, normalizedBasicEps, reportedNormalizedDilutedEps, reportedNormalizedBasicEps, dilutedEpsOtherGainsLosses, taxLossCarryforwardDilutedEps, dilutedAccountingChange, dilutedExtraordinary, dilutedDiscontinuousOperations, dilutedContinuousOperations, basicEpsOtherGainsLosses, taxLossCarryforwardBasicEps, basicAccountingChange, basicExtraordinary, basicDiscontinuousOperations, basicContinuousOperations, dilutedNiAvailToCommonStockholders, averageDilutionEarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemEarningsPerShare {\n");
    sb.append("    dilutedEps: ").append(toIndentedString(dilutedEps)).append("\n");
    sb.append("    basicEps: ").append(toIndentedString(basicEps)).append("\n");
    sb.append("    continuingAndDiscontinuedDilutedEps: ").append(toIndentedString(continuingAndDiscontinuedDilutedEps)).append("\n");
    sb.append("    continuingAndDiscontinuedBasicEps: ").append(toIndentedString(continuingAndDiscontinuedBasicEps)).append("\n");
    sb.append("    normalizedDilutedEps: ").append(toIndentedString(normalizedDilutedEps)).append("\n");
    sb.append("    normalizedBasicEps: ").append(toIndentedString(normalizedBasicEps)).append("\n");
    sb.append("    reportedNormalizedDilutedEps: ").append(toIndentedString(reportedNormalizedDilutedEps)).append("\n");
    sb.append("    reportedNormalizedBasicEps: ").append(toIndentedString(reportedNormalizedBasicEps)).append("\n");
    sb.append("    dilutedEpsOtherGainsLosses: ").append(toIndentedString(dilutedEpsOtherGainsLosses)).append("\n");
    sb.append("    taxLossCarryforwardDilutedEps: ").append(toIndentedString(taxLossCarryforwardDilutedEps)).append("\n");
    sb.append("    dilutedAccountingChange: ").append(toIndentedString(dilutedAccountingChange)).append("\n");
    sb.append("    dilutedExtraordinary: ").append(toIndentedString(dilutedExtraordinary)).append("\n");
    sb.append("    dilutedDiscontinuousOperations: ").append(toIndentedString(dilutedDiscontinuousOperations)).append("\n");
    sb.append("    dilutedContinuousOperations: ").append(toIndentedString(dilutedContinuousOperations)).append("\n");
    sb.append("    basicEpsOtherGainsLosses: ").append(toIndentedString(basicEpsOtherGainsLosses)).append("\n");
    sb.append("    taxLossCarryforwardBasicEps: ").append(toIndentedString(taxLossCarryforwardBasicEps)).append("\n");
    sb.append("    basicAccountingChange: ").append(toIndentedString(basicAccountingChange)).append("\n");
    sb.append("    basicExtraordinary: ").append(toIndentedString(basicExtraordinary)).append("\n");
    sb.append("    basicDiscontinuousOperations: ").append(toIndentedString(basicDiscontinuousOperations)).append("\n");
    sb.append("    basicContinuousOperations: ").append(toIndentedString(basicContinuousOperations)).append("\n");
    sb.append("    dilutedNiAvailToCommonStockholders: ").append(toIndentedString(dilutedNiAvailToCommonStockholders)).append("\n");
    sb.append("    averageDilutionEarnings: ").append(toIndentedString(averageDilutionEarnings)).append("\n");
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

    // add `diluted_eps` to the URL query string
    if (getDilutedEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedEps()))));
    }

    // add `basic_eps` to the URL query string
    if (getBasicEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicEps()))));
    }

    // add `continuing_and_discontinued_diluted_eps` to the URL query string
    if (getContinuingAndDiscontinuedDilutedEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontinuing_and_discontinued_diluted_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContinuingAndDiscontinuedDilutedEps()))));
    }

    // add `continuing_and_discontinued_basic_eps` to the URL query string
    if (getContinuingAndDiscontinuedBasicEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontinuing_and_discontinued_basic_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContinuingAndDiscontinuedBasicEps()))));
    }

    // add `normalized_diluted_eps` to the URL query string
    if (getNormalizedDilutedEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snormalized_diluted_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNormalizedDilutedEps()))));
    }

    // add `normalized_basic_eps` to the URL query string
    if (getNormalizedBasicEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snormalized_basic_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNormalizedBasicEps()))));
    }

    // add `reported_normalized_diluted_eps` to the URL query string
    if (getReportedNormalizedDilutedEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreported_normalized_diluted_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReportedNormalizedDilutedEps()))));
    }

    // add `reported_normalized_basic_eps` to the URL query string
    if (getReportedNormalizedBasicEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreported_normalized_basic_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReportedNormalizedBasicEps()))));
    }

    // add `diluted_eps_other_gains_losses` to the URL query string
    if (getDilutedEpsOtherGainsLosses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_eps_other_gains_losses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedEpsOtherGainsLosses()))));
    }

    // add `tax_loss_carryforward_diluted_eps` to the URL query string
    if (getTaxLossCarryforwardDilutedEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_loss_carryforward_diluted_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxLossCarryforwardDilutedEps()))));
    }

    // add `diluted_accounting_change` to the URL query string
    if (getDilutedAccountingChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_accounting_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedAccountingChange()))));
    }

    // add `diluted_extraordinary` to the URL query string
    if (getDilutedExtraordinary() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_extraordinary%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedExtraordinary()))));
    }

    // add `diluted_discontinuous_operations` to the URL query string
    if (getDilutedDiscontinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_discontinuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedDiscontinuousOperations()))));
    }

    // add `diluted_continuous_operations` to the URL query string
    if (getDilutedContinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_continuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedContinuousOperations()))));
    }

    // add `basic_eps_other_gains_losses` to the URL query string
    if (getBasicEpsOtherGainsLosses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_eps_other_gains_losses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicEpsOtherGainsLosses()))));
    }

    // add `tax_loss_carryforward_basic_eps` to the URL query string
    if (getTaxLossCarryforwardBasicEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_loss_carryforward_basic_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxLossCarryforwardBasicEps()))));
    }

    // add `basic_accounting_change` to the URL query string
    if (getBasicAccountingChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_accounting_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicAccountingChange()))));
    }

    // add `basic_extraordinary` to the URL query string
    if (getBasicExtraordinary() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_extraordinary%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicExtraordinary()))));
    }

    // add `basic_discontinuous_operations` to the URL query string
    if (getBasicDiscontinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_discontinuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicDiscontinuousOperations()))));
    }

    // add `basic_continuous_operations` to the URL query string
    if (getBasicContinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_continuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicContinuousOperations()))));
    }

    // add `diluted_ni_avail_to_common_stockholders` to the URL query string
    if (getDilutedNiAvailToCommonStockholders() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_ni_avail_to_common_stockholders%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedNiAvailToCommonStockholders()))));
    }

    // add `average_dilution_earnings` to the URL query string
    if (getAverageDilutionEarnings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saverage_dilution_earnings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAverageDilutionEarnings()))));
    }

    return joiner.toString();
  }
}

