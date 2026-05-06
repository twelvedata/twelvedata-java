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
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD,
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_ATR_TIME_PERIOD,
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_MULTIPLIER,
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesKeltner200ResponseMetaIndicator.JSON_PROPERTY_MA_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesKeltner200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TIME_PERIOD = "time_period";
  @javax.annotation.Nonnull
  private Long timePeriod;

  public static final String JSON_PROPERTY_ATR_TIME_PERIOD = "atr_time_period";
  @javax.annotation.Nonnull
  private Long atrTimePeriod;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  @javax.annotation.Nonnull
  private Long multiplier;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_MA_TYPE = "ma_type";
  @javax.annotation.Nonnull
  private String maType;

  public GetTimeSeriesKeltner200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesKeltner200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesKeltner200ResponseMetaIndicator timePeriod(@javax.annotation.Nonnull Long timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Number of periods to average over
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


  public GetTimeSeriesKeltner200ResponseMetaIndicator atrTimePeriod(@javax.annotation.Nonnull Long atrTimePeriod) {
    this.atrTimePeriod = atrTimePeriod;
    return this;
  }

  /**
   * The time period used for calculating the Average True Range
   * @return atrTimePeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ATR_TIME_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAtrTimePeriod() {
    return atrTimePeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_ATR_TIME_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtrTimePeriod(@javax.annotation.Nonnull Long atrTimePeriod) {
    this.atrTimePeriod = atrTimePeriod;
  }


  public GetTimeSeriesKeltner200ResponseMetaIndicator multiplier(@javax.annotation.Nonnull Long multiplier) {
    this.multiplier = multiplier;
    return this;
  }

  /**
   * The factor used to adjust the indicator&#39;s sensitivity
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


  public GetTimeSeriesKeltner200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesKeltner200ResponseMetaIndicator maType(@javax.annotation.Nonnull String maType) {
    this.maType = maType;
    return this;
  }

  /**
   * The type of moving average used
   * @return maType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMaType() {
    return maType;
  }


  @JsonProperty(value = JSON_PROPERTY_MA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaType(@javax.annotation.Nonnull String maType) {
    this.maType = maType;
  }


  /**
   * Return true if this GetTimeSeriesKeltner_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesKeltner200ResponseMetaIndicator getTimeSeriesKeltner200ResponseMetaIndicator = (GetTimeSeriesKeltner200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesKeltner200ResponseMetaIndicator.name) &&
        Objects.equals(this.timePeriod, getTimeSeriesKeltner200ResponseMetaIndicator.timePeriod) &&
        Objects.equals(this.atrTimePeriod, getTimeSeriesKeltner200ResponseMetaIndicator.atrTimePeriod) &&
        Objects.equals(this.multiplier, getTimeSeriesKeltner200ResponseMetaIndicator.multiplier) &&
        Objects.equals(this.seriesType, getTimeSeriesKeltner200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.maType, getTimeSeriesKeltner200ResponseMetaIndicator.maType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timePeriod, atrTimePeriod, multiplier, seriesType, maType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesKeltner200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    atrTimePeriod: ").append(toIndentedString(atrTimePeriod)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    maType: ").append(toIndentedString(maType)).append("\n");
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

    // add `time_period` to the URL query string
    if (getTimePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod()))));
    }

    // add `atr_time_period` to the URL query string
    if (getAtrTimePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%satr_time_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAtrTimePeriod()))));
    }

    // add `multiplier` to the URL query string
    if (getMultiplier() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smultiplier%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMultiplier()))));
    }

    // add `series_type` to the URL query string
    if (getSeriesType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType()))));
    }

    // add `ma_type` to the URL query string
    if (getMaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaType()))));
    }

    return joiner.toString();
  }
}

