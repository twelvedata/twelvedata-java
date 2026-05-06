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
 * GetPrice200Response
 */
@JsonPropertyOrder({
  GetPrice200Response.JSON_PROPERTY_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetPrice200Response {
  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nonnull
  private String price;

  public GetPrice200Response() { 
  }

  public GetPrice200Response price(@javax.annotation.Nonnull String price) {
    this.price = price;
    return this;
  }

  /**
   * Real-time or the latest available price
   * @return price
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(@javax.annotation.Nonnull String price) {
    this.price = price;
  }


  /**
   * Return true if this GetPrice_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrice200Response getPrice200Response = (GetPrice200Response) o;
    return Objects.equals(this.price, getPrice200Response.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrice200Response {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

    // add `price` to the URL query string
    if (getPrice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrice()))));
    }

    return joiner.toString();
  }
}

