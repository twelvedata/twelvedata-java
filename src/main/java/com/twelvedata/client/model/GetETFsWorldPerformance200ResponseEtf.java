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
import com.twelvedata.client.model.GetETFsWorldPerformance200ResponseEtfPerformance;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Etf information
 */
@JsonPropertyOrder({
  GetETFsWorldPerformance200ResponseEtf.JSON_PROPERTY_PERFORMANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorldPerformance200ResponseEtf {
  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  @javax.annotation.Nullable
  private GetETFsWorldPerformance200ResponseEtfPerformance performance;

  public GetETFsWorldPerformance200ResponseEtf() { 
  }

  public GetETFsWorldPerformance200ResponseEtf performance(@javax.annotation.Nullable GetETFsWorldPerformance200ResponseEtfPerformance performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorldPerformance200ResponseEtfPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(@javax.annotation.Nullable GetETFsWorldPerformance200ResponseEtfPerformance performance) {
    this.performance = performance;
  }


  /**
   * Return true if this GetETFsWorldPerformance_200_response_etf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorldPerformance200ResponseEtf getETFsWorldPerformance200ResponseEtf = (GetETFsWorldPerformance200ResponseEtf) o;
    return Objects.equals(this.performance, getETFsWorldPerformance200ResponseEtf.performance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorldPerformance200ResponseEtf {\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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

    // add `performance` to the URL query string
    if (getPerformance() != null) {
      joiner.add(getPerformance().toUrlQueryString(prefix + "performance" + suffix));
    }

    return joiner.toString();
  }
}

