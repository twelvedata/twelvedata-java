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
import com.twelvedata.client.model.EtfResponseItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetEtf200Response
 */
@JsonPropertyOrder({
  GetEtf200Response.JSON_PROPERTY_COUNT,
  GetEtf200Response.JSON_PROPERTY_DATA,
  GetEtf200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEtf200Response {
  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nonnull
  private Long count;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private List<EtfResponseItem> data = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetEtf200Response() { 
  }

  public GetEtf200Response count(@javax.annotation.Nonnull Long count) {
    this.count = count;
    return this;
  }

  /**
   * Count
   * @return count
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(@javax.annotation.Nonnull Long count) {
    this.count = count;
  }


  public GetEtf200Response data(@javax.annotation.Nonnull List<EtfResponseItem> data) {
    this.data = data;
    return this;
  }

  public GetEtf200Response addDataItem(EtfResponseItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of ETFs
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EtfResponseItem> getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull List<EtfResponseItem> data) {
    this.data = data;
  }


  public GetEtf200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetEtf_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEtf200Response getEtf200Response = (GetEtf200Response) o;
    return Objects.equals(this.count, getEtf200Response.count) &&
        Objects.equals(this.data, getEtf200Response.data) &&
        Objects.equals(this.status, getEtf200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEtf200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // add `count` to the URL query string
    if (getCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCount()))));
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

