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
import com.twelvedata.client.model.GetBalanceSheet200ResponseBalanceSheetInner;
import com.twelvedata.client.model.GetBalanceSheet200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetBalanceSheet200Response
 */
@JsonPropertyOrder({
  GetBalanceSheet200Response.JSON_PROPERTY_META,
  GetBalanceSheet200Response.JSON_PROPERTY_BALANCE_SHEET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetBalanceSheet200ResponseMeta meta;

  public static final String JSON_PROPERTY_BALANCE_SHEET = "balance_sheet";
  @javax.annotation.Nonnull
  private List<GetBalanceSheet200ResponseBalanceSheetInner> balanceSheet = new ArrayList<>();

  public GetBalanceSheet200Response() { 
  }

  public GetBalanceSheet200Response meta(@javax.annotation.Nonnull GetBalanceSheet200ResponseMeta meta) {
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
  public GetBalanceSheet200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetBalanceSheet200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetBalanceSheet200Response balanceSheet(@javax.annotation.Nonnull List<GetBalanceSheet200ResponseBalanceSheetInner> balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

  public GetBalanceSheet200Response addBalanceSheetItem(GetBalanceSheet200ResponseBalanceSheetInner balanceSheetItem) {
    if (this.balanceSheet == null) {
      this.balanceSheet = new ArrayList<>();
    }
    this.balanceSheet.add(balanceSheetItem);
    return this;
  }

  /**
   * Array of balance sheet records
   * @return balanceSheet
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BALANCE_SHEET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetBalanceSheet200ResponseBalanceSheetInner> getBalanceSheet() {
    return balanceSheet;
  }


  @JsonProperty(value = JSON_PROPERTY_BALANCE_SHEET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceSheet(@javax.annotation.Nonnull List<GetBalanceSheet200ResponseBalanceSheetInner> balanceSheet) {
    this.balanceSheet = balanceSheet;
  }


  /**
   * Return true if this GetBalanceSheet_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200Response getBalanceSheet200Response = (GetBalanceSheet200Response) o;
    return Objects.equals(this.meta, getBalanceSheet200Response.meta) &&
        Objects.equals(this.balanceSheet, getBalanceSheet200Response.balanceSheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, balanceSheet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
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

    // add `balance_sheet` to the URL query string
    if (getBalanceSheet() != null) {
      for (int i = 0; i < getBalanceSheet().size(); i++) {
        if (getBalanceSheet().get(i) != null) {
          joiner.add(getBalanceSheet().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sbalance_sheet%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

