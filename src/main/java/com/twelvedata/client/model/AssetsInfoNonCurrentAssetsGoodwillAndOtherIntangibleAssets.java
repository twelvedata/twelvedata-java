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
 * Goodwill and other intangible assets information
 */
@JsonPropertyOrder({
  AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.JSON_PROPERTY_GOODWILL,
  AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.JSON_PROPERTY_OTHER_INTANGIBLE_ASSETS,
  AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.JSON_PROPERTY_TOTAL_GOODWILL_AND_INTANGIBLE_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets {
  public static final String JSON_PROPERTY_GOODWILL = "goodwill";
  @javax.annotation.Nullable
  private Double goodwill;

  public static final String JSON_PROPERTY_OTHER_INTANGIBLE_ASSETS = "other_intangible_assets";
  @javax.annotation.Nullable
  private Double otherIntangibleAssets;

  public static final String JSON_PROPERTY_TOTAL_GOODWILL_AND_INTANGIBLE_ASSETS = "total_goodwill_and_intangible_assets";
  @javax.annotation.Nullable
  private Double totalGoodwillAndIntangibleAssets;

  public AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets() { 
  }

  public AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets goodwill(@javax.annotation.Nullable Double goodwill) {
    this.goodwill = goodwill;
    return this;
  }

  /**
   * Goodwill
   * @return goodwill
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGoodwill() {
    return goodwill;
  }


  @JsonProperty(value = JSON_PROPERTY_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodwill(@javax.annotation.Nullable Double goodwill) {
    this.goodwill = goodwill;
  }


  public AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets otherIntangibleAssets(@javax.annotation.Nullable Double otherIntangibleAssets) {
    this.otherIntangibleAssets = otherIntangibleAssets;
    return this;
  }

  /**
   * Other intangible assets
   * @return otherIntangibleAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherIntangibleAssets() {
    return otherIntangibleAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherIntangibleAssets(@javax.annotation.Nullable Double otherIntangibleAssets) {
    this.otherIntangibleAssets = otherIntangibleAssets;
  }


  public AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets totalGoodwillAndIntangibleAssets(@javax.annotation.Nullable Double totalGoodwillAndIntangibleAssets) {
    this.totalGoodwillAndIntangibleAssets = totalGoodwillAndIntangibleAssets;
    return this;
  }

  /**
   * Total goodwill and intangible assets
   * @return totalGoodwillAndIntangibleAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_GOODWILL_AND_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalGoodwillAndIntangibleAssets() {
    return totalGoodwillAndIntangibleAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_GOODWILL_AND_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalGoodwillAndIntangibleAssets(@javax.annotation.Nullable Double totalGoodwillAndIntangibleAssets) {
    this.totalGoodwillAndIntangibleAssets = totalGoodwillAndIntangibleAssets;
  }


  /**
   * Return true if this AssetsInfo_non_current_assets_goodwill_and_other_intangible_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets assetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets = (AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets) o;
    return Objects.equals(this.goodwill, assetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.goodwill) &&
        Objects.equals(this.otherIntangibleAssets, assetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.otherIntangibleAssets) &&
        Objects.equals(this.totalGoodwillAndIntangibleAssets, assetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets.totalGoodwillAndIntangibleAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodwill, otherIntangibleAssets, totalGoodwillAndIntangibleAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoNonCurrentAssetsGoodwillAndOtherIntangibleAssets {\n");
    sb.append("    goodwill: ").append(toIndentedString(goodwill)).append("\n");
    sb.append("    otherIntangibleAssets: ").append(toIndentedString(otherIntangibleAssets)).append("\n");
    sb.append("    totalGoodwillAndIntangibleAssets: ").append(toIndentedString(totalGoodwillAndIntangibleAssets)).append("\n");
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

    // add `goodwill` to the URL query string
    if (getGoodwill() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgoodwill%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGoodwill()))));
    }

    // add `other_intangible_assets` to the URL query string
    if (getOtherIntangibleAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_intangible_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherIntangibleAssets()))));
    }

    // add `total_goodwill_and_intangible_assets` to the URL query string
    if (getTotalGoodwillAndIntangibleAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_goodwill_and_intangible_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalGoodwillAndIntangibleAssets()))));
    }

    return joiner.toString();
  }
}

