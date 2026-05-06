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
 * GetEpsRevisions200ResponseEpsRevisionInner
 */
@JsonPropertyOrder({
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_DATE,
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_PERIOD,
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_UP_LAST_WEEK,
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_UP_LAST_MONTH,
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_DOWN_LAST_WEEK,
  GetEpsRevisions200ResponseEpsRevisionInner.JSON_PROPERTY_DOWN_LAST_MONTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEpsRevisions200ResponseEpsRevisionInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nonnull
  private String period;

  public static final String JSON_PROPERTY_UP_LAST_WEEK = "up_last_week";
  @javax.annotation.Nullable
  private Long upLastWeek;

  public static final String JSON_PROPERTY_UP_LAST_MONTH = "up_last_month";
  @javax.annotation.Nullable
  private Long upLastMonth;

  public static final String JSON_PROPERTY_DOWN_LAST_WEEK = "down_last_week";
  @javax.annotation.Nullable
  private Long downLastWeek;

  public static final String JSON_PROPERTY_DOWN_LAST_MONTH = "down_last_month";
  @javax.annotation.Nullable
  private Long downLastMonth;

  public GetEpsRevisions200ResponseEpsRevisionInner() { 
  }

  public GetEpsRevisions200ResponseEpsRevisionInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the EPS estimate
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


  public GetEpsRevisions200ResponseEpsRevisionInner period(@javax.annotation.Nonnull String period) {
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


  public GetEpsRevisions200ResponseEpsRevisionInner upLastWeek(@javax.annotation.Nullable Long upLastWeek) {
    this.upLastWeek = upLastWeek;
    return this;
  }

  /**
   * Number of up revisions over the last 7 days
   * @return upLastWeek
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UP_LAST_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpLastWeek() {
    return upLastWeek;
  }


  @JsonProperty(value = JSON_PROPERTY_UP_LAST_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpLastWeek(@javax.annotation.Nullable Long upLastWeek) {
    this.upLastWeek = upLastWeek;
  }


  public GetEpsRevisions200ResponseEpsRevisionInner upLastMonth(@javax.annotation.Nullable Long upLastMonth) {
    this.upLastMonth = upLastMonth;
    return this;
  }

  /**
   * Number of up revisions over the last 30 days
   * @return upLastMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UP_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpLastMonth() {
    return upLastMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_UP_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpLastMonth(@javax.annotation.Nullable Long upLastMonth) {
    this.upLastMonth = upLastMonth;
  }


  public GetEpsRevisions200ResponseEpsRevisionInner downLastWeek(@javax.annotation.Nullable Long downLastWeek) {
    this.downLastWeek = downLastWeek;
    return this;
  }

  /**
   * Number of down revisions over the last 7 days
   * @return downLastWeek
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOWN_LAST_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDownLastWeek() {
    return downLastWeek;
  }


  @JsonProperty(value = JSON_PROPERTY_DOWN_LAST_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownLastWeek(@javax.annotation.Nullable Long downLastWeek) {
    this.downLastWeek = downLastWeek;
  }


  public GetEpsRevisions200ResponseEpsRevisionInner downLastMonth(@javax.annotation.Nullable Long downLastMonth) {
    this.downLastMonth = downLastMonth;
    return this;
  }

  /**
   * Number of down revisions over the last 30 days
   * @return downLastMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOWN_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDownLastMonth() {
    return downLastMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_DOWN_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownLastMonth(@javax.annotation.Nullable Long downLastMonth) {
    this.downLastMonth = downLastMonth;
  }


  /**
   * Return true if this GetEpsRevisions_200_response_eps_revision_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEpsRevisions200ResponseEpsRevisionInner getEpsRevisions200ResponseEpsRevisionInner = (GetEpsRevisions200ResponseEpsRevisionInner) o;
    return Objects.equals(this.date, getEpsRevisions200ResponseEpsRevisionInner.date) &&
        Objects.equals(this.period, getEpsRevisions200ResponseEpsRevisionInner.period) &&
        Objects.equals(this.upLastWeek, getEpsRevisions200ResponseEpsRevisionInner.upLastWeek) &&
        Objects.equals(this.upLastMonth, getEpsRevisions200ResponseEpsRevisionInner.upLastMonth) &&
        Objects.equals(this.downLastWeek, getEpsRevisions200ResponseEpsRevisionInner.downLastWeek) &&
        Objects.equals(this.downLastMonth, getEpsRevisions200ResponseEpsRevisionInner.downLastMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, upLastWeek, upLastMonth, downLastWeek, downLastMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEpsRevisions200ResponseEpsRevisionInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    upLastWeek: ").append(toIndentedString(upLastWeek)).append("\n");
    sb.append("    upLastMonth: ").append(toIndentedString(upLastMonth)).append("\n");
    sb.append("    downLastWeek: ").append(toIndentedString(downLastWeek)).append("\n");
    sb.append("    downLastMonth: ").append(toIndentedString(downLastMonth)).append("\n");
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

    // add `up_last_week` to the URL query string
    if (getUpLastWeek() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sup_last_week%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpLastWeek()))));
    }

    // add `up_last_month` to the URL query string
    if (getUpLastMonth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sup_last_month%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpLastMonth()))));
    }

    // add `down_last_week` to the URL query string
    if (getDownLastWeek() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdown_last_week%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDownLastWeek()))));
    }

    // add `down_last_month` to the URL query string
    if (getDownLastMonth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdown_last_month%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDownLastMonth()))));
    }

    return joiner.toString();
  }
}

