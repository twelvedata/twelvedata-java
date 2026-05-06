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
 * Operating income information
 */
@JsonPropertyOrder({
  IncomeStatementItemOperatingIncome.JSON_PROPERTY_OPERATING_INCOME_VALUE,
  IncomeStatementItemOperatingIncome.JSON_PROPERTY_TOTAL_OPERATING_INCOME_AS_REPORTED,
  IncomeStatementItemOperatingIncome.JSON_PROPERTY_OPERATING_EXPENSE,
  IncomeStatementItemOperatingIncome.JSON_PROPERTY_OTHER_OPERATING_EXPENSES,
  IncomeStatementItemOperatingIncome.JSON_PROPERTY_TOTAL_EXPENSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemOperatingIncome {
  public static final String JSON_PROPERTY_OPERATING_INCOME_VALUE = "operating_income_value";
  @javax.annotation.Nullable
  private Double operatingIncomeValue;

  public static final String JSON_PROPERTY_TOTAL_OPERATING_INCOME_AS_REPORTED = "total_operating_income_as_reported";
  @javax.annotation.Nullable
  private Double totalOperatingIncomeAsReported;

  public static final String JSON_PROPERTY_OPERATING_EXPENSE = "operating_expense";
  @javax.annotation.Nullable
  private Double operatingExpense;

  public static final String JSON_PROPERTY_OTHER_OPERATING_EXPENSES = "other_operating_expenses";
  @javax.annotation.Nullable
  private Double otherOperatingExpenses;

  public static final String JSON_PROPERTY_TOTAL_EXPENSES = "total_expenses";
  @javax.annotation.Nullable
  private Double totalExpenses;

  public IncomeStatementItemOperatingIncome() { 
  }

  public IncomeStatementItemOperatingIncome operatingIncomeValue(@javax.annotation.Nullable Double operatingIncomeValue) {
    this.operatingIncomeValue = operatingIncomeValue;
    return this;
  }

  /**
   * Operating income value
   * @return operatingIncomeValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingIncomeValue() {
    return operatingIncomeValue;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingIncomeValue(@javax.annotation.Nullable Double operatingIncomeValue) {
    this.operatingIncomeValue = operatingIncomeValue;
  }


  public IncomeStatementItemOperatingIncome totalOperatingIncomeAsReported(@javax.annotation.Nullable Double totalOperatingIncomeAsReported) {
    this.totalOperatingIncomeAsReported = totalOperatingIncomeAsReported;
    return this;
  }

  /**
   * Total operating income as reported
   * @return totalOperatingIncomeAsReported
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_OPERATING_INCOME_AS_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalOperatingIncomeAsReported() {
    return totalOperatingIncomeAsReported;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_OPERATING_INCOME_AS_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalOperatingIncomeAsReported(@javax.annotation.Nullable Double totalOperatingIncomeAsReported) {
    this.totalOperatingIncomeAsReported = totalOperatingIncomeAsReported;
  }


  public IncomeStatementItemOperatingIncome operatingExpense(@javax.annotation.Nullable Double operatingExpense) {
    this.operatingExpense = operatingExpense;
    return this;
  }

  /**
   * Operating expense
   * @return operatingExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingExpense() {
    return operatingExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingExpense(@javax.annotation.Nullable Double operatingExpense) {
    this.operatingExpense = operatingExpense;
  }


  public IncomeStatementItemOperatingIncome otherOperatingExpenses(@javax.annotation.Nullable Double otherOperatingExpenses) {
    this.otherOperatingExpenses = otherOperatingExpenses;
    return this;
  }

  /**
   * Other operating expenses
   * @return otherOperatingExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_OPERATING_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherOperatingExpenses() {
    return otherOperatingExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_OPERATING_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherOperatingExpenses(@javax.annotation.Nullable Double otherOperatingExpenses) {
    this.otherOperatingExpenses = otherOperatingExpenses;
  }


  public IncomeStatementItemOperatingIncome totalExpenses(@javax.annotation.Nullable Double totalExpenses) {
    this.totalExpenses = totalExpenses;
    return this;
  }

  /**
   * Total expenses
   * @return totalExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalExpenses() {
    return totalExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalExpenses(@javax.annotation.Nullable Double totalExpenses) {
    this.totalExpenses = totalExpenses;
  }


  /**
   * Return true if this IncomeStatementItem_operating_income object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemOperatingIncome incomeStatementItemOperatingIncome = (IncomeStatementItemOperatingIncome) o;
    return Objects.equals(this.operatingIncomeValue, incomeStatementItemOperatingIncome.operatingIncomeValue) &&
        Objects.equals(this.totalOperatingIncomeAsReported, incomeStatementItemOperatingIncome.totalOperatingIncomeAsReported) &&
        Objects.equals(this.operatingExpense, incomeStatementItemOperatingIncome.operatingExpense) &&
        Objects.equals(this.otherOperatingExpenses, incomeStatementItemOperatingIncome.otherOperatingExpenses) &&
        Objects.equals(this.totalExpenses, incomeStatementItemOperatingIncome.totalExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingIncomeValue, totalOperatingIncomeAsReported, operatingExpense, otherOperatingExpenses, totalExpenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemOperatingIncome {\n");
    sb.append("    operatingIncomeValue: ").append(toIndentedString(operatingIncomeValue)).append("\n");
    sb.append("    totalOperatingIncomeAsReported: ").append(toIndentedString(totalOperatingIncomeAsReported)).append("\n");
    sb.append("    operatingExpense: ").append(toIndentedString(operatingExpense)).append("\n");
    sb.append("    otherOperatingExpenses: ").append(toIndentedString(otherOperatingExpenses)).append("\n");
    sb.append("    totalExpenses: ").append(toIndentedString(totalExpenses)).append("\n");
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

    // add `operating_income_value` to the URL query string
    if (getOperatingIncomeValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_income_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingIncomeValue()))));
    }

    // add `total_operating_income_as_reported` to the URL query string
    if (getTotalOperatingIncomeAsReported() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_operating_income_as_reported%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalOperatingIncomeAsReported()))));
    }

    // add `operating_expense` to the URL query string
    if (getOperatingExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingExpense()))));
    }

    // add `other_operating_expenses` to the URL query string
    if (getOtherOperatingExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_operating_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherOperatingExpenses()))));
    }

    // add `total_expenses` to the URL query string
    if (getTotalExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalExpenses()))));
    }

    return joiner.toString();
  }
}

