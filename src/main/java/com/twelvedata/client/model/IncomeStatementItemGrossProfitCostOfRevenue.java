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
 * Cost of revenue information
 */
@JsonPropertyOrder({
  IncomeStatementItemGrossProfitCostOfRevenue.JSON_PROPERTY_COST_OF_REVENUE_VALUE,
  IncomeStatementItemGrossProfitCostOfRevenue.JSON_PROPERTY_EXCISE_TAXES,
  IncomeStatementItemGrossProfitCostOfRevenue.JSON_PROPERTY_RECONCILED_COST_OF_REVENUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemGrossProfitCostOfRevenue {
  public static final String JSON_PROPERTY_COST_OF_REVENUE_VALUE = "cost_of_revenue_value";
  @javax.annotation.Nullable
  private Double costOfRevenueValue;

  public static final String JSON_PROPERTY_EXCISE_TAXES = "excise_taxes";
  @javax.annotation.Nullable
  private Double exciseTaxes;

  public static final String JSON_PROPERTY_RECONCILED_COST_OF_REVENUE = "reconciled_cost_of_revenue";
  @javax.annotation.Nullable
  private Double reconciledCostOfRevenue;

  public IncomeStatementItemGrossProfitCostOfRevenue() { 
  }

  public IncomeStatementItemGrossProfitCostOfRevenue costOfRevenueValue(@javax.annotation.Nullable Double costOfRevenueValue) {
    this.costOfRevenueValue = costOfRevenueValue;
    return this;
  }

  /**
   * Cost of revenue value
   * @return costOfRevenueValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COST_OF_REVENUE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCostOfRevenueValue() {
    return costOfRevenueValue;
  }


  @JsonProperty(value = JSON_PROPERTY_COST_OF_REVENUE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostOfRevenueValue(@javax.annotation.Nullable Double costOfRevenueValue) {
    this.costOfRevenueValue = costOfRevenueValue;
  }


  public IncomeStatementItemGrossProfitCostOfRevenue exciseTaxes(@javax.annotation.Nullable Double exciseTaxes) {
    this.exciseTaxes = exciseTaxes;
    return this;
  }

  /**
   * Excise taxes
   * @return exciseTaxes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXCISE_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExciseTaxes() {
    return exciseTaxes;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCISE_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExciseTaxes(@javax.annotation.Nullable Double exciseTaxes) {
    this.exciseTaxes = exciseTaxes;
  }


  public IncomeStatementItemGrossProfitCostOfRevenue reconciledCostOfRevenue(@javax.annotation.Nullable Double reconciledCostOfRevenue) {
    this.reconciledCostOfRevenue = reconciledCostOfRevenue;
    return this;
  }

  /**
   * Reconciled cost of revenue
   * @return reconciledCostOfRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RECONCILED_COST_OF_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReconciledCostOfRevenue() {
    return reconciledCostOfRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_RECONCILED_COST_OF_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReconciledCostOfRevenue(@javax.annotation.Nullable Double reconciledCostOfRevenue) {
    this.reconciledCostOfRevenue = reconciledCostOfRevenue;
  }


  /**
   * Return true if this IncomeStatementItem_gross_profit_cost_of_revenue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemGrossProfitCostOfRevenue incomeStatementItemGrossProfitCostOfRevenue = (IncomeStatementItemGrossProfitCostOfRevenue) o;
    return Objects.equals(this.costOfRevenueValue, incomeStatementItemGrossProfitCostOfRevenue.costOfRevenueValue) &&
        Objects.equals(this.exciseTaxes, incomeStatementItemGrossProfitCostOfRevenue.exciseTaxes) &&
        Objects.equals(this.reconciledCostOfRevenue, incomeStatementItemGrossProfitCostOfRevenue.reconciledCostOfRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costOfRevenueValue, exciseTaxes, reconciledCostOfRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemGrossProfitCostOfRevenue {\n");
    sb.append("    costOfRevenueValue: ").append(toIndentedString(costOfRevenueValue)).append("\n");
    sb.append("    exciseTaxes: ").append(toIndentedString(exciseTaxes)).append("\n");
    sb.append("    reconciledCostOfRevenue: ").append(toIndentedString(reconciledCostOfRevenue)).append("\n");
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

    // add `cost_of_revenue_value` to the URL query string
    if (getCostOfRevenueValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scost_of_revenue_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCostOfRevenueValue()))));
    }

    // add `excise_taxes` to the URL query string
    if (getExciseTaxes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexcise_taxes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExciseTaxes()))));
    }

    // add `reconciled_cost_of_revenue` to the URL query string
    if (getReconciledCostOfRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreconciled_cost_of_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReconciledCostOfRevenue()))));
    }

    return joiner.toString();
  }
}

