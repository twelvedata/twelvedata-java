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
 * Financing activities section
 */
@JsonPropertyOrder({
  CashFlowStructFinancingActivities.JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE,
  CashFlowStructFinancingActivities.JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS,
  CashFlowStructFinancingActivities.JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE,
  CashFlowStructFinancingActivities.JSON_PROPERTY_COMMON_STOCK_ISSUANCE,
  CashFlowStructFinancingActivities.JSON_PROPERTY_COMMON_STOCK_REPURCHASE,
  CashFlowStructFinancingActivities.JSON_PROPERTY_COMMON_DIVIDENDS,
  CashFlowStructFinancingActivities.JSON_PROPERTY_OTHER_FINANCING_CHARGES,
  CashFlowStructFinancingActivities.JSON_PROPERTY_FINANCING_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowStructFinancingActivities {
  public static final String JSON_PROPERTY_LONG_TERM_DEBT_ISSUANCE = "long_term_debt_issuance";
  @javax.annotation.Nullable
  private Double longTermDebtIssuance;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT_PAYMENTS = "long_term_debt_payments";
  @javax.annotation.Nullable
  private Double longTermDebtPayments;

  public static final String JSON_PROPERTY_SHORT_TERM_DEBT_ISSUANCE = "short_term_debt_issuance";
  @javax.annotation.Nullable
  private Double shortTermDebtIssuance;

  public static final String JSON_PROPERTY_COMMON_STOCK_ISSUANCE = "common_stock_issuance";
  @javax.annotation.Nullable
  private Double commonStockIssuance;

  public static final String JSON_PROPERTY_COMMON_STOCK_REPURCHASE = "common_stock_repurchase";
  @javax.annotation.Nullable
  private Double commonStockRepurchase;

  public static final String JSON_PROPERTY_COMMON_DIVIDENDS = "common_dividends";
  @javax.annotation.Nullable
  private Double commonDividends;

  public static final String JSON_PROPERTY_OTHER_FINANCING_CHARGES = "other_financing_charges";
  @javax.annotation.Nullable
  private Double otherFinancingCharges;

  public static final String JSON_PROPERTY_FINANCING_CASH_FLOW = "financing_cash_flow";
  @javax.annotation.Nullable
  private Double financingCashFlow;

  public CashFlowStructFinancingActivities() { 
  }

  public CashFlowStructFinancingActivities longTermDebtIssuance(@javax.annotation.Nullable Double longTermDebtIssuance) {
    this.longTermDebtIssuance = longTermDebtIssuance;
    return this;
  }

  /**
   * Refers to the issuance of any financial obligations that extend beyond a 12 months period
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


  public CashFlowStructFinancingActivities longTermDebtPayments(@javax.annotation.Nullable Double longTermDebtPayments) {
    this.longTermDebtPayments = longTermDebtPayments;
    return this;
  }

  /**
   * Refers to the payments of any financial obligations that extend beyond a 12 months period
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


  public CashFlowStructFinancingActivities shortTermDebtIssuance(@javax.annotation.Nullable Double shortTermDebtIssuance) {
    this.shortTermDebtIssuance = shortTermDebtIssuance;
    return this;
  }

  /**
   * Refers to the issuance of any financial obligations that are expected to be paid off within a year
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


  public CashFlowStructFinancingActivities commonStockIssuance(@javax.annotation.Nullable Double commonStockIssuance) {
    this.commonStockIssuance = commonStockIssuance;
    return this;
  }

  /**
   * Represents a transaction whereby a company issues its own shares to the marketplace
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


  public CashFlowStructFinancingActivities commonStockRepurchase(@javax.annotation.Nullable Double commonStockRepurchase) {
    this.commonStockRepurchase = commonStockRepurchase;
    return this;
  }

  /**
   * Represents a transaction whereby a company buys back its own shares from the marketplace
   * @return commonStockRepurchase
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_REPURCHASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStockRepurchase() {
    return commonStockRepurchase;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_REPURCHASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStockRepurchase(@javax.annotation.Nullable Double commonStockRepurchase) {
    this.commonStockRepurchase = commonStockRepurchase;
  }


  public CashFlowStructFinancingActivities commonDividends(@javax.annotation.Nullable Double commonDividends) {
    this.commonDividends = commonDividends;
    return this;
  }

  /**
   * Returns value of payment doled out by a company to its stockholders in the form of periodic distributions of cash
   * @return commonDividends
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonDividends() {
    return commonDividends;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonDividends(@javax.annotation.Nullable Double commonDividends) {
    this.commonDividends = commonDividends;
  }


  public CashFlowStructFinancingActivities otherFinancingCharges(@javax.annotation.Nullable Double otherFinancingCharges) {
    this.otherFinancingCharges = otherFinancingCharges;
    return this;
  }

  /**
   * Represents other financing charges
   * @return otherFinancingCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_FINANCING_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherFinancingCharges() {
    return otherFinancingCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_FINANCING_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherFinancingCharges(@javax.annotation.Nullable Double otherFinancingCharges) {
    this.otherFinancingCharges = otherFinancingCharges;
  }


  public CashFlowStructFinancingActivities financingCashFlow(@javax.annotation.Nullable Double financingCashFlow) {
    this.financingCashFlow = financingCashFlow;
    return this;
  }

  /**
   * Returns cash flow from financing activities (CFF), which shows the net flows of cash that are used to fund the company
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


  /**
   * Return true if this CashFlowStruct_financing_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowStructFinancingActivities cashFlowStructFinancingActivities = (CashFlowStructFinancingActivities) o;
    return Objects.equals(this.longTermDebtIssuance, cashFlowStructFinancingActivities.longTermDebtIssuance) &&
        Objects.equals(this.longTermDebtPayments, cashFlowStructFinancingActivities.longTermDebtPayments) &&
        Objects.equals(this.shortTermDebtIssuance, cashFlowStructFinancingActivities.shortTermDebtIssuance) &&
        Objects.equals(this.commonStockIssuance, cashFlowStructFinancingActivities.commonStockIssuance) &&
        Objects.equals(this.commonStockRepurchase, cashFlowStructFinancingActivities.commonStockRepurchase) &&
        Objects.equals(this.commonDividends, cashFlowStructFinancingActivities.commonDividends) &&
        Objects.equals(this.otherFinancingCharges, cashFlowStructFinancingActivities.otherFinancingCharges) &&
        Objects.equals(this.financingCashFlow, cashFlowStructFinancingActivities.financingCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTermDebtIssuance, longTermDebtPayments, shortTermDebtIssuance, commonStockIssuance, commonStockRepurchase, commonDividends, otherFinancingCharges, financingCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowStructFinancingActivities {\n");
    sb.append("    longTermDebtIssuance: ").append(toIndentedString(longTermDebtIssuance)).append("\n");
    sb.append("    longTermDebtPayments: ").append(toIndentedString(longTermDebtPayments)).append("\n");
    sb.append("    shortTermDebtIssuance: ").append(toIndentedString(shortTermDebtIssuance)).append("\n");
    sb.append("    commonStockIssuance: ").append(toIndentedString(commonStockIssuance)).append("\n");
    sb.append("    commonStockRepurchase: ").append(toIndentedString(commonStockRepurchase)).append("\n");
    sb.append("    commonDividends: ").append(toIndentedString(commonDividends)).append("\n");
    sb.append("    otherFinancingCharges: ").append(toIndentedString(otherFinancingCharges)).append("\n");
    sb.append("    financingCashFlow: ").append(toIndentedString(financingCashFlow)).append("\n");
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

    // add `long_term_debt_issuance` to the URL query string
    if (getLongTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebtIssuance()))));
    }

    // add `long_term_debt_payments` to the URL query string
    if (getLongTermDebtPayments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt_payments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebtPayments()))));
    }

    // add `short_term_debt_issuance` to the URL query string
    if (getShortTermDebtIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_term_debt_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortTermDebtIssuance()))));
    }

    // add `common_stock_issuance` to the URL query string
    if (getCommonStockIssuance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_issuance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockIssuance()))));
    }

    // add `common_stock_repurchase` to the URL query string
    if (getCommonStockRepurchase() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_repurchase%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockRepurchase()))));
    }

    // add `common_dividends` to the URL query string
    if (getCommonDividends() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_dividends%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonDividends()))));
    }

    // add `other_financing_charges` to the URL query string
    if (getOtherFinancingCharges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_financing_charges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherFinancingCharges()))));
    }

    // add `financing_cash_flow` to the URL query string
    if (getFinancingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinancing_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinancingCashFlow()))));
    }

    return joiner.toString();
  }
}

