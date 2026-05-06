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
 * Dividends and splits information of the company
 */
@JsonPropertyOrder({
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_RATE,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_YIELD,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_RATE,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_YIELD,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_5YEAR_AVERAGE_DIVIDEND_YIELD,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_PAYOUT_RATIO,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_DIVIDEND_FREQUENCY,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_DIVIDEND_DATE,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_EX_DIVIDEND_DATE,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_LAST_SPLIT_FACTOR,
  GetStatistics200ResponseStatisticsDividendsAndSplits.JSON_PROPERTY_LAST_SPLIT_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetStatistics200ResponseStatisticsDividendsAndSplits {
  public static final String JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_RATE = "forward_annual_dividend_rate";
  @javax.annotation.Nullable
  private Double forwardAnnualDividendRate;

  public static final String JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_YIELD = "forward_annual_dividend_yield";
  @javax.annotation.Nullable
  private Double forwardAnnualDividendYield;

  public static final String JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_RATE = "trailing_annual_dividend_rate";
  @javax.annotation.Nullable
  private Double trailingAnnualDividendRate;

  public static final String JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_YIELD = "trailing_annual_dividend_yield";
  @javax.annotation.Nullable
  private Double trailingAnnualDividendYield;

  public static final String JSON_PROPERTY_5YEAR_AVERAGE_DIVIDEND_YIELD = "5_year_average_dividend_yield";
  @javax.annotation.Nullable
  private Double _5yearAverageDividendYield;

  public static final String JSON_PROPERTY_PAYOUT_RATIO = "payout_ratio";
  @javax.annotation.Nullable
  private Double payoutRatio;

  public static final String JSON_PROPERTY_DIVIDEND_FREQUENCY = "dividend_frequency";
  @javax.annotation.Nullable
  private String dividendFrequency;

  public static final String JSON_PROPERTY_DIVIDEND_DATE = "dividend_date";
  @javax.annotation.Nullable
  private String dividendDate;

  public static final String JSON_PROPERTY_EX_DIVIDEND_DATE = "ex_dividend_date";
  @javax.annotation.Nullable
  private String exDividendDate;

  public static final String JSON_PROPERTY_LAST_SPLIT_FACTOR = "last_split_factor";
  @javax.annotation.Nullable
  private String lastSplitFactor;

  public static final String JSON_PROPERTY_LAST_SPLIT_DATE = "last_split_date";
  @javax.annotation.Nullable
  private String lastSplitDate;

  public GetStatistics200ResponseStatisticsDividendsAndSplits() { 
  }

  public GetStatistics200ResponseStatisticsDividendsAndSplits forwardAnnualDividendRate(@javax.annotation.Nullable Double forwardAnnualDividendRate) {
    this.forwardAnnualDividendRate = forwardAnnualDividendRate;
    return this;
  }

  /**
   * Refers to the forward dividend yield estimation in the currency of instrument
   * @return forwardAnnualDividendRate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getForwardAnnualDividendRate() {
    return forwardAnnualDividendRate;
  }


  @JsonProperty(value = JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardAnnualDividendRate(@javax.annotation.Nullable Double forwardAnnualDividendRate) {
    this.forwardAnnualDividendRate = forwardAnnualDividendRate;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits forwardAnnualDividendYield(@javax.annotation.Nullable Double forwardAnnualDividendYield) {
    this.forwardAnnualDividendYield = forwardAnnualDividendYield;
    return this;
  }

  /**
   * Refers to the forward dividend yield percentage relative to stock price
   * @return forwardAnnualDividendYield
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getForwardAnnualDividendYield() {
    return forwardAnnualDividendYield;
  }


  @JsonProperty(value = JSON_PROPERTY_FORWARD_ANNUAL_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardAnnualDividendYield(@javax.annotation.Nullable Double forwardAnnualDividendYield) {
    this.forwardAnnualDividendYield = forwardAnnualDividendYield;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits trailingAnnualDividendRate(@javax.annotation.Nullable Double trailingAnnualDividendRate) {
    this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    return this;
  }

  /**
   * Refers to the trailing dividend yield rate in the currency of instrument over the last 12 months
   * @return trailingAnnualDividendRate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTrailingAnnualDividendRate() {
    return trailingAnnualDividendRate;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrailingAnnualDividendRate(@javax.annotation.Nullable Double trailingAnnualDividendRate) {
    this.trailingAnnualDividendRate = trailingAnnualDividendRate;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits trailingAnnualDividendYield(@javax.annotation.Nullable Double trailingAnnualDividendYield) {
    this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    return this;
  }

  /**
   * Refers to the trailing dividend yield percentage relative to stock price
   * @return trailingAnnualDividendYield
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTrailingAnnualDividendYield() {
    return trailingAnnualDividendYield;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAILING_ANNUAL_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrailingAnnualDividendYield(@javax.annotation.Nullable Double trailingAnnualDividendYield) {
    this.trailingAnnualDividendYield = trailingAnnualDividendYield;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits _5yearAverageDividendYield(@javax.annotation.Nullable Double _5yearAverageDividendYield) {
    this._5yearAverageDividendYield = _5yearAverageDividendYield;
    return this;
  }

  /**
   * Refers to the average 5 years dividend yield
   * @return _5yearAverageDividendYield
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_5YEAR_AVERAGE_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double get5yearAverageDividendYield() {
    return _5yearAverageDividendYield;
  }


  @JsonProperty(value = JSON_PROPERTY_5YEAR_AVERAGE_DIVIDEND_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set5yearAverageDividendYield(@javax.annotation.Nullable Double _5yearAverageDividendYield) {
    this._5yearAverageDividendYield = _5yearAverageDividendYield;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits payoutRatio(@javax.annotation.Nullable Double payoutRatio) {
    this.payoutRatio = payoutRatio;
    return this;
  }

  /**
   * Refers to payout ratio, showing the proportion of earnings a company pays its shareholders in the form of dividends
   * @return payoutRatio
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAYOUT_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPayoutRatio() {
    return payoutRatio;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYOUT_RATIO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutRatio(@javax.annotation.Nullable Double payoutRatio) {
    this.payoutRatio = payoutRatio;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits dividendFrequency(@javax.annotation.Nullable String dividendFrequency) {
    this.dividendFrequency = dividendFrequency;
    return this;
  }

  /**
   * Refers to how often a stock or fund pays dividends
   * @return dividendFrequency
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_FREQUENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDividendFrequency() {
    return dividendFrequency;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_FREQUENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendFrequency(@javax.annotation.Nullable String dividendFrequency) {
    this.dividendFrequency = dividendFrequency;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits dividendDate(@javax.annotation.Nullable String dividendDate) {
    this.dividendDate = dividendDate;
    return this;
  }

  /**
   * Refers to the last dividend payout date
   * @return dividendDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDividendDate() {
    return dividendDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendDate(@javax.annotation.Nullable String dividendDate) {
    this.dividendDate = dividendDate;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits exDividendDate(@javax.annotation.Nullable String exDividendDate) {
    this.exDividendDate = exDividendDate;
    return this;
  }

  /**
   * Refers to the last ex-dividend payout date
   * @return exDividendDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EX_DIVIDEND_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExDividendDate() {
    return exDividendDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EX_DIVIDEND_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExDividendDate(@javax.annotation.Nullable String exDividendDate) {
    this.exDividendDate = exDividendDate;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits lastSplitFactor(@javax.annotation.Nullable String lastSplitFactor) {
    this.lastSplitFactor = lastSplitFactor;
    return this;
  }

  /**
   * Specification of the last split event
   * @return lastSplitFactor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_SPLIT_FACTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastSplitFactor() {
    return lastSplitFactor;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_SPLIT_FACTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSplitFactor(@javax.annotation.Nullable String lastSplitFactor) {
    this.lastSplitFactor = lastSplitFactor;
  }


  public GetStatistics200ResponseStatisticsDividendsAndSplits lastSplitDate(@javax.annotation.Nullable String lastSplitDate) {
    this.lastSplitDate = lastSplitDate;
    return this;
  }

  /**
   * Refers for the last split date
   * @return lastSplitDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_SPLIT_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastSplitDate() {
    return lastSplitDate;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_SPLIT_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSplitDate(@javax.annotation.Nullable String lastSplitDate) {
    this.lastSplitDate = lastSplitDate;
  }


  /**
   * Return true if this GetStatistics_200_response_statistics_dividends_and_splits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatistics200ResponseStatisticsDividendsAndSplits getStatistics200ResponseStatisticsDividendsAndSplits = (GetStatistics200ResponseStatisticsDividendsAndSplits) o;
    return Objects.equals(this.forwardAnnualDividendRate, getStatistics200ResponseStatisticsDividendsAndSplits.forwardAnnualDividendRate) &&
        Objects.equals(this.forwardAnnualDividendYield, getStatistics200ResponseStatisticsDividendsAndSplits.forwardAnnualDividendYield) &&
        Objects.equals(this.trailingAnnualDividendRate, getStatistics200ResponseStatisticsDividendsAndSplits.trailingAnnualDividendRate) &&
        Objects.equals(this.trailingAnnualDividendYield, getStatistics200ResponseStatisticsDividendsAndSplits.trailingAnnualDividendYield) &&
        Objects.equals(this._5yearAverageDividendYield, getStatistics200ResponseStatisticsDividendsAndSplits._5yearAverageDividendYield) &&
        Objects.equals(this.payoutRatio, getStatistics200ResponseStatisticsDividendsAndSplits.payoutRatio) &&
        Objects.equals(this.dividendFrequency, getStatistics200ResponseStatisticsDividendsAndSplits.dividendFrequency) &&
        Objects.equals(this.dividendDate, getStatistics200ResponseStatisticsDividendsAndSplits.dividendDate) &&
        Objects.equals(this.exDividendDate, getStatistics200ResponseStatisticsDividendsAndSplits.exDividendDate) &&
        Objects.equals(this.lastSplitFactor, getStatistics200ResponseStatisticsDividendsAndSplits.lastSplitFactor) &&
        Objects.equals(this.lastSplitDate, getStatistics200ResponseStatisticsDividendsAndSplits.lastSplitDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardAnnualDividendRate, forwardAnnualDividendYield, trailingAnnualDividendRate, trailingAnnualDividendYield, _5yearAverageDividendYield, payoutRatio, dividendFrequency, dividendDate, exDividendDate, lastSplitFactor, lastSplitDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatistics200ResponseStatisticsDividendsAndSplits {\n");
    sb.append("    forwardAnnualDividendRate: ").append(toIndentedString(forwardAnnualDividendRate)).append("\n");
    sb.append("    forwardAnnualDividendYield: ").append(toIndentedString(forwardAnnualDividendYield)).append("\n");
    sb.append("    trailingAnnualDividendRate: ").append(toIndentedString(trailingAnnualDividendRate)).append("\n");
    sb.append("    trailingAnnualDividendYield: ").append(toIndentedString(trailingAnnualDividendYield)).append("\n");
    sb.append("    _5yearAverageDividendYield: ").append(toIndentedString(_5yearAverageDividendYield)).append("\n");
    sb.append("    payoutRatio: ").append(toIndentedString(payoutRatio)).append("\n");
    sb.append("    dividendFrequency: ").append(toIndentedString(dividendFrequency)).append("\n");
    sb.append("    dividendDate: ").append(toIndentedString(dividendDate)).append("\n");
    sb.append("    exDividendDate: ").append(toIndentedString(exDividendDate)).append("\n");
    sb.append("    lastSplitFactor: ").append(toIndentedString(lastSplitFactor)).append("\n");
    sb.append("    lastSplitDate: ").append(toIndentedString(lastSplitDate)).append("\n");
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

    // add `forward_annual_dividend_rate` to the URL query string
    if (getForwardAnnualDividendRate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforward_annual_dividend_rate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForwardAnnualDividendRate()))));
    }

    // add `forward_annual_dividend_yield` to the URL query string
    if (getForwardAnnualDividendYield() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforward_annual_dividend_yield%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForwardAnnualDividendYield()))));
    }

    // add `trailing_annual_dividend_rate` to the URL query string
    if (getTrailingAnnualDividendRate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strailing_annual_dividend_rate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrailingAnnualDividendRate()))));
    }

    // add `trailing_annual_dividend_yield` to the URL query string
    if (getTrailingAnnualDividendYield() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strailing_annual_dividend_yield%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrailingAnnualDividendYield()))));
    }

    // add `5_year_average_dividend_yield` to the URL query string
    if (get5yearAverageDividendYield() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%s5_year_average_dividend_yield%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(get5yearAverageDividendYield()))));
    }

    // add `payout_ratio` to the URL query string
    if (getPayoutRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spayout_ratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPayoutRatio()))));
    }

    // add `dividend_frequency` to the URL query string
    if (getDividendFrequency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_frequency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendFrequency()))));
    }

    // add `dividend_date` to the URL query string
    if (getDividendDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendDate()))));
    }

    // add `ex_dividend_date` to the URL query string
    if (getExDividendDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sex_dividend_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExDividendDate()))));
    }

    // add `last_split_factor` to the URL query string
    if (getLastSplitFactor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_split_factor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastSplitFactor()))));
    }

    // add `last_split_date` to the URL query string
    if (getLastSplitDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_split_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastSplitDate()))));
    }

    return joiner.toString();
  }
}

