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
import com.twelvedata.client.model.EtfResponseItemAccess;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * FundResponseItem represents details of a fund
 */
@JsonPropertyOrder({
  FundResponseItem.JSON_PROPERTY_SYMBOL,
  FundResponseItem.JSON_PROPERTY_NAME,
  FundResponseItem.JSON_PROPERTY_COUNTRY,
  FundResponseItem.JSON_PROPERTY_CURRENCY,
  FundResponseItem.JSON_PROPERTY_EXCHANGE,
  FundResponseItem.JSON_PROPERTY_MIC_CODE,
  FundResponseItem.JSON_PROPERTY_TYPE,
  FundResponseItem.JSON_PROPERTY_FIGI_CODE,
  FundResponseItem.JSON_PROPERTY_CFI_CODE,
  FundResponseItem.JSON_PROPERTY_ISIN,
  FundResponseItem.JSON_PROPERTY_CUSIP,
  FundResponseItem.JSON_PROPERTY_ACCESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class FundResponseItem {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_FIGI_CODE = "figi_code";
  @javax.annotation.Nonnull
  private String figiCode;

  public static final String JSON_PROPERTY_CFI_CODE = "cfi_code";
  @javax.annotation.Nonnull
  private String cfiCode;

  public static final String JSON_PROPERTY_ISIN = "isin";
  @javax.annotation.Nonnull
  private String isin;

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  @javax.annotation.Nonnull
  private String cusip;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private EtfResponseItemAccess access;

  public FundResponseItem() { 
  }

  public FundResponseItem symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Instrument symbol (ticker)
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


  public FundResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the fund
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


  public FundResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where the fund is located
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public FundResponseItem currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of the fund according to the ISO 4217 standard
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public FundResponseItem exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange where the fund is traded
   * @return exchange
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExchange() {
    return exchange;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCHANGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
  }


  public FundResponseItem micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
   * @return micCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMicCode() {
    return micCode;
  }


  @JsonProperty(value = JSON_PROPERTY_MIC_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMicCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
  }


  public FundResponseItem type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the fund
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public FundResponseItem figiCode(@javax.annotation.Nonnull String figiCode) {
    this.figiCode = figiCode;
    return this;
  }

  /**
   * Financial instrument global identifier (FIGI)
   * @return figiCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FIGI_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFigiCode() {
    return figiCode;
  }


  @JsonProperty(value = JSON_PROPERTY_FIGI_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFigiCode(@javax.annotation.Nonnull String figiCode) {
    this.figiCode = figiCode;
  }


  public FundResponseItem cfiCode(@javax.annotation.Nonnull String cfiCode) {
    this.cfiCode = cfiCode;
    return this;
  }

  /**
   * Classification of Financial Instruments (CFI)
   * @return cfiCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CFI_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCfiCode() {
    return cfiCode;
  }


  @JsonProperty(value = JSON_PROPERTY_CFI_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCfiCode(@javax.annotation.Nonnull String cfiCode) {
    this.cfiCode = cfiCode;
  }


  public FundResponseItem isin(@javax.annotation.Nonnull String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * International securities identification number (ISIN)
   * @return isin
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ISIN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIsin() {
    return isin;
  }


  @JsonProperty(value = JSON_PROPERTY_ISIN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsin(@javax.annotation.Nonnull String isin) {
    this.isin = isin;
  }


  public FundResponseItem cusip(@javax.annotation.Nonnull String cusip) {
    this.cusip = cusip;
    return this;
  }

  /**
   * A unique nine-character alphanumeric code used to identify financial securities, ensuring accurate data retrieval for the specified asset
   * @return cusip
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CUSIP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCusip() {
    return cusip;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSIP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCusip(@javax.annotation.Nonnull String cusip) {
    this.cusip = cusip;
  }


  public FundResponseItem access(@javax.annotation.Nullable EtfResponseItemAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EtfResponseItemAccess getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable EtfResponseItemAccess access) {
    this.access = access;
  }


  /**
   * Return true if this FundResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundResponseItem fundResponseItem = (FundResponseItem) o;
    return Objects.equals(this.symbol, fundResponseItem.symbol) &&
        Objects.equals(this.name, fundResponseItem.name) &&
        Objects.equals(this.country, fundResponseItem.country) &&
        Objects.equals(this.currency, fundResponseItem.currency) &&
        Objects.equals(this.exchange, fundResponseItem.exchange) &&
        Objects.equals(this.micCode, fundResponseItem.micCode) &&
        Objects.equals(this.type, fundResponseItem.type) &&
        Objects.equals(this.figiCode, fundResponseItem.figiCode) &&
        Objects.equals(this.cfiCode, fundResponseItem.cfiCode) &&
        Objects.equals(this.isin, fundResponseItem.isin) &&
        Objects.equals(this.cusip, fundResponseItem.cusip) &&
        Objects.equals(this.access, fundResponseItem.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, country, currency, exchange, micCode, type, figiCode, cfiCode, isin, cusip, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundResponseItem {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    figiCode: ").append(toIndentedString(figiCode)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `figi_code` to the URL query string
    if (getFigiCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfigi_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFigiCode()))));
    }

    // add `cfi_code` to the URL query string
    if (getCfiCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scfi_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCfiCode()))));
    }

    // add `isin` to the URL query string
    if (getIsin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsin()))));
    }

    // add `cusip` to the URL query string
    if (getCusip() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scusip%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCusip()))));
    }

    // add `access` to the URL query string
    if (getAccess() != null) {
      joiner.add(getAccess().toUrlQueryString(prefix + "access" + suffix));
    }

    return joiner.toString();
  }
}

