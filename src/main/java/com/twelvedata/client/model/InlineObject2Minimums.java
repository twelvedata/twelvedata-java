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
 * InlineObject2Minimums
 */
@JsonPropertyOrder({
  InlineObject2Minimums.JSON_PROPERTY_ADDITIONAL_INVESTMENT,
  InlineObject2Minimums.JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT,
  InlineObject2Minimums.JSON_PROPERTY_INITIAL_INVESTMENT,
  InlineObject2Minimums.JSON_PROPERTY_INITIAL_IRA_INVESTMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject2Minimums {
  public static final String JSON_PROPERTY_ADDITIONAL_INVESTMENT = "additional_investment";
  @javax.annotation.Nullable
  private Long additionalInvestment;

  public static final String JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT = "additional_ira_investment";
  @javax.annotation.Nullable
  private Object additionalIraInvestment;

  public static final String JSON_PROPERTY_INITIAL_INVESTMENT = "initial_investment";
  @javax.annotation.Nullable
  private Long initialInvestment;

  public static final String JSON_PROPERTY_INITIAL_IRA_INVESTMENT = "initial_ira_investment";
  @javax.annotation.Nullable
  private Object initialIraInvestment;

  public InlineObject2Minimums() { 
  }

  public InlineObject2Minimums additionalInvestment(@javax.annotation.Nullable Long additionalInvestment) {
    this.additionalInvestment = additionalInvestment;
    return this;
  }

  /**
   * Get additionalInvestment
   * @return additionalInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAdditionalInvestment() {
    return additionalInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInvestment(@javax.annotation.Nullable Long additionalInvestment) {
    this.additionalInvestment = additionalInvestment;
  }


  public InlineObject2Minimums additionalIraInvestment(@javax.annotation.Nullable Object additionalIraInvestment) {
    this.additionalIraInvestment = additionalIraInvestment;
    return this;
  }

  /**
   * Get additionalIraInvestment
   * @return additionalIraInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getAdditionalIraInvestment() {
    return additionalIraInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalIraInvestment(@javax.annotation.Nullable Object additionalIraInvestment) {
    this.additionalIraInvestment = additionalIraInvestment;
  }


  public InlineObject2Minimums initialInvestment(@javax.annotation.Nullable Long initialInvestment) {
    this.initialInvestment = initialInvestment;
    return this;
  }

  /**
   * Get initialInvestment
   * @return initialInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INITIAL_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInitialInvestment() {
    return initialInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_INITIAL_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialInvestment(@javax.annotation.Nullable Long initialInvestment) {
    this.initialInvestment = initialInvestment;
  }


  public InlineObject2Minimums initialIraInvestment(@javax.annotation.Nullable Object initialIraInvestment) {
    this.initialIraInvestment = initialIraInvestment;
    return this;
  }

  /**
   * Get initialIraInvestment
   * @return initialIraInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INITIAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getInitialIraInvestment() {
    return initialIraInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_INITIAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialIraInvestment(@javax.annotation.Nullable Object initialIraInvestment) {
    this.initialIraInvestment = initialIraInvestment;
  }


  /**
   * Return true if this inline_object_2_minimums object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2Minimums inlineObject2Minimums = (InlineObject2Minimums) o;
    return Objects.equals(this.additionalInvestment, inlineObject2Minimums.additionalInvestment) &&
        Objects.equals(this.additionalIraInvestment, inlineObject2Minimums.additionalIraInvestment) &&
        Objects.equals(this.initialInvestment, inlineObject2Minimums.initialInvestment) &&
        Objects.equals(this.initialIraInvestment, inlineObject2Minimums.initialIraInvestment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInvestment, additionalIraInvestment, initialInvestment, initialIraInvestment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2Minimums {\n");
    sb.append("    additionalInvestment: ").append(toIndentedString(additionalInvestment)).append("\n");
    sb.append("    additionalIraInvestment: ").append(toIndentedString(additionalIraInvestment)).append("\n");
    sb.append("    initialInvestment: ").append(toIndentedString(initialInvestment)).append("\n");
    sb.append("    initialIraInvestment: ").append(toIndentedString(initialIraInvestment)).append("\n");
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

    // add `additional_investment` to the URL query string
    if (getAdditionalInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInvestment()))));
    }

    // add `additional_ira_investment` to the URL query string
    if (getAdditionalIraInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_ira_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalIraInvestment()))));
    }

    // add `initial_investment` to the URL query string
    if (getInitialInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinitial_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInitialInvestment()))));
    }

    // add `initial_ira_investment` to the URL query string
    if (getInitialIraInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinitial_ira_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInitialIraInvestment()))));
    }

    return joiner.toString();
  }
}

