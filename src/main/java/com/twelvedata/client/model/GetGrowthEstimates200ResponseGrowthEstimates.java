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
 * Growth estimates data
 */
@JsonPropertyOrder({
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_CURRENT_QUARTER,
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_NEXT_QUARTER,
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_CURRENT_YEAR,
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_NEXT_YEAR,
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_NEXT5_YEARS_PA,
  GetGrowthEstimates200ResponseGrowthEstimates.JSON_PROPERTY_PAST5_YEARS_PA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetGrowthEstimates200ResponseGrowthEstimates {
  public static final String JSON_PROPERTY_CURRENT_QUARTER = "current_quarter";
  @javax.annotation.Nullable
  private Double currentQuarter;

  public static final String JSON_PROPERTY_NEXT_QUARTER = "next_quarter";
  @javax.annotation.Nullable
  private Double nextQuarter;

  public static final String JSON_PROPERTY_CURRENT_YEAR = "current_year";
  @javax.annotation.Nullable
  private Double currentYear;

  public static final String JSON_PROPERTY_NEXT_YEAR = "next_year";
  @javax.annotation.Nullable
  private Double nextYear;

  public static final String JSON_PROPERTY_NEXT5_YEARS_PA = "next_5_years_pa";
  @javax.annotation.Nullable
  private Double next5YearsPa;

  public static final String JSON_PROPERTY_PAST5_YEARS_PA = "past_5_years_pa";
  @javax.annotation.Nullable
  private Double past5YearsPa;

  public GetGrowthEstimates200ResponseGrowthEstimates() { 
  }

  public GetGrowthEstimates200ResponseGrowthEstimates currentQuarter(@javax.annotation.Nullable Double currentQuarter) {
    this.currentQuarter = currentQuarter;
    return this;
  }

  /**
   * Projected growth of the current quarter in percentage (%)
   * @return currentQuarter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentQuarter() {
    return currentQuarter;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentQuarter(@javax.annotation.Nullable Double currentQuarter) {
    this.currentQuarter = currentQuarter;
  }


  public GetGrowthEstimates200ResponseGrowthEstimates nextQuarter(@javax.annotation.Nullable Double nextQuarter) {
    this.nextQuarter = nextQuarter;
    return this;
  }

  /**
   * Projected growth of the next quarter in percentage (%)
   * @return nextQuarter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NEXT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNextQuarter() {
    return nextQuarter;
  }


  @JsonProperty(value = JSON_PROPERTY_NEXT_QUARTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextQuarter(@javax.annotation.Nullable Double nextQuarter) {
    this.nextQuarter = nextQuarter;
  }


  public GetGrowthEstimates200ResponseGrowthEstimates currentYear(@javax.annotation.Nullable Double currentYear) {
    this.currentYear = currentYear;
    return this;
  }

  /**
   * Projected growth of the current year in percentage (%)
   * @return currentYear
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCurrentYear() {
    return currentYear;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentYear(@javax.annotation.Nullable Double currentYear) {
    this.currentYear = currentYear;
  }


  public GetGrowthEstimates200ResponseGrowthEstimates nextYear(@javax.annotation.Nullable Double nextYear) {
    this.nextYear = nextYear;
    return this;
  }

  /**
   * Projected growth of the next year in percentage (%)
   * @return nextYear
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NEXT_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNextYear() {
    return nextYear;
  }


  @JsonProperty(value = JSON_PROPERTY_NEXT_YEAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextYear(@javax.annotation.Nullable Double nextYear) {
    this.nextYear = nextYear;
  }


  public GetGrowthEstimates200ResponseGrowthEstimates next5YearsPa(@javax.annotation.Nullable Double next5YearsPa) {
    this.next5YearsPa = next5YearsPa;
    return this;
  }

  /**
   * Projected growth during the next 5 years in percentage (%) per annum
   * @return next5YearsPa
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NEXT5_YEARS_PA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNext5YearsPa() {
    return next5YearsPa;
  }


  @JsonProperty(value = JSON_PROPERTY_NEXT5_YEARS_PA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext5YearsPa(@javax.annotation.Nullable Double next5YearsPa) {
    this.next5YearsPa = next5YearsPa;
  }


  public GetGrowthEstimates200ResponseGrowthEstimates past5YearsPa(@javax.annotation.Nullable Double past5YearsPa) {
    this.past5YearsPa = past5YearsPa;
    return this;
  }

  /**
   * Actual growth over the last 5 years in percentage (%) per annum
   * @return past5YearsPa
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAST5_YEARS_PA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPast5YearsPa() {
    return past5YearsPa;
  }


  @JsonProperty(value = JSON_PROPERTY_PAST5_YEARS_PA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPast5YearsPa(@javax.annotation.Nullable Double past5YearsPa) {
    this.past5YearsPa = past5YearsPa;
  }


  /**
   * Return true if this GetGrowthEstimates_200_response_growth_estimates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGrowthEstimates200ResponseGrowthEstimates getGrowthEstimates200ResponseGrowthEstimates = (GetGrowthEstimates200ResponseGrowthEstimates) o;
    return Objects.equals(this.currentQuarter, getGrowthEstimates200ResponseGrowthEstimates.currentQuarter) &&
        Objects.equals(this.nextQuarter, getGrowthEstimates200ResponseGrowthEstimates.nextQuarter) &&
        Objects.equals(this.currentYear, getGrowthEstimates200ResponseGrowthEstimates.currentYear) &&
        Objects.equals(this.nextYear, getGrowthEstimates200ResponseGrowthEstimates.nextYear) &&
        Objects.equals(this.next5YearsPa, getGrowthEstimates200ResponseGrowthEstimates.next5YearsPa) &&
        Objects.equals(this.past5YearsPa, getGrowthEstimates200ResponseGrowthEstimates.past5YearsPa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentQuarter, nextQuarter, currentYear, nextYear, next5YearsPa, past5YearsPa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGrowthEstimates200ResponseGrowthEstimates {\n");
    sb.append("    currentQuarter: ").append(toIndentedString(currentQuarter)).append("\n");
    sb.append("    nextQuarter: ").append(toIndentedString(nextQuarter)).append("\n");
    sb.append("    currentYear: ").append(toIndentedString(currentYear)).append("\n");
    sb.append("    nextYear: ").append(toIndentedString(nextYear)).append("\n");
    sb.append("    next5YearsPa: ").append(toIndentedString(next5YearsPa)).append("\n");
    sb.append("    past5YearsPa: ").append(toIndentedString(past5YearsPa)).append("\n");
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

    // add `current_quarter` to the URL query string
    if (getCurrentQuarter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_quarter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentQuarter()))));
    }

    // add `next_quarter` to the URL query string
    if (getNextQuarter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snext_quarter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextQuarter()))));
    }

    // add `current_year` to the URL query string
    if (getCurrentYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_year%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentYear()))));
    }

    // add `next_year` to the URL query string
    if (getNextYear() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snext_year%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextYear()))));
    }

    // add `next_5_years_pa` to the URL query string
    if (getNext5YearsPa() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snext_5_years_pa%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNext5YearsPa()))));
    }

    // add `past_5_years_pa` to the URL query string
    if (getPast5YearsPa() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spast_5_years_pa%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPast5YearsPa()))));
    }

    return joiner.toString();
  }
}

