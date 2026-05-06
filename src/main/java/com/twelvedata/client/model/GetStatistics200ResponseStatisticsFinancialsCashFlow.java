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
 * Cash flow information
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsFinancialsCashFlow.JSON_PROPERTY_OPERATING_CASH_FLOW_TTM,
  GetStatistics200ResponseStatisticsFinancialsCashFlow.JSON_PROPERTY_LEVERED_FREE_CASH_FLOW_TTM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsFinancialsCashFlow {
  public static final String JSON_PROPERTY_OPERATING_CASH_FLOW_TTM = "operating_cash_flow_ttm";
  @javax.annotation.Nullable
  private Double operatingCashFlowTtm;

  public static final String JSON_PROPERTY_LEVERED_FREE_CASH_FLOW_TTM = "levered_free_cash_flow_ttm";
  @javax.annotation.Nullable
  private Double leveredFreeCashFlowTtm;

  public GetStatistics200ResponseStatisticsFinancialsCashFlow() { 
  }

  public GetStatistics200ResponseStatisticsFinancialsCashFlow operatingCashFlowTtm(@javax.annotation.Nullable Double operatingCashFlowTtm) {
    this.operatingCashFlowTtm = operatingCashFlowTtm;
    return this;
  }

  /**
   * Refers to operating cash flow measure over the last 12 months
   * @return operatingCashFlowTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_CASH_FLOW_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOperatingCashFlowTtm() {
    return operatingCashFlowTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_CASH_FLOW_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingCashFlowTtm(@javax.annotation.Nullable Double operatingCashFlowTtm) {
    this.operatingCashFlowTtm = operatingCashFlowTtm;
  }


  public GetStatistics200ResponseStatisticsFinancialsCashFlow leveredFreeCashFlowTtm(@javax.annotation.Nullable Double leveredFreeCashFlowTtm) {
    this.leveredFreeCashFlowTtm = leveredFreeCashFlowTtm;
    return this;
  }

  /**
   * Refers to levered free cash flow measure over the last 12 months
   * @return leveredFreeCashFlowTtm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LEVERED_FREE_CASH_FLOW_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLeveredFreeCashFlowTtm() {
    return leveredFreeCashFlowTtm;
  }


  @JsonProperty(value = JSON_PROPERTY_LEVERED_FREE_CASH_FLOW_TTM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeveredFreeCashFlowTtm(@javax.annotation.Nullable Double leveredFreeCashFlowTtm) {
    this.leveredFreeCashFlowTtm = leveredFreeCashFlowTtm;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_financials_cash_flow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsFinancialsCashFlow getStatistics200ResponseStatisticsFinancialsCashFlow = (GetStatistics200ResponseStatisticsFinancialsCashFlow) o;
    return Objects.equals(this.operatingCashFlowTtm, getStatistics200ResponseStatisticsFinancialsCashFlow.operatingCashFlowTtm) &&
        Objects.equals(this.leveredFreeCashFlowTtm, getStatistics200ResponseStatisticsFinancialsCashFlow.leveredFreeCashFlowTtm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingCashFlowTtm, leveredFreeCashFlowTtm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsFinancialsCashFlow {\n");
    sb.append("    operatingCashFlowTtm: ").append(toIndentedString(operatingCashFlowTtm)).append("\n");
    sb.append("    leveredFreeCashFlowTtm: ").append(toIndentedString(leveredFreeCashFlowTtm)).append("\n");
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

    // add `operating_cash_flow_ttm` to the URL query string
    if (getOperatingCashFlowTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperating_cash_flow_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperatingCashFlowTtm()))));
    }

    // add `levered_free_cash_flow_ttm` to the URL query string
    if (getLeveredFreeCashFlowTtm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slevered_free_cash_flow_ttm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLeveredFreeCashFlowTtm()))));
    }

    return joiner.toString();
  }
}

