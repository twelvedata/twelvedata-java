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
 * GetAnalystRatingsLight200ResponseRatingsInner
 */
@JsonPropertyOrder({
  GetAnalystRatingsLight200ResponseRatingsInner.JSON_PROPERTY_DATE,
  GetAnalystRatingsLight200ResponseRatingsInner.JSON_PROPERTY_FIRM,
  GetAnalystRatingsLight200ResponseRatingsInner.JSON_PROPERTY_RATING_CHANGE,
  GetAnalystRatingsLight200ResponseRatingsInner.JSON_PROPERTY_RATING_CURRENT,
  GetAnalystRatingsLight200ResponseRatingsInner.JSON_PROPERTY_RATING_PRIOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetAnalystRatingsLight200ResponseRatingsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_FIRM = "firm";
  @javax.annotation.Nonnull
  private String firm;

  public static final String JSON_PROPERTY_RATING_CHANGE = "rating_change";
  @javax.annotation.Nullable
  private String ratingChange;

  public static final String JSON_PROPERTY_RATING_CURRENT = "rating_current";
  @javax.annotation.Nullable
  private String ratingCurrent;

  public static final String JSON_PROPERTY_RATING_PRIOR = "rating_prior";
  @javax.annotation.Nullable
  private String ratingPrior;

  public GetAnalystRatingsLight200ResponseRatingsInner() { 
  }

  public GetAnalystRatingsLight200ResponseRatingsInner date(@javax.annotation.Nonnull String date) {
    this.date = date;
    return this;
  }

  /**
   * Date when the rating was released
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


  public GetAnalystRatingsLight200ResponseRatingsInner firm(@javax.annotation.Nonnull String firm) {
    this.firm = firm;
    return this;
  }

  /**
   * Firm that issued the ranking
   * @return firm
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FIRM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFirm() {
    return firm;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirm(@javax.annotation.Nonnull String firm) {
    this.firm = firm;
  }


  public GetAnalystRatingsLight200ResponseRatingsInner ratingChange(@javax.annotation.Nullable String ratingChange) {
    this.ratingChange = ratingChange;
    return this;
  }

  /**
   * Defines the action of the firm to ranking, could be &#x60;Maintains&#x60;, &#x60;Upgrade&#x60;, &#x60;Downgrade&#x60;, &#x60;Initiates&#x60; or &#x60;Reiterates&#x60;
   * @return ratingChange
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRatingChange() {
    return ratingChange;
  }


  @JsonProperty(value = JSON_PROPERTY_RATING_CHANGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingChange(@javax.annotation.Nullable String ratingChange) {
    this.ratingChange = ratingChange;
  }


  public GetAnalystRatingsLight200ResponseRatingsInner ratingCurrent(@javax.annotation.Nullable String ratingCurrent) {
    this.ratingCurrent = ratingCurrent;
    return this;
  }

  /**
   * Current firm&#39;s ranking of the instrument
   * @return ratingCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATING_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRatingCurrent() {
    return ratingCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_RATING_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingCurrent(@javax.annotation.Nullable String ratingCurrent) {
    this.ratingCurrent = ratingCurrent;
  }


  public GetAnalystRatingsLight200ResponseRatingsInner ratingPrior(@javax.annotation.Nullable String ratingPrior) {
    this.ratingPrior = ratingPrior;
    return this;
  }

  /**
   * Prior firm&#39;s ranking of the instrument
   * @return ratingPrior
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATING_PRIOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRatingPrior() {
    return ratingPrior;
  }


  @JsonProperty(value = JSON_PROPERTY_RATING_PRIOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingPrior(@javax.annotation.Nullable String ratingPrior) {
    this.ratingPrior = ratingPrior;
  }


  /**
   * Return true if this GetAnalystRatingsLight_200_response_ratings_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAnalystRatingsLight200ResponseRatingsInner getAnalystRatingsLight200ResponseRatingsInner = (GetAnalystRatingsLight200ResponseRatingsInner) o;
    return Objects.equals(this.date, getAnalystRatingsLight200ResponseRatingsInner.date) &&
        Objects.equals(this.firm, getAnalystRatingsLight200ResponseRatingsInner.firm) &&
        Objects.equals(this.ratingChange, getAnalystRatingsLight200ResponseRatingsInner.ratingChange) &&
        Objects.equals(this.ratingCurrent, getAnalystRatingsLight200ResponseRatingsInner.ratingCurrent) &&
        Objects.equals(this.ratingPrior, getAnalystRatingsLight200ResponseRatingsInner.ratingPrior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, firm, ratingChange, ratingCurrent, ratingPrior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAnalystRatingsLight200ResponseRatingsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    firm: ").append(toIndentedString(firm)).append("\n");
    sb.append("    ratingChange: ").append(toIndentedString(ratingChange)).append("\n");
    sb.append("    ratingCurrent: ").append(toIndentedString(ratingCurrent)).append("\n");
    sb.append("    ratingPrior: ").append(toIndentedString(ratingPrior)).append("\n");
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

    // add `firm` to the URL query string
    if (getFirm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirm()))));
    }

    // add `rating_change` to the URL query string
    if (getRatingChange() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srating_change%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRatingChange()))));
    }

    // add `rating_current` to the URL query string
    if (getRatingCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srating_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRatingCurrent()))));
    }

    // add `rating_prior` to the URL query string
    if (getRatingPrior() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srating_prior%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRatingPrior()))));
    }

    return joiner.toString();
  }
}

