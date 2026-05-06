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
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfComposition;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfPerformance;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfRisk;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfSummary;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Etf information
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtf.JSON_PROPERTY_SUMMARY,
  GetETFsWorld200ResponseEtf.JSON_PROPERTY_PERFORMANCE,
  GetETFsWorld200ResponseEtf.JSON_PROPERTY_RISK,
  GetETFsWorld200ResponseEtf.JSON_PROPERTY_COMPOSITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtf {
  public static final String JSON_PROPERTY_SUMMARY = "summary";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfSummary summary;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfPerformance performance;

  public static final String JSON_PROPERTY_RISK = "risk";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfRisk risk;

  public static final String JSON_PROPERTY_COMPOSITION = "composition";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfComposition composition;

  public GetETFsWorld200ResponseEtf() { 
  }

  public GetETFsWorld200ResponseEtf summary(@javax.annotation.Nullable GetETFsWorld200ResponseEtfSummary summary) {
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
  public GetETFsWorld200ResponseEtfSummary getSummary() {
    return summary;
  }


  @JsonProperty(value = JSON_PROPERTY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(@javax.annotation.Nullable GetETFsWorld200ResponseEtfSummary summary) {
    this.summary = summary;
  }


  public GetETFsWorld200ResponseEtf performance(@javax.annotation.Nullable GetETFsWorld200ResponseEtfPerformance performance) {
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
  public GetETFsWorld200ResponseEtfPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(@javax.annotation.Nullable GetETFsWorld200ResponseEtfPerformance performance) {
    this.performance = performance;
  }


  public GetETFsWorld200ResponseEtf risk(@javax.annotation.Nullable GetETFsWorld200ResponseEtfRisk risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RISK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfRisk getRisk() {
    return risk;
  }


  @JsonProperty(value = JSON_PROPERTY_RISK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRisk(@javax.annotation.Nullable GetETFsWorld200ResponseEtfRisk risk) {
    this.risk = risk;
  }


  public GetETFsWorld200ResponseEtf composition(@javax.annotation.Nullable GetETFsWorld200ResponseEtfComposition composition) {
    this.composition = composition;
    return this;
  }

  /**
   * Get composition
   * @return composition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPOSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfComposition getComposition() {
    return composition;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPOSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposition(@javax.annotation.Nullable GetETFsWorld200ResponseEtfComposition composition) {
    this.composition = composition;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtf getETFsWorld200ResponseEtf = (GetETFsWorld200ResponseEtf) o;
    return Objects.equals(this.summary, getETFsWorld200ResponseEtf.summary) &&
        Objects.equals(this.performance, getETFsWorld200ResponseEtf.performance) &&
        Objects.equals(this.risk, getETFsWorld200ResponseEtf.risk) &&
        Objects.equals(this.composition, getETFsWorld200ResponseEtf.composition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, performance, risk, composition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtf {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
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

    // add `performance` to the URL query string
    if (getPerformance() != null) {
      joiner.add(getPerformance().toUrlQueryString(prefix + "performance" + suffix));
    }

    // add `risk` to the URL query string
    if (getRisk() != null) {
      joiner.add(getRisk().toUrlQueryString(prefix + "risk" + suffix));
    }

    // add `composition` to the URL query string
    if (getComposition() != null) {
      joiner.add(getComposition().toUrlQueryString(prefix + "composition" + suffix));
    }

    return joiner.toString();
  }
}

