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
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_START_VALUE,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_OFFSET_ON_REVERSE,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_LIMIT_LONG,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_LONG,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_MAX_LONG,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_LIMIT_SHORT,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_SHORT,
  GetTimeSeriesSarExt200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION_MAX_SHORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSarExt200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_START_VALUE = "start_value";
  @javax.annotation.Nonnull
  private Double startValue;

  public static final String JSON_PROPERTY_OFFSET_ON_REVERSE = "offset_on_reverse";
  @javax.annotation.Nonnull
  private Double offsetOnReverse;

  public static final String JSON_PROPERTY_ACCELERATION_LIMIT_LONG = "acceleration_limit_long";
  @javax.annotation.Nonnull
  private Double accelerationLimitLong;

  public static final String JSON_PROPERTY_ACCELERATION_LONG = "acceleration_long";
  @javax.annotation.Nonnull
  private Double accelerationLong;

  public static final String JSON_PROPERTY_ACCELERATION_MAX_LONG = "acceleration_max_long";
  @javax.annotation.Nonnull
  private Double accelerationMaxLong;

  public static final String JSON_PROPERTY_ACCELERATION_LIMIT_SHORT = "acceleration_limit_short";
  @javax.annotation.Nonnull
  private Double accelerationLimitShort;

  public static final String JSON_PROPERTY_ACCELERATION_SHORT = "acceleration_short";
  @javax.annotation.Nonnull
  private Double accelerationShort;

  public static final String JSON_PROPERTY_ACCELERATION_MAX_SHORT = "acceleration_max_short";
  @javax.annotation.Nonnull
  private Double accelerationMaxShort;

  public GetTimeSeriesSarExt200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesSarExt200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesSarExt200ResponseMetaIndicator startValue(@javax.annotation.Nonnull Double startValue) {
    this.startValue = startValue;
    return this;
  }

  /**
   * The initial value for the indicator calculation
   * @return startValue
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_START_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getStartValue() {
    return startValue;
  }


  @JsonProperty(value = JSON_PROPERTY_START_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartValue(@javax.annotation.Nonnull Double startValue) {
    this.startValue = startValue;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator offsetOnReverse(@javax.annotation.Nonnull Double offsetOnReverse) {
    this.offsetOnReverse = offsetOnReverse;
    return this;
  }

  /**
   * The adjustment applied when the indicator&#39;s direction changes
   * @return offsetOnReverse
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_OFFSET_ON_REVERSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getOffsetOnReverse() {
    return offsetOnReverse;
  }


  @JsonProperty(value = JSON_PROPERTY_OFFSET_ON_REVERSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffsetOnReverse(@javax.annotation.Nonnull Double offsetOnReverse) {
    this.offsetOnReverse = offsetOnReverse;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationLimitLong(@javax.annotation.Nonnull Double accelerationLimitLong) {
    this.accelerationLimitLong = accelerationLimitLong;
    return this;
  }

  /**
   * The maximum acceleration value for long positions
   * @return accelerationLimitLong
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LIMIT_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationLimitLong() {
    return accelerationLimitLong;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LIMIT_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationLimitLong(@javax.annotation.Nonnull Double accelerationLimitLong) {
    this.accelerationLimitLong = accelerationLimitLong;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationLong(@javax.annotation.Nonnull Double accelerationLong) {
    this.accelerationLong = accelerationLong;
    return this;
  }

  /**
   * The acceleration value for long positions
   * @return accelerationLong
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationLong() {
    return accelerationLong;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationLong(@javax.annotation.Nonnull Double accelerationLong) {
    this.accelerationLong = accelerationLong;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationMaxLong(@javax.annotation.Nonnull Double accelerationMaxLong) {
    this.accelerationMaxLong = accelerationMaxLong;
    return this;
  }

  /**
   * The highest allowed acceleration for long positions
   * @return accelerationMaxLong
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_MAX_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationMaxLong() {
    return accelerationMaxLong;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_MAX_LONG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationMaxLong(@javax.annotation.Nonnull Double accelerationMaxLong) {
    this.accelerationMaxLong = accelerationMaxLong;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationLimitShort(@javax.annotation.Nonnull Double accelerationLimitShort) {
    this.accelerationLimitShort = accelerationLimitShort;
    return this;
  }

  /**
   * The maximum acceleration value for short positions
   * @return accelerationLimitShort
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LIMIT_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationLimitShort() {
    return accelerationLimitShort;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_LIMIT_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationLimitShort(@javax.annotation.Nonnull Double accelerationLimitShort) {
    this.accelerationLimitShort = accelerationLimitShort;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationShort(@javax.annotation.Nonnull Double accelerationShort) {
    this.accelerationShort = accelerationShort;
    return this;
  }

  /**
   * The acceleration value for short positions
   * @return accelerationShort
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationShort() {
    return accelerationShort;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationShort(@javax.annotation.Nonnull Double accelerationShort) {
    this.accelerationShort = accelerationShort;
  }


  public GetTimeSeriesSarExt200ResponseMetaIndicator accelerationMaxShort(@javax.annotation.Nonnull Double accelerationMaxShort) {
    this.accelerationMaxShort = accelerationMaxShort;
    return this;
  }

  /**
   * The highest allowed acceleration for short positions
   * @return accelerationMaxShort
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_MAX_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAccelerationMaxShort() {
    return accelerationMaxShort;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION_MAX_SHORT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccelerationMaxShort(@javax.annotation.Nonnull Double accelerationMaxShort) {
    this.accelerationMaxShort = accelerationMaxShort;
  }


  /**
   * Return true if this GetTimeSeriesSarExt_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSarExt200ResponseMetaIndicator getTimeSeriesSarExt200ResponseMetaIndicator = (GetTimeSeriesSarExt200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesSarExt200ResponseMetaIndicator.name) &&
        Objects.equals(this.startValue, getTimeSeriesSarExt200ResponseMetaIndicator.startValue) &&
        Objects.equals(this.offsetOnReverse, getTimeSeriesSarExt200ResponseMetaIndicator.offsetOnReverse) &&
        Objects.equals(this.accelerationLimitLong, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationLimitLong) &&
        Objects.equals(this.accelerationLong, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationLong) &&
        Objects.equals(this.accelerationMaxLong, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationMaxLong) &&
        Objects.equals(this.accelerationLimitShort, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationLimitShort) &&
        Objects.equals(this.accelerationShort, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationShort) &&
        Objects.equals(this.accelerationMaxShort, getTimeSeriesSarExt200ResponseMetaIndicator.accelerationMaxShort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startValue, offsetOnReverse, accelerationLimitLong, accelerationLong, accelerationMaxLong, accelerationLimitShort, accelerationShort, accelerationMaxShort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSarExt200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    offsetOnReverse: ").append(toIndentedString(offsetOnReverse)).append("\n");
    sb.append("    accelerationLimitLong: ").append(toIndentedString(accelerationLimitLong)).append("\n");
    sb.append("    accelerationLong: ").append(toIndentedString(accelerationLong)).append("\n");
    sb.append("    accelerationMaxLong: ").append(toIndentedString(accelerationMaxLong)).append("\n");
    sb.append("    accelerationLimitShort: ").append(toIndentedString(accelerationLimitShort)).append("\n");
    sb.append("    accelerationShort: ").append(toIndentedString(accelerationShort)).append("\n");
    sb.append("    accelerationMaxShort: ").append(toIndentedString(accelerationMaxShort)).append("\n");
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

    // add `start_value` to the URL query string
    if (getStartValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstart_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartValue()))));
    }

    // add `offset_on_reverse` to the URL query string
    if (getOffsetOnReverse() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soffset_on_reverse%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOffsetOnReverse()))));
    }

    // add `acceleration_limit_long` to the URL query string
    if (getAccelerationLimitLong() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_limit_long%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationLimitLong()))));
    }

    // add `acceleration_long` to the URL query string
    if (getAccelerationLong() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_long%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationLong()))));
    }

    // add `acceleration_max_long` to the URL query string
    if (getAccelerationMaxLong() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_max_long%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationMaxLong()))));
    }

    // add `acceleration_limit_short` to the URL query string
    if (getAccelerationLimitShort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_limit_short%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationLimitShort()))));
    }

    // add `acceleration_short` to the URL query string
    if (getAccelerationShort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_short%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationShort()))));
    }

    // add `acceleration_max_short` to the URL query string
    if (getAccelerationMaxShort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration_max_short%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccelerationMaxShort()))));
    }

    return joiner.toString();
  }
}

