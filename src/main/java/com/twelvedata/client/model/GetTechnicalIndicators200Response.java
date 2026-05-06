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
import com.twelvedata.client.model.GetTechnicalIndicators200ResponseDataValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetTechnicalIndicators200Response
 */
@JsonPropertyOrder({
  GetTechnicalIndicators200Response.JSON_PROPERTY_DATA,
  GetTechnicalIndicators200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetTechnicalIndicators200Response {
  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private Map<String, GetTechnicalIndicators200ResponseDataValue> data = new HashMap<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetTechnicalIndicators200Response() { 
  }

  public GetTechnicalIndicators200Response data(@javax.annotation.Nonnull Map<String, GetTechnicalIndicators200ResponseDataValue> data) {
    this.data = data;
    return this;
  }

  public GetTechnicalIndicators200Response putDataItem(String key, GetTechnicalIndicators200ResponseDataValue dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * Map of technical indicators available at Twelve Data API
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, GetTechnicalIndicators200ResponseDataValue> getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull Map<String, GetTechnicalIndicators200ResponseDataValue> data) {
    this.data = data;
  }


  public GetTechnicalIndicators200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetTechnicalIndicators_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTechnicalIndicators200Response getTechnicalIndicators200Response = (GetTechnicalIndicators200Response) o;
    return Objects.equals(this.data, getTechnicalIndicators200Response.data) &&
        Objects.equals(this.status, getTechnicalIndicators200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTechnicalIndicators200Response {\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      for (String _key : getData().keySet()) {
        if (getData().get(_key) != null) {
          joiner.add(getData().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdata%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
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

