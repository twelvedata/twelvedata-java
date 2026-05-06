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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Detailed performance of a mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPerformance.JSON_PROPERTY_TRAILING_RETURNS,
  GetMutualFundsWorld200ResponseMutualFundPerformance.JSON_PROPERTY_ANNUAL_TOTAL_RETURNS,
  GetMutualFundsWorld200ResponseMutualFundPerformance.JSON_PROPERTY_QUARTERLY_TOTAL_RETURNS,
  GetMutualFundsWorld200ResponseMutualFundPerformance.JSON_PROPERTY_LOAD_ADJUSTED_RETURN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPerformance {
  public static final String JSON_PROPERTY_TRAILING_RETURNS = "trailing_returns";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner> trailingReturns = new ArrayList<>();

  public static final String JSON_PROPERTY_ANNUAL_TOTAL_RETURNS = "annual_total_returns";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner> annualTotalReturns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUARTERLY_TOTAL_RETURNS = "quarterly_total_returns";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner> quarterlyTotalReturns = new ArrayList<>();

  public static final String JSON_PROPERTY_LOAD_ADJUSTED_RETURN = "load_adjusted_return";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner> loadAdjustedReturn = new ArrayList<>();

  public GetMutualFundsWorld200ResponseMutualFundPerformance() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformance trailingReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner> trailingReturns) {
    this.trailingReturns = trailingReturns;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformance addTrailingReturnsItem(GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner trailingReturnsItem) {
    if (this.trailingReturns == null) {
      this.trailingReturns = new ArrayList<>();
    }
    this.trailingReturns.add(trailingReturnsItem);
    return this;
  }

  /**
   * Trailing returns of the fund
   * @return trailingReturns
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAILING_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner> getTrailingReturns() {
    return trailingReturns;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAILING_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrailingReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceTrailingReturnsInner> trailingReturns) {
    this.trailingReturns = trailingReturns;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformance annualTotalReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner> annualTotalReturns) {
    this.annualTotalReturns = annualTotalReturns;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformance addAnnualTotalReturnsItem(GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner annualTotalReturnsItem) {
    if (this.annualTotalReturns == null) {
      this.annualTotalReturns = new ArrayList<>();
    }
    this.annualTotalReturns.add(annualTotalReturnsItem);
    return this;
  }

  /**
   * Annual total returns of the fund
   * @return annualTotalReturns
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANNUAL_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner> getAnnualTotalReturns() {
    return annualTotalReturns;
  }


  @JsonProperty(value = JSON_PROPERTY_ANNUAL_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualTotalReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceAnnualTotalReturnsInner> annualTotalReturns) {
    this.annualTotalReturns = annualTotalReturns;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformance quarterlyTotalReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner> quarterlyTotalReturns) {
    this.quarterlyTotalReturns = quarterlyTotalReturns;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformance addQuarterlyTotalReturnsItem(GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner quarterlyTotalReturnsItem) {
    if (this.quarterlyTotalReturns == null) {
      this.quarterlyTotalReturns = new ArrayList<>();
    }
    this.quarterlyTotalReturns.add(quarterlyTotalReturnsItem);
    return this;
  }

  /**
   * Quarterly total returns of the fund
   * @return quarterlyTotalReturns
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner> getQuarterlyTotalReturns() {
    return quarterlyTotalReturns;
  }


  @JsonProperty(value = JSON_PROPERTY_QUARTERLY_TOTAL_RETURNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarterlyTotalReturns(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner> quarterlyTotalReturns) {
    this.quarterlyTotalReturns = quarterlyTotalReturns;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformance loadAdjustedReturn(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner> loadAdjustedReturn) {
    this.loadAdjustedReturn = loadAdjustedReturn;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformance addLoadAdjustedReturnItem(GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner loadAdjustedReturnItem) {
    if (this.loadAdjustedReturn == null) {
      this.loadAdjustedReturn = new ArrayList<>();
    }
    this.loadAdjustedReturn.add(loadAdjustedReturnItem);
    return this;
  }

  /**
   * Load adjusted return of the fund
   * @return loadAdjustedReturn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_ADJUSTED_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner> getLoadAdjustedReturn() {
    return loadAdjustedReturn;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_ADJUSTED_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadAdjustedReturn(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner> loadAdjustedReturn) {
    this.loadAdjustedReturn = loadAdjustedReturn;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_performance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPerformance getMutualFundsWorld200ResponseMutualFundPerformance = (GetMutualFundsWorld200ResponseMutualFundPerformance) o;
    return Objects.equals(this.trailingReturns, getMutualFundsWorld200ResponseMutualFundPerformance.trailingReturns) &&
        Objects.equals(this.annualTotalReturns, getMutualFundsWorld200ResponseMutualFundPerformance.annualTotalReturns) &&
        Objects.equals(this.quarterlyTotalReturns, getMutualFundsWorld200ResponseMutualFundPerformance.quarterlyTotalReturns) &&
        Objects.equals(this.loadAdjustedReturn, getMutualFundsWorld200ResponseMutualFundPerformance.loadAdjustedReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trailingReturns, annualTotalReturns, quarterlyTotalReturns, loadAdjustedReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPerformance {\n");
    sb.append("    trailingReturns: ").append(toIndentedString(trailingReturns)).append("\n");
    sb.append("    annualTotalReturns: ").append(toIndentedString(annualTotalReturns)).append("\n");
    sb.append("    quarterlyTotalReturns: ").append(toIndentedString(quarterlyTotalReturns)).append("\n");
    sb.append("    loadAdjustedReturn: ").append(toIndentedString(loadAdjustedReturn)).append("\n");
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

    // add `quarterly_total_returns` to the URL query string
    if (getQuarterlyTotalReturns() != null) {
      for (int i = 0; i < getQuarterlyTotalReturns().size(); i++) {
        if (getQuarterlyTotalReturns().get(i) != null) {
          joiner.add(getQuarterlyTotalReturns().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%squarterly_total_returns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `load_adjusted_return` to the URL query string
    if (getLoadAdjustedReturn() != null) {
      for (int i = 0; i < getLoadAdjustedReturn().size(); i++) {
        if (getLoadAdjustedReturn().get(i) != null) {
          joiner.add(getLoadAdjustedReturn().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sload_adjusted_return%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

