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
 * GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner.JSON_PROPERTY_SECTOR,
  GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner.JSON_PROPERTY_WEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner {
  public static final String JSON_PROPERTY_SECTOR = "sector";
  @javax.annotation.Nullable
  private String sector;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  @javax.annotation.Nullable
  private Double weight;

  public GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner() { 
  }

  public GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner sector(@javax.annotation.Nullable String sector) {
    this.sector = sector;
    return this;
  }

  /**
   * Sector category of a fund exposure
   * @return sector
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSector() {
    return sector;
  }


  @JsonProperty(value = JSON_PROPERTY_SECTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSector(@javax.annotation.Nullable String sector) {
    this.sector = sector;
  }


  public GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner weight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of a fund exposure in a sector
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWeight() {
    return weight;
  }


  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(@javax.annotation.Nullable Double weight) {
    this.weight = weight;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_composition_major_market_sectors_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner getETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner = (GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner) o;
    return Objects.equals(this.sector, getETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner.sector) &&
        Objects.equals(this.weight, getETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sector, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfCompositionMajorMarketSectorsInner {\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

    // add `sector` to the URL query string
    if (getSector() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssector%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSector()))));
    }

    // add `weight` to the URL query string
    if (getWeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sweight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWeight()))));
    }

    return joiner.toString();
  }
}

