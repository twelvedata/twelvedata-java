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
 * Payables and accrued expenses information
 */
@JsonPropertyOrder({
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_TOTAL_PAYABLES_AND_ACCRUED_EXPENSES,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_ACCOUNTS_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_CURRENT_ACCRUED_EXPENSES,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_INTEREST_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_PAYABLES,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_OTHER_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_DUE_TO_RELATED_PARTIES_CURRENT,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_DIVIDENDS_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_TOTAL_TAX_PAYABLE,
  AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.JSON_PROPERTY_INCOME_TAX_PAYABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses {
  public static final String JSON_PROPERTY_TOTAL_PAYABLES_AND_ACCRUED_EXPENSES = "total_payables_and_accrued_expenses";
  @javax.annotation.Nullable
  private Double totalPayablesAndAccruedExpenses;

  public static final String JSON_PROPERTY_ACCOUNTS_PAYABLE = "accounts_payable";
  @javax.annotation.Nullable
  private Double accountsPayable;

  public static final String JSON_PROPERTY_CURRENT_ACCRUED_EXPENSES = "current_accrued_expenses";
  @javax.annotation.Nullable
  private Double currentAccruedExpenses;

  public static final String JSON_PROPERTY_INTEREST_PAYABLE = "interest_payable";
  @javax.annotation.Nullable
  private Double interestPayable;

  public static final String JSON_PROPERTY_PAYABLES = "payables";
  @javax.annotation.Nullable
  private Double payables;

  public static final String JSON_PROPERTY_OTHER_PAYABLE = "other_payable";
  @javax.annotation.Nullable
  private Double otherPayable;

  public static final String JSON_PROPERTY_DUE_TO_RELATED_PARTIES_CURRENT = "due_to_related_parties_current";
  @javax.annotation.Nullable
  private Double dueToRelatedPartiesCurrent;

  public static final String JSON_PROPERTY_DIVIDENDS_PAYABLE = "dividends_payable";
  @javax.annotation.Nullable
  private Double dividendsPayable;

  public static final String JSON_PROPERTY_TOTAL_TAX_PAYABLE = "total_tax_payable";
  @javax.annotation.Nullable
  private Double totalTaxPayable;

  public static final String JSON_PROPERTY_INCOME_TAX_PAYABLE = "income_tax_payable";
  @javax.annotation.Nullable
  private Double incomeTaxPayable;

  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses() { 
  }

  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses totalPayablesAndAccruedExpenses(@javax.annotation.Nullable Double totalPayablesAndAccruedExpenses) {
    this.totalPayablesAndAccruedExpenses = totalPayablesAndAccruedExpenses;
    return this;
  }

  /**
   * Total payables and accrued expenses
   * @return totalPayablesAndAccruedExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_PAYABLES_AND_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalPayablesAndAccruedExpenses() {
    return totalPayablesAndAccruedExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_PAYABLES_AND_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPayablesAndAccruedExpenses(@javax.annotation.Nullable Double totalPayablesAndAccruedExpenses) {
    this.totalPayablesAndAccruedExpenses = totalPayablesAndAccruedExpenses;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses accountsPayable(@javax.annotation.Nullable Double accountsPayable) {
    this.accountsPayable = accountsPayable;
    return this;
  }

  /**
   * Accounts payable
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


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses currentAccruedExpenses(@javax.annotation.Nullable Double currentAccruedExpenses) {
    this.currentAccruedExpenses = currentAccruedExpenses;
    return this;
  }

  /**
   * Current accrued expenses
   * @return currentAccruedExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentAccruedExpenses() {
    return currentAccruedExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_ACCRUED_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAccruedExpenses(@javax.annotation.Nullable Double currentAccruedExpenses) {
    this.currentAccruedExpenses = currentAccruedExpenses;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses interestPayable(@javax.annotation.Nullable Double interestPayable) {
    this.interestPayable = interestPayable;
    return this;
  }

  /**
   * Interest payable
   * @return interestPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPayable() {
    return interestPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPayable(@javax.annotation.Nullable Double interestPayable) {
    this.interestPayable = interestPayable;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses payables(@javax.annotation.Nullable Double payables) {
    this.payables = payables;
    return this;
  }

  /**
   * Payables
   * @return payables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAYABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPayables() {
    return payables;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayables(@javax.annotation.Nullable Double payables) {
    this.payables = payables;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses otherPayable(@javax.annotation.Nullable Double otherPayable) {
    this.otherPayable = otherPayable;
    return this;
  }

  /**
   * Other payable
   * @return otherPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherPayable() {
    return otherPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherPayable(@javax.annotation.Nullable Double otherPayable) {
    this.otherPayable = otherPayable;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses dueToRelatedPartiesCurrent(@javax.annotation.Nullable Double dueToRelatedPartiesCurrent) {
    this.dueToRelatedPartiesCurrent = dueToRelatedPartiesCurrent;
    return this;
  }

  /**
   * Due to related parties current
   * @return dueToRelatedPartiesCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUE_TO_RELATED_PARTIES_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDueToRelatedPartiesCurrent() {
    return dueToRelatedPartiesCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_TO_RELATED_PARTIES_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueToRelatedPartiesCurrent(@javax.annotation.Nullable Double dueToRelatedPartiesCurrent) {
    this.dueToRelatedPartiesCurrent = dueToRelatedPartiesCurrent;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses dividendsPayable(@javax.annotation.Nullable Double dividendsPayable) {
    this.dividendsPayable = dividendsPayable;
    return this;
  }

  /**
   * Dividends payable
   * @return dividendsPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendsPayable() {
    return dividendsPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendsPayable(@javax.annotation.Nullable Double dividendsPayable) {
    this.dividendsPayable = dividendsPayable;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses totalTaxPayable(@javax.annotation.Nullable Double totalTaxPayable) {
    this.totalTaxPayable = totalTaxPayable;
    return this;
  }

  /**
   * Total tax payable
   * @return totalTaxPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalTaxPayable() {
    return totalTaxPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTaxPayable(@javax.annotation.Nullable Double totalTaxPayable) {
    this.totalTaxPayable = totalTaxPayable;
  }


  public AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses incomeTaxPayable(@javax.annotation.Nullable Double incomeTaxPayable) {
    this.incomeTaxPayable = incomeTaxPayable;
    return this;
  }

  /**
   * Income tax payable
   * @return incomeTaxPayable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIncomeTaxPayable() {
    return incomeTaxPayable;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAYABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeTaxPayable(@javax.annotation.Nullable Double incomeTaxPayable) {
    this.incomeTaxPayable = incomeTaxPayable;
  }


  /**
   * Return true if this AssetsInfo_liabilities_current_liabilities_payables_and_accrued_expenses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses = (AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses) o;
    return Objects.equals(this.totalPayablesAndAccruedExpenses, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.totalPayablesAndAccruedExpenses) &&
        Objects.equals(this.accountsPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.accountsPayable) &&
        Objects.equals(this.currentAccruedExpenses, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.currentAccruedExpenses) &&
        Objects.equals(this.interestPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.interestPayable) &&
        Objects.equals(this.payables, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.payables) &&
        Objects.equals(this.otherPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.otherPayable) &&
        Objects.equals(this.dueToRelatedPartiesCurrent, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.dueToRelatedPartiesCurrent) &&
        Objects.equals(this.dividendsPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.dividendsPayable) &&
        Objects.equals(this.totalTaxPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.totalTaxPayable) &&
        Objects.equals(this.incomeTaxPayable, assetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses.incomeTaxPayable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPayablesAndAccruedExpenses, accountsPayable, currentAccruedExpenses, interestPayable, payables, otherPayable, dueToRelatedPartiesCurrent, dividendsPayable, totalTaxPayable, incomeTaxPayable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoLiabilitiesCurrentLiabilitiesPayablesAndAccruedExpenses {\n");
    sb.append("    totalPayablesAndAccruedExpenses: ").append(toIndentedString(totalPayablesAndAccruedExpenses)).append("\n");
    sb.append("    accountsPayable: ").append(toIndentedString(accountsPayable)).append("\n");
    sb.append("    currentAccruedExpenses: ").append(toIndentedString(currentAccruedExpenses)).append("\n");
    sb.append("    interestPayable: ").append(toIndentedString(interestPayable)).append("\n");
    sb.append("    payables: ").append(toIndentedString(payables)).append("\n");
    sb.append("    otherPayable: ").append(toIndentedString(otherPayable)).append("\n");
    sb.append("    dueToRelatedPartiesCurrent: ").append(toIndentedString(dueToRelatedPartiesCurrent)).append("\n");
    sb.append("    dividendsPayable: ").append(toIndentedString(dividendsPayable)).append("\n");
    sb.append("    totalTaxPayable: ").append(toIndentedString(totalTaxPayable)).append("\n");
    sb.append("    incomeTaxPayable: ").append(toIndentedString(incomeTaxPayable)).append("\n");
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

    // add `total_payables_and_accrued_expenses` to the URL query string
    if (getTotalPayablesAndAccruedExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_payables_and_accrued_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalPayablesAndAccruedExpenses()))));
    }

    // add `accounts_payable` to the URL query string
    if (getAccountsPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsPayable()))));
    }

    // add `current_accrued_expenses` to the URL query string
    if (getCurrentAccruedExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_accrued_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentAccruedExpenses()))));
    }

    // add `interest_payable` to the URL query string
    if (getInterestPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPayable()))));
    }

    // add `payables` to the URL query string
    if (getPayables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spayables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPayables()))));
    }

    // add `other_payable` to the URL query string
    if (getOtherPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherPayable()))));
    }

    // add `due_to_related_parties_current` to the URL query string
    if (getDueToRelatedPartiesCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdue_to_related_parties_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDueToRelatedPartiesCurrent()))));
    }

    // add `dividends_payable` to the URL query string
    if (getDividendsPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividends_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendsPayable()))));
    }

    // add `total_tax_payable` to the URL query string
    if (getTotalTaxPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_tax_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalTaxPayable()))));
    }

    // add `income_tax_payable` to the URL query string
    if (getIncomeTaxPayable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sincome_tax_payable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncomeTaxPayable()))));
    }

    return joiner.toString();
  }
}

