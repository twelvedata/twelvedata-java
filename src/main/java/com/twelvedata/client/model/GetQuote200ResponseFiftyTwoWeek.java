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
 * Collection of 52-week metrics
 */
@JsonPropertyOrder({
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_LOW,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_HIGH,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_LOW_CHANGE,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_HIGH_CHANGE,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_LOW_CHANGE_PERCENT,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_HIGH_CHANGE_PERCENT,
  GetQuote200ResponseFiftyTwoWeek.JSON_PROPERTY_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetQuote200ResponseFiftyTwoWeek {
  public static final String JSON_PROPERTY_LOW = "low";
  @javax.annotation.Nullable
  private String low;

  public static final String JSON_PROPERTY_HIGH = "high";
  @javax.annotation.Nullable
  private String high;

  public static final String JSON_PROPERTY_LOW_CHANGE = "low_change";
  @javax.annotation.Nullable
  private String lowChange;

  public static final String JSON_PROPERTY_HIGH_CHANGE = "high_change";
  @javax.annotation.Nullable
  private String highChange;

  public static final String JSON_PROPERTY_LOW_CHANGE_PERCENT = "low_change_percent";
  @javax.annotation.Nullable
  private String lowChangePercent;

  public static final String JSON_PROPERTY_HIGH_CHANGE_PERCENT = "high_change_percent";
  @javax.annotation.Nullable
  private String highChangePercent;

  public static final String JSON_PROPERTY_RANGE = "range";
  @javax.annotation.Nullable
  private String range;

  public GetQuote200ResponseFiftyTwoWeek() { 
  }

  public GetQuote200ResponseFiftyTwoWeek low(@javax.annotation.Nullable String low) {
    this.low = low;
    return this;
  }

  /**
   * 52-week low price
   * @return low
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLow() {
    return low;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(@javax.annotation.Nullable String low) {
    this.low = low;
  }


  public GetQuote200ResponseFiftyTwoWeek high(@javax.annotation.Nullable String high) {
    this.high = high;
    return this;
  }

  /**
   * 52-week high price
   * @return high
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHigh() {
    return high;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(@javax.annotation.Nullable String high) {
    this.high = high;
  }


  public GetQuote200ResponseFiftyTwoWeek lowChange(@javax.annotation.Nullable String lowChange) {
    this.lowChange = lowChange;
    return this;
  }

  /**
   * Current price - 52-week low
   * @return lowChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOW_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLowChange() {
    return lowChange;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowChange(@javax.annotation.Nullable String lowChange) {
    this.lowChange = lowChange;
  }


  public GetQuote200ResponseFiftyTwoWeek highChange(@javax.annotation.Nullable String highChange) {
    this.highChange = highChange;
    return this;
  }

  /**
   * Current price - 52-week high
   * @return highChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGH_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHighChange() {
    return highChange;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighChange(@javax.annotation.Nullable String highChange) {
    this.highChange = highChange;
  }


  public GetQuote200ResponseFiftyTwoWeek lowChangePercent(@javax.annotation.Nullable String lowChangePercent) {
    this.lowChangePercent = lowChangePercent;
    return this;
  }

  /**
   * Percentage change from 52-week low
   * @return lowChangePercent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOW_CHANGE_PERCENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLowChangePercent() {
    return lowChangePercent;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW_CHANGE_PERCENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowChangePercent(@javax.annotation.Nullable String lowChangePercent) {
    this.lowChangePercent = lowChangePercent;
  }


  public GetQuote200ResponseFiftyTwoWeek highChangePercent(@javax.annotation.Nullable String highChangePercent) {
    this.highChangePercent = highChangePercent;
    return this;
  }

  /**
   * Percentage change from 52-week high
   * @return highChangePercent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGH_CHANGE_PERCENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHighChangePercent() {
    return highChangePercent;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH_CHANGE_PERCENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighChangePercent(@javax.annotation.Nullable String highChangePercent) {
    this.highChangePercent = highChangePercent;
  }


  public GetQuote200ResponseFiftyTwoWeek range(@javax.annotation.Nullable String range) {
    this.range = range;
    return this;
  }

  /**
   * Range between 52-week low and high
   * @return range
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRange() {
    return range;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(@javax.annotation.Nullable String range) {
    this.range = range;
  }


  /**
   * Return true if this GetQuote_200_response_fifty_two_week object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQuote200ResponseFiftyTwoWeek getQuote200ResponseFiftyTwoWeek = (GetQuote200ResponseFiftyTwoWeek) o;
    return Objects.equals(this.low, getQuote200ResponseFiftyTwoWeek.low) &&
        Objects.equals(this.high, getQuote200ResponseFiftyTwoWeek.high) &&
        Objects.equals(this.lowChange, getQuote200ResponseFiftyTwoWeek.lowChange) &&
        Objects.equals(this.highChange, getQuote200ResponseFiftyTwoWeek.highChange) &&
        Objects.equals(this.lowChangePercent, getQuote200ResponseFiftyTwoWeek.lowChangePercent) &&
        Objects.equals(this.highChangePercent, getQuote200ResponseFiftyTwoWeek.highChangePercent) &&
        Objects.equals(this.range, getQuote200ResponseFiftyTwoWeek.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, high, lowChange, highChange, lowChangePercent, highChangePercent, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuote200ResponseFiftyTwoWeek {\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    lowChange: ").append(toIndentedString(lowChange)).append("\n");
    sb.append("    highChange: ").append(toIndentedString(highChange)).append("\n");
    sb.append("    lowChangePercent: ").append(toIndentedString(lowChangePercent)).append("\n");
    sb.append("    highChangePercent: ").append(toIndentedString(highChangePercent)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

    // add `low` to the URL query string
    if (getLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLow()))));
    }

    // add `high` to the URL query string
    if (getHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHigh()))));
    }

    // add `low_change` to the URL query string
    if (getLowChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLowChange()))));
    }

    // add `high_change` to the URL query string
    if (getHighChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHighChange()))));
    }

    // add `low_change_percent` to the URL query string
    if (getLowChangePercent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow_change_percent%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLowChangePercent()))));
    }

    // add `high_change_percent` to the URL query string
    if (getHighChangePercent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh_change_percent%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHighChangePercent()))));
    }

    // add `range` to the URL query string
    if (getRange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRange()))));
    }

    return joiner.toString();
  }
}

