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
import com.twelvedata.client.model.GetLastChanges200ResponsePagination;
import com.twelvedata.client.model.LastChangeResponseItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetLastChanges200Response
 */
@JsonPropertyOrder({
  GetLastChanges200Response.JSON_PROPERTY_PAGINATION,
  GetLastChanges200Response.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetLastChanges200Response {
  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  @javax.annotation.Nonnull
  private GetLastChanges200ResponsePagination pagination;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private List<LastChangeResponseItem> data = new ArrayList<>();

  public GetLastChanges200Response() { 
  }

  public GetLastChanges200Response pagination(@javax.annotation.Nonnull GetLastChanges200ResponsePagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PAGINATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetLastChanges200ResponsePagination getPagination() {
    return pagination;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGINATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPagination(@javax.annotation.Nonnull GetLastChanges200ResponsePagination pagination) {
    this.pagination = pagination;
  }


  public GetLastChanges200Response data(@javax.annotation.Nonnull List<LastChangeResponseItem> data) {
    this.data = data;
    return this;
  }

  public GetLastChanges200Response addDataItem(LastChangeResponseItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Data contains the list of last changes
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LastChangeResponseItem> getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull List<LastChangeResponseItem> data) {
    this.data = data;
  }


  /**
   * Return true if this GetLastChanges_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLastChanges200Response getLastChanges200Response = (GetLastChanges200Response) o;
    return Objects.equals(this.pagination, getLastChanges200Response.pagination) &&
        Objects.equals(this.data, getLastChanges200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLastChanges200Response {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // add `pagination` to the URL query string
    if (getPagination() != null) {
      joiner.add(getPagination().toUrlQueryString(prefix + "pagination" + suffix));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

