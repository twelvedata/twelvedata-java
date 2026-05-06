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
 * Supplemental data
 */
@JsonPropertyOrder({
  CashFlowDataSupplementalData.JSON_PROPERTY_INTEREST_PAID_SUPPLEMENTAL_DATA,
  CashFlowDataSupplementalData.JSON_PROPERTY_INCOME_TAX_PAID_SUPPLEMENTAL_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataSupplementalData {
  public static final String JSON_PROPERTY_INTEREST_PAID_SUPPLEMENTAL_DATA = "interest_paid_supplemental_data";
  @javax.annotation.Nullable
  private Double interestPaidSupplementalData;

  public static final String JSON_PROPERTY_INCOME_TAX_PAID_SUPPLEMENTAL_DATA = "income_tax_paid_supplemental_data";
  @javax.annotation.Nullable
  private Double incomeTaxPaidSupplementalData;

  public CashFlowDataSupplementalData() { 
  }

  public CashFlowDataSupplementalData interestPaidSupplementalData(@javax.annotation.Nullable Double interestPaidSupplementalData) {
    this.interestPaidSupplementalData = interestPaidSupplementalData;
    return this;
  }

  /**
   * Interest paid supplemental data
   * @return interestPaidSupplementalData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPaidSupplementalData() {
    return interestPaidSupplementalData;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPaidSupplementalData(@javax.annotation.Nullable Double interestPaidSupplementalData) {
    this.interestPaidSupplementalData = interestPaidSupplementalData;
  }


  public CashFlowDataSupplementalData incomeTaxPaidSupplementalData(@javax.annotation.Nullable Double incomeTaxPaidSupplementalData) {
    this.incomeTaxPaidSupplementalData = incomeTaxPaidSupplementalData;
    return this;
  }

  /**
   * Income tax paid supplemental data
   * @return incomeTaxPaidSupplementalData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAID_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIncomeTaxPaidSupplementalData() {
    return incomeTaxPaidSupplementalData;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAID_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeTaxPaidSupplementalData(@javax.annotation.Nullable Double incomeTaxPaidSupplementalData) {
    this.incomeTaxPaidSupplementalData = incomeTaxPaidSupplementalData;
  }


  /**
   * Return true if this CashFlowData_supplemental_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataSupplementalData cashFlowDataSupplementalData = (CashFlowDataSupplementalData) o;
    return Objects.equals(this.interestPaidSupplementalData, cashFlowDataSupplementalData.interestPaidSupplementalData) &&
        Objects.equals(this.incomeTaxPaidSupplementalData, cashFlowDataSupplementalData.incomeTaxPaidSupplementalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestPaidSupplementalData, incomeTaxPaidSupplementalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataSupplementalData {\n");
    sb.append("    interestPaidSupplementalData: ").append(toIndentedString(interestPaidSupplementalData)).append("\n");
    sb.append("    incomeTaxPaidSupplementalData: ").append(toIndentedString(incomeTaxPaidSupplementalData)).append("\n");
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

    // add `interest_paid_supplemental_data` to the URL query string
    if (getInterestPaidSupplementalData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_paid_supplemental_data%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPaidSupplementalData()))));
    }

    // add `income_tax_paid_supplemental_data` to the URL query string
    if (getIncomeTaxPaidSupplementalData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sincome_tax_paid_supplemental_data%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncomeTaxPaidSupplementalData()))));
    }

    return joiner.toString();
  }
}

