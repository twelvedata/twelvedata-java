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
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_FAST_PERIOD,
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_SLOW_PERIOD,
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_SIGNAL_PERIOD,
  GetTimeSeriesMacdSlope200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMacdSlope200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_FAST_PERIOD = "fast_period";
  @javax.annotation.Nonnull
  private Long fastPeriod;

  public static final String JSON_PROPERTY_SLOW_PERIOD = "slow_period";
  @javax.annotation.Nonnull
  private Long slowPeriod;

  public static final String JSON_PROPERTY_SIGNAL_PERIOD = "signal_period";
  @javax.annotation.Nonnull
  private Long signalPeriod;

  public static final String JSON_PROPERTY_TIME_PERIOD = "time_period";
  @javax.annotation.Nonnull
  private Long timePeriod;

  public GetTimeSeriesMacdSlope200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesMacdSlope200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesMacdSlope200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
    this.seriesType = seriesType;
    return this;
  }

  /**
   * Price type on which technical indicator is calculated
   * @return seriesType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeriesType() {
    return seriesType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeriesType(@javax.annotation.Nonnull String seriesType) {
    this.seriesType = seriesType;
  }


  public GetTimeSeriesMacdSlope200ResponseMetaIndicator fastPeriod(@javax.annotation.Nonnull Long fastPeriod) {
    this.fastPeriod = fastPeriod;
    return this;
  }

  /**
   * The shorter time period for calculation
   * @return fastPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAST_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFastPeriod() {
    return fastPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_FAST_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFastPeriod(@javax.annotation.Nonnull Long fastPeriod) {
    this.fastPeriod = fastPeriod;
  }


  public GetTimeSeriesMacdSlope200ResponseMetaIndicator slowPeriod(@javax.annotation.Nonnull Long slowPeriod) {
    this.slowPeriod = slowPeriod;
    return this;
  }

  /**
   * The longer time period for calculation
   * @return slowPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSlowPeriod() {
    return slowPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowPeriod(@javax.annotation.Nonnull Long slowPeriod) {
    this.slowPeriod = slowPeriod;
  }


  public GetTimeSeriesMacdSlope200ResponseMetaIndicator signalPeriod(@javax.annotation.Nonnull Long signalPeriod) {
    this.signalPeriod = signalPeriod;
    return this;
  }

  /**
   * The time period used for generating the signal line
   * @return signalPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SIGNAL_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSignalPeriod() {
    return signalPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SIGNAL_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignalPeriod(@javax.annotation.Nonnull Long signalPeriod) {
    this.signalPeriod = signalPeriod;
  }


  public GetTimeSeriesMacdSlope200ResponseMetaIndicator timePeriod(@javax.annotation.Nonnull Long timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * The time period used for calculation in the indicator
   * @return timePeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimePeriod() {
    return timePeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimePeriod(@javax.annotation.Nonnull Long timePeriod) {
    this.timePeriod = timePeriod;
  }


  /**
   * Return true if this GetTimeSeriesMacdSlope_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMacdSlope200ResponseMetaIndicator getTimeSeriesMacdSlope200ResponseMetaIndicator = (GetTimeSeriesMacdSlope200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesMacdSlope200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesMacdSlope200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.fastPeriod, getTimeSeriesMacdSlope200ResponseMetaIndicator.fastPeriod) &&
        Objects.equals(this.slowPeriod, getTimeSeriesMacdSlope200ResponseMetaIndicator.slowPeriod) &&
        Objects.equals(this.signalPeriod, getTimeSeriesMacdSlope200ResponseMetaIndicator.signalPeriod) &&
        Objects.equals(this.timePeriod, getTimeSeriesMacdSlope200ResponseMetaIndicator.timePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, fastPeriod, slowPeriod, signalPeriod, timePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMacdSlope200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    fastPeriod: ").append(toIndentedString(fastPeriod)).append("\n");
    sb.append("    slowPeriod: ").append(toIndentedString(slowPeriod)).append("\n");
    sb.append("    signalPeriod: ").append(toIndentedString(signalPeriod)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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

    // add `series_type` to the URL query string
    if (getSeriesType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType()))));
    }

    // add `fast_period` to the URL query string
    if (getFastPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfast_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFastPeriod()))));
    }

    // add `slow_period` to the URL query string
    if (getSlowPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowPeriod()))));
    }

    // add `signal_period` to the URL query string
    if (getSignalPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssignal_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSignalPeriod()))));
    }

    // add `time_period` to the URL query string
    if (getTimePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod()))));
    }

    return joiner.toString();
  }
}

