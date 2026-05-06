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
  GetTimeSeriesSub200ResponseMetaIndicator.JSON_PROPERTY_NAME,
  GetTimeSeriesSub200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE1,
  GetTimeSeriesSub200ResponseMetaIndicator.JSON_PROPERTY_SERIES_TYPE2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSub200ResponseMetaIndicator {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SERIES_TYPE1 = "series_type_1";
  @javax.annotation.Nonnull
  private String seriesType1;

  public static final String JSON_PROPERTY_SERIES_TYPE2 = "series_type_2";
  @javax.annotation.Nonnull
  private String seriesType2;

  public GetTimeSeriesSub200ResponseMetaIndicator() { 
  }

  public GetTimeSeriesSub200ResponseMetaIndicator name(@javax.annotation.Nonnull String name) {
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


  public GetTimeSeriesSub200ResponseMetaIndicator seriesType1(@javax.annotation.Nonnull String seriesType1) {
    this.seriesType1 = seriesType1;
    return this;
  }

  /**
   * First price data type on which technical indicator is calculated
   * @return seriesType1
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeriesType1() {
    return seriesType1;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE1, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeriesType1(@javax.annotation.Nonnull String seriesType1) {
    this.seriesType1 = seriesType1;
  }


  public GetTimeSeriesSub200ResponseMetaIndicator seriesType2(@javax.annotation.Nonnull String seriesType2) {
    this.seriesType2 = seriesType2;
    return this;
  }

  /**
   * Second price data type on which technical indicator is calculated
   * @return seriesType2
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeriesType2() {
    return seriesType2;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIES_TYPE2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeriesType2(@javax.annotation.Nonnull String seriesType2) {
    this.seriesType2 = seriesType2;
  }


  /**
   * Return true if this GetTimeSeriesSub_200_response_meta_indicator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSub200ResponseMetaIndicator getTimeSeriesSub200ResponseMetaIndicator = (GetTimeSeriesSub200ResponseMetaIndicator) o;
    return Objects.equals(this.name, getTimeSeriesSub200ResponseMetaIndicator.name) &&
        Objects.equals(this.seriesType1, getTimeSeriesSub200ResponseMetaIndicator.seriesType1) &&
        Objects.equals(this.seriesType2, getTimeSeriesSub200ResponseMetaIndicator.seriesType2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seriesType1, seriesType2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSub200ResponseMetaIndicator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seriesType1: ").append(toIndentedString(seriesType1)).append("\n");
    sb.append("    seriesType2: ").append(toIndentedString(seriesType2)).append("\n");
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

    // add `series_type_1` to the URL query string
    if (getSeriesType1() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type_1%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType1()))));
    }

    // add `series_type_2` to the URL query string
    if (getSeriesType2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseries_type_2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeriesType2()))));
    }

    return joiner.toString();
  }
}

