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
 * GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.JSON_PROPERTY_PERIOD,
  GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.JSON_PROPERTY_SHARE_CLASS_RETURN,
  GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.JSON_PROPERTY_CATEGORY_RETURN,
  GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.JSON_PROPERTY_RANK_IN_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner {
  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
  private String period;

  public static final String JSON_PROPERTY_SHARE_CLASS_RETURN = "share_class_return";
  @javax.annotation.Nullable
  private Double shareClassReturn;

  public static final String JSON_PROPERTY_CATEGORY_RETURN = "category_return";
  @javax.annotation.Nullable
  private Double categoryReturn;

  public static final String JSON_PROPERTY_RANK_IN_CATEGORY = "rank_in_category";
  @javax.annotation.Nullable
  private Long rankInCategory;

  public GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner period(@javax.annotation.Nullable String period) {
    this.period = period;
    return this;
  }

  /**
   * Period of trailing returns
   * @return period
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(@javax.annotation.Nullable String period) {
    this.period = period;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner shareClassReturn(@javax.annotation.Nullable Double shareClassReturn) {
    this.shareClassReturn = shareClassReturn;
    return this;
  }

  /**
   * Fund returns (%) generated over a given period
   * @return shareClassReturn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARE_CLASS_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShareClassReturn() {
    return shareClassReturn;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARE_CLASS_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareClassReturn(@javax.annotation.Nullable Double shareClassReturn) {
    this.shareClassReturn = shareClassReturn;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner categoryReturn(@javax.annotation.Nullable Double categoryReturn) {
    this.categoryReturn = categoryReturn;
    return this;
  }

  /**
   * Same category average returns (%) generated over a given period
   * @return categoryReturn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CATEGORY_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCategoryReturn() {
    return categoryReturn;
  }


  @JsonProperty(value = JSON_PROPERTY_CATEGORY_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryReturn(@javax.annotation.Nullable Double categoryReturn) {
    this.categoryReturn = categoryReturn;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner rankInCategory(@javax.annotation.Nullable Long rankInCategory) {
    this.rankInCategory = rankInCategory;
    return this;
  }

  /**
   * Rank of a fund in category by total returns
   * @return rankInCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RANK_IN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRankInCategory() {
    return rankInCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_RANK_IN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRankInCategory(@javax.annotation.Nullable Long rankInCategory) {
    this.rankInCategory = rankInCategory;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_performance_trailing_returns_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner getMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner = (GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner) o;
    return Objects.equals(this.period, getMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.period) &&
        Objects.equals(this.shareClassReturn, getMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.shareClassReturn) &&
        Objects.equals(this.categoryReturn, getMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.categoryReturn) &&
        Objects.equals(this.rankInCategory, getMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner.rankInCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, shareClassReturn, categoryReturn, rankInCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    shareClassReturn: ").append(toIndentedString(shareClassReturn)).append("\n");
    sb.append("    categoryReturn: ").append(toIndentedString(categoryReturn)).append("\n");
    sb.append("    rankInCategory: ").append(toIndentedString(rankInCategory)).append("\n");
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPeriod()))));
    }

    // add `share_class_return` to the URL query string
    if (getShareClassReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshare_class_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShareClassReturn()))));
    }

    // add `category_return` to the URL query string
    if (getCategoryReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scategory_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCategoryReturn()))));
    }

    // add `rank_in_category` to the URL query string
    if (getRankInCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srank_in_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRankInCategory()))));
    }

    return joiner.toString();
  }
}

