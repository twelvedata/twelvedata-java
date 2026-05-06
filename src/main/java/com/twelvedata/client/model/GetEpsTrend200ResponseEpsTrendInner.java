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
 * GetEpsTrend200ResponseEpsTrendInner
 */
@JsonPropertyOrder({
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_DATE,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_PERIOD,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_CURRENT_ESTIMATE,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_7DAYS_AGO,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_30DAYS_AGO,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_60DAYS_AGO,
  GetEpsTrend200ResponseEpsTrendInner.JSON_PROPERTY_90DAYS_AGO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEpsTrend200ResponseEpsTrendInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nonnull
  private String period;

  public static final String JSON_PROPERTY_CURRENT_ESTIMATE = "current_estimate";
  @javax.annotation.Nullable
  private Double currentEstimate;

  public static final String JSON_PROPERTY_7DAYS_AGO = "7_days_ago";
  @javax.annotation.Nullable
  private Double _7daysAgo;

  public static final String JSON_PROPERTY_30DAYS_AGO = "30_days_ago";
  @javax.annotation.Nullable
  private Double _30daysAgo;

  public static final String JSON_PROPERTY_60DAYS_AGO = "60_days_ago";
  @javax.annotation.Nullable
  private Double _60daysAgo;

  public static final String JSON_PROPERTY_90DAYS_AGO = "90_days_ago";
  @javax.annotation.Nullable
  private Double _90daysAgo;

  public GetEpsTrend200ResponseEpsTrendInner() { 
  }

  public GetEpsTrend200ResponseEpsTrendInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the estimation
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


  public GetEpsTrend200ResponseEpsTrendInner period(@javax.annotation.Nonnull String period) {
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


  public GetEpsTrend200ResponseEpsTrendInner currentEstimate(@javax.annotation.Nullable Double currentEstimate) {
    this.currentEstimate = currentEstimate;
    return this;
  }

  /**
   * Actual EPS estimation for the period
   * @return currentEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentEstimate() {
    return currentEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentEstimate(@javax.annotation.Nullable Double currentEstimate) {
    this.currentEstimate = currentEstimate;
  }


  public GetEpsTrend200ResponseEpsTrendInner _7daysAgo(@javax.annotation.Nullable Double _7daysAgo) {
    this._7daysAgo = _7daysAgo;
    return this;
  }

  /**
   * EPS estimation value 7 days ago
   * @return _7daysAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_7DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get7daysAgo() {
    return _7daysAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_7DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set7daysAgo(@javax.annotation.Nullable Double _7daysAgo) {
    this._7daysAgo = _7daysAgo;
  }


  public GetEpsTrend200ResponseEpsTrendInner _30daysAgo(@javax.annotation.Nullable Double _30daysAgo) {
    this._30daysAgo = _30daysAgo;
    return this;
  }

  /**
   * EPS estimation value 30 days ago
   * @return _30daysAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_30DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get30daysAgo() {
    return _30daysAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_30DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set30daysAgo(@javax.annotation.Nullable Double _30daysAgo) {
    this._30daysAgo = _30daysAgo;
  }


  public GetEpsTrend200ResponseEpsTrendInner _60daysAgo(@javax.annotation.Nullable Double _60daysAgo) {
    this._60daysAgo = _60daysAgo;
    return this;
  }

  /**
   * EPS estimation value 60 days ago
   * @return _60daysAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_60DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get60daysAgo() {
    return _60daysAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_60DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set60daysAgo(@javax.annotation.Nullable Double _60daysAgo) {
    this._60daysAgo = _60daysAgo;
  }


  public GetEpsTrend200ResponseEpsTrendInner _90daysAgo(@javax.annotation.Nullable Double _90daysAgo) {
    this._90daysAgo = _90daysAgo;
    return this;
  }

  /**
   * EPS estimation value 90 days ago
   * @return _90daysAgo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_90DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get90daysAgo() {
    return _90daysAgo;
  }


  @JsonProperty(value = JSON_PROPERTY_90DAYS_AGO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set90daysAgo(@javax.annotation.Nullable Double _90daysAgo) {
    this._90daysAgo = _90daysAgo;
  }


  /**
   * Return true if this GetEpsTrend_200_response_eps_trend_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEpsTrend200ResponseEpsTrendInner getEpsTrend200ResponseEpsTrendInner = (GetEpsTrend200ResponseEpsTrendInner) o;
    return Objects.equals(this.date, getEpsTrend200ResponseEpsTrendInner.date) &&
        Objects.equals(this.period, getEpsTrend200ResponseEpsTrendInner.period) &&
        Objects.equals(this.currentEstimate, getEpsTrend200ResponseEpsTrendInner.currentEstimate) &&
        Objects.equals(this._7daysAgo, getEpsTrend200ResponseEpsTrendInner._7daysAgo) &&
        Objects.equals(this._30daysAgo, getEpsTrend200ResponseEpsTrendInner._30daysAgo) &&
        Objects.equals(this._60daysAgo, getEpsTrend200ResponseEpsTrendInner._60daysAgo) &&
        Objects.equals(this._90daysAgo, getEpsTrend200ResponseEpsTrendInner._90daysAgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, currentEstimate, _7daysAgo, _30daysAgo, _60daysAgo, _90daysAgo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEpsTrend200ResponseEpsTrendInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    currentEstimate: ").append(toIndentedString(currentEstimate)).append("\n");
    sb.append("    _7daysAgo: ").append(toIndentedString(_7daysAgo)).append("\n");
    sb.append("    _30daysAgo: ").append(toIndentedString(_30daysAgo)).append("\n");
    sb.append("    _60daysAgo: ").append(toIndentedString(_60daysAgo)).append("\n");
    sb.append("    _90daysAgo: ").append(toIndentedString(_90daysAgo)).append("\n");
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

    // add `current_estimate` to the URL query string
    if (getCurrentEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentEstimate()))));
    }

    // add `7_days_ago` to the URL query string
    if (get7daysAgo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s7_days_ago%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get7daysAgo()))));
    }

    // add `30_days_ago` to the URL query string
    if (get30daysAgo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s30_days_ago%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get30daysAgo()))));
    }

    // add `60_days_ago` to the URL query string
    if (get60daysAgo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s60_days_ago%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get60daysAgo()))));
    }

    // add `90_days_ago` to the URL query string
    if (get90daysAgo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s90_days_ago%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get90daysAgo()))));
    }

    return joiner.toString();
  }
}

