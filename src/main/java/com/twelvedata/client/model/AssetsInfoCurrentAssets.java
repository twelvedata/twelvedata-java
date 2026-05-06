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
import com.twelvedata.client.model.AssetsInfoCurrentAssetsInventory;
import com.twelvedata.client.model.AssetsInfoCurrentAssetsReceivables;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Current assets information
 */
@JsonPropertyOrder({
  AssetsInfoCurrentAssets.JSON_PROPERTY_TOTAL_CURRENT_ASSETS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CASH_CASH_EQUIVALENTS_AND_SHORT_TERM_INVESTMENTS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CASH_EQUIVALENTS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CASH_FINANCIAL,
  AssetsInfoCurrentAssets.JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_RESTRICTED_CASH,
  AssetsInfoCurrentAssets.JSON_PROPERTY_RECEIVABLES,
  AssetsInfoCurrentAssets.JSON_PROPERTY_INVENTORY,
  AssetsInfoCurrentAssets.JSON_PROPERTY_PREPAID_ASSETS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CURRENT_DEFERRED_ASSETS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_CURRENT_DEFERRED_TAXES_ASSETS,
  AssetsInfoCurrentAssets.JSON_PROPERTY_ASSETS_HELD_FOR_SALE_CURRENT,
  AssetsInfoCurrentAssets.JSON_PROPERTY_HEDGING_ASSETS_CURRENT,
  AssetsInfoCurrentAssets.JSON_PROPERTY_OTHER_CURRENT_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoCurrentAssets {
  public static final String JSON_PROPERTY_TOTAL_CURRENT_ASSETS = "total_current_assets";
  @javax.annotation.Nullable
  private Double totalCurrentAssets;

  public static final String JSON_PROPERTY_CASH_CASH_EQUIVALENTS_AND_SHORT_TERM_INVESTMENTS = "cash_cash_equivalents_and_short_term_investments";
  @javax.annotation.Nullable
  private Double cashCashEquivalentsAndShortTermInvestments;

  public static final String JSON_PROPERTY_CASH_AND_CASH_EQUIVALENTS = "cash_and_cash_equivalents";
  @javax.annotation.Nullable
  private Double cashAndCashEquivalents;

  public static final String JSON_PROPERTY_CASH_EQUIVALENTS = "cash_equivalents";
  @javax.annotation.Nullable
  private Double cashEquivalents;

  public static final String JSON_PROPERTY_CASH_FINANCIAL = "cash_financial";
  @javax.annotation.Nullable
  private Double cashFinancial;

  public static final String JSON_PROPERTY_OTHER_SHORT_TERM_INVESTMENTS = "other_short_term_investments";
  @javax.annotation.Nullable
  private Double otherShortTermInvestments;

  public static final String JSON_PROPERTY_RESTRICTED_CASH = "restricted_cash";
  @javax.annotation.Nullable
  private Double restrictedCash;

  public static final String JSON_PROPERTY_RECEIVABLES = "receivables";
  @javax.annotation.Nullable
  private AssetsInfoCurrentAssetsReceivables receivables;

  public static final String JSON_PROPERTY_INVENTORY = "inventory";
  @javax.annotation.Nullable
  private AssetsInfoCurrentAssetsInventory inventory;

  public static final String JSON_PROPERTY_PREPAID_ASSETS = "prepaid_assets";
  @javax.annotation.Nullable
  private Double prepaidAssets;

  public static final String JSON_PROPERTY_CURRENT_DEFERRED_ASSETS = "current_deferred_assets";
  @javax.annotation.Nullable
  private Double currentDeferredAssets;

  public static final String JSON_PROPERTY_CURRENT_DEFERRED_TAXES_ASSETS = "current_deferred_taxes_assets";
  @javax.annotation.Nullable
  private Double currentDeferredTaxesAssets;

  public static final String JSON_PROPERTY_ASSETS_HELD_FOR_SALE_CURRENT = "assets_held_for_sale_current";
  @javax.annotation.Nullable
  private Double assetsHeldForSaleCurrent;

  public static final String JSON_PROPERTY_HEDGING_ASSETS_CURRENT = "hedging_assets_current";
  @javax.annotation.Nullable
  private Double hedgingAssetsCurrent;

  public static final String JSON_PROPERTY_OTHER_CURRENT_ASSETS = "other_current_assets";
  @javax.annotation.Nullable
  private Double otherCurrentAssets;

  public AssetsInfoCurrentAssets() { 
  }

  public AssetsInfoCurrentAssets totalCurrentAssets(@javax.annotation.Nullable Double totalCurrentAssets) {
    this.totalCurrentAssets = totalCurrentAssets;
    return this;
  }

  /**
   * Total current assets
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


  public AssetsInfoCurrentAssets cashCashEquivalentsAndShortTermInvestments(@javax.annotation.Nullable Double cashCashEquivalentsAndShortTermInvestments) {
    this.cashCashEquivalentsAndShortTermInvestments = cashCashEquivalentsAndShortTermInvestments;
    return this;
  }

  /**
   * Cash cash equivalents and short term investments
   * @return cashCashEquivalentsAndShortTermInvestments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_CASH_EQUIVALENTS_AND_SHORT_TERM_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashCashEquivalentsAndShortTermInvestments() {
    return cashCashEquivalentsAndShortTermInvestments;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_CASH_EQUIVALENTS_AND_SHORT_TERM_INVESTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashCashEquivalentsAndShortTermInvestments(@javax.annotation.Nullable Double cashCashEquivalentsAndShortTermInvestments) {
    this.cashCashEquivalentsAndShortTermInvestments = cashCashEquivalentsAndShortTermInvestments;
  }


  public AssetsInfoCurrentAssets cashAndCashEquivalents(@javax.annotation.Nullable Double cashAndCashEquivalents) {
    this.cashAndCashEquivalents = cashAndCashEquivalents;
    return this;
  }

  /**
   * Cash and cash equivalents
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


  public AssetsInfoCurrentAssets cashEquivalents(@javax.annotation.Nullable Double cashEquivalents) {
    this.cashEquivalents = cashEquivalents;
    return this;
  }

  /**
   * Cash equivalents
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


  public AssetsInfoCurrentAssets cashFinancial(@javax.annotation.Nullable Double cashFinancial) {
    this.cashFinancial = cashFinancial;
    return this;
  }

  /**
   * Cash financial
   * @return cashFinancial
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FINANCIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCashFinancial() {
    return cashFinancial;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FINANCIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFinancial(@javax.annotation.Nullable Double cashFinancial) {
    this.cashFinancial = cashFinancial;
  }


  public AssetsInfoCurrentAssets otherShortTermInvestments(@javax.annotation.Nullable Double otherShortTermInvestments) {
    this.otherShortTermInvestments = otherShortTermInvestments;
    return this;
  }

  /**
   * Other short term investments
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


  public AssetsInfoCurrentAssets restrictedCash(@javax.annotation.Nullable Double restrictedCash) {
    this.restrictedCash = restrictedCash;
    return this;
  }

  /**
   * Restricted cash
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


  public AssetsInfoCurrentAssets receivables(@javax.annotation.Nullable AssetsInfoCurrentAssetsReceivables receivables) {
    this.receivables = receivables;
    return this;
  }

  /**
   * Get receivables
   * @return receivables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoCurrentAssetsReceivables getReceivables() {
    return receivables;
  }


  @JsonProperty(value = JSON_PROPERTY_RECEIVABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivables(@javax.annotation.Nullable AssetsInfoCurrentAssetsReceivables receivables) {
    this.receivables = receivables;
  }


  public AssetsInfoCurrentAssets inventory(@javax.annotation.Nullable AssetsInfoCurrentAssetsInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * @return inventory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoCurrentAssetsInventory getInventory() {
    return inventory;
  }


  @JsonProperty(value = JSON_PROPERTY_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventory(@javax.annotation.Nullable AssetsInfoCurrentAssetsInventory inventory) {
    this.inventory = inventory;
  }


  public AssetsInfoCurrentAssets prepaidAssets(@javax.annotation.Nullable Double prepaidAssets) {
    this.prepaidAssets = prepaidAssets;
    return this;
  }

  /**
   * Prepaid assets
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


  public AssetsInfoCurrentAssets currentDeferredAssets(@javax.annotation.Nullable Double currentDeferredAssets) {
    this.currentDeferredAssets = currentDeferredAssets;
    return this;
  }

  /**
   * Current deferred assets
   * @return currentDeferredAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDeferredAssets() {
    return currentDeferredAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDeferredAssets(@javax.annotation.Nullable Double currentDeferredAssets) {
    this.currentDeferredAssets = currentDeferredAssets;
  }


  public AssetsInfoCurrentAssets currentDeferredTaxesAssets(@javax.annotation.Nullable Double currentDeferredTaxesAssets) {
    this.currentDeferredTaxesAssets = currentDeferredTaxesAssets;
    return this;
  }

  /**
   * Current deferred taxes assets
   * @return currentDeferredTaxesAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_TAXES_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentDeferredTaxesAssets() {
    return currentDeferredTaxesAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_DEFERRED_TAXES_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentDeferredTaxesAssets(@javax.annotation.Nullable Double currentDeferredTaxesAssets) {
    this.currentDeferredTaxesAssets = currentDeferredTaxesAssets;
  }


  public AssetsInfoCurrentAssets assetsHeldForSaleCurrent(@javax.annotation.Nullable Double assetsHeldForSaleCurrent) {
    this.assetsHeldForSaleCurrent = assetsHeldForSaleCurrent;
    return this;
  }

  /**
   * Assets held for sale current
   * @return assetsHeldForSaleCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS_HELD_FOR_SALE_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAssetsHeldForSaleCurrent() {
    return assetsHeldForSaleCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS_HELD_FOR_SALE_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetsHeldForSaleCurrent(@javax.annotation.Nullable Double assetsHeldForSaleCurrent) {
    this.assetsHeldForSaleCurrent = assetsHeldForSaleCurrent;
  }


  public AssetsInfoCurrentAssets hedgingAssetsCurrent(@javax.annotation.Nullable Double hedgingAssetsCurrent) {
    this.hedgingAssetsCurrent = hedgingAssetsCurrent;
    return this;
  }

  /**
   * Hedging assets current
   * @return hedgingAssetsCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HEDGING_ASSETS_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHedgingAssetsCurrent() {
    return hedgingAssetsCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_HEDGING_ASSETS_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHedgingAssetsCurrent(@javax.annotation.Nullable Double hedgingAssetsCurrent) {
    this.hedgingAssetsCurrent = hedgingAssetsCurrent;
  }


  public AssetsInfoCurrentAssets otherCurrentAssets(@javax.annotation.Nullable Double otherCurrentAssets) {
    this.otherCurrentAssets = otherCurrentAssets;
    return this;
  }

  /**
   * Other current assets
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


  /**
   * Return true if this AssetsInfo_current_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoCurrentAssets assetsInfoCurrentAssets = (AssetsInfoCurrentAssets) o;
    return Objects.equals(this.totalCurrentAssets, assetsInfoCurrentAssets.totalCurrentAssets) &&
        Objects.equals(this.cashCashEquivalentsAndShortTermInvestments, assetsInfoCurrentAssets.cashCashEquivalentsAndShortTermInvestments) &&
        Objects.equals(this.cashAndCashEquivalents, assetsInfoCurrentAssets.cashAndCashEquivalents) &&
        Objects.equals(this.cashEquivalents, assetsInfoCurrentAssets.cashEquivalents) &&
        Objects.equals(this.cashFinancial, assetsInfoCurrentAssets.cashFinancial) &&
        Objects.equals(this.otherShortTermInvestments, assetsInfoCurrentAssets.otherShortTermInvestments) &&
        Objects.equals(this.restrictedCash, assetsInfoCurrentAssets.restrictedCash) &&
        Objects.equals(this.receivables, assetsInfoCurrentAssets.receivables) &&
        Objects.equals(this.inventory, assetsInfoCurrentAssets.inventory) &&
        Objects.equals(this.prepaidAssets, assetsInfoCurrentAssets.prepaidAssets) &&
        Objects.equals(this.currentDeferredAssets, assetsInfoCurrentAssets.currentDeferredAssets) &&
        Objects.equals(this.currentDeferredTaxesAssets, assetsInfoCurrentAssets.currentDeferredTaxesAssets) &&
        Objects.equals(this.assetsHeldForSaleCurrent, assetsInfoCurrentAssets.assetsHeldForSaleCurrent) &&
        Objects.equals(this.hedgingAssetsCurrent, assetsInfoCurrentAssets.hedgingAssetsCurrent) &&
        Objects.equals(this.otherCurrentAssets, assetsInfoCurrentAssets.otherCurrentAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCurrentAssets, cashCashEquivalentsAndShortTermInvestments, cashAndCashEquivalents, cashEquivalents, cashFinancial, otherShortTermInvestments, restrictedCash, receivables, inventory, prepaidAssets, currentDeferredAssets, currentDeferredTaxesAssets, assetsHeldForSaleCurrent, hedgingAssetsCurrent, otherCurrentAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoCurrentAssets {\n");
    sb.append("    totalCurrentAssets: ").append(toIndentedString(totalCurrentAssets)).append("\n");
    sb.append("    cashCashEquivalentsAndShortTermInvestments: ").append(toIndentedString(cashCashEquivalentsAndShortTermInvestments)).append("\n");
    sb.append("    cashAndCashEquivalents: ").append(toIndentedString(cashAndCashEquivalents)).append("\n");
    sb.append("    cashEquivalents: ").append(toIndentedString(cashEquivalents)).append("\n");
    sb.append("    cashFinancial: ").append(toIndentedString(cashFinancial)).append("\n");
    sb.append("    otherShortTermInvestments: ").append(toIndentedString(otherShortTermInvestments)).append("\n");
    sb.append("    restrictedCash: ").append(toIndentedString(restrictedCash)).append("\n");
    sb.append("    receivables: ").append(toIndentedString(receivables)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    prepaidAssets: ").append(toIndentedString(prepaidAssets)).append("\n");
    sb.append("    currentDeferredAssets: ").append(toIndentedString(currentDeferredAssets)).append("\n");
    sb.append("    currentDeferredTaxesAssets: ").append(toIndentedString(currentDeferredTaxesAssets)).append("\n");
    sb.append("    assetsHeldForSaleCurrent: ").append(toIndentedString(assetsHeldForSaleCurrent)).append("\n");
    sb.append("    hedgingAssetsCurrent: ").append(toIndentedString(hedgingAssetsCurrent)).append("\n");
    sb.append("    otherCurrentAssets: ").append(toIndentedString(otherCurrentAssets)).append("\n");
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

    // add `total_current_assets` to the URL query string
    if (getTotalCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCurrentAssets()))));
    }

    // add `cash_cash_equivalents_and_short_term_investments` to the URL query string
    if (getCashCashEquivalentsAndShortTermInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_cash_equivalents_and_short_term_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashCashEquivalentsAndShortTermInvestments()))));
    }

    // add `cash_and_cash_equivalents` to the URL query string
    if (getCashAndCashEquivalents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_and_cash_equivalents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashAndCashEquivalents()))));
    }

    // add `cash_equivalents` to the URL query string
    if (getCashEquivalents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_equivalents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashEquivalents()))));
    }

    // add `cash_financial` to the URL query string
    if (getCashFinancial() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash_financial%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCashFinancial()))));
    }

    // add `other_short_term_investments` to the URL query string
    if (getOtherShortTermInvestments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_short_term_investments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherShortTermInvestments()))));
    }

    // add `restricted_cash` to the URL query string
    if (getRestrictedCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srestricted_cash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRestrictedCash()))));
    }

    // add `receivables` to the URL query string
    if (getReceivables() != null) {
      joiner.add(getReceivables().toUrlQueryString(prefix + "receivables" + suffix));
    }

    // add `inventory` to the URL query string
    if (getInventory() != null) {
      joiner.add(getInventory().toUrlQueryString(prefix + "inventory" + suffix));
    }

    // add `prepaid_assets` to the URL query string
    if (getPrepaidAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprepaid_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrepaidAssets()))));
    }

    // add `current_deferred_assets` to the URL query string
    if (getCurrentDeferredAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_deferred_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDeferredAssets()))));
    }

    // add `current_deferred_taxes_assets` to the URL query string
    if (getCurrentDeferredTaxesAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_deferred_taxes_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentDeferredTaxesAssets()))));
    }

    // add `assets_held_for_sale_current` to the URL query string
    if (getAssetsHeldForSaleCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassets_held_for_sale_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssetsHeldForSaleCurrent()))));
    }

    // add `hedging_assets_current` to the URL query string
    if (getHedgingAssetsCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shedging_assets_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHedgingAssetsCurrent()))));
    }

    // add `other_current_assets` to the URL query string
    if (getOtherCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCurrentAssets()))));
    }

    return joiner.toString();
  }
}

