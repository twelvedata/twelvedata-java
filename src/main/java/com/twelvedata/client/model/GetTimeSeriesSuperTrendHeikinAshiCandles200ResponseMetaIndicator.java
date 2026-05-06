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
 * Technical indicator information
 */
@JsonPropertyOrder({
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.JSON_PROPERTY_PERIOD,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.JSON_PROPERTY_MULTIPLIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nonnull
  private Long period;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  @javax.annotation.Nonnull
  private Long multiplier;

  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the technical indicator
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator period(@javax.annotation.Nonnull Long period) {
    this.period = period;
    return this;
  }

  /**
   * The period used for calculation in the indicator
   * @return period
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriod(@javax.annotation.Nonnull Long period) {
    this.period = period;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator multiplier(@javax.annotation.Nonnull Long multiplier) {
    this.multiplier = multiplier;
    return this;
  }

  /**
   * The multiplier used for calculation in the indicator
   * @return multiplier
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MULTIPLIER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMultiplier() {
    return multiplier;
  }


  @JsonProperty(value = JSON_PROPERTY_MULTIPLIER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultiplier(@javax.annotation.Nonnull Long multiplier) {
    this.multiplier = multiplier;
  }


  /**
   * Return true if this GetTimeSeriesSuperTrendHeikinAshiCandles_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator getTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator = (GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.name) &&
        Objects.equals(this.period, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.period) &&
        Objects.equals(this.multiplier, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator.multiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, period, multiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `period` to the URL query string
    if (getPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPeriod()))));
    }

    // add `multiplier` to the URL query string
    if (getMultiplier() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smultiplier%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMultiplier()))));
    }

    return joiner.toString();
  }
}

