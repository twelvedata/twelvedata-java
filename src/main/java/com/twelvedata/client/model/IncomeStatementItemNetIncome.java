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
 * Net income information
 */
@JsonPropertyOrder({
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_VALUE,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_COMMON_STOCKHOLDERS,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_INCLUDING_NONCONTROLLING_INTERESTS,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_FROM_TAX_LOSS_CARRYFORWARD,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_EXTRAORDINARY,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_DISCONTINUOUS_OPERATIONS,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATION_NET_MINORITY_INTEREST,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_AND_DISCONTINUED_OPERATION,
  IncomeStatementItemNetIncome.JSON_PROPERTY_NORMALIZED_INCOME,
  IncomeStatementItemNetIncome.JSON_PROPERTY_MINORITY_INTERESTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemNetIncome {
  public static final String JSON_PROPERTY_NET_INCOME_VALUE = "net_income_value";
  @javax.annotation.Nullable
  private Double netIncomeValue;

  public static final String JSON_PROPERTY_NET_INCOME_COMMON_STOCKHOLDERS = "net_income_common_stockholders";
  @javax.annotation.Nullable
  private Double netIncomeCommonStockholders;

  public static final String JSON_PROPERTY_NET_INCOME_INCLUDING_NONCONTROLLING_INTERESTS = "net_income_including_noncontrolling_interests";
  @javax.annotation.Nullable
  private Double netIncomeIncludingNoncontrollingInterests;

  public static final String JSON_PROPERTY_NET_INCOME_FROM_TAX_LOSS_CARRYFORWARD = "net_income_from_tax_loss_carryforward";
  @javax.annotation.Nullable
  private Double netIncomeFromTaxLossCarryforward;

  public static final String JSON_PROPERTY_NET_INCOME_EXTRAORDINARY = "net_income_extraordinary";
  @javax.annotation.Nullable
  private Double netIncomeExtraordinary;

  public static final String JSON_PROPERTY_NET_INCOME_DISCONTINUOUS_OPERATIONS = "net_income_discontinuous_operations";
  @javax.annotation.Nullable
  private Double netIncomeDiscontinuousOperations;

  public static final String JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS = "net_income_continuous_operations";
  @javax.annotation.Nullable
  private Double netIncomeContinuousOperations;

  public static final String JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATION_NET_MINORITY_INTEREST = "net_income_from_continuing_operation_net_minority_interest";
  @javax.annotation.Nullable
  private Double netIncomeFromContinuingOperationNetMinorityInterest;

  public static final String JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_AND_DISCONTINUED_OPERATION = "net_income_from_continuing_and_discontinued_operation";
  @javax.annotation.Nullable
  private Double netIncomeFromContinuingAndDiscontinuedOperation;

  public static final String JSON_PROPERTY_NORMALIZED_INCOME = "normalized_income";
  @javax.annotation.Nullable
  private Double normalizedIncome;

  public static final String JSON_PROPERTY_MINORITY_INTERESTS = "minority_interests";
  @javax.annotation.Nullable
  private Double minorityInterests;

  public IncomeStatementItemNetIncome() { 
  }

  public IncomeStatementItemNetIncome netIncomeValue(@javax.annotation.Nullable Double netIncomeValue) {
    this.netIncomeValue = netIncomeValue;
    return this;
  }

  /**
   * Net income value
   * @return netIncomeValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeValue() {
    return netIncomeValue;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeValue(@javax.annotation.Nullable Double netIncomeValue) {
    this.netIncomeValue = netIncomeValue;
  }


  public IncomeStatementItemNetIncome netIncomeCommonStockholders(@javax.annotation.Nullable Double netIncomeCommonStockholders) {
    this.netIncomeCommonStockholders = netIncomeCommonStockholders;
    return this;
  }

  /**
   * Net income common stockholders
   * @return netIncomeCommonStockholders
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_COMMON_STOCKHOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeCommonStockholders() {
    return netIncomeCommonStockholders;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_COMMON_STOCKHOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeCommonStockholders(@javax.annotation.Nullable Double netIncomeCommonStockholders) {
    this.netIncomeCommonStockholders = netIncomeCommonStockholders;
  }


  public IncomeStatementItemNetIncome netIncomeIncludingNoncontrollingInterests(@javax.annotation.Nullable Double netIncomeIncludingNoncontrollingInterests) {
    this.netIncomeIncludingNoncontrollingInterests = netIncomeIncludingNoncontrollingInterests;
    return this;
  }

  /**
   * Net income including noncontrolling interests
   * @return netIncomeIncludingNoncontrollingInterests
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_INCLUDING_NONCONTROLLING_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeIncludingNoncontrollingInterests() {
    return netIncomeIncludingNoncontrollingInterests;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_INCLUDING_NONCONTROLLING_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeIncludingNoncontrollingInterests(@javax.annotation.Nullable Double netIncomeIncludingNoncontrollingInterests) {
    this.netIncomeIncludingNoncontrollingInterests = netIncomeIncludingNoncontrollingInterests;
  }


  public IncomeStatementItemNetIncome netIncomeFromTaxLossCarryforward(@javax.annotation.Nullable Double netIncomeFromTaxLossCarryforward) {
    this.netIncomeFromTaxLossCarryforward = netIncomeFromTaxLossCarryforward;
    return this;
  }

  /**
   * Net income from tax loss carryforward
   * @return netIncomeFromTaxLossCarryforward
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_TAX_LOSS_CARRYFORWARD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeFromTaxLossCarryforward() {
    return netIncomeFromTaxLossCarryforward;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_TAX_LOSS_CARRYFORWARD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeFromTaxLossCarryforward(@javax.annotation.Nullable Double netIncomeFromTaxLossCarryforward) {
    this.netIncomeFromTaxLossCarryforward = netIncomeFromTaxLossCarryforward;
  }


  public IncomeStatementItemNetIncome netIncomeExtraordinary(@javax.annotation.Nullable Double netIncomeExtraordinary) {
    this.netIncomeExtraordinary = netIncomeExtraordinary;
    return this;
  }

  /**
   * Net income extraordinary
   * @return netIncomeExtraordinary
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeExtraordinary() {
    return netIncomeExtraordinary;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_EXTRAORDINARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeExtraordinary(@javax.annotation.Nullable Double netIncomeExtraordinary) {
    this.netIncomeExtraordinary = netIncomeExtraordinary;
  }


  public IncomeStatementItemNetIncome netIncomeDiscontinuousOperations(@javax.annotation.Nullable Double netIncomeDiscontinuousOperations) {
    this.netIncomeDiscontinuousOperations = netIncomeDiscontinuousOperations;
    return this;
  }

  /**
   * Net income discontinuous operations
   * @return netIncomeDiscontinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeDiscontinuousOperations() {
    return netIncomeDiscontinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_DISCONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeDiscontinuousOperations(@javax.annotation.Nullable Double netIncomeDiscontinuousOperations) {
    this.netIncomeDiscontinuousOperations = netIncomeDiscontinuousOperations;
  }


  public IncomeStatementItemNetIncome netIncomeContinuousOperations(@javax.annotation.Nullable Double netIncomeContinuousOperations) {
    this.netIncomeContinuousOperations = netIncomeContinuousOperations;
    return this;
  }

  /**
   * Net income continuous operations
   * @return netIncomeContinuousOperations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeContinuousOperations() {
    return netIncomeContinuousOperations;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_CONTINUOUS_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeContinuousOperations(@javax.annotation.Nullable Double netIncomeContinuousOperations) {
    this.netIncomeContinuousOperations = netIncomeContinuousOperations;
  }


  public IncomeStatementItemNetIncome netIncomeFromContinuingOperationNetMinorityInterest(@javax.annotation.Nullable Double netIncomeFromContinuingOperationNetMinorityInterest) {
    this.netIncomeFromContinuingOperationNetMinorityInterest = netIncomeFromContinuingOperationNetMinorityInterest;
    return this;
  }

  /**
   * Net income from continuing operation net minority interest
   * @return netIncomeFromContinuingOperationNetMinorityInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATION_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeFromContinuingOperationNetMinorityInterest() {
    return netIncomeFromContinuingOperationNetMinorityInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_OPERATION_NET_MINORITY_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeFromContinuingOperationNetMinorityInterest(@javax.annotation.Nullable Double netIncomeFromContinuingOperationNetMinorityInterest) {
    this.netIncomeFromContinuingOperationNetMinorityInterest = netIncomeFromContinuingOperationNetMinorityInterest;
  }


  public IncomeStatementItemNetIncome netIncomeFromContinuingAndDiscontinuedOperation(@javax.annotation.Nullable Double netIncomeFromContinuingAndDiscontinuedOperation) {
    this.netIncomeFromContinuingAndDiscontinuedOperation = netIncomeFromContinuingAndDiscontinuedOperation;
    return this;
  }

  /**
   * Net income from continuing and discontinued operation
   * @return netIncomeFromContinuingAndDiscontinuedOperation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_AND_DISCONTINUED_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetIncomeFromContinuingAndDiscontinuedOperation() {
    return netIncomeFromContinuingAndDiscontinuedOperation;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INCOME_FROM_CONTINUING_AND_DISCONTINUED_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeFromContinuingAndDiscontinuedOperation(@javax.annotation.Nullable Double netIncomeFromContinuingAndDiscontinuedOperation) {
    this.netIncomeFromContinuingAndDiscontinuedOperation = netIncomeFromContinuingAndDiscontinuedOperation;
  }


  public IncomeStatementItemNetIncome normalizedIncome(@javax.annotation.Nullable Double normalizedIncome) {
    this.normalizedIncome = normalizedIncome;
    return this;
  }

  /**
   * Normalized income
   * @return normalizedIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNormalizedIncome() {
    return normalizedIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedIncome(@javax.annotation.Nullable Double normalizedIncome) {
    this.normalizedIncome = normalizedIncome;
  }


  public IncomeStatementItemNetIncome minorityInterests(@javax.annotation.Nullable Double minorityInterests) {
    this.minorityInterests = minorityInterests;
    return this;
  }

  /**
   * Minority interests
   * @return minorityInterests
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMinorityInterests() {
    return minorityInterests;
  }


  @JsonProperty(value = JSON_PROPERTY_MINORITY_INTERESTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinorityInterests(@javax.annotation.Nullable Double minorityInterests) {
    this.minorityInterests = minorityInterests;
  }


  /**
   * Return true if this IncomeStatementItem_net_income object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemNetIncome incomeStatementItemNetIncome = (IncomeStatementItemNetIncome) o;
    return Objects.equals(this.netIncomeValue, incomeStatementItemNetIncome.netIncomeValue) &&
        Objects.equals(this.netIncomeCommonStockholders, incomeStatementItemNetIncome.netIncomeCommonStockholders) &&
        Objects.equals(this.netIncomeIncludingNoncontrollingInterests, incomeStatementItemNetIncome.netIncomeIncludingNoncontrollingInterests) &&
        Objects.equals(this.netIncomeFromTaxLossCarryforward, incomeStatementItemNetIncome.netIncomeFromTaxLossCarryforward) &&
        Objects.equals(this.netIncomeExtraordinary, incomeStatementItemNetIncome.netIncomeExtraordinary) &&
        Objects.equals(this.netIncomeDiscontinuousOperations, incomeStatementItemNetIncome.netIncomeDiscontinuousOperations) &&
        Objects.equals(this.netIncomeContinuousOperations, incomeStatementItemNetIncome.netIncomeContinuousOperations) &&
        Objects.equals(this.netIncomeFromContinuingOperationNetMinorityInterest, incomeStatementItemNetIncome.netIncomeFromContinuingOperationNetMinorityInterest) &&
        Objects.equals(this.netIncomeFromContinuingAndDiscontinuedOperation, incomeStatementItemNetIncome.netIncomeFromContinuingAndDiscontinuedOperation) &&
        Objects.equals(this.normalizedIncome, incomeStatementItemNetIncome.normalizedIncome) &&
        Objects.equals(this.minorityInterests, incomeStatementItemNetIncome.minorityInterests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netIncomeValue, netIncomeCommonStockholders, netIncomeIncludingNoncontrollingInterests, netIncomeFromTaxLossCarryforward, netIncomeExtraordinary, netIncomeDiscontinuousOperations, netIncomeContinuousOperations, netIncomeFromContinuingOperationNetMinorityInterest, netIncomeFromContinuingAndDiscontinuedOperation, normalizedIncome, minorityInterests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemNetIncome {\n");
    sb.append("    netIncomeValue: ").append(toIndentedString(netIncomeValue)).append("\n");
    sb.append("    netIncomeCommonStockholders: ").append(toIndentedString(netIncomeCommonStockholders)).append("\n");
    sb.append("    netIncomeIncludingNoncontrollingInterests: ").append(toIndentedString(netIncomeIncludingNoncontrollingInterests)).append("\n");
    sb.append("    netIncomeFromTaxLossCarryforward: ").append(toIndentedString(netIncomeFromTaxLossCarryforward)).append("\n");
    sb.append("    netIncomeExtraordinary: ").append(toIndentedString(netIncomeExtraordinary)).append("\n");
    sb.append("    netIncomeDiscontinuousOperations: ").append(toIndentedString(netIncomeDiscontinuousOperations)).append("\n");
    sb.append("    netIncomeContinuousOperations: ").append(toIndentedString(netIncomeContinuousOperations)).append("\n");
    sb.append("    netIncomeFromContinuingOperationNetMinorityInterest: ").append(toIndentedString(netIncomeFromContinuingOperationNetMinorityInterest)).append("\n");
    sb.append("    netIncomeFromContinuingAndDiscontinuedOperation: ").append(toIndentedString(netIncomeFromContinuingAndDiscontinuedOperation)).append("\n");
    sb.append("    normalizedIncome: ").append(toIndentedString(normalizedIncome)).append("\n");
    sb.append("    minorityInterests: ").append(toIndentedString(minorityInterests)).append("\n");
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

    // add `net_income_value` to the URL query string
    if (getNetIncomeValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeValue()))));
    }

    // add `net_income_common_stockholders` to the URL query string
    if (getNetIncomeCommonStockholders() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_common_stockholders%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeCommonStockholders()))));
    }

    // add `net_income_including_noncontrolling_interests` to the URL query string
    if (getNetIncomeIncludingNoncontrollingInterests() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_including_noncontrolling_interests%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeIncludingNoncontrollingInterests()))));
    }

    // add `net_income_from_tax_loss_carryforward` to the URL query string
    if (getNetIncomeFromTaxLossCarryforward() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_from_tax_loss_carryforward%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeFromTaxLossCarryforward()))));
    }

    // add `net_income_extraordinary` to the URL query string
    if (getNetIncomeExtraordinary() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_extraordinary%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeExtraordinary()))));
    }

    // add `net_income_discontinuous_operations` to the URL query string
    if (getNetIncomeDiscontinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_discontinuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeDiscontinuousOperations()))));
    }

    // add `net_income_continuous_operations` to the URL query string
    if (getNetIncomeContinuousOperations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_continuous_operations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeContinuousOperations()))));
    }

    // add `net_income_from_continuing_operation_net_minority_interest` to the URL query string
    if (getNetIncomeFromContinuingOperationNetMinorityInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_from_continuing_operation_net_minority_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeFromContinuingOperationNetMinorityInterest()))));
    }

    // add `net_income_from_continuing_and_discontinued_operation` to the URL query string
    if (getNetIncomeFromContinuingAndDiscontinuedOperation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_income_from_continuing_and_discontinued_operation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetIncomeFromContinuingAndDiscontinuedOperation()))));
    }

    // add `normalized_income` to the URL query string
    if (getNormalizedIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snormalized_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNormalizedIncome()))));
    }

    // add `minority_interests` to the URL query string
    if (getMinorityInterests() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminority_interests%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinorityInterests()))));
    }

    return joiner.toString();
  }
}

