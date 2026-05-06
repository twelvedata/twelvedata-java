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
  GetTimeSeriesPercentB200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesPercentB200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesPercentB200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD,
  GetTimeSeriesPercentB200ResponseMetaIndicator.JSON_PROPERTY_SD,
  GetTimeSeriesPercentB200ResponseMetaIndicator.JSON_PROPERTY_MA_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesPercentB200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_TIME_PERIOD = "time_period";
  @javax.annotation.Nonnull
  private Long timePeriod;

  public static final String JSON_PROPERTY_SD = "sd";
  @javax.annotation.Nonnull
  private Double sd;

  public static final String JSON_PROPERTY_MA_TYPE = "ma_type";
  @javax.annotation.Nonnull
  private String maType;

  public GetTimeSeriesPercentB200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesPercentB200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesPercentB200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesPercentB200ResponseMetaIndicator timePeriod(@javax.annotation.Nonnull Long timePeriod) {
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


  public GetTimeSeriesPercentB200ResponseMetaIndicator sd(@javax.annotation.Nonnull Double sd) {
    this.sd = sd;
    return this;
  }

  /**
   * The standard deviation applied in the calculation
   * @return sd
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getSd() {
    return sd;
  }


  @JsonProperty(value = JSON_PROPERTY_SD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSd(@javax.annotation.Nonnull Double sd) {
    this.sd = sd;
  }


  public GetTimeSeriesPercentB200ResponseMetaIndicator maType(@javax.annotation.Nonnull String maType) {
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
   * Return true if this GetTimeSeriesPercent_B_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesPercentB200ResponseMetaIndicator getTimeSeriesPercentB200ResponseMetaIndicator = (GetTimeSeriesPercentB200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesPercentB200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesPercentB200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.timePeriod, getTimeSeriesPercentB200ResponseMetaIndicator.timePeriod) &&
        Objects.equals(this.sd, getTimeSeriesPercentB200ResponseMetaIndicator.sd) &&
        Objects.equals(this.maType, getTimeSeriesPercentB200ResponseMetaIndicator.maType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, timePeriod, sd, maType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesPercentB200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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

    // add `series_type` to the URL query string
    if (getSeriesType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType()))));
    }

    // add `time_period` to the URL query string
    if (getTimePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod()))));
    }

    // add `sd` to the URL query string
    if (getSd() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssd%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSd()))));
    }

    // add `ma_type` to the URL query string
    if (getMaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaType()))));
    }

    return joiner.toString();
  }
}

