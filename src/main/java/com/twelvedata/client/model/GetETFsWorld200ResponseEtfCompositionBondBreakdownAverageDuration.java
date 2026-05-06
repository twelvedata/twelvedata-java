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
 * Average duration of bond holding of a fund
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration.JSON_PROPERTY_FUND,
  GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration.JSON_PROPERTY_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration {
  public static final String JSON_PROPERTY_FUND = "fund";
  @javax.annotation.Nullable
  private Double fund;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  @javax.annotation.Nullable
  private Double category;

  public GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration() { 
  }

  public GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration fund(@javax.annotation.Nullable Double fund) {
    this.fund = fund;
    return this;
  }

  /**
   * Average duration of bond holding of a fund
   * @return fund
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFund() {
    return fund;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFund(@javax.annotation.Nullable Double fund) {
    this.fund = fund;
  }


  public GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration category(@javax.annotation.Nullable Double category) {
    this.category = category;
    return this;
  }

  /**
   * Average duration of bond holding of funds in the same category
   * @return category
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCategory() {
    return category;
  }


  @JsonProperty(value = JSON_PROPERTY_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(@javax.annotation.Nullable Double category) {
    this.category = category;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_composition_bond_breakdown_average_duration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration getETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration = (GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration) o;
    return Objects.equals(this.fund, getETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration.fund) &&
        Objects.equals(this.category, getETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fund, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration {\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

    // add `fund` to the URL query string
    if (getFund() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFund()))));
    }

    // add `category` to the URL query string
    if (getCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scategory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCategory()))));
    }

    return joiner.toString();
  }
}

