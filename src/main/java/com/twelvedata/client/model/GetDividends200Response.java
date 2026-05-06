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
import com.twelvedata.client.model.GetDividends200ResponseDividendsInner;
import com.twelvedata.client.model.GetDividends200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetDividends200Response
 */
@JsonPropertyOrder({
  GetDividends200Response.JSON_PROPERTY_META,
  GetDividends200Response.JSON_PROPERTY_DIVIDENDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetDividends200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetDividends200ResponseMeta meta;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  @javax.annotation.Nonnull
  private List<GetDividends200ResponseDividendsInner> dividends = new ArrayList<>();

  public GetDividends200Response() { 
  }

  public GetDividends200Response meta(@javax.annotation.Nonnull GetDividends200ResponseMeta meta) {
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
  public GetDividends200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetDividends200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetDividends200Response dividends(@javax.annotation.Nonnull List<GetDividends200ResponseDividendsInner> dividends) {
    this.dividends = dividends;
    return this;
  }

  public GetDividends200Response addDividendsItem(GetDividends200ResponseDividendsInner dividendsItem) {
    if (this.dividends == null) {
      this.dividends = new ArrayList<>();
    }
    this.dividends.add(dividendsItem);
    return this;
  }

  /**
   * List of dividends
   * @return dividends
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetDividends200ResponseDividendsInner> getDividends() {
    return dividends;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDENDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDividends(@javax.annotation.Nonnull List<GetDividends200ResponseDividendsInner> dividends) {
    this.dividends = dividends;
  }


  /**
   * Return true if this GetDividends_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDividends200Response getDividends200Response = (GetDividends200Response) o;
    return Objects.equals(this.meta, getDividends200Response.meta) &&
        Objects.equals(this.dividends, getDividends200Response.dividends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, dividends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDividends200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
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

    // add `dividends` to the URL query string
    if (getDividends() != null) {
      for (int i = 0; i < getDividends().size(); i++) {
        if (getDividends().get(i) != null) {
          joiner.add(getDividends().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdividends%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

