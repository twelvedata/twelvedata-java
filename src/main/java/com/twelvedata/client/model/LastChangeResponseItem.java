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
 * LastChangeResponseItem
 */
@JsonPropertyOrder({
  LastChangeResponseItem.JSON_PROPERTY_SYMBOL,
  LastChangeResponseItem.JSON_PROPERTY_MIC_CODE,
  LastChangeResponseItem.JSON_PROPERTY_LAST_CHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class LastChangeResponseItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_LAST_CHANGE = "last_change";
  @javax.annotation.Nonnull
  private String lastChange;

  public LastChangeResponseItem() { 
  }

  public LastChangeResponseItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Ticker of the company
   * @return symbol
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
  }


  public LastChangeResponseItem micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market Identifier Code (MIC) under ISO 10383 standard
   * @return micCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMicCode() {
    return micCode;
  }


  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMicCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
  }


  public LastChangeResponseItem lastChange(@javax.annotation.Nonnull String lastChange) {
    this.lastChange = lastChange;
    return this;
  }

  /**
   * The date and time of last changes, in &#x60;2006-01-02 15:04:05&#x60; format
   * @return lastChange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LAST_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLastChange() {
    return lastChange;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_CHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastChange(@javax.annotation.Nonnull String lastChange) {
    this.lastChange = lastChange;
  }


  /**
   * Return true if this LastChangeResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastChangeResponseItem lastChangeResponseItem = (LastChangeResponseItem) o;
    return Objects.equals(this.symbol, lastChangeResponseItem.symbol) &&
        Objects.equals(this.micCode, lastChangeResponseItem.micCode) &&
        Objects.equals(this.lastChange, lastChangeResponseItem.lastChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, micCode, lastChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastChangeResponseItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
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

    // add `symbol` to the URL query string
    if (getSymbol() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssymbol%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSymbol()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `last_change` to the URL query string
    if (getLastChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastChange()))));
    }

    return joiner.toString();
  }
}

