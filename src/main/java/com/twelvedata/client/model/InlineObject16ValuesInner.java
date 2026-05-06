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
 * InlineObject16ValuesInner
 */
@JsonPropertyOrder({
  InlineObject16ValuesInner.JSON_PROPERTY_DATETIME,
  InlineObject16ValuesInner.JSON_PROPERTY_TAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject16ValuesInner {
  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_TAN = "tan";
  @javax.annotation.Nonnull
  private String tan;

  public InlineObject16ValuesInner() { 
  }

  public InlineObject16ValuesInner datetime(@javax.annotation.Nonnull String datetime) {
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


  public InlineObject16ValuesInner tan(@javax.annotation.Nonnull String tan) {
    this.tan = tan;
    return this;
  }

  /**
   * TAN value
   * @return tan
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TAN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTan() {
    return tan;
  }


  @JsonProperty(value = JSON_PROPERTY_TAN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTan(@javax.annotation.Nonnull String tan) {
    this.tan = tan;
  }


  /**
   * Return true if this inline_object_16_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject16ValuesInner inlineObject16ValuesInner = (InlineObject16ValuesInner) o;
    return Objects.equals(this.datetime, inlineObject16ValuesInner.datetime) &&
        Objects.equals(this.tan, inlineObject16ValuesInner.tan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datetime, tan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject16ValuesInner {\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    tan: ").append(toIndentedString(tan)).append("\n");
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

    // add `tan` to the URL query string
    if (getTan() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stan%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTan()))));
    }

    return joiner.toString();
  }
}

