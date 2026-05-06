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
 * FundHolderItem
 */
@JsonPropertyOrder({
  FundHolderItem.JSON_PROPERTY_ENTITY_NAME,
  FundHolderItem.JSON_PROPERTY_DATE_REPORTED,
  FundHolderItem.JSON_PROPERTY_SHARES,
  FundHolderItem.JSON_PROPERTY_VALUE,
  FundHolderItem.JSON_PROPERTY_PERCENT_HELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class FundHolderItem {
  public static final String JSON_PROPERTY_ENTITY_NAME = "entity_name";
  @javax.annotation.Nonnull
  private String entityName;

  public static final String JSON_PROPERTY_DATE_REPORTED = "date_reported";
  @javax.annotation.Nullable
  private String dateReported;

  public static final String JSON_PROPERTY_SHARES = "shares";
  @javax.annotation.Nullable
  private Long shares;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private Long value;

  public static final String JSON_PROPERTY_PERCENT_HELD = "percent_held";
  @javax.annotation.Nullable
  private Double percentHeld;

  public FundHolderItem() { 
  }

  public FundHolderItem entityName(@javax.annotation.Nonnull String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Refers to the legal name of the institution
   * @return entityName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityName() {
    return entityName;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityName(@javax.annotation.Nonnull String entityName) {
    this.entityName = entityName;
  }


  public FundHolderItem dateReported(@javax.annotation.Nullable String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Refers to date reported
   * @return dateReported
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATE_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDateReported() {
    return dateReported;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE_REPORTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateReported(@javax.annotation.Nullable String dateReported) {
    this.dateReported = dateReported;
  }


  public FundHolderItem shares(@javax.annotation.Nullable Long shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Refers to the number of shares owned
   * @return shares
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShares() {
    return shares;
  }


  @JsonProperty(value = JSON_PROPERTY_SHARES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShares(@javax.annotation.Nullable Long shares) {
    this.shares = shares;
  }


  public FundHolderItem value(@javax.annotation.Nullable Long value) {
    this.value = value;
    return this;
  }

  /**
   * Total value of shares owned, calculated by multiplying &#x60;shares&#x60; by the current price
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@javax.annotation.Nullable Long value) {
    this.value = value;
  }


  public FundHolderItem percentHeld(@javax.annotation.Nullable Double percentHeld) {
    this.percentHeld = percentHeld;
    return this;
  }

  /**
   * Represents the percentage of shares outstanding that are owned by the financial institution
   * @return percentHeld
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPercentHeld() {
    return percentHeld;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENT_HELD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentHeld(@javax.annotation.Nullable Double percentHeld) {
    this.percentHeld = percentHeld;
  }


  /**
   * Return true if this FundHolderItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundHolderItem fundHolderItem = (FundHolderItem) o;
    return Objects.equals(this.entityName, fundHolderItem.entityName) &&
        Objects.equals(this.dateReported, fundHolderItem.dateReported) &&
        Objects.equals(this.shares, fundHolderItem.shares) &&
        Objects.equals(this.value, fundHolderItem.value) &&
        Objects.equals(this.percentHeld, fundHolderItem.percentHeld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, dateReported, shares, value, percentHeld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundHolderItem {\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percentHeld: ").append(toIndentedString(percentHeld)).append("\n");
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

    // add `entity_name` to the URL query string
    if (getEntityName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentity_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityName()))));
    }

    // add `date_reported` to the URL query string
    if (getDateReported() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdate_reported%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDateReported()))));
    }

    // add `shares` to the URL query string
    if (getShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShares()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `percent_held` to the URL query string
    if (getPercentHeld() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spercent_held%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPercentHeld()))));
    }

    return joiner.toString();
  }
}

