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
import com.twelvedata.client.model.IncomeStatementItemGrossProfitCostOfRevenue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Gross profit information
 */
@JsonPropertyOrder({
  IncomeStatementItemGrossProfit.JSON_PROPERTY_GROSS_PROFIT_VALUE,
  IncomeStatementItemGrossProfit.JSON_PROPERTY_COST_OF_REVENUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemGrossProfit {
  public static final String JSON_PROPERTY_GROSS_PROFIT_VALUE = "gross_profit_value";
  @javax.annotation.Nullable
  private Double grossProfitValue;

  public static final String JSON_PROPERTY_COST_OF_REVENUE = "cost_of_revenue";
  @javax.annotation.Nullable
  private IncomeStatementItemGrossProfitCostOfRevenue costOfRevenue;

  public IncomeStatementItemGrossProfit() { 
  }

  public IncomeStatementItemGrossProfit grossProfitValue(@javax.annotation.Nullable Double grossProfitValue) {
    this.grossProfitValue = grossProfitValue;
    return this;
  }

  /**
   * Gross profit value
   * @return grossProfitValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrossProfitValue() {
    return grossProfitValue;
  }


  @JsonProperty(value = JSON_PROPERTY_GROSS_PROFIT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossProfitValue(@javax.annotation.Nullable Double grossProfitValue) {
    this.grossProfitValue = grossProfitValue;
  }


  public IncomeStatementItemGrossProfit costOfRevenue(@javax.annotation.Nullable IncomeStatementItemGrossProfitCostOfRevenue costOfRevenue) {
    this.costOfRevenue = costOfRevenue;
    return this;
  }

  /**
   * Get costOfRevenue
   * @return costOfRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COST_OF_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncomeStatementItemGrossProfitCostOfRevenue getCostOfRevenue() {
    return costOfRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_COST_OF_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostOfRevenue(@javax.annotation.Nullable IncomeStatementItemGrossProfitCostOfRevenue costOfRevenue) {
    this.costOfRevenue = costOfRevenue;
  }


  /**
   * Return true if this IncomeStatementItem_gross_profit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemGrossProfit incomeStatementItemGrossProfit = (IncomeStatementItemGrossProfit) o;
    return Objects.equals(this.grossProfitValue, incomeStatementItemGrossProfit.grossProfitValue) &&
        Objects.equals(this.costOfRevenue, incomeStatementItemGrossProfit.costOfRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossProfitValue, costOfRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemGrossProfit {\n");
    sb.append("    grossProfitValue: ").append(toIndentedString(grossProfitValue)).append("\n");
    sb.append("    costOfRevenue: ").append(toIndentedString(costOfRevenue)).append("\n");
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

    // add `gross_profit_value` to the URL query string
    if (getGrossProfitValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgross_profit_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrossProfitValue()))));
    }

    // add `cost_of_revenue` to the URL query string
    if (getCostOfRevenue() != null) {
      joiner.add(getCostOfRevenue().toUrlQueryString(prefix + "cost_of_revenue" + suffix));
    }

    return joiner.toString();
  }
}

