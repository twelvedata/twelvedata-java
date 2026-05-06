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
 * GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner
 */
@JsonPropertyOrder({
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_DATETIME,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_SUPERTREND,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_HEIKINHIGHS,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_HEIKINOPENS,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_HEIKINCLOSES,
  GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.JSON_PROPERTY_HEIKINLOWS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_SUPERTREND = "supertrend";
  @javax.annotation.Nonnull
  private String supertrend;

  public static final String JSON_PROPERTY_HEIKINHIGHS = "heikinhighs";
  @javax.annotation.Nonnull
  private String heikinhighs;

  public static final String JSON_PROPERTY_HEIKINOPENS = "heikinopens";
  @javax.annotation.Nonnull
  private String heikinopens;

  public static final String JSON_PROPERTY_HEIKINCLOSES = "heikincloses";
  @javax.annotation.Nonnull
  private String heikincloses;

  public static final String JSON_PROPERTY_HEIKINLOWS = "heikinlows";
  @javax.annotation.Nonnull
  private String heikinlows;

  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner() { 
  }

  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner supertrend(@javax.annotation.Nonnull String supertrend) {
    this.supertrend = supertrend;
    return this;
  }

  /**
   * SuperTrend value
   * @return supertrend
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SUPERTREND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSupertrend() {
    return supertrend;
  }


  @JsonProperty(value = JSON_PROPERTY_SUPERTREND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSupertrend(@javax.annotation.Nonnull String supertrend) {
    this.supertrend = supertrend;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner heikinhighs(@javax.annotation.Nonnull String heikinhighs) {
    this.heikinhighs = heikinhighs;
    return this;
  }

  /**
   * Heikin-Ashi high values
   * @return heikinhighs
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HEIKINHIGHS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeikinhighs() {
    return heikinhighs;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIKINHIGHS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeikinhighs(@javax.annotation.Nonnull String heikinhighs) {
    this.heikinhighs = heikinhighs;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner heikinopens(@javax.annotation.Nonnull String heikinopens) {
    this.heikinopens = heikinopens;
    return this;
  }

  /**
   * Heikin-Ashi open values
   * @return heikinopens
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HEIKINOPENS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeikinopens() {
    return heikinopens;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIKINOPENS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeikinopens(@javax.annotation.Nonnull String heikinopens) {
    this.heikinopens = heikinopens;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner heikincloses(@javax.annotation.Nonnull String heikincloses) {
    this.heikincloses = heikincloses;
    return this;
  }

  /**
   * Heikin-Ashi close values
   * @return heikincloses
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HEIKINCLOSES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeikincloses() {
    return heikincloses;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIKINCLOSES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeikincloses(@javax.annotation.Nonnull String heikincloses) {
    this.heikincloses = heikincloses;
  }


  public GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner heikinlows(@javax.annotation.Nonnull String heikinlows) {
    this.heikinlows = heikinlows;
    return this;
  }

  /**
   * Heikin-Ashi low values
   * @return heikinlows
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_HEIKINLOWS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeikinlows() {
    return heikinlows;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIKINLOWS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeikinlows(@javax.annotation.Nonnull String heikinlows) {
    this.heikinlows = heikinlows;
  }


  /**
   * Return true if this GetTimeSeriesSuperTrendHeikinAshiCandles_200_response_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner = (GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner) o;
    return Objects.equals(this.datetime, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.datetime) &&
        Objects.equals(this.supertrend, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.supertrend) &&
        Objects.equals(this.heikinhighs, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.heikinhighs) &&
        Objects.equals(this.heikinopens, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.heikinopens) &&
        Objects.equals(this.heikincloses, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.heikincloses) &&
        Objects.equals(this.heikinlows, getTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner.heikinlows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, supertrend, heikinhighs, heikinopens, heikincloses, heikinlows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSuperTrendHeikinAshiCandles200ResponseValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    supertrend: ").append(toIndentedString(supertrend)).append("\n");
    sb.append("    heikinhighs: ").append(toIndentedString(heikinhighs)).append("\n");
    sb.append("    heikinopens: ").append(toIndentedString(heikinopens)).append("\n");
    sb.append("    heikincloses: ").append(toIndentedString(heikincloses)).append("\n");
    sb.append("    heikinlows: ").append(toIndentedString(heikinlows)).append("\n");
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

    // add `supertrend` to the URL query string
    if (getSupertrend() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssupertrend%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSupertrend()))));
    }

    // add `heikinhighs` to the URL query string
    if (getHeikinhighs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheikinhighs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeikinhighs()))));
    }

    // add `heikinopens` to the URL query string
    if (getHeikinopens() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheikinopens%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeikinopens()))));
    }

    // add `heikincloses` to the URL query string
    if (getHeikincloses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheikincloses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeikincloses()))));
    }

    // add `heikinlows` to the URL query string
    if (getHeikinlows() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheikinlows%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeikinlows()))));
    }

    return joiner.toString();
  }
}

