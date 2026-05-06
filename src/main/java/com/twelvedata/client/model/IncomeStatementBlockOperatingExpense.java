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
 * Operating expense details
 */
@JsonPropertyOrder({
  IncomeStatementBlockOperatingExpense.JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT,
  IncomeStatementBlockOperatingExpense.JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATIVE,
  IncomeStatementBlockOperatingExpense.JSON_PROPERTY_OTHER_OPERATING_EXPENSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementBlockOperatingExpense {
  public static final String JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT = "research_and_development";
  @javax.annotation.Nullable
  private Long researchAndDevelopment;

  public static final String JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATIVE = "selling_general_and_administrative";
  @javax.annotation.Nullable
  private Long sellingGeneralAndAdministrative;

  public static final String JSON_PROPERTY_OTHER_OPERATING_EXPENSES = "other_operating_expenses";
  @javax.annotation.Nullable
  private Long otherOperatingExpenses;

  public IncomeStatementBlockOperatingExpense() { 
  }

  public IncomeStatementBlockOperatingExpense researchAndDevelopment(@javax.annotation.Nullable Long researchAndDevelopment) {
    this.researchAndDevelopment = researchAndDevelopment;
    return this;
  }

  /**
   * Refers to research &amp; development (R&amp;D) expenses
   * @return researchAndDevelopment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getResearchAndDevelopment() {
    return researchAndDevelopment;
  }


  @JsonProperty(value = JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResearchAndDevelopment(@javax.annotation.Nullable Long researchAndDevelopment) {
    this.researchAndDevelopment = researchAndDevelopment;
  }


  public IncomeStatementBlockOperatingExpense sellingGeneralAndAdministrative(@javax.annotation.Nullable Long sellingGeneralAndAdministrative) {
    this.sellingGeneralAndAdministrative = sellingGeneralAndAdministrative;
    return this;
  }

  /**
   * Refers to selling, general and administrative (SG&amp;A) expenses
   * @return sellingGeneralAndAdministrative
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSellingGeneralAndAdministrative() {
    return sellingGeneralAndAdministrative;
  }


  @JsonProperty(value = JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellingGeneralAndAdministrative(@javax.annotation.Nullable Long sellingGeneralAndAdministrative) {
    this.sellingGeneralAndAdministrative = sellingGeneralAndAdministrative;
  }


  public IncomeStatementBlockOperatingExpense otherOperatingExpenses(@javax.annotation.Nullable Long otherOperatingExpenses) {
    this.otherOperatingExpenses = otherOperatingExpenses;
    return this;
  }

  /**
   * Refers to other operating expenses
   * @return otherOperatingExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_OPERATING_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOtherOperatingExpenses() {
    return otherOperatingExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_OPERATING_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherOperatingExpenses(@javax.annotation.Nullable Long otherOperatingExpenses) {
    this.otherOperatingExpenses = otherOperatingExpenses;
  }


  /**
   * Return true if this IncomeStatementBlock_operating_expense object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementBlockOperatingExpense incomeStatementBlockOperatingExpense = (IncomeStatementBlockOperatingExpense) o;
    return Objects.equals(this.researchAndDevelopment, incomeStatementBlockOperatingExpense.researchAndDevelopment) &&
        Objects.equals(this.sellingGeneralAndAdministrative, incomeStatementBlockOperatingExpense.sellingGeneralAndAdministrative) &&
        Objects.equals(this.otherOperatingExpenses, incomeStatementBlockOperatingExpense.otherOperatingExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(researchAndDevelopment, sellingGeneralAndAdministrative, otherOperatingExpenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementBlockOperatingExpense {\n");
    sb.append("    researchAndDevelopment: ").append(toIndentedString(researchAndDevelopment)).append("\n");
    sb.append("    sellingGeneralAndAdministrative: ").append(toIndentedString(sellingGeneralAndAdministrative)).append("\n");
    sb.append("    otherOperatingExpenses: ").append(toIndentedString(otherOperatingExpenses)).append("\n");
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

    // add `research_and_development` to the URL query string
    if (getResearchAndDevelopment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresearch_and_development%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResearchAndDevelopment()))));
    }

    // add `selling_general_and_administrative` to the URL query string
    if (getSellingGeneralAndAdministrative() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sselling_general_and_administrative%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSellingGeneralAndAdministrative()))));
    }

    // add `other_operating_expenses` to the URL query string
    if (getOtherOperatingExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_operating_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherOperatingExpenses()))));
    }

    return joiner.toString();
  }
}

