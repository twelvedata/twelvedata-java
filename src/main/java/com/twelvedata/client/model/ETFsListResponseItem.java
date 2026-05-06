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
 * ETFsListResponseItem
 */
@JsonPropertyOrder({
  ETFsListResponseItem.JSON_PROPERTY_SYMBOL,
  ETFsListResponseItem.JSON_PROPERTY_NAME,
  ETFsListResponseItem.JSON_PROPERTY_COUNTRY,
  ETFsListResponseItem.JSON_PROPERTY_MIC_CODE,
  ETFsListResponseItem.JSON_PROPERTY_FUND_FAMILY,
  ETFsListResponseItem.JSON_PROPERTY_FUND_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ETFsListResponseItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_FUND_FAMILY = "fund_family";
  @javax.annotation.Nonnull
  private String fundFamily;

  public static final String JSON_PROPERTY_FUND_TYPE = "fund_type";
  @javax.annotation.Nonnull
  private String fundType;

  public ETFsListResponseItem() { 
  }

  public ETFsListResponseItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Instrument symbol (ticker)
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


  public ETFsListResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the fund
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


  public ETFsListResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of fund incorporation
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


  public ETFsListResponseItem micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
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


  public ETFsListResponseItem fundFamily(@javax.annotation.Nonnull String fundFamily) {
    this.fundFamily = fundFamily;
    return this;
  }

  /**
   * Investment company that manages the fund
   * @return fundFamily
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFundFamily() {
    return fundFamily;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundFamily(@javax.annotation.Nonnull String fundFamily) {
    this.fundFamily = fundFamily;
  }


  public ETFsListResponseItem fundType(@javax.annotation.Nonnull String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Type of fund
   * @return fundType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFundType() {
    return fundType;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundType(@javax.annotation.Nonnull String fundType) {
    this.fundType = fundType;
  }


  /**
   * Return true if this ETFsListResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFsListResponseItem etFsListResponseItem = (ETFsListResponseItem) o;
    return Objects.equals(this.symbol, etFsListResponseItem.symbol) &&
        Objects.equals(this.name, etFsListResponseItem.name) &&
        Objects.equals(this.country, etFsListResponseItem.country) &&
        Objects.equals(this.micCode, etFsListResponseItem.micCode) &&
        Objects.equals(this.fundFamily, etFsListResponseItem.fundFamily) &&
        Objects.equals(this.fundType, etFsListResponseItem.fundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, country, micCode, fundFamily, fundType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFsListResponseItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    fundFamily: ").append(toIndentedString(fundFamily)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `fund_family` to the URL query string
    if (getFundFamily() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_family%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundFamily()))));
    }

    // add `fund_type` to the URL query string
    if (getFundType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundType()))));
    }

    return joiner.toString();
  }
}

