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
import com.twelvedata.client.model.GetInsiderTransactions200ResponseInsiderTransactionsInner;
import com.twelvedata.client.model.GetInsiderTransactions200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetInsiderTransactions200Response
 */
@JsonPropertyOrder({
  GetInsiderTransactions200Response.JSON_PROPERTY_META,
  GetInsiderTransactions200Response.JSON_PROPERTY_INSIDER_TRANSACTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetInsiderTransactions200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetInsiderTransactions200ResponseMeta meta;

  public static final String JSON_PROPERTY_INSIDER_TRANSACTIONS = "insider_transactions";
  @javax.annotation.Nonnull
  private List<GetInsiderTransactions200ResponseInsiderTransactionsInner> insiderTransactions = new ArrayList<>();

  public GetInsiderTransactions200Response() { 
  }

  public GetInsiderTransactions200Response meta(@javax.annotation.Nonnull GetInsiderTransactions200ResponseMeta meta) {
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
  public GetInsiderTransactions200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetInsiderTransactions200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetInsiderTransactions200Response insiderTransactions(@javax.annotation.Nonnull List<GetInsiderTransactions200ResponseInsiderTransactionsInner> insiderTransactions) {
    this.insiderTransactions = insiderTransactions;
    return this;
  }

  public GetInsiderTransactions200Response addInsiderTransactionsItem(GetInsiderTransactions200ResponseInsiderTransactionsInner insiderTransactionsItem) {
    if (this.insiderTransactions == null) {
      this.insiderTransactions = new ArrayList<>();
    }
    this.insiderTransactions.add(insiderTransactionsItem);
    return this;
  }

  /**
   * List of insider transactions
   * @return insiderTransactions
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INSIDER_TRANSACTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetInsiderTransactions200ResponseInsiderTransactionsInner> getInsiderTransactions() {
    return insiderTransactions;
  }


  @JsonProperty(value = JSON_PROPERTY_INSIDER_TRANSACTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInsiderTransactions(@javax.annotation.Nonnull List<GetInsiderTransactions200ResponseInsiderTransactionsInner> insiderTransactions) {
    this.insiderTransactions = insiderTransactions;
  }


  /**
   * Return true if this GetInsiderTransactions_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInsiderTransactions200Response getInsiderTransactions200Response = (GetInsiderTransactions200Response) o;
    return Objects.equals(this.meta, getInsiderTransactions200Response.meta) &&
        Objects.equals(this.insiderTransactions, getInsiderTransactions200Response.insiderTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, insiderTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInsiderTransactions200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    insiderTransactions: ").append(toIndentedString(insiderTransactions)).append("\n");
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

    // add `insider_transactions` to the URL query string
    if (getInsiderTransactions() != null) {
      for (int i = 0; i < getInsiderTransactions().size(); i++) {
        if (getInsiderTransactions().get(i) != null) {
          joiner.add(getInsiderTransactions().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sinsider_transactions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

