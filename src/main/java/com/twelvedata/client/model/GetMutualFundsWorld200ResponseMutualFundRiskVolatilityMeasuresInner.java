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
 * GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_PERIOD,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_ALPHA,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_ALPHA_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_BETA,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_BETA_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_MEAN_ANNUAL_RETURN,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_MEAN_ANNUAL_RETURN_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_R_SQUARED,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_R_SQUARED_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_STD,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_STD_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_SHARPE_RATIO,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_SHARPE_RATIO_CATEGORY,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_TREYNOR_RATIO,
  GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.JSON_PROPERTY_TREYNOR_RATIO_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner {
  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
  private String period;

  public static final String JSON_PROPERTY_ALPHA = "alpha";
  @javax.annotation.Nullable
  private Double alpha;

  public static final String JSON_PROPERTY_ALPHA_CATEGORY = "alpha_category";
  @javax.annotation.Nullable
  private Double alphaCategory;

  public static final String JSON_PROPERTY_BETA = "beta";
  @javax.annotation.Nullable
  private Double beta;

  public static final String JSON_PROPERTY_BETA_CATEGORY = "beta_category";
  @javax.annotation.Nullable
  private Double betaCategory;

  public static final String JSON_PROPERTY_MEAN_ANNUAL_RETURN = "mean_annual_return";
  @javax.annotation.Nullable
  private Double meanAnnualReturn;

  public static final String JSON_PROPERTY_MEAN_ANNUAL_RETURN_CATEGORY = "mean_annual_return_category";
  @javax.annotation.Nullable
  private Double meanAnnualReturnCategory;

  public static final String JSON_PROPERTY_R_SQUARED = "r_squared";
  @javax.annotation.Nullable
  private Double rSquared;

  public static final String JSON_PROPERTY_R_SQUARED_CATEGORY = "r_squared_category";
  @javax.annotation.Nullable
  private Double rSquaredCategory;

  public static final String JSON_PROPERTY_STD = "std";
  @javax.annotation.Nullable
  private Double std;

  public static final String JSON_PROPERTY_STD_CATEGORY = "std_category";
  @javax.annotation.Nullable
  private Double stdCategory;

  public static final String JSON_PROPERTY_SHARPE_RATIO = "sharpe_ratio";
  @javax.annotation.Nullable
  private Double sharpeRatio;

  public static final String JSON_PROPERTY_SHARPE_RATIO_CATEGORY = "sharpe_ratio_category";
  @javax.annotation.Nullable
  private Double sharpeRatioCategory;

  public static final String JSON_PROPERTY_TREYNOR_RATIO = "treynor_ratio";
  @javax.annotation.Nullable
  private Double treynorRatio;

  public static final String JSON_PROPERTY_TREYNOR_RATIO_CATEGORY = "treynor_ratio_category";
  @javax.annotation.Nullable
  private Double treynorRatioCategory;

  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner period(@javax.annotation.Nullable String period) {
    this.period = period;
    return this;
  }

  /**
   * Period of a measure
   * @return period
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(@javax.annotation.Nullable String period) {
    this.period = period;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner alpha(@javax.annotation.Nullable Double alpha) {
    this.alpha = alpha;
    return this;
  }

  /**
   * Alpha score of a fund
   * @return alpha
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALPHA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAlpha() {
    return alpha;
  }


  @JsonProperty(value = JSON_PROPERTY_ALPHA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlpha(@javax.annotation.Nullable Double alpha) {
    this.alpha = alpha;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner alphaCategory(@javax.annotation.Nullable Double alphaCategory) {
    this.alphaCategory = alphaCategory;
    return this;
  }

  /**
   * Average alpha score of a fund&#39;s category
   * @return alphaCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALPHA_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAlphaCategory() {
    return alphaCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_ALPHA_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlphaCategory(@javax.annotation.Nullable Double alphaCategory) {
    this.alphaCategory = alphaCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner beta(@javax.annotation.Nullable Double beta) {
    this.beta = beta;
    return this;
  }

  /**
   * Beta score of a fund
   * @return beta
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BETA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBeta() {
    return beta;
  }


  @JsonProperty(value = JSON_PROPERTY_BETA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeta(@javax.annotation.Nullable Double beta) {
    this.beta = beta;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner betaCategory(@javax.annotation.Nullable Double betaCategory) {
    this.betaCategory = betaCategory;
    return this;
  }

  /**
   * Average beta score of a fund&#39;s category
   * @return betaCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BETA_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBetaCategory() {
    return betaCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_BETA_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaCategory(@javax.annotation.Nullable Double betaCategory) {
    this.betaCategory = betaCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner meanAnnualReturn(@javax.annotation.Nullable Double meanAnnualReturn) {
    this.meanAnnualReturn = meanAnnualReturn;
    return this;
  }

  /**
   * Mean annual return of a fund
   * @return meanAnnualReturn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEAN_ANNUAL_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMeanAnnualReturn() {
    return meanAnnualReturn;
  }


  @JsonProperty(value = JSON_PROPERTY_MEAN_ANNUAL_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeanAnnualReturn(@javax.annotation.Nullable Double meanAnnualReturn) {
    this.meanAnnualReturn = meanAnnualReturn;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner meanAnnualReturnCategory(@javax.annotation.Nullable Double meanAnnualReturnCategory) {
    this.meanAnnualReturnCategory = meanAnnualReturnCategory;
    return this;
  }

  /**
   * Average mean annual return of a fund&#39;s category
   * @return meanAnnualReturnCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEAN_ANNUAL_RETURN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMeanAnnualReturnCategory() {
    return meanAnnualReturnCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_MEAN_ANNUAL_RETURN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeanAnnualReturnCategory(@javax.annotation.Nullable Double meanAnnualReturnCategory) {
    this.meanAnnualReturnCategory = meanAnnualReturnCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner rSquared(@javax.annotation.Nullable Double rSquared) {
    this.rSquared = rSquared;
    return this;
  }

  /**
   * R-squared metric of a fund
   * @return rSquared
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_R_SQUARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getrSquared() {
    return rSquared;
  }


  @JsonProperty(value = JSON_PROPERTY_R_SQUARED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setrSquared(@javax.annotation.Nullable Double rSquared) {
    this.rSquared = rSquared;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner rSquaredCategory(@javax.annotation.Nullable Double rSquaredCategory) {
    this.rSquaredCategory = rSquaredCategory;
    return this;
  }

  /**
   * Average r-squared metric of a fund&#39;s category
   * @return rSquaredCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_R_SQUARED_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getrSquaredCategory() {
    return rSquaredCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_R_SQUARED_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setrSquaredCategory(@javax.annotation.Nullable Double rSquaredCategory) {
    this.rSquaredCategory = rSquaredCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner std(@javax.annotation.Nullable Double std) {
    this.std = std;
    return this;
  }

  /**
   * Standard deviation of a fund
   * @return std
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStd() {
    return std;
  }


  @JsonProperty(value = JSON_PROPERTY_STD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStd(@javax.annotation.Nullable Double std) {
    this.std = std;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner stdCategory(@javax.annotation.Nullable Double stdCategory) {
    this.stdCategory = stdCategory;
    return this;
  }

  /**
   * Average standard deviation of a fund&#39;s category
   * @return stdCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STD_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStdCategory() {
    return stdCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_STD_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStdCategory(@javax.annotation.Nullable Double stdCategory) {
    this.stdCategory = stdCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner sharpeRatio(@javax.annotation.Nullable Double sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
    return this;
  }

  /**
   * Sharpe ratio of a fund
   * @return sharpeRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARPE_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSharpeRatio() {
    return sharpeRatio;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARPE_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharpeRatio(@javax.annotation.Nullable Double sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner sharpeRatioCategory(@javax.annotation.Nullable Double sharpeRatioCategory) {
    this.sharpeRatioCategory = sharpeRatioCategory;
    return this;
  }

  /**
   * Average sharpe ratio of a fund&#39;s category
   * @return sharpeRatioCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARPE_RATIO_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSharpeRatioCategory() {
    return sharpeRatioCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARPE_RATIO_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharpeRatioCategory(@javax.annotation.Nullable Double sharpeRatioCategory) {
    this.sharpeRatioCategory = sharpeRatioCategory;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner treynorRatio(@javax.annotation.Nullable Double treynorRatio) {
    this.treynorRatio = treynorRatio;
    return this;
  }

  /**
   * Treynor ratio of a fund
   * @return treynorRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TREYNOR_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTreynorRatio() {
    return treynorRatio;
  }


  @JsonProperty(value = JSON_PROPERTY_TREYNOR_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTreynorRatio(@javax.annotation.Nullable Double treynorRatio) {
    this.treynorRatio = treynorRatio;
  }


  public GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner treynorRatioCategory(@javax.annotation.Nullable Double treynorRatioCategory) {
    this.treynorRatioCategory = treynorRatioCategory;
    return this;
  }

  /**
   * Average treynor ratio of a fund&#39;s category
   * @return treynorRatioCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TREYNOR_RATIO_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTreynorRatioCategory() {
    return treynorRatioCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_TREYNOR_RATIO_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTreynorRatioCategory(@javax.annotation.Nullable Double treynorRatioCategory) {
    this.treynorRatioCategory = treynorRatioCategory;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_risk_volatility_measures_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner = (GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner) o;
    return Objects.equals(this.period, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.period) &&
        Objects.equals(this.alpha, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.alpha) &&
        Objects.equals(this.alphaCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.alphaCategory) &&
        Objects.equals(this.beta, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.beta) &&
        Objects.equals(this.betaCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.betaCategory) &&
        Objects.equals(this.meanAnnualReturn, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.meanAnnualReturn) &&
        Objects.equals(this.meanAnnualReturnCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.meanAnnualReturnCategory) &&
        Objects.equals(this.rSquared, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.rSquared) &&
        Objects.equals(this.rSquaredCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.rSquaredCategory) &&
        Objects.equals(this.std, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.std) &&
        Objects.equals(this.stdCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.stdCategory) &&
        Objects.equals(this.sharpeRatio, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.sharpeRatio) &&
        Objects.equals(this.sharpeRatioCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.sharpeRatioCategory) &&
        Objects.equals(this.treynorRatio, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.treynorRatio) &&
        Objects.equals(this.treynorRatioCategory, getMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner.treynorRatioCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, alpha, alphaCategory, beta, betaCategory, meanAnnualReturn, meanAnnualReturnCategory, rSquared, rSquaredCategory, std, stdCategory, sharpeRatio, sharpeRatioCategory, treynorRatio, treynorRatioCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundRiskVolatilityMeasuresInner {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    alphaCategory: ").append(toIndentedString(alphaCategory)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    betaCategory: ").append(toIndentedString(betaCategory)).append("\n");
    sb.append("    meanAnnualReturn: ").append(toIndentedString(meanAnnualReturn)).append("\n");
    sb.append("    meanAnnualReturnCategory: ").append(toIndentedString(meanAnnualReturnCategory)).append("\n");
    sb.append("    rSquared: ").append(toIndentedString(rSquared)).append("\n");
    sb.append("    rSquaredCategory: ").append(toIndentedString(rSquaredCategory)).append("\n");
    sb.append("    std: ").append(toIndentedString(std)).append("\n");
    sb.append("    stdCategory: ").append(toIndentedString(stdCategory)).append("\n");
    sb.append("    sharpeRatio: ").append(toIndentedString(sharpeRatio)).append("\n");
    sb.append("    sharpeRatioCategory: ").append(toIndentedString(sharpeRatioCategory)).append("\n");
    sb.append("    treynorRatio: ").append(toIndentedString(treynorRatio)).append("\n");
    sb.append("    treynorRatioCategory: ").append(toIndentedString(treynorRatioCategory)).append("\n");
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPeriod()))));
    }

    // add `alpha` to the URL query string
    if (getAlpha() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salpha%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlpha()))));
    }

    // add `alpha_category` to the URL query string
    if (getAlphaCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salpha_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlphaCategory()))));
    }

    // add `beta` to the URL query string
    if (getBeta() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbeta%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBeta()))));
    }

    // add `beta_category` to the URL query string
    if (getBetaCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbeta_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBetaCategory()))));
    }

    // add `mean_annual_return` to the URL query string
    if (getMeanAnnualReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smean_annual_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMeanAnnualReturn()))));
    }

    // add `mean_annual_return_category` to the URL query string
    if (getMeanAnnualReturnCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smean_annual_return_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMeanAnnualReturnCategory()))));
    }

    // add `r_squared` to the URL query string
    if (getrSquared() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sr_squared%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getrSquared()))));
    }

    // add `r_squared_category` to the URL query string
    if (getrSquaredCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sr_squared_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getrSquaredCategory()))));
    }

    // add `std` to the URL query string
    if (getStd() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstd%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStd()))));
    }

    // add `std_category` to the URL query string
    if (getStdCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstd_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStdCategory()))));
    }

    // add `sharpe_ratio` to the URL query string
    if (getSharpeRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssharpe_ratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSharpeRatio()))));
    }

    // add `sharpe_ratio_category` to the URL query string
    if (getSharpeRatioCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssharpe_ratio_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSharpeRatioCategory()))));
    }

    // add `treynor_ratio` to the URL query string
    if (getTreynorRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%streynor_ratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTreynorRatio()))));
    }

    // add `treynor_ratio_category` to the URL query string
    if (getTreynorRatioCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%streynor_ratio_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTreynorRatioCategory()))));
    }

    return joiner.toString();
  }
}

