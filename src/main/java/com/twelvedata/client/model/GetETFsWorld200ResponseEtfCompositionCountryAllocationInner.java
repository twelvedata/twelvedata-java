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
 * GetETFsWorld200ResponseEtfCompositionCountryAllocationInner
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfCompositionCountryAllocationInner.JSON_PROPERTY_COUNTRY,
  GetETFsWorld200ResponseEtfCompositionCountryAllocationInner.JSON_PROPERTY_ALLOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfCompositionCountryAllocationInner {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable
  private String country;

  public static final String JSON_PROPERTY_ALLOCATION = "allocation";
  @javax.annotation.Nullable
  private Double allocation;

  public GetETFsWorld200ResponseEtfCompositionCountryAllocationInner() { 
  }

  public GetETFsWorld200ResponseEtfCompositionCountryAllocationInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country name
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetETFsWorld200ResponseEtfCompositionCountryAllocationInner allocation(@javax.annotation.Nullable Double allocation) {
    this.allocation = allocation;
    return this;
  }

  /**
   * Percentages of a fund&#39;s net assets distributed to securities of the country
   * @return allocation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAllocation() {
    return allocation;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllocation(@javax.annotation.Nullable Double allocation) {
    this.allocation = allocation;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_composition_country_allocation_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfCompositionCountryAllocationInner getETFsWorld200ResponseEtfCompositionCountryAllocationInner = (GetETFsWorld200ResponseEtfCompositionCountryAllocationInner) o;
    return Objects.equals(this.country, getETFsWorld200ResponseEtfCompositionCountryAllocationInner.country) &&
        Objects.equals(this.allocation, getETFsWorld200ResponseEtfCompositionCountryAllocationInner.allocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, allocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfCompositionCountryAllocationInner {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `allocation` to the URL query string
    if (getAllocation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallocation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllocation()))));
    }

    return joiner.toString();
  }
}

