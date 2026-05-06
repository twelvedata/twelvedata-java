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
 * GetDividends200ResponseDividendsInner
 */
@JsonPropertyOrder({
  GetDividends200ResponseDividendsInner.JSON_PROPERTY_EX_DATE,
  GetDividends200ResponseDividendsInner.JSON_PROPERTY_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetDividends200ResponseDividendsInner {
  public static final String JSON_PROPERTY_EX_DATE = "ex_date";
  @javax.annotation.Nonnull
  private String exDate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Double amount;

  public GetDividends200ResponseDividendsInner() { 
  }

  public GetDividends200ResponseDividendsInner exDate(@javax.annotation.Nonnull String exDate) {
    this.exDate = exDate;
    return this;
  }

  /**
   * Stands for the ex date
   * @return exDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EX_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExDate() {
    return exDate;
  }


  @JsonProperty(value = JSON_PROPERTY_EX_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExDate(@javax.annotation.Nonnull String exDate) {
    this.exDate = exDate;
  }


  public GetDividends200ResponseDividendsInner amount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Stands for the payment amount
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAmount() {
    return amount;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Double amount) {
    this.amount = amount;
  }


  /**
   * Return true if this GetDividends_200_response_dividends_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDividends200ResponseDividendsInner getDividends200ResponseDividendsInner = (GetDividends200ResponseDividendsInner) o;
    return Objects.equals(this.exDate, getDividends200ResponseDividendsInner.exDate) &&
        Objects.equals(this.amount, getDividends200ResponseDividendsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exDate, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDividends200ResponseDividendsInner {\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

    // add `ex_date` to the URL query string
    if (getExDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sex_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExDate()))));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmount()))));
    }

    return joiner.toString();
  }
}

