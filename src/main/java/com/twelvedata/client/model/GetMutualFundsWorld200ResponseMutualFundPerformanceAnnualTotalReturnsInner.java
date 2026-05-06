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
 * GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.JSON_PROPERTY_YEAR,
  GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.JSON_PROPERTY_SHARE_CLASS_RETURN,
  GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.JSON_PROPERTY_CATEGORY_RETURN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner {
  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Long year;

  public static final String JSON_PROPERTY_SHARE_CLASS_RETURN = "share_class_return";
  @javax.annotation.Nullable
  private Double shareClassReturn;

  public static final String JSON_PROPERTY_CATEGORY_RETURN = "category_return";
  @javax.annotation.Nullable
  private Double categoryReturn;

  public GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner year(@javax.annotation.Nullable Long year) {
    this.year = year;
    return this;
  }

  /**
   * Year of total returns
   * @return year
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getYear() {
    return year;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(@javax.annotation.Nullable Long year) {
    this.year = year;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner shareClassReturn(@javax.annotation.Nullable Double shareClassReturn) {
    this.shareClassReturn = shareClassReturn;
    return this;
  }

  /**
   * Fund total returns (%) generated over a given year
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


  public GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner categoryReturn(@javax.annotation.Nullable Double categoryReturn) {
    this.categoryReturn = categoryReturn;
    return this;
  }

  /**
   * Same category average total returns (%) generated over a given year
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


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_performance_annual_total_returns_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner getMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner = (GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner) o;
    return Objects.equals(this.year, getMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.year) &&
        Objects.equals(this.shareClassReturn, getMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.shareClassReturn) &&
        Objects.equals(this.categoryReturn, getMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner.categoryReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, shareClassReturn, categoryReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    shareClassReturn: ").append(toIndentedString(shareClassReturn)).append("\n");
    sb.append("    categoryReturn: ").append(toIndentedString(categoryReturn)).append("\n");
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

    // add `year` to the URL query string
    if (getYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYear()))));
    }

    // add `share_class_return` to the URL query string
    if (getShareClassReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshare_class_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShareClassReturn()))));
    }

    // add `category_return` to the URL query string
    if (getCategoryReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scategory_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCategoryReturn()))));
    }

    return joiner.toString();
  }
}

