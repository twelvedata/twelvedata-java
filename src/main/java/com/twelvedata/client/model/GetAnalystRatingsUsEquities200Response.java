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
import com.twelvedata.client.model.GetAnalystRatingsLight200ResponseMeta;
import com.twelvedata.client.model.GetAnalystRatingsUsEquities200ResponseRatingsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetAnalystRatingsUsEquities200Response
 */
@JsonPropertyOrder({
  GetAnalystRatingsUsEquities200Response.JSON_PROPERTY_META,
  GetAnalystRatingsUsEquities200Response.JSON_PROPERTY_RATINGS,
  GetAnalystRatingsUsEquities200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetAnalystRatingsUsEquities200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetAnalystRatingsLight200ResponseMeta meta;

  public static final String JSON_PROPERTY_RATINGS = "ratings";
  @javax.annotation.Nullable
  private List<GetAnalystRatingsUsEquities200ResponseRatingsInner> ratings = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetAnalystRatingsUsEquities200Response() { 
  }

  public GetAnalystRatingsUsEquities200Response meta(@javax.annotation.Nonnull GetAnalystRatingsLight200ResponseMeta meta) {
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
  public GetAnalystRatingsLight200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetAnalystRatingsLight200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetAnalystRatingsUsEquities200Response ratings(@javax.annotation.Nullable List<GetAnalystRatingsUsEquities200ResponseRatingsInner> ratings) {
    this.ratings = ratings;
    return this;
  }

  public GetAnalystRatingsUsEquities200Response addRatingsItem(GetAnalystRatingsUsEquities200ResponseRatingsInner ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * List of analyst ratings
   * @return ratings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetAnalystRatingsUsEquities200ResponseRatingsInner> getRatings() {
    return ratings;
  }


  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatings(@javax.annotation.Nullable List<GetAnalystRatingsUsEquities200ResponseRatingsInner> ratings) {
    this.ratings = ratings;
  }


  public GetAnalystRatingsUsEquities200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetAnalystRatingsUsEquities_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAnalystRatingsUsEquities200Response getAnalystRatingsUsEquities200Response = (GetAnalystRatingsUsEquities200Response) o;
    return Objects.equals(this.meta, getAnalystRatingsUsEquities200Response.meta) &&
        Objects.equals(this.ratings, getAnalystRatingsUsEquities200Response.ratings) &&
        Objects.equals(this.status, getAnalystRatingsUsEquities200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ratings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAnalystRatingsUsEquities200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

    // add `ratings` to the URL query string
    if (getRatings() != null) {
      for (int i = 0; i < getRatings().size(); i++) {
        if (getRatings().get(i) != null) {
          joiner.add(getRatings().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sratings%s%s", prefix, suffix,
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

