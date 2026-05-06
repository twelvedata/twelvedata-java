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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Risk metrics of a mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundRisk.JSON_PROPERTY_VOLATILITY_MEASURES,
  GetMutualFundsWorld200ResponseMutualFundRisk.JSON_PROPERTY_VALUATION_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundRisk {
  public static final String JSON_PROPERTY_VOLATILITY_MEASURES = "volatility_measures";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner> volatilityMeasures = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUATION_METRICS = "valuation_metrics";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics valuationMetrics;

  public GetMutualFundsWorld200ResponseMutualFundRisk() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundRisk volatilityMeasures(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner> volatilityMeasures) {
    this.volatilityMeasures = volatilityMeasures;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundRisk addVolatilityMeasuresItem(GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner volatilityMeasuresItem) {
    if (this.volatilityMeasures == null) {
      this.volatilityMeasures = new ArrayList<>();
    }
    this.volatilityMeasures.add(volatilityMeasuresItem);
    return this;
  }

  /**
   * Volatility statistics of the fund
   * @return volatilityMeasures
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VOLATILITY_MEASURES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner> getVolatilityMeasures() {
    return volatilityMeasures;
  }


  @JsonProperty(value = JSON_PROPERTY_VOLATILITY_MEASURES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatilityMeasures(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner> volatilityMeasures) {
    this.volatilityMeasures = volatilityMeasures;
  }


  public GetMutualFundsWorld200ResponseMutualFundRisk valuationMetrics(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics valuationMetrics) {
    this.valuationMetrics = valuationMetrics;
    return this;
  }

  /**
   * Get valuationMetrics
   * @return valuationMetrics
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUATION_METRICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics getValuationMetrics() {
    return valuationMetrics;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUATION_METRICS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValuationMetrics(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundRiskValuationMetrics valuationMetrics) {
    this.valuationMetrics = valuationMetrics;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_risk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundRisk getMutualFundsWorld200ResponseMutualFundRisk = (GetMutualFundsWorld200ResponseMutualFundRisk) o;
    return Objects.equals(this.volatilityMeasures, getMutualFundsWorld200ResponseMutualFundRisk.volatilityMeasures) &&
        Objects.equals(this.valuationMetrics, getMutualFundsWorld200ResponseMutualFundRisk.valuationMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volatilityMeasures, valuationMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundRisk {\n");
    sb.append("    volatilityMeasures: ").append(toIndentedString(volatilityMeasures)).append("\n");
    sb.append("    valuationMetrics: ").append(toIndentedString(valuationMetrics)).append("\n");
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

    // add `volatility_measures` to the URL query string
    if (getVolatilityMeasures() != null) {
      for (int i = 0; i < getVolatilityMeasures().size(); i++) {
        if (getVolatilityMeasures().get(i) != null) {
          joiner.add(getVolatilityMeasures().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%svolatility_measures%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `valuation_metrics` to the URL query string
    if (getValuationMetrics() != null) {
      joiner.add(getValuationMetrics().toUrlQueryString(prefix + "valuation_metrics" + suffix));
    }

    return joiner.toString();
  }
}

