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
import com.twelvedata.client.model.GetGrowthEstimates200ResponseGrowthEstimates;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetGrowthEstimates200Response
 */
@JsonPropertyOrder({
  GetGrowthEstimates200Response.JSON_PROPERTY_META,
  GetGrowthEstimates200Response.JSON_PROPERTY_GROWTH_ESTIMATES,
  GetGrowthEstimates200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetGrowthEstimates200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetEarningsEstimate200ResponseMeta meta;

  public static final String JSON_PROPERTY_GROWTH_ESTIMATES = "growth_estimates";
  @javax.annotation.Nullable
  private GetGrowthEstimates200ResponseGrowthEstimates growthEstimates;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetGrowthEstimates200Response() { 
  }

  public GetGrowthEstimates200Response meta(@javax.annotation.Nonnull GetEarningsEstimate200ResponseMeta meta) {
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


  public GetGrowthEstimates200Response growthEstimates(@javax.annotation.Nullable GetGrowthEstimates200ResponseGrowthEstimates growthEstimates) {
    this.growthEstimates = growthEstimates;
    return this;
  }

  /**
   * Get growthEstimates
   * @return growthEstimates
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROWTH_ESTIMATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetGrowthEstimates200ResponseGrowthEstimates getGrowthEstimates() {
    return growthEstimates;
  }


  @JsonProperty(value = JSON_PROPERTY_GROWTH_ESTIMATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrowthEstimates(@javax.annotation.Nullable GetGrowthEstimates200ResponseGrowthEstimates growthEstimates) {
    this.growthEstimates = growthEstimates;
  }


  public GetGrowthEstimates200Response status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the request
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
   * Return true if this GetGrowthEstimates_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGrowthEstimates200Response getGrowthEstimates200Response = (GetGrowthEstimates200Response) o;
    return Objects.equals(this.meta, getGrowthEstimates200Response.meta) &&
        Objects.equals(this.growthEstimates, getGrowthEstimates200Response.growthEstimates) &&
        Objects.equals(this.status, getGrowthEstimates200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, growthEstimates, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGrowthEstimates200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    growthEstimates: ").append(toIndentedString(growthEstimates)).append("\n");
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

    // add `growth_estimates` to the URL query string
    if (getGrowthEstimates() != null) {
      joiner.add(getGrowthEstimates().toUrlQueryString(prefix + "growth_estimates" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

