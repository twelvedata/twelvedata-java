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
import com.twelvedata.client.model.CashFlowStructFinancingActivities;
import com.twelvedata.client.model.CashFlowStructInvestingActivities;
import com.twelvedata.client.model.CashFlowStructOperatingActivities;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * CashFlowStruct
 */
@JsonPropertyOrder({
  CashFlowStruct.JSON_PROPERTY_FISCAL_DATE,
  CashFlowStruct.JSON_PROPERTY_QUARTER,
  CashFlowStruct.JSON_PROPERTY_YEAR,
  CashFlowStruct.JSON_PROPERTY_OPERATING_ACTIVITIES,
  CashFlowStruct.JSON_PROPERTY_INVESTING_ACTIVITIES,
  CashFlowStruct.JSON_PROPERTY_FINANCING_ACTIVITIES,
  CashFlowStruct.JSON_PROPERTY_END_CASH_POSITION,
  CashFlowStruct.JSON_PROPERTY_INCOME_TAX_PAID,
  CashFlowStruct.JSON_PROPERTY_INTEREST_PAID,
  CashFlowStruct.JSON_PROPERTY_FREE_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowStruct {
  public static final String JSON_PROPERTY_FISCAL_DATE = "fiscal_date";
  @javax.annotation.Nonnull
  private String fiscalDate;

  public static final String JSON_PROPERTY_QUARTER = "quarter";
  @javax.annotation.Nullable
  private String quarter;

  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Long year;

  public static final String JSON_PROPERTY_OPERATING_ACTIVITIES = "operating_activities";
  @javax.annotation.Nullable
  private CashFlowStructOperatingActivities operatingActivities;

  public static final String JSON_PROPERTY_INVESTING_ACTIVITIES = "investing_activities";
  @javax.annotation.Nullable
  private CashFlowStructInvestingActivities investingActivities;

  public static final String JSON_PROPERTY_FINANCING_ACTIVITIES = "financing_activities";
  @javax.annotation.Nullable
  private CashFlowStructFinancingActivities financingActivities;

  public static final String JSON_PROPERTY_END_CASH_POSITION = "end_cash_position";
  @javax.annotation.Nullable
  private Double endCashPosition;

  public static final String JSON_PROPERTY_INCOME_TAX_PAID = "income_tax_paid";
  @javax.annotation.Nullable
  private Double incomeTaxPaid;

  public static final String JSON_PROPERTY_INTEREST_PAID = "interest_paid";
  @javax.annotation.Nullable
  private Double interestPaid;

  public static final String JSON_PROPERTY_FREE_CASH_FLOW = "free_cash_flow";
  @javax.annotation.Nullable
  private Double freeCashFlow;

  public CashFlowStruct() { 
  }

  public CashFlowStruct fiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
    return this;
  }

  /**
   * Date of fiscal period ending
   * @return fiscalDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFiscalDate() {
    return fiscalDate;
  }


  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
  }


  public CashFlowStruct quarter(@javax.annotation.Nullable String quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * Fiscal quarter. Visible when &#x60;&amp;period&#x3D;quarterly&#x60;
   * @return quarter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuarter() {
    return quarter;
  }


  @JsonProperty(value = JSON_PROPERTY_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuarter(@javax.annotation.Nullable String quarter) {
    this.quarter = quarter;
  }


  public CashFlowStruct year(@javax.annotation.Nullable Long year) {
    this.year = year;
    return this;
  }

  /**
   * Fiscal year
   * @return year
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getYear() {
    return year;
  }


  @JsonProperty(value = JSON_PROPERTY_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(@javax.annotation.Nullable Long year) {
    this.year = year;
  }


  public CashFlowStruct operatingActivities(@javax.annotation.Nullable CashFlowStructOperatingActivities operatingActivities) {
    this.operatingActivities = operatingActivities;
    return this;
  }

  /**
   * Get operatingActivities
   * @return operatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowStructOperatingActivities getOperatingActivities() {
    return operatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingActivities(@javax.annotation.Nullable CashFlowStructOperatingActivities operatingActivities) {
    this.operatingActivities = operatingActivities;
  }


  public CashFlowStruct investingActivities(@javax.annotation.Nullable CashFlowStructInvestingActivities investingActivities) {
    this.investingActivities = investingActivities;
    return this;
  }

  /**
   * Get investingActivities
   * @return investingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowStructInvestingActivities getInvestingActivities() {
    return investingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestingActivities(@javax.annotation.Nullable CashFlowStructInvestingActivities investingActivities) {
    this.investingActivities = investingActivities;
  }


  public CashFlowStruct financingActivities(@javax.annotation.Nullable CashFlowStructFinancingActivities financingActivities) {
    this.financingActivities = financingActivities;
    return this;
  }

  /**
   * Get financingActivities
   * @return financingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowStructFinancingActivities getFinancingActivities() {
    return financingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingActivities(@javax.annotation.Nullable CashFlowStructFinancingActivities financingActivities) {
    this.financingActivities = financingActivities;
  }


  public CashFlowStruct endCashPosition(@javax.annotation.Nullable Double endCashPosition) {
    this.endCashPosition = endCashPosition;
    return this;
  }

  /**
   * Returns the amount of cash a company has when adding the change in cash and beginning cash balance for the current fiscal period
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


  public CashFlowStruct incomeTaxPaid(@javax.annotation.Nullable Double incomeTaxPaid) {
    this.incomeTaxPaid = incomeTaxPaid;
    return this;
  }

  /**
   * Refers to supplemental data about income tax paid
   * @return incomeTaxPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIncomeTaxPaid() {
    return incomeTaxPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_TAX_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeTaxPaid(@javax.annotation.Nullable Double incomeTaxPaid) {
    this.incomeTaxPaid = incomeTaxPaid;
  }


  public CashFlowStruct interestPaid(@javax.annotation.Nullable Double interestPaid) {
    this.interestPaid = interestPaid;
    return this;
  }

  /**
   * Refers to supplemental data about interest paid
   * @return interestPaid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestPaid() {
    return interestPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestPaid(@javax.annotation.Nullable Double interestPaid) {
    this.interestPaid = interestPaid;
  }


  public CashFlowStruct freeCashFlow(@javax.annotation.Nullable Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
    return this;
  }

  /**
   * Represents the cash a company generates after accounting for cash outflows to support operations and maintain its capital assets
   * @return freeCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FREE_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFreeCashFlow() {
    return freeCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_FREE_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeCashFlow(@javax.annotation.Nullable Double freeCashFlow) {
    this.freeCashFlow = freeCashFlow;
  }


  /**
   * Return true if this CashFlowStruct object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowStruct cashFlowStruct = (CashFlowStruct) o;
    return Objects.equals(this.fiscalDate, cashFlowStruct.fiscalDate) &&
        Objects.equals(this.quarter, cashFlowStruct.quarter) &&
        Objects.equals(this.year, cashFlowStruct.year) &&
        Objects.equals(this.operatingActivities, cashFlowStruct.operatingActivities) &&
        Objects.equals(this.investingActivities, cashFlowStruct.investingActivities) &&
        Objects.equals(this.financingActivities, cashFlowStruct.financingActivities) &&
        Objects.equals(this.endCashPosition, cashFlowStruct.endCashPosition) &&
        Objects.equals(this.incomeTaxPaid, cashFlowStruct.incomeTaxPaid) &&
        Objects.equals(this.interestPaid, cashFlowStruct.interestPaid) &&
        Objects.equals(this.freeCashFlow, cashFlowStruct.freeCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalDate, quarter, year, operatingActivities, investingActivities, financingActivities, endCashPosition, incomeTaxPaid, interestPaid, freeCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowStruct {\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    operatingActivities: ").append(toIndentedString(operatingActivities)).append("\n");
    sb.append("    investingActivities: ").append(toIndentedString(investingActivities)).append("\n");
    sb.append("    financingActivities: ").append(toIndentedString(financingActivities)).append("\n");
    sb.append("    endCashPosition: ").append(toIndentedString(endCashPosition)).append("\n");
    sb.append("    incomeTaxPaid: ").append(toIndentedString(incomeTaxPaid)).append("\n");
    sb.append("    interestPaid: ").append(toIndentedString(interestPaid)).append("\n");
    sb.append("    freeCashFlow: ").append(toIndentedString(freeCashFlow)).append("\n");
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

    // add `fiscal_date` to the URL query string
    if (getFiscalDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiscal_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiscalDate()))));
    }

    // add `quarter` to the URL query string
    if (getQuarter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squarter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuarter()))));
    }

    // add `year` to the URL query string
    if (getYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYear()))));
    }

    // add `operating_activities` to the URL query string
    if (getOperatingActivities() != null) {
      joiner.add(getOperatingActivities().toUrlQueryString(prefix + "operating_activities" + suffix));
    }

    // add `investing_activities` to the URL query string
    if (getInvestingActivities() != null) {
      joiner.add(getInvestingActivities().toUrlQueryString(prefix + "investing_activities" + suffix));
    }

    // add `financing_activities` to the URL query string
    if (getFinancingActivities() != null) {
      joiner.add(getFinancingActivities().toUrlQueryString(prefix + "financing_activities" + suffix));
    }

    // add `end_cash_position` to the URL query string
    if (getEndCashPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%send_cash_position%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndCashPosition()))));
    }

    // add `income_tax_paid` to the URL query string
    if (getIncomeTaxPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sincome_tax_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIncomeTaxPaid()))));
    }

    // add `interest_paid` to the URL query string
    if (getInterestPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_paid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestPaid()))));
    }

    // add `free_cash_flow` to the URL query string
    if (getFreeCashFlow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfree_cash_flow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFreeCashFlow()))));
    }

    return joiner.toString();
  }
}

