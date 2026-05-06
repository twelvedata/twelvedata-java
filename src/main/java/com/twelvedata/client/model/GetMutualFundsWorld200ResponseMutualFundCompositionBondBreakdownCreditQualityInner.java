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
 * GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner.JSON_PROPERTY_GRADE,
  GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner.JSON_PROPERTY_WEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner {
  public static final String JSON_PROPERTY_GRADE = "grade";
  @javax.annotation.Nullable
  private String grade;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  @javax.annotation.Nullable
  private Double weight;

  public GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner grade(@javax.annotation.Nullable String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Rating of bond holding of a fund from AAA to below B
   * @return grade
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GRADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGrade() {
    return grade;
  }


  @JsonProperty(value = JSON_PROPERTY_GRADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrade(@javax.annotation.Nullable String grade) {
    this.grade = grade;
  }


  public GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner weight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of bond holding in fund portfolio
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWeight() {
    return weight;
  }


  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_composition_bond_breakdown_credit_quality_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner getMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner = (GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner) o;
    return Objects.equals(this.grade, getMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner.grade) &&
        Objects.equals(this.weight, getMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundCompositionBondBreakdownCreditQualityInner {\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

    // add `grade` to the URL query string
    if (getGrade() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgrade%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGrade()))));
    }

    // add `weight` to the URL query string
    if (getWeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sweight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWeight()))));
    }

    return joiner.toString();
  }
}

