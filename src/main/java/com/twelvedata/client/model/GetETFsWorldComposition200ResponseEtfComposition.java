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
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionAssetAllocation;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionBondBreakdown;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionCountryAllocationInner;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionTopHoldingsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Composition of a etf
 */
@JsonPropertyOrder({
  GetETFsWorldComposition200ResponseEtfComposition.JSON_PROPERTY_MAJOR_MARKET_SECTORS,
  GetETFsWorldComposition200ResponseEtfComposition.JSON_PROPERTY_COUNTRY_ALLOCATION,
  GetETFsWorldComposition200ResponseEtfComposition.JSON_PROPERTY_ASSET_ALLOCATION,
  GetETFsWorldComposition200ResponseEtfComposition.JSON_PROPERTY_TOP_HOLDINGS,
  GetETFsWorldComposition200ResponseEtfComposition.JSON_PROPERTY_BOND_BREAKDOWN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorldComposition200ResponseEtfComposition {
  public static final String JSON_PROPERTY_MAJOR_MARKET_SECTORS = "major_market_sectors";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner> majorMarketSectors = new ArrayList<>();

  public static final String JSON_PROPERTY_COUNTRY_ALLOCATION = "country_allocation";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfCompositionCountryAllocationInner> countryAllocation = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSET_ALLOCATION = "asset_allocation";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfCompositionAssetAllocation assetAllocation;

  public static final String JSON_PROPERTY_TOP_HOLDINGS = "top_holdings";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfCompositionTopHoldingsInner> topHoldings = new ArrayList<>();

  public static final String JSON_PROPERTY_BOND_BREAKDOWN = "bond_breakdown";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfCompositionBondBreakdown bondBreakdown;

  public GetETFsWorldComposition200ResponseEtfComposition() { 
  }

  public GetETFsWorldComposition200ResponseEtfComposition majorMarketSectors(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner> majorMarketSectors) {
    this.majorMarketSectors = majorMarketSectors;
    return this;
  }

  public GetETFsWorldComposition200ResponseEtfComposition addMajorMarketSectorsItem(GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner majorMarketSectorsItem) {
    if (this.majorMarketSectors == null) {
      this.majorMarketSectors = new ArrayList<>();
    }
    this.majorMarketSectors.add(majorMarketSectorsItem);
    return this;
  }

  /**
   * Breakdown of the fund’s portfolio by major industry sectors and their respective weights
   * @return majorMarketSectors
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAJOR_MARKET_SECTORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner> getMajorMarketSectors() {
    return majorMarketSectors;
  }


  @JsonProperty(value = JSON_PROPERTY_MAJOR_MARKET_SECTORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMajorMarketSectors(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner> majorMarketSectors) {
    this.majorMarketSectors = majorMarketSectors;
  }


  public GetETFsWorldComposition200ResponseEtfComposition countryAllocation(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionCountryAllocationInner> countryAllocation) {
    this.countryAllocation = countryAllocation;
    return this;
  }

  public GetETFsWorldComposition200ResponseEtfComposition addCountryAllocationItem(GetETFsWorld200ResponseEtfCompositionCountryAllocationInner countryAllocationItem) {
    if (this.countryAllocation == null) {
      this.countryAllocation = new ArrayList<>();
    }
    this.countryAllocation.add(countryAllocationItem);
    return this;
  }

  /**
   * Breakdown of the fund’s portfolio by country and their respective weights
   * @return countryAllocation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfCompositionCountryAllocationInner> getCountryAllocation() {
    return countryAllocation;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryAllocation(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionCountryAllocationInner> countryAllocation) {
    this.countryAllocation = countryAllocation;
  }


  public GetETFsWorldComposition200ResponseEtfComposition assetAllocation(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionAssetAllocation assetAllocation) {
    this.assetAllocation = assetAllocation;
    return this;
  }

  /**
   * Get assetAllocation
   * @return assetAllocation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSET_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfCompositionAssetAllocation getAssetAllocation() {
    return assetAllocation;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSET_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetAllocation(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionAssetAllocation assetAllocation) {
    this.assetAllocation = assetAllocation;
  }


  public GetETFsWorldComposition200ResponseEtfComposition topHoldings(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionTopHoldingsInner> topHoldings) {
    this.topHoldings = topHoldings;
    return this;
  }

  public GetETFsWorldComposition200ResponseEtfComposition addTopHoldingsItem(GetETFsWorld200ResponseEtfCompositionTopHoldingsInner topHoldingsItem) {
    if (this.topHoldings == null) {
      this.topHoldings = new ArrayList<>();
    }
    this.topHoldings.add(topHoldingsItem);
    return this;
  }

  /**
   * Top holdings of a fund with their respective weights in the overall portfolio composition
   * @return topHoldings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOP_HOLDINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfCompositionTopHoldingsInner> getTopHoldings() {
    return topHoldings;
  }


  @JsonProperty(value = JSON_PROPERTY_TOP_HOLDINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopHoldings(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionTopHoldingsInner> topHoldings) {
    this.topHoldings = topHoldings;
  }


  public GetETFsWorldComposition200ResponseEtfComposition bondBreakdown(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdown bondBreakdown) {
    this.bondBreakdown = bondBreakdown;
    return this;
  }

  /**
   * Get bondBreakdown
   * @return bondBreakdown
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BOND_BREAKDOWN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfCompositionBondBreakdown getBondBreakdown() {
    return bondBreakdown;
  }


  @JsonProperty(value = JSON_PROPERTY_BOND_BREAKDOWN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBondBreakdown(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdown bondBreakdown) {
    this.bondBreakdown = bondBreakdown;
  }


  /**
   * Return true if this GetETFsWorldComposition_200_response_etf_composition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorldComposition200ResponseEtfComposition getETFsWorldComposition200ResponseEtfComposition = (GetETFsWorldComposition200ResponseEtfComposition) o;
    return Objects.equals(this.majorMarketSectors, getETFsWorldComposition200ResponseEtfComposition.majorMarketSectors) &&
        Objects.equals(this.countryAllocation, getETFsWorldComposition200ResponseEtfComposition.countryAllocation) &&
        Objects.equals(this.assetAllocation, getETFsWorldComposition200ResponseEtfComposition.assetAllocation) &&
        Objects.equals(this.topHoldings, getETFsWorldComposition200ResponseEtfComposition.topHoldings) &&
        Objects.equals(this.bondBreakdown, getETFsWorldComposition200ResponseEtfComposition.bondBreakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(majorMarketSectors, countryAllocation, assetAllocation, topHoldings, bondBreakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorldComposition200ResponseEtfComposition {\n");
    sb.append("    majorMarketSectors: ").append(toIndentedString(majorMarketSectors)).append("\n");
    sb.append("    countryAllocation: ").append(toIndentedString(countryAllocation)).append("\n");
    sb.append("    assetAllocation: ").append(toIndentedString(assetAllocation)).append("\n");
    sb.append("    topHoldings: ").append(toIndentedString(topHoldings)).append("\n");
    sb.append("    bondBreakdown: ").append(toIndentedString(bondBreakdown)).append("\n");
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

    // add `major_market_sectors` to the URL query string
    if (getMajorMarketSectors() != null) {
      for (int i = 0; i < getMajorMarketSectors().size(); i++) {
        if (getMajorMarketSectors().get(i) != null) {
          joiner.add(getMajorMarketSectors().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%smajor_market_sectors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `country_allocation` to the URL query string
    if (getCountryAllocation() != null) {
      for (int i = 0; i < getCountryAllocation().size(); i++) {
        if (getCountryAllocation().get(i) != null) {
          joiner.add(getCountryAllocation().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scountry_allocation%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `asset_allocation` to the URL query string
    if (getAssetAllocation() != null) {
      joiner.add(getAssetAllocation().toUrlQueryString(prefix + "asset_allocation" + suffix));
    }

    // add `top_holdings` to the URL query string
    if (getTopHoldings() != null) {
      for (int i = 0; i < getTopHoldings().size(); i++) {
        if (getTopHoldings().get(i) != null) {
          joiner.add(getTopHoldings().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%stop_holdings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `bond_breakdown` to the URL query string
    if (getBondBreakdown() != null) {
      joiner.add(getBondBreakdown().toUrlQueryString(prefix + "bond_breakdown" + suffix));
    }

    return joiner.toString();
  }
}

