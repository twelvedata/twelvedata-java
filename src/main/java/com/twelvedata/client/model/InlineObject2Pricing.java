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
 * InlineObject2Pricing
 */
@JsonPropertyOrder({
  InlineObject2Pricing.JSON_PROPERTY_12MONTH_HIGH,
  InlineObject2Pricing.JSON_PROPERTY_12MONTH_LOW,
  InlineObject2Pricing.JSON_PROPERTY_LAST_MONTH,
  InlineObject2Pricing.JSON_PROPERTY_NAV
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject2Pricing {
  public static final String JSON_PROPERTY_12MONTH_HIGH = "12_month_high";
  @javax.annotation.Nullable
  private Double _12monthHigh;

  public static final String JSON_PROPERTY_12MONTH_LOW = "12_month_low";
  @javax.annotation.Nullable
  private Double _12monthLow;

  public static final String JSON_PROPERTY_LAST_MONTH = "last_month";
  @javax.annotation.Nullable
  private Double lastMonth;

  public static final String JSON_PROPERTY_NAV = "nav";
  @javax.annotation.Nullable
  private Double nav;

  public InlineObject2Pricing() { 
  }

  public InlineObject2Pricing _12monthHigh(@javax.annotation.Nullable Double _12monthHigh) {
    this._12monthHigh = _12monthHigh;
    return this;
  }

  /**
   * Get _12monthHigh
   * @return _12monthHigh
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_12MONTH_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get12monthHigh() {
    return _12monthHigh;
  }


  @JsonProperty(value = JSON_PROPERTY_12MONTH_HIGH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set12monthHigh(@javax.annotation.Nullable Double _12monthHigh) {
    this._12monthHigh = _12monthHigh;
  }


  public InlineObject2Pricing _12monthLow(@javax.annotation.Nullable Double _12monthLow) {
    this._12monthLow = _12monthLow;
    return this;
  }

  /**
   * Get _12monthLow
   * @return _12monthLow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_12MONTH_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get12monthLow() {
    return _12monthLow;
  }


  @JsonProperty(value = JSON_PROPERTY_12MONTH_LOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set12monthLow(@javax.annotation.Nullable Double _12monthLow) {
    this._12monthLow = _12monthLow;
  }


  public InlineObject2Pricing lastMonth(@javax.annotation.Nullable Double lastMonth) {
    this.lastMonth = lastMonth;
    return this;
  }

  /**
   * Get lastMonth
   * @return lastMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLastMonth() {
    return lastMonth;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MONTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastMonth(@javax.annotation.Nullable Double lastMonth) {
    this.lastMonth = lastMonth;
  }


  public InlineObject2Pricing nav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
    return this;
  }

  /**
   * Get nav
   * @return nav
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNav() {
    return nav;
  }


  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
  }


  /**
   * Return true if this inline_object_2_pricing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2Pricing inlineObject2Pricing = (InlineObject2Pricing) o;
    return Objects.equals(this._12monthHigh, inlineObject2Pricing._12monthHigh) &&
        Objects.equals(this._12monthLow, inlineObject2Pricing._12monthLow) &&
        Objects.equals(this.lastMonth, inlineObject2Pricing.lastMonth) &&
        Objects.equals(this.nav, inlineObject2Pricing.nav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_12monthHigh, _12monthLow, lastMonth, nav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2Pricing {\n");
    sb.append("    _12monthHigh: ").append(toIndentedString(_12monthHigh)).append("\n");
    sb.append("    _12monthLow: ").append(toIndentedString(_12monthLow)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
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

    // add `12_month_high` to the URL query string
    if (get12monthHigh() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s12_month_high%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get12monthHigh()))));
    }

    // add `12_month_low` to the URL query string
    if (get12monthLow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s12_month_low%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get12monthLow()))));
    }

    // add `last_month` to the URL query string
    if (getLastMonth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_month%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastMonth()))));
    }

    // add `nav` to the URL query string
    if (getNav() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snav%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNav()))));
    }

    return joiner.toString();
  }
}

