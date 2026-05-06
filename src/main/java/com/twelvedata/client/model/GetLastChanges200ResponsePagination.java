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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Pagination information
 */
@JsonPropertyOrder({
  GetLastChanges200ResponsePagination.JSON_PROPERTY_CURRENT_PAGE,
  GetLastChanges200ResponsePagination.JSON_PROPERTY_PER_PAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetLastChanges200ResponsePagination {
  public static final String JSON_PROPERTY_CURRENT_PAGE = "current_page";
  @javax.annotation.Nonnull
  private Long currentPage;

  public static final String JSON_PROPERTY_PER_PAGE = "per_page";
  @javax.annotation.Nonnull
  private Long perPage;

  public GetLastChanges200ResponsePagination() { 
  }

  public GetLastChanges200ResponsePagination currentPage(@javax.annotation.Nonnull Long currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page number
   * @return currentPage
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENT_PAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCurrentPage() {
    return currentPage;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentPage(@javax.annotation.Nonnull Long currentPage) {
    this.currentPage = currentPage;
  }


  public GetLastChanges200ResponsePagination perPage(@javax.annotation.Nonnull Long perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * Records per page
   * @return perPage
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PER_PAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPerPage() {
    return perPage;
  }


  @JsonProperty(value = JSON_PROPERTY_PER_PAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerPage(@javax.annotation.Nonnull Long perPage) {
    this.perPage = perPage;
  }


  /**
   * Return true if this GetLastChanges_200_response_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLastChanges200ResponsePagination getLastChanges200ResponsePagination = (GetLastChanges200ResponsePagination) o;
    return Objects.equals(this.currentPage, getLastChanges200ResponsePagination.currentPage) &&
        Objects.equals(this.perPage, getLastChanges200ResponsePagination.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLastChanges200ResponsePagination {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

    // add `current_page` to the URL query string
    if (getCurrentPage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_page%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPage()))));
    }

    // add `per_page` to the URL query string
    if (getPerPage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sper_page%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPerPage()))));
    }

    return joiner.toString();
  }
}

