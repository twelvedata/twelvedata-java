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
import com.twelvedata.client.model.CashFlowStruct;
import com.twelvedata.client.model.GetCashFlow200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetCashFlow200Response
 */
@JsonPropertyOrder({
  GetCashFlow200Response.JSON_PROPERTY_META,
  GetCashFlow200Response.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetCashFlow200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetCashFlow200ResponseMeta meta;

  public static final String JSON_PROPERTY_CASH_FLOW = "cash_flow";
  @javax.annotation.Nonnull
  private List<CashFlowStruct> cashFlow = new ArrayList<>();

  public GetCashFlow200Response() { 
  }

  public GetCashFlow200Response meta(@javax.annotation.Nonnull GetCashFlow200ResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetCashFlow200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetCashFlow200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetCashFlow200Response cashFlow(@javax.annotation.Nonnull List<CashFlowStruct> cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

  public GetCashFlow200Response addCashFlowItem(CashFlowStruct cashFlowItem) {
    if (this.cashFlow == null) {
      this.cashFlow = new ArrayList<>();
    }
    this.cashFlow.add(cashFlowItem);
    return this;
  }

  /**
   * Cash flow data
   * @return cashFlow
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CashFlowStruct> getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCashFlow(@javax.annotation.Nonnull List<CashFlowStruct> cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this GetCashFlow_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCashFlow200Response getCashFlow200Response = (GetCashFlow200Response) o;
    return Objects.equals(this.meta, getCashFlow200Response.meta) &&
        Objects.equals(this.cashFlow, getCashFlow200Response.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCashFlow200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
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

    // add `meta` to the URL query string
    if (getMeta() != null) {
      joiner.add(getMeta().toUrlQueryString(prefix + "meta" + suffix));
    }

    // add `cash_flow` to the URL query string
    if (getCashFlow() != null) {
      for (int i = 0; i < getCashFlow().size(); i++) {
        if (getCashFlow().get(i) != null) {
          joiner.add(getCashFlow().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scash_flow%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

