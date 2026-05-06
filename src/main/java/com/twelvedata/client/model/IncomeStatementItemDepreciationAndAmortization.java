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
 * Depreciation and amortization information
 */
@JsonPropertyOrder({
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION,
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES,
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_DEPRECIATION,
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_AMORTIZATION,
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_DEPLETION,
  IncomeStatementItemDepreciationAndAmortization.JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION_IN_INCOME_STATEMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemDepreciationAndAmortization {
  public static final String JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION = "depreciation_amortization_depletion";
  @javax.annotation.Nullable
  private Double depreciationAmortizationDepletion;

  public static final String JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES = "amortization_of_intangibles";
  @javax.annotation.Nullable
  private Double amortizationOfIntangibles;

  public static final String JSON_PROPERTY_DEPRECIATION = "depreciation";
  @javax.annotation.Nullable
  private Double depreciation;

  public static final String JSON_PROPERTY_AMORTIZATION = "amortization";
  @javax.annotation.Nullable
  private Double amortization;

  public static final String JSON_PROPERTY_DEPLETION = "depletion";
  @javax.annotation.Nullable
  private Double depletion;

  public static final String JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION_IN_INCOME_STATEMENT = "depreciation_and_amortization_in_income_statement";
  @javax.annotation.Nullable
  private Double depreciationAndAmortizationInIncomeStatement;

  public IncomeStatementItemDepreciationAndAmortization() { 
  }

  public IncomeStatementItemDepreciationAndAmortization depreciationAmortizationDepletion(@javax.annotation.Nullable Double depreciationAmortizationDepletion) {
    this.depreciationAmortizationDepletion = depreciationAmortizationDepletion;
    return this;
  }

  /**
   * Depreciation amortization depletion
   * @return depreciationAmortizationDepletion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciationAmortizationDepletion() {
    return depreciationAmortizationDepletion;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAmortizationDepletion(@javax.annotation.Nullable Double depreciationAmortizationDepletion) {
    this.depreciationAmortizationDepletion = depreciationAmortizationDepletion;
  }


  public IncomeStatementItemDepreciationAndAmortization amortizationOfIntangibles(@javax.annotation.Nullable Double amortizationOfIntangibles) {
    this.amortizationOfIntangibles = amortizationOfIntangibles;
    return this;
  }

  /**
   * Amortization of intangibles
   * @return amortizationOfIntangibles
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmortizationOfIntangibles() {
    return amortizationOfIntangibles;
  }


  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION_OF_INTANGIBLES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmortizationOfIntangibles(@javax.annotation.Nullable Double amortizationOfIntangibles) {
    this.amortizationOfIntangibles = amortizationOfIntangibles;
  }


  public IncomeStatementItemDepreciationAndAmortization depreciation(@javax.annotation.Nullable Double depreciation) {
    this.depreciation = depreciation;
    return this;
  }

  /**
   * Depreciation
   * @return depreciation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciation() {
    return depreciation;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciation(@javax.annotation.Nullable Double depreciation) {
    this.depreciation = depreciation;
  }


  public IncomeStatementItemDepreciationAndAmortization amortization(@javax.annotation.Nullable Double amortization) {
    this.amortization = amortization;
    return this;
  }

  /**
   * Amortization
   * @return amortization
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAmortization() {
    return amortization;
  }


  @JsonProperty(value = JSON_PROPERTY_AMORTIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmortization(@javax.annotation.Nullable Double amortization) {
    this.amortization = amortization;
  }


  public IncomeStatementItemDepreciationAndAmortization depletion(@javax.annotation.Nullable Double depletion) {
    this.depletion = depletion;
    return this;
  }

  /**
   * Depletion
   * @return depletion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepletion() {
    return depletion;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepletion(@javax.annotation.Nullable Double depletion) {
    this.depletion = depletion;
  }


  public IncomeStatementItemDepreciationAndAmortization depreciationAndAmortizationInIncomeStatement(@javax.annotation.Nullable Double depreciationAndAmortizationInIncomeStatement) {
    this.depreciationAndAmortizationInIncomeStatement = depreciationAndAmortizationInIncomeStatement;
    return this;
  }

  /**
   * Depreciation and amortization in income statement
   * @return depreciationAndAmortizationInIncomeStatement
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION_IN_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciationAndAmortizationInIncomeStatement() {
    return depreciationAndAmortizationInIncomeStatement;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AND_AMORTIZATION_IN_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAndAmortizationInIncomeStatement(@javax.annotation.Nullable Double depreciationAndAmortizationInIncomeStatement) {
    this.depreciationAndAmortizationInIncomeStatement = depreciationAndAmortizationInIncomeStatement;
  }


  /**
   * Return true if this IncomeStatementItem_depreciation_and_amortization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemDepreciationAndAmortization incomeStatementItemDepreciationAndAmortization = (IncomeStatementItemDepreciationAndAmortization) o;
    return Objects.equals(this.depreciationAmortizationDepletion, incomeStatementItemDepreciationAndAmortization.depreciationAmortizationDepletion) &&
        Objects.equals(this.amortizationOfIntangibles, incomeStatementItemDepreciationAndAmortization.amortizationOfIntangibles) &&
        Objects.equals(this.depreciation, incomeStatementItemDepreciationAndAmortization.depreciation) &&
        Objects.equals(this.amortization, incomeStatementItemDepreciationAndAmortization.amortization) &&
        Objects.equals(this.depletion, incomeStatementItemDepreciationAndAmortization.depletion) &&
        Objects.equals(this.depreciationAndAmortizationInIncomeStatement, incomeStatementItemDepreciationAndAmortization.depreciationAndAmortizationInIncomeStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depreciationAmortizationDepletion, amortizationOfIntangibles, depreciation, amortization, depletion, depreciationAndAmortizationInIncomeStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemDepreciationAndAmortization {\n");
    sb.append("    depreciationAmortizationDepletion: ").append(toIndentedString(depreciationAmortizationDepletion)).append("\n");
    sb.append("    amortizationOfIntangibles: ").append(toIndentedString(amortizationOfIntangibles)).append("\n");
    sb.append("    depreciation: ").append(toIndentedString(depreciation)).append("\n");
    sb.append("    amortization: ").append(toIndentedString(amortization)).append("\n");
    sb.append("    depletion: ").append(toIndentedString(depletion)).append("\n");
    sb.append("    depreciationAndAmortizationInIncomeStatement: ").append(toIndentedString(depreciationAndAmortizationInIncomeStatement)).append("\n");
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

    // add `depreciation_amortization_depletion` to the URL query string
    if (getDepreciationAmortizationDepletion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation_amortization_depletion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciationAmortizationDepletion()))));
    }

    // add `amortization_of_intangibles` to the URL query string
    if (getAmortizationOfIntangibles() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samortization_of_intangibles%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmortizationOfIntangibles()))));
    }

    // add `depreciation` to the URL query string
    if (getDepreciation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciation()))));
    }

    // add `amortization` to the URL query string
    if (getAmortization() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samortization%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmortization()))));
    }

    // add `depletion` to the URL query string
    if (getDepletion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepletion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepletion()))));
    }

    // add `depreciation_and_amortization_in_income_statement` to the URL query string
    if (getDepreciationAndAmortizationInIncomeStatement() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation_and_amortization_in_income_statement%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciationAndAmortizationInIncomeStatement()))));
    }

    return joiner.toString();
  }
}

