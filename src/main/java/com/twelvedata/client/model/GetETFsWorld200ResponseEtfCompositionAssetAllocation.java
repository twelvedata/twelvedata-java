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
 * Asset allocation of a fund by different asset classes and their respective weights
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_CASH,
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_STOCKS,
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_PREFERRED_STOCKS,
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_CONVERTABLES,
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_BONDS,
  GetETFsWorld200ResponseEtfCompositionAssetAllocation.JSON_PROPERTY_OTHERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfCompositionAssetAllocation {
  public static final String JSON_PROPERTY_CASH = "cash";
  @javax.annotation.Nullable
  private Double cash;

  public static final String JSON_PROPERTY_STOCKS = "stocks";
  @javax.annotation.Nullable
  private Double stocks;

  public static final String JSON_PROPERTY_PREFERRED_STOCKS = "preferred_stocks";
  @javax.annotation.Nullable
  private Double preferredStocks;

  public static final String JSON_PROPERTY_CONVERTABLES = "convertables";
  @javax.annotation.Nullable
  private Double convertables;

  public static final String JSON_PROPERTY_BONDS = "bonds";
  @javax.annotation.Nullable
  private Double bonds;

  public static final String JSON_PROPERTY_OTHERS = "others";
  @javax.annotation.Nullable
  private Double others;

  public GetETFsWorld200ResponseEtfCompositionAssetAllocation() { 
  }

  public GetETFsWorld200ResponseEtfCompositionAssetAllocation cash(@javax.annotation.Nullable Double cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in cash
   * @return cash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCash() {
    return cash;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCash(@javax.annotation.Nullable Double cash) {
    this.cash = cash;
  }


  public GetETFsWorld200ResponseEtfCompositionAssetAllocation stocks(@javax.annotation.Nullable Double stocks) {
    this.stocks = stocks;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in stocks
   * @return stocks
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STOCKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStocks() {
    return stocks;
  }


  @JsonProperty(value = JSON_PROPERTY_STOCKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStocks(@javax.annotation.Nullable Double stocks) {
    this.stocks = stocks;
  }


  public GetETFsWorld200ResponseEtfCompositionAssetAllocation preferredStocks(@javax.annotation.Nullable Double preferredStocks) {
    this.preferredStocks = preferredStocks;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in preferred stocks
   * @return preferredStocks
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStocks() {
    return preferredStocks;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStocks(@javax.annotation.Nullable Double preferredStocks) {
    this.preferredStocks = preferredStocks;
  }


  public GetETFsWorld200ResponseEtfCompositionAssetAllocation convertables(@javax.annotation.Nullable Double convertables) {
    this.convertables = convertables;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in convertable securities
   * @return convertables
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONVERTABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getConvertables() {
    return convertables;
  }


  @JsonProperty(value = JSON_PROPERTY_CONVERTABLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertables(@javax.annotation.Nullable Double convertables) {
    this.convertables = convertables;
  }


  public GetETFsWorld200ResponseEtfCompositionAssetAllocation bonds(@javax.annotation.Nullable Double bonds) {
    this.bonds = bonds;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in bond
   * @return bonds
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BONDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBonds() {
    return bonds;
  }


  @JsonProperty(value = JSON_PROPERTY_BONDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonds(@javax.annotation.Nullable Double bonds) {
    this.bonds = bonds;
  }


  public GetETFsWorld200ResponseEtfCompositionAssetAllocation others(@javax.annotation.Nullable Double others) {
    this.others = others;
    return this;
  }

  /**
   * Percentage of overall portfolio composition in other forms of holding
   * @return others
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOthers() {
    return others;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOthers(@javax.annotation.Nullable Double others) {
    this.others = others;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_composition_asset_allocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfCompositionAssetAllocation getETFsWorld200ResponseEtfCompositionAssetAllocation = (GetETFsWorld200ResponseEtfCompositionAssetAllocation) o;
    return Objects.equals(this.cash, getETFsWorld200ResponseEtfCompositionAssetAllocation.cash) &&
        Objects.equals(this.stocks, getETFsWorld200ResponseEtfCompositionAssetAllocation.stocks) &&
        Objects.equals(this.preferredStocks, getETFsWorld200ResponseEtfCompositionAssetAllocation.preferredStocks) &&
        Objects.equals(this.convertables, getETFsWorld200ResponseEtfCompositionAssetAllocation.convertables) &&
        Objects.equals(this.bonds, getETFsWorld200ResponseEtfCompositionAssetAllocation.bonds) &&
        Objects.equals(this.others, getETFsWorld200ResponseEtfCompositionAssetAllocation.others);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cash, stocks, preferredStocks, convertables, bonds, others);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfCompositionAssetAllocation {\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
    sb.append("    preferredStocks: ").append(toIndentedString(preferredStocks)).append("\n");
    sb.append("    convertables: ").append(toIndentedString(convertables)).append("\n");
    sb.append("    bonds: ").append(toIndentedString(bonds)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
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

    // add `cash` to the URL query string
    if (getCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCash()))));
    }

    // add `stocks` to the URL query string
    if (getStocks() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstocks%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStocks()))));
    }

    // add `preferred_stocks` to the URL query string
    if (getPreferredStocks() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stocks%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStocks()))));
    }

    // add `convertables` to the URL query string
    if (getConvertables() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconvertables%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConvertables()))));
    }

    // add `bonds` to the URL query string
    if (getBonds() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbonds%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBonds()))));
    }

    // add `others` to the URL query string
    if (getOthers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sothers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOthers()))));
    }

    return joiner.toString();
  }
}

