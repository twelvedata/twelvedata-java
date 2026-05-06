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
  GetTimeSeriesSar200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesSar200ResponseMetaIndicator.JSON_PROPERTY_ACCELERATION,
  GetTimeSeriesSar200ResponseMetaIndicator.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSar200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_ACCELERATION = "acceleration";
  @javax.annotation.Nonnull
  private Double acceleration;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  @javax.annotation.Nonnull
  private Double maximum;

  public GetTimeSeriesSar200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesSar200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesSar200ResponseMetaIndicator acceleration(@javax.annotation.Nonnull Double acceleration) {
    this.acceleration = acceleration;
    return this;
  }

  /**
   * The acceleration factor used in the indicator calculation
   * @return acceleration
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCELERATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAcceleration() {
    return acceleration;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCELERATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcceleration(@javax.annotation.Nonnull Double acceleration) {
    this.acceleration = acceleration;
  }


  public GetTimeSeriesSar200ResponseMetaIndicator maximum(@javax.annotation.Nonnull Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The maximum value considered for the indicator calculation
   * @return maximum
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MAXIMUM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMaximum() {
    return maximum;
  }


  @JsonProperty(value = JSON_PROPERTY_MAXIMUM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaximum(@javax.annotation.Nonnull Double maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this GetTimeSeriesSar_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSar200ResponseMetaIndicator getTimeSeriesSar200ResponseMetaIndicator = (GetTimeSeriesSar200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesSar200ResponseMetaIndicator.name) &&
        Objects.equals(this.acceleration, getTimeSeriesSar200ResponseMetaIndicator.acceleration) &&
        Objects.equals(this.maximum, getTimeSeriesSar200ResponseMetaIndicator.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, acceleration, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSar200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    acceleration: ").append(toIndentedString(acceleration)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

    // add `acceleration` to the URL query string
    if (getAcceleration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacceleration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAcceleration()))));
    }

    // add `maximum` to the URL query string
    if (getMaximum() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaximum%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaximum()))));
    }

    return joiner.toString();
  }
}

