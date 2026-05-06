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
 * Investing activities section
 */
@JsonPropertyOrder({
  CashFlowStructInvestingActivities.JSON_PROPERTY_CAPITAL_EXPENDITURES,
  CashFlowStructInvestingActivities.JSON_PROPERTY_NET_INTANGIBLES,
  CashFlowStructInvestingActivities.JSON_PROPERTY_NET_ACQUISITIONS,
  CashFlowStructInvestingActivities.JSON_PROPERTY_PURCHASE_OF_INVESTMENTS,
  CashFlowStructInvestingActivities.JSON_PROPERTY_SALE_OF_INVESTMENTS,
  CashFlowStructInvestingActivities.JSON_PROPERTY_OTHER_INVESTING_ACTIVITY,
  CashFlowStructInvestingActivities.JSON_PROPERTY_INVESTING_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowStructInvestingActivities {
  public static final String JSON_PROPERTY_CAPITAL_EXPENDITURES = "capital_expenditures";
  @javax.annotation.Nullable
  private Double capitalExpenditures;

  public static final String JSON_PROPERTY_NET_INTANGIBLES = "net_intangibles";
  @javax.annotation.Nullable
  private Double netIntangibles;

  public static final String JSON_PROPERTY_NET_ACQUISITIONS = "net_acquisitions";
  @javax.annotation.Nullable
  private Double netAcquisitions;

  public static final String JSON_PROPERTY_PURCHASE_OF_INVESTMENTS = "purchase_of_investments";
  @javax.annotation.Nullable
  private Double purchaseOfInvestments;

  public static final String JSON_PROPERTY_SALE_OF_INVESTMENTS = "sale_of_investments";
  @javax.annotation.Nullable
  private Double saleOfInvestments;

  public static final String JSON_PROPERTY_OTHER_INVESTING_ACTIVITY = "other_investing_activity";
  @javax.annotation.Nullable
  private Double otherInvestingActivity;

  public static final String JSON_PROPERTY_INVESTING_CASH_FLOW = "investing_cash_flow";
  @javax.annotation.Nullable
  private Double investingCashFlow;

  public CashFlowStructInvestingActivities() { 
  }

  public CashFlowStructInvestingActivities capitalExpenditures(@javax.annotation.Nullable Double capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
    return this;
  }

  /**
   * Capital expenditures (CapEx) are funds used by a company to acquire, upgrade, and maintain physical assets (PPE)
   * @return capitalExpenditures
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCapitalExpenditures() {
    return capitalExpenditures;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_EXPENDITURES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalExpenditures(@javax.annotation.Nullable Double capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
  }


  public CashFlowStructInvestingActivities netIntangibles(@javax.annotation.Nullable Double netIntangibles) {
    this.netIntangibles = netIntangibles;
    return this;
  }

  /**
   * Represents purchase of a not physical asset
   * @return netIntangibles
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIntangibles() {
    return netIntangibles;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIntangibles(@javax.annotation.Nullable Double netIntangibles) {
    this.netIntangibles = netIntangibles;
  }


  public CashFlowStructInvestingActivities netAcquisitions(@javax.annotation.Nullable Double netAcquisitions) {
    this.netAcquisitions = netAcquisitions;
    return this;
  }

  /**
   * Refers to net amount of business purchase and sale
   * @return netAcquisitions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_ACQUISITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetAcquisitions() {
    return netAcquisitions;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_ACQUISITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetAcquisitions(@javax.annotation.Nullable Double netAcquisitions) {
    this.netAcquisitions = netAcquisitions;
  }


  public CashFlowStructInvestingActivities purchaseOfInvestments(@javax.annotation.Nullable Double purchaseOfInvestments) {
    this.purchaseOfInvestments = purchaseOfInvestments;
    return this;
  }

  /**
   * Represents how much money has been used in making investments, including purchases of physical assets, investments in securities
   * @return purchaseOfInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPurchaseOfInvestments() {
    return purchaseOfInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_OF_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseOfInvestments(@javax.annotation.Nullable Double purchaseOfInvestments) {
    this.purchaseOfInvestments = purchaseOfInvestments;
  }


  public CashFlowStructInvestingActivities saleOfInvestments(@javax.annotation.Nullable Double saleOfInvestments) {
    this.saleOfInvestments = saleOfInvestments;
    return this;
  }

  /**
   * Represents how much money has been generated from the sale of securities or assets
   * @return saleOfInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSaleOfInvestments() {
    return saleOfInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_SALE_OF_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaleOfInvestments(@javax.annotation.Nullable Double saleOfInvestments) {
    this.saleOfInvestments = saleOfInvestments;
  }


  public CashFlowStructInvestingActivities otherInvestingActivity(@javax.annotation.Nullable Double otherInvestingActivity) {
    this.otherInvestingActivity = otherInvestingActivity;
    return this;
  }

  /**
   * Represents other investing activity
   * @return otherInvestingActivity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INVESTING_ACTIVITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherInvestingActivity() {
    return otherInvestingActivity;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INVESTING_ACTIVITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherInvestingActivity(@javax.annotation.Nullable Double otherInvestingActivity) {
    this.otherInvestingActivity = otherInvestingActivity;
  }


  public CashFlowStructInvestingActivities investingCashFlow(@javax.annotation.Nullable Double investingCashFlow) {
    this.investingCashFlow = investingCashFlow;
    return this;
  }

  /**
   * Returns total amount of cash flow used in investments
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


  /**
   * Return true if this CashFlowStruct_investing_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowStructInvestingActivities cashFlowStructInvestingActivities = (CashFlowStructInvestingActivities) o;
    return Objects.equals(this.capitalExpenditures, cashFlowStructInvestingActivities.capitalExpenditures) &&
        Objects.equals(this.netIntangibles, cashFlowStructInvestingActivities.netIntangibles) &&
        Objects.equals(this.netAcquisitions, cashFlowStructInvestingActivities.netAcquisitions) &&
        Objects.equals(this.purchaseOfInvestments, cashFlowStructInvestingActivities.purchaseOfInvestments) &&
        Objects.equals(this.saleOfInvestments, cashFlowStructInvestingActivities.saleOfInvestments) &&
        Objects.equals(this.otherInvestingActivity, cashFlowStructInvestingActivities.otherInvestingActivity) &&
        Objects.equals(this.investingCashFlow, cashFlowStructInvestingActivities.investingCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalExpenditures, netIntangibles, netAcquisitions, purchaseOfInvestments, saleOfInvestments, otherInvestingActivity, investingCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowStructInvestingActivities {\n");
    sb.append("    capitalExpenditures: ").append(toIndentedString(capitalExpenditures)).append("\n");
    sb.append("    netIntangibles: ").append(toIndentedString(netIntangibles)).append("\n");
    sb.append("    netAcquisitions: ").append(toIndentedString(netAcquisitions)).append("\n");
    sb.append("    purchaseOfInvestments: ").append(toIndentedString(purchaseOfInvestments)).append("\n");
    sb.append("    saleOfInvestments: ").append(toIndentedString(saleOfInvestments)).append("\n");
    sb.append("    otherInvestingActivity: ").append(toIndentedString(otherInvestingActivity)).append("\n");
    sb.append("    investingCashFlow: ").append(toIndentedString(investingCashFlow)).append("\n");
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

    // add `capital_expenditures` to the URL query string
    if (getCapitalExpenditures() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital_expenditures%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapitalExpenditures()))));
    }

    // add `net_intangibles` to the URL query string
    if (getNetIntangibles() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_intangibles%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIntangibles()))));
    }

    // add `net_acquisitions` to the URL query string
    if (getNetAcquisitions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_acquisitions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetAcquisitions()))));
    }

    // add `purchase_of_investments` to the URL query string
    if (getPurchaseOfInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spurchase_of_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPurchaseOfInvestments()))));
    }

    // add `sale_of_investments` to the URL query string
    if (getSaleOfInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssale_of_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaleOfInvestments()))));
    }

    // add `other_investing_activity` to the URL query string
    if (getOtherInvestingActivity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_investing_activity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherInvestingActivity()))));
    }

    // add `investing_cash_flow` to the URL query string
    if (getInvestingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvesting_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestingCashFlow()))));
    }

    return joiner.toString();
  }
}

