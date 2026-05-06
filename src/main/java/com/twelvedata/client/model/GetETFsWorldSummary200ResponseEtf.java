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
import com.twelvedata.client.model.GetETFsWorldSummary200ResponseEtfSummary;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Etf information
 */
@JsonPropertyOrder({
  GetETFsWorldSummary200ResponseEtf.JSON_PROPERTY_SUMMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorldSummary200ResponseEtf {
  public static final String JSON_PROPERTY_SUMMARY = "summary";
  @javax.annotation.Nullable
  private GetETFsWorldSummary200ResponseEtfSummary summary;

  public GetETFsWorldSummary200ResponseEtf() { 
  }

  public GetETFsWorldSummary200ResponseEtf summary(@javax.annotation.Nullable GetETFsWorldSummary200ResponseEtfSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorldSummary200ResponseEtfSummary getSummary() {
    return summary;
  }


  @JsonProperty(value = JSON_PROPERTY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(@javax.annotation.Nullable GetETFsWorldSummary200ResponseEtfSummary summary) {
    this.summary = summary;
  }


  /**
   * Return true if this GetETFsWorldSummary_200_response_etf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorldSummary200ResponseEtf getETFsWorldSummary200ResponseEtf = (GetETFsWorldSummary200ResponseEtf) o;
    return Objects.equals(this.summary, getETFsWorldSummary200ResponseEtf.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorldSummary200ResponseEtf {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(getSummary().toUrlQueryString(prefix + "summary" + suffix));
    }

    return joiner.toString();
  }
}

