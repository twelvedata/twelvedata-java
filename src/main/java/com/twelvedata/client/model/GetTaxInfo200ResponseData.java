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
 * Tax information data containing the tax indicator for the requested instrument
 */
@JsonPropertyOrder({
  GetTaxInfo200ResponseData.JSON_PROPERTY_TAX_INDICATOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTaxInfo200ResponseData {
  public static final String JSON_PROPERTY_TAX_INDICATOR = "tax_indicator";
  @javax.annotation.Nonnull
  private String taxIndicator;

  public GetTaxInfo200ResponseData() { 
  }

  public GetTaxInfo200ResponseData taxIndicator(@javax.annotation.Nonnull String taxIndicator) {
    this.taxIndicator = taxIndicator;
    return this;
  }

  /**
   * The instrument tax indicator, can be &#x60;null&#x60;, &#x60;us_1446f&#x60;, &#x60;spanish_ftt&#x60;, &#x60;uk_stamp_duty&#x60;, &#x60;hk_stamp_duty&#x60;, &#x60;french_ftt&#x60; or &#x60;italian_ftt&#x60;
   * @return taxIndicator
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TAX_INDICATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTaxIndicator() {
    return taxIndicator;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_INDICATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxIndicator(@javax.annotation.Nonnull String taxIndicator) {
    this.taxIndicator = taxIndicator;
  }


  /**
   * Return true if this GetTaxInfo_200_response_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTaxInfo200ResponseData getTaxInfo200ResponseData = (GetTaxInfo200ResponseData) o;
    return Objects.equals(this.taxIndicator, getTaxInfo200ResponseData.taxIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTaxInfo200ResponseData {\n");
    sb.append("    taxIndicator: ").append(toIndentedString(taxIndicator)).append("\n");
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

    // add `tax_indicator` to the URL query string
    if (getTaxIndicator() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_indicator%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxIndicator()))));
    }

    return joiner.toString();
  }
}

