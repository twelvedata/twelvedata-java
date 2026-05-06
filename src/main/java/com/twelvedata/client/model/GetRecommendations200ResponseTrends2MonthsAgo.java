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
 * Two months ago recommendations
 */
@JsonPropertyOrder({
  GetRecommendations200ResponseTrends2MonthsAgo.JSON_PROPERTY_STRONG_BUY,
  GetRecommendations200ResponseTrends2MonthsAgo.JSON_PROPERTY_BUY,
  GetRecommendations200ResponseTrends2MonthsAgo.JSON_PROPERTY_HOLD,
  GetRecommendations200ResponseTrends2MonthsAgo.JSON_PROPERTY_SELL,
  GetRecommendations200ResponseTrends2MonthsAgo.JSON_PROPERTY_STRONG_SELL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetRecommendations200ResponseTrends2MonthsAgo {
  public static final String JSON_PROPERTY_STRONG_BUY = "strong_buy";
  @javax.annotation.Nullable
  private Long strongBuy;

  public static final String JSON_PROPERTY_BUY = "buy";
  @javax.annotation.Nullable
  private Long buy;

  public static final String JSON_PROPERTY_HOLD = "hold";
  @javax.annotation.Nullable
  private Long hold;

  public static final String JSON_PROPERTY_SELL = "sell";
  @javax.annotation.Nullable
  private Long sell;

  public static final String JSON_PROPERTY_STRONG_SELL = "strong_sell";
  @javax.annotation.Nullable
  private Long strongSell;

  public GetRecommendations200ResponseTrends2MonthsAgo() { 
  }

  public GetRecommendations200ResponseTrends2MonthsAgo strongBuy(@javax.annotation.Nullable Long strongBuy) {
    this.strongBuy = strongBuy;
    return this;
  }

  /**
   * Number of analysts that give a strong buy recommendation
   * @return strongBuy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STRONG_BUY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStrongBuy() {
    return strongBuy;
  }


  @JsonProperty(value = JSON_PROPERTY_STRONG_BUY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrongBuy(@javax.annotation.Nullable Long strongBuy) {
    this.strongBuy = strongBuy;
  }


  public GetRecommendations200ResponseTrends2MonthsAgo buy(@javax.annotation.Nullable Long buy) {
    this.buy = buy;
    return this;
  }

  /**
   * Number of analysts that give a buy recommendation
   * @return buy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BUY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBuy() {
    return buy;
  }


  @JsonProperty(value = JSON_PROPERTY_BUY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(@javax.annotation.Nullable Long buy) {
    this.buy = buy;
  }


  public GetRecommendations200ResponseTrends2MonthsAgo hold(@javax.annotation.Nullable Long hold) {
    this.hold = hold;
    return this;
  }

  /**
   * Number of analysts that give a hold recommendation
   * @return hold
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHold() {
    return hold;
  }


  @JsonProperty(value = JSON_PROPERTY_HOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHold(@javax.annotation.Nullable Long hold) {
    this.hold = hold;
  }


  public GetRecommendations200ResponseTrends2MonthsAgo sell(@javax.annotation.Nullable Long sell) {
    this.sell = sell;
    return this;
  }

  /**
   * Number of analysts that give a sell recommendation
   * @return sell
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSell() {
    return sell;
  }


  @JsonProperty(value = JSON_PROPERTY_SELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSell(@javax.annotation.Nullable Long sell) {
    this.sell = sell;
  }


  public GetRecommendations200ResponseTrends2MonthsAgo strongSell(@javax.annotation.Nullable Long strongSell) {
    this.strongSell = strongSell;
    return this;
  }

  /**
   * Number of analysts that give a strong sell recommendation
   * @return strongSell
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STRONG_SELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStrongSell() {
    return strongSell;
  }


  @JsonProperty(value = JSON_PROPERTY_STRONG_SELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrongSell(@javax.annotation.Nullable Long strongSell) {
    this.strongSell = strongSell;
  }


  /**
   * Return true if this GetRecommendations_200_response_trends_2_months_ago object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecommendations200ResponseTrends2MonthsAgo getRecommendations200ResponseTrends2MonthsAgo = (GetRecommendations200ResponseTrends2MonthsAgo) o;
    return Objects.equals(this.strongBuy, getRecommendations200ResponseTrends2MonthsAgo.strongBuy) &&
        Objects.equals(this.buy, getRecommendations200ResponseTrends2MonthsAgo.buy) &&
        Objects.equals(this.hold, getRecommendations200ResponseTrends2MonthsAgo.hold) &&
        Objects.equals(this.sell, getRecommendations200ResponseTrends2MonthsAgo.sell) &&
        Objects.equals(this.strongSell, getRecommendations200ResponseTrends2MonthsAgo.strongSell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strongBuy, buy, hold, sell, strongSell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecommendations200ResponseTrends2MonthsAgo {\n");
    sb.append("    strongBuy: ").append(toIndentedString(strongBuy)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    strongSell: ").append(toIndentedString(strongSell)).append("\n");
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

    // add `strong_buy` to the URL query string
    if (getStrongBuy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrong_buy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrongBuy()))));
    }

    // add `buy` to the URL query string
    if (getBuy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbuy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBuy()))));
    }

    // add `hold` to the URL query string
    if (getHold() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shold%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHold()))));
    }

    // add `sell` to the URL query string
    if (getSell() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssell%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSell()))));
    }

    // add `strong_sell` to the URL query string
    if (getStrongSell() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrong_sell%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrongSell()))));
    }

    return joiner.toString();
  }
}

