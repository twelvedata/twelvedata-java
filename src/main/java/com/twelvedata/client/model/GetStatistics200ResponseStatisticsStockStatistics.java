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
 * Stock statistics of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_SHARES_OUTSTANDING,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_FLOAT_SHARES,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_AVG10_VOLUME,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_AVG90_VOLUME,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_SHARES_SHORT,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_SHORT_RATIO,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_SHORT_PERCENT_OF_SHARES_OUTSTANDING,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_PERCENT_HELD_BY_INSIDERS,
  GetStatistics200ResponseStatisticsStockStatistics.JSON_PROPERTY_PERCENT_HELD_BY_INSTITUTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsStockStatistics {
  public static final String JSON_PROPERTY_SHARES_OUTSTANDING = "shares_outstanding";
  @javax.annotation.Nullable
  private Double sharesOutstanding;

  public static final String JSON_PROPERTY_FLOAT_SHARES = "float_shares";
  @javax.annotation.Nullable
  private Double floatShares;

  public static final String JSON_PROPERTY_AVG10_VOLUME = "avg_10_volume";
  @javax.annotation.Nullable
  private Long avg10Volume;

  public static final String JSON_PROPERTY_AVG90_VOLUME = "avg_90_volume";
  @javax.annotation.Nullable
  private Long avg90Volume;

  public static final String JSON_PROPERTY_SHARES_SHORT = "shares_short";
  @javax.annotation.Nullable
  private Long sharesShort;

  public static final String JSON_PROPERTY_SHORT_RATIO = "short_ratio";
  @javax.annotation.Nullable
  private Double shortRatio;

  public static final String JSON_PROPERTY_SHORT_PERCENT_OF_SHARES_OUTSTANDING = "short_percent_of_shares_outstanding";
  @javax.annotation.Nullable
  private Double shortPercentOfSharesOutstanding;

  public static final String JSON_PROPERTY_PERCENT_HELD_BY_INSIDERS = "percent_held_by_insiders";
  @javax.annotation.Nullable
  private Double percentHeldByInsiders;

  public static final String JSON_PROPERTY_PERCENT_HELD_BY_INSTITUTIONS = "percent_held_by_institutions";
  @javax.annotation.Nullable
  private Double percentHeldByInstitutions;

  public GetStatistics200ResponseStatisticsStockStatistics() { 
  }

  public GetStatistics200ResponseStatisticsStockStatistics sharesOutstanding(@javax.annotation.Nullable Double sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

  /**
   * Refers for the shares outstanding currently held by all its shareholders
   * @return sharesOutstanding
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSharesOutstanding() {
    return sharesOutstanding;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharesOutstanding(@javax.annotation.Nullable Double sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }


  public GetStatistics200ResponseStatisticsStockStatistics floatShares(@javax.annotation.Nullable Double floatShares) {
    this.floatShares = floatShares;
    return this;
  }

  /**
   * Refers to floating stock is the number of public shares a company has available for trading on the open market
   * @return floatShares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FLOAT_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFloatShares() {
    return floatShares;
  }


  @JsonProperty(value = JSON_PROPERTY_FLOAT_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloatShares(@javax.annotation.Nullable Double floatShares) {
    this.floatShares = floatShares;
  }


  public GetStatistics200ResponseStatisticsStockStatistics avg10Volume(@javax.annotation.Nullable Long avg10Volume) {
    this.avg10Volume = avg10Volume;
    return this;
  }

  /**
   * Refers to the average 10 days volume
   * @return avg10Volume
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVG10_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvg10Volume() {
    return avg10Volume;
  }


  @JsonProperty(value = JSON_PROPERTY_AVG10_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvg10Volume(@javax.annotation.Nullable Long avg10Volume) {
    this.avg10Volume = avg10Volume;
  }


  public GetStatistics200ResponseStatisticsStockStatistics avg90Volume(@javax.annotation.Nullable Long avg90Volume) {
    this.avg90Volume = avg90Volume;
    return this;
  }

  /**
   * Refers to the average 90 days volume
   * @return avg90Volume
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AVG90_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvg90Volume() {
    return avg90Volume;
  }


  @JsonProperty(value = JSON_PROPERTY_AVG90_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvg90Volume(@javax.annotation.Nullable Long avg90Volume) {
    this.avg90Volume = avg90Volume;
  }


  public GetStatistics200ResponseStatisticsStockStatistics sharesShort(@javax.annotation.Nullable Long sharesShort) {
    this.sharesShort = sharesShort;
    return this;
  }

  /**
   * Refers to the number of shares that have been shorted
   * @return sharesShort
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARES_SHORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSharesShort() {
    return sharesShort;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARES_SHORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharesShort(@javax.annotation.Nullable Long sharesShort) {
    this.sharesShort = sharesShort;
  }


  public GetStatistics200ResponseStatisticsStockStatistics shortRatio(@javax.annotation.Nullable Double shortRatio) {
    this.shortRatio = shortRatio;
    return this;
  }

  /**
   * Refers to short ratio measure
   * @return shortRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShortRatio() {
    return shortRatio;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortRatio(@javax.annotation.Nullable Double shortRatio) {
    this.shortRatio = shortRatio;
  }


  public GetStatistics200ResponseStatisticsStockStatistics shortPercentOfSharesOutstanding(@javax.annotation.Nullable Double shortPercentOfSharesOutstanding) {
    this.shortPercentOfSharesOutstanding = shortPercentOfSharesOutstanding;
    return this;
  }

  /**
   * Refers to the number of shorted shares divided by the number of shares outstanding
   * @return shortPercentOfSharesOutstanding
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT_PERCENT_OF_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getShortPercentOfSharesOutstanding() {
    return shortPercentOfSharesOutstanding;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT_PERCENT_OF_SHARES_OUTSTANDING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortPercentOfSharesOutstanding(@javax.annotation.Nullable Double shortPercentOfSharesOutstanding) {
    this.shortPercentOfSharesOutstanding = shortPercentOfSharesOutstanding;
  }


  public GetStatistics200ResponseStatisticsStockStatistics percentHeldByInsiders(@javax.annotation.Nullable Double percentHeldByInsiders) {
    this.percentHeldByInsiders = percentHeldByInsiders;
    return this;
  }

  /**
   * Refers to the percentage of shares held by the company insiders
   * @return percentHeldByInsiders
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD_BY_INSIDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentHeldByInsiders() {
    return percentHeldByInsiders;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD_BY_INSIDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentHeldByInsiders(@javax.annotation.Nullable Double percentHeldByInsiders) {
    this.percentHeldByInsiders = percentHeldByInsiders;
  }


  public GetStatistics200ResponseStatisticsStockStatistics percentHeldByInstitutions(@javax.annotation.Nullable Double percentHeldByInstitutions) {
    this.percentHeldByInstitutions = percentHeldByInstitutions;
    return this;
  }

  /**
   * Refers to the percentage of shares held by the institutions
   * @return percentHeldByInstitutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD_BY_INSTITUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentHeldByInstitutions() {
    return percentHeldByInstitutions;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD_BY_INSTITUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentHeldByInstitutions(@javax.annotation.Nullable Double percentHeldByInstitutions) {
    this.percentHeldByInstitutions = percentHeldByInstitutions;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_stock_statistics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsStockStatistics getStatistics200ResponseStatisticsStockStatistics = (GetStatistics200ResponseStatisticsStockStatistics) o;
    return Objects.equals(this.sharesOutstanding, getStatistics200ResponseStatisticsStockStatistics.sharesOutstanding) &&
        Objects.equals(this.floatShares, getStatistics200ResponseStatisticsStockStatistics.floatShares) &&
        Objects.equals(this.avg10Volume, getStatistics200ResponseStatisticsStockStatistics.avg10Volume) &&
        Objects.equals(this.avg90Volume, getStatistics200ResponseStatisticsStockStatistics.avg90Volume) &&
        Objects.equals(this.sharesShort, getStatistics200ResponseStatisticsStockStatistics.sharesShort) &&
        Objects.equals(this.shortRatio, getStatistics200ResponseStatisticsStockStatistics.shortRatio) &&
        Objects.equals(this.shortPercentOfSharesOutstanding, getStatistics200ResponseStatisticsStockStatistics.shortPercentOfSharesOutstanding) &&
        Objects.equals(this.percentHeldByInsiders, getStatistics200ResponseStatisticsStockStatistics.percentHeldByInsiders) &&
        Objects.equals(this.percentHeldByInstitutions, getStatistics200ResponseStatisticsStockStatistics.percentHeldByInstitutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharesOutstanding, floatShares, avg10Volume, avg90Volume, sharesShort, shortRatio, shortPercentOfSharesOutstanding, percentHeldByInsiders, percentHeldByInstitutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsStockStatistics {\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    floatShares: ").append(toIndentedString(floatShares)).append("\n");
    sb.append("    avg10Volume: ").append(toIndentedString(avg10Volume)).append("\n");
    sb.append("    avg90Volume: ").append(toIndentedString(avg90Volume)).append("\n");
    sb.append("    sharesShort: ").append(toIndentedString(sharesShort)).append("\n");
    sb.append("    shortRatio: ").append(toIndentedString(shortRatio)).append("\n");
    sb.append("    shortPercentOfSharesOutstanding: ").append(toIndentedString(shortPercentOfSharesOutstanding)).append("\n");
    sb.append("    percentHeldByInsiders: ").append(toIndentedString(percentHeldByInsiders)).append("\n");
    sb.append("    percentHeldByInstitutions: ").append(toIndentedString(percentHeldByInstitutions)).append("\n");
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

    // add `shares_outstanding` to the URL query string
    if (getSharesOutstanding() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshares_outstanding%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSharesOutstanding()))));
    }

    // add `float_shares` to the URL query string
    if (getFloatShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfloat_shares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFloatShares()))));
    }

    // add `avg_10_volume` to the URL query string
    if (getAvg10Volume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%savg_10_volume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvg10Volume()))));
    }

    // add `avg_90_volume` to the URL query string
    if (getAvg90Volume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%savg_90_volume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAvg90Volume()))));
    }

    // add `shares_short` to the URL query string
    if (getSharesShort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshares_short%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSharesShort()))));
    }

    // add `short_ratio` to the URL query string
    if (getShortRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_ratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortRatio()))));
    }

    // add `short_percent_of_shares_outstanding` to the URL query string
    if (getShortPercentOfSharesOutstanding() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort_percent_of_shares_outstanding%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShortPercentOfSharesOutstanding()))));
    }

    // add `percent_held_by_insiders` to the URL query string
    if (getPercentHeldByInsiders() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_held_by_insiders%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentHeldByInsiders()))));
    }

    // add `percent_held_by_institutions` to the URL query string
    if (getPercentHeldByInstitutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_held_by_institutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentHeldByInstitutions()))));
    }

    return joiner.toString();
  }
}

