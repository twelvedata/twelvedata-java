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
import com.twelvedata.client.model.GetMarketCap200ResponseMarketCapInner;
import com.twelvedata.client.model.GetMarketCap200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetMarketCap200Response
 */
@JsonPropertyOrder({
  GetMarketCap200Response.JSON_PROPERTY_META,
  GetMarketCap200Response.JSON_PROPERTY_MARKET_CAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMarketCap200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetMarketCap200ResponseMeta meta;

  public static final String JSON_PROPERTY_MARKET_CAP = "market_cap";
  @javax.annotation.Nonnull
  private List<GetMarketCap200ResponseMarketCapInner> marketCap = new ArrayList<>();

  public GetMarketCap200Response() { 
  }

  public GetMarketCap200Response meta(@javax.annotation.Nonnull GetMarketCap200ResponseMeta meta) {
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
  public GetMarketCap200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetMarketCap200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetMarketCap200Response marketCap(@javax.annotation.Nonnull List<GetMarketCap200ResponseMarketCapInner> marketCap) {
    this.marketCap = marketCap;
    return this;
  }

  public GetMarketCap200Response addMarketCapItem(GetMarketCap200ResponseMarketCapInner marketCapItem) {
    if (this.marketCap == null) {
      this.marketCap = new ArrayList<>();
    }
    this.marketCap.add(marketCapItem);
    return this;
  }

  /**
   * Market capitalization values
   * @return marketCap
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MARKET_CAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetMarketCap200ResponseMarketCapInner> getMarketCap() {
    return marketCap;
  }


  @JsonProperty(value = JSON_PROPERTY_MARKET_CAP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarketCap(@javax.annotation.Nonnull List<GetMarketCap200ResponseMarketCapInner> marketCap) {
    this.marketCap = marketCap;
  }


  /**
   * Return true if this GetMarketCap_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketCap200Response getMarketCap200Response = (GetMarketCap200Response) o;
    return Objects.equals(this.meta, getMarketCap200Response.meta) &&
        Objects.equals(this.marketCap, getMarketCap200Response.marketCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, marketCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketCap200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    marketCap: ").append(toIndentedString(marketCap)).append("\n");
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

    // add `market_cap` to the URL query string
    if (getMarketCap() != null) {
      for (int i = 0; i < getMarketCap().size(); i++) {
        if (getMarketCap().get(i) != null) {
          joiner.add(getMarketCap().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%smarket_cap%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

