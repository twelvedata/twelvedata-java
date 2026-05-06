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
 * Non-current liabilities section
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_LONG_TERM_PROVISIONS,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_LONG_TERM_DEBT,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_PROVISION_FOR_RISKS_AND_CHARGES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_DEFERRED_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES,
  GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities {
  public static final String JSON_PROPERTY_LONG_TERM_PROVISIONS = "long_term_provisions";
  @javax.annotation.Nullable
  private Double longTermProvisions;

  public static final String JSON_PROPERTY_LONG_TERM_DEBT = "long_term_debt";
  @javax.annotation.Nullable
  private Double longTermDebt;

  public static final String JSON_PROPERTY_PROVISION_FOR_RISKS_AND_CHARGES = "provision_for_risks_and_charges";
  @javax.annotation.Nullable
  private Double provisionForRisksAndCharges;

  public static final String JSON_PROPERTY_DEFERRED_LIABILITIES = "deferred_liabilities";
  @javax.annotation.Nullable
  private Double deferredLiabilities;

  public static final String JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES = "derivative_product_liabilities";
  @javax.annotation.Nullable
  private Double derivativeProductLiabilities;

  public static final String JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES = "other_non_current_liabilities";
  @javax.annotation.Nullable
  private Double otherNonCurrentLiabilities;

  public static final String JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES = "total_non_current_liabilities";
  @javax.annotation.Nullable
  private Double totalNonCurrentLiabilities;

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities longTermProvisions(@javax.annotation.Nullable Double longTermProvisions) {
    this.longTermProvisions = longTermProvisions;
    return this;
  }

  /**
   * Represents money set aside for employee benefits such as gratuity
   * @return longTermProvisions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermProvisions() {
    return longTermProvisions;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_PROVISIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermProvisions(@javax.annotation.Nullable Double longTermProvisions) {
    this.longTermProvisions = longTermProvisions;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities longTermDebt(@javax.annotation.Nullable Double longTermDebt) {
    this.longTermDebt = longTermDebt;
    return this;
  }

  /**
   * Represents amount of outstanding debt that has a maturity of 12 months or longer
   * @return longTermDebt
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLongTermDebt() {
    return longTermDebt;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_TERM_DEBT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTermDebt(@javax.annotation.Nullable Double longTermDebt) {
    this.longTermDebt = longTermDebt;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities provisionForRisksAndCharges(@javax.annotation.Nullable Double provisionForRisksAndCharges) {
    this.provisionForRisksAndCharges = provisionForRisksAndCharges;
    return this;
  }

  /**
   * Represents funds set aside as assets to pay for anticipated future losses
   * @return provisionForRisksAndCharges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_FOR_RISKS_AND_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProvisionForRisksAndCharges() {
    return provisionForRisksAndCharges;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_FOR_RISKS_AND_CHARGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionForRisksAndCharges(@javax.annotation.Nullable Double provisionForRisksAndCharges) {
    this.provisionForRisksAndCharges = provisionForRisksAndCharges;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities deferredLiabilities(@javax.annotation.Nullable Double deferredLiabilities) {
    this.deferredLiabilities = deferredLiabilities;
    return this;
  }

  /**
   * Represents revenue producing activity for which revenue has not yet been recognized, and is not expected to be recognized in the next 12 months
   * @return deferredLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDeferredLiabilities() {
    return deferredLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFERRED_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredLiabilities(@javax.annotation.Nullable Double deferredLiabilities) {
    this.deferredLiabilities = deferredLiabilities;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities derivativeProductLiabilities(@javax.annotation.Nullable Double derivativeProductLiabilities) {
    this.derivativeProductLiabilities = derivativeProductLiabilities;
    return this;
  }

  /**
   * Represents the value of derivative financial instruments that a company has issued
   * @return derivativeProductLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDerivativeProductLiabilities() {
    return derivativeProductLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_DERIVATIVE_PRODUCT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDerivativeProductLiabilities(@javax.annotation.Nullable Double derivativeProductLiabilities) {
    this.derivativeProductLiabilities = derivativeProductLiabilities;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities otherNonCurrentLiabilities(@javax.annotation.Nullable Double otherNonCurrentLiabilities) {
    this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
    return this;
  }

  /**
   * Represents other non-current liabilities
   * @return otherNonCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonCurrentLiabilities() {
    return otherNonCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonCurrentLiabilities(@javax.annotation.Nullable Double otherNonCurrentLiabilities) {
    this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities totalNonCurrentLiabilities(@javax.annotation.Nullable Double totalNonCurrentLiabilities) {
    this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
    return this;
  }

  /**
   * Represents total non-current liabilities
   * @return totalNonCurrentLiabilities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalNonCurrentLiabilities() {
    return totalNonCurrentLiabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_LIABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNonCurrentLiabilities(@javax.annotation.Nullable Double totalNonCurrentLiabilities) {
    this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
  }


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_liabilities_non_current_liabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities = (GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities) o;
    return Objects.equals(this.longTermProvisions, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.longTermProvisions) &&
        Objects.equals(this.longTermDebt, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.longTermDebt) &&
        Objects.equals(this.provisionForRisksAndCharges, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.provisionForRisksAndCharges) &&
        Objects.equals(this.deferredLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.deferredLiabilities) &&
        Objects.equals(this.derivativeProductLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.derivativeProductLiabilities) &&
        Objects.equals(this.otherNonCurrentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.otherNonCurrentLiabilities) &&
        Objects.equals(this.totalNonCurrentLiabilities, getBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities.totalNonCurrentLiabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTermProvisions, longTermDebt, provisionForRisksAndCharges, deferredLiabilities, derivativeProductLiabilities, otherNonCurrentLiabilities, totalNonCurrentLiabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerLiabilitiesNonCurrentLiabilities {\n");
    sb.append("    longTermProvisions: ").append(toIndentedString(longTermProvisions)).append("\n");
    sb.append("    longTermDebt: ").append(toIndentedString(longTermDebt)).append("\n");
    sb.append("    provisionForRisksAndCharges: ").append(toIndentedString(provisionForRisksAndCharges)).append("\n");
    sb.append("    deferredLiabilities: ").append(toIndentedString(deferredLiabilities)).append("\n");
    sb.append("    derivativeProductLiabilities: ").append(toIndentedString(derivativeProductLiabilities)).append("\n");
    sb.append("    otherNonCurrentLiabilities: ").append(toIndentedString(otherNonCurrentLiabilities)).append("\n");
    sb.append("    totalNonCurrentLiabilities: ").append(toIndentedString(totalNonCurrentLiabilities)).append("\n");
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

    // add `long_term_provisions` to the URL query string
    if (getLongTermProvisions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_provisions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermProvisions()))));
    }

    // add `long_term_debt` to the URL query string
    if (getLongTermDebt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong_term_debt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongTermDebt()))));
    }

    // add `provision_for_risks_and_charges` to the URL query string
    if (getProvisionForRisksAndCharges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovision_for_risks_and_charges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionForRisksAndCharges()))));
    }

    // add `deferred_liabilities` to the URL query string
    if (getDeferredLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeferred_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeferredLiabilities()))));
    }

    // add `derivative_product_liabilities` to the URL query string
    if (getDerivativeProductLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sderivative_product_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDerivativeProductLiabilities()))));
    }

    // add `other_non_current_liabilities` to the URL query string
    if (getOtherNonCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCurrentLiabilities()))));
    }

    // add `total_non_current_liabilities` to the URL query string
    if (getTotalNonCurrentLiabilities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_non_current_liabilities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalNonCurrentLiabilities()))));
    }

    return joiner.toString();
  }
}

