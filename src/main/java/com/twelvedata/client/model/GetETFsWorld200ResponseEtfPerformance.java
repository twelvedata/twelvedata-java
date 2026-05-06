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
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Detailed performance of a etf
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfPerformance.JSON_PROPERTY_TRAILING_RETURNS,
  GetETFsWorld200ResponseEtfPerformance.JSON_PROPERTY_ANNUAL_TOTAL_RETURNS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfPerformance {
  public static final String JSON_PROPERTY_TRAILING_RETURNS = "trailing_returns";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner> trailingReturns = new ArrayList<>();

  public static final String JSON_PROPERTY_ANNUAL_TOTAL_RETURNS = "annual_total_returns";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner> annualTotalReturns = new ArrayList<>();

  public GetETFsWorld200ResponseEtfPerformance() { 
  }

  public GetETFsWorld200ResponseEtfPerformance trailingReturns(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner> trailingReturns) {
    this.trailingReturns = trailingReturns;
    return this;
  }

  public GetETFsWorld200ResponseEtfPerformance addTrailingReturnsItem(GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner trailingReturnsItem) {
    if (this.trailingReturns == null) {
      this.trailingReturns = new ArrayList<>();
    }
    this.trailingReturns.add(trailingReturnsItem);
    return this;
  }

  /**
   * Performance returns of the fund and its category over various trailing time periods
   * @return trailingReturns
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAILING_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner> getTrailingReturns() {
    return trailingReturns;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAILING_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrailingReturns(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfPerformanceTrailingReturnsInner> trailingReturns) {
    this.trailingReturns = trailingReturns;
  }


  public GetETFsWorld200ResponseEtfPerformance annualTotalReturns(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner> annualTotalReturns) {
    this.annualTotalReturns = annualTotalReturns;
    return this;
  }

  public GetETFsWorld200ResponseEtfPerformance addAnnualTotalReturnsItem(GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner annualTotalReturnsItem) {
    if (this.annualTotalReturns == null) {
      this.annualTotalReturns = new ArrayList<>();
    }
    this.annualTotalReturns.add(annualTotalReturnsItem);
    return this;
  }

  /**
   * Fund and category total returns (%) for each calendar year
   * @return annualTotalReturns
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANNUAL_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner> getAnnualTotalReturns() {
    return annualTotalReturns;
  }


  @JsonProperty(value = JSON_PROPERTY_ANNUAL_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualTotalReturns(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfPerformanceAnnualTotalReturnsInner> annualTotalReturns) {
    this.annualTotalReturns = annualTotalReturns;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_performance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfPerformance getETFsWorld200ResponseEtfPerformance = (GetETFsWorld200ResponseEtfPerformance) o;
    return Objects.equals(this.trailingReturns, getETFsWorld200ResponseEtfPerformance.trailingReturns) &&
        Objects.equals(this.annualTotalReturns, getETFsWorld200ResponseEtfPerformance.annualTotalReturns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trailingReturns, annualTotalReturns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfPerformance {\n");
    sb.append("    trailingReturns: ").append(toIndentedString(trailingReturns)).append("\n");
    sb.append("    annualTotalReturns: ").append(toIndentedString(annualTotalReturns)).append("\n");
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

    // add `trailing_returns` to the URL query string
    if (getTrailingReturns() != null) {
      for (int i = 0; i < getTrailingReturns().size(); i++) {
        if (getTrailingReturns().get(i) != null) {
          joiner.add(getTrailingReturns().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%strailing_returns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `annual_total_returns` to the URL query string
    if (getAnnualTotalReturns() != null) {
      for (int i = 0; i < getAnnualTotalReturns().size(); i++) {
        if (getAnnualTotalReturns().get(i) != null) {
          joiner.add(getAnnualTotalReturns().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sannual_total_returns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

