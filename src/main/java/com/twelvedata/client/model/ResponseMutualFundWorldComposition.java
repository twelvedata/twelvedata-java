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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundCompositionAssetAllocation;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner;
import com.twelvedata.client.model.ResponseMutualFundWorldCompositionBondBreakdown;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund composition
 */
@JsonPropertyOrder({
  ResponseMutualFundWorldComposition.JSON_PROPERTY_MAJOR_MARKET_SECTORS,
  ResponseMutualFundWorldComposition.JSON_PROPERTY_ASSET_ALLOCATION,
  ResponseMutualFundWorldComposition.JSON_PROPERTY_TOP_HOLDINGS,
  ResponseMutualFundWorldComposition.JSON_PROPERTY_BOND_BREAKDOWN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ResponseMutualFundWorldComposition {
  public static final String JSON_PROPERTY_MAJOR_MARKET_SECTORS = "major_market_sectors";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner> majorMarketSectors = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSET_ALLOCATION = "asset_allocation";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundCompositionAssetAllocation assetAllocation;

  public static final String JSON_PROPERTY_TOP_HOLDINGS = "top_holdings";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner> topHoldings = new ArrayList<>();

  public static final String JSON_PROPERTY_BOND_BREAKDOWN = "bond_breakdown";
  @javax.annotation.Nullable
  private ResponseMutualFundWorldCompositionBondBreakdown bondBreakdown;

  public ResponseMutualFundWorldComposition() { 
  }

  public ResponseMutualFundWorldComposition majorMarketSectors(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner> majorMarketSectors) {
    this.majorMarketSectors = majorMarketSectors;
    return this;
  }

  public ResponseMutualFundWorldComposition addMajorMarketSectorsItem(GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner majorMarketSectorsItem) {
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
  public List<GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner> getMajorMarketSectors() {
    return majorMarketSectors;
  }


  @JsonProperty(value = JSON_PROPERTY_MAJOR_MARKET_SECTORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMajorMarketSectors(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundCompositionMajorMarketSectorsInner> majorMarketSectors) {
    this.majorMarketSectors = majorMarketSectors;
  }


  public ResponseMutualFundWorldComposition assetAllocation(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundCompositionAssetAllocation assetAllocation) {
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
  public GetMutualFundsWorld200ResponseMutualFundCompositionAssetAllocation getAssetAllocation() {
    return assetAllocation;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSET_ALLOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetAllocation(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundCompositionAssetAllocation assetAllocation) {
    this.assetAllocation = assetAllocation;
  }


  public ResponseMutualFundWorldComposition topHoldings(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner> topHoldings) {
    this.topHoldings = topHoldings;
    return this;
  }

  public ResponseMutualFundWorldComposition addTopHoldingsItem(GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner topHoldingsItem) {
    if (this.topHoldings == null) {
      this.topHoldings = new ArrayList<>();
    }
    this.topHoldings.add(topHoldingsItem);
    return this;
  }

  /**
   * Top holdings of the fund with their respective weights in the overall portfolio composition
   * @return topHoldings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOP_HOLDINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner> getTopHoldings() {
    return topHoldings;
  }


  @JsonProperty(value = JSON_PROPERTY_TOP_HOLDINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopHoldings(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundCompositionTopHoldingsInner> topHoldings) {
    this.topHoldings = topHoldings;
  }


  public ResponseMutualFundWorldComposition bondBreakdown(@javax.annotation.Nullable ResponseMutualFundWorldCompositionBondBreakdown bondBreakdown) {
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
  public ResponseMutualFundWorldCompositionBondBreakdown getBondBreakdown() {
    return bondBreakdown;
  }


  @JsonProperty(value = JSON_PROPERTY_BOND_BREAKDOWN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBondBreakdown(@javax.annotation.Nullable ResponseMutualFundWorldCompositionBondBreakdown bondBreakdown) {
    this.bondBreakdown = bondBreakdown;
  }


  /**
   * Return true if this ResponseMutualFundWorldComposition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMutualFundWorldComposition responseMutualFundWorldComposition = (ResponseMutualFundWorldComposition) o;
    return Objects.equals(this.majorMarketSectors, responseMutualFundWorldComposition.majorMarketSectors) &&
        Objects.equals(this.assetAllocation, responseMutualFundWorldComposition.assetAllocation) &&
        Objects.equals(this.topHoldings, responseMutualFundWorldComposition.topHoldings) &&
        Objects.equals(this.bondBreakdown, responseMutualFundWorldComposition.bondBreakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(majorMarketSectors, assetAllocation, topHoldings, bondBreakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMutualFundWorldComposition {\n");
    sb.append("    majorMarketSectors: ").append(toIndentedString(majorMarketSectors)).append("\n");
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

