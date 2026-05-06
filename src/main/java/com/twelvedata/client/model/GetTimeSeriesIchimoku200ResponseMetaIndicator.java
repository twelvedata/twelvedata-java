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
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_CONVERSION_LINE_PERIOD,
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_BASE_LINE_PERIOD,
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_LEADING_SPAN_B_PERIOD,
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_LAGGING_SPAN_PERIOD,
  GetTimeSeriesIchimoku200ResponseMetaIndicator.JSON_PROPERTY_INCLUDE_AHEAD_SPAN_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesIchimoku200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CONVERSION_LINE_PERIOD = "conversion_line_period";
  @javax.annotation.Nonnull
  private Long conversionLinePeriod;

  public static final String JSON_PROPERTY_BASE_LINE_PERIOD = "base_line_period";
  @javax.annotation.Nonnull
  private Long baseLinePeriod;

  public static final String JSON_PROPERTY_LEADING_SPAN_B_PERIOD = "leading_span_b_period";
  @javax.annotation.Nonnull
  private Long leadingSpanBPeriod;

  public static final String JSON_PROPERTY_LAGGING_SPAN_PERIOD = "lagging_span_period";
  @javax.annotation.Nonnull
  private Long laggingSpanPeriod;

  public static final String JSON_PROPERTY_INCLUDE_AHEAD_SPAN_PERIOD = "include_ahead_span_period";
  @javax.annotation.Nonnull
  private Boolean includeAheadSpanPeriod;

  public GetTimeSeriesIchimoku200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesIchimoku200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesIchimoku200ResponseMetaIndicator conversionLinePeriod(@javax.annotation.Nonnull Long conversionLinePeriod) {
    this.conversionLinePeriod = conversionLinePeriod;
    return this;
  }

  /**
   * The time period used for generating the conversation line
   * @return conversionLinePeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONVERSION_LINE_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getConversionLinePeriod() {
    return conversionLinePeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_CONVERSION_LINE_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConversionLinePeriod(@javax.annotation.Nonnull Long conversionLinePeriod) {
    this.conversionLinePeriod = conversionLinePeriod;
  }


  public GetTimeSeriesIchimoku200ResponseMetaIndicator baseLinePeriod(@javax.annotation.Nonnull Long baseLinePeriod) {
    this.baseLinePeriod = baseLinePeriod;
    return this;
  }

  /**
   * The time period used for generating the base line
   * @return baseLinePeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_LINE_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getBaseLinePeriod() {
    return baseLinePeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_LINE_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseLinePeriod(@javax.annotation.Nonnull Long baseLinePeriod) {
    this.baseLinePeriod = baseLinePeriod;
  }


  public GetTimeSeriesIchimoku200ResponseMetaIndicator leadingSpanBPeriod(@javax.annotation.Nonnull Long leadingSpanBPeriod) {
    this.leadingSpanBPeriod = leadingSpanBPeriod;
    return this;
  }

  /**
   * The time period used for generating the leading span B line
   * @return leadingSpanBPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LEADING_SPAN_B_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLeadingSpanBPeriod() {
    return leadingSpanBPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_LEADING_SPAN_B_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLeadingSpanBPeriod(@javax.annotation.Nonnull Long leadingSpanBPeriod) {
    this.leadingSpanBPeriod = leadingSpanBPeriod;
  }


  public GetTimeSeriesIchimoku200ResponseMetaIndicator laggingSpanPeriod(@javax.annotation.Nonnull Long laggingSpanPeriod) {
    this.laggingSpanPeriod = laggingSpanPeriod;
    return this;
  }

  /**
   * The time period used for generating the lagging span line
   * @return laggingSpanPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LAGGING_SPAN_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLaggingSpanPeriod() {
    return laggingSpanPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_LAGGING_SPAN_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLaggingSpanPeriod(@javax.annotation.Nonnull Long laggingSpanPeriod) {
    this.laggingSpanPeriod = laggingSpanPeriod;
  }


  public GetTimeSeriesIchimoku200ResponseMetaIndicator includeAheadSpanPeriod(@javax.annotation.Nonnull Boolean includeAheadSpanPeriod) {
    this.includeAheadSpanPeriod = includeAheadSpanPeriod;
    return this;
  }

  /**
   * Indicates whether to include ahead span period
   * @return includeAheadSpanPeriod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INCLUDE_AHEAD_SPAN_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIncludeAheadSpanPeriod() {
    return includeAheadSpanPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_INCLUDE_AHEAD_SPAN_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeAheadSpanPeriod(@javax.annotation.Nonnull Boolean includeAheadSpanPeriod) {
    this.includeAheadSpanPeriod = includeAheadSpanPeriod;
  }


  /**
   * Return true if this GetTimeSeriesIchimoku_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesIchimoku200ResponseMetaIndicator getTimeSeriesIchimoku200ResponseMetaIndicator = (GetTimeSeriesIchimoku200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesIchimoku200ResponseMetaIndicator.name) &&
        Objects.equals(this.conversionLinePeriod, getTimeSeriesIchimoku200ResponseMetaIndicator.conversionLinePeriod) &&
        Objects.equals(this.baseLinePeriod, getTimeSeriesIchimoku200ResponseMetaIndicator.baseLinePeriod) &&
        Objects.equals(this.leadingSpanBPeriod, getTimeSeriesIchimoku200ResponseMetaIndicator.leadingSpanBPeriod) &&
        Objects.equals(this.laggingSpanPeriod, getTimeSeriesIchimoku200ResponseMetaIndicator.laggingSpanPeriod) &&
        Objects.equals(this.includeAheadSpanPeriod, getTimeSeriesIchimoku200ResponseMetaIndicator.includeAheadSpanPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, conversionLinePeriod, baseLinePeriod, leadingSpanBPeriod, laggingSpanPeriod, includeAheadSpanPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesIchimoku200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversionLinePeriod: ").append(toIndentedString(conversionLinePeriod)).append("\n");
    sb.append("    baseLinePeriod: ").append(toIndentedString(baseLinePeriod)).append("\n");
    sb.append("    leadingSpanBPeriod: ").append(toIndentedString(leadingSpanBPeriod)).append("\n");
    sb.append("    laggingSpanPeriod: ").append(toIndentedString(laggingSpanPeriod)).append("\n");
    sb.append("    includeAheadSpanPeriod: ").append(toIndentedString(includeAheadSpanPeriod)).append("\n");
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

    // add `conversion_line_period` to the URL query string
    if (getConversionLinePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconversion_line_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConversionLinePeriod()))));
    }

    // add `base_line_period` to the URL query string
    if (getBaseLinePeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbase_line_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseLinePeriod()))));
    }

    // add `leading_span_b_period` to the URL query string
    if (getLeadingSpanBPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sleading_span_b_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLeadingSpanBPeriod()))));
    }

    // add `lagging_span_period` to the URL query string
    if (getLaggingSpanPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slagging_span_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLaggingSpanPeriod()))));
    }

    // add `include_ahead_span_period` to the URL query string
    if (getIncludeAheadSpanPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinclude_ahead_span_period%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncludeAheadSpanPeriod()))));
    }

    return joiner.toString();
  }
}

