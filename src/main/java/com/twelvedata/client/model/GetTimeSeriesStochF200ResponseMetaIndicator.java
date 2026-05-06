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
  GetTimeSeriesStochF200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesStochF200ResponseMetaIndicator.JSON_PROPERTY_FAST_K_PERIOD,
  GetTimeSeriesStochF200ResponseMetaIndicator.JSON_PROPERTY_FAST_D_PERIOD,
  GetTimeSeriesStochF200ResponseMetaIndicator.JSON_PROPERTY_FAST_DMA_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesStochF200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_FAST_K_PERIOD = "fast_k_period";
  @javax.annotation.Nonnull
  private Long fastKPeriod;

  public static final String JSON_PROPERTY_FAST_D_PERIOD = "fast_d_period";
  @javax.annotation.Nonnull
  private Long fastDPeriod;

  public static final String JSON_PROPERTY_FAST_DMA_TYPE = "fast_dma_type";
  @javax.annotation.Nonnull
  private String fastDmaType;

  public GetTimeSeriesStochF200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesStochF200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesStochF200ResponseMetaIndicator fastKPeriod(@javax.annotation.Nonnull Long fastKPeriod) {
    this.fastKPeriod = fastKPeriod;
    return this;
  }

  /**
   * The fast_k period used for calculation in the indicator
   * @return fastKPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAST_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFastKPeriod() {
    return fastKPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_FAST_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFastKPeriod(@javax.annotation.Nonnull Long fastKPeriod) {
    this.fastKPeriod = fastKPeriod;
  }


  public GetTimeSeriesStochF200ResponseMetaIndicator fastDPeriod(@javax.annotation.Nonnull Long fastDPeriod) {
    this.fastDPeriod = fastDPeriod;
    return this;
  }

  /**
   * The fast_d period used for calculation in the indicator
   * @return fastDPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAST_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFastDPeriod() {
    return fastDPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_FAST_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFastDPeriod(@javax.annotation.Nonnull Long fastDPeriod) {
    this.fastDPeriod = fastDPeriod;
  }


  public GetTimeSeriesStochF200ResponseMetaIndicator fastDmaType(@javax.annotation.Nonnull String fastDmaType) {
    this.fastDmaType = fastDmaType;
    return this;
  }

  /**
   * The type of fast Displaced Moving Average used
   * @return fastDmaType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAST_DMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFastDmaType() {
    return fastDmaType;
  }


  @JsonProperty(value = JSON_PROPERTY_FAST_DMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFastDmaType(@javax.annotation.Nonnull String fastDmaType) {
    this.fastDmaType = fastDmaType;
  }


  /**
   * Return true if this GetTimeSeriesStochF_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesStochF200ResponseMetaIndicator getTimeSeriesStochF200ResponseMetaIndicator = (GetTimeSeriesStochF200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesStochF200ResponseMetaIndicator.name) &&
        Objects.equals(this.fastKPeriod, getTimeSeriesStochF200ResponseMetaIndicator.fastKPeriod) &&
        Objects.equals(this.fastDPeriod, getTimeSeriesStochF200ResponseMetaIndicator.fastDPeriod) &&
        Objects.equals(this.fastDmaType, getTimeSeriesStochF200ResponseMetaIndicator.fastDmaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fastKPeriod, fastDPeriod, fastDmaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesStochF200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fastKPeriod: ").append(toIndentedString(fastKPeriod)).append("\n");
    sb.append("    fastDPeriod: ").append(toIndentedString(fastDPeriod)).append("\n");
    sb.append("    fastDmaType: ").append(toIndentedString(fastDmaType)).append("\n");
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

    // add `fast_k_period` to the URL query string
    if (getFastKPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfast_k_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFastKPeriod()))));
    }

    // add `fast_d_period` to the URL query string
    if (getFastDPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfast_d_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFastDPeriod()))));
    }

    // add `fast_dma_type` to the URL query string
    if (getFastDmaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfast_dma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFastDmaType()))));
    }

    return joiner.toString();
  }
}

