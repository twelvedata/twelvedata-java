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
 * MarketStateResponseItem
 */
@JsonPropertyOrder({
  MarketStateResponseItem.JSON_PROPERTY_NAME,
  MarketStateResponseItem.JSON_PROPERTY_CODE,
  MarketStateResponseItem.JSON_PROPERTY_COUNTRY,
  MarketStateResponseItem.JSON_PROPERTY_IS_MARKET_OPEN,
  MarketStateResponseItem.JSON_PROPERTY_TIME_AFTER_OPEN,
  MarketStateResponseItem.JSON_PROPERTY_TIME_TO_OPEN,
  MarketStateResponseItem.JSON_PROPERTY_TIME_TO_CLOSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class MarketStateResponseItem {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nonnull
  private String code;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_IS_MARKET_OPEN = "is_market_open";
  @javax.annotation.Nonnull
  private Boolean isMarketOpen;

  public static final String JSON_PROPERTY_TIME_AFTER_OPEN = "time_after_open";
  @javax.annotation.Nonnull
  private String timeAfterOpen;

  public static final String JSON_PROPERTY_TIME_TO_OPEN = "time_to_open";
  @javax.annotation.Nonnull
  private String timeToOpen;

  public static final String JSON_PROPERTY_TIME_TO_CLOSE = "time_to_close";
  @javax.annotation.Nonnull
  private String timeToClose;

  public MarketStateResponseItem() { 
  }

  public MarketStateResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of exchange
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


  public MarketStateResponseItem code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
   * @return code
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public MarketStateResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where the exchange is located
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public MarketStateResponseItem isMarketOpen(@javax.annotation.Nonnull Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
    return this;
  }

  /**
   * Indicates if the market is currently open
   * @return isMarketOpen
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_IS_MARKET_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMarketOpen() {
    return isMarketOpen;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_MARKET_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMarketOpen(@javax.annotation.Nonnull Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
  }


  public MarketStateResponseItem timeAfterOpen(@javax.annotation.Nonnull String timeAfterOpen) {
    this.timeAfterOpen = timeAfterOpen;
    return this;
  }

  /**
   * Time after market opening in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently closed - returns &lt;code&gt;00:00:00&lt;/code&gt;
   * @return timeAfterOpen
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_AFTER_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeAfterOpen() {
    return timeAfterOpen;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_AFTER_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeAfterOpen(@javax.annotation.Nonnull String timeAfterOpen) {
    this.timeAfterOpen = timeAfterOpen;
  }


  public MarketStateResponseItem timeToOpen(@javax.annotation.Nonnull String timeToOpen) {
    this.timeToOpen = timeToOpen;
    return this;
  }

  /**
   * Time to market opening in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently open - returns &lt;code&gt;00:00:00&lt;/code&gt;
   * @return timeToOpen
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_TO_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeToOpen() {
    return timeToOpen;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_TO_OPEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeToOpen(@javax.annotation.Nonnull String timeToOpen) {
    this.timeToOpen = timeToOpen;
  }


  public MarketStateResponseItem timeToClose(@javax.annotation.Nonnull String timeToClose) {
    this.timeToClose = timeToClose;
    return this;
  }

  /**
   * Time to market closing in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently closed - returns &lt;code&gt;00:00:00&lt;/code&gt;
   * @return timeToClose
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIME_TO_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeToClose() {
    return timeToClose;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_TO_CLOSE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeToClose(@javax.annotation.Nonnull String timeToClose) {
    this.timeToClose = timeToClose;
  }


  /**
   * Return true if this MarketStateResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketStateResponseItem marketStateResponseItem = (MarketStateResponseItem) o;
    return Objects.equals(this.name, marketStateResponseItem.name) &&
        Objects.equals(this.code, marketStateResponseItem.code) &&
        Objects.equals(this.country, marketStateResponseItem.country) &&
        Objects.equals(this.isMarketOpen, marketStateResponseItem.isMarketOpen) &&
        Objects.equals(this.timeAfterOpen, marketStateResponseItem.timeAfterOpen) &&
        Objects.equals(this.timeToOpen, marketStateResponseItem.timeToOpen) &&
        Objects.equals(this.timeToClose, marketStateResponseItem.timeToClose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, country, isMarketOpen, timeAfterOpen, timeToOpen, timeToClose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketStateResponseItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isMarketOpen: ").append(toIndentedString(isMarketOpen)).append("\n");
    sb.append("    timeAfterOpen: ").append(toIndentedString(timeAfterOpen)).append("\n");
    sb.append("    timeToOpen: ").append(toIndentedString(timeToOpen)).append("\n");
    sb.append("    timeToClose: ").append(toIndentedString(timeToClose)).append("\n");
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

    // add `code` to the URL query string
    if (getCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCode()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `is_market_open` to the URL query string
    if (getIsMarketOpen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sis_market_open%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsMarketOpen()))));
    }

    // add `time_after_open` to the URL query string
    if (getTimeAfterOpen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_after_open%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeAfterOpen()))));
    }

    // add `time_to_open` to the URL query string
    if (getTimeToOpen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_to_open%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeToOpen()))));
    }

    // add `time_to_close` to the URL query string
    if (getTimeToClose() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime_to_close%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeToClose()))));
    }

    return joiner.toString();
  }
}

