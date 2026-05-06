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
  GetTimeSeriesUltOsc200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesUltOsc200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD1,
  GetTimeSeriesUltOsc200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD2,
  GetTimeSeriesUltOsc200ResponseMetaIndicator.JSON_PROPERTY_TIME_PERIOD3
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesUltOsc200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TIME_PERIOD1 = "time_period_1";
  @javax.annotation.Nonnull
  private Long timePeriod1;

  public static final String JSON_PROPERTY_TIME_PERIOD2 = "time_period_2";
  @javax.annotation.Nonnull
  private Long timePeriod2;

  public static final String JSON_PROPERTY_TIME_PERIOD3 = "time_period_3";
  @javax.annotation.Nonnull
  private Long timePeriod3;

  public GetTimeSeriesUltOsc200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesUltOsc200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesUltOsc200ResponseMetaIndicator timePeriod1(@javax.annotation.Nonnull Long timePeriod1) {
    this.timePeriod1 = timePeriod1;
    return this;
  }

  /**
   * The first time period used for calculation in the indicator
   * @return timePeriod1
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimePeriod1() {
    return timePeriod1;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimePeriod1(@javax.annotation.Nonnull Long timePeriod1) {
    this.timePeriod1 = timePeriod1;
  }


  public GetTimeSeriesUltOsc200ResponseMetaIndicator timePeriod2(@javax.annotation.Nonnull Long timePeriod2) {
    this.timePeriod2 = timePeriod2;
    return this;
  }

  /**
   * The second time period used for calculation in the indicator
   * @return timePeriod2
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimePeriod2() {
    return timePeriod2;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimePeriod2(@javax.annotation.Nonnull Long timePeriod2) {
    this.timePeriod2 = timePeriod2;
  }


  public GetTimeSeriesUltOsc200ResponseMetaIndicator timePeriod3(@javax.annotation.Nonnull Long timePeriod3) {
    this.timePeriod3 = timePeriod3;
    return this;
  }

  /**
   * The third time period used for calculation in the indicator
   * @return timePeriod3
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimePeriod3() {
    return timePeriod3;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_PERIOD3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimePeriod3(@javax.annotation.Nonnull Long timePeriod3) {
    this.timePeriod3 = timePeriod3;
  }


  /**
   * Return true if this GetTimeSeriesUltOsc_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesUltOsc200ResponseMetaIndicator getTimeSeriesUltOsc200ResponseMetaIndicator = (GetTimeSeriesUltOsc200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesUltOsc200ResponseMetaIndicator.name) &&
        Objects.equals(this.timePeriod1, getTimeSeriesUltOsc200ResponseMetaIndicator.timePeriod1) &&
        Objects.equals(this.timePeriod2, getTimeSeriesUltOsc200ResponseMetaIndicator.timePeriod2) &&
        Objects.equals(this.timePeriod3, getTimeSeriesUltOsc200ResponseMetaIndicator.timePeriod3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timePeriod1, timePeriod2, timePeriod3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesUltOsc200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timePeriod1: ").append(toIndentedString(timePeriod1)).append("\n");
    sb.append("    timePeriod2: ").append(toIndentedString(timePeriod2)).append("\n");
    sb.append("    timePeriod3: ").append(toIndentedString(timePeriod3)).append("\n");
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

    // add `time_period_1` to the URL query string
    if (getTimePeriod1() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period_1%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod1()))));
    }

    // add `time_period_2` to the URL query string
    if (getTimePeriod2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period_2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod2()))));
    }

    // add `time_period_3` to the URL query string
    if (getTimePeriod3() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_period_3%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimePeriod3()))));
    }

    return joiner.toString();
  }
}

