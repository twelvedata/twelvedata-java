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
import com.twelvedata.client.model.CashFlowDataCashFlowFromFinancingActivities;
import com.twelvedata.client.model.CashFlowDataCashFlowFromInvestingActivities;
import com.twelvedata.client.model.CashFlowDataCashFlowFromOperatingActivities;
import com.twelvedata.client.model.CashFlowDataCashPosition;
import com.twelvedata.client.model.CashFlowDataDirectMethodCashFlow;
import com.twelvedata.client.model.CashFlowDataForeignAndDomesticSales;
import com.twelvedata.client.model.CashFlowDataSupplementalData;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * CashFlowData represents cash flow data for a specific fiscal date
 */
@JsonPropertyOrder({
  CashFlowData.JSON_PROPERTY_FISCAL_DATE,
  CashFlowData.JSON_PROPERTY_YEAR,
  CashFlowData.JSON_PROPERTY_CASH_FLOW_FROM_OPERATING_ACTIVITIES,
  CashFlowData.JSON_PROPERTY_CASH_FLOW_FROM_INVESTING_ACTIVITIES,
  CashFlowData.JSON_PROPERTY_CASH_FLOW_FROM_FINANCING_ACTIVITIES,
  CashFlowData.JSON_PROPERTY_SUPPLEMENTAL_DATA,
  CashFlowData.JSON_PROPERTY_FOREIGN_AND_DOMESTIC_SALES,
  CashFlowData.JSON_PROPERTY_CASH_POSITION,
  CashFlowData.JSON_PROPERTY_DIRECT_METHOD_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CashFlowData {
  public static final String JSON_PROPERTY_FISCAL_DATE = "fiscal_date";
  @javax.annotation.Nonnull
  private String fiscalDate;

  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Long year;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_OPERATING_ACTIVITIES = "cash_flow_from_operating_activities";
  @javax.annotation.Nullable
  private CashFlowDataCashFlowFromOperatingActivities cashFlowFromOperatingActivities;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_INVESTING_ACTIVITIES = "cash_flow_from_investing_activities";
  @javax.annotation.Nullable
  private CashFlowDataCashFlowFromInvestingActivities cashFlowFromInvestingActivities;

  public static final String JSON_PROPERTY_CASH_FLOW_FROM_FINANCING_ACTIVITIES = "cash_flow_from_financing_activities";
  @javax.annotation.Nullable
  private CashFlowDataCashFlowFromFinancingActivities cashFlowFromFinancingActivities;

  public static final String JSON_PROPERTY_SUPPLEMENTAL_DATA = "supplemental_data";
  @javax.annotation.Nullable
  private CashFlowDataSupplementalData supplementalData;

  public static final String JSON_PROPERTY_FOREIGN_AND_DOMESTIC_SALES = "foreign_and_domestic_sales";
  @javax.annotation.Nullable
  private CashFlowDataForeignAndDomesticSales foreignAndDomesticSales;

  public static final String JSON_PROPERTY_CASH_POSITION = "cash_position";
  @javax.annotation.Nullable
  private CashFlowDataCashPosition cashPosition;

  public static final String JSON_PROPERTY_DIRECT_METHOD_CASH_FLOW = "direct_method_cash_flow";
  @javax.annotation.Nullable
  private CashFlowDataDirectMethodCashFlow directMethodCashFlow;

  public CashFlowData() { 
  }

  public CashFlowData fiscalDate(@javax.annotation.Nonnull String fiscalDate) {
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


  public CashFlowData year(@javax.annotation.Nullable Long year) {
    this.year = year;
    return this;
  }

  /**
   * Year of the cash flow statement
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


  public CashFlowData cashFlowFromOperatingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromOperatingActivities cashFlowFromOperatingActivities) {
    this.cashFlowFromOperatingActivities = cashFlowFromOperatingActivities;
    return this;
  }

  /**
   * Get cashFlowFromOperatingActivities
   * @return cashFlowFromOperatingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataCashFlowFromOperatingActivities getCashFlowFromOperatingActivities() {
    return cashFlowFromOperatingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_OPERATING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromOperatingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromOperatingActivities cashFlowFromOperatingActivities) {
    this.cashFlowFromOperatingActivities = cashFlowFromOperatingActivities;
  }


  public CashFlowData cashFlowFromInvestingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromInvestingActivities cashFlowFromInvestingActivities) {
    this.cashFlowFromInvestingActivities = cashFlowFromInvestingActivities;
    return this;
  }

  /**
   * Get cashFlowFromInvestingActivities
   * @return cashFlowFromInvestingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataCashFlowFromInvestingActivities getCashFlowFromInvestingActivities() {
    return cashFlowFromInvestingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_INVESTING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromInvestingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromInvestingActivities cashFlowFromInvestingActivities) {
    this.cashFlowFromInvestingActivities = cashFlowFromInvestingActivities;
  }


  public CashFlowData cashFlowFromFinancingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromFinancingActivities cashFlowFromFinancingActivities) {
    this.cashFlowFromFinancingActivities = cashFlowFromFinancingActivities;
    return this;
  }

  /**
   * Get cashFlowFromFinancingActivities
   * @return cashFlowFromFinancingActivities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataCashFlowFromFinancingActivities getCashFlowFromFinancingActivities() {
    return cashFlowFromFinancingActivities;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_FLOW_FROM_FINANCING_ACTIVITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlowFromFinancingActivities(@javax.annotation.Nullable CashFlowDataCashFlowFromFinancingActivities cashFlowFromFinancingActivities) {
    this.cashFlowFromFinancingActivities = cashFlowFromFinancingActivities;
  }


  public CashFlowData supplementalData(@javax.annotation.Nullable CashFlowDataSupplementalData supplementalData) {
    this.supplementalData = supplementalData;
    return this;
  }

  /**
   * Get supplementalData
   * @return supplementalData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataSupplementalData getSupplementalData() {
    return supplementalData;
  }


  @JsonProperty(value = JSON_PROPERTY_SUPPLEMENTAL_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplementalData(@javax.annotation.Nullable CashFlowDataSupplementalData supplementalData) {
    this.supplementalData = supplementalData;
  }


  public CashFlowData foreignAndDomesticSales(@javax.annotation.Nullable CashFlowDataForeignAndDomesticSales foreignAndDomesticSales) {
    this.foreignAndDomesticSales = foreignAndDomesticSales;
    return this;
  }

  /**
   * Get foreignAndDomesticSales
   * @return foreignAndDomesticSales
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FOREIGN_AND_DOMESTIC_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataForeignAndDomesticSales getForeignAndDomesticSales() {
    return foreignAndDomesticSales;
  }


  @JsonProperty(value = JSON_PROPERTY_FOREIGN_AND_DOMESTIC_SALES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignAndDomesticSales(@javax.annotation.Nullable CashFlowDataForeignAndDomesticSales foreignAndDomesticSales) {
    this.foreignAndDomesticSales = foreignAndDomesticSales;
  }


  public CashFlowData cashPosition(@javax.annotation.Nullable CashFlowDataCashPosition cashPosition) {
    this.cashPosition = cashPosition;
    return this;
  }

  /**
   * Get cashPosition
   * @return cashPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataCashPosition getCashPosition() {
    return cashPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_CASH_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashPosition(@javax.annotation.Nullable CashFlowDataCashPosition cashPosition) {
    this.cashPosition = cashPosition;
  }


  public CashFlowData directMethodCashFlow(@javax.annotation.Nullable CashFlowDataDirectMethodCashFlow directMethodCashFlow) {
    this.directMethodCashFlow = directMethodCashFlow;
    return this;
  }

  /**
   * Get directMethodCashFlow
   * @return directMethodCashFlow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIRECT_METHOD_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlowDataDirectMethodCashFlow getDirectMethodCashFlow() {
    return directMethodCashFlow;
  }


  @JsonProperty(value = JSON_PROPERTY_DIRECT_METHOD_CASH_FLOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectMethodCashFlow(@javax.annotation.Nullable CashFlowDataDirectMethodCashFlow directMethodCashFlow) {
    this.directMethodCashFlow = directMethodCashFlow;
  }


  /**
   * Return true if this CashFlowData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowData cashFlowData = (CashFlowData) o;
    return Objects.equals(this.fiscalDate, cashFlowData.fiscalDate) &&
        Objects.equals(this.year, cashFlowData.year) &&
        Objects.equals(this.cashFlowFromOperatingActivities, cashFlowData.cashFlowFromOperatingActivities) &&
        Objects.equals(this.cashFlowFromInvestingActivities, cashFlowData.cashFlowFromInvestingActivities) &&
        Objects.equals(this.cashFlowFromFinancingActivities, cashFlowData.cashFlowFromFinancingActivities) &&
        Objects.equals(this.supplementalData, cashFlowData.supplementalData) &&
        Objects.equals(this.foreignAndDomesticSales, cashFlowData.foreignAndDomesticSales) &&
        Objects.equals(this.cashPosition, cashFlowData.cashPosition) &&
        Objects.equals(this.directMethodCashFlow, cashFlowData.directMethodCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalDate, year, cashFlowFromOperatingActivities, cashFlowFromInvestingActivities, cashFlowFromFinancingActivities, supplementalData, foreignAndDomesticSales, cashPosition, directMethodCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowData {\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    cashFlowFromOperatingActivities: ").append(toIndentedString(cashFlowFromOperatingActivities)).append("\n");
    sb.append("    cashFlowFromInvestingActivities: ").append(toIndentedString(cashFlowFromInvestingActivities)).append("\n");
    sb.append("    cashFlowFromFinancingActivities: ").append(toIndentedString(cashFlowFromFinancingActivities)).append("\n");
    sb.append("    supplementalData: ").append(toIndentedString(supplementalData)).append("\n");
    sb.append("    foreignAndDomesticSales: ").append(toIndentedString(foreignAndDomesticSales)).append("\n");
    sb.append("    cashPosition: ").append(toIndentedString(cashPosition)).append("\n");
    sb.append("    directMethodCashFlow: ").append(toIndentedString(directMethodCashFlow)).append("\n");
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

    // add `year` to the URL query string
    if (getYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syear%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYear()))));
    }

    // add `cash_flow_from_operating_activities` to the URL query string
    if (getCashFlowFromOperatingActivities() != null) {
      joiner.add(getCashFlowFromOperatingActivities().toUrlQueryString(prefix + "cash_flow_from_operating_activities" + suffix));
    }

    // add `cash_flow_from_investing_activities` to the URL query string
    if (getCashFlowFromInvestingActivities() != null) {
      joiner.add(getCashFlowFromInvestingActivities().toUrlQueryString(prefix + "cash_flow_from_investing_activities" + suffix));
    }

    // add `cash_flow_from_financing_activities` to the URL query string
    if (getCashFlowFromFinancingActivities() != null) {
      joiner.add(getCashFlowFromFinancingActivities().toUrlQueryString(prefix + "cash_flow_from_financing_activities" + suffix));
    }

    // add `supplemental_data` to the URL query string
    if (getSupplementalData() != null) {
      joiner.add(getSupplementalData().toUrlQueryString(prefix + "supplemental_data" + suffix));
    }

    // add `foreign_and_domestic_sales` to the URL query string
    if (getForeignAndDomesticSales() != null) {
      joiner.add(getForeignAndDomesticSales().toUrlQueryString(prefix + "foreign_and_domestic_sales" + suffix));
    }

    // add `cash_position` to the URL query string
    if (getCashPosition() != null) {
      joiner.add(getCashPosition().toUrlQueryString(prefix + "cash_position" + suffix));
    }

    // add `direct_method_cash_flow` to the URL query string
    if (getDirectMethodCashFlow() != null) {
      joiner.add(getDirectMethodCashFlow().toUrlQueryString(prefix + "direct_method_cash_flow" + suffix));
    }

    return joiner.toString();
  }
}

