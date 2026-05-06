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
 * Receivables information
 */
@JsonPropertyOrder({
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_TOTAL_RECEIVABLES,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_ACCOUNTS_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_GROSS_ACCOUNTS_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_ALLOWANCE_FOR_DOUBTFUL_ACCOUNTS_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_RECEIVABLES_ADJUSTMENTS_ALLOWANCES,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_OTHER_RECEIVABLES,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_CURRENT,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_TAXES_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_ACCRUED_INTEREST_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_NOTES_RECEIVABLE,
  AssetsInfoCurrentAssetsReceivables.JSON_PROPERTY_LOANS_RECEIVABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoCurrentAssetsReceivables {
  public static final String JSON_PROPERTY_TOTAL_RECEIVABLES = "total_receivables";
  @javax.annotation.Nullable
  private Double totalReceivables;

  public static final String JSON_PROPERTY_ACCOUNTS_RECEIVABLE = "accounts_receivable";
  @javax.annotation.Nullable
  private Double accountsReceivable;

  public static final String JSON_PROPERTY_GROSS_ACCOUNTS_RECEIVABLE = "gross_accounts_receivable";
  @javax.annotation.Nullable
  private Double grossAccountsReceivable;

  public static final String JSON_PROPERTY_ALLOWANCE_FOR_DOUBTFUL_ACCOUNTS_RECEIVABLE = "allowance_for_doubtful_accounts_receivable";
  @javax.annotation.Nullable
  private Double allowanceForDoubtfulAccountsReceivable;

  public static final String JSON_PROPERTY_RECEIVABLES_ADJUSTMENTS_ALLOWANCES = "receivables_adjustments_allowances";
  @javax.annotation.Nullable
  private Double receivablesAdjustmentsAllowances;

  public static final String JSON_PROPERTY_OTHER_RECEIVABLES = "other_receivables";
  @javax.annotation.Nullable
  private Double otherReceivables;

  public static final String JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_CURRENT = "due_from_related_parties_current";
  @javax.annotation.Nullable
  private Double dueFromRelatedPartiesCurrent;

  public static final String JSON_PROPERTY_TAXES_RECEIVABLE = "taxes_receivable";
  @javax.annotation.Nullable
  private Double taxesReceivable;

  public static final String JSON_PROPERTY_ACCRUED_INTEREST_RECEIVABLE = "accrued_interest_receivable";
  @javax.annotation.Nullable
  private Double accruedInterestReceivable;

  public static final String JSON_PROPERTY_NOTES_RECEIVABLE = "notes_receivable";
  @javax.annotation.Nullable
  private Double notesReceivable;

  public static final String JSON_PROPERTY_LOANS_RECEIVABLE = "loans_receivable";
  @javax.annotation.Nullable
  private Double loansReceivable;

  public AssetsInfoCurrentAssetsReceivables() { 
  }

  public AssetsInfoCurrentAssetsReceivables totalReceivables(@javax.annotation.Nullable Double totalReceivables) {
    this.totalReceivables = totalReceivables;
    return this;
  }

  /**
   * Total receivables
   * @return totalReceivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalReceivables() {
    return totalReceivables;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalReceivables(@javax.annotation.Nullable Double totalReceivables) {
    this.totalReceivables = totalReceivables;
  }


  public AssetsInfoCurrentAssetsReceivables accountsReceivable(@javax.annotation.Nullable Double accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
    return this;
  }

  /**
   * Accounts receivable
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


  public AssetsInfoCurrentAssetsReceivables grossAccountsReceivable(@javax.annotation.Nullable Double grossAccountsReceivable) {
    this.grossAccountsReceivable = grossAccountsReceivable;
    return this;
  }

  /**
   * Gross accounts receivable
   * @return grossAccountsReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrossAccountsReceivable() {
    return grossAccountsReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossAccountsReceivable(@javax.annotation.Nullable Double grossAccountsReceivable) {
    this.grossAccountsReceivable = grossAccountsReceivable;
  }


  public AssetsInfoCurrentAssetsReceivables allowanceForDoubtfulAccountsReceivable(@javax.annotation.Nullable Double allowanceForDoubtfulAccountsReceivable) {
    this.allowanceForDoubtfulAccountsReceivable = allowanceForDoubtfulAccountsReceivable;
    return this;
  }

  /**
   * Allowance for doubtful accounts receivable
   * @return allowanceForDoubtfulAccountsReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOWANCE_FOR_DOUBTFUL_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAllowanceForDoubtfulAccountsReceivable() {
    return allowanceForDoubtfulAccountsReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOWANCE_FOR_DOUBTFUL_ACCOUNTS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowanceForDoubtfulAccountsReceivable(@javax.annotation.Nullable Double allowanceForDoubtfulAccountsReceivable) {
    this.allowanceForDoubtfulAccountsReceivable = allowanceForDoubtfulAccountsReceivable;
  }


  public AssetsInfoCurrentAssetsReceivables receivablesAdjustmentsAllowances(@javax.annotation.Nullable Double receivablesAdjustmentsAllowances) {
    this.receivablesAdjustmentsAllowances = receivablesAdjustmentsAllowances;
    return this;
  }

  /**
   * Receivables adjustments allowances
   * @return receivablesAdjustmentsAllowances
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECEIVABLES_ADJUSTMENTS_ALLOWANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReceivablesAdjustmentsAllowances() {
    return receivablesAdjustmentsAllowances;
  }


  @JsonProperty(value = JSON_PROPERTY_RECEIVABLES_ADJUSTMENTS_ALLOWANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivablesAdjustmentsAllowances(@javax.annotation.Nullable Double receivablesAdjustmentsAllowances) {
    this.receivablesAdjustmentsAllowances = receivablesAdjustmentsAllowances;
  }


  public AssetsInfoCurrentAssetsReceivables otherReceivables(@javax.annotation.Nullable Double otherReceivables) {
    this.otherReceivables = otherReceivables;
    return this;
  }

  /**
   * Other receivables
   * @return otherReceivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherReceivables() {
    return otherReceivables;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherReceivables(@javax.annotation.Nullable Double otherReceivables) {
    this.otherReceivables = otherReceivables;
  }


  public AssetsInfoCurrentAssetsReceivables dueFromRelatedPartiesCurrent(@javax.annotation.Nullable Double dueFromRelatedPartiesCurrent) {
    this.dueFromRelatedPartiesCurrent = dueFromRelatedPartiesCurrent;
    return this;
  }

  /**
   * Due from related parties current
   * @return dueFromRelatedPartiesCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDueFromRelatedPartiesCurrent() {
    return dueFromRelatedPartiesCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_FROM_RELATED_PARTIES_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueFromRelatedPartiesCurrent(@javax.annotation.Nullable Double dueFromRelatedPartiesCurrent) {
    this.dueFromRelatedPartiesCurrent = dueFromRelatedPartiesCurrent;
  }


  public AssetsInfoCurrentAssetsReceivables taxesReceivable(@javax.annotation.Nullable Double taxesReceivable) {
    this.taxesReceivable = taxesReceivable;
    return this;
  }

  /**
   * Taxes receivable
   * @return taxesReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAXES_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxesReceivable() {
    return taxesReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_TAXES_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxesReceivable(@javax.annotation.Nullable Double taxesReceivable) {
    this.taxesReceivable = taxesReceivable;
  }


  public AssetsInfoCurrentAssetsReceivables accruedInterestReceivable(@javax.annotation.Nullable Double accruedInterestReceivable) {
    this.accruedInterestReceivable = accruedInterestReceivable;
    return this;
  }

  /**
   * Accrued interest receivable
   * @return accruedInterestReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCRUED_INTEREST_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccruedInterestReceivable() {
    return accruedInterestReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCRUED_INTEREST_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccruedInterestReceivable(@javax.annotation.Nullable Double accruedInterestReceivable) {
    this.accruedInterestReceivable = accruedInterestReceivable;
  }


  public AssetsInfoCurrentAssetsReceivables notesReceivable(@javax.annotation.Nullable Double notesReceivable) {
    this.notesReceivable = notesReceivable;
    return this;
  }

  /**
   * Notes receivable
   * @return notesReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOTES_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNotesReceivable() {
    return notesReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_NOTES_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotesReceivable(@javax.annotation.Nullable Double notesReceivable) {
    this.notesReceivable = notesReceivable;
  }


  public AssetsInfoCurrentAssetsReceivables loansReceivable(@javax.annotation.Nullable Double loansReceivable) {
    this.loansReceivable = loansReceivable;
    return this;
  }

  /**
   * Loans receivable
   * @return loansReceivable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOANS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLoansReceivable() {
    return loansReceivable;
  }


  @JsonProperty(value = JSON_PROPERTY_LOANS_RECEIVABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoansReceivable(@javax.annotation.Nullable Double loansReceivable) {
    this.loansReceivable = loansReceivable;
  }


  /**
   * Return true if this AssetsInfo_current_assets_receivables object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoCurrentAssetsReceivables assetsInfoCurrentAssetsReceivables = (AssetsInfoCurrentAssetsReceivables) o;
    return Objects.equals(this.totalReceivables, assetsInfoCurrentAssetsReceivables.totalReceivables) &&
        Objects.equals(this.accountsReceivable, assetsInfoCurrentAssetsReceivables.accountsReceivable) &&
        Objects.equals(this.grossAccountsReceivable, assetsInfoCurrentAssetsReceivables.grossAccountsReceivable) &&
        Objects.equals(this.allowanceForDoubtfulAccountsReceivable, assetsInfoCurrentAssetsReceivables.allowanceForDoubtfulAccountsReceivable) &&
        Objects.equals(this.receivablesAdjustmentsAllowances, assetsInfoCurrentAssetsReceivables.receivablesAdjustmentsAllowances) &&
        Objects.equals(this.otherReceivables, assetsInfoCurrentAssetsReceivables.otherReceivables) &&
        Objects.equals(this.dueFromRelatedPartiesCurrent, assetsInfoCurrentAssetsReceivables.dueFromRelatedPartiesCurrent) &&
        Objects.equals(this.taxesReceivable, assetsInfoCurrentAssetsReceivables.taxesReceivable) &&
        Objects.equals(this.accruedInterestReceivable, assetsInfoCurrentAssetsReceivables.accruedInterestReceivable) &&
        Objects.equals(this.notesReceivable, assetsInfoCurrentAssetsReceivables.notesReceivable) &&
        Objects.equals(this.loansReceivable, assetsInfoCurrentAssetsReceivables.loansReceivable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalReceivables, accountsReceivable, grossAccountsReceivable, allowanceForDoubtfulAccountsReceivable, receivablesAdjustmentsAllowances, otherReceivables, dueFromRelatedPartiesCurrent, taxesReceivable, accruedInterestReceivable, notesReceivable, loansReceivable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoCurrentAssetsReceivables {\n");
    sb.append("    totalReceivables: ").append(toIndentedString(totalReceivables)).append("\n");
    sb.append("    accountsReceivable: ").append(toIndentedString(accountsReceivable)).append("\n");
    sb.append("    grossAccountsReceivable: ").append(toIndentedString(grossAccountsReceivable)).append("\n");
    sb.append("    allowanceForDoubtfulAccountsReceivable: ").append(toIndentedString(allowanceForDoubtfulAccountsReceivable)).append("\n");
    sb.append("    receivablesAdjustmentsAllowances: ").append(toIndentedString(receivablesAdjustmentsAllowances)).append("\n");
    sb.append("    otherReceivables: ").append(toIndentedString(otherReceivables)).append("\n");
    sb.append("    dueFromRelatedPartiesCurrent: ").append(toIndentedString(dueFromRelatedPartiesCurrent)).append("\n");
    sb.append("    taxesReceivable: ").append(toIndentedString(taxesReceivable)).append("\n");
    sb.append("    accruedInterestReceivable: ").append(toIndentedString(accruedInterestReceivable)).append("\n");
    sb.append("    notesReceivable: ").append(toIndentedString(notesReceivable)).append("\n");
    sb.append("    loansReceivable: ").append(toIndentedString(loansReceivable)).append("\n");
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

    // add `total_receivables` to the URL query string
    if (getTotalReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalReceivables()))));
    }

    // add `accounts_receivable` to the URL query string
    if (getAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsReceivable()))));
    }

    // add `gross_accounts_receivable` to the URL query string
    if (getGrossAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_accounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossAccountsReceivable()))));
    }

    // add `allowance_for_doubtful_accounts_receivable` to the URL query string
    if (getAllowanceForDoubtfulAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallowance_for_doubtful_accounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllowanceForDoubtfulAccountsReceivable()))));
    }

    // add `receivables_adjustments_allowances` to the URL query string
    if (getReceivablesAdjustmentsAllowances() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreceivables_adjustments_allowances%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReceivablesAdjustmentsAllowances()))));
    }

    // add `other_receivables` to the URL query string
    if (getOtherReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherReceivables()))));
    }

    // add `due_from_related_parties_current` to the URL query string
    if (getDueFromRelatedPartiesCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdue_from_related_parties_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDueFromRelatedPartiesCurrent()))));
    }

    // add `taxes_receivable` to the URL query string
    if (getTaxesReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%staxes_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxesReceivable()))));
    }

    // add `accrued_interest_receivable` to the URL query string
    if (getAccruedInterestReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccrued_interest_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccruedInterestReceivable()))));
    }

    // add `notes_receivable` to the URL query string
    if (getNotesReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotes_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotesReceivable()))));
    }

    // add `loans_receivable` to the URL query string
    if (getLoansReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloans_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoansReceivable()))));
    }

    return joiner.toString();
  }
}

