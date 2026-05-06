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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * A brief summary of a mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_SYMBOL,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_NAME,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_FUND_FAMILY,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_FUND_TYPE,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_CURRENCY,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_SHARE_CLASS_INCEPTION_DATE,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_YTD_RETURN,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_EXPENSE_RATIO_NET,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_YIELD,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_NAV,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_MIN_INVESTMENT,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_TURNOVER_RATE,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_NET_ASSETS,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_OVERVIEW,
  GetMutualFundsWorld200ResponseMutualFundSummary.JSON_PROPERTY_PEOPLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundSummary {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nullable
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
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

  public static final String JSON_PROPERTY_MIN_INVESTMENT = "min_investment";
  @javax.annotation.Nullable
  private Long minInvestment;

  public static final String JSON_PROPERTY_TURNOVER_RATE = "turnover_rate";
  @javax.annotation.Nullable
  private Double turnoverRate;

  public static final String JSON_PROPERTY_NET_ASSETS = "net_assets";
  @javax.annotation.Nullable
  private Long netAssets;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  @javax.annotation.Nullable
  private String overview;

  public static final String JSON_PROPERTY_PEOPLE = "people";
  @javax.annotation.Nullable
  private List<GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner> people = new ArrayList<>();

  public GetMutualFundsWorld200ResponseMutualFundSummary() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundSummary symbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * All available fund types segmented by country
   * @return symbol
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(value = JSON_PROPERTY_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(@javax.annotation.Nullable String symbol) {
    this.symbol = symbol;
  }


  public GetMutualFundsWorld200ResponseMutualFundSummary name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Fund name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetMutualFundsWorld200ResponseMutualFundSummary fundFamily(@javax.annotation.Nullable String fundFamily) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary fundType(@javax.annotation.Nullable String fundType) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary currency(@javax.annotation.Nullable String currency) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary shareClassInceptionDate(@javax.annotation.Nullable String shareClassInceptionDate) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary ytdReturn(@javax.annotation.Nullable Double ytdReturn) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary expenseRatioNet(@javax.annotation.Nullable Double expenseRatioNet) {
    this.expenseRatioNet = expenseRatioNet;
    return this;
  }

  /**
   * Percentage of mutual fund assets steered toward a fund&#39;s operating expenses and fund management fees
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


  public GetMutualFundsWorld200ResponseMutualFundSummary yield(@javax.annotation.Nullable Double yield) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary nav(@javax.annotation.Nullable Double nav) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary minInvestment(@javax.annotation.Nullable Long minInvestment) {
    this.minInvestment = minInvestment;
    return this;
  }

  /**
   * Investment minimum
   * @return minInvestment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinInvestment() {
    return minInvestment;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_INVESTMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinInvestment(@javax.annotation.Nullable Long minInvestment) {
    this.minInvestment = minInvestment;
  }


  public GetMutualFundsWorld200ResponseMutualFundSummary turnoverRate(@javax.annotation.Nullable Double turnoverRate) {
    this.turnoverRate = turnoverRate;
    return this;
  }

  /**
   * Percentage rate at which mutual fund replaces its holdings on investment every year
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


  public GetMutualFundsWorld200ResponseMutualFundSummary netAssets(@javax.annotation.Nullable Long netAssets) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary overview(@javax.annotation.Nullable String overview) {
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


  public GetMutualFundsWorld200ResponseMutualFundSummary people(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner> people) {
    this.people = people;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundSummary addPeopleItem(GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner peopleItem) {
    if (this.people == null) {
      this.people = new ArrayList<>();
    }
    this.people.add(peopleItem);
    return this;
  }

  /**
   * Information about the fund’s managers
   * @return people
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PEOPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner> getPeople() {
    return people;
  }


  @JsonProperty(value = JSON_PROPERTY_PEOPLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeople(@javax.annotation.Nullable List<GetMutualFundsWorld200ResponseMutualFundSummaryPeopleInner> people) {
    this.people = people;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_summary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundSummary getMutualFundsWorld200ResponseMutualFundSummary = (GetMutualFundsWorld200ResponseMutualFundSummary) o;
    return Objects.equals(this.symbol, getMutualFundsWorld200ResponseMutualFundSummary.symbol) &&
        Objects.equals(this.name, getMutualFundsWorld200ResponseMutualFundSummary.name) &&
        Objects.equals(this.fundFamily, getMutualFundsWorld200ResponseMutualFundSummary.fundFamily) &&
        Objects.equals(this.fundType, getMutualFundsWorld200ResponseMutualFundSummary.fundType) &&
        Objects.equals(this.currency, getMutualFundsWorld200ResponseMutualFundSummary.currency) &&
        Objects.equals(this.shareClassInceptionDate, getMutualFundsWorld200ResponseMutualFundSummary.shareClassInceptionDate) &&
        Objects.equals(this.ytdReturn, getMutualFundsWorld200ResponseMutualFundSummary.ytdReturn) &&
        Objects.equals(this.expenseRatioNet, getMutualFundsWorld200ResponseMutualFundSummary.expenseRatioNet) &&
        Objects.equals(this.yield, getMutualFundsWorld200ResponseMutualFundSummary.yield) &&
        Objects.equals(this.nav, getMutualFundsWorld200ResponseMutualFundSummary.nav) &&
        Objects.equals(this.minInvestment, getMutualFundsWorld200ResponseMutualFundSummary.minInvestment) &&
        Objects.equals(this.turnoverRate, getMutualFundsWorld200ResponseMutualFundSummary.turnoverRate) &&
        Objects.equals(this.netAssets, getMutualFundsWorld200ResponseMutualFundSummary.netAssets) &&
        Objects.equals(this.overview, getMutualFundsWorld200ResponseMutualFundSummary.overview) &&
        Objects.equals(this.people, getMutualFundsWorld200ResponseMutualFundSummary.people);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, fundFamily, fundType, currency, shareClassInceptionDate, ytdReturn, expenseRatioNet, yield, nav, minInvestment, turnoverRate, netAssets, overview, people);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundSummary {\n");
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
    sb.append("    minInvestment: ").append(toIndentedString(minInvestment)).append("\n");
    sb.append("    turnoverRate: ").append(toIndentedString(turnoverRate)).append("\n");
    sb.append("    netAssets: ").append(toIndentedString(netAssets)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
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

    // add `min_investment` to the URL query string
    if (getMinInvestment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin_investment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinInvestment()))));
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

    // add `people` to the URL query string
    if (getPeople() != null) {
      for (int i = 0; i < getPeople().size(); i++) {
        if (getPeople().get(i) != null) {
          joiner.add(getPeople().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%speople%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

