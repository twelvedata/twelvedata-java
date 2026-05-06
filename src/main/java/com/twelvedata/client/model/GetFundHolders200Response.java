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
import com.twelvedata.client.model.FundHolderItem;
import com.twelvedata.client.model.GetFundHolders200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetFundHolders200Response
 */
@JsonPropertyOrder({
  GetFundHolders200Response.JSON_PROPERTY_META,
  GetFundHolders200Response.JSON_PROPERTY_FUND_HOLDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetFundHolders200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetFundHolders200ResponseMeta meta;

  public static final String JSON_PROPERTY_FUND_HOLDERS = "fund_holders";
  @javax.annotation.Nonnull
  private List<FundHolderItem> fundHolders = new ArrayList<>();

  public GetFundHolders200Response() { 
  }

  public GetFundHolders200Response meta(@javax.annotation.Nonnull GetFundHolders200ResponseMeta meta) {
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
  public GetFundHolders200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetFundHolders200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetFundHolders200Response fundHolders(@javax.annotation.Nonnull List<FundHolderItem> fundHolders) {
    this.fundHolders = fundHolders;
    return this;
  }

  public GetFundHolders200Response addFundHoldersItem(FundHolderItem fundHoldersItem) {
    if (this.fundHolders == null) {
      this.fundHolders = new ArrayList<>();
    }
    this.fundHolders.add(fundHoldersItem);
    return this;
  }

  /**
   * List of fund holders for the financial instrument
   * @return fundHolders
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FUND_HOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FundHolderItem> getFundHolders() {
    return fundHolders;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_HOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundHolders(@javax.annotation.Nonnull List<FundHolderItem> fundHolders) {
    this.fundHolders = fundHolders;
  }


  /**
   * Return true if this GetFundHolders_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFundHolders200Response getFundHolders200Response = (GetFundHolders200Response) o;
    return Objects.equals(this.meta, getFundHolders200Response.meta) &&
        Objects.equals(this.fundHolders, getFundHolders200Response.fundHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, fundHolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFundHolders200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    fundHolders: ").append(toIndentedString(fundHolders)).append("\n");
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

    // add `fund_holders` to the URL query string
    if (getFundHolders() != null) {
      for (int i = 0; i < getFundHolders().size(); i++) {
        if (getFundHolders().get(i) != null) {
          joiner.add(getFundHolders().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sfund_holders%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

