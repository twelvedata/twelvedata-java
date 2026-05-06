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
 * GetRevenueEstimate200ResponseRevenueEstimateInner
 */
@JsonPropertyOrder({
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_DATE,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_PERIOD,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_NUMBER_OF_ANALYSTS,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_AVG_ESTIMATE,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_LOW_ESTIMATE,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_HIGH_ESTIMATE,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_YEAR_AGO_SALES,
  GetRevenueEstimate200ResponseRevenueEstimateInner.JSON_PROPERTY_SALES_GROWTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetRevenueEstimate200ResponseRevenueEstimateInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable
  private String date;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
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

  public static final String JSON_PROPERTY_YEAR_AGO_SALES = "year_ago_sales";
  @javax.annotation.Nullable
  private Double yearAgoSales;

  public static final String JSON_PROPERTY_SALES_GROWTH = "sales_growth";
  @javax.annotation.Nullable
  private Double salesGrowth;

  public GetRevenueEstimate200ResponseRevenueEstimateInner() { 
  }

  public GetRevenueEstimate200ResponseRevenueEstimateInner date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the estimate
   * @return date
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public GetRevenueEstimate200ResponseRevenueEstimateInner period(@javax.annotation.Nullable String period) {
    this.period = period;
    return this;
  }

  /**
   * Period of estimation, can be &#x60;current_quarter&#x60;, &#x60;next_quarter&#x60;, &#x60;current_year&#x60;, or &#x60;next_year&#x60;
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


  public GetRevenueEstimate200ResponseRevenueEstimateInner numberOfAnalysts(@javax.annotation.Nullable Long numberOfAnalysts) {
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


  public GetRevenueEstimate200ResponseRevenueEstimateInner avgEstimate(@javax.annotation.Nullable Double avgEstimate) {
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


  public GetRevenueEstimate200ResponseRevenueEstimateInner lowEstimate(@javax.annotation.Nullable Double lowEstimate) {
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


  public GetRevenueEstimate200ResponseRevenueEstimateInner highEstimate(@javax.annotation.Nullable Double highEstimate) {
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


  public GetRevenueEstimate200ResponseRevenueEstimateInner yearAgoSales(@javax.annotation.Nullable Double yearAgoSales) {
    this.yearAgoSales = yearAgoSales;
    return this;
  }

  /**
   * Total revenue received a year ago relative to period
   * @return yearAgoSales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR_AGO_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getYearAgoSales() {
    return yearAgoSales;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR_AGO_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearAgoSales(@javax.annotation.Nullable Double yearAgoSales) {
    this.yearAgoSales = yearAgoSales;
  }


  public GetRevenueEstimate200ResponseRevenueEstimateInner salesGrowth(@javax.annotation.Nullable Double salesGrowth) {
    this.salesGrowth = salesGrowth;
    return this;
  }

  /**
   * Estimated sales growth of the period in relation to year-ago sales in prc (%)
   * @return salesGrowth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALES_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSalesGrowth() {
    return salesGrowth;
  }


  @JsonProperty(value = JSON_PROPERTY_SALES_GROWTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesGrowth(@javax.annotation.Nullable Double salesGrowth) {
    this.salesGrowth = salesGrowth;
  }


  /**
   * Return true if this GetRevenueEstimate_200_response_revenue_estimate_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRevenueEstimate200ResponseRevenueEstimateInner getRevenueEstimate200ResponseRevenueEstimateInner = (GetRevenueEstimate200ResponseRevenueEstimateInner) o;
    return Objects.equals(this.date, getRevenueEstimate200ResponseRevenueEstimateInner.date) &&
        Objects.equals(this.period, getRevenueEstimate200ResponseRevenueEstimateInner.period) &&
        Objects.equals(this.numberOfAnalysts, getRevenueEstimate200ResponseRevenueEstimateInner.numberOfAnalysts) &&
        Objects.equals(this.avgEstimate, getRevenueEstimate200ResponseRevenueEstimateInner.avgEstimate) &&
        Objects.equals(this.lowEstimate, getRevenueEstimate200ResponseRevenueEstimateInner.lowEstimate) &&
        Objects.equals(this.highEstimate, getRevenueEstimate200ResponseRevenueEstimateInner.highEstimate) &&
        Objects.equals(this.yearAgoSales, getRevenueEstimate200ResponseRevenueEstimateInner.yearAgoSales) &&
        Objects.equals(this.salesGrowth, getRevenueEstimate200ResponseRevenueEstimateInner.salesGrowth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, numberOfAnalysts, avgEstimate, lowEstimate, highEstimate, yearAgoSales, salesGrowth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRevenueEstimate200ResponseRevenueEstimateInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    numberOfAnalysts: ").append(toIndentedString(numberOfAnalysts)).append("\n");
    sb.append("    avgEstimate: ").append(toIndentedString(avgEstimate)).append("\n");
    sb.append("    lowEstimate: ").append(toIndentedString(lowEstimate)).append("\n");
    sb.append("    highEstimate: ").append(toIndentedString(highEstimate)).append("\n");
    sb.append("    yearAgoSales: ").append(toIndentedString(yearAgoSales)).append("\n");
    sb.append("    salesGrowth: ").append(toIndentedString(salesGrowth)).append("\n");
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

    // add `year_ago_sales` to the URL query string
    if (getYearAgoSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear_ago_sales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYearAgoSales()))));
    }

    // add `sales_growth` to the URL query string
    if (getSalesGrowth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssales_growth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSalesGrowth()))));
    }

    return joiner.toString();
  }
}

