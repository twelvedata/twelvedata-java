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
 * InlineObject2Expenses
 */
@JsonPropertyOrder({
  InlineObject2Expenses.JSON_PROPERTY_EXPENSE_RATIO_GROSS,
  InlineObject2Expenses.JSON_PROPERTY_EXPENSE_RATIO_NET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject2Expenses {
  public static final String JSON_PROPERTY_EXPENSE_RATIO_GROSS = "expense_ratio_gross";
  @javax.annotation.Nullable
  private Double expenseRatioGross;

  public static final String JSON_PROPERTY_EXPENSE_RATIO_NET = "expense_ratio_net";
  @javax.annotation.Nullable
  private Double expenseRatioNet;

  public InlineObject2Expenses() { 
  }

  public InlineObject2Expenses expenseRatioGross(@javax.annotation.Nullable Double expenseRatioGross) {
    this.expenseRatioGross = expenseRatioGross;
    return this;
  }

  /**
   * Get expenseRatioGross
   * @return expenseRatioGross
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_GROSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExpenseRatioGross() {
    return expenseRatioGross;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_GROSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenseRatioGross(@javax.annotation.Nullable Double expenseRatioGross) {
    this.expenseRatioGross = expenseRatioGross;
  }


  public InlineObject2Expenses expenseRatioNet(@javax.annotation.Nullable Double expenseRatioNet) {
    this.expenseRatioNet = expenseRatioNet;
    return this;
  }

  /**
   * Get expenseRatioNet
   * @return expenseRatioNet
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_NET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExpenseRatioNet() {
    return expenseRatioNet;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_NET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenseRatioNet(@javax.annotation.Nullable Double expenseRatioNet) {
    this.expenseRatioNet = expenseRatioNet;
  }


  /**
   * Return true if this inline_object_2_expenses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2Expenses inlineObject2Expenses = (InlineObject2Expenses) o;
    return Objects.equals(this.expenseRatioGross, inlineObject2Expenses.expenseRatioGross) &&
        Objects.equals(this.expenseRatioNet, inlineObject2Expenses.expenseRatioNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseRatioGross, expenseRatioNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2Expenses {\n");
    sb.append("    expenseRatioGross: ").append(toIndentedString(expenseRatioGross)).append("\n");
    sb.append("    expenseRatioNet: ").append(toIndentedString(expenseRatioNet)).append("\n");
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

    // add `expense_ratio_gross` to the URL query string
    if (getExpenseRatioGross() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpense_ratio_gross%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpenseRatioGross()))));
    }

    // add `expense_ratio_net` to the URL query string
    if (getExpenseRatioNet() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpense_ratio_net%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpenseRatioNet()))));
    }

    return joiner.toString();
  }
}

