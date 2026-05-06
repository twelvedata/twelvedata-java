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
import com.twelvedata.client.model.ResponseSanctionItem;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ResponseSanctionedEntitiy
 */
@JsonPropertyOrder({
  ResponseSanctionedEntitiy.JSON_PROPERTY_SYMBOL,
  ResponseSanctionedEntitiy.JSON_PROPERTY_NAME,
  ResponseSanctionedEntitiy.JSON_PROPERTY_MIC_CODE,
  ResponseSanctionedEntitiy.JSON_PROPERTY_COUNTRY,
  ResponseSanctionedEntitiy.JSON_PROPERTY_SANCTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ResponseSanctionedEntitiy {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_SANCTION = "sanction";
  @javax.annotation.Nonnull
  private ResponseSanctionItem sanction;

  public ResponseSanctionedEntitiy() { 
  }

  public ResponseSanctionedEntitiy symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The instrument symbol ticker
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


  public ResponseSanctionedEntitiy name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The instrument name
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


  public ResponseSanctionedEntitiy micCode(@javax.annotation.Nonnull String micCode) {
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


  public ResponseSanctionedEntitiy country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country name
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


  public ResponseSanctionedEntitiy sanction(@javax.annotation.Nonnull ResponseSanctionItem sanction) {
    this.sanction = sanction;
    return this;
  }

  /**
   * Get sanction
   * @return sanction
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SANCTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ResponseSanctionItem getSanction() {
    return sanction;
  }


  @JsonProperty(value = JSON_PROPERTY_SANCTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSanction(@javax.annotation.Nonnull ResponseSanctionItem sanction) {
    this.sanction = sanction;
  }


  /**
   * Return true if this ResponseSanctionedEntitiy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSanctionedEntitiy responseSanctionedEntitiy = (ResponseSanctionedEntitiy) o;
    return Objects.equals(this.symbol, responseSanctionedEntitiy.symbol) &&
        Objects.equals(this.name, responseSanctionedEntitiy.name) &&
        Objects.equals(this.micCode, responseSanctionedEntitiy.micCode) &&
        Objects.equals(this.country, responseSanctionedEntitiy.country) &&
        Objects.equals(this.sanction, responseSanctionedEntitiy.sanction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, micCode, country, sanction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSanctionedEntitiy {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    sanction: ").append(toIndentedString(sanction)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `sanction` to the URL query string
    if (getSanction() != null) {
      joiner.add(getSanction().toUrlQueryString(prefix + "sanction" + suffix));
    }

    return joiner.toString();
  }
}

