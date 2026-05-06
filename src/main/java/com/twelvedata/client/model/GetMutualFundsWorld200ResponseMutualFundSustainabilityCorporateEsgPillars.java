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
 * Corporate ESG pillars
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.JSON_PROPERTY_ENVIRONMENTAL,
  GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.JSON_PROPERTY_SOCIAL,
  GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.JSON_PROPERTY_GOVERNANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars {
  public static final String JSON_PROPERTY_ENVIRONMENTAL = "environmental";
  @javax.annotation.Nullable
  private Double environmental;

  public static final String JSON_PROPERTY_SOCIAL = "social";
  @javax.annotation.Nullable
  private Double social;

  public static final String JSON_PROPERTY_GOVERNANCE = "governance";
  @javax.annotation.Nullable
  private Double governance;

  public GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars environmental(@javax.annotation.Nullable Double environmental) {
    this.environmental = environmental;
    return this;
  }

  /**
   * ESG environmental score
   * @return environmental
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENVIRONMENTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEnvironmental() {
    return environmental;
  }


  @JsonProperty(value = JSON_PROPERTY_ENVIRONMENTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmental(@javax.annotation.Nullable Double environmental) {
    this.environmental = environmental;
  }


  public GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars social(@javax.annotation.Nullable Double social) {
    this.social = social;
    return this;
  }

  /**
   * ESG social score
   * @return social
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOCIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSocial() {
    return social;
  }


  @JsonProperty(value = JSON_PROPERTY_SOCIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocial(@javax.annotation.Nullable Double social) {
    this.social = social;
  }


  public GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars governance(@javax.annotation.Nullable Double governance) {
    this.governance = governance;
    return this;
  }

  /**
   * ESG governance score
   * @return governance
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GOVERNANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGovernance() {
    return governance;
  }


  @JsonProperty(value = JSON_PROPERTY_GOVERNANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGovernance(@javax.annotation.Nullable Double governance) {
    this.governance = governance;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_sustainability_corporate_esg_pillars object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars getMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars = (GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars) o;
    return Objects.equals(this.environmental, getMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.environmental) &&
        Objects.equals(this.social, getMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.social) &&
        Objects.equals(this.governance, getMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars.governance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmental, social, governance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars {\n");
    sb.append("    environmental: ").append(toIndentedString(environmental)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
    sb.append("    governance: ").append(toIndentedString(governance)).append("\n");
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

    // add `environmental` to the URL query string
    if (getEnvironmental() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senvironmental%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnvironmental()))));
    }

    // add `social` to the URL query string
    if (getSocial() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssocial%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSocial()))));
    }

    // add `governance` to the URL query string
    if (getGovernance() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgovernance%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGovernance()))));
    }

    return joiner.toString();
  }
}

