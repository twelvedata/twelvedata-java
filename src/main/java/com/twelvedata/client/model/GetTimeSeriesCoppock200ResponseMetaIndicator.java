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
  GetTimeSeriesCoppock200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesCoppock200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesCoppock200ResponseMetaIndicator.JSON_PROPERTY_WMA_PERIOD,
  GetTimeSeriesCoppock200ResponseMetaIndicator.JSON_PROPERTY_LONG_ROC_PERIOD,
  GetTimeSeriesCoppock200ResponseMetaIndicator.JSON_PROPERTY_SHORT_ROC_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesCoppock200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_WMA_PERIOD = "wma_period";
  @javax.annotation.Nonnull
  private Long wmaPeriod;

  public static final String JSON_PROPERTY_LONG_ROC_PERIOD = "long_roc_period";
  @javax.annotation.Nonnull
  private Long longRocPeriod;

  public static final String JSON_PROPERTY_SHORT_ROC_PERIOD = "short_roc_period";
  @javax.annotation.Nonnull
  private Long shortRocPeriod;

  public GetTimeSeriesCoppock200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesCoppock200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesCoppock200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesCoppock200ResponseMetaIndicator wmaPeriod(@javax.annotation.Nonnull Long wmaPeriod) {
    this.wmaPeriod = wmaPeriod;
    return this;
  }

  /**
   * Number of periods for weighted moving average
   * @return wmaPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_WMA_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getWmaPeriod() {
    return wmaPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_WMA_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWmaPeriod(@javax.annotation.Nonnull Long wmaPeriod) {
    this.wmaPeriod = wmaPeriod;
  }


  public GetTimeSeriesCoppock200ResponseMetaIndicator longRocPeriod(@javax.annotation.Nonnull Long longRocPeriod) {
    this.longRocPeriod = longRocPeriod;
    return this;
  }

  /**
   * Number of periods for long term rate of change
   * @return longRocPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LONG_ROC_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLongRocPeriod() {
    return longRocPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_ROC_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongRocPeriod(@javax.annotation.Nonnull Long longRocPeriod) {
    this.longRocPeriod = longRocPeriod;
  }


  public GetTimeSeriesCoppock200ResponseMetaIndicator shortRocPeriod(@javax.annotation.Nonnull Long shortRocPeriod) {
    this.shortRocPeriod = shortRocPeriod;
    return this;
  }

  /**
   * Number of periods for short term rate of change
   * @return shortRocPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SHORT_ROC_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getShortRocPeriod() {
    return shortRocPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_ROC_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShortRocPeriod(@javax.annotation.Nonnull Long shortRocPeriod) {
    this.shortRocPeriod = shortRocPeriod;
  }


  /**
   * Return true if this GetTimeSeriesCoppock_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesCoppock200ResponseMetaIndicator getTimeSeriesCoppock200ResponseMetaIndicator = (GetTimeSeriesCoppock200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesCoppock200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesCoppock200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.wmaPeriod, getTimeSeriesCoppock200ResponseMetaIndicator.wmaPeriod) &&
        Objects.equals(this.longRocPeriod, getTimeSeriesCoppock200ResponseMetaIndicator.longRocPeriod) &&
        Objects.equals(this.shortRocPeriod, getTimeSeriesCoppock200ResponseMetaIndicator.shortRocPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, wmaPeriod, longRocPeriod, shortRocPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesCoppock200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    wmaPeriod: ").append(toIndentedString(wmaPeriod)).append("\n");
    sb.append("    longRocPeriod: ").append(toIndentedString(longRocPeriod)).append("\n");
    sb.append("    shortRocPeriod: ").append(toIndentedString(shortRocPeriod)).append("\n");
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

    // add `wma_period` to the URL query string
    if (getWmaPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swma_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWmaPeriod()))));
    }

    // add `long_roc_period` to the URL query string
    if (getLongRocPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_roc_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongRocPeriod()))));
    }

    // add `short_roc_period` to the URL query string
    if (getShortRocPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_roc_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortRocPeriod()))));
    }

    return joiner.toString();
  }
}

