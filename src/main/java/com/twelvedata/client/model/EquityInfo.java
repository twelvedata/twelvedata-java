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
import com.twelvedata.client.model.EquityInfoCapitalStock;
import com.twelvedata.client.model.EquityInfoEquityAdjustments;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * EquityInfo represents equity information
 */
@JsonPropertyOrder({
  EquityInfo.JSON_PROPERTY_TOTAL_EQUITY_GROSS_MINORITY_INTEREST,
  EquityInfo.JSON_PROPERTY_STOCKHOLDERS_EQUITY,
  EquityInfo.JSON_PROPERTY_COMMON_STOCK_EQUITY,
  EquityInfo.JSON_PROPERTY_PREFERRED_STOCK_EQUITY,
  EquityInfo.JSON_PROPERTY_OTHER_EQUITY_INTEREST,
  EquityInfo.JSON_PROPERTY_MINORITY_INTEREST,
  EquityInfo.JSON_PROPERTY_TOTAL_CAPITALIZATION,
  EquityInfo.JSON_PROPERTY_NET_TANGIBLE_ASSETS,
  EquityInfo.JSON_PROPERTY_TANGIBLE_BOOK_VALUE,
  EquityInfo.JSON_PROPERTY_INVESTED_CAPITAL,
  EquityInfo.JSON_PROPERTY_WORKING_CAPITAL,
  EquityInfo.JSON_PROPERTY_CAPITAL_STOCK,
  EquityInfo.JSON_PROPERTY_EQUITY_ADJUSTMENTS,
  EquityInfo.JSON_PROPERTY_NET_DEBT,
  EquityInfo.JSON_PROPERTY_TOTAL_DEBT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EquityInfo {
  public static final String JSON_PROPERTY_TOTAL_EQUITY_GROSS_MINORITY_INTEREST = "total_equity_gross_minority_interest";
  @javax.annotation.Nullable
  private Double totalEquityGrossMinorityInterest;

  public static final String JSON_PROPERTY_STOCKHOLDERS_EQUITY = "stockholders_equity";
  @javax.annotation.Nullable
  private Double stockholdersEquity;

  public static final String JSON_PROPERTY_COMMON_STOCK_EQUITY = "common_stock_equity";
  @javax.annotation.Nullable
  private Double commonStockEquity;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_EQUITY = "preferred_stock_equity";
  @javax.annotation.Nullable
  private Double preferredStockEquity;

  public static final String JSON_PROPERTY_OTHER_EQUITY_INTEREST = "other_equity_interest";
  @javax.annotation.Nullable
  private Double otherEquityInterest;

  public static final String JSON_PROPERTY_MINORITY_INTEREST = "minority_interest";
  @javax.annotation.Nullable
  private Double minorityInterest;

  public static final String JSON_PROPERTY_TOTAL_CAPITALIZATION = "total_capitalization";
  @javax.annotation.Nullable
  private Double totalCapitalization;

  public static final String JSON_PROPERTY_NET_TANGIBLE_ASSETS = "net_tangible_assets";
  @javax.annotation.Nullable
  private Double netTangibleAssets;

  public static final String JSON_PROPERTY_TANGIBLE_BOOK_VALUE = "tangible_book_value";
  @javax.annotation.Nullable
  private Double tangibleBookValue;

  public static final String JSON_PROPERTY_INVESTED_CAPITAL = "invested_capital";
  @javax.annotation.Nullable
  private Double investedCapital;

  public static final String JSON_PROPERTY_WORKING_CAPITAL = "working_capital";
  @javax.annotation.Nullable
  private Double workingCapital;

  public static final String JSON_PROPERTY_CAPITAL_STOCK = "capital_stock";
  @javax.annotation.Nullable
  private EquityInfoCapitalStock capitalStock;

  public static final String JSON_PROPERTY_EQUITY_ADJUSTMENTS = "equity_adjustments";
  @javax.annotation.Nullable
  private EquityInfoEquityAdjustments equityAdjustments;

  public static final String JSON_PROPERTY_NET_DEBT = "net_debt";
  @javax.annotation.Nullable
  private Double netDebt;

  public static final String JSON_PROPERTY_TOTAL_DEBT = "total_debt";
  @javax.annotation.Nullable
  private Double totalDebt;

  public EquityInfo() { 
  }

  public EquityInfo totalEquityGrossMinorityInterest(@javax.annotation.Nullable Double totalEquityGrossMinorityInterest) {
    this.totalEquityGrossMinorityInterest = totalEquityGrossMinorityInterest;
    return this;
  }

  /**
   * Total equity gross minority interest
   * @return totalEquityGrossMinorityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_EQUITY_GROSS_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalEquityGrossMinorityInterest() {
    return totalEquityGrossMinorityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_EQUITY_GROSS_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalEquityGrossMinorityInterest(@javax.annotation.Nullable Double totalEquityGrossMinorityInterest) {
    this.totalEquityGrossMinorityInterest = totalEquityGrossMinorityInterest;
  }


  public EquityInfo stockholdersEquity(@javax.annotation.Nullable Double stockholdersEquity) {
    this.stockholdersEquity = stockholdersEquity;
    return this;
  }

  /**
   * Stockholders equity
   * @return stockholdersEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STOCKHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStockholdersEquity() {
    return stockholdersEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCKHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockholdersEquity(@javax.annotation.Nullable Double stockholdersEquity) {
    this.stockholdersEquity = stockholdersEquity;
  }


  public EquityInfo commonStockEquity(@javax.annotation.Nullable Double commonStockEquity) {
    this.commonStockEquity = commonStockEquity;
    return this;
  }

  /**
   * Common stock equity
   * @return commonStockEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStockEquity() {
    return commonStockEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStockEquity(@javax.annotation.Nullable Double commonStockEquity) {
    this.commonStockEquity = commonStockEquity;
  }


  public EquityInfo preferredStockEquity(@javax.annotation.Nullable Double preferredStockEquity) {
    this.preferredStockEquity = preferredStockEquity;
    return this;
  }

  /**
   * Preferred stock equity
   * @return preferredStockEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStockEquity() {
    return preferredStockEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockEquity(@javax.annotation.Nullable Double preferredStockEquity) {
    this.preferredStockEquity = preferredStockEquity;
  }


  public EquityInfo otherEquityInterest(@javax.annotation.Nullable Double otherEquityInterest) {
    this.otherEquityInterest = otherEquityInterest;
    return this;
  }

  /**
   * Other equity interest
   * @return otherEquityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_EQUITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherEquityInterest() {
    return otherEquityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_EQUITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherEquityInterest(@javax.annotation.Nullable Double otherEquityInterest) {
    this.otherEquityInterest = otherEquityInterest;
  }


  public EquityInfo minorityInterest(@javax.annotation.Nullable Double minorityInterest) {
    this.minorityInterest = minorityInterest;
    return this;
  }

  /**
   * Minority interest
   * @return minorityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinorityInterest() {
    return minorityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinorityInterest(@javax.annotation.Nullable Double minorityInterest) {
    this.minorityInterest = minorityInterest;
  }


  public EquityInfo totalCapitalization(@javax.annotation.Nullable Double totalCapitalization) {
    this.totalCapitalization = totalCapitalization;
    return this;
  }

  /**
   * Total capitalization
   * @return totalCapitalization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalCapitalization() {
    return totalCapitalization;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_CAPITALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCapitalization(@javax.annotation.Nullable Double totalCapitalization) {
    this.totalCapitalization = totalCapitalization;
  }


  public EquityInfo netTangibleAssets(@javax.annotation.Nullable Double netTangibleAssets) {
    this.netTangibleAssets = netTangibleAssets;
    return this;
  }

  /**
   * Net tangible assets
   * @return netTangibleAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_TANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetTangibleAssets() {
    return netTangibleAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_TANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetTangibleAssets(@javax.annotation.Nullable Double netTangibleAssets) {
    this.netTangibleAssets = netTangibleAssets;
  }


  public EquityInfo tangibleBookValue(@javax.annotation.Nullable Double tangibleBookValue) {
    this.tangibleBookValue = tangibleBookValue;
    return this;
  }

  /**
   * Tangible book value
   * @return tangibleBookValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TANGIBLE_BOOK_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTangibleBookValue() {
    return tangibleBookValue;
  }


  @JsonProperty(value = JSON_PROPERTY_TANGIBLE_BOOK_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTangibleBookValue(@javax.annotation.Nullable Double tangibleBookValue) {
    this.tangibleBookValue = tangibleBookValue;
  }


  public EquityInfo investedCapital(@javax.annotation.Nullable Double investedCapital) {
    this.investedCapital = investedCapital;
    return this;
  }

  /**
   * Invested capital
   * @return investedCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTED_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestedCapital() {
    return investedCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTED_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestedCapital(@javax.annotation.Nullable Double investedCapital) {
    this.investedCapital = investedCapital;
  }


  public EquityInfo workingCapital(@javax.annotation.Nullable Double workingCapital) {
    this.workingCapital = workingCapital;
    return this;
  }

  /**
   * Working capital
   * @return workingCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWorkingCapital() {
    return workingCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_WORKING_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkingCapital(@javax.annotation.Nullable Double workingCapital) {
    this.workingCapital = workingCapital;
  }


  public EquityInfo capitalStock(@javax.annotation.Nullable EquityInfoCapitalStock capitalStock) {
    this.capitalStock = capitalStock;
    return this;
  }

  /**
   * Get capitalStock
   * @return capitalStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EquityInfoCapitalStock getCapitalStock() {
    return capitalStock;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalStock(@javax.annotation.Nullable EquityInfoCapitalStock capitalStock) {
    this.capitalStock = capitalStock;
  }


  public EquityInfo equityAdjustments(@javax.annotation.Nullable EquityInfoEquityAdjustments equityAdjustments) {
    this.equityAdjustments = equityAdjustments;
    return this;
  }

  /**
   * Get equityAdjustments
   * @return equityAdjustments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EQUITY_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EquityInfoEquityAdjustments getEquityAdjustments() {
    return equityAdjustments;
  }


  @JsonProperty(value = JSON_PROPERTY_EQUITY_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquityAdjustments(@javax.annotation.Nullable EquityInfoEquityAdjustments equityAdjustments) {
    this.equityAdjustments = equityAdjustments;
  }


  public EquityInfo netDebt(@javax.annotation.Nullable Double netDebt) {
    this.netDebt = netDebt;
    return this;
  }

  /**
   * Net debt
   * @return netDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetDebt() {
    return netDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetDebt(@javax.annotation.Nullable Double netDebt) {
    this.netDebt = netDebt;
  }


  public EquityInfo totalDebt(@javax.annotation.Nullable Double totalDebt) {
    this.totalDebt = totalDebt;
    return this;
  }

  /**
   * Total debt
   * @return totalDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalDebt() {
    return totalDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDebt(@javax.annotation.Nullable Double totalDebt) {
    this.totalDebt = totalDebt;
  }


  /**
   * Return true if this EquityInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquityInfo equityInfo = (EquityInfo) o;
    return Objects.equals(this.totalEquityGrossMinorityInterest, equityInfo.totalEquityGrossMinorityInterest) &&
        Objects.equals(this.stockholdersEquity, equityInfo.stockholdersEquity) &&
        Objects.equals(this.commonStockEquity, equityInfo.commonStockEquity) &&
        Objects.equals(this.preferredStockEquity, equityInfo.preferredStockEquity) &&
        Objects.equals(this.otherEquityInterest, equityInfo.otherEquityInterest) &&
        Objects.equals(this.minorityInterest, equityInfo.minorityInterest) &&
        Objects.equals(this.totalCapitalization, equityInfo.totalCapitalization) &&
        Objects.equals(this.netTangibleAssets, equityInfo.netTangibleAssets) &&
        Objects.equals(this.tangibleBookValue, equityInfo.tangibleBookValue) &&
        Objects.equals(this.investedCapital, equityInfo.investedCapital) &&
        Objects.equals(this.workingCapital, equityInfo.workingCapital) &&
        Objects.equals(this.capitalStock, equityInfo.capitalStock) &&
        Objects.equals(this.equityAdjustments, equityInfo.equityAdjustments) &&
        Objects.equals(this.netDebt, equityInfo.netDebt) &&
        Objects.equals(this.totalDebt, equityInfo.totalDebt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEquityGrossMinorityInterest, stockholdersEquity, commonStockEquity, preferredStockEquity, otherEquityInterest, minorityInterest, totalCapitalization, netTangibleAssets, tangibleBookValue, investedCapital, workingCapital, capitalStock, equityAdjustments, netDebt, totalDebt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquityInfo {\n");
    sb.append("    totalEquityGrossMinorityInterest: ").append(toIndentedString(totalEquityGrossMinorityInterest)).append("\n");
    sb.append("    stockholdersEquity: ").append(toIndentedString(stockholdersEquity)).append("\n");
    sb.append("    commonStockEquity: ").append(toIndentedString(commonStockEquity)).append("\n");
    sb.append("    preferredStockEquity: ").append(toIndentedString(preferredStockEquity)).append("\n");
    sb.append("    otherEquityInterest: ").append(toIndentedString(otherEquityInterest)).append("\n");
    sb.append("    minorityInterest: ").append(toIndentedString(minorityInterest)).append("\n");
    sb.append("    totalCapitalization: ").append(toIndentedString(totalCapitalization)).append("\n");
    sb.append("    netTangibleAssets: ").append(toIndentedString(netTangibleAssets)).append("\n");
    sb.append("    tangibleBookValue: ").append(toIndentedString(tangibleBookValue)).append("\n");
    sb.append("    investedCapital: ").append(toIndentedString(investedCapital)).append("\n");
    sb.append("    workingCapital: ").append(toIndentedString(workingCapital)).append("\n");
    sb.append("    capitalStock: ").append(toIndentedString(capitalStock)).append("\n");
    sb.append("    equityAdjustments: ").append(toIndentedString(equityAdjustments)).append("\n");
    sb.append("    netDebt: ").append(toIndentedString(netDebt)).append("\n");
    sb.append("    totalDebt: ").append(toIndentedString(totalDebt)).append("\n");
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

    // add `total_equity_gross_minority_interest` to the URL query string
    if (getTotalEquityGrossMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_equity_gross_minority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalEquityGrossMinorityInterest()))));
    }

    // add `stockholders_equity` to the URL query string
    if (getStockholdersEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstockholders_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStockholdersEquity()))));
    }

    // add `common_stock_equity` to the URL query string
    if (getCommonStockEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStockEquity()))));
    }

    // add `preferred_stock_equity` to the URL query string
    if (getPreferredStockEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockEquity()))));
    }

    // add `other_equity_interest` to the URL query string
    if (getOtherEquityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_equity_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherEquityInterest()))));
    }

    // add `minority_interest` to the URL query string
    if (getMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinorityInterest()))));
    }

    // add `total_capitalization` to the URL query string
    if (getTotalCapitalization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_capitalization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCapitalization()))));
    }

    // add `net_tangible_assets` to the URL query string
    if (getNetTangibleAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_tangible_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetTangibleAssets()))));
    }

    // add `tangible_book_value` to the URL query string
    if (getTangibleBookValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stangible_book_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTangibleBookValue()))));
    }

    // add `invested_capital` to the URL query string
    if (getInvestedCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvested_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestedCapital()))));
    }

    // add `working_capital` to the URL query string
    if (getWorkingCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sworking_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWorkingCapital()))));
    }

    // add `capital_stock` to the URL query string
    if (getCapitalStock() != null) {
      joiner.add(getCapitalStock().toUrlQueryString(prefix + "capital_stock" + suffix));
    }

    // add `equity_adjustments` to the URL query string
    if (getEquityAdjustments() != null) {
      joiner.add(getEquityAdjustments().toUrlQueryString(prefix + "equity_adjustments" + suffix));
    }

    // add `net_debt` to the URL query string
    if (getNetDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetDebt()))));
    }

    // add `total_debt` to the URL query string
    if (getTotalDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalDebt()))));
    }

    return joiner.toString();
  }
}

