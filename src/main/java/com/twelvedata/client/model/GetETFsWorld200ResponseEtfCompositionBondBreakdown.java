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
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageMaturity;
import com.twelvedata.client.model.GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Breakdown of the fund’s portfolio by bond holding characteristics
 */
@JsonPropertyOrder({
  GetETFsWorld200ResponseEtfCompositionBondBreakdown.JSON_PROPERTY_AVERAGE_MATURITY,
  GetETFsWorld200ResponseEtfCompositionBondBreakdown.JSON_PROPERTY_AVERAGE_DURATION,
  GetETFsWorld200ResponseEtfCompositionBondBreakdown.JSON_PROPERTY_CREDIT_QUALITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorld200ResponseEtfCompositionBondBreakdown {
  public static final String JSON_PROPERTY_AVERAGE_MATURITY = "average_maturity";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageMaturity averageMaturity;

  public static final String JSON_PROPERTY_AVERAGE_DURATION = "average_duration";
  @javax.annotation.Nullable
  private GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration averageDuration;

  public static final String JSON_PROPERTY_CREDIT_QUALITY = "credit_quality";
  @javax.annotation.Nullable
  private List<GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner> creditQuality = new ArrayList<>();

  public GetETFsWorld200ResponseEtfCompositionBondBreakdown() { 
  }

  public GetETFsWorld200ResponseEtfCompositionBondBreakdown averageMaturity(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageMaturity averageMaturity) {
    this.averageMaturity = averageMaturity;
    return this;
  }

  /**
   * Get averageMaturity
   * @return averageMaturity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVERAGE_MATURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageMaturity getAverageMaturity() {
    return averageMaturity;
  }


  @JsonProperty(value = JSON_PROPERTY_AVERAGE_MATURITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageMaturity(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageMaturity averageMaturity) {
    this.averageMaturity = averageMaturity;
  }


  public GetETFsWorld200ResponseEtfCompositionBondBreakdown averageDuration(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration averageDuration) {
    this.averageDuration = averageDuration;
    return this;
  }

  /**
   * Get averageDuration
   * @return averageDuration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVERAGE_DURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration getAverageDuration() {
    return averageDuration;
  }


  @JsonProperty(value = JSON_PROPERTY_AVERAGE_DURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageDuration(@javax.annotation.Nullable GetETFsWorld200ResponseEtfCompositionBondBreakdownAverageDuration averageDuration) {
    this.averageDuration = averageDuration;
  }


  public GetETFsWorld200ResponseEtfCompositionBondBreakdown creditQuality(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner> creditQuality) {
    this.creditQuality = creditQuality;
    return this;
  }

  public GetETFsWorld200ResponseEtfCompositionBondBreakdown addCreditQualityItem(GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner creditQualityItem) {
    if (this.creditQuality == null) {
      this.creditQuality = new ArrayList<>();
    }
    this.creditQuality.add(creditQualityItem);
    return this;
  }

  /**
   * Breakdown of the fund’s bond holdings by credit rating and their respective portfolio weights
   * @return creditQuality
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREDIT_QUALITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner> getCreditQuality() {
    return creditQuality;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDIT_QUALITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditQuality(@javax.annotation.Nullable List<GetETFsWorld200ResponseEtfCompositionBondBreakdownCreditQualityInner> creditQuality) {
    this.creditQuality = creditQuality;
  }


  /**
   * Return true if this GetETFsWorld_200_response_etf_composition_bond_breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorld200ResponseEtfCompositionBondBreakdown getETFsWorld200ResponseEtfCompositionBondBreakdown = (GetETFsWorld200ResponseEtfCompositionBondBreakdown) o;
    return Objects.equals(this.averageMaturity, getETFsWorld200ResponseEtfCompositionBondBreakdown.averageMaturity) &&
        Objects.equals(this.averageDuration, getETFsWorld200ResponseEtfCompositionBondBreakdown.averageDuration) &&
        Objects.equals(this.creditQuality, getETFsWorld200ResponseEtfCompositionBondBreakdown.creditQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageMaturity, averageDuration, creditQuality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorld200ResponseEtfCompositionBondBreakdown {\n");
    sb.append("    averageMaturity: ").append(toIndentedString(averageMaturity)).append("\n");
    sb.append("    averageDuration: ").append(toIndentedString(averageDuration)).append("\n");
    sb.append("    creditQuality: ").append(toIndentedString(creditQuality)).append("\n");
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

    // add `average_maturity` to the URL query string
    if (getAverageMaturity() != null) {
      joiner.add(getAverageMaturity().toUrlQueryString(prefix + "average_maturity" + suffix));
    }

    // add `average_duration` to the URL query string
    if (getAverageDuration() != null) {
      joiner.add(getAverageDuration().toUrlQueryString(prefix + "average_duration" + suffix));
    }

    // add `credit_quality` to the URL query string
    if (getCreditQuality() != null) {
      for (int i = 0; i < getCreditQuality().size(); i++) {
        if (getCreditQuality().get(i) != null) {
          joiner.add(getCreditQuality().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scredit_quality%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

