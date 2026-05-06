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
 * GetEarningsEstimate200ResponseEarningsEstimateInner
 */
@JsonPropertyOrder({
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_DATE,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_PERIOD,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_NUMBER_OF_ANALYSTS,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_AVG_ESTIMATE,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_LOW_ESTIMATE,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_HIGH_ESTIMATE,
  GetEarningsEstimate200ResponseEarningsEstimateInner.JSON_PROPERTY_YEAR_AGO_EPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEarningsEstimate200ResponseEarningsEstimateInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nonnull
  private String period;

  public static final String JSON_PROPERTY_NUMBER_OF_ANALYSTS = "number_of_analysts";
  @javax.annotation.Nullable
  private Long numberOfAnalysts;

  public static final String JSON_PROPERTY_AVG_ESTIMATE = "avg_estimate";
  @javax.annotation.Nullable
  private Double avgEstimate;

  public static final String JSON_PROPERTY_LOW_ESTIMATE = "low_estimate";
  @javax.annotation.Nullable
  private Double lowEstimate;

  public static final String JSON_PROPERTY_HIGH_ESTIMATE = "high_estimate";
  @javax.annotation.Nullable
  private Double highEstimate;

  public static final String JSON_PROPERTY_YEAR_AGO_EPS = "year_ago_eps";
  @javax.annotation.Nullable
  private Double yearAgoEps;

  public GetEarningsEstimate200ResponseEarningsEstimateInner() { 
  }

  public GetEarningsEstimate200ResponseEarningsEstimateInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the earnings estimate
   * @return date
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@javax.annotation.Nonnull String date) {
    this.date = date;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner period(@javax.annotation.Nonnull String period) {
    this.period = period;
    return this;
  }

  /**
   * Period of estimation, can be &#x60;current_quarter&#x60;, &#x60;next_quarter&#x60;, &#x60;current_year&#x60;, or &#x60;next_year&#x60;
   * @return period
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriod(@javax.annotation.Nonnull String period) {
    this.period = period;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner numberOfAnalysts(@javax.annotation.Nullable Long numberOfAnalysts) {
    this.numberOfAnalysts = numberOfAnalysts;
    return this;
  }

  /**
   * Number of analysts that made the estimation
   * @return numberOfAnalysts
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NUMBER_OF_ANALYSTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfAnalysts() {
    return numberOfAnalysts;
  }


  @JsonProperty(value = JSON_PROPERTY_NUMBER_OF_ANALYSTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfAnalysts(@javax.annotation.Nullable Long numberOfAnalysts) {
    this.numberOfAnalysts = numberOfAnalysts;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner avgEstimate(@javax.annotation.Nullable Double avgEstimate) {
    this.avgEstimate = avgEstimate;
    return this;
  }

  /**
   * Average estimation across analysts
   * @return avgEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVG_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAvgEstimate() {
    return avgEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_AVG_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgEstimate(@javax.annotation.Nullable Double avgEstimate) {
    this.avgEstimate = avgEstimate;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner lowEstimate(@javax.annotation.Nullable Double lowEstimate) {
    this.lowEstimate = lowEstimate;
    return this;
  }

  /**
   * Lowest estimation given by an analyst
   * @return lowEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOW_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLowEstimate() {
    return lowEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowEstimate(@javax.annotation.Nullable Double lowEstimate) {
    this.lowEstimate = lowEstimate;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner highEstimate(@javax.annotation.Nullable Double highEstimate) {
    this.highEstimate = highEstimate;
    return this;
  }

  /**
   * Highest estimation given by an analyst
   * @return highEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGH_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHighEstimate() {
    return highEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighEstimate(@javax.annotation.Nullable Double highEstimate) {
    this.highEstimate = highEstimate;
  }


  public GetEarningsEstimate200ResponseEarningsEstimateInner yearAgoEps(@javax.annotation.Nullable Double yearAgoEps) {
    this.yearAgoEps = yearAgoEps;
    return this;
  }

  /**
   * Average estimation of this period&#39;s earnings given a year ago
   * @return yearAgoEps
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR_AGO_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getYearAgoEps() {
    return yearAgoEps;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR_AGO_EPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearAgoEps(@javax.annotation.Nullable Double yearAgoEps) {
    this.yearAgoEps = yearAgoEps;
  }


  /**
   * Return true if this GetEarningsEstimate_200_response_earnings_estimate_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEarningsEstimate200ResponseEarningsEstimateInner getEarningsEstimate200ResponseEarningsEstimateInner = (GetEarningsEstimate200ResponseEarningsEstimateInner) o;
    return Objects.equals(this.date, getEarningsEstimate200ResponseEarningsEstimateInner.date) &&
        Objects.equals(this.period, getEarningsEstimate200ResponseEarningsEstimateInner.period) &&
        Objects.equals(this.numberOfAnalysts, getEarningsEstimate200ResponseEarningsEstimateInner.numberOfAnalysts) &&
        Objects.equals(this.avgEstimate, getEarningsEstimate200ResponseEarningsEstimateInner.avgEstimate) &&
        Objects.equals(this.lowEstimate, getEarningsEstimate200ResponseEarningsEstimateInner.lowEstimate) &&
        Objects.equals(this.highEstimate, getEarningsEstimate200ResponseEarningsEstimateInner.highEstimate) &&
        Objects.equals(this.yearAgoEps, getEarningsEstimate200ResponseEarningsEstimateInner.yearAgoEps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, numberOfAnalysts, avgEstimate, lowEstimate, highEstimate, yearAgoEps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEarningsEstimate200ResponseEarningsEstimateInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    numberOfAnalysts: ").append(toIndentedString(numberOfAnalysts)).append("\n");
    sb.append("    avgEstimate: ").append(toIndentedString(avgEstimate)).append("\n");
    sb.append("    lowEstimate: ").append(toIndentedString(lowEstimate)).append("\n");
    sb.append("    highEstimate: ").append(toIndentedString(highEstimate)).append("\n");
    sb.append("    yearAgoEps: ").append(toIndentedString(yearAgoEps)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDate()))));
    }

    // add `period` to the URL query string
    if (getPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPeriod()))));
    }

    // add `number_of_analysts` to the URL query string
    if (getNumberOfAnalysts() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snumber_of_analysts%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNumberOfAnalysts()))));
    }

    // add `avg_estimate` to the URL query string
    if (getAvgEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%savg_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvgEstimate()))));
    }

    // add `low_estimate` to the URL query string
    if (getLowEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLowEstimate()))));
    }

    // add `high_estimate` to the URL query string
    if (getHighEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHighEstimate()))));
    }

    // add `year_ago_eps` to the URL query string
    if (getYearAgoEps() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear_ago_eps%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYearAgoEps()))));
    }

    return joiner.toString();
  }
}

