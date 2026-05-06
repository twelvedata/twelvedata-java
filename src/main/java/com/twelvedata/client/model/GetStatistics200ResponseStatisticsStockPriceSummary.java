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
 * Stock price summary of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_FIFTY_TWO_WEEK_LOW,
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_FIFTY_TWO_WEEK_HIGH,
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_FIFTY_TWO_WEEK_CHANGE,
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_BETA,
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_DAY50_MA,
  GetStatistics200ResponseStatisticsStockPriceSummary.JSON_PROPERTY_DAY200_MA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsStockPriceSummary {
  public static final String JSON_PROPERTY_FIFTY_TWO_WEEK_LOW = "fifty_two_week_low";
  @javax.annotation.Nullable
  private Double fiftyTwoWeekLow;

  public static final String JSON_PROPERTY_FIFTY_TWO_WEEK_HIGH = "fifty_two_week_high";
  @javax.annotation.Nullable
  private Double fiftyTwoWeekHigh;

  public static final String JSON_PROPERTY_FIFTY_TWO_WEEK_CHANGE = "fifty_two_week_change";
  @javax.annotation.Nullable
  private Double fiftyTwoWeekChange;

  public static final String JSON_PROPERTY_BETA = "beta";
  @javax.annotation.Nullable
  private Double beta;

  public static final String JSON_PROPERTY_DAY50_MA = "day_50_ma";
  @javax.annotation.Nullable
  private Double day50Ma;

  public static final String JSON_PROPERTY_DAY200_MA = "day_200_ma";
  @javax.annotation.Nullable
  private Double day200Ma;

  public GetStatistics200ResponseStatisticsStockPriceSummary() { 
  }

  public GetStatistics200ResponseStatisticsStockPriceSummary fiftyTwoWeekLow(@javax.annotation.Nullable Double fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    return this;
  }

  /**
   * Refers to the lowest price at which stock traded during a year
   * @return fiftyTwoWeekLow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFiftyTwoWeekLow() {
    return fiftyTwoWeekLow;
  }


  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiftyTwoWeekLow(@javax.annotation.Nullable Double fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
  }


  public GetStatistics200ResponseStatisticsStockPriceSummary fiftyTwoWeekHigh(@javax.annotation.Nullable Double fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    return this;
  }

  /**
   * Refers to the highest price at which stock traded during a year
   * @return fiftyTwoWeekHigh
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFiftyTwoWeekHigh() {
    return fiftyTwoWeekHigh;
  }


  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiftyTwoWeekHigh(@javax.annotation.Nullable Double fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
  }


  public GetStatistics200ResponseStatisticsStockPriceSummary fiftyTwoWeekChange(@javax.annotation.Nullable Double fiftyTwoWeekChange) {
    this.fiftyTwoWeekChange = fiftyTwoWeekChange;
    return this;
  }

  /**
   * Refers to the change between lowest and highest prices during a year
   * @return fiftyTwoWeekChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFiftyTwoWeekChange() {
    return fiftyTwoWeekChange;
  }


  @JsonProperty(value = JSON_PROPERTY_FIFTY_TWO_WEEK_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiftyTwoWeekChange(@javax.annotation.Nullable Double fiftyTwoWeekChange) {
    this.fiftyTwoWeekChange = fiftyTwoWeekChange;
  }


  public GetStatistics200ResponseStatisticsStockPriceSummary beta(@javax.annotation.Nullable Double beta) {
    this.beta = beta;
    return this;
  }

  /**
   * Refers to beta measure relative to the primary benchmark (index) of the country
   * @return beta
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BETA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBeta() {
    return beta;
  }


  @JsonProperty(value = JSON_PROPERTY_BETA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeta(@javax.annotation.Nullable Double beta) {
    this.beta = beta;
  }


  public GetStatistics200ResponseStatisticsStockPriceSummary day50Ma(@javax.annotation.Nullable Double day50Ma) {
    this.day50Ma = day50Ma;
    return this;
  }

  /**
   * Refers to the 50-day simple moving average
   * @return day50Ma
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DAY50_MA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDay50Ma() {
    return day50Ma;
  }


  @JsonProperty(value = JSON_PROPERTY_DAY50_MA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay50Ma(@javax.annotation.Nullable Double day50Ma) {
    this.day50Ma = day50Ma;
  }


  public GetStatistics200ResponseStatisticsStockPriceSummary day200Ma(@javax.annotation.Nullable Double day200Ma) {
    this.day200Ma = day200Ma;
    return this;
  }

  /**
   * Refers to the 200-day simple moving average
   * @return day200Ma
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DAY200_MA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDay200Ma() {
    return day200Ma;
  }


  @JsonProperty(value = JSON_PROPERTY_DAY200_MA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay200Ma(@javax.annotation.Nullable Double day200Ma) {
    this.day200Ma = day200Ma;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_stock_price_summary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsStockPriceSummary getStatistics200ResponseStatisticsStockPriceSummary = (GetStatistics200ResponseStatisticsStockPriceSummary) o;
    return Objects.equals(this.fiftyTwoWeekLow, getStatistics200ResponseStatisticsStockPriceSummary.fiftyTwoWeekLow) &&
        Objects.equals(this.fiftyTwoWeekHigh, getStatistics200ResponseStatisticsStockPriceSummary.fiftyTwoWeekHigh) &&
        Objects.equals(this.fiftyTwoWeekChange, getStatistics200ResponseStatisticsStockPriceSummary.fiftyTwoWeekChange) &&
        Objects.equals(this.beta, getStatistics200ResponseStatisticsStockPriceSummary.beta) &&
        Objects.equals(this.day50Ma, getStatistics200ResponseStatisticsStockPriceSummary.day50Ma) &&
        Objects.equals(this.day200Ma, getStatistics200ResponseStatisticsStockPriceSummary.day200Ma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiftyTwoWeekLow, fiftyTwoWeekHigh, fiftyTwoWeekChange, beta, day50Ma, day200Ma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsStockPriceSummary {\n");
    sb.append("    fiftyTwoWeekLow: ").append(toIndentedString(fiftyTwoWeekLow)).append("\n");
    sb.append("    fiftyTwoWeekHigh: ").append(toIndentedString(fiftyTwoWeekHigh)).append("\n");
    sb.append("    fiftyTwoWeekChange: ").append(toIndentedString(fiftyTwoWeekChange)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    day50Ma: ").append(toIndentedString(day50Ma)).append("\n");
    sb.append("    day200Ma: ").append(toIndentedString(day200Ma)).append("\n");
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

    // add `fifty_two_week_low` to the URL query string
    if (getFiftyTwoWeekLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfifty_two_week_low%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiftyTwoWeekLow()))));
    }

    // add `fifty_two_week_high` to the URL query string
    if (getFiftyTwoWeekHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfifty_two_week_high%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiftyTwoWeekHigh()))));
    }

    // add `fifty_two_week_change` to the URL query string
    if (getFiftyTwoWeekChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfifty_two_week_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiftyTwoWeekChange()))));
    }

    // add `beta` to the URL query string
    if (getBeta() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbeta%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBeta()))));
    }

    // add `day_50_ma` to the URL query string
    if (getDay50Ma() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sday_50_ma%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDay50Ma()))));
    }

    // add `day_200_ma` to the URL query string
    if (getDay200Ma() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sday_200_ma%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDay200Ma()))));
    }

    return joiner.toString();
  }
}

