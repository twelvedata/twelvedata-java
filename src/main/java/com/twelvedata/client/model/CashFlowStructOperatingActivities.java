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
 * Operating activities section
 */
@JsonPropertyOrder({
  CashFlowStructOperatingActivities.JSON_PROPERTY_NET_INCOME,
  CashFlowStructOperatingActivities.JSON_PROPERTY_DEPRECIATION,
  CashFlowStructOperatingActivities.JSON_PROPERTY_DEFERRED_TAXES,
  CashFlowStructOperatingActivities.JSON_PROPERTY_STOCK_BASED_COMPENSATION,
  CashFlowStructOperatingActivities.JSON_PROPERTY_OTHER_NON_CASH_ITEMS,
  CashFlowStructOperatingActivities.JSON_PROPERTY_ACCOUNTS_RECEIVABLE,
  CashFlowStructOperatingActivities.JSON_PROPERTY_ACCOUNTS_PAYABLE,
  CashFlowStructOperatingActivities.JSON_PROPERTY_OTHER_ASSETS_LIABILITIES,
  CashFlowStructOperatingActivities.JSON_PROPERTY_OPERATING_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowStructOperatingActivities {
  public static final String JSON_PROPERTY_NET_INCOME = "net_income";
  @javax.annotation.Nullable
  private Double netIncome;

  public static final String JSON_PROPERTY_DEPRECIATION = "depreciation";
  @javax.annotation.Nullable
  private Double depreciation;

  public static final String JSON_PROPERTY_DEFERRED_TAXES = "deferred_taxes";
  @javax.annotation.Nullable
  private Double deferredTaxes;

  public static final String JSON_PROPERTY_STOCK_BASED_COMPENSATION = "stock_based_compensation";
  @javax.annotation.Nullable
  private Double stockBasedCompensation;

  public static final String JSON_PROPERTY_OTHER_NON_CASH_ITEMS = "other_non_cash_items";
  @javax.annotation.Nullable
  private Double otherNonCashItems;

  public static final String JSON_PROPERTY_ACCOUNTS_RECEIVABLE = "accounts_receivable";
  @javax.annotation.Nullable
  private Double accountsReceivable;

  public static final String JSON_PROPERTY_ACCOUNTS_PAYABLE = "accounts_payable";
  @javax.annotation.Nullable
  private Double accountsPayable;

  public static final String JSON_PROPERTY_OTHER_ASSETS_LIABILITIES = "other_assets_liabilities";
  @javax.annotation.Nullable
  private Double otherAssetsLiabilities;

  public static final String JSON_PROPERTY_OPERATING_CASH_FLOW = "operating_cash_flow";
  @javax.annotation.Nullable
  private Double operatingCashFlow;

  public CashFlowStructOperatingActivities() { 
  }

  public CashFlowStructOperatingActivities netIncome(@javax.annotation.Nullable Double netIncome) {
    this.netIncome = netIncome;
    return this;
  }

  /**
   * Returns net income (NI). Calculated as sales minus cost of goods sold
   * @return netIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncome() {
    return netIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncome(@javax.annotation.Nullable Double netIncome) {
    this.netIncome = netIncome;
  }


  public CashFlowStructOperatingActivities depreciation(@javax.annotation.Nullable Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Represents depreciation and amortization measure
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


  public CashFlowStructOperatingActivities deferredTaxes(@javax.annotation.Nullable Double deferredTaxes) {
    this.deferredTaxes = deferredTaxes;
    return this;
  }

  /**
   * Stands for taxes that are owed but are not due to be paid until a future date
   * @return deferredTaxes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFERRED_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDeferredTaxes() {
    return deferredTaxes;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFERRED_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredTaxes(@javax.annotation.Nullable Double deferredTaxes) {
    this.deferredTaxes = deferredTaxes;
  }


  public CashFlowStructOperatingActivities stockBasedCompensation(@javax.annotation.Nullable Double stockBasedCompensation) {
    this.stockBasedCompensation = stockBasedCompensation;
    return this;
  }

  /**
   * Refers to share-based compensation as the way of paying employees, executives, and directors of a company with equity in the business
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


  public CashFlowStructOperatingActivities otherNonCashItems(@javax.annotation.Nullable Double otherNonCashItems) {
    this.otherNonCashItems = otherNonCashItems;
    return this;
  }

  /**
   * Represents other non-cash items
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


  public CashFlowStructOperatingActivities accountsReceivable(@javax.annotation.Nullable Double accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
    return this;
  }

  /**
   * Represents the balance of money due to a firm for goods or services delivered or used but not yet paid for by customers
   * @return accountsReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccountsReceivable() {
    return accountsReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountsReceivable(@javax.annotation.Nullable Double accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
  }


  public CashFlowStructOperatingActivities accountsPayable(@javax.annotation.Nullable Double accountsPayable) {
    this.accountsPayable = accountsPayable;
    return this;
  }

  /**
   * Refers to an account within the general ledger that represents an obligation to pay off a short-term debt to creditors or suppliers
   * @return accountsPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCOUNTS_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccountsPayable() {
    return accountsPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCOUNTS_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountsPayable(@javax.annotation.Nullable Double accountsPayable) {
    this.accountsPayable = accountsPayable;
  }


  public CashFlowStructOperatingActivities otherAssetsLiabilities(@javax.annotation.Nullable Double otherAssetsLiabilities) {
    this.otherAssetsLiabilities = otherAssetsLiabilities;
    return this;
  }

  /**
   * Represents cumulative changes in inventory, other current assets, other current liabilities, and other working capital
   * @return otherAssetsLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_ASSETS_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherAssetsLiabilities() {
    return otherAssetsLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_ASSETS_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherAssetsLiabilities(@javax.annotation.Nullable Double otherAssetsLiabilities) {
    this.otherAssetsLiabilities = otherAssetsLiabilities;
  }


  public CashFlowStructOperatingActivities operatingCashFlow(@javax.annotation.Nullable Double operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
    return this;
  }

  /**
   * Returns operating cash flow (OCF) measure representing a total amount of cash generated by company&#39;s normal business operations
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


  /**
   * Return true if this CashFlowStruct_operating_activities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowStructOperatingActivities cashFlowStructOperatingActivities = (CashFlowStructOperatingActivities) o;
    return Objects.equals(this.netIncome, cashFlowStructOperatingActivities.netIncome) &&
        Objects.equals(this.depreciation, cashFlowStructOperatingActivities.depreciation) &&
        Objects.equals(this.deferredTaxes, cashFlowStructOperatingActivities.deferredTaxes) &&
        Objects.equals(this.stockBasedCompensation, cashFlowStructOperatingActivities.stockBasedCompensation) &&
        Objects.equals(this.otherNonCashItems, cashFlowStructOperatingActivities.otherNonCashItems) &&
        Objects.equals(this.accountsReceivable, cashFlowStructOperatingActivities.accountsReceivable) &&
        Objects.equals(this.accountsPayable, cashFlowStructOperatingActivities.accountsPayable) &&
        Objects.equals(this.otherAssetsLiabilities, cashFlowStructOperatingActivities.otherAssetsLiabilities) &&
        Objects.equals(this.operatingCashFlow, cashFlowStructOperatingActivities.operatingCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netIncome, depreciation, deferredTaxes, stockBasedCompensation, otherNonCashItems, accountsReceivable, accountsPayable, otherAssetsLiabilities, operatingCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowStructOperatingActivities {\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    deferredTaxes: ").append(toIndentedString(deferredTaxes)).append("\n");
    sb.append("    stockBasedCompensation: ").append(toIndentedString(stockBasedCompensation)).append("\n");
    sb.append("    otherNonCashItems: ").append(toIndentedString(otherNonCashItems)).append("\n");
    sb.append("    accountsReceivable: ").append(toIndentedString(accountsReceivable)).append("\n");
    sb.append("    accountsPayable: ").append(toIndentedString(accountsPayable)).append("\n");
    sb.append("    otherAssetsLiabilities: ").append(toIndentedString(otherAssetsLiabilities)).append("\n");
    sb.append("    operatingCashFlow: ").append(toIndentedString(operatingCashFlow)).append("\n");
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

    // add `net_income` to the URL query string
    if (getNetIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncome()))));
    }

    // add `depreciation` to the URL query string
    if (getDepreciation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciation()))));
    }

    // add `deferred_taxes` to the URL query string
    if (getDeferredTaxes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeferred_taxes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeferredTaxes()))));
    }

    // add `stock_based_compensation` to the URL query string
    if (getStockBasedCompensation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstock_based_compensation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStockBasedCompensation()))));
    }

    // add `other_non_cash_items` to the URL query string
    if (getOtherNonCashItems() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_cash_items%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCashItems()))));
    }

    // add `accounts_receivable` to the URL query string
    if (getAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsReceivable()))));
    }

    // add `accounts_payable` to the URL query string
    if (getAccountsPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsPayable()))));
    }

    // add `other_assets_liabilities` to the URL query string
    if (getOtherAssetsLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_assets_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherAssetsLiabilities()))));
    }

    // add `operating_cash_flow` to the URL query string
    if (getOperatingCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingCashFlow()))));
    }

    return joiner.toString();
  }
}

