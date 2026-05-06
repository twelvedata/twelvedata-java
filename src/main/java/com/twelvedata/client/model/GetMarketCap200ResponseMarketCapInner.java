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
 * GetMarketCap200ResponseMarketCapInner
 */
@JsonPropertyOrder({
  GetMarketCap200ResponseMarketCapInner.JSON_PROPERTY_DATE,
  GetMarketCap200ResponseMarketCapInner.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMarketCap200ResponseMarketCapInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nonnull
  private Long value;

  public GetMarketCap200ResponseMarketCapInner() { 
  }

  public GetMarketCap200ResponseMarketCapInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Market capitalization date
   * @return date
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@javax.annotation.Nonnull String date) {
    this.date = date;
  }


  public GetMarketCap200ResponseMarketCapInner value(@javax.annotation.Nonnull Long value) {
    this.value = value;
    return this;
  }

  /**
   * Market capitalization value
   * @return value
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(@javax.annotation.Nonnull Long value) {
    this.value = value;
  }


  /**
   * Return true if this GetMarketCap_200_response_market_cap_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketCap200ResponseMarketCapInner getMarketCap200ResponseMarketCapInner = (GetMarketCap200ResponseMarketCapInner) o;
    return Objects.equals(this.date, getMarketCap200ResponseMarketCapInner.date) &&
        Objects.equals(this.value, getMarketCap200ResponseMarketCapInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketCap200ResponseMarketCapInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDate()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    return joiner.toString();
  }
}

