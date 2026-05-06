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
 * GetProfile200Response
 */
@JsonPropertyOrder({
  GetProfile200Response.JSON_PROPERTY_SYMBOL,
  GetProfile200Response.JSON_PROPERTY_NAME,
  GetProfile200Response.JSON_PROPERTY_EXCHANGE,
  GetProfile200Response.JSON_PROPERTY_MIC_CODE,
  GetProfile200Response.JSON_PROPERTY_SECTOR,
  GetProfile200Response.JSON_PROPERTY_INDUSTRY,
  GetProfile200Response.JSON_PROPERTY_EMPLOYEES,
  GetProfile200Response.JSON_PROPERTY_WEBSITE,
  GetProfile200Response.JSON_PROPERTY_DESCRIPTION,
  GetProfile200Response.JSON_PROPERTY_TYPE,
  GetProfile200Response.JSON_PROPERTY_C_E_O,
  GetProfile200Response.JSON_PROPERTY_ADDRESS,
  GetProfile200Response.JSON_PROPERTY_ADDRESS2,
  GetProfile200Response.JSON_PROPERTY_CITY,
  GetProfile200Response.JSON_PROPERTY_ZIP,
  GetProfile200Response.JSON_PROPERTY_STATE,
  GetProfile200Response.JSON_PROPERTY_COUNTRY,
  GetProfile200Response.JSON_PROPERTY_PHONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetProfile200Response {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  @javax.annotation.Nonnull
  private String symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  @javax.annotation.Nonnull
  private String exchange;

  public static final String JSON_PROPERTY_MIC_CODE = "mic_code";
  @javax.annotation.Nonnull
  private String micCode;

  public static final String JSON_PROPERTY_SECTOR = "sector";
  @javax.annotation.Nullable
  private String sector;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  @javax.annotation.Nullable
  private String industry;

  public static final String JSON_PROPERTY_EMPLOYEES = "employees";
  @javax.annotation.Nullable
  private Long employees;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  @javax.annotation.Nullable
  private String website;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public static final String JSON_PROPERTY_C_E_O = "CEO";
  @javax.annotation.Nullable
  private String CEO;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private String address;

  public static final String JSON_PROPERTY_ADDRESS2 = "address2";
  @javax.annotation.Nullable
  private String address2;

  public static final String JSON_PROPERTY_CITY = "city";
  @javax.annotation.Nullable
  private String city;

  public static final String JSON_PROPERTY_ZIP = "zip";
  @javax.annotation.Nullable
  private String zip;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable
  private String country;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private String phone;

  public GetProfile200Response() { 
  }

  public GetProfile200Response symbol(@javax.annotation.Nonnull String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Ticker of the company
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


  public GetProfile200Response name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the company
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


  public GetProfile200Response exchange(@javax.annotation.Nonnull String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Exchange name where the company is listed
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


  public GetProfile200Response micCode(@javax.annotation.Nonnull String micCode) {
    this.micCode = micCode;
    return this;
  }

  /**
   * Market Identifier Code (MIC) under ISO 10383 standard
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


  public GetProfile200Response sector(@javax.annotation.Nullable String sector) {
    this.sector = sector;
    return this;
  }

  /**
   * Sector at which the company operates
   * @return sector
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSector() {
    return sector;
  }


  @JsonProperty(value = JSON_PROPERTY_SECTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSector(@javax.annotation.Nullable String sector) {
    this.sector = sector;
  }


  public GetProfile200Response industry(@javax.annotation.Nullable String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Industry at which company operates
   * @return industry
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INDUSTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndustry() {
    return industry;
  }


  @JsonProperty(value = JSON_PROPERTY_INDUSTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(@javax.annotation.Nullable String industry) {
    this.industry = industry;
  }


  public GetProfile200Response employees(@javax.annotation.Nullable Long employees) {
    this.employees = employees;
    return this;
  }

  /**
   * Number of employees in the company
   * @return employees
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMPLOYEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEmployees() {
    return employees;
  }


  @JsonProperty(value = JSON_PROPERTY_EMPLOYEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployees(@javax.annotation.Nullable Long employees) {
    this.employees = employees;
  }


  public GetProfile200Response website(@javax.annotation.Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Website of the company
   * @return website
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WEBSITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWebsite() {
    return website;
  }


  @JsonProperty(value = JSON_PROPERTY_WEBSITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(@javax.annotation.Nullable String website) {
    this.website = website;
  }


  public GetProfile200Response description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the company activities
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GetProfile200Response type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Issue type of the stock
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetProfile200Response CEO(@javax.annotation.Nullable String CEO) {
    this.CEO = CEO;
    return this;
  }

  /**
   * Name of the CEO of the company
   * @return CEO
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_C_E_O, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCEO() {
    return CEO;
  }


  @JsonProperty(value = JSON_PROPERTY_C_E_O, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCEO(@javax.annotation.Nullable String CEO) {
    this.CEO = CEO;
  }


  public GetProfile200Response address(@javax.annotation.Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * Street address of the company if presented
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddress() {
    return address;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = address;
  }


  public GetProfile200Response address2(@javax.annotation.Nullable String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Secondary address of the company if presented
   * @return address2
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDRESS2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddress2() {
    return address2;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDRESS2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress2(@javax.annotation.Nullable String address2) {
    this.address2 = address2;
  }


  public GetProfile200Response city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * City of the company if presented
   * @return city
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }


  @JsonProperty(value = JSON_PROPERTY_CITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public GetProfile200Response zip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * ZIP code of the company if presented
   * @return zip
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ZIP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getZip() {
    return zip;
  }


  @JsonProperty(value = JSON_PROPERTY_ZIP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
  }


  public GetProfile200Response state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the company if presented
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getState() {
    return state;
  }


  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GetProfile200Response country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of the company if presented
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetProfile200Response phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the company if presented
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhone() {
    return phone;
  }


  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  /**
   * Return true if this GetProfile_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfile200Response getProfile200Response = (GetProfile200Response) o;
    return Objects.equals(this.symbol, getProfile200Response.symbol) &&
        Objects.equals(this.name, getProfile200Response.name) &&
        Objects.equals(this.exchange, getProfile200Response.exchange) &&
        Objects.equals(this.micCode, getProfile200Response.micCode) &&
        Objects.equals(this.sector, getProfile200Response.sector) &&
        Objects.equals(this.industry, getProfile200Response.industry) &&
        Objects.equals(this.employees, getProfile200Response.employees) &&
        Objects.equals(this.website, getProfile200Response.website) &&
        Objects.equals(this.description, getProfile200Response.description) &&
        Objects.equals(this.type, getProfile200Response.type) &&
        Objects.equals(this.CEO, getProfile200Response.CEO) &&
        Objects.equals(this.address, getProfile200Response.address) &&
        Objects.equals(this.address2, getProfile200Response.address2) &&
        Objects.equals(this.city, getProfile200Response.city) &&
        Objects.equals(this.zip, getProfile200Response.zip) &&
        Objects.equals(this.state, getProfile200Response.state) &&
        Objects.equals(this.country, getProfile200Response.country) &&
        Objects.equals(this.phone, getProfile200Response.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, exchange, micCode, sector, industry, employees, website, description, type, CEO, address, address2, city, zip, state, country, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfile200Response {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    micCode: ").append(toIndentedString(micCode)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    CEO: ").append(toIndentedString(CEO)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

    // add `exchange` to the URL query string
    if (getExchange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexchange%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExchange()))));
    }

    // add `mic_code` to the URL query string
    if (getMicCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smic_code%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMicCode()))));
    }

    // add `sector` to the URL query string
    if (getSector() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssector%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSector()))));
    }

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sindustry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIndustry()))));
    }

    // add `employees` to the URL query string
    if (getEmployees() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semployees%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmployees()))));
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swebsite%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWebsite()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `CEO` to the URL query string
    if (getCEO() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sCEO%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCEO()))));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saddress%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAddress()))));
    }

    // add `address2` to the URL query string
    if (getAddress2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saddress2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAddress2()))));
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCity()))));
    }

    // add `zip` to the URL query string
    if (getZip() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%szip%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getZip()))));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getState()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sphone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPhone()))));
    }

    return joiner.toString();
  }
}

