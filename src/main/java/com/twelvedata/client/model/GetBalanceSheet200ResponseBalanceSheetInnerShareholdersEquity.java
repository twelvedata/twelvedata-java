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
 * Shareholders&#39; equity section of the balance sheet
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_COMMON_STOCK,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_RETAINED_EARNINGS,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_OTHER_SHAREHOLDERS_EQUITY,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_TREASURY_STOCK,
  GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.JSON_PROPERTY_MINORITY_INTEREST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity {
  public static final String JSON_PROPERTY_COMMON_STOCK = "common_stock";
  @javax.annotation.Nullable
  private Double commonStock;

  public static final String JSON_PROPERTY_RETAINED_EARNINGS = "retained_earnings";
  @javax.annotation.Nullable
  private Double retainedEarnings;

  public static final String JSON_PROPERTY_OTHER_SHAREHOLDERS_EQUITY = "other_shareholders_equity";
  @javax.annotation.Nullable
  private Double otherShareholdersEquity;

  public static final String JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY = "total_shareholders_equity";
  @javax.annotation.Nullable
  private Double totalShareholdersEquity;

  public static final String JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL = "additional_paid_in_capital";
  @javax.annotation.Nullable
  private Double additionalPaidInCapital;

  public static final String JSON_PROPERTY_TREASURY_STOCK = "treasury_stock";
  @javax.annotation.Nullable
  private Double treasuryStock;

  public static final String JSON_PROPERTY_MINORITY_INTEREST = "minority_interest";
  @javax.annotation.Nullable
  private Double minorityInterest;

  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity commonStock(@javax.annotation.Nullable Double commonStock) {
    this.commonStock = commonStock;
    return this;
  }

  /**
   * Represents net worth of investors shares, which is equal to the total_assets - total_liabilities
   * @return commonStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommonStock() {
    return commonStock;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMON_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonStock(@javax.annotation.Nullable Double commonStock) {
    this.commonStock = commonStock;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity retainedEarnings(@javax.annotation.Nullable Double retainedEarnings) {
    this.retainedEarnings = retainedEarnings;
    return this;
  }

  /**
   * Refers to the profits earned minus dividends paid
   * @return retainedEarnings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETAINED_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRetainedEarnings() {
    return retainedEarnings;
  }


  @JsonProperty(value = JSON_PROPERTY_RETAINED_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetainedEarnings(@javax.annotation.Nullable Double retainedEarnings) {
    this.retainedEarnings = retainedEarnings;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity otherShareholdersEquity(@javax.annotation.Nullable Double otherShareholdersEquity) {
    this.otherShareholdersEquity = otherShareholdersEquity;
    return this;
  }

  /**
   * Represents other not affecting retained earnings gains and looses
   * @return otherShareholdersEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_SHAREHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherShareholdersEquity() {
    return otherShareholdersEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_SHAREHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherShareholdersEquity(@javax.annotation.Nullable Double otherShareholdersEquity) {
    this.otherShareholdersEquity = otherShareholdersEquity;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity totalShareholdersEquity(@javax.annotation.Nullable Double totalShareholdersEquity) {
    this.totalShareholdersEquity = totalShareholdersEquity;
    return this;
  }

  /**
   * Represents the net worth of a company, which is the amount that would be returned to shareholders if a company&#39;s total assets were liquidated, and all of its debts were repaid
   * @return totalShareholdersEquity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalShareholdersEquity() {
    return totalShareholdersEquity;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_SHAREHOLDERS_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalShareholdersEquity(@javax.annotation.Nullable Double totalShareholdersEquity) {
    this.totalShareholdersEquity = totalShareholdersEquity;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity additionalPaidInCapital(@javax.annotation.Nullable Double additionalPaidInCapital) {
    this.additionalPaidInCapital = additionalPaidInCapital;
    return this;
  }

  /**
   * Represents the additional paid-in capital, which is the amount shareholders have invested in a company above the par value of its stock
   * @return additionalPaidInCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAdditionalPaidInCapital() {
    return additionalPaidInCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalPaidInCapital(@javax.annotation.Nullable Double additionalPaidInCapital) {
    this.additionalPaidInCapital = additionalPaidInCapital;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity treasuryStock(@javax.annotation.Nullable Double treasuryStock) {
    this.treasuryStock = treasuryStock;
    return this;
  }

  /**
   * Represents the value of shares that have been repurchased by the company and are held in its treasury
   * @return treasuryStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TREASURY_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTreasuryStock() {
    return treasuryStock;
  }


  @JsonProperty(value = JSON_PROPERTY_TREASURY_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTreasuryStock(@javax.annotation.Nullable Double treasuryStock) {
    this.treasuryStock = treasuryStock;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity minorityInterest(@javax.annotation.Nullable Double minorityInterest) {
    this.minorityInterest = minorityInterest;
    return this;
  }

  /**
   * Represents the portion of shareholders&#39; equity that is attributable to minority shareholders in a subsidiary company
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


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_shareholders_equity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity = (GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity) o;
    return Objects.equals(this.commonStock, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.commonStock) &&
        Objects.equals(this.retainedEarnings, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.retainedEarnings) &&
        Objects.equals(this.otherShareholdersEquity, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.otherShareholdersEquity) &&
        Objects.equals(this.totalShareholdersEquity, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.totalShareholdersEquity) &&
        Objects.equals(this.additionalPaidInCapital, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.additionalPaidInCapital) &&
        Objects.equals(this.treasuryStock, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.treasuryStock) &&
        Objects.equals(this.minorityInterest, getBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity.minorityInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonStock, retainedEarnings, otherShareholdersEquity, totalShareholdersEquity, additionalPaidInCapital, treasuryStock, minorityInterest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerShareholdersEquity {\n");
    sb.append("    commonStock: ").append(toIndentedString(commonStock)).append("\n");
    sb.append("    retainedEarnings: ").append(toIndentedString(retainedEarnings)).append("\n");
    sb.append("    otherShareholdersEquity: ").append(toIndentedString(otherShareholdersEquity)).append("\n");
    sb.append("    totalShareholdersEquity: ").append(toIndentedString(totalShareholdersEquity)).append("\n");
    sb.append("    additionalPaidInCapital: ").append(toIndentedString(additionalPaidInCapital)).append("\n");
    sb.append("    treasuryStock: ").append(toIndentedString(treasuryStock)).append("\n");
    sb.append("    minorityInterest: ").append(toIndentedString(minorityInterest)).append("\n");
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

    // add `common_stock` to the URL query string
    if (getCommonStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommon_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommonStock()))));
    }

    // add `retained_earnings` to the URL query string
    if (getRetainedEarnings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sretained_earnings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRetainedEarnings()))));
    }

    // add `other_shareholders_equity` to the URL query string
    if (getOtherShareholdersEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_shareholders_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherShareholdersEquity()))));
    }

    // add `total_shareholders_equity` to the URL query string
    if (getTotalShareholdersEquity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_shareholders_equity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalShareholdersEquity()))));
    }

    // add `additional_paid_in_capital` to the URL query string
    if (getAdditionalPaidInCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_paid_in_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalPaidInCapital()))));
    }

    // add `treasury_stock` to the URL query string
    if (getTreasuryStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%streasury_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTreasuryStock()))));
    }

    // add `minority_interest` to the URL query string
    if (getMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinorityInterest()))));
    }

    return joiner.toString();
  }
}

