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
import com.twelvedata.client.model.GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets;
import com.twelvedata.client.model.GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Assets section of the balance sheet
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerAssets.JSON_PROPERTY_CURRENT_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssets.JSON_PROPERTY_NON_CURRENT_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssets.JSON_PROPERTY_TOTAL_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerAssets {
  public static final String JSON_PROPERTY_CURRENT_ASSETS = "current_assets";
  @javax.annotation.Nullable
  private GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets currentAssets;

  public static final String JSON_PROPERTY_NON_CURRENT_ASSETS = "non_current_assets";
  @javax.annotation.Nullable
  private GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets nonCurrentAssets;

  public static final String JSON_PROPERTY_TOTAL_ASSETS = "total_assets";
  @javax.annotation.Nullable
  private Double totalAssets;

  public GetBalanceSheet200ResponseBalanceSheetInnerAssets() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerAssets currentAssets(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets currentAssets) {
    this.currentAssets = currentAssets;
    return this;
  }

  /**
   * Get currentAssets
   * @return currentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets getCurrentAssets() {
    return currentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAssets(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerAssetsCurrentAssets currentAssets) {
    this.currentAssets = currentAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssets nonCurrentAssets(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets nonCurrentAssets) {
    this.nonCurrentAssets = nonCurrentAssets;
    return this;
  }

  /**
   * Get nonCurrentAssets
   * @return nonCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets getNonCurrentAssets() {
    return nonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentAssets(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets nonCurrentAssets) {
    this.nonCurrentAssets = nonCurrentAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssets totalAssets(@javax.annotation.Nullable Double totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * The sum of total_current_assets + total_non_current_assets
   * @return totalAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalAssets() {
    return totalAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAssets(@javax.annotation.Nullable Double totalAssets) {
    this.totalAssets = totalAssets;
  }


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerAssets getBalanceSheet200ResponseBalanceSheetInnerAssets = (GetBalanceSheet200ResponseBalanceSheetInnerAssets) o;
    return Objects.equals(this.currentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssets.currentAssets) &&
        Objects.equals(this.nonCurrentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssets.nonCurrentAssets) &&
        Objects.equals(this.totalAssets, getBalanceSheet200ResponseBalanceSheetInnerAssets.totalAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAssets, nonCurrentAssets, totalAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerAssets {\n");
    sb.append("    currentAssets: ").append(toIndentedString(currentAssets)).append("\n");
    sb.append("    nonCurrentAssets: ").append(toIndentedString(nonCurrentAssets)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
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

    // add `current_assets` to the URL query string
    if (getCurrentAssets() != null) {
      joiner.add(getCurrentAssets().toUrlQueryString(prefix + "current_assets" + suffix));
    }

    // add `non_current_assets` to the URL query string
    if (getNonCurrentAssets() != null) {
      joiner.add(getNonCurrentAssets().toUrlQueryString(prefix + "non_current_assets" + suffix));
    }

    // add `total_assets` to the URL query string
    if (getTotalAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalAssets()))));
    }

    return joiner.toString();
  }
}

