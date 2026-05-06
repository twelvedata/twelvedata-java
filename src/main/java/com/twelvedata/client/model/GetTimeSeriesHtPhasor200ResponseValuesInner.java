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
 * GetTimeSeriesHtPhasor200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesHtPhasor200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesHtPhasor200ResponseValuesInner.JSON_PROPERTY_IN_PHASE,
  GetTimeSeriesHtPhasor200ResponseValuesInner.JSON_PROPERTY_QUADRATURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesHtPhasor200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_IN_PHASE = "in_phase";
  @javax.annotation.Nonnull
  private String inPhase;

  public static final String JSON_PROPERTY_QUADRATURE = "quadrature";
  @javax.annotation.Nonnull
  private String quadrature;

  public GetTimeSeriesHtPhasor200ResponseValuesInner() { 
  }

  public GetTimeSeriesHtPhasor200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Datetime in local market time for equities and in UTC for forex and cryptocurrencies referring to when the bar with specified interval was opened
   * @return datetime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatetime() {
    return datetime;
  }


  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
  }


  public GetTimeSeriesHtPhasor200ResponseValuesInner inPhase(@javax.annotation.Nonnull String inPhase) {
    this.inPhase = inPhase;
    return this;
  }

  /**
   * In_phase value
   * @return inPhase
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_IN_PHASE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInPhase() {
    return inPhase;
  }


  @JsonProperty(value = JSON_PROPERTY_IN_PHASE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInPhase(@javax.annotation.Nonnull String inPhase) {
    this.inPhase = inPhase;
  }


  public GetTimeSeriesHtPhasor200ResponseValuesInner quadrature(@javax.annotation.Nonnull String quadrature) {
    this.quadrature = quadrature;
    return this;
  }

  /**
   * Quadrature value
   * @return quadrature
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_QUADRATURE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuadrature() {
    return quadrature;
  }


  @JsonProperty(value = JSON_PROPERTY_QUADRATURE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuadrature(@javax.annotation.Nonnull String quadrature) {
    this.quadrature = quadrature;
  }


  /**
   * Return true if this GetTimeSeriesHtPhasor_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesHtPhasor200ResponseValuesInner getTimeSeriesHtPhasor200ResponseValuesInner = (GetTimeSeriesHtPhasor200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesHtPhasor200ResponseValuesInner.datetime) &&
        Objects.equals(this.inPhase, getTimeSeriesHtPhasor200ResponseValuesInner.inPhase) &&
        Objects.equals(this.quadrature, getTimeSeriesHtPhasor200ResponseValuesInner.quadrature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, inPhase, quadrature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesHtPhasor200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    inPhase: ").append(toIndentedString(inPhase)).append("\n");
    sb.append("    quadrature: ").append(toIndentedString(quadrature)).append("\n");
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

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `in_phase` to the URL query string
    if (getInPhase() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sin_phase%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInPhase()))));
    }

    // add `quadrature` to the URL query string
    if (getQuadrature() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squadrature%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuadrature()))));
    }

    return joiner.toString();
  }
}

