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
 * Capital stock information
 */
@JsonPropertyOrder({
  EquityInfoCapitalStock.JSON_PROPERTY_COMMON_STOCK,
  EquityInfoCapitalStock.JSON_PROPERTY_PREFERRED_STOCK,
  EquityInfoCapitalStock.JSON_PROPERTY_TOTAL_PARTNERSHIP_CAPITAL,
  EquityInfoCapitalStock.JSON_PROPERTY_GENERAL_PARTNERSHIP_CAPITAL,
  EquityInfoCapitalStock.JSON_PROPERTY_LIMITED_PARTNERSHIP_CAPITAL,
  EquityInfoCapitalStock.JSON_PROPERTY_CAPITAL_STOCK,
  EquityInfoCapitalStock.JSON_PROPERTY_OTHER_CAPITAL_STOCK,
  EquityInfoCapitalStock.JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL,
  EquityInfoCapitalStock.JSON_PROPERTY_RETAINED_EARNINGS,
  EquityInfoCapitalStock.JSON_PROPERTY_TREASURY_STOCK,
  EquityInfoCapitalStock.JSON_PROPERTY_TREASURY_SHARES_NUMBER,
  EquityInfoCapitalStock.JSON_PROPERTY_ORDINARY_SHARES_NUMBER,
  EquityInfoCapitalStock.JSON_PROPERTY_PREFERRED_SHARES_NUMBER,
  EquityInfoCapitalStock.JSON_PROPERTY_SHARE_ISSUED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EquityInfoCapitalStock {
  public static final String JSON_PROPERTY_COMMON_STOCK = "common_stock";
  @javax.annotation.Nullable
  private Double commonStock;

  public static final String JSON_PROPERTY_PREFERRED_STOCK = "preferred_stock";
  @javax.annotation.Nullable
  private Double preferredStock;

  public static final String JSON_PROPERTY_TOTAL_PARTNERSHIP_CAPITAL = "total_partnership_capital";
  @javax.annotation.Nullable
  private Double totalPartnershipCapital;

  public static final String JSON_PROPERTY_GENERAL_PARTNERSHIP_CAPITAL = "general_partnership_capital";
  @javax.annotation.Nullable
  private Double generalPartnershipCapital;

  public static final String JSON_PROPERTY_LIMITED_PARTNERSHIP_CAPITAL = "limited_partnership_capital";
  @javax.annotation.Nullable
  private Double limitedPartnershipCapital;

  public static final String JSON_PROPERTY_CAPITAL_STOCK = "capital_stock";
  @javax.annotation.Nullable
  private Double capitalStock;

  public static final String JSON_PROPERTY_OTHER_CAPITAL_STOCK = "other_capital_stock";
  @javax.annotation.Nullable
  private Double otherCapitalStock;

  public static final String JSON_PROPERTY_ADDITIONAL_PAID_IN_CAPITAL = "additional_paid_in_capital";
  @javax.annotation.Nullable
  private Double additionalPaidInCapital;

  public static final String JSON_PROPERTY_RETAINED_EARNINGS = "retained_earnings";
  @javax.annotation.Nullable
  private Double retainedEarnings;

  public static final String JSON_PROPERTY_TREASURY_STOCK = "treasury_stock";
  @javax.annotation.Nullable
  private Double treasuryStock;

  public static final String JSON_PROPERTY_TREASURY_SHARES_NUMBER = "treasury_shares_number";
  @javax.annotation.Nullable
  private Double treasurySharesNumber;

  public static final String JSON_PROPERTY_ORDINARY_SHARES_NUMBER = "ordinary_shares_number";
  @javax.annotation.Nullable
  private Double ordinarySharesNumber;

  public static final String JSON_PROPERTY_PREFERRED_SHARES_NUMBER = "preferred_shares_number";
  @javax.annotation.Nullable
  private Double preferredSharesNumber;

  public static final String JSON_PROPERTY_SHARE_ISSUED = "share_issued";
  @javax.annotation.Nullable
  private Double shareIssued;

  public EquityInfoCapitalStock() { 
  }

  public EquityInfoCapitalStock commonStock(@javax.annotation.Nullable Double commonStock) {
    this.commonStock = commonStock;
    return this;
  }

  /**
   * Common stock
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


  public EquityInfoCapitalStock preferredStock(@javax.annotation.Nullable Double preferredStock) {
    this.preferredStock = preferredStock;
    return this;
  }

  /**
   * Preferred stock
   * @return preferredStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStock() {
    return preferredStock;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStock(@javax.annotation.Nullable Double preferredStock) {
    this.preferredStock = preferredStock;
  }


  public EquityInfoCapitalStock totalPartnershipCapital(@javax.annotation.Nullable Double totalPartnershipCapital) {
    this.totalPartnershipCapital = totalPartnershipCapital;
    return this;
  }

  /**
   * Total partnership capital
   * @return totalPartnershipCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalPartnershipCapital() {
    return totalPartnershipCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPartnershipCapital(@javax.annotation.Nullable Double totalPartnershipCapital) {
    this.totalPartnershipCapital = totalPartnershipCapital;
  }


  public EquityInfoCapitalStock generalPartnershipCapital(@javax.annotation.Nullable Double generalPartnershipCapital) {
    this.generalPartnershipCapital = generalPartnershipCapital;
    return this;
  }

  /**
   * General partnership capital
   * @return generalPartnershipCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GENERAL_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGeneralPartnershipCapital() {
    return generalPartnershipCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERAL_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralPartnershipCapital(@javax.annotation.Nullable Double generalPartnershipCapital) {
    this.generalPartnershipCapital = generalPartnershipCapital;
  }


  public EquityInfoCapitalStock limitedPartnershipCapital(@javax.annotation.Nullable Double limitedPartnershipCapital) {
    this.limitedPartnershipCapital = limitedPartnershipCapital;
    return this;
  }

  /**
   * Limited partnership capital
   * @return limitedPartnershipCapital
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIMITED_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimitedPartnershipCapital() {
    return limitedPartnershipCapital;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMITED_PARTNERSHIP_CAPITAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitedPartnershipCapital(@javax.annotation.Nullable Double limitedPartnershipCapital) {
    this.limitedPartnershipCapital = limitedPartnershipCapital;
  }


  public EquityInfoCapitalStock capitalStock(@javax.annotation.Nullable Double capitalStock) {
    this.capitalStock = capitalStock;
    return this;
  }

  /**
   * Capital stock
   * @return capitalStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCapitalStock() {
    return capitalStock;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalStock(@javax.annotation.Nullable Double capitalStock) {
    this.capitalStock = capitalStock;
  }


  public EquityInfoCapitalStock otherCapitalStock(@javax.annotation.Nullable Double otherCapitalStock) {
    this.otherCapitalStock = otherCapitalStock;
    return this;
  }

  /**
   * Other capital stock
   * @return otherCapitalStock
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCapitalStock() {
    return otherCapitalStock;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CAPITAL_STOCK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCapitalStock(@javax.annotation.Nullable Double otherCapitalStock) {
    this.otherCapitalStock = otherCapitalStock;
  }


  public EquityInfoCapitalStock additionalPaidInCapital(@javax.annotation.Nullable Double additionalPaidInCapital) {
    this.additionalPaidInCapital = additionalPaidInCapital;
    return this;
  }

  /**
   * Additional paid in capital
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


  public EquityInfoCapitalStock retainedEarnings(@javax.annotation.Nullable Double retainedEarnings) {
    this.retainedEarnings = retainedEarnings;
    return this;
  }

  /**
   * Retained earnings
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


  public EquityInfoCapitalStock treasuryStock(@javax.annotation.Nullable Double treasuryStock) {
    this.treasuryStock = treasuryStock;
    return this;
  }

  /**
   * Treasury stock
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


  public EquityInfoCapitalStock treasurySharesNumber(@javax.annotation.Nullable Double treasurySharesNumber) {
    this.treasurySharesNumber = treasurySharesNumber;
    return this;
  }

  /**
   * Treasury shares number
   * @return treasurySharesNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TREASURY_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTreasurySharesNumber() {
    return treasurySharesNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_TREASURY_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTreasurySharesNumber(@javax.annotation.Nullable Double treasurySharesNumber) {
    this.treasurySharesNumber = treasurySharesNumber;
  }


  public EquityInfoCapitalStock ordinarySharesNumber(@javax.annotation.Nullable Double ordinarySharesNumber) {
    this.ordinarySharesNumber = ordinarySharesNumber;
    return this;
  }

  /**
   * Ordinary shares number
   * @return ordinarySharesNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORDINARY_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOrdinarySharesNumber() {
    return ordinarySharesNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDINARY_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrdinarySharesNumber(@javax.annotation.Nullable Double ordinarySharesNumber) {
    this.ordinarySharesNumber = ordinarySharesNumber;
  }


  public EquityInfoCapitalStock preferredSharesNumber(@javax.annotation.Nullable Double preferredSharesNumber) {
    this.preferredSharesNumber = preferredSharesNumber;
    return this;
  }

  /**
   * Preferred shares number
   * @return preferredSharesNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredSharesNumber() {
    return preferredSharesNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_SHARES_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredSharesNumber(@javax.annotation.Nullable Double preferredSharesNumber) {
    this.preferredSharesNumber = preferredSharesNumber;
  }


  public EquityInfoCapitalStock shareIssued(@javax.annotation.Nullable Double shareIssued) {
    this.shareIssued = shareIssued;
    return this;
  }

  /**
   * Share issued
   * @return shareIssued
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARE_ISSUED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShareIssued() {
    return shareIssued;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARE_ISSUED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareIssued(@javax.annotation.Nullable Double shareIssued) {
    this.shareIssued = shareIssued;
  }


  /**
   * Return true if this EquityInfo_capital_stock object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquityInfoCapitalStock equityInfoCapitalStock = (EquityInfoCapitalStock) o;
    return Objects.equals(this.commonStock, equityInfoCapitalStock.commonStock) &&
        Objects.equals(this.preferredStock, equityInfoCapitalStock.preferredStock) &&
        Objects.equals(this.totalPartnershipCapital, equityInfoCapitalStock.totalPartnershipCapital) &&
        Objects.equals(this.generalPartnershipCapital, equityInfoCapitalStock.generalPartnershipCapital) &&
        Objects.equals(this.limitedPartnershipCapital, equityInfoCapitalStock.limitedPartnershipCapital) &&
        Objects.equals(this.capitalStock, equityInfoCapitalStock.capitalStock) &&
        Objects.equals(this.otherCapitalStock, equityInfoCapitalStock.otherCapitalStock) &&
        Objects.equals(this.additionalPaidInCapital, equityInfoCapitalStock.additionalPaidInCapital) &&
        Objects.equals(this.retainedEarnings, equityInfoCapitalStock.retainedEarnings) &&
        Objects.equals(this.treasuryStock, equityInfoCapitalStock.treasuryStock) &&
        Objects.equals(this.treasurySharesNumber, equityInfoCapitalStock.treasurySharesNumber) &&
        Objects.equals(this.ordinarySharesNumber, equityInfoCapitalStock.ordinarySharesNumber) &&
        Objects.equals(this.preferredSharesNumber, equityInfoCapitalStock.preferredSharesNumber) &&
        Objects.equals(this.shareIssued, equityInfoCapitalStock.shareIssued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonStock, preferredStock, totalPartnershipCapital, generalPartnershipCapital, limitedPartnershipCapital, capitalStock, otherCapitalStock, additionalPaidInCapital, retainedEarnings, treasuryStock, treasurySharesNumber, ordinarySharesNumber, preferredSharesNumber, shareIssued);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquityInfoCapitalStock {\n");
    sb.append("    commonStock: ").append(toIndentedString(commonStock)).append("\n");
    sb.append("    preferredStock: ").append(toIndentedString(preferredStock)).append("\n");
    sb.append("    totalPartnershipCapital: ").append(toIndentedString(totalPartnershipCapital)).append("\n");
    sb.append("    generalPartnershipCapital: ").append(toIndentedString(generalPartnershipCapital)).append("\n");
    sb.append("    limitedPartnershipCapital: ").append(toIndentedString(limitedPartnershipCapital)).append("\n");
    sb.append("    capitalStock: ").append(toIndentedString(capitalStock)).append("\n");
    sb.append("    otherCapitalStock: ").append(toIndentedString(otherCapitalStock)).append("\n");
    sb.append("    additionalPaidInCapital: ").append(toIndentedString(additionalPaidInCapital)).append("\n");
    sb.append("    retainedEarnings: ").append(toIndentedString(retainedEarnings)).append("\n");
    sb.append("    treasuryStock: ").append(toIndentedString(treasuryStock)).append("\n");
    sb.append("    treasurySharesNumber: ").append(toIndentedString(treasurySharesNumber)).append("\n");
    sb.append("    ordinarySharesNumber: ").append(toIndentedString(ordinarySharesNumber)).append("\n");
    sb.append("    preferredSharesNumber: ").append(toIndentedString(preferredSharesNumber)).append("\n");
    sb.append("    shareIssued: ").append(toIndentedString(shareIssued)).append("\n");
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

    // add `preferred_stock` to the URL query string
    if (getPreferredStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStock()))));
    }

    // add `total_partnership_capital` to the URL query string
    if (getTotalPartnershipCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_partnership_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalPartnershipCapital()))));
    }

    // add `general_partnership_capital` to the URL query string
    if (getGeneralPartnershipCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgeneral_partnership_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGeneralPartnershipCapital()))));
    }

    // add `limited_partnership_capital` to the URL query string
    if (getLimitedPartnershipCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slimited_partnership_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLimitedPartnershipCapital()))));
    }

    // add `capital_stock` to the URL query string
    if (getCapitalStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapitalStock()))));
    }

    // add `other_capital_stock` to the URL query string
    if (getOtherCapitalStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_capital_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCapitalStock()))));
    }

    // add `additional_paid_in_capital` to the URL query string
    if (getAdditionalPaidInCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_paid_in_capital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalPaidInCapital()))));
    }

    // add `retained_earnings` to the URL query string
    if (getRetainedEarnings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sretained_earnings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRetainedEarnings()))));
    }

    // add `treasury_stock` to the URL query string
    if (getTreasuryStock() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%streasury_stock%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTreasuryStock()))));
    }

    // add `treasury_shares_number` to the URL query string
    if (getTreasurySharesNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%streasury_shares_number%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTreasurySharesNumber()))));
    }

    // add `ordinary_shares_number` to the URL query string
    if (getOrdinarySharesNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sordinary_shares_number%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrdinarySharesNumber()))));
    }

    // add `preferred_shares_number` to the URL query string
    if (getPreferredSharesNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_shares_number%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredSharesNumber()))));
    }

    // add `share_issued` to the URL query string
    if (getShareIssued() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshare_issued%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShareIssued()))));
    }

    return joiner.toString();
  }
}

