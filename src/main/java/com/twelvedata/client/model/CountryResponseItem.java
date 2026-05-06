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
 * CountryResponseItem represents details of a country
 */
@JsonPropertyOrder({
  CountryResponseItem.JSON_PROPERTY_ISO2,
  CountryResponseItem.JSON_PROPERTY_ISO3,
  CountryResponseItem.JSON_PROPERTY_NUMERIC,
  CountryResponseItem.JSON_PROPERTY_NAME,
  CountryResponseItem.JSON_PROPERTY_OFFICIAL_NAME,
  CountryResponseItem.JSON_PROPERTY_CAPITAL,
  CountryResponseItem.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class CountryResponseItem {
  public static final String JSON_PROPERTY_ISO2 = "iso2";
  @javax.annotation.Nonnull
  private String iso2;

  public static final String JSON_PROPERTY_ISO3 = "iso3";
  @javax.annotation.Nonnull
  private String iso3;

  public static final String JSON_PROPERTY_NUMERIC = "numeric";
  @javax.annotation.Nonnull
  private String numeric;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_OFFICIAL_NAME = "official_name";
  @javax.annotation.Nonnull
  private String officialName;

  public static final String JSON_PROPERTY_CAPITAL = "capital";
  @javax.annotation.Nonnull
  private String capital;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public CountryResponseItem() { 
  }

  public CountryResponseItem iso2(@javax.annotation.Nonnull String iso2) {
    this.iso2 = iso2;
    return this;
  }

  /**
   * Two-letter country code defined in ISO 3166
   * @return iso2
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ISO2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIso2() {
    return iso2;
  }


  @JsonProperty(value = JSON_PROPERTY_ISO2, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIso2(@javax.annotation.Nonnull String iso2) {
    this.iso2 = iso2;
  }


  public CountryResponseItem iso3(@javax.annotation.Nonnull String iso3) {
    this.iso3 = iso3;
    return this;
  }

  /**
   * Three-letter country code defined in ISO 3166
   * @return iso3
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ISO3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIso3() {
    return iso3;
  }


  @JsonProperty(value = JSON_PROPERTY_ISO3, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIso3(@javax.annotation.Nonnull String iso3) {
    this.iso3 = iso3;
  }


  public CountryResponseItem numeric(@javax.annotation.Nonnull String numeric) {
    this.numeric = numeric;
    return this;
  }

  /**
   * Numeric country code defined in ISO 3166
   * @return numeric
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NUMERIC, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNumeric() {
    return numeric;
  }


  @JsonProperty(value = JSON_PROPERTY_NUMERIC, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumeric(@javax.annotation.Nonnull String numeric) {
    this.numeric = numeric;
  }


  public CountryResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of country
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


  public CountryResponseItem officialName(@javax.annotation.Nonnull String officialName) {
    this.officialName = officialName;
    return this;
  }

  /**
   * Official name of country
   * @return officialName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_OFFICIAL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOfficialName() {
    return officialName;
  }


  @JsonProperty(value = JSON_PROPERTY_OFFICIAL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOfficialName(@javax.annotation.Nonnull String officialName) {
    this.officialName = officialName;
  }


  public CountryResponseItem capital(@javax.annotation.Nonnull String capital) {
    this.capital = capital;
    return this;
  }

  /**
   * Capital of country
   * @return capital
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CAPITAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCapital() {
    return capital;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPITAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapital(@javax.annotation.Nonnull String capital) {
    this.capital = capital;
  }


  public CountryResponseItem currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of country
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


  /**
   * Return true if this CountryResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryResponseItem countryResponseItem = (CountryResponseItem) o;
    return Objects.equals(this.iso2, countryResponseItem.iso2) &&
        Objects.equals(this.iso3, countryResponseItem.iso3) &&
        Objects.equals(this.numeric, countryResponseItem.numeric) &&
        Objects.equals(this.name, countryResponseItem.name) &&
        Objects.equals(this.officialName, countryResponseItem.officialName) &&
        Objects.equals(this.capital, countryResponseItem.capital) &&
        Objects.equals(this.currency, countryResponseItem.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso2, iso3, numeric, name, officialName, capital, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryResponseItem {\n");
    sb.append("    iso2: ").append(toIndentedString(iso2)).append("\n");
    sb.append("    iso3: ").append(toIndentedString(iso3)).append("\n");
    sb.append("    numeric: ").append(toIndentedString(numeric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    // add `iso2` to the URL query string
    if (getIso2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%siso2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIso2()))));
    }

    // add `iso3` to the URL query string
    if (getIso3() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%siso3%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIso3()))));
    }

    // add `numeric` to the URL query string
    if (getNumeric() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snumeric%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNumeric()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `official_name` to the URL query string
    if (getOfficialName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sofficial_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOfficialName()))));
    }

    // add `capital` to the URL query string
    if (getCapital() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scapital%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCapital()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    return joiner.toString();
  }
}

