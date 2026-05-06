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
import com.twelvedata.client.model.GetPriceTarget200ResponseMeta;
import com.twelvedata.client.model.GetPriceTarget200ResponsePriceTarget;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetPriceTarget200Response
 */
@JsonPropertyOrder({
  GetPriceTarget200Response.JSON_PROPERTY_META,
  GetPriceTarget200Response.JSON_PROPERTY_PRICE_TARGET,
  GetPriceTarget200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetPriceTarget200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetPriceTarget200ResponseMeta meta;

  public static final String JSON_PROPERTY_PRICE_TARGET = "price_target";
  @javax.annotation.Nonnull
  private GetPriceTarget200ResponsePriceTarget priceTarget;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetPriceTarget200Response() { 
  }

  public GetPriceTarget200Response meta(@javax.annotation.Nonnull GetPriceTarget200ResponseMeta meta) {
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
  public GetPriceTarget200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetPriceTarget200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetPriceTarget200Response priceTarget(@javax.annotation.Nonnull GetPriceTarget200ResponsePriceTarget priceTarget) {
    this.priceTarget = priceTarget;
    return this;
  }

  /**
   * Get priceTarget
   * @return priceTarget
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetPriceTarget200ResponsePriceTarget getPriceTarget() {
    return priceTarget;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPriceTarget(@javax.annotation.Nonnull GetPriceTarget200ResponsePriceTarget priceTarget) {
    this.priceTarget = priceTarget;
  }


  public GetPriceTarget200Response status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Response status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  /**
   * Return true if this GetPriceTarget_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceTarget200Response getPriceTarget200Response = (GetPriceTarget200Response) o;
    return Objects.equals(this.meta, getPriceTarget200Response.meta) &&
        Objects.equals(this.priceTarget, getPriceTarget200Response.priceTarget) &&
        Objects.equals(this.status, getPriceTarget200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, priceTarget, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceTarget200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    priceTarget: ").append(toIndentedString(priceTarget)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `price_target` to the URL query string
    if (getPriceTarget() != null) {
      joiner.add(getPriceTarget().toUrlQueryString(prefix + "price_target" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

