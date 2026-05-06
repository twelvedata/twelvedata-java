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
  GetTimeSeriesT3ma200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesT3ma200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesT3ma200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD,
  GetTimeSeriesT3ma200ResponseMetaIndicator.JSON_PROPERTY_V_FACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesT3ma200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_TIME_PERIOD = "time_period";
  @javax.annotation.Nonnull
  private Long timePeriod;

  public static final String JSON_PROPERTY_V_FACTOR = "v_factor";
  @javax.annotation.Nonnull
  private Double vFactor;

  public GetTimeSeriesT3ma200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesT3ma200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesT3ma200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesT3ma200ResponseMetaIndicator timePeriod(@javax.annotation.Nonnull Long timePeriod) {
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


  public GetTimeSeriesT3ma200ResponseMetaIndicator vFactor(@javax.annotation.Nonnull Double vFactor) {
    this.vFactor = vFactor;
    return this;
  }

  /**
   * The factor used to adjust the indicator&#39;s volatility
   * @return vFactor
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_V_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getvFactor() {
    return vFactor;
  }


  @JsonProperty(value = JSON_PROPERTY_V_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setvFactor(@javax.annotation.Nonnull Double vFactor) {
    this.vFactor = vFactor;
  }


  /**
   * Return true if this GetTimeSeriesT3ma_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesT3ma200ResponseMetaIndicator getTimeSeriesT3ma200ResponseMetaIndicator = (GetTimeSeriesT3ma200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesT3ma200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesT3ma200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.timePeriod, getTimeSeriesT3ma200ResponseMetaIndicator.timePeriod) &&
        Objects.equals(this.vFactor, getTimeSeriesT3ma200ResponseMetaIndicator.vFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, timePeriod, vFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesT3ma200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    vFactor: ").append(toIndentedString(vFactor)).append("\n");
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

    // add `v_factor` to the URL query string
    if (getvFactor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sv_factor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getvFactor()))));
    }

    return joiner.toString();
  }
}

