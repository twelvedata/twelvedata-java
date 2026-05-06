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
 * Non-operating interest details
 */
@JsonPropertyOrder({
  IncomeStatementBlockNonOperatingInterest.JSON_PROPERTY_INCOME,
  IncomeStatementBlockNonOperatingInterest.JSON_PROPERTY_EXPENSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementBlockNonOperatingInterest {
  public static final String JSON_PROPERTY_INCOME = "income";
  @javax.annotation.Nullable
  private Long income;

  public static final String JSON_PROPERTY_EXPENSE = "expense";
  @javax.annotation.Nullable
  private Long expense;

  public IncomeStatementBlockNonOperatingInterest() { 
  }

  public IncomeStatementBlockNonOperatingInterest income(@javax.annotation.Nullable Long income) {
    this.income = income;
    return this;
  }

  /**
   * Refers to non-operating interest income
   * @return income
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIncome() {
    return income;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncome(@javax.annotation.Nullable Long income) {
    this.income = income;
  }


  public IncomeStatementBlockNonOperatingInterest expense(@javax.annotation.Nullable Long expense) {
    this.expense = expense;
    return this;
  }

  /**
   * Refers to non-operating interest expense
   * @return expense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpense() {
    return expense;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpense(@javax.annotation.Nullable Long expense) {
    this.expense = expense;
  }


  /**
   * Return true if this IncomeStatementBlock_non_operating_interest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementBlockNonOperatingInterest incomeStatementBlockNonOperatingInterest = (IncomeStatementBlockNonOperatingInterest) o;
    return Objects.equals(this.income, incomeStatementBlockNonOperatingInterest.income) &&
        Objects.equals(this.expense, incomeStatementBlockNonOperatingInterest.expense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(income, expense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementBlockNonOperatingInterest {\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    expense: ").append(toIndentedString(expense)).append("\n");
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

    // add `income` to the URL query string
    if (getIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sincome%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncome()))));
    }

    // add `expense` to the URL query string
    if (getExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpense()))));
    }

    return joiner.toString();
  }
}

