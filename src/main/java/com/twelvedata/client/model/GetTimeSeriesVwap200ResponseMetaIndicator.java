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
  GetTimeSeriesVwap200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesVwap200ResponseMetaIndicator.JSON_PROPERTY_SD_TIME_PERIOD,
  GetTimeSeriesVwap200ResponseMetaIndicator.JSON_PROPERTY_SD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesVwap200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SD_TIME_PERIOD = "sd_time_period";
  @javax.annotation.Nullable
  private Long sdTimePeriod;

  public static final String JSON_PROPERTY_SD = "sd";
  @javax.annotation.Nullable
  private Double sd;

  public GetTimeSeriesVwap200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesVwap200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesVwap200ResponseMetaIndicator sdTimePeriod(@javax.annotation.Nullable Long sdTimePeriod) {
    this.sdTimePeriod = sdTimePeriod;
    return this;
  }

  /**
   * Standard deviation time period
   * @return sdTimePeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SD_TIME_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSdTimePeriod() {
    return sdTimePeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SD_TIME_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSdTimePeriod(@javax.annotation.Nullable Long sdTimePeriod) {
    this.sdTimePeriod = sdTimePeriod;
  }


  public GetTimeSeriesVwap200ResponseMetaIndicator sd(@javax.annotation.Nullable Double sd) {
    this.sd = sd;
    return this;
  }

  /**
   * Standard deviation value
   * @return sd
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSd() {
    return sd;
  }


  @JsonProperty(value = JSON_PROPERTY_SD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSd(@javax.annotation.Nullable Double sd) {
    this.sd = sd;
  }


  /**
   * Return true if this GetTimeSeriesVwap_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesVwap200ResponseMetaIndicator getTimeSeriesVwap200ResponseMetaIndicator = (GetTimeSeriesVwap200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesVwap200ResponseMetaIndicator.name) &&
        Objects.equals(this.sdTimePeriod, getTimeSeriesVwap200ResponseMetaIndicator.sdTimePeriod) &&
        Objects.equals(this.sd, getTimeSeriesVwap200ResponseMetaIndicator.sd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sdTimePeriod, sd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesVwap200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sdTimePeriod: ").append(toIndentedString(sdTimePeriod)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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

    // add `sd_time_period` to the URL query string
    if (getSdTimePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssd_time_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSdTimePeriod()))));
    }

    // add `sd` to the URL query string
    if (getSd() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssd%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSd()))));
    }

    return joiner.toString();
  }
}

