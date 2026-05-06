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
import com.twelvedata.client.model.AssetsInfoCurrentAssets;
import com.twelvedata.client.model.AssetsInfoLiabilities;
import com.twelvedata.client.model.AssetsInfoNonCurrentAssets;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * AssetsInfo represents assets information in the balance sheet
 */
@JsonPropertyOrder({
  AssetsInfo.JSON_PROPERTY_TOTAL_ASSETS,
  AssetsInfo.JSON_PROPERTY_CURRENT_ASSETS,
  AssetsInfo.JSON_PROPERTY_NON_CURRENT_ASSETS,
  AssetsInfo.JSON_PROPERTY_LIABILITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfo {
  public static final String JSON_PROPERTY_TOTAL_ASSETS = "total_assets";
  @javax.annotation.Nullable
  private Double totalAssets;

  public static final String JSON_PROPERTY_CURRENT_ASSETS = "current_assets";
  @javax.annotation.Nullable
  private AssetsInfoCurrentAssets currentAssets;

  public static final String JSON_PROPERTY_NON_CURRENT_ASSETS = "non_current_assets";
  @javax.annotation.Nullable
  private AssetsInfoNonCurrentAssets nonCurrentAssets;

  public static final String JSON_PROPERTY_LIABILITIES = "liabilities";
  @javax.annotation.Nullable
  private AssetsInfoLiabilities liabilities;

  public AssetsInfo() { 
  }

  public AssetsInfo totalAssets(@javax.annotation.Nullable Double totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

  /**
   * Total assets
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


  public AssetsInfo currentAssets(@javax.annotation.Nullable AssetsInfoCurrentAssets currentAssets) {
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
  public AssetsInfoCurrentAssets getCurrentAssets() {
    return currentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAssets(@javax.annotation.Nullable AssetsInfoCurrentAssets currentAssets) {
    this.currentAssets = currentAssets;
  }


  public AssetsInfo nonCurrentAssets(@javax.annotation.Nullable AssetsInfoNonCurrentAssets nonCurrentAssets) {
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
  public AssetsInfoNonCurrentAssets getNonCurrentAssets() {
    return nonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentAssets(@javax.annotation.Nullable AssetsInfoNonCurrentAssets nonCurrentAssets) {
    this.nonCurrentAssets = nonCurrentAssets;
  }


  public AssetsInfo liabilities(@javax.annotation.Nullable AssetsInfoLiabilities liabilities) {
    this.liabilities = liabilities;
    return this;
  }

  /**
   * Get liabilities
   * @return liabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfoLiabilities getLiabilities() {
    return liabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiabilities(@javax.annotation.Nullable AssetsInfoLiabilities liabilities) {
    this.liabilities = liabilities;
  }


  /**
   * Return true if this AssetsInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfo assetsInfo = (AssetsInfo) o;
    return Objects.equals(this.totalAssets, assetsInfo.totalAssets) &&
        Objects.equals(this.currentAssets, assetsInfo.currentAssets) &&
        Objects.equals(this.nonCurrentAssets, assetsInfo.nonCurrentAssets) &&
        Objects.equals(this.liabilities, assetsInfo.liabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAssets, currentAssets, nonCurrentAssets, liabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfo {\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    currentAssets: ").append(toIndentedString(currentAssets)).append("\n");
    sb.append("    nonCurrentAssets: ").append(toIndentedString(nonCurrentAssets)).append("\n");
    sb.append("    liabilities: ").append(toIndentedString(liabilities)).append("\n");
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

    // add `total_assets` to the URL query string
    if (getTotalAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalAssets()))));
    }

    // add `current_assets` to the URL query string
    if (getCurrentAssets() != null) {
      joiner.add(getCurrentAssets().toUrlQueryString(prefix + "current_assets" + suffix));
    }

    // add `non_current_assets` to the URL query string
    if (getNonCurrentAssets() != null) {
      joiner.add(getNonCurrentAssets().toUrlQueryString(prefix + "non_current_assets" + suffix));
    }

    // add `liabilities` to the URL query string
    if (getLiabilities() != null) {
      joiner.add(getLiabilities().toUrlQueryString(prefix + "liabilities" + suffix));
    }

    return joiner.toString();
  }
}

