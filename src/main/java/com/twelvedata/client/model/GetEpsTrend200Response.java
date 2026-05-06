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
import com.twelvedata.client.model.GetEarningsEstimate200ResponseMeta;
import com.twelvedata.client.model.GetEpsTrend200ResponseEpsTrendInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetEpsTrend200Response
 */
@JsonPropertyOrder({
  GetEpsTrend200Response.JSON_PROPERTY_META,
  GetEpsTrend200Response.JSON_PROPERTY_EPS_TREND,
  GetEpsTrend200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetEpsTrend200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetEarningsEstimate200ResponseMeta meta;

  public static final String JSON_PROPERTY_EPS_TREND = "eps_trend";
  @javax.annotation.Nonnull
  private List<GetEpsTrend200ResponseEpsTrendInner> epsTrend = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetEpsTrend200Response() { 
  }

  public GetEpsTrend200Response meta(@javax.annotation.Nonnull GetEarningsEstimate200ResponseMeta meta) {
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
  public GetEarningsEstimate200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetEarningsEstimate200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetEpsTrend200Response epsTrend(@javax.annotation.Nonnull List<GetEpsTrend200ResponseEpsTrendInner> epsTrend) {
    this.epsTrend = epsTrend;
    return this;
  }

  public GetEpsTrend200Response addEpsTrendItem(GetEpsTrend200ResponseEpsTrendInner epsTrendItem) {
    if (this.epsTrend == null) {
      this.epsTrend = new ArrayList<>();
    }
    this.epsTrend.add(epsTrendItem);
    return this;
  }

  /**
   * EPS trend data
   * @return epsTrend
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EPS_TREND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GetEpsTrend200ResponseEpsTrendInner> getEpsTrend() {
    return epsTrend;
  }


  @JsonProperty(value = JSON_PROPERTY_EPS_TREND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEpsTrend(@javax.annotation.Nonnull List<GetEpsTrend200ResponseEpsTrendInner> epsTrend) {
    this.epsTrend = epsTrend;
  }


  public GetEpsTrend200Response status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the response
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
   * Return true if this GetEpsTrend_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEpsTrend200Response getEpsTrend200Response = (GetEpsTrend200Response) o;
    return Objects.equals(this.meta, getEpsTrend200Response.meta) &&
        Objects.equals(this.epsTrend, getEpsTrend200Response.epsTrend) &&
        Objects.equals(this.status, getEpsTrend200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, epsTrend, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEpsTrend200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    epsTrend: ").append(toIndentedString(epsTrend)).append("\n");
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

    // add `eps_trend` to the URL query string
    if (getEpsTrend() != null) {
      for (int i = 0; i < getEpsTrend().size(); i++) {
        if (getEpsTrend().get(i) != null) {
          joiner.add(getEpsTrend().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%seps_trend%s%s", prefix, suffix,
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

