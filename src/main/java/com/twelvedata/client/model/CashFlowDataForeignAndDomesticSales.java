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
 * Foreign and domestic sales
 */
@JsonPropertyOrder({
  CashFlowDataForeignAndDomesticSales.JSON_PROPERTY_FOREIGN_SALES,
  CashFlowDataForeignAndDomesticSales.JSON_PROPERTY_DOMESTIC_SALES,
  CashFlowDataForeignAndDomesticSales.JSON_PROPERTY_ADJUSTED_GEOGRAPHY_SEGMENT_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataForeignAndDomesticSales {
  public static final String JSON_PROPERTY_FOREIGN_SALES = "foreign_sales";
  @javax.annotation.Nullable
  private Double foreignSales;

  public static final String JSON_PROPERTY_DOMESTIC_SALES = "domestic_sales";
  @javax.annotation.Nullable
  private Double domesticSales;

  public static final String JSON_PROPERTY_ADJUSTED_GEOGRAPHY_SEGMENT_DATA = "adjusted_geography_segment_data";
  @javax.annotation.Nullable
  private Double adjustedGeographySegmentData;

  public CashFlowDataForeignAndDomesticSales() { 
  }

  public CashFlowDataForeignAndDomesticSales foreignSales(@javax.annotation.Nullable Double foreignSales) {
    this.foreignSales = foreignSales;
    return this;
  }

  /**
   * Foreign sales
   * @return foreignSales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FOREIGN_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getForeignSales() {
    return foreignSales;
  }


  @JsonProperty(value = JSON_PROPERTY_FOREIGN_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignSales(@javax.annotation.Nullable Double foreignSales) {
    this.foreignSales = foreignSales;
  }


  public CashFlowDataForeignAndDomesticSales domesticSales(@javax.annotation.Nullable Double domesticSales) {
    this.domesticSales = domesticSales;
    return this;
  }

  /**
   * Domestic sales
   * @return domesticSales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOMESTIC_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDomesticSales() {
    return domesticSales;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMESTIC_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomesticSales(@javax.annotation.Nullable Double domesticSales) {
    this.domesticSales = domesticSales;
  }


  public CashFlowDataForeignAndDomesticSales adjustedGeographySegmentData(@javax.annotation.Nullable Double adjustedGeographySegmentData) {
    this.adjustedGeographySegmentData = adjustedGeographySegmentData;
    return this;
  }

  /**
   * Adjusted geography segment data
   * @return adjustedGeographySegmentData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADJUSTED_GEOGRAPHY_SEGMENT_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAdjustedGeographySegmentData() {
    return adjustedGeographySegmentData;
  }


  @JsonProperty(value = JSON_PROPERTY_ADJUSTED_GEOGRAPHY_SEGMENT_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjustedGeographySegmentData(@javax.annotation.Nullable Double adjustedGeographySegmentData) {
    this.adjustedGeographySegmentData = adjustedGeographySegmentData;
  }


  /**
   * Return true if this CashFlowData_foreign_and_domestic_sales object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataForeignAndDomesticSales cashFlowDataForeignAndDomesticSales = (CashFlowDataForeignAndDomesticSales) o;
    return Objects.equals(this.foreignSales, cashFlowDataForeignAndDomesticSales.foreignSales) &&
        Objects.equals(this.domesticSales, cashFlowDataForeignAndDomesticSales.domesticSales) &&
        Objects.equals(this.adjustedGeographySegmentData, cashFlowDataForeignAndDomesticSales.adjustedGeographySegmentData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignSales, domesticSales, adjustedGeographySegmentData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataForeignAndDomesticSales {\n");
    sb.append("    foreignSales: ").append(toIndentedString(foreignSales)).append("\n");
    sb.append("    domesticSales: ").append(toIndentedString(domesticSales)).append("\n");
    sb.append("    adjustedGeographySegmentData: ").append(toIndentedString(adjustedGeographySegmentData)).append("\n");
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

    // add `foreign_sales` to the URL query string
    if (getForeignSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforeign_sales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForeignSales()))));
    }

    // add `domestic_sales` to the URL query string
    if (getDomesticSales() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdomestic_sales%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDomesticSales()))));
    }

    // add `adjusted_geography_segment_data` to the URL query string
    if (getAdjustedGeographySegmentData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadjusted_geography_segment_data%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdjustedGeographySegmentData()))));
    }

    return joiner.toString();
  }
}

