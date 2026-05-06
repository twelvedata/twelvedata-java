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
 * GetInsiderTransactions200ResponseInsiderTransactionsInner
 */
@JsonPropertyOrder({
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_FULL_NAME,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_POSITION,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_DATE_REPORTED,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_IS_DIRECT,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_SHARES,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_VALUE,
  GetInsiderTransactions200ResponseInsiderTransactionsInner.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetInsiderTransactions200ResponseInsiderTransactionsInner {
  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  @javax.annotation.Nonnull
  private String fullName;

  public static final String JSON_PROPERTY_POSITION = "position";
  @javax.annotation.Nonnull
  private String position;

  public static final String JSON_PROPERTY_DATE_REPORTED = "date_reported";
  @javax.annotation.Nonnull
  private String dateReported;

  public static final String JSON_PROPERTY_IS_DIRECT = "is_direct";
  @javax.annotation.Nullable
  private Boolean isDirect;

  public static final String JSON_PROPERTY_SHARES = "shares";
  @javax.annotation.Nullable
  private Long shares;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private Long value;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull
  private String description;

  public GetInsiderTransactions200ResponseInsiderTransactionsInner() { 
  }

  public GetInsiderTransactions200ResponseInsiderTransactionsInner fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of an individual, including first name, middle name, last name, and suffix
   * @return fullName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FULL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFullName() {
    return fullName;
  }


  @JsonProperty(value = JSON_PROPERTY_FULL_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }


  public GetInsiderTransactions200ResponseInsiderTransactionsInner position(@javax.annotation.Nonnull String position) {
    this.position = position;
    return this;
  }

  /**
   * Job position of insider
   * @return position
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_POSITION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPosition() {
    return position;
  }


  @JsonProperty(value = JSON_PROPERTY_POSITION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPosition(@javax.annotation.Nonnull String position) {
    this.position = position;
  }


  public GetInsiderTransactions200ResponseInsiderTransactionsInner dateReported(@javax.annotation.Nonnull String dateReported) {
    this.dateReported = dateReported;
    return this;
  }

  /**
   * Date the transaction was reported
   * @return dateReported
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATE_REPORTED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDateReported() {
    return dateReported;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE_REPORTED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateReported(@javax.annotation.Nonnull String dateReported) {
    this.dateReported = dateReported;
  }


  public GetInsiderTransactions200ResponseInsiderTransactionsInner isDirect(@javax.annotation.Nullable Boolean isDirect) {
    this.isDirect = isDirect;
    return this;
  }

  /**
   * &#x60;true&#x60; if direct, &#x60;false&#x60; if indirect
   * @return isDirect
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDirect() {
    return isDirect;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDirect(@javax.annotation.Nullable Boolean isDirect) {
    this.isDirect = isDirect;
  }


  public GetInsiderTransactions200ResponseInsiderTransactionsInner shares(@javax.annotation.Nullable Long shares) {
    this.shares = shares;
    return this;
  }

  /**
   * As per report the number of shares acquired or disposed of the transaction
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


  public GetInsiderTransactions200ResponseInsiderTransactionsInner value(@javax.annotation.Nullable Long value) {
    this.value = value;
    return this;
  }

  /**
   * Represents the value of transaction, calculated as price multiplied by the volume
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


  public GetInsiderTransactions200ResponseInsiderTransactionsInner description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Exact price or price range of the transaction if available
   * @return description
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  /**
   * Return true if this GetInsiderTransactions_200_response_insider_transactions_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInsiderTransactions200ResponseInsiderTransactionsInner getInsiderTransactions200ResponseInsiderTransactionsInner = (GetInsiderTransactions200ResponseInsiderTransactionsInner) o;
    return Objects.equals(this.fullName, getInsiderTransactions200ResponseInsiderTransactionsInner.fullName) &&
        Objects.equals(this.position, getInsiderTransactions200ResponseInsiderTransactionsInner.position) &&
        Objects.equals(this.dateReported, getInsiderTransactions200ResponseInsiderTransactionsInner.dateReported) &&
        Objects.equals(this.isDirect, getInsiderTransactions200ResponseInsiderTransactionsInner.isDirect) &&
        Objects.equals(this.shares, getInsiderTransactions200ResponseInsiderTransactionsInner.shares) &&
        Objects.equals(this.value, getInsiderTransactions200ResponseInsiderTransactionsInner.value) &&
        Objects.equals(this.description, getInsiderTransactions200ResponseInsiderTransactionsInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, position, dateReported, isDirect, shares, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInsiderTransactions200ResponseInsiderTransactionsInner {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    dateReported: ").append(toIndentedString(dateReported)).append("\n");
    sb.append("    isDirect: ").append(toIndentedString(isDirect)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `full_name` to the URL query string
    if (getFullName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfull_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFullName()))));
    }

    // add `position` to the URL query string
    if (getPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sposition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPosition()))));
    }

    // add `date_reported` to the URL query string
    if (getDateReported() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdate_reported%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDateReported()))));
    }

    // add `is_direct` to the URL query string
    if (getIsDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sis_direct%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsDirect()))));
    }

    // add `shares` to the URL query string
    if (getShares() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshares%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShares()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    return joiner.toString();
  }
}

