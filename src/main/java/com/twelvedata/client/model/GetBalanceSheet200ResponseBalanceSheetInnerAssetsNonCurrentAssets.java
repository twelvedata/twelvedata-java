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
 * Non-current assets section
 */
@JsonPropertyOrder({
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_PROPERTIES,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_LAND_AND_IMPROVEMENTS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_LEASES,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_ACCUMULATED_DEPRECIATION,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_GOODWILL,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_INVESTMENT_PROPERTIES,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_FINANCIAL_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_INTANGIBLE_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_INVESTMENTS_AND_ADVANCES,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS,
  GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets {
  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @javax.annotation.Nullable
  private Double properties;

  public static final String JSON_PROPERTY_LAND_AND_IMPROVEMENTS = "land_and_improvements";
  @javax.annotation.Nullable
  private Double landAndImprovements;

  public static final String JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT = "machinery_furniture_equipment";
  @javax.annotation.Nullable
  private Double machineryFurnitureEquipment;

  public static final String JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS = "construction_in_progress";
  @javax.annotation.Nullable
  private Double constructionInProgress;

  public static final String JSON_PROPERTY_LEASES = "leases";
  @javax.annotation.Nullable
  private Double leases;

  public static final String JSON_PROPERTY_ACCUMULATED_DEPRECIATION = "accumulated_depreciation";
  @javax.annotation.Nullable
  private Double accumulatedDepreciation;

  public static final String JSON_PROPERTY_GOODWILL = "goodwill";
  @javax.annotation.Nullable
  private Double goodwill;

  public static final String JSON_PROPERTY_INVESTMENT_PROPERTIES = "investment_properties";
  @javax.annotation.Nullable
  private Double investmentProperties;

  public static final String JSON_PROPERTY_FINANCIAL_ASSETS = "financial_assets";
  @javax.annotation.Nullable
  private Double financialAssets;

  public static final String JSON_PROPERTY_INTANGIBLE_ASSETS = "intangible_assets";
  @javax.annotation.Nullable
  private Double intangibleAssets;

  public static final String JSON_PROPERTY_INVESTMENTS_AND_ADVANCES = "investments_and_advances";
  @javax.annotation.Nullable
  private Double investmentsAndAdvances;

  public static final String JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS = "other_non_current_assets";
  @javax.annotation.Nullable
  private Double otherNonCurrentAssets;

  public static final String JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS = "total_non_current_assets";
  @javax.annotation.Nullable
  private Double totalNonCurrentAssets;

  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets() { 
  }

  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets properties(@javax.annotation.Nullable Double properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Represents property owned
   * @return properties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProperties() {
    return properties;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(@javax.annotation.Nullable Double properties) {
    this.properties = properties;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets landAndImprovements(@javax.annotation.Nullable Double landAndImprovements) {
    this.landAndImprovements = landAndImprovements;
    return this;
  }

  /**
   * Represents land and improvements owned
   * @return landAndImprovements
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAND_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLandAndImprovements() {
    return landAndImprovements;
  }


  @JsonProperty(value = JSON_PROPERTY_LAND_AND_IMPROVEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandAndImprovements(@javax.annotation.Nullable Double landAndImprovements) {
    this.landAndImprovements = landAndImprovements;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets machineryFurnitureEquipment(@javax.annotation.Nullable Double machineryFurnitureEquipment) {
    this.machineryFurnitureEquipment = machineryFurnitureEquipment;
    return this;
  }

  /**
   * Represents office equipment, furniture, and vehicles owned
   * @return machineryFurnitureEquipment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMachineryFurnitureEquipment() {
    return machineryFurnitureEquipment;
  }


  @JsonProperty(value = JSON_PROPERTY_MACHINERY_FURNITURE_EQUIPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMachineryFurnitureEquipment(@javax.annotation.Nullable Double machineryFurnitureEquipment) {
    this.machineryFurnitureEquipment = machineryFurnitureEquipment;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets constructionInProgress(@javax.annotation.Nullable Double constructionInProgress) {
    this.constructionInProgress = constructionInProgress;
    return this;
  }

  /**
   * Represents the cost of construction work, which is not yet completed
   * @return constructionInProgress
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getConstructionInProgress() {
    return constructionInProgress;
  }


  @JsonProperty(value = JSON_PROPERTY_CONSTRUCTION_IN_PROGRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructionInProgress(@javax.annotation.Nullable Double constructionInProgress) {
    this.constructionInProgress = constructionInProgress;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets leases(@javax.annotation.Nullable Double leases) {
    this.leases = leases;
    return this;
  }

  /**
   * Represents operating and financial leases
   * @return leases
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LEASES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLeases() {
    return leases;
  }


  @JsonProperty(value = JSON_PROPERTY_LEASES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeases(@javax.annotation.Nullable Double leases) {
    this.leases = leases;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets accumulatedDepreciation(@javax.annotation.Nullable Double accumulatedDepreciation) {
    this.accumulatedDepreciation = accumulatedDepreciation;
    return this;
  }

  /**
   * Represents the cumulative depreciation of an asset that has been recorded
   * @return accumulatedDepreciation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCUMULATED_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAccumulatedDepreciation() {
    return accumulatedDepreciation;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCUMULATED_DEPRECIATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedDepreciation(@javax.annotation.Nullable Double accumulatedDepreciation) {
    this.accumulatedDepreciation = accumulatedDepreciation;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets goodwill(@javax.annotation.Nullable Double goodwill) {
    this.goodwill = goodwill;
    return this;
  }

  /**
   * Represents the value of a brand name, solid customer base, good customer relations, good employee relations, and proprietary technology
   * @return goodwill
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGoodwill() {
    return goodwill;
  }


  @JsonProperty(value = JSON_PROPERTY_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodwill(@javax.annotation.Nullable Double goodwill) {
    this.goodwill = goodwill;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets investmentProperties(@javax.annotation.Nullable Double investmentProperties) {
    this.investmentProperties = investmentProperties;
    return this;
  }

  /**
   * Represents real estate property purchased with the intention of earning a return on the investment
   * @return investmentProperties
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentProperties() {
    return investmentProperties;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENT_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentProperties(@javax.annotation.Nullable Double investmentProperties) {
    this.investmentProperties = investmentProperties;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets financialAssets(@javax.annotation.Nullable Double financialAssets) {
    this.financialAssets = financialAssets;
    return this;
  }

  /**
   * Represents liquid asset that gets its value from a contractual right or ownership claim
   * @return financialAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFinancialAssets() {
    return financialAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_FINANCIAL_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancialAssets(@javax.annotation.Nullable Double financialAssets) {
    this.financialAssets = financialAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets intangibleAssets(@javax.annotation.Nullable Double intangibleAssets) {
    this.intangibleAssets = intangibleAssets;
    return this;
  }

  /**
   * Represents the patents, trademarks, and other intellectual properties
   * @return intangibleAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIntangibleAssets() {
    return intangibleAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_INTANGIBLE_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntangibleAssets(@javax.annotation.Nullable Double intangibleAssets) {
    this.intangibleAssets = intangibleAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets investmentsAndAdvances(@javax.annotation.Nullable Double investmentsAndAdvances) {
    this.investmentsAndAdvances = investmentsAndAdvances;
    return this;
  }

  /**
   * Represents available for sale financial securities
   * @return investmentsAndAdvances
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_AND_ADVANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInvestmentsAndAdvances() {
    return investmentsAndAdvances;
  }


  @JsonProperty(value = JSON_PROPERTY_INVESTMENTS_AND_ADVANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestmentsAndAdvances(@javax.annotation.Nullable Double investmentsAndAdvances) {
    this.investmentsAndAdvances = investmentsAndAdvances;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets otherNonCurrentAssets(@javax.annotation.Nullable Double otherNonCurrentAssets) {
    this.otherNonCurrentAssets = otherNonCurrentAssets;
    return this;
  }

  /**
   * Represents other long-term assets
   * @return otherNonCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherNonCurrentAssets() {
    return otherNonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherNonCurrentAssets(@javax.annotation.Nullable Double otherNonCurrentAssets) {
    this.otherNonCurrentAssets = otherNonCurrentAssets;
  }


  public GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets totalNonCurrentAssets(@javax.annotation.Nullable Double totalNonCurrentAssets) {
    this.totalNonCurrentAssets = totalNonCurrentAssets;
    return this;
  }

  /**
   * All long-term assets values in total
   * @return totalNonCurrentAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalNonCurrentAssets() {
    return totalNonCurrentAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_NON_CURRENT_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNonCurrentAssets(@javax.annotation.Nullable Double totalNonCurrentAssets) {
    this.totalNonCurrentAssets = totalNonCurrentAssets;
  }


  /**
   * Return true if this GetBalanceSheet_200_response_balance_sheet_inner_assets_non_current_assets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets = (GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets) o;
    return Objects.equals(this.properties, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.properties) &&
        Objects.equals(this.landAndImprovements, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.landAndImprovements) &&
        Objects.equals(this.machineryFurnitureEquipment, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.machineryFurnitureEquipment) &&
        Objects.equals(this.constructionInProgress, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.constructionInProgress) &&
        Objects.equals(this.leases, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.leases) &&
        Objects.equals(this.accumulatedDepreciation, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.accumulatedDepreciation) &&
        Objects.equals(this.goodwill, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.goodwill) &&
        Objects.equals(this.investmentProperties, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.investmentProperties) &&
        Objects.equals(this.financialAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.financialAssets) &&
        Objects.equals(this.intangibleAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.intangibleAssets) &&
        Objects.equals(this.investmentsAndAdvances, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.investmentsAndAdvances) &&
        Objects.equals(this.otherNonCurrentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.otherNonCurrentAssets) &&
        Objects.equals(this.totalNonCurrentAssets, getBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets.totalNonCurrentAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, landAndImprovements, machineryFurnitureEquipment, constructionInProgress, leases, accumulatedDepreciation, goodwill, investmentProperties, financialAssets, intangibleAssets, investmentsAndAdvances, otherNonCurrentAssets, totalNonCurrentAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBalanceSheet200ResponseBalanceSheetInnerAssetsNonCurrentAssets {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    landAndImprovements: ").append(toIndentedString(landAndImprovements)).append("\n");
    sb.append("    machineryFurnitureEquipment: ").append(toIndentedString(machineryFurnitureEquipment)).append("\n");
    sb.append("    constructionInProgress: ").append(toIndentedString(constructionInProgress)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    accumulatedDepreciation: ").append(toIndentedString(accumulatedDepreciation)).append("\n");
    sb.append("    goodwill: ").append(toIndentedString(goodwill)).append("\n");
    sb.append("    investmentProperties: ").append(toIndentedString(investmentProperties)).append("\n");
    sb.append("    financialAssets: ").append(toIndentedString(financialAssets)).append("\n");
    sb.append("    intangibleAssets: ").append(toIndentedString(intangibleAssets)).append("\n");
    sb.append("    investmentsAndAdvances: ").append(toIndentedString(investmentsAndAdvances)).append("\n");
    sb.append("    otherNonCurrentAssets: ").append(toIndentedString(otherNonCurrentAssets)).append("\n");
    sb.append("    totalNonCurrentAssets: ").append(toIndentedString(totalNonCurrentAssets)).append("\n");
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

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sproperties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProperties()))));
    }

    // add `land_and_improvements` to the URL query string
    if (getLandAndImprovements() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sland_and_improvements%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLandAndImprovements()))));
    }

    // add `machinery_furniture_equipment` to the URL query string
    if (getMachineryFurnitureEquipment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smachinery_furniture_equipment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMachineryFurnitureEquipment()))));
    }

    // add `construction_in_progress` to the URL query string
    if (getConstructionInProgress() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconstruction_in_progress%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConstructionInProgress()))));
    }

    // add `leases` to the URL query string
    if (getLeases() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sleases%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLeases()))));
    }

    // add `accumulated_depreciation` to the URL query string
    if (getAccumulatedDepreciation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccumulated_depreciation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccumulatedDepreciation()))));
    }

    // add `goodwill` to the URL query string
    if (getGoodwill() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgoodwill%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGoodwill()))));
    }

    // add `investment_properties` to the URL query string
    if (getInvestmentProperties() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestment_properties%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentProperties()))));
    }

    // add `financial_assets` to the URL query string
    if (getFinancialAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinancial_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinancialAssets()))));
    }

    // add `intangible_assets` to the URL query string
    if (getIntangibleAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintangible_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntangibleAssets()))));
    }

    // add `investments_and_advances` to the URL query string
    if (getInvestmentsAndAdvances() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinvestments_and_advances%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInvestmentsAndAdvances()))));
    }

    // add `other_non_current_assets` to the URL query string
    if (getOtherNonCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_non_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherNonCurrentAssets()))));
    }

    // add `total_non_current_assets` to the URL query string
    if (getTotalNonCurrentAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_non_current_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalNonCurrentAssets()))));
    }

    return joiner.toString();
  }
}

