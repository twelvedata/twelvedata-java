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
 * Minimum investment amounts required to purchase or add to the mutual fund, including IRA minimums
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.JSON_PROPERTY_INITIAL_INVESTMENT,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.JSON_PROPERTY_ADDITIONAL_INVESTMENT,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.JSON_PROPERTY_INITIAL_IRA_INVESTMENT,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums {
  public static final String JSON_PROPERTY_INITIAL_INVESTMENT = "initial_investment";
  @javax.annotation.Nullable
  private Long initialInvestment;

  public static final String JSON_PROPERTY_ADDITIONAL_INVESTMENT = "additional_investment";
  @javax.annotation.Nullable
  private Long additionalInvestment;

  public static final String JSON_PROPERTY_INITIAL_IRA_INVESTMENT = "initial_ira_investment";
  @javax.annotation.Nullable
  private Long initialIraInvestment;

  public static final String JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT = "additional_ira_investment";
  @javax.annotation.Nullable
  private Long additionalIraInvestment;

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums initialInvestment(@javax.annotation.Nullable Long initialInvestment) {
    this.initialInvestment = initialInvestment;
    return this;
  }

  /**
   * Investment minimum
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


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums additionalInvestment(@javax.annotation.Nullable Long additionalInvestment) {
    this.additionalInvestment = additionalInvestment;
    return this;
  }

  /**
   * Minimum amount of additional investment
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


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums initialIraInvestment(@javax.annotation.Nullable Long initialIraInvestment) {
    this.initialIraInvestment = initialIraInvestment;
    return this;
  }

  /**
   * Investment minimum for IRA
   * @return initialIraInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INITIAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInitialIraInvestment() {
    return initialIraInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_INITIAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialIraInvestment(@javax.annotation.Nullable Long initialIraInvestment) {
    this.initialIraInvestment = initialIraInvestment;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums additionalIraInvestment(@javax.annotation.Nullable Long additionalIraInvestment) {
    this.additionalIraInvestment = additionalIraInvestment;
    return this;
  }

  /**
   * Minimum amount of additional investment for IRA
   * @return additionalIraInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAdditionalIraInvestment() {
    return additionalIraInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_IRA_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalIraInvestment(@javax.annotation.Nullable Long additionalIraInvestment) {
    this.additionalIraInvestment = additionalIraInvestment;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_purchase_info_minimums object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums getMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums = (GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums) o;
    return Objects.equals(this.initialInvestment, getMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.initialInvestment) &&
        Objects.equals(this.additionalInvestment, getMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.additionalInvestment) &&
        Objects.equals(this.initialIraInvestment, getMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.initialIraInvestment) &&
        Objects.equals(this.additionalIraInvestment, getMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums.additionalIraInvestment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialInvestment, additionalInvestment, initialIraInvestment, additionalIraInvestment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums {\n");
    sb.append("    initialInvestment: ").append(toIndentedString(initialInvestment)).append("\n");
    sb.append("    additionalInvestment: ").append(toIndentedString(additionalInvestment)).append("\n");
    sb.append("    initialIraInvestment: ").append(toIndentedString(initialIraInvestment)).append("\n");
    sb.append("    additionalIraInvestment: ").append(toIndentedString(additionalIraInvestment)).append("\n");
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

    // add `initial_investment` to the URL query string
    if (getInitialInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinitial_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInitialInvestment()))));
    }

    // add `additional_investment` to the URL query string
    if (getAdditionalInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInvestment()))));
    }

    // add `initial_ira_investment` to the URL query string
    if (getInitialIraInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinitial_ira_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInitialIraInvestment()))));
    }

    // add `additional_ira_investment` to the URL query string
    if (getAdditionalIraInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditional_ira_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalIraInvestment()))));
    }

    return joiner.toString();
  }
}

