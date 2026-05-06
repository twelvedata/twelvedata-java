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
import com.twelvedata.client.model.AssetsInfoLiabilitiesCurrentLiabilities;
import com.twelvedata.client.model.AssetsInfoLiabilitiesNonCurrentLiabilities;
import com.twelvedata.client.model.EquityInfo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Liabilities information
 */
@JsonPropertyOrder({
  AssetsInfoLiabilities.JSON_PROPERTY_TOTAL_LIABILITIES_NET_MINORITY_INTEREST,
  AssetsInfoLiabilities.JSON_PROPERTY_CURRENT_LIABILITIES,
  AssetsInfoLiabilities.JSON_PROPERTY_NON_CURRENT_LIABILITIES,
  AssetsInfoLiabilities.JSON_PROPERTY_EQUITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoLiabilities {
  public static final String JSON_PROPERTY_TOTAL_LIABILITIES_NET_MINORITY_INTEREST = "total_liabilities_net_minority_interest";
  @javax.annotation.Nullable
  private Double totalLiabilitiesNetMinorityInterest;

  public static final String JSON_PROPERTY_CURRENT_LIABILITIES = "current_liabilities";
  @javax.annotation.Nullable
  private AssetsInfoLiabilitiesCurrentLiabilities currentLiabilities;

  public static final String JSON_PROPERTY_NON_CURRENT_LIABILITIES = "non_current_liabilities";
  @javax.annotation.Nullable
  private AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentLiabilities;

  public static final String JSON_PROPERTY_EQUITY = "equity";
  @javax.annotation.Nullable
  private EquityInfo equity;

  public AssetsInfoLiabilities() { 
  }

  public AssetsInfoLiabilities totalLiabilitiesNetMinorityInterest(@javax.annotation.Nullable Double totalLiabilitiesNetMinorityInterest) {
    this.totalLiabilitiesNetMinorityInterest = totalLiabilitiesNetMinorityInterest;
    return this;
  }

  /**
   * Total liabilities net minority interest
   * @return totalLiabilitiesNetMinorityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_LIABILITIES_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalLiabilitiesNetMinorityInterest() {
    return totalLiabilitiesNetMinorityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_LIABILITIES_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLiabilitiesNetMinorityInterest(@javax.annotation.Nullable Double totalLiabilitiesNetMinorityInterest) {
    this.totalLiabilitiesNetMinorityInterest = totalLiabilitiesNetMinorityInterest;
  }


  public AssetsInfoLiabilities currentLiabilities(@javax.annotation.Nullable AssetsInfoLiabilitiesCurrentLiabilities currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
    return this;
  }

  /**
   * Get currentLiabilities
   * @return currentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoLiabilitiesCurrentLiabilities getCurrentLiabilities() {
    return currentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLiabilities(@javax.annotation.Nullable AssetsInfoLiabilitiesCurrentLiabilities currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
  }


  public AssetsInfoLiabilities nonCurrentLiabilities(@javax.annotation.Nullable AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentLiabilities) {
    this.nonCurrentLiabilities = nonCurrentLiabilities;
    return this;
  }

  /**
   * Get nonCurrentLiabilities
   * @return nonCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoLiabilitiesNonCurrentLiabilities getNonCurrentLiabilities() {
    return nonCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentLiabilities(@javax.annotation.Nullable AssetsInfoLiabilitiesNonCurrentLiabilities nonCurrentLiabilities) {
    this.nonCurrentLiabilities = nonCurrentLiabilities;
  }


  public AssetsInfoLiabilities equity(@javax.annotation.Nullable EquityInfo equity) {
    this.equity = equity;
    return this;
  }

  /**
   * Get equity
   * @return equity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EquityInfo getEquity() {
    return equity;
  }


  @JsonProperty(value = JSON_PROPERTY_EQUITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquity(@javax.annotation.Nullable EquityInfo equity) {
    this.equity = equity;
  }


  /**
   * Return true if this AssetsInfo_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoLiabilities assetsInfoLiabilities = (AssetsInfoLiabilities) o;
    return Objects.equals(this.totalLiabilitiesNetMinorityInterest, assetsInfoLiabilities.totalLiabilitiesNetMinorityInterest) &&
        Objects.equals(this.currentLiabilities, assetsInfoLiabilities.currentLiabilities) &&
        Objects.equals(this.nonCurrentLiabilities, assetsInfoLiabilities.nonCurrentLiabilities) &&
        Objects.equals(this.equity, assetsInfoLiabilities.equity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLiabilitiesNetMinorityInterest, currentLiabilities, nonCurrentLiabilities, equity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoLiabilities {\n");
    sb.append("    totalLiabilitiesNetMinorityInterest: ").append(toIndentedString(totalLiabilitiesNetMinorityInterest)).append("\n");
    sb.append("    currentLiabilities: ").append(toIndentedString(currentLiabilities)).append("\n");
    sb.append("    nonCurrentLiabilities: ").append(toIndentedString(nonCurrentLiabilities)).append("\n");
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
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

    // add `total_liabilities_net_minority_interest` to the URL query string
    if (getTotalLiabilitiesNetMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_liabilities_net_minority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalLiabilitiesNetMinorityInterest()))));
    }

    // add `current_liabilities` to the URL query string
    if (getCurrentLiabilities() != null) {
      joiner.add(getCurrentLiabilities().toUrlQueryString(prefix + "current_liabilities" + suffix));
    }

    // add `non_current_liabilities` to the URL query string
    if (getNonCurrentLiabilities() != null) {
      joiner.add(getNonCurrentLiabilities().toUrlQueryString(prefix + "non_current_liabilities" + suffix));
    }

    // add `equity` to the URL query string
    if (getEquity() != null) {
      joiner.add(getEquity().toUrlQueryString(prefix + "equity" + suffix));
    }

    return joiner.toString();
  }
}

