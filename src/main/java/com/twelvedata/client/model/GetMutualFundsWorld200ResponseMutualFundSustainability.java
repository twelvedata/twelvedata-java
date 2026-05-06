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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Sustainability information of a mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundSustainability.JSON_PROPERTY_SCORE,
  GetMutualFundsWorld200ResponseMutualFundSustainability.JSON_PROPERTY_CORPORATE_ESG_PILLARS,
  GetMutualFundsWorld200ResponseMutualFundSustainability.JSON_PROPERTY_SUSTAINABLE_INVESTMENT,
  GetMutualFundsWorld200ResponseMutualFundSustainability.JSON_PROPERTY_CORPORATE_AUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundSustainability {
  public static final String JSON_PROPERTY_SCORE = "score";
  @javax.annotation.Nullable
  private Long score;

  public static final String JSON_PROPERTY_CORPORATE_ESG_PILLARS = "corporate_esg_pillars";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars corporateEsgPillars;

  public static final String JSON_PROPERTY_SUSTAINABLE_INVESTMENT = "sustainable_investment";
  @javax.annotation.Nullable
  private Boolean sustainableInvestment;

  public static final String JSON_PROPERTY_CORPORATE_AUM = "corporate_aum";
  @javax.annotation.Nullable
  private Double corporateAum;

  public GetMutualFundsWorld200ResponseMutualFundSustainability() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundSustainability score(@javax.annotation.Nullable Long score) {
    this.score = score;
    return this;
  }

  /**
   * Sustainability score: asset-weighted average of normalized company-level ESG Scores for the covered holdings in the portfolio from &#x60;0&#x60; to &#x60;100&#x60;
   * @return score
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScore() {
    return score;
  }


  @JsonProperty(value = JSON_PROPERTY_SCORE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(@javax.annotation.Nullable Long score) {
    this.score = score;
  }


  public GetMutualFundsWorld200ResponseMutualFundSustainability corporateEsgPillars(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars corporateEsgPillars) {
    this.corporateEsgPillars = corporateEsgPillars;
    return this;
  }

  /**
   * Get corporateEsgPillars
   * @return corporateEsgPillars
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CORPORATE_ESG_PILLARS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars getCorporateEsgPillars() {
    return corporateEsgPillars;
  }


  @JsonProperty(value = JSON_PROPERTY_CORPORATE_ESG_PILLARS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateEsgPillars(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSustainabilityCorporateEsgPillars corporateEsgPillars) {
    this.corporateEsgPillars = corporateEsgPillars;
  }


  public GetMutualFundsWorld200ResponseMutualFundSustainability sustainableInvestment(@javax.annotation.Nullable Boolean sustainableInvestment) {
    this.sustainableInvestment = sustainableInvestment;
    return this;
  }

  /**
   * Indication that the fund discloses in their prospectus that they employ socially responsible or ESG principles in their investment selection processes
   * @return sustainableInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUSTAINABLE_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSustainableInvestment() {
    return sustainableInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_SUSTAINABLE_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSustainableInvestment(@javax.annotation.Nullable Boolean sustainableInvestment) {
    this.sustainableInvestment = sustainableInvestment;
  }


  public GetMutualFundsWorld200ResponseMutualFundSustainability corporateAum(@javax.annotation.Nullable Double corporateAum) {
    this.corporateAum = corporateAum;
    return this;
  }

  /**
   * Percentage of AUM used to calculate sustainability score
   * @return corporateAum
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CORPORATE_AUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCorporateAum() {
    return corporateAum;
  }


  @JsonProperty(value = JSON_PROPERTY_CORPORATE_AUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateAum(@javax.annotation.Nullable Double corporateAum) {
    this.corporateAum = corporateAum;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_sustainability object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundSustainability getMutualFundsWorld200ResponseMutualFundSustainability = (GetMutualFundsWorld200ResponseMutualFundSustainability) o;
    return Objects.equals(this.score, getMutualFundsWorld200ResponseMutualFundSustainability.score) &&
        Objects.equals(this.corporateEsgPillars, getMutualFundsWorld200ResponseMutualFundSustainability.corporateEsgPillars) &&
        Objects.equals(this.sustainableInvestment, getMutualFundsWorld200ResponseMutualFundSustainability.sustainableInvestment) &&
        Objects.equals(this.corporateAum, getMutualFundsWorld200ResponseMutualFundSustainability.corporateAum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, corporateEsgPillars, sustainableInvestment, corporateAum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundSustainability {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    corporateEsgPillars: ").append(toIndentedString(corporateEsgPillars)).append("\n");
    sb.append("    sustainableInvestment: ").append(toIndentedString(sustainableInvestment)).append("\n");
    sb.append("    corporateAum: ").append(toIndentedString(corporateAum)).append("\n");
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

    // add `score` to the URL query string
    if (getScore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscore%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScore()))));
    }

    // add `corporate_esg_pillars` to the URL query string
    if (getCorporateEsgPillars() != null) {
      joiner.add(getCorporateEsgPillars().toUrlQueryString(prefix + "corporate_esg_pillars" + suffix));
    }

    // add `sustainable_investment` to the URL query string
    if (getSustainableInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssustainable_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSustainableInvestment()))));
    }

    // add `corporate_aum` to the URL query string
    if (getCorporateAum() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scorporate_aum%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCorporateAum()))));
    }

    return joiner.toString();
  }
}

