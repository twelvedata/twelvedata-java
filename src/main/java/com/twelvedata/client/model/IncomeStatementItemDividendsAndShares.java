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
 * Dividends and shares information
 */
@JsonPropertyOrder({
  IncomeStatementItemDividendsAndShares.JSON_PROPERTY_DIVIDEND_PER_SHARE,
  IncomeStatementItemDividendsAndShares.JSON_PROPERTY_DILUTED_AVERAGE_SHARES,
  IncomeStatementItemDividendsAndShares.JSON_PROPERTY_BASIC_AVERAGE_SHARES,
  IncomeStatementItemDividendsAndShares.JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS,
  IncomeStatementItemDividendsAndShares.JSON_PROPERTY_OTHER_UNDER_PREFERRED_STOCK_DIVIDEND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemDividendsAndShares {
  public static final String JSON_PROPERTY_DIVIDEND_PER_SHARE = "dividend_per_share";
  @javax.annotation.Nullable
  private Double dividendPerShare;

  public static final String JSON_PROPERTY_DILUTED_AVERAGE_SHARES = "diluted_average_shares";
  @javax.annotation.Nullable
  private Double dilutedAverageShares;

  public static final String JSON_PROPERTY_BASIC_AVERAGE_SHARES = "basic_average_shares";
  @javax.annotation.Nullable
  private Double basicAverageShares;

  public static final String JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS = "preferred_stock_dividends";
  @javax.annotation.Nullable
  private Double preferredStockDividends;

  public static final String JSON_PROPERTY_OTHER_UNDER_PREFERRED_STOCK_DIVIDEND = "other_under_preferred_stock_dividend";
  @javax.annotation.Nullable
  private Double otherUnderPreferredStockDividend;

  public IncomeStatementItemDividendsAndShares() { 
  }

  public IncomeStatementItemDividendsAndShares dividendPerShare(@javax.annotation.Nullable Double dividendPerShare) {
    this.dividendPerShare = dividendPerShare;
    return this;
  }

  /**
   * Dividend per share
   * @return dividendPerShare
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PER_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDividendPerShare() {
    return dividendPerShare;
  }


  @JsonProperty(value = JSON_PROPERTY_DIVIDEND_PER_SHARE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendPerShare(@javax.annotation.Nullable Double dividendPerShare) {
    this.dividendPerShare = dividendPerShare;
  }


  public IncomeStatementItemDividendsAndShares dilutedAverageShares(@javax.annotation.Nullable Double dilutedAverageShares) {
    this.dilutedAverageShares = dilutedAverageShares;
    return this;
  }

  /**
   * Diluted average shares
   * @return dilutedAverageShares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DILUTED_AVERAGE_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDilutedAverageShares() {
    return dilutedAverageShares;
  }


  @JsonProperty(value = JSON_PROPERTY_DILUTED_AVERAGE_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDilutedAverageShares(@javax.annotation.Nullable Double dilutedAverageShares) {
    this.dilutedAverageShares = dilutedAverageShares;
  }


  public IncomeStatementItemDividendsAndShares basicAverageShares(@javax.annotation.Nullable Double basicAverageShares) {
    this.basicAverageShares = basicAverageShares;
    return this;
  }

  /**
   * Basic average shares
   * @return basicAverageShares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC_AVERAGE_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBasicAverageShares() {
    return basicAverageShares;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC_AVERAGE_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicAverageShares(@javax.annotation.Nullable Double basicAverageShares) {
    this.basicAverageShares = basicAverageShares;
  }


  public IncomeStatementItemDividendsAndShares preferredStockDividends(@javax.annotation.Nullable Double preferredStockDividends) {
    this.preferredStockDividends = preferredStockDividends;
    return this;
  }

  /**
   * Preferred stock dividends
   * @return preferredStockDividends
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPreferredStockDividends() {
    return preferredStockDividends;
  }


  @JsonProperty(value = JSON_PROPERTY_PREFERRED_STOCK_DIVIDENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredStockDividends(@javax.annotation.Nullable Double preferredStockDividends) {
    this.preferredStockDividends = preferredStockDividends;
  }


  public IncomeStatementItemDividendsAndShares otherUnderPreferredStockDividend(@javax.annotation.Nullable Double otherUnderPreferredStockDividend) {
    this.otherUnderPreferredStockDividend = otherUnderPreferredStockDividend;
    return this;
  }

  /**
   * Other under preferred stock dividend
   * @return otherUnderPreferredStockDividend
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_UNDER_PREFERRED_STOCK_DIVIDEND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherUnderPreferredStockDividend() {
    return otherUnderPreferredStockDividend;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_UNDER_PREFERRED_STOCK_DIVIDEND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherUnderPreferredStockDividend(@javax.annotation.Nullable Double otherUnderPreferredStockDividend) {
    this.otherUnderPreferredStockDividend = otherUnderPreferredStockDividend;
  }


  /**
   * Return true if this IncomeStatementItem_dividends_and_shares object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemDividendsAndShares incomeStatementItemDividendsAndShares = (IncomeStatementItemDividendsAndShares) o;
    return Objects.equals(this.dividendPerShare, incomeStatementItemDividendsAndShares.dividendPerShare) &&
        Objects.equals(this.dilutedAverageShares, incomeStatementItemDividendsAndShares.dilutedAverageShares) &&
        Objects.equals(this.basicAverageShares, incomeStatementItemDividendsAndShares.basicAverageShares) &&
        Objects.equals(this.preferredStockDividends, incomeStatementItemDividendsAndShares.preferredStockDividends) &&
        Objects.equals(this.otherUnderPreferredStockDividend, incomeStatementItemDividendsAndShares.otherUnderPreferredStockDividend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividendPerShare, dilutedAverageShares, basicAverageShares, preferredStockDividends, otherUnderPreferredStockDividend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemDividendsAndShares {\n");
    sb.append("    dividendPerShare: ").append(toIndentedString(dividendPerShare)).append("\n");
    sb.append("    dilutedAverageShares: ").append(toIndentedString(dilutedAverageShares)).append("\n");
    sb.append("    basicAverageShares: ").append(toIndentedString(basicAverageShares)).append("\n");
    sb.append("    preferredStockDividends: ").append(toIndentedString(preferredStockDividends)).append("\n");
    sb.append("    otherUnderPreferredStockDividend: ").append(toIndentedString(otherUnderPreferredStockDividend)).append("\n");
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

    // add `dividend_per_share` to the URL query string
    if (getDividendPerShare() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdividend_per_share%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDividendPerShare()))));
    }

    // add `diluted_average_shares` to the URL query string
    if (getDilutedAverageShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiluted_average_shares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDilutedAverageShares()))));
    }

    // add `basic_average_shares` to the URL query string
    if (getBasicAverageShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbasic_average_shares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBasicAverageShares()))));
    }

    // add `preferred_stock_dividends` to the URL query string
    if (getPreferredStockDividends() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreferred_stock_dividends%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreferredStockDividends()))));
    }

    // add `other_under_preferred_stock_dividend` to the URL query string
    if (getOtherUnderPreferredStockDividend() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_under_preferred_stock_dividend%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherUnderPreferredStockDividend()))));
    }

    return joiner.toString();
  }
}

