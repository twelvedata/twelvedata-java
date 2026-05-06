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
 * GetTimeSeriesMama200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesMama200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesMama200ResponseValuesInner.JSON_PROPERTY_MAMA,
  GetTimeSeriesMama200ResponseValuesInner.JSON_PROPERTY_FAMA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesMama200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_MAMA = "mama";
  @javax.annotation.Nonnull
  private String mama;

  public static final String JSON_PROPERTY_FAMA = "fama";
  @javax.annotation.Nonnull
  private String fama;

  public GetTimeSeriesMama200ResponseValuesInner() { 
  }

  public GetTimeSeriesMama200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesMama200ResponseValuesInner mama(@javax.annotation.Nonnull String mama) {
    this.mama = mama;
    return this;
  }

  /**
   * MAMA value
   * @return mama
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MAMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMama() {
    return mama;
  }


  @JsonProperty(value = JSON_PROPERTY_MAMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMama(@javax.annotation.Nonnull String mama) {
    this.mama = mama;
  }


  public GetTimeSeriesMama200ResponseValuesInner fama(@javax.annotation.Nonnull String fama) {
    this.fama = fama;
    return this;
  }

  /**
   * FAMA value
   * @return fama
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FAMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFama() {
    return fama;
  }


  @JsonProperty(value = JSON_PROPERTY_FAMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFama(@javax.annotation.Nonnull String fama) {
    this.fama = fama;
  }


  /**
   * Return true if this GetTimeSeriesMama_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesMama200ResponseValuesInner getTimeSeriesMama200ResponseValuesInner = (GetTimeSeriesMama200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesMama200ResponseValuesInner.datetime) &&
        Objects.equals(this.mama, getTimeSeriesMama200ResponseValuesInner.mama) &&
        Objects.equals(this.fama, getTimeSeriesMama200ResponseValuesInner.fama);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, mama, fama);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesMama200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    mama: ").append(toIndentedString(mama)).append("\n");
    sb.append("    fama: ").append(toIndentedString(fama)).append("\n");
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

    // add `mama` to the URL query string
    if (getMama() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smama%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMama()))));
    }

    // add `fama` to the URL query string
    if (getFama() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfama%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFama()))));
    }

    return joiner.toString();
  }
}

