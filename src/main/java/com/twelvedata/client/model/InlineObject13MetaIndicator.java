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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * InlineObject13MetaIndicator
 */
@JsonPropertyOrder({
  InlineObject13MetaIndicator.JSON_PROPERTY_MA_TYPE,
  InlineObject13MetaIndicator.JSON_PROPERTY_MAX_PERIOD,
  InlineObject13MetaIndicator.JSON_PROPERTY_MIN_PERIOD,
  InlineObject13MetaIndicator.JSON_PROPERTY_NAME,
  InlineObject13MetaIndicator.JSON_PROPERTY_PERIODS,
  InlineObject13MetaIndicator.JSON_PROPERTY_SERIES_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject13MetaIndicator {
  public static final String JSON_PROPERTY_MA_TYPE = "ma_type";
  @javax.annotation.Nullable
  private String maType;

  public static final String JSON_PROPERTY_MAX_PERIOD = "max_period";
  @javax.annotation.Nullable
  private Long maxPeriod;

  public static final String JSON_PROPERTY_MIN_PERIOD = "min_period";
  @javax.annotation.Nullable
  private Long minPeriod;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PERIODS = "periods";
  @javax.annotation.Nullable
  private List<Long> periods = new ArrayList<>();

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  @javax.annotation.Nullable
  private String seriesType;

  public InlineObject13MetaIndicator() { 
  }

  public InlineObject13MetaIndicator maType(@javax.annotation.Nullable String maType) {
    this.maType = maType;
    return this;
  }

  /**
   * Get maType
   * @return maType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaType() {
    return maType;
  }


  @JsonProperty(value = JSON_PROPERTY_MA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaType(@javax.annotation.Nullable String maType) {
    this.maType = maType;
  }


  public InlineObject13MetaIndicator maxPeriod(@javax.annotation.Nullable Long maxPeriod) {
    this.maxPeriod = maxPeriod;
    return this;
  }

  /**
   * Get maxPeriod
   * @return maxPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxPeriod() {
    return maxPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPeriod(@javax.annotation.Nullable Long maxPeriod) {
    this.maxPeriod = maxPeriod;
  }


  public InlineObject13MetaIndicator minPeriod(@javax.annotation.Nullable Long minPeriod) {
    this.minPeriod = minPeriod;
    return this;
  }

  /**
   * Get minPeriod
   * @return minPeriod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinPeriod() {
    return minPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinPeriod(@javax.annotation.Nullable Long minPeriod) {
    this.minPeriod = minPeriod;
  }


  public InlineObject13MetaIndicator name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public InlineObject13MetaIndicator periods(@javax.annotation.Nullable List<Long> periods) {
    this.periods = periods;
    return this;
  }

  public InlineObject13MetaIndicator addPeriodsItem(Long periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * Get periods
   * @return periods
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERIODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getPeriods() {
    return periods;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriods(@javax.annotation.Nullable List<Long> periods) {
    this.periods = periods;
  }


  public InlineObject13MetaIndicator seriesType(@javax.annotation.Nullable String seriesType) {
    this.seriesType = seriesType;
    return this;
  }

  /**
   * Get seriesType
   * @return seriesType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSeriesType() {
    return seriesType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeriesType(@javax.annotation.Nullable String seriesType) {
    this.seriesType = seriesType;
  }


  /**
   * Return true if this inline_object_13_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject13MetaIndicator inlineObject13MetaIndicator = (InlineObject13MetaIndicator) o;
    return Objects.equals(this.maType, inlineObject13MetaIndicator.maType) &&
        Objects.equals(this.maxPeriod, inlineObject13MetaIndicator.maxPeriod) &&
        Objects.equals(this.minPeriod, inlineObject13MetaIndicator.minPeriod) &&
        Objects.equals(this.name, inlineObject13MetaIndicator.name) &&
        Objects.equals(this.periods, inlineObject13MetaIndicator.periods) &&
        Objects.equals(this.seriesType, inlineObject13MetaIndicator.seriesType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maType, maxPeriod, minPeriod, name, periods, seriesType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject13MetaIndicator {\n");
    sb.append("    maType: ").append(toIndentedString(maType)).append("\n");
    sb.append("    maxPeriod: ").append(toIndentedString(maxPeriod)).append("\n");
    sb.append("    minPeriod: ").append(toIndentedString(minPeriod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
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

    // add `ma_type` to the URL query string
    if (getMaType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sma_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaType()))));
    }

    // add `max_period` to the URL query string
    if (getMaxPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxPeriod()))));
    }

    // add `min_period` to the URL query string
    if (getMinPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinPeriod()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `periods` to the URL query string
    if (getPeriods() != null) {
      for (int i = 0; i < getPeriods().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%speriods%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getPeriods().get(i)))));
      }
    }

    // add `series_type` to the URL query string
    if (getSeriesType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType()))));
    }

    return joiner.toString();
  }
}

