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
 * Current assets section
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_CASH,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_CASH_EQUIVALENTS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_ACCOUNTS_RECEIVABLE,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_OTHER_RECEIVABLES,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_INVENTORY,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_PREPAID_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_RESTRICTED_CASH,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_ASSETS_HELD_FOR_SALE,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_HEDGING_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_OTHER_CURRENT_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.JSON_PROPERTY_TOTAL_CURRENT_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets {
  public static final String JSON_PROPERTY_CASH = "cash";
  @javax.annotation.Nullable
  private Double cash;

  public static final String JSON_PROPERTY_CASH_EQUIVALENTS = "cash_equivalents";
  @javax.annotation.Nullable
  private Double cashEquivalents;

  public static final String JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS = "cash_and_cash_equivalents";
  @javax.annotation.Nullable
  private Double cashAndCashEquivalents;

  public static final String JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS = "other_short_term_investments";
  @javax.annotation.Nullable
  private Double otherShortTermInvestments;

  public static final String JSON_PROPERTY_ACCOUNTS_RECEIVABLE = "accounts_receivable";
  @javax.annotation.Nullable
  private Double accountsReceivable;

  public static final String JSON_PROPERTY_OTHER_RECEIVABLES = "other_receivables";
  @javax.annotation.Nullable
  private Double otherReceivables;

  public static final String JSON_PROPERTY_INVENTORY = "inventory";
  @javax.annotation.Nullable
  private Double inventory;

  public static final String JSON_PROPERTY_PREPAID_ASSETS = "prepaid_assets";
  @javax.annotation.Nullable
  private Double prepaidAssets;

  public static final String JSON_PROPERTY_RESTRICTED_CASH = "restricted_cash";
  @javax.annotation.Nullable
  private Double restrictedCash;

  public static final String JSON_PROPERTY_ASSETS_HELD_FOR_SALE = "assets_held_for_sale";
  @javax.annotation.Nullable
  private Double assetsHeldForSale;

  public static final String JSON_PROPERTY_HEDGING_ASSETS = "hedging_assets";
  @javax.annotation.Nullable
  private Double hedgingAssets;

  public static final String JSON_PROPERTY_OTHER_CURRENT_ASSETS = "other_current_assets";
  @javax.annotation.Nullable
  private Double otherCurrentAssets;

  public static final String JSON_PROPERTY_TOTAL_CURRENT_ASSETS = "total_current_assets";
  @javax.annotation.Nullable
  private Double totalCurrentAssets;

  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets cash(@javax.annotation.Nullable Double cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Cash includes currency, bank accounts, and undeposited checks
   * @return cash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCash() {
    return cash;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCash(@javax.annotation.Nullable Double cash) {
    this.cash = cash;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets cashEquivalents(@javax.annotation.Nullable Double cashEquivalents) {
    this.cashEquivalents = cashEquivalents;
    return this;
  }

  /**
   * Represents cash equivalents that have high credit quality and are highly liquid
   * @return cashEquivalents
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_EQUIVALENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashEquivalents() {
    return cashEquivalents;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_EQUIVALENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashEquivalents(@javax.annotation.Nullable Double cashEquivalents) {
    this.cashEquivalents = cashEquivalents;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets cashAndCashEquivalents(@javax.annotation.Nullable Double cashAndCashEquivalents) {
    this.cashAndCashEquivalents = cashAndCashEquivalents;
    return this;
  }

  /**
   * Combined value of cash and cash equivalents when company doesn&#39;t report a breakdown
   * @return cashAndCashEquivalents
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashAndCashEquivalents() {
    return cashAndCashEquivalents;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashAndCashEquivalents(@javax.annotation.Nullable Double cashAndCashEquivalents) {
    this.cashAndCashEquivalents = cashAndCashEquivalents;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets otherShortTermInvestments(@javax.annotation.Nullable Double otherShortTermInvestments) {
    this.otherShortTermInvestments = otherShortTermInvestments;
    return this;
  }

  /**
   * Represents other short term investments
   * @return otherShortTermInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherShortTermInvestments() {
    return otherShortTermInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherShortTermInvestments(@javax.annotation.Nullable Double otherShortTermInvestments) {
    this.otherShortTermInvestments = otherShortTermInvestments;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets accountsReceivable(@javax.annotation.Nullable Double accountsReceivable) {
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


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets otherReceivables(@javax.annotation.Nullable Double otherReceivables) {
    this.otherReceivables = otherReceivables;
    return this;
  }

  /**
   * Represents other receivables
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


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets inventory(@javax.annotation.Nullable Double inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Represents the goods available for sale and raw materials used to produce goods available for sale
   * @return inventory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInventory() {
    return inventory;
  }


  @JsonProperty(value = JSON_PROPERTY_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventory(@javax.annotation.Nullable Double inventory) {
    this.inventory = inventory;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets prepaidAssets(@javax.annotation.Nullable Double prepaidAssets) {
    this.prepaidAssets = prepaidAssets;
    return this;
  }

  /**
   * Represents expense that has already been paid for, but which has not yet been consumed
   * @return prepaidAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPrepaidAssets() {
    return prepaidAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_PREPAID_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrepaidAssets(@javax.annotation.Nullable Double prepaidAssets) {
    this.prepaidAssets = prepaidAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets restrictedCash(@javax.annotation.Nullable Double restrictedCash) {
    this.restrictedCash = restrictedCash;
    return this;
  }

  /**
   * Represents money that is held for a specific purpose and thus not available to the company for immediate or general business use
   * @return restrictedCash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESTRICTED_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRestrictedCash() {
    return restrictedCash;
  }


  @JsonProperty(value = JSON_PROPERTY_RESTRICTED_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictedCash(@javax.annotation.Nullable Double restrictedCash) {
    this.restrictedCash = restrictedCash;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets assetsHeldForSale(@javax.annotation.Nullable Double assetsHeldForSale) {
    this.assetsHeldForSale = assetsHeldForSale;
    return this;
  }

  /**
   * Represents assets which company plans to sell
   * @return assetsHeldForSale
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS_HELD_FOR_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAssetsHeldForSale() {
    return assetsHeldForSale;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS_HELD_FOR_SALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetsHeldForSale(@javax.annotation.Nullable Double assetsHeldForSale) {
    this.assetsHeldForSale = assetsHeldForSale;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets hedgingAssets(@javax.annotation.Nullable Double hedgingAssets) {
    this.hedgingAssets = hedgingAssets;
    return this;
  }

  /**
   * Represents money that is spent on hedging assets
   * @return hedgingAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HEDGING_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHedgingAssets() {
    return hedgingAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_HEDGING_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHedgingAssets(@javax.annotation.Nullable Double hedgingAssets) {
    this.hedgingAssets = hedgingAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets otherCurrentAssets(@javax.annotation.Nullable Double otherCurrentAssets) {
    this.otherCurrentAssets = otherCurrentAssets;
    return this;
  }

  /**
   * Represents other current assets
   * @return otherCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCurrentAssets() {
    return otherCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCurrentAssets(@javax.annotation.Nullable Double otherCurrentAssets) {
    this.otherCurrentAssets = otherCurrentAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets totalCurrentAssets(@javax.annotation.Nullable Double totalCurrentAssets) {
    this.totalCurrentAssets = totalCurrentAssets;
    return this;
  }

  /**
   * All current assets values in a total
   * @return totalCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalCurrentAssets() {
    return totalCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCurrentAssets(@javax.annotation.Nullable Double totalCurrentAssets) {
    this.totalCurrentAssets = totalCurrentAssets;
  }


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_assets_current_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets = (GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets) o;
    return Objects.equals(this.cash, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.cash) &&
        Objects.equals(this.cashEquivalents, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.cashEquivalents) &&
        Objects.equals(this.cashAndCashEquivalents, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.cashAndCashEquivalents) &&
        Objects.equals(this.otherShortTermInvestments, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.otherShortTermInvestments) &&
        Objects.equals(this.accountsReceivable, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.accountsReceivable) &&
        Objects.equals(this.otherReceivables, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.otherReceivables) &&
        Objects.equals(this.inventory, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.inventory) &&
        Objects.equals(this.prepaidAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.prepaidAssets) &&
        Objects.equals(this.restrictedCash, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.restrictedCash) &&
        Objects.equals(this.assetsHeldForSale, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.assetsHeldForSale) &&
        Objects.equals(this.hedgingAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.hedgingAssets) &&
        Objects.equals(this.otherCurrentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.otherCurrentAssets) &&
        Objects.equals(this.totalCurrentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets.totalCurrentAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, cashEquivalents, cashAndCashEquivalents, otherShortTermInvestments, accountsReceivable, otherReceivables, inventory, prepaidAssets, restrictedCash, assetsHeldForSale, hedgingAssets, otherCurrentAssets, totalCurrentAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets {\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    cashEquivalents: ").append(toIndentedString(cashEquivalents)).append("\n");
    sb.append("    cashAndCashEquivalents: ").append(toIndentedString(cashAndCashEquivalents)).append("\n");
    sb.append("    otherShortTermInvestments: ").append(toIndentedString(otherShortTermInvestments)).append("\n");
    sb.append("    accountsReceivable: ").append(toIndentedString(accountsReceivable)).append("\n");
    sb.append("    otherReceivables: ").append(toIndentedString(otherReceivables)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    prepaidAssets: ").append(toIndentedString(prepaidAssets)).append("\n");
    sb.append("    restrictedCash: ").append(toIndentedString(restrictedCash)).append("\n");
    sb.append("    assetsHeldForSale: ").append(toIndentedString(assetsHeldForSale)).append("\n");
    sb.append("    hedgingAssets: ").append(toIndentedString(hedgingAssets)).append("\n");
    sb.append("    otherCurrentAssets: ").append(toIndentedString(otherCurrentAssets)).append("\n");
    sb.append("    totalCurrentAssets: ").append(toIndentedString(totalCurrentAssets)).append("\n");
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

    // add `cash` to the URL query string
    if (getCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCash()))));
    }

    // add `cash_equivalents` to the URL query string
    if (getCashEquivalents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_equivalents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashEquivalents()))));
    }

    // add `cash_and_cash_equivalents` to the URL query string
    if (getCashAndCashEquivalents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_and_cash_equivalents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashAndCashEquivalents()))));
    }

    // add `other_short_term_investments` to the URL query string
    if (getOtherShortTermInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_short_term_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherShortTermInvestments()))));
    }

    // add `accounts_receivable` to the URL query string
    if (getAccountsReceivable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccounts_receivable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccountsReceivable()))));
    }

    // add `other_receivables` to the URL query string
    if (getOtherReceivables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_receivables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherReceivables()))));
    }

    // add `inventory` to the URL query string
    if (getInventory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinventory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInventory()))));
    }

    // add `prepaid_assets` to the URL query string
    if (getPrepaidAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprepaid_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrepaidAssets()))));
    }

    // add `restricted_cash` to the URL query string
    if (getRestrictedCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srestricted_cash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRestrictedCash()))));
    }

    // add `assets_held_for_sale` to the URL query string
    if (getAssetsHeldForSale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassets_held_for_sale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssetsHeldForSale()))));
    }

    // add `hedging_assets` to the URL query string
    if (getHedgingAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shedging_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHedgingAssets()))));
    }

    // add `other_current_assets` to the URL query string
    if (getOtherCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCurrentAssets()))));
    }

    // add `total_current_assets` to the URL query string
    if (getTotalCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCurrentAssets()))));
    }

    return joiner.toString();
  }
}

