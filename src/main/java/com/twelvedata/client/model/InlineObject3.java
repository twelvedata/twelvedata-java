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
 * InlineObject3
 */
@JsonPropertyOrder({
  InlineObject3.JSON_PROPERTY_PERFORMANCE_RATING,
  InlineObject3.JSON_PROPERTY_RETURN_RATING,
  InlineObject3.JSON_PROPERTY_RISK_RATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject3 {
  public static final String JSON_PROPERTY_PERFORMANCE_RATING = "performance_rating";
  @javax.annotation.Nullable
  private Long performanceRating;

  public static final String JSON_PROPERTY_RETURN_RATING = "return_rating";
  @javax.annotation.Nullable
  private Long returnRating;

  public static final String JSON_PROPERTY_RISK_RATING = "risk_rating";
  @javax.annotation.Nullable
  private Long riskRating;

  public InlineObject3() { 
  }

  public InlineObject3 performanceRating(@javax.annotation.Nullable Long performanceRating) {
    this.performanceRating = performanceRating;
    return this;
  }

  /**
   * Get performanceRating
   * @return performanceRating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPerformanceRating() {
    return performanceRating;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformanceRating(@javax.annotation.Nullable Long performanceRating) {
    this.performanceRating = performanceRating;
  }


  public InlineObject3 returnRating(@javax.annotation.Nullable Long returnRating) {
    this.returnRating = returnRating;
    return this;
  }

  /**
   * Get returnRating
   * @return returnRating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETURN_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReturnRating() {
    return returnRating;
  }


  @JsonProperty(value = JSON_PROPERTY_RETURN_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnRating(@javax.annotation.Nullable Long returnRating) {
    this.returnRating = returnRating;
  }


  public InlineObject3 riskRating(@javax.annotation.Nullable Long riskRating) {
    this.riskRating = riskRating;
    return this;
  }

  /**
   * Get riskRating
   * @return riskRating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RISK_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRiskRating() {
    return riskRating;
  }


  @JsonProperty(value = JSON_PROPERTY_RISK_RATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskRating(@javax.annotation.Nullable Long riskRating) {
    this.riskRating = riskRating;
  }


  /**
   * Return true if this inline_object_3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.performanceRating, inlineObject3.performanceRating) &&
        Objects.equals(this.returnRating, inlineObject3.returnRating) &&
        Objects.equals(this.riskRating, inlineObject3.riskRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceRating, returnRating, riskRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    sb.append("    performanceRating: ").append(toIndentedString(performanceRating)).append("\n");
    sb.append("    returnRating: ").append(toIndentedString(returnRating)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
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

    // add `performance_rating` to the URL query string
    if (getPerformanceRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sperformance_rating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPerformanceRating()))));
    }

    // add `return_rating` to the URL query string
    if (getReturnRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreturn_rating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReturnRating()))));
    }

    // add `risk_rating` to the URL query string
    if (getRiskRating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srisk_rating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRiskRating()))));
    }

    return joiner.toString();
  }
}

