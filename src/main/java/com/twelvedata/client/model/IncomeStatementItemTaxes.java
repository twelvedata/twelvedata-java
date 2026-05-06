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
 * Taxes information
 */
@JsonPropertyOrder({
  IncomeStatementItemTaxes.JSON_PROPERTY_TAX_PROVISION,
  IncomeStatementItemTaxes.JSON_PROPERTY_TAX_EFFECT_OF_UNUSUAL_ITEMS,
  IncomeStatementItemTaxes.JSON_PROPERTY_TAX_RATE_FOR_CALCULATIONS,
  IncomeStatementItemTaxes.JSON_PROPERTY_OTHER_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemTaxes {
  public static final String JSON_PROPERTY_TAX_PROVISION = "tax_provision";
  @javax.annotation.Nullable
  private Double taxProvision;

  public static final String JSON_PROPERTY_TAX_EFFECT_OF_UNUSUAL_ITEMS = "tax_effect_of_unusual_items";
  @javax.annotation.Nullable
  private Double taxEffectOfUnusualItems;

  public static final String JSON_PROPERTY_TAX_RATE_FOR_CALCULATIONS = "tax_rate_for_calculations";
  @javax.annotation.Nullable
  private Double taxRateForCalculations;

  public static final String JSON_PROPERTY_OTHER_TAXES = "other_taxes";
  @javax.annotation.Nullable
  private Double otherTaxes;

  public IncomeStatementItemTaxes() { 
  }

  public IncomeStatementItemTaxes taxProvision(@javax.annotation.Nullable Double taxProvision) {
    this.taxProvision = taxProvision;
    return this;
  }

  /**
   * Tax provision
   * @return taxProvision
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_PROVISION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxProvision() {
    return taxProvision;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_PROVISION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxProvision(@javax.annotation.Nullable Double taxProvision) {
    this.taxProvision = taxProvision;
  }


  public IncomeStatementItemTaxes taxEffectOfUnusualItems(@javax.annotation.Nullable Double taxEffectOfUnusualItems) {
    this.taxEffectOfUnusualItems = taxEffectOfUnusualItems;
    return this;
  }

  /**
   * Tax effect of unusual items
   * @return taxEffectOfUnusualItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_EFFECT_OF_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxEffectOfUnusualItems() {
    return taxEffectOfUnusualItems;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_EFFECT_OF_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxEffectOfUnusualItems(@javax.annotation.Nullable Double taxEffectOfUnusualItems) {
    this.taxEffectOfUnusualItems = taxEffectOfUnusualItems;
  }


  public IncomeStatementItemTaxes taxRateForCalculations(@javax.annotation.Nullable Double taxRateForCalculations) {
    this.taxRateForCalculations = taxRateForCalculations;
    return this;
  }

  /**
   * Tax rate for calculations
   * @return taxRateForCalculations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAX_RATE_FOR_CALCULATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTaxRateForCalculations() {
    return taxRateForCalculations;
  }


  @JsonProperty(value = JSON_PROPERTY_TAX_RATE_FOR_CALCULATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRateForCalculations(@javax.annotation.Nullable Double taxRateForCalculations) {
    this.taxRateForCalculations = taxRateForCalculations;
  }


  public IncomeStatementItemTaxes otherTaxes(@javax.annotation.Nullable Double otherTaxes) {
    this.otherTaxes = otherTaxes;
    return this;
  }

  /**
   * Other taxes
   * @return otherTaxes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherTaxes() {
    return otherTaxes;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_TAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherTaxes(@javax.annotation.Nullable Double otherTaxes) {
    this.otherTaxes = otherTaxes;
  }


  /**
   * Return true if this IncomeStatementItem_taxes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemTaxes incomeStatementItemTaxes = (IncomeStatementItemTaxes) o;
    return Objects.equals(this.taxProvision, incomeStatementItemTaxes.taxProvision) &&
        Objects.equals(this.taxEffectOfUnusualItems, incomeStatementItemTaxes.taxEffectOfUnusualItems) &&
        Objects.equals(this.taxRateForCalculations, incomeStatementItemTaxes.taxRateForCalculations) &&
        Objects.equals(this.otherTaxes, incomeStatementItemTaxes.otherTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxProvision, taxEffectOfUnusualItems, taxRateForCalculations, otherTaxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemTaxes {\n");
    sb.append("    taxProvision: ").append(toIndentedString(taxProvision)).append("\n");
    sb.append("    taxEffectOfUnusualItems: ").append(toIndentedString(taxEffectOfUnusualItems)).append("\n");
    sb.append("    taxRateForCalculations: ").append(toIndentedString(taxRateForCalculations)).append("\n");
    sb.append("    otherTaxes: ").append(toIndentedString(otherTaxes)).append("\n");
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

    // add `tax_provision` to the URL query string
    if (getTaxProvision() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_provision%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxProvision()))));
    }

    // add `tax_effect_of_unusual_items` to the URL query string
    if (getTaxEffectOfUnusualItems() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_effect_of_unusual_items%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxEffectOfUnusualItems()))));
    }

    // add `tax_rate_for_calculations` to the URL query string
    if (getTaxRateForCalculations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stax_rate_for_calculations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTaxRateForCalculations()))));
    }

    // add `other_taxes` to the URL query string
    if (getOtherTaxes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_taxes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherTaxes()))));
    }

    return joiner.toString();
  }
}

