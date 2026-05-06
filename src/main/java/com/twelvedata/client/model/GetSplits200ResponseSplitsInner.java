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
 * GetSplits200ResponseSplitsInner
 */
@JsonPropertyOrder({
  GetSplits200ResponseSplitsInner.JSON_PROPERTY_DATE,
  GetSplits200ResponseSplitsInner.JSON_PROPERTY_DESCRIPTION,
  GetSplits200ResponseSplitsInner.JSON_PROPERTY_RATIO,
  GetSplits200ResponseSplitsInner.JSON_PROPERTY_FROM_FACTOR,
  GetSplits200ResponseSplitsInner.JSON_PROPERTY_TO_FACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetSplits200ResponseSplitsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull
  private String description;

  public static final String JSON_PROPERTY_RATIO = "ratio";
  @javax.annotation.Nonnull
  private Double ratio;

  public static final String JSON_PROPERTY_FROM_FACTOR = "from_factor";
  @javax.annotation.Nonnull
  private Double fromFactor;

  public static final String JSON_PROPERTY_TO_FACTOR = "to_factor";
  @javax.annotation.Nonnull
  private Double toFactor;

  public GetSplits200ResponseSplitsInner() { 
  }

  public GetSplits200ResponseSplitsInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Stands for the split date
   * @return date
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@javax.annotation.Nonnull String date) {
    this.date = date;
  }


  public GetSplits200ResponseSplitsInner description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Specification of the split event
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


  public GetSplits200ResponseSplitsInner ratio(@javax.annotation.Nonnull Double ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * The ratio by which the number of a company&#39;s outstanding shares of stock are increased following a stock split. For example, a &#x60;4-for-1 split&#x60; results in four times as many outstanding shares, with each share selling at one forth of its pre-split price
   * @return ratio
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RATIO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRatio() {
    return ratio;
  }


  @JsonProperty(value = JSON_PROPERTY_RATIO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRatio(@javax.annotation.Nonnull Double ratio) {
    this.ratio = ratio;
  }


  public GetSplits200ResponseSplitsInner fromFactor(@javax.annotation.Nonnull Double fromFactor) {
    this.fromFactor = fromFactor;
    return this;
  }

  /**
   * From factor of the split
   * @return fromFactor
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FROM_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFromFactor() {
    return fromFactor;
  }


  @JsonProperty(value = JSON_PROPERTY_FROM_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromFactor(@javax.annotation.Nonnull Double fromFactor) {
    this.fromFactor = fromFactor;
  }


  public GetSplits200ResponseSplitsInner toFactor(@javax.annotation.Nonnull Double toFactor) {
    this.toFactor = toFactor;
    return this;
  }

  /**
   * To factor of the split
   * @return toFactor
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TO_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getToFactor() {
    return toFactor;
  }


  @JsonProperty(value = JSON_PROPERTY_TO_FACTOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToFactor(@javax.annotation.Nonnull Double toFactor) {
    this.toFactor = toFactor;
  }


  /**
   * Return true if this GetSplits_200_response_splits_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSplits200ResponseSplitsInner getSplits200ResponseSplitsInner = (GetSplits200ResponseSplitsInner) o;
    return Objects.equals(this.date, getSplits200ResponseSplitsInner.date) &&
        Objects.equals(this.description, getSplits200ResponseSplitsInner.description) &&
        Objects.equals(this.ratio, getSplits200ResponseSplitsInner.ratio) &&
        Objects.equals(this.fromFactor, getSplits200ResponseSplitsInner.fromFactor) &&
        Objects.equals(this.toFactor, getSplits200ResponseSplitsInner.toFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, ratio, fromFactor, toFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSplits200ResponseSplitsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    fromFactor: ").append(toIndentedString(fromFactor)).append("\n");
    sb.append("    toFactor: ").append(toIndentedString(toFactor)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDate()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `ratio` to the URL query string
    if (getRatio() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sratio%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRatio()))));
    }

    // add `from_factor` to the URL query string
    if (getFromFactor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfrom_factor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFromFactor()))));
    }

    // add `to_factor` to the URL query string
    if (getToFactor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sto_factor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getToFactor()))));
    }

    return joiner.toString();
  }
}

