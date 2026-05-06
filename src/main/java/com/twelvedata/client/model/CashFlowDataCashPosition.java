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
 * Cash position
 */
@JsonPropertyOrder({
  CashFlowDataCashPosition.JSON_PROPERTY_BEGINNING_CASH_POSITION,
  CashFlowDataCashPosition.JSON_PROPERTY_END_CASH_POSITION,
  CashFlowDataCashPosition.JSON_PROPERTY_CHANGES_IN_CASH,
  CashFlowDataCashPosition.JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_OUTSIDE_CHANGE_IN_CASH,
  CashFlowDataCashPosition.JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_INSIDE_CHANGE_IN_CASH,
  CashFlowDataCashPosition.JSON_PROPERTY_EFFECT_OF_EXCHANGE_RATE_CHANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowDataCashPosition {
  public static final String JSON_PROPERTY_BEGINNING_CASH_POSITION = "beginning_cash_position";
  @javax.annotation.Nullable
  private Double beginningCashPosition;

  public static final String JSON_PROPERTY_END_CASH_POSITION = "end_cash_position";
  @javax.annotation.Nullable
  private Double endCashPosition;

  public static final String JSON_PROPERTY_CHANGES_IN_CASH = "changes_in_cash";
  @javax.annotation.Nullable
  private Double changesInCash;

  public static final String JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_OUTSIDE_CHANGE_IN_CASH = "other_cash_adjustment_outside_change_in_cash";
  @javax.annotation.Nullable
  private Double otherCashAdjustmentOutsideChangeInCash;

  public static final String JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_INSIDE_CHANGE_IN_CASH = "other_cash_adjustment_inside_change_in_cash";
  @javax.annotation.Nullable
  private Double otherCashAdjustmentInsideChangeInCash;

  public static final String JSON_PROPERTY_EFFECT_OF_EXCHANGE_RATE_CHANGES = "effect_of_exchange_rate_changes";
  @javax.annotation.Nullable
  private Double effectOfExchangeRateChanges;

  public CashFlowDataCashPosition() { 
  }

  public CashFlowDataCashPosition beginningCashPosition(@javax.annotation.Nullable Double beginningCashPosition) {
    this.beginningCashPosition = beginningCashPosition;
    return this;
  }

  /**
   * Beginning cash position
   * @return beginningCashPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BEGINNING_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBeginningCashPosition() {
    return beginningCashPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_BEGINNING_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeginningCashPosition(@javax.annotation.Nullable Double beginningCashPosition) {
    this.beginningCashPosition = beginningCashPosition;
  }


  public CashFlowDataCashPosition endCashPosition(@javax.annotation.Nullable Double endCashPosition) {
    this.endCashPosition = endCashPosition;
    return this;
  }

  /**
   * End cash position
   * @return endCashPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEndCashPosition() {
    return endCashPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_END_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndCashPosition(@javax.annotation.Nullable Double endCashPosition) {
    this.endCashPosition = endCashPosition;
  }


  public CashFlowDataCashPosition changesInCash(@javax.annotation.Nullable Double changesInCash) {
    this.changesInCash = changesInCash;
    return this;
  }

  /**
   * Changes in cash
   * @return changesInCash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGES_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChangesInCash() {
    return changesInCash;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGES_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangesInCash(@javax.annotation.Nullable Double changesInCash) {
    this.changesInCash = changesInCash;
  }


  public CashFlowDataCashPosition otherCashAdjustmentOutsideChangeInCash(@javax.annotation.Nullable Double otherCashAdjustmentOutsideChangeInCash) {
    this.otherCashAdjustmentOutsideChangeInCash = otherCashAdjustmentOutsideChangeInCash;
    return this;
  }

  /**
   * Other cash adjustment outside change in cash
   * @return otherCashAdjustmentOutsideChangeInCash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_OUTSIDE_CHANGE_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCashAdjustmentOutsideChangeInCash() {
    return otherCashAdjustmentOutsideChangeInCash;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_OUTSIDE_CHANGE_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCashAdjustmentOutsideChangeInCash(@javax.annotation.Nullable Double otherCashAdjustmentOutsideChangeInCash) {
    this.otherCashAdjustmentOutsideChangeInCash = otherCashAdjustmentOutsideChangeInCash;
  }


  public CashFlowDataCashPosition otherCashAdjustmentInsideChangeInCash(@javax.annotation.Nullable Double otherCashAdjustmentInsideChangeInCash) {
    this.otherCashAdjustmentInsideChangeInCash = otherCashAdjustmentInsideChangeInCash;
    return this;
  }

  /**
   * Other cash adjustment inside change in cash
   * @return otherCashAdjustmentInsideChangeInCash
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_INSIDE_CHANGE_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherCashAdjustmentInsideChangeInCash() {
    return otherCashAdjustmentInsideChangeInCash;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_CASH_ADJUSTMENT_INSIDE_CHANGE_IN_CASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCashAdjustmentInsideChangeInCash(@javax.annotation.Nullable Double otherCashAdjustmentInsideChangeInCash) {
    this.otherCashAdjustmentInsideChangeInCash = otherCashAdjustmentInsideChangeInCash;
  }


  public CashFlowDataCashPosition effectOfExchangeRateChanges(@javax.annotation.Nullable Double effectOfExchangeRateChanges) {
    this.effectOfExchangeRateChanges = effectOfExchangeRateChanges;
    return this;
  }

  /**
   * Effect of exchange rate changes
   * @return effectOfExchangeRateChanges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EFFECT_OF_EXCHANGE_RATE_CHANGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEffectOfExchangeRateChanges() {
    return effectOfExchangeRateChanges;
  }


  @JsonProperty(value = JSON_PROPERTY_EFFECT_OF_EXCHANGE_RATE_CHANGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffectOfExchangeRateChanges(@javax.annotation.Nullable Double effectOfExchangeRateChanges) {
    this.effectOfExchangeRateChanges = effectOfExchangeRateChanges;
  }


  /**
   * Return true if this CashFlowData_cash_position object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowDataCashPosition cashFlowDataCashPosition = (CashFlowDataCashPosition) o;
    return Objects.equals(this.beginningCashPosition, cashFlowDataCashPosition.beginningCashPosition) &&
        Objects.equals(this.endCashPosition, cashFlowDataCashPosition.endCashPosition) &&
        Objects.equals(this.changesInCash, cashFlowDataCashPosition.changesInCash) &&
        Objects.equals(this.otherCashAdjustmentOutsideChangeInCash, cashFlowDataCashPosition.otherCashAdjustmentOutsideChangeInCash) &&
        Objects.equals(this.otherCashAdjustmentInsideChangeInCash, cashFlowDataCashPosition.otherCashAdjustmentInsideChangeInCash) &&
        Objects.equals(this.effectOfExchangeRateChanges, cashFlowDataCashPosition.effectOfExchangeRateChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginningCashPosition, endCashPosition, changesInCash, otherCashAdjustmentOutsideChangeInCash, otherCashAdjustmentInsideChangeInCash, effectOfExchangeRateChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowDataCashPosition {\n");
    sb.append("    beginningCashPosition: ").append(toIndentedString(beginningCashPosition)).append("\n");
    sb.append("    endCashPosition: ").append(toIndentedString(endCashPosition)).append("\n");
    sb.append("    changesInCash: ").append(toIndentedString(changesInCash)).append("\n");
    sb.append("    otherCashAdjustmentOutsideChangeInCash: ").append(toIndentedString(otherCashAdjustmentOutsideChangeInCash)).append("\n");
    sb.append("    otherCashAdjustmentInsideChangeInCash: ").append(toIndentedString(otherCashAdjustmentInsideChangeInCash)).append("\n");
    sb.append("    effectOfExchangeRateChanges: ").append(toIndentedString(effectOfExchangeRateChanges)).append("\n");
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

    // add `beginning_cash_position` to the URL query string
    if (getBeginningCashPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbeginning_cash_position%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBeginningCashPosition()))));
    }

    // add `end_cash_position` to the URL query string
    if (getEndCashPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%send_cash_position%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndCashPosition()))));
    }

    // add `changes_in_cash` to the URL query string
    if (getChangesInCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schanges_in_cash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChangesInCash()))));
    }

    // add `other_cash_adjustment_outside_change_in_cash` to the URL query string
    if (getOtherCashAdjustmentOutsideChangeInCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_cash_adjustment_outside_change_in_cash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCashAdjustmentOutsideChangeInCash()))));
    }

    // add `other_cash_adjustment_inside_change_in_cash` to the URL query string
    if (getOtherCashAdjustmentInsideChangeInCash() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_cash_adjustment_inside_change_in_cash%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherCashAdjustmentInsideChangeInCash()))));
    }

    // add `effect_of_exchange_rate_changes` to the URL query string
    if (getEffectOfExchangeRateChanges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%seffect_of_exchange_rate_changes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEffectOfExchangeRateChanges()))));
    }

    return joiner.toString();
  }
}

