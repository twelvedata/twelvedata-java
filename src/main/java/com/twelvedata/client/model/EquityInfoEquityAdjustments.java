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
 * Equity adjustments information
 */
@JsonPropertyOrder({
  EquityInfoEquityAdjustments.JSON_PROPERTY_GAINS_LOSSES_NOT_AFFECTING_RETAINED_EARNINGS,
  EquityInfoEquityAdjustments.JSON_PROPERTY_OTHER_EQUITY_ADJUSTMENTS,
  EquityInfoEquityAdjustments.JSON_PROPERTY_FIXED_ASSETS_REVALUATION_RESERVE,
  EquityInfoEquityAdjustments.JSON_PROPERTY_FOREIGN_CURRENCY_TRANSLATION_ADJUSTMENTS,
  EquityInfoEquityAdjustments.JSON_PROPERTY_MINIMUM_PENSION_LIABILITIES,
  EquityInfoEquityAdjustments.JSON_PROPERTY_UNREALIZED_GAIN_LOSS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EquityInfoEquityAdjustments {
  public static final String JSON_PROPERTY_GAINS_LOSSES_NOT_AFFECTING_RETAINED_EARNINGS = "gains_losses_not_affecting_retained_earnings";
  @javax.annotation.Nullable
  private Double gainsLossesNotAffectingRetainedEarnings;

  public static final String JSON_PROPERTY_OTHER_EQUITY_ADJUSTMENTS = "other_equity_adjustments";
  @javax.annotation.Nullable
  private Double otherEquityAdjustments;

  public static final String JSON_PROPERTY_FIXED_ASSETS_REVALUATION_RESERVE = "fixed_assets_revaluation_reserve";
  @javax.annotation.Nullable
  private Double fixedAssetsRevaluationReserve;

  public static final String JSON_PROPERTY_FOREIGN_CURRENCY_TRANSLATION_ADJUSTMENTS = "foreign_currency_translation_adjustments";
  @javax.annotation.Nullable
  private Double foreignCurrencyTranslationAdjustments;

  public static final String JSON_PROPERTY_MINIMUM_PENSION_LIABILITIES = "minimum_pension_liabilities";
  @javax.annotation.Nullable
  private Double minimumPensionLiabilities;

  public static final String JSON_PROPERTY_UNREALIZED_GAIN_LOSS = "unrealized_gain_loss";
  @javax.annotation.Nullable
  private Double unrealizedGainLoss;

  public EquityInfoEquityAdjustments() { 
  }

  public EquityInfoEquityAdjustments gainsLossesNotAffectingRetainedEarnings(@javax.annotation.Nullable Double gainsLossesNotAffectingRetainedEarnings) {
    this.gainsLossesNotAffectingRetainedEarnings = gainsLossesNotAffectingRetainedEarnings;
    return this;
  }

  /**
   * Gains losses not affecting retained earnings
   * @return gainsLossesNotAffectingRetainedEarnings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GAINS_LOSSES_NOT_AFFECTING_RETAINED_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGainsLossesNotAffectingRetainedEarnings() {
    return gainsLossesNotAffectingRetainedEarnings;
  }


  @JsonProperty(value = JSON_PROPERTY_GAINS_LOSSES_NOT_AFFECTING_RETAINED_EARNINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGainsLossesNotAffectingRetainedEarnings(@javax.annotation.Nullable Double gainsLossesNotAffectingRetainedEarnings) {
    this.gainsLossesNotAffectingRetainedEarnings = gainsLossesNotAffectingRetainedEarnings;
  }


  public EquityInfoEquityAdjustments otherEquityAdjustments(@javax.annotation.Nullable Double otherEquityAdjustments) {
    this.otherEquityAdjustments = otherEquityAdjustments;
    return this;
  }

  /**
   * Other equity adjustments
   * @return otherEquityAdjustments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_EQUITY_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherEquityAdjustments() {
    return otherEquityAdjustments;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_EQUITY_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherEquityAdjustments(@javax.annotation.Nullable Double otherEquityAdjustments) {
    this.otherEquityAdjustments = otherEquityAdjustments;
  }


  public EquityInfoEquityAdjustments fixedAssetsRevaluationReserve(@javax.annotation.Nullable Double fixedAssetsRevaluationReserve) {
    this.fixedAssetsRevaluationReserve = fixedAssetsRevaluationReserve;
    return this;
  }

  /**
   * Fixed assets revaluation reserve
   * @return fixedAssetsRevaluationReserve
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIXED_ASSETS_REVALUATION_RESERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFixedAssetsRevaluationReserve() {
    return fixedAssetsRevaluationReserve;
  }


  @JsonProperty(value = JSON_PROPERTY_FIXED_ASSETS_REVALUATION_RESERVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedAssetsRevaluationReserve(@javax.annotation.Nullable Double fixedAssetsRevaluationReserve) {
    this.fixedAssetsRevaluationReserve = fixedAssetsRevaluationReserve;
  }


  public EquityInfoEquityAdjustments foreignCurrencyTranslationAdjustments(@javax.annotation.Nullable Double foreignCurrencyTranslationAdjustments) {
    this.foreignCurrencyTranslationAdjustments = foreignCurrencyTranslationAdjustments;
    return this;
  }

  /**
   * Foreign currency translation adjustments
   * @return foreignCurrencyTranslationAdjustments
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FOREIGN_CURRENCY_TRANSLATION_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getForeignCurrencyTranslationAdjustments() {
    return foreignCurrencyTranslationAdjustments;
  }


  @JsonProperty(value = JSON_PROPERTY_FOREIGN_CURRENCY_TRANSLATION_ADJUSTMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignCurrencyTranslationAdjustments(@javax.annotation.Nullable Double foreignCurrencyTranslationAdjustments) {
    this.foreignCurrencyTranslationAdjustments = foreignCurrencyTranslationAdjustments;
  }


  public EquityInfoEquityAdjustments minimumPensionLiabilities(@javax.annotation.Nullable Double minimumPensionLiabilities) {
    this.minimumPensionLiabilities = minimumPensionLiabilities;
    return this;
  }

  /**
   * Minimum pension liabilities
   * @return minimumPensionLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_PENSION_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinimumPensionLiabilities() {
    return minimumPensionLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_PENSION_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumPensionLiabilities(@javax.annotation.Nullable Double minimumPensionLiabilities) {
    this.minimumPensionLiabilities = minimumPensionLiabilities;
  }


  public EquityInfoEquityAdjustments unrealizedGainLoss(@javax.annotation.Nullable Double unrealizedGainLoss) {
    this.unrealizedGainLoss = unrealizedGainLoss;
    return this;
  }

  /**
   * Unrealized gain loss
   * @return unrealizedGainLoss
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UNREALIZED_GAIN_LOSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUnrealizedGainLoss() {
    return unrealizedGainLoss;
  }


  @JsonProperty(value = JSON_PROPERTY_UNREALIZED_GAIN_LOSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnrealizedGainLoss(@javax.annotation.Nullable Double unrealizedGainLoss) {
    this.unrealizedGainLoss = unrealizedGainLoss;
  }


  /**
   * Return true if this EquityInfo_equity_adjustments object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquityInfoEquityAdjustments equityInfoEquityAdjustments = (EquityInfoEquityAdjustments) o;
    return Objects.equals(this.gainsLossesNotAffectingRetainedEarnings, equityInfoEquityAdjustments.gainsLossesNotAffectingRetainedEarnings) &&
        Objects.equals(this.otherEquityAdjustments, equityInfoEquityAdjustments.otherEquityAdjustments) &&
        Objects.equals(this.fixedAssetsRevaluationReserve, equityInfoEquityAdjustments.fixedAssetsRevaluationReserve) &&
        Objects.equals(this.foreignCurrencyTranslationAdjustments, equityInfoEquityAdjustments.foreignCurrencyTranslationAdjustments) &&
        Objects.equals(this.minimumPensionLiabilities, equityInfoEquityAdjustments.minimumPensionLiabilities) &&
        Objects.equals(this.unrealizedGainLoss, equityInfoEquityAdjustments.unrealizedGainLoss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gainsLossesNotAffectingRetainedEarnings, otherEquityAdjustments, fixedAssetsRevaluationReserve, foreignCurrencyTranslationAdjustments, minimumPensionLiabilities, unrealizedGainLoss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquityInfoEquityAdjustments {\n");
    sb.append("    gainsLossesNotAffectingRetainedEarnings: ").append(toIndentedString(gainsLossesNotAffectingRetainedEarnings)).append("\n");
    sb.append("    otherEquityAdjustments: ").append(toIndentedString(otherEquityAdjustments)).append("\n");
    sb.append("    fixedAssetsRevaluationReserve: ").append(toIndentedString(fixedAssetsRevaluationReserve)).append("\n");
    sb.append("    foreignCurrencyTranslationAdjustments: ").append(toIndentedString(foreignCurrencyTranslationAdjustments)).append("\n");
    sb.append("    minimumPensionLiabilities: ").append(toIndentedString(minimumPensionLiabilities)).append("\n");
    sb.append("    unrealizedGainLoss: ").append(toIndentedString(unrealizedGainLoss)).append("\n");
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

    // add `gains_losses_not_affecting_retained_earnings` to the URL query string
    if (getGainsLossesNotAffectingRetainedEarnings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgains_losses_not_affecting_retained_earnings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGainsLossesNotAffectingRetainedEarnings()))));
    }

    // add `other_equity_adjustments` to the URL query string
    if (getOtherEquityAdjustments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_equity_adjustments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherEquityAdjustments()))));
    }

    // add `fixed_assets_revaluation_reserve` to the URL query string
    if (getFixedAssetsRevaluationReserve() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfixed_assets_revaluation_reserve%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFixedAssetsRevaluationReserve()))));
    }

    // add `foreign_currency_translation_adjustments` to the URL query string
    if (getForeignCurrencyTranslationAdjustments() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforeign_currency_translation_adjustments%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForeignCurrencyTranslationAdjustments()))));
    }

    // add `minimum_pension_liabilities` to the URL query string
    if (getMinimumPensionLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimum_pension_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumPensionLiabilities()))));
    }

    // add `unrealized_gain_loss` to the URL query string
    if (getUnrealizedGainLoss() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunrealized_gain_loss%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnrealizedGainLoss()))));
    }

    return joiner.toString();
  }
}

