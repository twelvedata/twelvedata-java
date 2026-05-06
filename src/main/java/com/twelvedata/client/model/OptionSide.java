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
 * OptionSide
 */
@JsonPropertyOrder({
  OptionSide.JSON_PROPERTY_ASK,
  OptionSide.JSON_PROPERTY_BID,
  OptionSide.JSON_PROPERTY_CHANGE,
  OptionSide.JSON_PROPERTY_CONTRACT_NAME,
  OptionSide.JSON_PROPERTY_IMPLIED_VOLATILITY,
  OptionSide.JSON_PROPERTY_IN_THE_MONEY,
  OptionSide.JSON_PROPERTY_LAST_PRICE,
  OptionSide.JSON_PROPERTY_LAST_TRADE_DATE,
  OptionSide.JSON_PROPERTY_OPEN_INTEREST,
  OptionSide.JSON_PROPERTY_OPTION_ID,
  OptionSide.JSON_PROPERTY_PERCENT_CHANGE,
  OptionSide.JSON_PROPERTY_STRIKE,
  OptionSide.JSON_PROPERTY_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class OptionSide {
  public static final String JSON_PROPERTY_ASK = "ask";
  @javax.annotation.Nullable
  private Double ask;

  public static final String JSON_PROPERTY_BID = "bid";
  @javax.annotation.Nullable
  private Double bid;

  public static final String JSON_PROPERTY_CHANGE = "change";
  @javax.annotation.Nullable
  private Double change;

  public static final String JSON_PROPERTY_CONTRACT_NAME = "contract_name";
  @javax.annotation.Nullable
  private String contractName;

  public static final String JSON_PROPERTY_IMPLIED_VOLATILITY = "implied_volatility";
  @javax.annotation.Nullable
  private Double impliedVolatility;

  public static final String JSON_PROPERTY_IN_THE_MONEY = "in_the_money";
  @javax.annotation.Nullable
  private Boolean inTheMoney;

  public static final String JSON_PROPERTY_LAST_PRICE = "last_price";
  @javax.annotation.Nullable
  private Double lastPrice;

  public static final String JSON_PROPERTY_LAST_TRADE_DATE = "last_trade_date";
  @javax.annotation.Nullable
  private String lastTradeDate;

  public static final String JSON_PROPERTY_OPEN_INTEREST = "open_interest";
  @javax.annotation.Nullable
  private Long openInterest;

  public static final String JSON_PROPERTY_OPTION_ID = "option_id";
  @javax.annotation.Nullable
  private String optionId;

  public static final String JSON_PROPERTY_PERCENT_CHANGE = "percent_change";
  @javax.annotation.Nullable
  private Double percentChange;

  public static final String JSON_PROPERTY_STRIKE = "strike";
  @javax.annotation.Nullable
  private Double strike;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  @javax.annotation.Nullable
  private Long volume;

  public OptionSide() { 
  }

  public OptionSide ask(@javax.annotation.Nullable Double ask) {
    this.ask = ask;
    return this;
  }

  /**
   * Get ask
   * @return ask
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAsk() {
    return ask;
  }


  @JsonProperty(value = JSON_PROPERTY_ASK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsk(@javax.annotation.Nullable Double ask) {
    this.ask = ask;
  }


  public OptionSide bid(@javax.annotation.Nullable Double bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBid() {
    return bid;
  }


  @JsonProperty(value = JSON_PROPERTY_BID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBid(@javax.annotation.Nullable Double bid) {
    this.bid = bid;
  }


  public OptionSide change(@javax.annotation.Nullable Double change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getChange() {
    return change;
  }


  @JsonProperty(value = JSON_PROPERTY_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChange(@javax.annotation.Nullable Double change) {
    this.change = change;
  }


  public OptionSide contractName(@javax.annotation.Nullable String contractName) {
    this.contractName = contractName;
    return this;
  }

  /**
   * Get contractName
   * @return contractName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTRACT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContractName() {
    return contractName;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTRACT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractName(@javax.annotation.Nullable String contractName) {
    this.contractName = contractName;
  }


  public OptionSide impliedVolatility(@javax.annotation.Nullable Double impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

  /**
   * Get impliedVolatility
   * @return impliedVolatility
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMPLIED_VOLATILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getImpliedVolatility() {
    return impliedVolatility;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPLIED_VOLATILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpliedVolatility(@javax.annotation.Nullable Double impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  public OptionSide inTheMoney(@javax.annotation.Nullable Boolean inTheMoney) {
    this.inTheMoney = inTheMoney;
    return this;
  }

  /**
   * Get inTheMoney
   * @return inTheMoney
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IN_THE_MONEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInTheMoney() {
    return inTheMoney;
  }


  @JsonProperty(value = JSON_PROPERTY_IN_THE_MONEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInTheMoney(@javax.annotation.Nullable Boolean inTheMoney) {
    this.inTheMoney = inTheMoney;
  }


  public OptionSide lastPrice(@javax.annotation.Nullable Double lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

  /**
   * Get lastPrice
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


  public OptionSide lastTradeDate(@javax.annotation.Nullable String lastTradeDate) {
    this.lastTradeDate = lastTradeDate;
    return this;
  }

  /**
   * Get lastTradeDate
   * @return lastTradeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_TRADE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastTradeDate() {
    return lastTradeDate;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_TRADE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastTradeDate(@javax.annotation.Nullable String lastTradeDate) {
    this.lastTradeDate = lastTradeDate;
  }


  public OptionSide openInterest(@javax.annotation.Nullable Long openInterest) {
    this.openInterest = openInterest;
    return this;
  }

  /**
   * Get openInterest
   * @return openInterest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPEN_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpenInterest() {
    return openInterest;
  }


  @JsonProperty(value = JSON_PROPERTY_OPEN_INTEREST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenInterest(@javax.annotation.Nullable Long openInterest) {
    this.openInterest = openInterest;
  }


  public OptionSide optionId(@javax.annotation.Nullable String optionId) {
    this.optionId = optionId;
    return this;
  }

  /**
   * Get optionId
   * @return optionId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOptionId() {
    return optionId;
  }


  @JsonProperty(value = JSON_PROPERTY_OPTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionId(@javax.annotation.Nullable String optionId) {
    this.optionId = optionId;
  }


  public OptionSide percentChange(@javax.annotation.Nullable Double percentChange) {
    this.percentChange = percentChange;
    return this;
  }

  /**
   * Get percentChange
   * @return percentChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentChange() {
    return percentChange;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentChange(@javax.annotation.Nullable Double percentChange) {
    this.percentChange = percentChange;
  }


  public OptionSide strike(@javax.annotation.Nullable Double strike) {
    this.strike = strike;
    return this;
  }

  /**
   * Get strike
   * @return strike
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STRIKE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStrike() {
    return strike;
  }


  @JsonProperty(value = JSON_PROPERTY_STRIKE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrike(@javax.annotation.Nullable Double strike) {
    this.strike = strike;
  }


  public OptionSide volume(@javax.annotation.Nullable Long volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVolume() {
    return volume;
  }


  @JsonProperty(value = JSON_PROPERTY_VOLUME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(@javax.annotation.Nullable Long volume) {
    this.volume = volume;
  }


  /**
   * Return true if this OptionSide object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionSide optionSide = (OptionSide) o;
    return Objects.equals(this.ask, optionSide.ask) &&
        Objects.equals(this.bid, optionSide.bid) &&
        Objects.equals(this.change, optionSide.change) &&
        Objects.equals(this.contractName, optionSide.contractName) &&
        Objects.equals(this.impliedVolatility, optionSide.impliedVolatility) &&
        Objects.equals(this.inTheMoney, optionSide.inTheMoney) &&
        Objects.equals(this.lastPrice, optionSide.lastPrice) &&
        Objects.equals(this.lastTradeDate, optionSide.lastTradeDate) &&
        Objects.equals(this.openInterest, optionSide.openInterest) &&
        Objects.equals(this.optionId, optionSide.optionId) &&
        Objects.equals(this.percentChange, optionSide.percentChange) &&
        Objects.equals(this.strike, optionSide.strike) &&
        Objects.equals(this.volume, optionSide.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ask, bid, change, contractName, impliedVolatility, inTheMoney, lastPrice, lastTradeDate, openInterest, optionId, percentChange, strike, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSide {\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    inTheMoney: ").append(toIndentedString(inTheMoney)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastTradeDate: ").append(toIndentedString(lastTradeDate)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    strike: ").append(toIndentedString(strike)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

    // add `ask` to the URL query string
    if (getAsk() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sask%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAsk()))));
    }

    // add `bid` to the URL query string
    if (getBid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBid()))));
    }

    // add `change` to the URL query string
    if (getChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChange()))));
    }

    // add `contract_name` to the URL query string
    if (getContractName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontract_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContractName()))));
    }

    // add `implied_volatility` to the URL query string
    if (getImpliedVolatility() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simplied_volatility%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImpliedVolatility()))));
    }

    // add `in_the_money` to the URL query string
    if (getInTheMoney() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sin_the_money%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInTheMoney()))));
    }

    // add `last_price` to the URL query string
    if (getLastPrice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_price%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastPrice()))));
    }

    // add `last_trade_date` to the URL query string
    if (getLastTradeDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slast_trade_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastTradeDate()))));
    }

    // add `open_interest` to the URL query string
    if (getOpenInterest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sopen_interest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOpenInterest()))));
    }

    // add `option_id` to the URL query string
    if (getOptionId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soption_id%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOptionId()))));
    }

    // add `percent_change` to the URL query string
    if (getPercentChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentChange()))));
    }

    // add `strike` to the URL query string
    if (getStrike() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrike%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrike()))));
    }

    // add `volume` to the URL query string
    if (getVolume() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svolume%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVolume()))));
    }

    return joiner.toString();
  }
}

