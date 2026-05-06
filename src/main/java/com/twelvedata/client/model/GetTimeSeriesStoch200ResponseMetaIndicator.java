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
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_FAST_K_PERIOD,
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_SLOW_K_PERIOD,
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_SLOW_D_PERIOD,
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_SLOW_KMA_TYPE,
  GetTimeSeriesStoch200ResponseMetaIndicator.JSON_PROPERTY_SLOW_DMA_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesStoch200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_FAST_K_PERIOD = "fast_k_period";
  @javax.annotation.Nonnull
  private Long fastKPeriod;

  public static final String JSON_PROPERTY_SLOW_K_PERIOD = "slow_k_period";
  @javax.annotation.Nonnull
  private Long slowKPeriod;

  public static final String JSON_PROPERTY_SLOW_D_PERIOD = "slow_d_period";
  @javax.annotation.Nonnull
  private Long slowDPeriod;

  public static final String JSON_PROPERTY_SLOW_KMA_TYPE = "slow_kma_type";
  @javax.annotation.Nonnull
  private String slowKmaType;

  public static final String JSON_PROPERTY_SLOW_DMA_TYPE = "slow_dma_type";
  @javax.annotation.Nonnull
  private String slowDmaType;

  public GetTimeSeriesStoch200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesStoch200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesStoch200ResponseMetaIndicator fastKPeriod(@javax.annotation.Nonnull Long fastKPeriod) {
    this.fastKPeriod = fastKPeriod;
    return this;
  }

  /**
   * The time period for the fast %K line in the Stochastic Oscillator
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


  public GetTimeSeriesStoch200ResponseMetaIndicator slowKPeriod(@javax.annotation.Nonnull Long slowKPeriod) {
    this.slowKPeriod = slowKPeriod;
    return this;
  }

  /**
   * The time period for the slow %K line in the Stochastic Oscillator
   * @return slowKPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSlowKPeriod() {
    return slowKPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowKPeriod(@javax.annotation.Nonnull Long slowKPeriod) {
    this.slowKPeriod = slowKPeriod;
  }


  public GetTimeSeriesStoch200ResponseMetaIndicator slowDPeriod(@javax.annotation.Nonnull Long slowDPeriod) {
    this.slowDPeriod = slowDPeriod;
    return this;
  }

  /**
   * The time period for the slow %D line in the Stochastic Oscillator
   * @return slowDPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSlowDPeriod() {
    return slowDPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowDPeriod(@javax.annotation.Nonnull Long slowDPeriod) {
    this.slowDPeriod = slowDPeriod;
  }


  public GetTimeSeriesStoch200ResponseMetaIndicator slowKmaType(@javax.annotation.Nonnull String slowKmaType) {
    this.slowKmaType = slowKmaType;
    return this;
  }

  /**
   * The type of slow %K Moving Average used
   * @return slowKmaType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_KMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlowKmaType() {
    return slowKmaType;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_KMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowKmaType(@javax.annotation.Nonnull String slowKmaType) {
    this.slowKmaType = slowKmaType;
  }


  public GetTimeSeriesStoch200ResponseMetaIndicator slowDmaType(@javax.annotation.Nonnull String slowDmaType) {
    this.slowDmaType = slowDmaType;
    return this;
  }

  /**
   * The type of slow Displaced Moving Average used
   * @return slowDmaType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SLOW_DMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlowDmaType() {
    return slowDmaType;
  }


  @JsonProperty(value = JSON_PROPERTY_SLOW_DMA_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowDmaType(@javax.annotation.Nonnull String slowDmaType) {
    this.slowDmaType = slowDmaType;
  }


  /**
   * Return true if this GetTimeSeriesStoch_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesStoch200ResponseMetaIndicator getTimeSeriesStoch200ResponseMetaIndicator = (GetTimeSeriesStoch200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesStoch200ResponseMetaIndicator.name) &&
        Objects.equals(this.fastKPeriod, getTimeSeriesStoch200ResponseMetaIndicator.fastKPeriod) &&
        Objects.equals(this.slowKPeriod, getTimeSeriesStoch200ResponseMetaIndicator.slowKPeriod) &&
        Objects.equals(this.slowDPeriod, getTimeSeriesStoch200ResponseMetaIndicator.slowDPeriod) &&
        Objects.equals(this.slowKmaType, getTimeSeriesStoch200ResponseMetaIndicator.slowKmaType) &&
        Objects.equals(this.slowDmaType, getTimeSeriesStoch200ResponseMetaIndicator.slowDmaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fastKPeriod, slowKPeriod, slowDPeriod, slowKmaType, slowDmaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesStoch200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fastKPeriod: ").append(toIndentedString(fastKPeriod)).append("\n");
    sb.append("    slowKPeriod: ").append(toIndentedString(slowKPeriod)).append("\n");
    sb.append("    slowDPeriod: ").append(toIndentedString(slowDPeriod)).append("\n");
    sb.append("    slowKmaType: ").append(toIndentedString(slowKmaType)).append("\n");
    sb.append("    slowDmaType: ").append(toIndentedString(slowDmaType)).append("\n");
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

    // add `slow_k_period` to the URL query string
    if (getSlowKPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_k_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowKPeriod()))));
    }

    // add `slow_d_period` to the URL query string
    if (getSlowDPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_d_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowDPeriod()))));
    }

    // add `slow_kma_type` to the URL query string
    if (getSlowKmaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_kma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowKmaType()))));
    }

    // add `slow_dma_type` to the URL query string
    if (getSlowDmaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sslow_dma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSlowDmaType()))));
    }

    return joiner.toString();
  }
}

