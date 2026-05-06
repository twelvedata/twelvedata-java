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
 * A brief summary of a ETF
 */
@JsonPropertyOrder({
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_SYMBOL,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_NAME,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_FUND_FAMILY,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_FUND_TYPE,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_CURRENCY,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_SHARE_CLASS_INCEPTION_DATE,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_YTD_RETURN,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_EXPENSE_RATIO_NET,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_YIELD,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_NAV,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_LAST_PRICE,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_TURNOVER_RATE,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_NET_ASSETS,
  GetETFsWorldSummary200ResponseEtfSummary.JSON_PROPERTY_OVERVIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetETFsWorldSummary200ResponseEtfSummary {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_FUND_FAMILY = "fund_family";
  @javax.annotation.Nullable
  private String fundFamily;

  public static final String JSON_PROPERTY_FUND_TYPE = "fund_type";
  @javax.annotation.Nullable
  private String fundType;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_SHARE_CLASS_INCEPTION_DATE = "share_class_inception_date";
  @javax.annotation.Nullable
  private String shareClassInceptionDate;

  public static final String JSON_PROPERTY_YTD_RETURN = "ytd_return";
  @javax.annotation.Nullable
  private Double ytdReturn;

  public static final String JSON_PROPERTY_EXPENSE_RATIO_NET = "expense_ratio_net";
  @javax.annotation.Nullable
  private Double expenseRatioNet;

  public static final String JSON_PROPERTY_YIELD = "yield";
  @javax.annotation.Nullable
  private Double yield;

  public static final String JSON_PROPERTY_NAV = "nav";
  @javax.annotation.Nullable
  private Double nav;

  public static final String JSON_PROPERTY_LAST_PRICE = "last_price";
  @javax.annotation.Nullable
  private Double lastPrice;

  public static final String JSON_PROPERTY_TURNOVER_RATE = "turnover_rate";
  @javax.annotation.Nullable
  private Double turnoverRate;

  public static final String JSON_PROPERTY_NET_ASSETS = "net_assets";
  @javax.annotation.Nullable
  private Long netAssets;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  @javax.annotation.Nullable
  private String overview;

  public GetETFsWorldSummary200ResponseEtfSummary() { 
  }

  public GetETFsWorldSummary200ResponseEtfSummary symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * All available fund types segmented by country
   * @return symbol
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
  }


  public GetETFsWorldSummary200ResponseEtfSummary name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Fund name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetETFsWorldSummary200ResponseEtfSummary fundFamily(@javax.annotation.Nullable String fundFamily) {
    this.fundFamily = fundFamily;
    return this;
  }

  /**
   * Investment company that manages the fund
   * @return fundFamily
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFundFamily() {
    return fundFamily;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_FAMILY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundFamily(@javax.annotation.Nullable String fundFamily) {
    this.fundFamily = fundFamily;
  }


  public GetETFsWorldSummary200ResponseEtfSummary fundType(@javax.annotation.Nullable String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Type of the fund
   * @return fundType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFundType() {
    return fundType;
  }


  @JsonProperty(value = JSON_PROPERTY_FUND_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundType(@javax.annotation.Nullable String fundType) {
    this.fundType = fundType;
  }


  public GetETFsWorldSummary200ResponseEtfSummary currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of fund price
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetETFsWorldSummary200ResponseEtfSummary shareClassInceptionDate(@javax.annotation.Nullable String shareClassInceptionDate) {
    this.shareClassInceptionDate = shareClassInceptionDate;
    return this;
  }

  /**
   * The date from which the fund started operations and the returns are calculated
   * @return shareClassInceptionDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARE_CLASS_INCEPTION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShareClassInceptionDate() {
    return shareClassInceptionDate;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARE_CLASS_INCEPTION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareClassInceptionDate(@javax.annotation.Nullable String shareClassInceptionDate) {
    this.shareClassInceptionDate = shareClassInceptionDate;
  }


  public GetETFsWorldSummary200ResponseEtfSummary ytdReturn(@javax.annotation.Nullable Double ytdReturn) {
    this.ytdReturn = ytdReturn;
    return this;
  }

  /**
   * Percentage of profit of the fund since the first trading day of the current calendar year
   * @return ytdReturn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YTD_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getYtdReturn() {
    return ytdReturn;
  }


  @JsonProperty(value = JSON_PROPERTY_YTD_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYtdReturn(@javax.annotation.Nullable Double ytdReturn) {
    this.ytdReturn = ytdReturn;
  }


  public GetETFsWorldSummary200ResponseEtfSummary expenseRatioNet(@javax.annotation.Nullable Double expenseRatioNet) {
    this.expenseRatioNet = expenseRatioNet;
    return this;
  }

  /**
   * Percentage of ETF assets steered toward a fund&#39;s operating expenses and fund management fees
   * @return expenseRatioNet
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_NET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getExpenseRatioNet() {
    return expenseRatioNet;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSE_RATIO_NET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenseRatioNet(@javax.annotation.Nullable Double expenseRatioNet) {
    this.expenseRatioNet = expenseRatioNet;
  }


  public GetETFsWorldSummary200ResponseEtfSummary yield(@javax.annotation.Nullable Double yield) {
    this.yield = yield;
    return this;
  }

  /**
   * Income returned to its investors through interest and dividends generated by the fund&#39;s investments
   * @return yield
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getYield() {
    return yield;
  }


  @JsonProperty(value = JSON_PROPERTY_YIELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYield(@javax.annotation.Nullable Double yield) {
    this.yield = yield;
  }


  public GetETFsWorldSummary200ResponseEtfSummary nav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
    return this;
  }

  /**
   * Net Asset Value: fund value minus liabilities
   * @return nav
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNav() {
    return nav;
  }


  @JsonProperty(value = JSON_PROPERTY_NAV, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNav(@javax.annotation.Nullable Double nav) {
    this.nav = nav;
  }


  public GetETFsWorldSummary200ResponseEtfSummary lastPrice(@javax.annotation.Nullable Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  /**
   * Last price of the fund
   * @return lastPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLastPrice() {
    return lastPrice;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPrice(@javax.annotation.Nullable Double lastPrice) {
    this.lastPrice = lastPrice;
  }


  public GetETFsWorldSummary200ResponseEtfSummary turnoverRate(@javax.annotation.Nullable Double turnoverRate) {
    this.turnoverRate = turnoverRate;
    return this;
  }

  /**
   * Percentage rate at which ETF replaces its holdings on investment every year
   * @return turnoverRate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TURNOVER_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTurnoverRate() {
    return turnoverRate;
  }


  @JsonProperty(value = JSON_PROPERTY_TURNOVER_RATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTurnoverRate(@javax.annotation.Nullable Double turnoverRate) {
    this.turnoverRate = turnoverRate;
  }


  public GetETFsWorldSummary200ResponseEtfSummary netAssets(@javax.annotation.Nullable Long netAssets) {
    this.netAssets = netAssets;
    return this;
  }

  /**
   * Total assets of a fund minus its total liabilities
   * @return netAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNetAssets() {
    return netAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetAssets(@javax.annotation.Nullable Long netAssets) {
    this.netAssets = netAssets;
  }


  public GetETFsWorldSummary200ResponseEtfSummary overview(@javax.annotation.Nullable String overview) {
    this.overview = overview;
    return this;
  }

  /**
   * Description of the fund
   * @return overview
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OVERVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOverview() {
    return overview;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERVIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverview(@javax.annotation.Nullable String overview) {
    this.overview = overview;
  }


  /**
   * Return true if this GetETFsWorldSummary_200_response_etf_summary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetETFsWorldSummary200ResponseEtfSummary getETFsWorldSummary200ResponseEtfSummary = (GetETFsWorldSummary200ResponseEtfSummary) o;
    return Objects.equals(this.symbol, getETFsWorldSummary200ResponseEtfSummary.symbol) &&
        Objects.equals(this.name, getETFsWorldSummary200ResponseEtfSummary.name) &&
        Objects.equals(this.fundFamily, getETFsWorldSummary200ResponseEtfSummary.fundFamily) &&
        Objects.equals(this.fundType, getETFsWorldSummary200ResponseEtfSummary.fundType) &&
        Objects.equals(this.currency, getETFsWorldSummary200ResponseEtfSummary.currency) &&
        Objects.equals(this.shareClassInceptionDate, getETFsWorldSummary200ResponseEtfSummary.shareClassInceptionDate) &&
        Objects.equals(this.ytdReturn, getETFsWorldSummary200ResponseEtfSummary.ytdReturn) &&
        Objects.equals(this.expenseRatioNet, getETFsWorldSummary200ResponseEtfSummary.expenseRatioNet) &&
        Objects.equals(this.yield, getETFsWorldSummary200ResponseEtfSummary.yield) &&
        Objects.equals(this.nav, getETFsWorldSummary200ResponseEtfSummary.nav) &&
        Objects.equals(this.lastPrice, getETFsWorldSummary200ResponseEtfSummary.lastPrice) &&
        Objects.equals(this.turnoverRate, getETFsWorldSummary200ResponseEtfSummary.turnoverRate) &&
        Objects.equals(this.netAssets, getETFsWorldSummary200ResponseEtfSummary.netAssets) &&
        Objects.equals(this.overview, getETFsWorldSummary200ResponseEtfSummary.overview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, fundFamily, fundType, currency, shareClassInceptionDate, ytdReturn, expenseRatioNet, yield, nav, lastPrice, turnoverRate, netAssets, overview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetETFsWorldSummary200ResponseEtfSummary {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fundFamily: ").append(toIndentedString(fundFamily)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shareClassInceptionDate: ").append(toIndentedString(shareClassInceptionDate)).append("\n");
    sb.append("    ytdReturn: ").append(toIndentedString(ytdReturn)).append("\n");
    sb.append("    expenseRatioNet: ").append(toIndentedString(expenseRatioNet)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    turnoverRate: ").append(toIndentedString(turnoverRate)).append("\n");
    sb.append("    netAssets: ").append(toIndentedString(netAssets)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
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

    // add `symbol` to the URL query string
    if (getSymbol() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssymbol%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSymbol()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `fund_family` to the URL query string
    if (getFundFamily() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_family%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundFamily()))));
    }

    // add `fund_type` to the URL query string
    if (getFundType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfund_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFundType()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `share_class_inception_date` to the URL query string
    if (getShareClassInceptionDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshare_class_inception_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShareClassInceptionDate()))));
    }

    // add `ytd_return` to the URL query string
    if (getYtdReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sytd_return%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYtdReturn()))));
    }

    // add `expense_ratio_net` to the URL query string
    if (getExpenseRatioNet() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpense_ratio_net%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpenseRatioNet()))));
    }

    // add `yield` to the URL query string
    if (getYield() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syield%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYield()))));
    }

    // add `nav` to the URL query string
    if (getNav() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snav%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNav()))));
    }

    // add `last_price` to the URL query string
    if (getLastPrice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_price%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastPrice()))));
    }

    // add `turnover_rate` to the URL query string
    if (getTurnoverRate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sturnover_rate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTurnoverRate()))));
    }

    // add `net_assets` to the URL query string
    if (getNetAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_assets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetAssets()))));
    }

    // add `overview` to the URL query string
    if (getOverview() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soverview%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOverview()))));
    }

    return joiner.toString();
  }
}

