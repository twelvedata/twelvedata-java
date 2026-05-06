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
import com.twelvedata.client.model.GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities;
import com.twelvedata.client.model.GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Liabilities section of the balance sheet
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilities.JSON_PROPERTY_CURRENT_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilities.JSON_PROPERTY_NON_CURRENT_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilities.JSON_PROPERTY_TOTAL_LIABILITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerLiabilities {
  public static final String JSON_PROPERTY_CURRENT_LIABILITIES = "current_liabilities";
  @javax.annotation.Nullable
  private GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities currentLiabilities;

  public static final String JSON_PROPERTY_NON_CURRENT_LIABILITIES = "non_current_liabilities";
  @javax.annotation.Nullable
  private GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities nonCurrentLiabilities;

  public static final String JSON_PROPERTY_TOTAL_LIABILITIES = "total_liabilities";
  @javax.annotation.Nullable
  private Double totalLiabilities;

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilities() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilities currentLiabilities(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
    return this;
  }

  /**
   * Get currentLiabilities
   * @return currentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities getCurrentLiabilities() {
    return currentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLiabilities(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesCurrentLiabilities currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilities nonCurrentLiabilities(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities nonCurrentLiabilities) {
    this.nonCurrentLiabilities = nonCurrentLiabilities;
    return this;
  }

  /**
   * Get nonCurrentLiabilities
   * @return nonCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities getNonCurrentLiabilities() {
    return nonCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonCurrentLiabilities(@javax.annotation.Nullable GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities nonCurrentLiabilities) {
    this.nonCurrentLiabilities = nonCurrentLiabilities;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilities totalLiabilities(@javax.annotation.Nullable Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

  /**
   * The sum of total_current_liabilities + total_non_current_liabilities
   * @return totalLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalLiabilities() {
    return totalLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLiabilities(@javax.annotation.Nullable Double totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerLiabilities getBalanceSheet200ResponseBalanceSheetInnerLiabilities = (GetBalanceSheet200ResponseBalanceSheetInnerLiabilities) o;
    return Objects.equals(this.currentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilities.currentLiabilities) &&
        Objects.equals(this.nonCurrentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilities.nonCurrentLiabilities) &&
        Objects.equals(this.totalLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilities.totalLiabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentLiabilities, nonCurrentLiabilities, totalLiabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerLiabilities {\n");
    sb.append("    currentLiabilities: ").append(toIndentedString(currentLiabilities)).append("\n");
    sb.append("    nonCurrentLiabilities: ").append(toIndentedString(nonCurrentLiabilities)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
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

    // add `current_liabilities` to the URL query string
    if (getCurrentLiabilities() != null) {
      joiner.add(getCurrentLiabilities().toUrlQueryString(prefix + "current_liabilities" + suffix));
    }

    // add `non_current_liabilities` to the URL query string
    if (getNonCurrentLiabilities() != null) {
      joiner.add(getNonCurrentLiabilities().toUrlQueryString(prefix + "non_current_liabilities" + suffix));
    }

    // add `total_liabilities` to the URL query string
    if (getTotalLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalLiabilities()))));
    }

    return joiner.toString();
  }
}

