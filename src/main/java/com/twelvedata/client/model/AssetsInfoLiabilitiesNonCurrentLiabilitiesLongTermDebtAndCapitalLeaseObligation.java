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
 * Long term debt and capital lease obligation information
 */
@JsonPropertyOrder({
  AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.JSON_PROPERTY_TOTAL_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION,
  AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.JSON_PROPERTY_LONG_TERM_DEBT,
  AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.JSON_PROPERTY_LONG_TERM_CAPITAL_LEASE_OBLIGATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation {
  public static final String JSON_PROPERTY_TOTAL_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION = "total_long_term_debt_and_capital_lease_obligation";
  @javax.annotation.Nullable
  private Double totalLongTermDebtAndCapitalLeaseObligation;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT = "long_term_debt";
  @javax.annotation.Nullable
  private Double longTermDebt;

  public static final String JSON_PROPERTY_LONG_TERM_CAPITAL_LEASE_OBLIGATION = "long_term_capital_lease_obligation";
  @javax.annotation.Nullable
  private Double longTermCapitalLeaseObligation;

  public AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation() { 
  }

  public AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation totalLongTermDebtAndCapitalLeaseObligation(@javax.annotation.Nullable Double totalLongTermDebtAndCapitalLeaseObligation) {
    this.totalLongTermDebtAndCapitalLeaseObligation = totalLongTermDebtAndCapitalLeaseObligation;
    return this;
  }

  /**
   * Total long term debt and capital lease obligation
   * @return totalLongTermDebtAndCapitalLeaseObligation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalLongTermDebtAndCapitalLeaseObligation() {
    return totalLongTermDebtAndCapitalLeaseObligation;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_LONG_TERM_DEBT_AND_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLongTermDebtAndCapitalLeaseObligation(@javax.annotation.Nullable Double totalLongTermDebtAndCapitalLeaseObligation) {
    this.totalLongTermDebtAndCapitalLeaseObligation = totalLongTermDebtAndCapitalLeaseObligation;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation longTermDebt(@javax.annotation.Nullable Double longTermDebt) {
    this.longTermDebt = longTermDebt;
    return this;
  }

  /**
   * Long term debt
   * @return longTermDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermDebt() {
    return longTermDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermDebt(@javax.annotation.Nullable Double longTermDebt) {
    this.longTermDebt = longTermDebt;
  }


  public AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation longTermCapitalLeaseObligation(@javax.annotation.Nullable Double longTermCapitalLeaseObligation) {
    this.longTermCapitalLeaseObligation = longTermCapitalLeaseObligation;
    return this;
  }

  /**
   * Long term capital lease obligation
   * @return longTermCapitalLeaseObligation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermCapitalLeaseObligation() {
    return longTermCapitalLeaseObligation;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_CAPITAL_LEASE_OBLIGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermCapitalLeaseObligation(@javax.annotation.Nullable Double longTermCapitalLeaseObligation) {
    this.longTermCapitalLeaseObligation = longTermCapitalLeaseObligation;
  }


  /**
   * Return true if this AssetsInfo_liabilities_non_current_liabilities_long_term_debt_and_capital_lease_obligation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation assetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation = (AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation) o;
    return Objects.equals(this.totalLongTermDebtAndCapitalLeaseObligation, assetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.totalLongTermDebtAndCapitalLeaseObligation) &&
        Objects.equals(this.longTermDebt, assetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.longTermDebt) &&
        Objects.equals(this.longTermCapitalLeaseObligation, assetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation.longTermCapitalLeaseObligation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLongTermDebtAndCapitalLeaseObligation, longTermDebt, longTermCapitalLeaseObligation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoLiabilitiesNonCurrentLiabilitiesLongTermDebtAndCapitalLeaseObligation {\n");
    sb.append("    totalLongTermDebtAndCapitalLeaseObligation: ").append(toIndentedString(totalLongTermDebtAndCapitalLeaseObligation)).append("\n");
    sb.append("    longTermDebt: ").append(toIndentedString(longTermDebt)).append("\n");
    sb.append("    longTermCapitalLeaseObligation: ").append(toIndentedString(longTermCapitalLeaseObligation)).append("\n");
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

    // add `total_long_term_debt_and_capital_lease_obligation` to the URL query string
    if (getTotalLongTermDebtAndCapitalLeaseObligation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_long_term_debt_and_capital_lease_obligation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalLongTermDebtAndCapitalLeaseObligation()))));
    }

    // add `long_term_debt` to the URL query string
    if (getLongTermDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebt()))));
    }

    // add `long_term_capital_lease_obligation` to the URL query string
    if (getLongTermCapitalLeaseObligation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_capital_lease_obligation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermCapitalLeaseObligation()))));
    }

    return joiner.toString();
  }
}

