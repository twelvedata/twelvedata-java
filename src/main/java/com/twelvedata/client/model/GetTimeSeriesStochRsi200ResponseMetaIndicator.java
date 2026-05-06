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
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE,
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_RSI_LENGTH,
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_STOCH_LENGTH,
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_K_PERIOD,
  GetTimeSeriesStochRsi200ResponseMetaIndicator.JSON_PROPERTY_D_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesStochRsi200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nonnull
  private String seriesType;

  public static final String JSON_PROPERTY_RSI_LENGTH = "rsi_length";
  @javax.annotation.Nonnull
  private Long rsiLength;

  public static final String JSON_PROPERTY_STOCH_LENGTH = "stoch_length";
  @javax.annotation.Nonnull
  private Long stochLength;

  public static final String JSON_PROPERTY_K_PERIOD = "k_period";
  @javax.annotation.Nonnull
  private Long kPeriod;

  public static final String JSON_PROPERTY_D_PERIOD = "d_period";
  @javax.annotation.Nonnull
  private Long dPeriod;

  public GetTimeSeriesStochRsi200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesStochRsi200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesStochRsi200ResponseMetaIndicator seriesType(@javax.annotation.Nonnull String seriesType) {
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


  public GetTimeSeriesStochRsi200ResponseMetaIndicator rsiLength(@javax.annotation.Nonnull Long rsiLength) {
    this.rsiLength = rsiLength;
    return this;
  }

  /**
   * Length of period for calculating the RSI component
   * @return rsiLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RSI_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRsiLength() {
    return rsiLength;
  }


  @JsonProperty(value = JSON_PROPERTY_RSI_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRsiLength(@javax.annotation.Nonnull Long rsiLength) {
    this.rsiLength = rsiLength;
  }


  public GetTimeSeriesStochRsi200ResponseMetaIndicator stochLength(@javax.annotation.Nonnull Long stochLength) {
    this.stochLength = stochLength;
    return this;
  }

  /**
   * Period length for computing the stochastic oscillator of the RSI
   * @return stochLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STOCH_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStochLength() {
    return stochLength;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCH_LENGTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStochLength(@javax.annotation.Nonnull Long stochLength) {
    this.stochLength = stochLength;
  }


  public GetTimeSeriesStochRsi200ResponseMetaIndicator kPeriod(@javax.annotation.Nonnull Long kPeriod) {
    this.kPeriod = kPeriod;
    return this;
  }

  /**
   * Period for smoothing the %K line
   * @return kPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getkPeriod() {
    return kPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_K_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setkPeriod(@javax.annotation.Nonnull Long kPeriod) {
    this.kPeriod = kPeriod;
  }


  public GetTimeSeriesStochRsi200ResponseMetaIndicator dPeriod(@javax.annotation.Nonnull Long dPeriod) {
    this.dPeriod = dPeriod;
    return this;
  }

  /**
   * Period for smoothing the %D line, which is a moving average of %K
   * @return dPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getdPeriod() {
    return dPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_D_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setdPeriod(@javax.annotation.Nonnull Long dPeriod) {
    this.dPeriod = dPeriod;
  }


  /**
   * Return true if this GetTimeSeriesStochRsi_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesStochRsi200ResponseMetaIndicator getTimeSeriesStochRsi200ResponseMetaIndicator = (GetTimeSeriesStochRsi200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesStochRsi200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType, getTimeSeriesStochRsi200ResponseMetaIndicator.seriesType) &&
        Objects.equals(this.rsiLength, getTimeSeriesStochRsi200ResponseMetaIndicator.rsiLength) &&
        Objects.equals(this.stochLength, getTimeSeriesStochRsi200ResponseMetaIndicator.stochLength) &&
        Objects.equals(this.kPeriod, getTimeSeriesStochRsi200ResponseMetaIndicator.kPeriod) &&
        Objects.equals(this.dPeriod, getTimeSeriesStochRsi200ResponseMetaIndicator.dPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType, rsiLength, stochLength, kPeriod, dPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesStochRsi200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    rsiLength: ").append(toIndentedString(rsiLength)).append("\n");
    sb.append("    stochLength: ").append(toIndentedString(stochLength)).append("\n");
    sb.append("    kPeriod: ").append(toIndentedString(kPeriod)).append("\n");
    sb.append("    dPeriod: ").append(toIndentedString(dPeriod)).append("\n");
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

    // add `rsi_length` to the URL query string
    if (getRsiLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srsi_length%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRsiLength()))));
    }

    // add `stoch_length` to the URL query string
    if (getStochLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstoch_length%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStochLength()))));
    }

    // add `k_period` to the URL query string
    if (getkPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sk_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getkPeriod()))));
    }

    // add `d_period` to the URL query string
    if (getdPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sd_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getdPeriod()))));
    }

    return joiner.toString();
  }
}

