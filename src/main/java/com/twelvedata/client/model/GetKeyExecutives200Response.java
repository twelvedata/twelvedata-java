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
import com.twelvedata.client.model.GetKeyExecutives200ResponseKeyExecutivesInner;
import com.twelvedata.client.model.GetKeyExecutives200ResponseMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetKeyExecutives200Response
 */
@JsonPropertyOrder({
  GetKeyExecutives200Response.JSON_PROPERTY_META,
  GetKeyExecutives200Response.JSON_PROPERTY_KEY_EXECUTIVES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetKeyExecutives200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetKeyExecutives200ResponseMeta meta;

  public static final String JSON_PROPERTY_KEY_EXECUTIVES = "key_executives";
  @javax.annotation.Nullable
  private List<GetKeyExecutives200ResponseKeyExecutivesInner> keyExecutives = new ArrayList<>();

  public GetKeyExecutives200Response() { 
  }

  public GetKeyExecutives200Response meta(@javax.annotation.Nonnull GetKeyExecutives200ResponseMeta meta) {
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
  public GetKeyExecutives200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetKeyExecutives200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetKeyExecutives200Response keyExecutives(@javax.annotation.Nullable List<GetKeyExecutives200ResponseKeyExecutivesInner> keyExecutives) {
    this.keyExecutives = keyExecutives;
    return this;
  }

  public GetKeyExecutives200Response addKeyExecutivesItem(GetKeyExecutives200ResponseKeyExecutivesInner keyExecutivesItem) {
    if (this.keyExecutives == null) {
      this.keyExecutives = new ArrayList<>();
    }
    this.keyExecutives.add(keyExecutivesItem);
    return this;
  }

  /**
   * List of key executives
   * @return keyExecutives
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_EXECUTIVES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetKeyExecutives200ResponseKeyExecutivesInner> getKeyExecutives() {
    return keyExecutives;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_EXECUTIVES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyExecutives(@javax.annotation.Nullable List<GetKeyExecutives200ResponseKeyExecutivesInner> keyExecutives) {
    this.keyExecutives = keyExecutives;
  }


  /**
   * Return true if this GetKeyExecutives_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKeyExecutives200Response getKeyExecutives200Response = (GetKeyExecutives200Response) o;
    return Objects.equals(this.meta, getKeyExecutives200Response.meta) &&
        Objects.equals(this.keyExecutives, getKeyExecutives200Response.keyExecutives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, keyExecutives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKeyExecutives200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    keyExecutives: ").append(toIndentedString(keyExecutives)).append("\n");
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

    // add `key_executives` to the URL query string
    if (getKeyExecutives() != null) {
      for (int i = 0; i < getKeyExecutives().size(); i++) {
        if (getKeyExecutives().get(i) != null) {
          joiner.add(getKeyExecutives().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%skey_executives%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

