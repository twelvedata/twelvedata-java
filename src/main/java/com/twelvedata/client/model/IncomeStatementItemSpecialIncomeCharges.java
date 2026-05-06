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
 * Special income charges information
 */
@JsonPropertyOrder({
  IncomeStatementItemSpecialIncomeCharges.JSON_PROPERTY_SPECIAL_INCOME_CHARGES_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemSpecialIncomeCharges {
  public static final String JSON_PROPERTY_SPECIAL_INCOME_CHARGES_VALUE = "special_income_charges_value";
  @javax.annotation.Nullable
  private Double specialIncomeChargesValue;

  public IncomeStatementItemSpecialIncomeCharges() { 
  }

  public IncomeStatementItemSpecialIncomeCharges specialIncomeChargesValue(@javax.annotation.Nullable Double specialIncomeChargesValue) {
    this.specialIncomeChargesValue = specialIncomeChargesValue;
    return this;
  }

  /**
   * Special income charges value
   * @return specialIncomeChargesValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSpecialIncomeChargesValue() {
    return specialIncomeChargesValue;
  }


  @JsonProperty(value = JSON_PROPERTY_SPECIAL_INCOME_CHARGES_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialIncomeChargesValue(@javax.annotation.Nullable Double specialIncomeChargesValue) {
    this.specialIncomeChargesValue = specialIncomeChargesValue;
  }


  /**
   * Return true if this IncomeStatementItem_special_income_charges object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemSpecialIncomeCharges incomeStatementItemSpecialIncomeCharges = (IncomeStatementItemSpecialIncomeCharges) o;
    return Objects.equals(this.specialIncomeChargesValue, incomeStatementItemSpecialIncomeCharges.specialIncomeChargesValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialIncomeChargesValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemSpecialIncomeCharges {\n");
    sb.append("    specialIncomeChargesValue: ").append(toIndentedString(specialIncomeChargesValue)).append("\n");
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

    // add `special_income_charges_value` to the URL query string
    if (getSpecialIncomeChargesValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sspecial_income_charges_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSpecialIncomeChargesValue()))));
    }

    return joiner.toString();
  }
}

