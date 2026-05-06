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
 * Revenue information
 */
@JsonPropertyOrder({
  IncomeStatementItemRevenue.JSON_PROPERTY_TOTAL_REVENUE,
  IncomeStatementItemRevenue.JSON_PROPERTY_OPERATING_REVENUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemRevenue {
  public static final String JSON_PROPERTY_TOTAL_REVENUE = "total_revenue";
  @javax.annotation.Nullable
  private Double totalRevenue;

  public static final String JSON_PROPERTY_OPERATING_REVENUE = "operating_revenue";
  @javax.annotation.Nullable
  private Double operatingRevenue;

  public IncomeStatementItemRevenue() { 
  }

  public IncomeStatementItemRevenue totalRevenue(@javax.annotation.Nullable Double totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

  /**
   * Total revenue
   * @return totalRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalRevenue() {
    return totalRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRevenue(@javax.annotation.Nullable Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }


  public IncomeStatementItemRevenue operatingRevenue(@javax.annotation.Nullable Double operatingRevenue) {
    this.operatingRevenue = operatingRevenue;
    return this;
  }

  /**
   * Operating revenue
   * @return operatingRevenue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingRevenue() {
    return operatingRevenue;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_REVENUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingRevenue(@javax.annotation.Nullable Double operatingRevenue) {
    this.operatingRevenue = operatingRevenue;
  }


  /**
   * Return true if this IncomeStatementItem_revenue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemRevenue incomeStatementItemRevenue = (IncomeStatementItemRevenue) o;
    return Objects.equals(this.totalRevenue, incomeStatementItemRevenue.totalRevenue) &&
        Objects.equals(this.operatingRevenue, incomeStatementItemRevenue.operatingRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenue, operatingRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemRevenue {\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    operatingRevenue: ").append(toIndentedString(operatingRevenue)).append("\n");
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

    // add `total_revenue` to the URL query string
    if (getTotalRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalRevenue()))));
    }

    // add `operating_revenue` to the URL query string
    if (getOperatingRevenue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_revenue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingRevenue()))));
    }

    return joiner.toString();
  }
}

