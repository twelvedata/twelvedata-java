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
import com.twelvedata.client.model.GetSplits200ResponseMeta;
import com.twelvedata.client.model.GetSplits200ResponseSplitsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetSplits200Response
 */
@JsonPropertyOrder({
  GetSplits200Response.JSON_PROPERTY_META,
  GetSplits200Response.JSON_PROPERTY_SPLITS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetSplits200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetSplits200ResponseMeta meta;

  public static final String JSON_PROPERTY_SPLITS = "splits";
  @javax.annotation.Nonnull
  private List<GetSplits200ResponseSplitsInner> splits = new ArrayList<>();

  public GetSplits200Response() { 
  }

  public GetSplits200Response meta(@javax.annotation.Nonnull GetSplits200ResponseMeta meta) {
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
  public GetSplits200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetSplits200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetSplits200Response splits(@javax.annotation.Nonnull List<GetSplits200ResponseSplitsInner> splits) {
    this.splits = splits;
    return this;
  }

  public GetSplits200Response addSplitsItem(GetSplits200ResponseSplitsInner splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

  /**
   * List of stock splits
   * @return splits
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SPLITS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetSplits200ResponseSplitsInner> getSplits() {
    return splits;
  }


  @JsonProperty(value = JSON_PROPERTY_SPLITS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSplits(@javax.annotation.Nonnull List<GetSplits200ResponseSplitsInner> splits) {
    this.splits = splits;
  }


  /**
   * Return true if this GetSplits_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSplits200Response getSplits200Response = (GetSplits200Response) o;
    return Objects.equals(this.meta, getSplits200Response.meta) &&
        Objects.equals(this.splits, getSplits200Response.splits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, splits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSplits200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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

    // add `splits` to the URL query string
    if (getSplits() != null) {
      for (int i = 0; i < getSplits().size(); i++) {
        if (getSplits().get(i) != null) {
          joiner.add(getSplits().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%ssplits%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

