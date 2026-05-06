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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundComposition;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPerformance;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPurchaseInfo;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundRatings;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundRisk;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundSummary;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundSustainability;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund information
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_SUMMARY,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_PERFORMANCE,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_RISK,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_RATINGS,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_COMPOSITION,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_PURCHASE_INFO,
  GetMutualFundsWorld200ResponseMutualFund.JSON_PROPERTY_SUSTAINABILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFund {
  public static final String JSON_PROPERTY_SUMMARY = "summary";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundSummary summary;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundPerformance performance;

  public static final String JSON_PROPERTY_RISK = "risk";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundRisk risk;

  public static final String JSON_PROPERTY_RATINGS = "ratings";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundRatings ratings;

  public static final String JSON_PROPERTY_COMPOSITION = "composition";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundComposition composition;

  public static final String JSON_PROPERTY_PURCHASE_INFO = "purchase_info";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundPurchaseInfo purchaseInfo;

  public static final String JSON_PROPERTY_SUSTAINABILITY = "sustainability";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundSustainability sustainability;

  public GetMutualFundsWorld200ResponseMutualFund() { 
  }

  public GetMutualFundsWorld200ResponseMutualFund summary(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSummary summary) {
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
  public GetMutualFundsWorld200ResponseMutualFundSummary getSummary() {
    return summary;
  }


  @JsonProperty(value = JSON_PROPERTY_SUMMARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSummary summary) {
    this.summary = summary;
  }


  public GetMutualFundsWorld200ResponseMutualFund performance(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPerformance performance) {
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
  public GetMutualFundsWorld200ResponseMutualFundPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPerformance performance) {
    this.performance = performance;
  }


  public GetMutualFundsWorld200ResponseMutualFund risk(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRisk risk) {
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
  public GetMutualFundsWorld200ResponseMutualFundRisk getRisk() {
    return risk;
  }


  @JsonProperty(value = JSON_PROPERTY_RISK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRisk(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRisk risk) {
    this.risk = risk;
  }


  public GetMutualFundsWorld200ResponseMutualFund ratings(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRatings ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * Get ratings
   * @return ratings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundRatings getRatings() {
    return ratings;
  }


  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatings(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRatings ratings) {
    this.ratings = ratings;
  }


  public GetMutualFundsWorld200ResponseMutualFund composition(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundComposition composition) {
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
  public GetMutualFundsWorld200ResponseMutualFundComposition getComposition() {
    return composition;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPOSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposition(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundComposition composition) {
    this.composition = composition;
  }


  public GetMutualFundsWorld200ResponseMutualFund purchaseInfo(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
    return this;
  }

  /**
   * Get purchaseInfo
   * @return purchaseInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo getPurchaseInfo() {
    return purchaseInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseInfo(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
  }


  public GetMutualFundsWorld200ResponseMutualFund sustainability(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSustainability sustainability) {
    this.sustainability = sustainability;
    return this;
  }

  /**
   * Get sustainability
   * @return sustainability
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUSTAINABILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundSustainability getSustainability() {
    return sustainability;
  }


  @JsonProperty(value = JSON_PROPERTY_SUSTAINABILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSustainability(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundSustainability sustainability) {
    this.sustainability = sustainability;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFund getMutualFundsWorld200ResponseMutualFund = (GetMutualFundsWorld200ResponseMutualFund) o;
    return Objects.equals(this.summary, getMutualFundsWorld200ResponseMutualFund.summary) &&
        Objects.equals(this.performance, getMutualFundsWorld200ResponseMutualFund.performance) &&
        Objects.equals(this.risk, getMutualFundsWorld200ResponseMutualFund.risk) &&
        Objects.equals(this.ratings, getMutualFundsWorld200ResponseMutualFund.ratings) &&
        Objects.equals(this.composition, getMutualFundsWorld200ResponseMutualFund.composition) &&
        Objects.equals(this.purchaseInfo, getMutualFundsWorld200ResponseMutualFund.purchaseInfo) &&
        Objects.equals(this.sustainability, getMutualFundsWorld200ResponseMutualFund.sustainability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, performance, risk, ratings, composition, purchaseInfo, sustainability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFund {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
    sb.append("    purchaseInfo: ").append(toIndentedString(purchaseInfo)).append("\n");
    sb.append("    sustainability: ").append(toIndentedString(sustainability)).append("\n");
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

    // add `ratings` to the URL query string
    if (getRatings() != null) {
      joiner.add(getRatings().toUrlQueryString(prefix + "ratings" + suffix));
    }

    // add `composition` to the URL query string
    if (getComposition() != null) {
      joiner.add(getComposition().toUrlQueryString(prefix + "composition" + suffix));
    }

    // add `purchase_info` to the URL query string
    if (getPurchaseInfo() != null) {
      joiner.add(getPurchaseInfo().toUrlQueryString(prefix + "purchase_info" + suffix));
    }

    // add `sustainability` to the URL query string
    if (getSustainability() != null) {
      joiner.add(getSustainability().toUrlQueryString(prefix + "sustainability" + suffix));
    }

    return joiner.toString();
  }
}

