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
import com.twelvedata.client.model.GetRecommendations200ResponseTrends2MonthsAgo;
import com.twelvedata.client.model.GetRecommendations200ResponseTrends3MonthsAgo;
import com.twelvedata.client.model.GetRecommendations200ResponseTrendsCurrentMonth;
import com.twelvedata.client.model.GetRecommendations200ResponseTrendsPreviousMonth;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Analyst recommendations trends
 */
@JsonPropertyOrder({
  GetRecommendations200ResponseTrends.JSON_PROPERTY_CURRENT_MONTH,
  GetRecommendations200ResponseTrends.JSON_PROPERTY_PREVIOUS_MONTH,
  GetRecommendations200ResponseTrends.JSON_PROPERTY_2MONTHS_AGO,
  GetRecommendations200ResponseTrends.JSON_PROPERTY_3MONTHS_AGO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetRecommendations200ResponseTrends {
  public static final String JSON_PROPERTY_CURRENT_MONTH = "current_month";
  @javax.annotation.Nullable
  private GetRecommendations200ResponseTrendsCurrentMonth currentMonth;

  public static final String JSON_PROPERTY_PREVIOUS_MONTH = "previous_month";
  @javax.annotation.Nullable
  private GetRecommendations200ResponseTrendsPreviousMonth previousMonth;

  public static final String JSON_PROPERTY_2MONTHS_AGO = "2_months_ago";
  @javax.annotation.Nullable
  private GetRecommendations200ResponseTrends2MonthsAgo _2monthsAgo;

  public static final String JSON_PROPERTY_3MONTHS_AGO = "3_months_ago";
  @javax.annotation.Nullable
  private GetRecommendations200ResponseTrends3MonthsAgo _3monthsAgo;

  public GetRecommendations200ResponseTrends() { 
  }

  public GetRecommendations200ResponseTrends currentMonth(@javax.annotation.Nullable GetRecommendations200ResponseTrendsCurrentMonth currentMonth) {
    this.currentMonth = currentMonth;
    return this;
  }

  /**
   * Get currentMonth
   * @return currentMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetRecommendations200ResponseTrendsCurrentMonth getCurrentMonth() {
    return currentMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMonth(@javax.annotation.Nullable GetRecommendations200ResponseTrendsCurrentMonth currentMonth) {
    this.currentMonth = currentMonth;
  }


  public GetRecommendations200ResponseTrends previousMonth(@javax.annotation.Nullable GetRecommendations200ResponseTrendsPreviousMonth previousMonth) {
    this.previousMonth = previousMonth;
    return this;
  }

  /**
   * Get previousMonth
   * @return previousMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIOUS_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetRecommendations200ResponseTrendsPreviousMonth getPreviousMonth() {
    return previousMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIOUS_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousMonth(@javax.annotation.Nullable GetRecommendations200ResponseTrendsPreviousMonth previousMonth) {
    this.previousMonth = previousMonth;
  }


  public GetRecommendations200ResponseTrends _2monthsAgo(@javax.annotation.Nullable GetRecommendations200ResponseTrends2MonthsAgo _2monthsAgo) {
    this._2monthsAgo = _2monthsAgo;
    return this;
  }

  /**
   * Get _2monthsAgo
   * @return _2monthsAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_2MONTHS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetRecommendations200ResponseTrends2MonthsAgo get2monthsAgo() {
    return _2monthsAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_2MONTHS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set2monthsAgo(@javax.annotation.Nullable GetRecommendations200ResponseTrends2MonthsAgo _2monthsAgo) {
    this._2monthsAgo = _2monthsAgo;
  }


  public GetRecommendations200ResponseTrends _3monthsAgo(@javax.annotation.Nullable GetRecommendations200ResponseTrends3MonthsAgo _3monthsAgo) {
    this._3monthsAgo = _3monthsAgo;
    return this;
  }

  /**
   * Get _3monthsAgo
   * @return _3monthsAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_3MONTHS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetRecommendations200ResponseTrends3MonthsAgo get3monthsAgo() {
    return _3monthsAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_3MONTHS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set3monthsAgo(@javax.annotation.Nullable GetRecommendations200ResponseTrends3MonthsAgo _3monthsAgo) {
    this._3monthsAgo = _3monthsAgo;
  }


  /**
   * Return true if this GetRecommendations_200_response_trends object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendations200ResponseTrends getRecommendations200ResponseTrends = (GetRecommendations200ResponseTrends) o;
    return Objects.equals(this.currentMonth, getRecommendations200ResponseTrends.currentMonth) &&
        Objects.equals(this.previousMonth, getRecommendations200ResponseTrends.previousMonth) &&
        Objects.equals(this._2monthsAgo, getRecommendations200ResponseTrends._2monthsAgo) &&
        Objects.equals(this._3monthsAgo, getRecommendations200ResponseTrends._3monthsAgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentMonth, previousMonth, _2monthsAgo, _3monthsAgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendations200ResponseTrends {\n");
    sb.append("    currentMonth: ").append(toIndentedString(currentMonth)).append("\n");
    sb.append("    previousMonth: ").append(toIndentedString(previousMonth)).append("\n");
    sb.append("    _2monthsAgo: ").append(toIndentedString(_2monthsAgo)).append("\n");
    sb.append("    _3monthsAgo: ").append(toIndentedString(_3monthsAgo)).append("\n");
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

    // add `current_month` to the URL query string
    if (getCurrentMonth() != null) {
      joiner.add(getCurrentMonth().toUrlQueryString(prefix + "current_month" + suffix));
    }

    // add `previous_month` to the URL query string
    if (getPreviousMonth() != null) {
      joiner.add(getPreviousMonth().toUrlQueryString(prefix + "previous_month" + suffix));
    }

    // add `2_months_ago` to the URL query string
    if (get2monthsAgo() != null) {
      joiner.add(get2monthsAgo().toUrlQueryString(prefix + "2_months_ago" + suffix));
    }

    // add `3_months_ago` to the URL query string
    if (get3monthsAgo() != null) {
      joiner.add(get3monthsAgo().toUrlQueryString(prefix + "3_months_ago" + suffix));
    }

    return joiner.toString();
  }
}

