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
import com.twelvedata.client.model.GetETFsWorldPerformance200ResponseEtf;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetETFsWorldPerformance200Response
 */
@JsonPropertyOrder({
  GetETFsWorldPerformance200Response.JSON_PROPERTY_ETF,
  GetETFsWorldPerformance200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorldPerformance200Response {
  public static final String JSON_PROPERTY_ETF = "etf";
  @javax.annotation.Nonnull
  private GetETFsWorldPerformance200ResponseEtf etf;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private String status;

  public GetETFsWorldPerformance200Response() { 
  }

  public GetETFsWorldPerformance200Response etf(@javax.annotation.Nonnull GetETFsWorldPerformance200ResponseEtf etf) {
    this.etf = etf;
    return this;
  }

  /**
   * Get etf
   * @return etf
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ETF, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetETFsWorldPerformance200ResponseEtf getEtf() {
    return etf;
  }


  @JsonProperty(value = JSON_PROPERTY_ETF, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEtf(@javax.annotation.Nonnull GetETFsWorldPerformance200ResponseEtf etf) {
    this.etf = etf;
  }


  public GetETFsWorldPerformance200Response status(@javax.annotation.Nonnull String status) {
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
   * Return true if this GetETFsWorldPerformance_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorldPerformance200Response getETFsWorldPerformance200Response = (GetETFsWorldPerformance200Response) o;
    return Objects.equals(this.etf, getETFsWorldPerformance200Response.etf) &&
        Objects.equals(this.status, getETFsWorldPerformance200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etf, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorldPerformance200Response {\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
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

    // add `etf` to the URL query string
    if (getEtf() != null) {
      joiner.add(getEtf().toUrlQueryString(prefix + "etf" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

