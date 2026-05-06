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
 * Current liabilities section
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_ACCOUNTS_PAYABLE,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_ACCRUED_EXPENSES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_SHORT_TERM_DEBT,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_DEFERRED_REVENUE,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_TAX_PAYABLE,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_PENSIONS,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_OTHER_CURRENT_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities {
  public static final String JSON_PROPERTY_ACCOUNTS_PAYABLE = "accounts_payable";
  @javax.annotation.Nullable
  private Double accountsPayable;

  public static final String JSON_PROPERTY_ACCRUED_EXPENSES = "accrued_expenses";
  @javax.annotation.Nullable
  private Double accruedExpenses;

  public static final String JSON_PROPERTY_SHORT_TERM_DEBT = "short_term_debt";
  @javax.annotation.Nullable
  private Double shortTermDebt;

  public static final String JSON_PROPERTY_DEFERRED_REVENUE = "deferred_revenue";
  @javax.annotation.Nullable
  private Double deferredRevenue;

  public static final String JSON_PROPERTY_TAX_PAYABLE = "tax_payable";
  @javax.annotation.Nullable
  private Double taxPayable;

  public static final String JSON_PROPERTY_PENSIONS = "pensions";
  @javax.annotation.Nullable
  private Double pensions;

  public static final String JSON_PROPERTY_OTHER_CURRENT_LIABILITIES = "other_current_liabilities";
  @javax.annotation.Nullable
  private Double otherCurrentLiabilities;

  public static final String JSON_PROPERTY_TOTAL_CURRENT_LIABILITIES = "total_current_liabilities";
  @javax.annotation.Nullable
  private Double totalCurrentLiabilities;

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities accountsPayable(@javax.annotation.Nullable Double accountsPayable) {
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


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities accruedExpenses(@javax.annotation.Nullable Double accruedExpenses) {
    this.accruedExpenses = accruedExpenses;
    return this;
  }

  /**
   * Represents payments that a company is obligated to pay in the future for which goods and services have already been delivered
   * @return accruedExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccruedExpenses() {
    return accruedExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccruedExpenses(@javax.annotation.Nullable Double accruedExpenses) {
    this.accruedExpenses = accruedExpenses;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities shortTermDebt(@javax.annotation.Nullable Double shortTermDebt) {
    this.shortTermDebt = shortTermDebt;
    return this;
  }

  /**
   * Represents current debt and capital lease obligations
   * @return shortTermDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShortTermDebt() {
    return shortTermDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortTermDebt(@javax.annotation.Nullable Double shortTermDebt) {
    this.shortTermDebt = shortTermDebt;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities deferredRevenue(@javax.annotation.Nullable Double deferredRevenue) {
    this.deferredRevenue = deferredRevenue;
    return this;
  }

  /**
   * Represents advance payments a company receives for products or services that are to be delivered or performed in the future
   * @return deferredRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDeferredRevenue() {
    return deferredRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFERRED_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredRevenue(@javax.annotation.Nullable Double deferredRevenue) {
    this.deferredRevenue = deferredRevenue;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities taxPayable(@javax.annotation.Nullable Double taxPayable) {
    this.taxPayable = taxPayable;
    return this;
  }

  /**
   * Represents taxes due to the government within one year
   * @return taxPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxPayable() {
    return taxPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxPayable(@javax.annotation.Nullable Double taxPayable) {
    this.taxPayable = taxPayable;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities pensions(@javax.annotation.Nullable Double pensions) {
    this.pensions = pensions;
    return this;
  }

  /**
   * Represents to pensions to be paid out
   * @return pensions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PENSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPensions() {
    return pensions;
  }


  @JsonProperty(value = JSON_PROPERTY_PENSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPensions(@javax.annotation.Nullable Double pensions) {
    this.pensions = pensions;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities otherCurrentLiabilities(@javax.annotation.Nullable Double otherCurrentLiabilities) {
    this.otherCurrentLiabilities = otherCurrentLiabilities;
    return this;
  }

  /**
   * Represents other current liabilities
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


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities totalCurrentLiabilities(@javax.annotation.Nullable Double totalCurrentLiabilities) {
    this.totalCurrentLiabilities = totalCurrentLiabilities;
    return this;
  }

  /**
   * Represents total current liabilities
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


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_liabilities_current_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities = (GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities) o;
    return Objects.equals(this.accountsPayable, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.accountsPayable) &&
        Objects.equals(this.accruedExpenses, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.accruedExpenses) &&
        Objects.equals(this.shortTermDebt, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.shortTermDebt) &&
        Objects.equals(this.deferredRevenue, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.deferredRevenue) &&
        Objects.equals(this.taxPayable, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.taxPayable) &&
        Objects.equals(this.pensions, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.pensions) &&
        Objects.equals(this.otherCurrentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.otherCurrentLiabilities) &&
        Objects.equals(this.totalCurrentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities.totalCurrentLiabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsPayable, accruedExpenses, shortTermDebt, deferredRevenue, taxPayable, pensions, otherCurrentLiabilities, totalCurrentLiabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities {\n");
    sb.append("    accountsPayable: ").append(toIndentedString(accountsPayable)).append("\n");
    sb.append("    accruedExpenses: ").append(toIndentedString(accruedExpenses)).append("\n");
    sb.append("    shortTermDebt: ").append(toIndentedString(shortTermDebt)).append("\n");
    sb.append("    deferredRevenue: ").append(toIndentedString(deferredRevenue)).append("\n");
    sb.append("    taxPayable: ").append(toIndentedString(taxPayable)).append("\n");
    sb.append("    pensions: ").append(toIndentedString(pensions)).append("\n");
    sb.append("    otherCurrentLiabilities: ").append(toIndentedString(otherCurrentLiabilities)).append("\n");
    sb.append("    totalCurrentLiabilities: ").append(toIndentedString(totalCurrentLiabilities)).append("\n");
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

    // add `accounts_payable` to the URL query string
    if (getAccountsPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsPayable()))));
    }

    // add `accrued_expenses` to the URL query string
    if (getAccruedExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccrued_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccruedExpenses()))));
    }

    // add `short_term_debt` to the URL query string
    if (getShortTermDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_term_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortTermDebt()))));
    }

    // add `deferred_revenue` to the URL query string
    if (getDeferredRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeferred_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeferredRevenue()))));
    }

    // add `tax_payable` to the URL query string
    if (getTaxPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxPayable()))));
    }

    // add `pensions` to the URL query string
    if (getPensions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spensions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPensions()))));
    }

    // add `other_current_liabilities` to the URL query string
    if (getOtherCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCurrentLiabilities()))));
    }

    // add `total_current_liabilities` to the URL query string
    if (getTotalCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCurrentLiabilities()))));
    }

    return joiner.toString();
  }
}

