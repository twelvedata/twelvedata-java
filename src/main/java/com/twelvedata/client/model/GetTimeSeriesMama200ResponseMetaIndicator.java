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
  GetTimeSeriesMama200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesMama200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesMama200ResponseMetaIndicator.JSON_PROPERTY_FAST_LIMIT,
  GetTimeSeriesMama200ResponseMetaIndicator.JSON_PROPERTY_SLOW_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMama200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_FAST_LIMIT = "fast_limit";
  @javax.annotation.Nonnull
  private Double fastLimit;

  public static final String JSON_PROPERTY_SLOW_LIMIT = "slow_limit";
  @javax.annotation.Nonnull
  private Double slowLimit;

  public GetTimeSeriesMama200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesMama200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesMama200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesMama200ResponseMetaIndicator fastLimit(@javax.annotation.Nonnull Double fastLimit) {
    this.fastLimit = fastLimit;
    return this;
  }

  /**
   * The limit for the fast moving average
   * @return fastLimit
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAST_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFastLimit() {
    return fastLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_FAST_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFastLimit(@javax.annotation.Nonnull Double fastLimit) {
    this.fastLimit = fastLimit;
  }


  public GetTimeSeriesMama200ResponseMetaIndicator slowLimit(@javax.annotation.Nonnull Double slowLimit) {
    this.slowLimit = slowLimit;
    return this;
  }

  /**
   * The limit for the slow moving average
   * @return slowLimit
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getSlowLimit() {
    return slowLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowLimit(@javax.annotation.Nonnull Double slowLimit) {
    this.slowLimit = slowLimit;
  }


  /**
   * Return true if this GetTimeSeriesMama_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMama200ResponseMetaIndicator getTimeSeriesMama200ResponseMetaIndicator = (GetTimeSeriesMama200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesMama200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesMama200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.fastLimit, getTimeSeriesMama200ResponseMetaIndicator.fastLimit) &&
        Objects.equals(this.slowLimit, getTimeSeriesMama200ResponseMetaIndicator.slowLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, fastLimit, slowLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMama200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    fastLimit: ").append(toIndentedString(fastLimit)).append("\n");
    sb.append("    slowLimit: ").append(toIndentedString(slowLimit)).append("\n");
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

    // add `fast_limit` to the URL query string
    if (getFastLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfast_limit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFastLimit()))));
    }

    // add `slow_limit` to the URL query string
    if (getSlowLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_limit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowLimit()))));
    }

    return joiner.toString();
  }
}

