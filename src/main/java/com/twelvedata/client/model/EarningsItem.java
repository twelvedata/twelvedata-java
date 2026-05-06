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
 * EarningsItem
 */
@JsonPropertyOrder({
  EarningsItem.JSON_PROPERTY_DATE,
  EarningsItem.JSON_PROPERTY_TIME,
  EarningsItem.JSON_PROPERTY_EPS_ESTIMATE,
  EarningsItem.JSON_PROPERTY_EPS_ACTUAL,
  EarningsItem.JSON_PROPERTY_DIFFERENCE,
  EarningsItem.JSON_PROPERTY_SURPRISE_PRC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EarningsItem {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_TIME = "time";
  @javax.annotation.Nullable
  private String time;

  public static final String JSON_PROPERTY_EPS_ESTIMATE = "eps_estimate";
  @javax.annotation.Nullable
  private Double epsEstimate;

  public static final String JSON_PROPERTY_EPS_ACTUAL = "eps_actual";
  @javax.annotation.Nullable
  private Double epsActual;

  public static final String JSON_PROPERTY_DIFFERENCE = "difference";
  @javax.annotation.Nullable
  private Double difference;

  public static final String JSON_PROPERTY_SURPRISE_PRC = "surprise_prc";
  @javax.annotation.Nullable
  private Double surprisePrc;

  public EarningsItem() { 
  }

  public EarningsItem date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of earning release
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


  public EarningsItem time(@javax.annotation.Nullable String time) {
    this.time = time;
    return this;
  }

  /**
   * Time of earning release, can be either of the following values: &#x60;Pre Market&#x60;, &#x60;After Hours&#x60;, &#x60;Time Not Supplied&#x60;
   * @return time
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTime() {
    return time;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(@javax.annotation.Nullable String time) {
    this.time = time;
  }


  public EarningsItem epsEstimate(@javax.annotation.Nullable Double epsEstimate) {
    this.epsEstimate = epsEstimate;
    return this;
  }

  /**
   * Analyst estimate of the future company earning
   * @return epsEstimate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsEstimate() {
    return epsEstimate;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_ESTIMATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsEstimate(@javax.annotation.Nullable Double epsEstimate) {
    this.epsEstimate = epsEstimate;
  }


  public EarningsItem epsActual(@javax.annotation.Nullable Double epsActual) {
    this.epsActual = epsActual;
    return this;
  }

  /**
   * Actual value of reported earning
   * @return epsActual
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EPS_ACTUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEpsActual() {
    return epsActual;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_ACTUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsActual(@javax.annotation.Nullable Double epsActual) {
    this.epsActual = epsActual;
  }


  public EarningsItem difference(@javax.annotation.Nullable Double difference) {
    this.difference = difference;
    return this;
  }

  /**
   * Delta between &#x60;eps_actual&#x60; and &#x60;eps_estimate&#x60;
   * @return difference
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIFFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDifference() {
    return difference;
  }


  @JsonProperty(value = JSON_PROPERTY_DIFFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDifference(@javax.annotation.Nullable Double difference) {
    this.difference = difference;
  }


  public EarningsItem surprisePrc(@javax.annotation.Nullable Double surprisePrc) {
    this.surprisePrc = surprisePrc;
    return this;
  }

  /**
   * Surprise in the percentage of the &#x60;eps_actual&#x60; related to &#x60;eps_estimate&#x60;
   * @return surprisePrc
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SURPRISE_PRC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSurprisePrc() {
    return surprisePrc;
  }


  @JsonProperty(value = JSON_PROPERTY_SURPRISE_PRC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurprisePrc(@javax.annotation.Nullable Double surprisePrc) {
    this.surprisePrc = surprisePrc;
  }


  /**
   * Return true if this EarningsItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsItem earningsItem = (EarningsItem) o;
    return Objects.equals(this.date, earningsItem.date) &&
        Objects.equals(this.time, earningsItem.time) &&
        Objects.equals(this.epsEstimate, earningsItem.epsEstimate) &&
        Objects.equals(this.epsActual, earningsItem.epsActual) &&
        Objects.equals(this.difference, earningsItem.difference) &&
        Objects.equals(this.surprisePrc, earningsItem.surprisePrc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time, epsEstimate, epsActual, difference, surprisePrc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsItem {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    epsEstimate: ").append(toIndentedString(epsEstimate)).append("\n");
    sb.append("    epsActual: ").append(toIndentedString(epsActual)).append("\n");
    sb.append("    difference: ").append(toIndentedString(difference)).append("\n");
    sb.append("    surprisePrc: ").append(toIndentedString(surprisePrc)).append("\n");
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

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTime()))));
    }

    // add `eps_estimate` to the URL query string
    if (getEpsEstimate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_estimate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsEstimate()))));
    }

    // add `eps_actual` to the URL query string
    if (getEpsActual() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seps_actual%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEpsActual()))));
    }

    // add `difference` to the URL query string
    if (getDifference() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdifference%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDifference()))));
    }

    // add `surprise_prc` to the URL query string
    if (getSurprisePrc() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssurprise_prc%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSurprisePrc()))));
    }

    return joiner.toString();
  }
}

