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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * InlineObject4
 */
@JsonPropertyOrder({
  InlineObject4.JSON_PROPERTY_CORPORATE_AUM,
  InlineObject4.JSON_PROPERTY_CORPORATE_ESG_PILLARS,
  InlineObject4.JSON_PROPERTY_SCORE,
  InlineObject4.JSON_PROPERTY_SUSTAINABLE_INVESTMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject4 {
  public static final String JSON_PROPERTY_CORPORATE_AUM = "corporate_aum";
  @javax.annotation.Nullable
  private Double corporateAum;

  public static final String JSON_PROPERTY_CORPORATE_ESG_PILLARS = "corporate_esg_pillars";
  @javax.annotation.Nullable
  private Map<String, Double> corporateEsgPillars = new HashMap<>();

  public static final String JSON_PROPERTY_SCORE = "score";
  @javax.annotation.Nullable
  private Long score;

  public static final String JSON_PROPERTY_SUSTAINABLE_INVESTMENT = "sustainable_investment";
  @javax.annotation.Nullable
  private Boolean sustainableInvestment;

  public InlineObject4() { 
  }

  public InlineObject4 corporateAum(@javax.annotation.Nullable Double corporateAum) {
    this.corporateAum = corporateAum;
    return this;
  }

  /**
   * Get corporateAum
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


  public InlineObject4 corporateEsgPillars(@javax.annotation.Nullable Map<String, Double> corporateEsgPillars) {
    this.corporateEsgPillars = corporateEsgPillars;
    return this;
  }

  public InlineObject4 putCorporateEsgPillarsItem(String key, Double corporateEsgPillarsItem) {
    if (this.corporateEsgPillars == null) {
      this.corporateEsgPillars = new HashMap<>();
    }
    this.corporateEsgPillars.put(key, corporateEsgPillarsItem);
    return this;
  }

  /**
   * Get corporateEsgPillars
   * @return corporateEsgPillars
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CORPORATE_ESG_PILLARS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Double> getCorporateEsgPillars() {
    return corporateEsgPillars;
  }


  @JsonProperty(value = JSON_PROPERTY_CORPORATE_ESG_PILLARS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateEsgPillars(@javax.annotation.Nullable Map<String, Double> corporateEsgPillars) {
    this.corporateEsgPillars = corporateEsgPillars;
  }


  public InlineObject4 score(@javax.annotation.Nullable Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
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


  public InlineObject4 sustainableInvestment(@javax.annotation.Nullable Boolean sustainableInvestment) {
    this.sustainableInvestment = sustainableInvestment;
    return this;
  }

  /**
   * Get sustainableInvestment
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


  /**
   * Return true if this inline_object_4 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.corporateAum, inlineObject4.corporateAum) &&
        Objects.equals(this.corporateEsgPillars, inlineObject4.corporateEsgPillars) &&
        Objects.equals(this.score, inlineObject4.score) &&
        Objects.equals(this.sustainableInvestment, inlineObject4.sustainableInvestment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateAum, corporateEsgPillars, score, sustainableInvestment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    sb.append("    corporateAum: ").append(toIndentedString(corporateAum)).append("\n");
    sb.append("    corporateEsgPillars: ").append(toIndentedString(corporateEsgPillars)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    sustainableInvestment: ").append(toIndentedString(sustainableInvestment)).append("\n");
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

    // add `corporate_aum` to the URL query string
    if (getCorporateAum() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scorporate_aum%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCorporateAum()))));
    }

    // add `corporate_esg_pillars` to the URL query string
    if (getCorporateEsgPillars() != null) {
      for (String _key : getCorporateEsgPillars().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scorporate_esg_pillars%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getCorporateEsgPillars().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getCorporateEsgPillars().get(_key)))));
      }
    }

    // add `score` to the URL query string
    if (getScore() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscore%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScore()))));
    }

    // add `sustainable_investment` to the URL query string
    if (getSustainableInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssustainable_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSustainableInvestment()))));
    }

    return joiner.toString();
  }
}

