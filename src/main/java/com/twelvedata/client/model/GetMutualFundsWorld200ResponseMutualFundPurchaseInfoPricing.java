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
 * Pricing information for the mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.JSON_PROPERTY_NAV,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.JSON_PROPERTY_12MONTH_LOW,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.JSON_PROPERTY_12MONTH_HIGH,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.JSON_PROPERTY_LAST_MONTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing {
  public static final String JSON_PROPERTY_NAV = "nav";
  @javax.annotation.Nullable
  private Double nav;

  public static final String JSON_PROPERTY_12MONTH_LOW = "12_month_low";
  @javax.annotation.Nullable
  private Double _12monthLow;

  public static final String JSON_PROPERTY_12MONTH_HIGH = "12_month_high";
  @javax.annotation.Nullable
  private Double _12monthHigh;

  public static final String JSON_PROPERTY_LAST_MONTH = "last_month";
  @javax.annotation.Nullable
  private Double lastMonth;

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing nav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
    return this;
  }

  /**
   * Net Asset Value: fund value minus liabilities
   * @return nav
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNav() {
    return nav;
  }


  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing _12monthLow(@javax.annotation.Nullable Double _12monthLow) {
    this._12monthLow = _12monthLow;
    return this;
  }

  /**
   * Lowest price of the fund over the last year
   * @return _12monthLow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_12MONTH_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get12monthLow() {
    return _12monthLow;
  }


  @JsonProperty(value = JSON_PROPERTY_12MONTH_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set12monthLow(@javax.annotation.Nullable Double _12monthLow) {
    this._12monthLow = _12monthLow;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing _12monthHigh(@javax.annotation.Nullable Double _12monthHigh) {
    this._12monthHigh = _12monthHigh;
    return this;
  }

  /**
   * Highest price of the fund over the last year
   * @return _12monthHigh
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_12MONTH_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get12monthHigh() {
    return _12monthHigh;
  }


  @JsonProperty(value = JSON_PROPERTY_12MONTH_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set12monthHigh(@javax.annotation.Nullable Double _12monthHigh) {
    this._12monthHigh = _12monthHigh;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing lastMonth(@javax.annotation.Nullable Double lastMonth) {
    this.lastMonth = lastMonth;
    return this;
  }

  /**
   * Fund price at the end of the last month
   * @return lastMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLastMonth() {
    return lastMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMonth(@javax.annotation.Nullable Double lastMonth) {
    this.lastMonth = lastMonth;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_purchase_info_pricing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing getMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing = (GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing) o;
    return Objects.equals(this.nav, getMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.nav) &&
        Objects.equals(this._12monthLow, getMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing._12monthLow) &&
        Objects.equals(this._12monthHigh, getMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing._12monthHigh) &&
        Objects.equals(this.lastMonth, getMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing.lastMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nav, _12monthLow, _12monthHigh, lastMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing {\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    _12monthLow: ").append(toIndentedString(_12monthLow)).append("\n");
    sb.append("    _12monthHigh: ").append(toIndentedString(_12monthHigh)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
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

    // add `nav` to the URL query string
    if (getNav() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snav%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNav()))));
    }

    // add `12_month_low` to the URL query string
    if (get12monthLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s12_month_low%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get12monthLow()))));
    }

    // add `12_month_high` to the URL query string
    if (get12monthHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s12_month_high%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get12monthHigh()))));
    }

    // add `last_month` to the URL query string
    if (getLastMonth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_month%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastMonth()))));
    }

    return joiner.toString();
  }
}

