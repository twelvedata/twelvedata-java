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
import com.twelvedata.client.model.ExchangesResponseItemAccess;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ExchangesResponseItem represents details of an exchange
 */
@JsonPropertyOrder({
  ExchangesResponseItem.JSON_PROPERTY_TITLE,
  ExchangesResponseItem.JSON_PROPERTY_NAME,
  ExchangesResponseItem.JSON_PROPERTY_CODE,
  ExchangesResponseItem.JSON_PROPERTY_COUNTRY,
  ExchangesResponseItem.JSON_PROPERTY_TIMEZONE,
  ExchangesResponseItem.JSON_PROPERTY_ACCESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ExchangesResponseItem {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nonnull
  private String code;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  @javax.annotation.Nonnull
  private String timezone;

  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private ExchangesResponseItemAccess access;

  public ExchangesResponseItem() { 
  }

  public ExchangesResponseItem title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of exchange
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public ExchangesResponseItem name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of exchange
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


  public ExchangesResponseItem code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Market identifier code (MIC) under ISO 10383 standard
   * @return code
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCode() {
    return code;
  }


  @JsonProperty(value = JSON_PROPERTY_CODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public ExchangesResponseItem country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country to which stock exchange belongs to
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


  public ExchangesResponseItem timezone(@javax.annotation.Nonnull String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Time zone where exchange is located
   * @return timezone
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimezone(@javax.annotation.Nonnull String timezone) {
    this.timezone = timezone;
  }


  public ExchangesResponseItem access(@javax.annotation.Nullable ExchangesResponseItemAccess access) {
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
  public ExchangesResponseItemAccess getAccess() {
    return access;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable ExchangesResponseItemAccess access) {
    this.access = access;
  }


  /**
   * Return true if this ExchangesResponseItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangesResponseItem exchangesResponseItem = (ExchangesResponseItem) o;
    return Objects.equals(this.title, exchangesResponseItem.title) &&
        Objects.equals(this.name, exchangesResponseItem.name) &&
        Objects.equals(this.code, exchangesResponseItem.code) &&
        Objects.equals(this.country, exchangesResponseItem.country) &&
        Objects.equals(this.timezone, exchangesResponseItem.timezone) &&
        Objects.equals(this.access, exchangesResponseItem.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, name, code, country, timezone, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangesResponseItem {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCode()))));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimezone()))));
    }

    // add `access` to the URL query string
    if (getAccess() != null) {
      joiner.add(getAccess().toUrlQueryString(prefix + "access" + suffix));
    }

    return joiner.toString();
  }
}

