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
  GetTimeSeriesCrsi200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesCrsi200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesCrsi200ResponseMetaIndicator.JSON_PROPERTY_RSI_PERIOD,
  GetTimeSeriesCrsi200ResponseMetaIndicator.JSON_PROPERTY_UP_DOWN_LENGTH,
  GetTimeSeriesCrsi200ResponseMetaIndicator.JSON_PROPERTY_PERCENT_RANK_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesCrsi200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_RSI_PERIOD = "rsi_period";
  @javax.annotation.Nonnull
  private Long rsiPeriod;

  public static final String JSON_PROPERTY_UP_DOWN_LENGTH = "up_down_length";
  @javax.annotation.Nonnull
  private Long upDownLength;

  public static final String JSON_PROPERTY_PERCENT_RANK_PERIOD = "percent_rank_period";
  @javax.annotation.Nonnull
  private Long percentRankPeriod;

  public GetTimeSeriesCrsi200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesCrsi200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesCrsi200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesCrsi200ResponseMetaIndicator rsiPeriod(@javax.annotation.Nonnull Long rsiPeriod) {
    this.rsiPeriod = rsiPeriod;
    return this;
  }

  /**
   * Number of periods for RSI used to calculate price momentum
   * @return rsiPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RSI_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRsiPeriod() {
    return rsiPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_RSI_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRsiPeriod(@javax.annotation.Nonnull Long rsiPeriod) {
    this.rsiPeriod = rsiPeriod;
  }


  public GetTimeSeriesCrsi200ResponseMetaIndicator upDownLength(@javax.annotation.Nonnull Long upDownLength) {
    this.upDownLength = upDownLength;
    return this;
  }

  /**
   * Number of periods for RSI used to calculate up/down trend
   * @return upDownLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_UP_DOWN_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpDownLength() {
    return upDownLength;
  }


  @JsonProperty(value = JSON_PROPERTY_UP_DOWN_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpDownLength(@javax.annotation.Nonnull Long upDownLength) {
    this.upDownLength = upDownLength;
  }


  public GetTimeSeriesCrsi200ResponseMetaIndicator percentRankPeriod(@javax.annotation.Nonnull Long percentRankPeriod) {
    this.percentRankPeriod = percentRankPeriod;
    return this;
  }

  /**
   * Number of periods used to calculate PercentRank
   * @return percentRankPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERCENT_RANK_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPercentRankPeriod() {
    return percentRankPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_RANK_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentRankPeriod(@javax.annotation.Nonnull Long percentRankPeriod) {
    this.percentRankPeriod = percentRankPeriod;
  }


  /**
   * Return true if this GetTimeSeriesCrsi_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesCrsi200ResponseMetaIndicator getTimeSeriesCrsi200ResponseMetaIndicator = (GetTimeSeriesCrsi200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesCrsi200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesCrsi200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.rsiPeriod, getTimeSeriesCrsi200ResponseMetaIndicator.rsiPeriod) &&
        Objects.equals(this.upDownLength, getTimeSeriesCrsi200ResponseMetaIndicator.upDownLength) &&
        Objects.equals(this.percentRankPeriod, getTimeSeriesCrsi200ResponseMetaIndicator.percentRankPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, rsiPeriod, upDownLength, percentRankPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesCrsi200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    rsiPeriod: ").append(toIndentedString(rsiPeriod)).append("\n");
    sb.append("    upDownLength: ").append(toIndentedString(upDownLength)).append("\n");
    sb.append("    percentRankPeriod: ").append(toIndentedString(percentRankPeriod)).append("\n");
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

    // add `rsi_period` to the URL query string
    if (getRsiPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srsi_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRsiPeriod()))));
    }

    // add `up_down_length` to the URL query string
    if (getUpDownLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sup_down_length%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpDownLength()))));
    }

    // add `percent_rank_period` to the URL query string
    if (getPercentRankPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_rank_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentRankPeriod()))));
    }

    return joiner.toString();
  }
}

