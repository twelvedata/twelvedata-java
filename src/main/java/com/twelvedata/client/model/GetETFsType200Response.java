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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetETFsType200Response
 */
@JsonPropertyOrder({
  GetETFsType200Response.JSON_PROPERTY_RESULT,
  GetETFsType200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsType200Response {
  public static final String JSON_PROPERTY_RESULT = "result";
  @javax.annotation.Nonnull
  private Map<String, List<String>> result = new HashMap<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetETFsType200Response() { 
  }

  public GetETFsType200Response result(@javax.annotation.Nonnull Map<String, List<String>> result) {
    this.result = result;
    return this;
  }

  public GetETFsType200Response putResultItem(String key, List<String> resultItem) {
    if (this.result == null) {
      this.result = new HashMap<>();
    }
    this.result.put(key, resultItem);
    return this;
  }

  /**
   * List of ETFs by market
   * @return result
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<String>> getResult() {
    return result;
  }


  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(@javax.annotation.Nonnull Map<String, List<String>> result) {
    this.result = result;
  }


  public GetETFsType200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetETFsType_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsType200Response getETFsType200Response = (GetETFsType200Response) o;
    return Objects.equals(this.result, getETFsType200Response.result) &&
        Objects.equals(this.status, getETFsType200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsType200Response {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

    // add `result` to the URL query string
    if (getResult() != null) {
      for (String _key : getResult().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sresult%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getResult().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getResult().get(_key)))));
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

