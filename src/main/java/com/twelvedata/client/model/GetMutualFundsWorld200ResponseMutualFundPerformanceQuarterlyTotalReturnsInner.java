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
 * GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.JSON_PROPERTY_YEAR,
  GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.JSON_PROPERTY_Q1,
  GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.JSON_PROPERTY_Q2,
  GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.JSON_PROPERTY_Q3,
  GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.JSON_PROPERTY_Q4
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner {
  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Long year;

  public static final String JSON_PROPERTY_Q1 = "q1";
  @javax.annotation.Nullable
  private Double q1;

  public static final String JSON_PROPERTY_Q2 = "q2";
  @javax.annotation.Nullable
  private Double q2;

  public static final String JSON_PROPERTY_Q3 = "q3";
  @javax.annotation.Nullable
  private Double q3;

  public static final String JSON_PROPERTY_Q4 = "q4";
  @javax.annotation.Nullable
  private Double q4;

  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner year(@javax.annotation.Nullable Long year) {
    this.year = year;
    return this;
  }

  /**
   * Year of a fund quarter return
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


  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner q1(@javax.annotation.Nullable Double q1) {
    this.q1 = q1;
    return this;
  }

  /**
   * Total return (%) of a fund in the first quarter
   * @return q1
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_Q1, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQ1() {
    return q1;
  }


  @JsonProperty(value = JSON_PROPERTY_Q1, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQ1(@javax.annotation.Nullable Double q1) {
    this.q1 = q1;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner q2(@javax.annotation.Nullable Double q2) {
    this.q2 = q2;
    return this;
  }

  /**
   * Total return (%) of a fund in the second quarter
   * @return q2
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_Q2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQ2() {
    return q2;
  }


  @JsonProperty(value = JSON_PROPERTY_Q2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQ2(@javax.annotation.Nullable Double q2) {
    this.q2 = q2;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner q3(@javax.annotation.Nullable Double q3) {
    this.q3 = q3;
    return this;
  }

  /**
   * Total return (%) of a fund in the third quarter
   * @return q3
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_Q3, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQ3() {
    return q3;
  }


  @JsonProperty(value = JSON_PROPERTY_Q3, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQ3(@javax.annotation.Nullable Double q3) {
    this.q3 = q3;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner q4(@javax.annotation.Nullable Double q4) {
    this.q4 = q4;
    return this;
  }

  /**
   * Total return (%) of a fund in the fourth quarter
   * @return q4
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_Q4, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getQ4() {
    return q4;
  }


  @JsonProperty(value = JSON_PROPERTY_Q4, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQ4(@javax.annotation.Nullable Double q4) {
    this.q4 = q4;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_performance_quarterly_total_returns_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner = (GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner) o;
    return Objects.equals(this.year, getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.year) &&
        Objects.equals(this.q1, getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.q1) &&
        Objects.equals(this.q2, getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.q2) &&
        Objects.equals(this.q3, getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.q3) &&
        Objects.equals(this.q4, getMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner.q4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, q1, q2, q3, q4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPerformanceQuarterlyTotalReturnsInner {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    q1: ").append(toIndentedString(q1)).append("\n");
    sb.append("    q2: ").append(toIndentedString(q2)).append("\n");
    sb.append("    q3: ").append(toIndentedString(q3)).append("\n");
    sb.append("    q4: ").append(toIndentedString(q4)).append("\n");
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

    // add `q1` to the URL query string
    if (getQ1() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sq1%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQ1()))));
    }

    // add `q2` to the URL query string
    if (getQ2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sq2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQ2()))));
    }

    // add `q3` to the URL query string
    if (getQ3() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sq3%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQ3()))));
    }

    // add `q4` to the URL query string
    if (getQ4() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sq4%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQ4()))));
    }

    return joiner.toString();
  }
}

