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
 * Price target information
 */
@JsonPropertyOrder({
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_HIGH,
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_MEDIAN,
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_LOW,
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_AVERAGE,
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_CURRENT,
  GetPriceTarget200ResponsePriceTarget.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetPriceTarget200ResponsePriceTarget {
  public static final String JSON_PROPERTY_HIGH = "high";
  @javax.annotation.Nullable
  private Double high;

  public static final String JSON_PROPERTY_MEDIAN = "median";
  @javax.annotation.Nullable
  private Double median;

  public static final String JSON_PROPERTY_LOW = "low";
  @javax.annotation.Nullable
  private Double low;

  public static final String JSON_PROPERTY_AVERAGE = "average";
  @javax.annotation.Nullable
  private Double average;

  public static final String JSON_PROPERTY_CURRENT = "current";
  @javax.annotation.Nullable
  private Double current;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public GetPriceTarget200ResponsePriceTarget() { 
  }

  public GetPriceTarget200ResponsePriceTarget high(@javax.annotation.Nullable Double high) {
    this.high = high;
    return this;
  }

  /**
   * Highest price target given by an analyst
   * @return high
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHigh() {
    return high;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(@javax.annotation.Nullable Double high) {
    this.high = high;
  }


  public GetPriceTarget200ResponsePriceTarget median(@javax.annotation.Nullable Double median) {
    this.median = median;
    return this;
  }

  /**
   * Median price target given across analysts
   * @return median
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEDIAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMedian() {
    return median;
  }


  @JsonProperty(value = JSON_PROPERTY_MEDIAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedian(@javax.annotation.Nullable Double median) {
    this.median = median;
  }


  public GetPriceTarget200ResponsePriceTarget low(@javax.annotation.Nullable Double low) {
    this.low = low;
    return this;
  }

  /**
   * Lowest price target given by an analyst
   * @return low
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLow() {
    return low;
  }


  @JsonProperty(value = JSON_PROPERTY_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(@javax.annotation.Nullable Double low) {
    this.low = low;
  }


  public GetPriceTarget200ResponsePriceTarget average(@javax.annotation.Nullable Double average) {
    this.average = average;
    return this;
  }

  /**
   * Average price target given across analysts
   * @return average
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVERAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAverage() {
    return average;
  }


  @JsonProperty(value = JSON_PROPERTY_AVERAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverage(@javax.annotation.Nullable Double average) {
    this.average = average;
  }


  public GetPriceTarget200ResponsePriceTarget current(@javax.annotation.Nullable Double current) {
    this.current = current;
    return this;
  }

  /**
   * Current price from of a security
   * @return current
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrent() {
    return current;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(@javax.annotation.Nullable Double current) {
    this.current = current;
  }


  public GetPriceTarget200ResponsePriceTarget currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency in which the price targets values are quoted
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this GetPriceTarget_200_response_price_target object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceTarget200ResponsePriceTarget getPriceTarget200ResponsePriceTarget = (GetPriceTarget200ResponsePriceTarget) o;
    return Objects.equals(this.high, getPriceTarget200ResponsePriceTarget.high) &&
        Objects.equals(this.median, getPriceTarget200ResponsePriceTarget.median) &&
        Objects.equals(this.low, getPriceTarget200ResponsePriceTarget.low) &&
        Objects.equals(this.average, getPriceTarget200ResponsePriceTarget.average) &&
        Objects.equals(this.current, getPriceTarget200ResponsePriceTarget.current) &&
        Objects.equals(this.currency, getPriceTarget200ResponsePriceTarget.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, median, low, average, current, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceTarget200ResponsePriceTarget {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    // add `high` to the URL query string
    if (getHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shigh%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHigh()))));
    }

    // add `median` to the URL query string
    if (getMedian() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smedian%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMedian()))));
    }

    // add `low` to the URL query string
    if (getLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLow()))));
    }

    // add `average` to the URL query string
    if (getAverage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saverage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAverage()))));
    }

    // add `current` to the URL query string
    if (getCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrent()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    return joiner.toString();
  }
}

