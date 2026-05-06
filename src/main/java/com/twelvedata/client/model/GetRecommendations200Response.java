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
import com.twelvedata.client.model.GetRecommendations200ResponseMeta;
import com.twelvedata.client.model.GetRecommendations200ResponseTrends;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetRecommendations200Response
 */
@JsonPropertyOrder({
  GetRecommendations200Response.JSON_PROPERTY_META,
  GetRecommendations200Response.JSON_PROPERTY_TRENDS,
  GetRecommendations200Response.JSON_PROPERTY_RATING,
  GetRecommendations200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetRecommendations200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetRecommendations200ResponseMeta meta;

  public static final String JSON_PROPERTY_TRENDS = "trends";
  @javax.annotation.Nonnull
  private GetRecommendations200ResponseTrends trends;

  public static final String JSON_PROPERTY_RATING = "rating";
  @javax.annotation.Nullable
  private Double rating;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetRecommendations200Response() { 
  }

  public GetRecommendations200Response meta(@javax.annotation.Nonnull GetRecommendations200ResponseMeta meta) {
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
  public GetRecommendations200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetRecommendations200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetRecommendations200Response trends(@javax.annotation.Nonnull GetRecommendations200ResponseTrends trends) {
    this.trends = trends;
    return this;
  }

  /**
   * Get trends
   * @return trends
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TRENDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetRecommendations200ResponseTrends getTrends() {
    return trends;
  }


  @JsonProperty(value = JSON_PROPERTY_TRENDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrends(@javax.annotation.Nonnull GetRecommendations200ResponseTrends trends) {
    this.trends = trends;
  }


  public GetRecommendations200Response rating(@javax.annotation.Nullable Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Rating from 0 to 10 represents overall analysts&#39; recommendation. 0 to 2 - strong sell, 2 to 4 - sell, 4 to 6 - hold, 6 to 8 - buy, 8 to 10 - strong buy.
   * @return rating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRating() {
    return rating;
  }


  @JsonProperty(value = JSON_PROPERTY_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(@javax.annotation.Nullable Double rating) {
    this.rating = rating;
  }


  public GetRecommendations200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetRecommendations_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendations200Response getRecommendations200Response = (GetRecommendations200Response) o;
    return Objects.equals(this.meta, getRecommendations200Response.meta) &&
        Objects.equals(this.trends, getRecommendations200Response.trends) &&
        Objects.equals(this.rating, getRecommendations200Response.rating) &&
        Objects.equals(this.status, getRecommendations200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, trends, rating, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendations200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

    // add `trends` to the URL query string
    if (getTrends() != null) {
      joiner.add(getTrends().toUrlQueryString(prefix + "trends" + suffix));
    }

    // add `rating` to the URL query string
    if (getRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRating()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

