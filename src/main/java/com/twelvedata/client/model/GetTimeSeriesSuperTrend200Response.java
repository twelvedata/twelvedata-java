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
import com.twelvedata.client.model.GetTimeSeriesSuperTrend200ResponseMeta;
import com.twelvedata.client.model.GetTimeSeriesSuperTrend200ResponseValuesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetTimeSeriesSuperTrend200Response
 */
@JsonPropertyOrder({
  GetTimeSeriesSuperTrend200Response.JSON_PROPERTY_META,
  GetTimeSeriesSuperTrend200Response.JSON_PROPERTY_VALUES,
  GetTimeSeriesSuperTrend200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTimeSeriesSuperTrend200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetTimeSeriesSuperTrend200ResponseMeta meta;

  public static final String JSON_PROPERTY_VALUES = "values";
  @javax.annotation.Nonnull
  private List<GetTimeSeriesSuperTrend200ResponseValuesInner> values = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetTimeSeriesSuperTrend200Response() { 
  }

  public GetTimeSeriesSuperTrend200Response meta(@javax.annotation.Nonnull GetTimeSeriesSuperTrend200ResponseMeta meta) {
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
  public GetTimeSeriesSuperTrend200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetTimeSeriesSuperTrend200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetTimeSeriesSuperTrend200Response values(@javax.annotation.Nonnull List<GetTimeSeriesSuperTrend200ResponseValuesInner> values) {
    this.values = values;
    return this;
  }

  public GetTimeSeriesSuperTrend200Response addValuesItem(GetTimeSeriesSuperTrend200ResponseValuesInner valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Array of time series data points
   * @return values
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VALUES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetTimeSeriesSuperTrend200ResponseValuesInner> getValues() {
    return values;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(@javax.annotation.Nonnull List<GetTimeSeriesSuperTrend200ResponseValuesInner> values) {
    this.values = values;
  }


  public GetTimeSeriesSuperTrend200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetTimeSeriesSuperTrend_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeSeriesSuperTrend200Response getTimeSeriesSuperTrend200Response = (GetTimeSeriesSuperTrend200Response) o;
    return Objects.equals(this.meta, getTimeSeriesSuperTrend200Response.meta) &&
        Objects.equals(this.values, getTimeSeriesSuperTrend200Response.values) &&
        Objects.equals(this.status, getTimeSeriesSuperTrend200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, values, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeSeriesSuperTrend200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

    // add `values` to the URL query string
    if (getValues() != null) {
      for (int i = 0; i < getValues().size(); i++) {
        if (getValues().get(i) != null) {
          joiner.add(getValues().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%svalues%s%s", prefix, suffix,
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

