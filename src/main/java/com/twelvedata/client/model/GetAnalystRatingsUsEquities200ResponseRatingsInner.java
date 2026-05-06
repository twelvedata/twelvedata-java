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
 * GetAnalystRatingsUsEquities200ResponseRatingsInner
 */
@JsonPropertyOrder({
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_DATE,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_FIRM,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_ANALYST_NAME,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_RATING_CHANGE,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_RATING_CURRENT,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_RATING_PRIOR,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_TIME,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_ACTION_PRICE_TARGET,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_PRICE_TARGET_CURRENT,
  GetAnalystRatingsUsEquities200ResponseRatingsInner.JSON_PROPERTY_PRICE_TARGET_PRIOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetAnalystRatingsUsEquities200ResponseRatingsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_FIRM = "firm";
  @javax.annotation.Nonnull
  private String firm;

  public static final String JSON_PROPERTY_ANALYST_NAME = "analyst_name";
  @javax.annotation.Nullable
  private String analystName;

  public static final String JSON_PROPERTY_RATING_CHANGE = "rating_change";
  @javax.annotation.Nullable
  private String ratingChange;

  public static final String JSON_PROPERTY_RATING_CURRENT = "rating_current";
  @javax.annotation.Nullable
  private String ratingCurrent;

  public static final String JSON_PROPERTY_RATING_PRIOR = "rating_prior";
  @javax.annotation.Nullable
  private String ratingPrior;

  public static final String JSON_PROPERTY_TIME = "time";
  @javax.annotation.Nullable
  private String time;

  public static final String JSON_PROPERTY_ACTION_PRICE_TARGET = "action_price_target";
  @javax.annotation.Nullable
  private String actionPriceTarget;

  public static final String JSON_PROPERTY_PRICE_TARGET_CURRENT = "price_target_current";
  @javax.annotation.Nullable
  private Double priceTargetCurrent;

  public static final String JSON_PROPERTY_PRICE_TARGET_PRIOR = "price_target_prior";
  @javax.annotation.Nullable
  private Double priceTargetPrior;

  public GetAnalystRatingsUsEquities200ResponseRatingsInner() { 
  }

  public GetAnalystRatingsUsEquities200ResponseRatingsInner date(@javax.annotation.Nonnull String date) {
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


  public GetAnalystRatingsUsEquities200ResponseRatingsInner firm(@javax.annotation.Nonnull String firm) {
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


  public GetAnalystRatingsUsEquities200ResponseRatingsInner analystName(@javax.annotation.Nullable String analystName) {
    this.analystName = analystName;
    return this;
  }

  /**
   * Name of an analyst
   * @return analystName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANALYST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAnalystName() {
    return analystName;
  }


  @JsonProperty(value = JSON_PROPERTY_ANALYST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalystName(@javax.annotation.Nullable String analystName) {
    this.analystName = analystName;
  }


  public GetAnalystRatingsUsEquities200ResponseRatingsInner ratingChange(@javax.annotation.Nullable String ratingChange) {
    this.ratingChange = ratingChange;
    return this;
  }

  /**
   * Defines the action of the firm to ranking, could be &#x60;Maintains&#x60;, &#x60;Upgrade&#x60;, &#x60;Downgrade&#x60;, &#x60;Initiates&#x60;, &#x60;Reiterates&#x60;, &#x60;Assumes&#x60;, or &#x60;Reinstates&#x60;
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


  public GetAnalystRatingsUsEquities200ResponseRatingsInner ratingCurrent(@javax.annotation.Nullable String ratingCurrent) {
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


  public GetAnalystRatingsUsEquities200ResponseRatingsInner ratingPrior(@javax.annotation.Nullable String ratingPrior) {
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


  public GetAnalystRatingsUsEquities200ResponseRatingsInner time(@javax.annotation.Nullable String time) {
    this.time = time;
    return this;
  }

  /**
   * Time when the rating was released or updated
   * @return time
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTime() {
    return time;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(@javax.annotation.Nullable String time) {
    this.time = time;
  }


  public GetAnalystRatingsUsEquities200ResponseRatingsInner actionPriceTarget(@javax.annotation.Nullable String actionPriceTarget) {
    this.actionPriceTarget = actionPriceTarget;
    return this;
  }

  /**
   * Action that firm took towards target price
   * @return actionPriceTarget
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_PRICE_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActionPriceTarget() {
    return actionPriceTarget;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_PRICE_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionPriceTarget(@javax.annotation.Nullable String actionPriceTarget) {
    this.actionPriceTarget = actionPriceTarget;
  }


  public GetAnalystRatingsUsEquities200ResponseRatingsInner priceTargetCurrent(@javax.annotation.Nullable Double priceTargetCurrent) {
    this.priceTargetCurrent = priceTargetCurrent;
    return this;
  }

  /**
   * Current firm&#39;s price target for the instrument
   * @return priceTargetCurrent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceTargetCurrent() {
    return priceTargetCurrent;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceTargetCurrent(@javax.annotation.Nullable Double priceTargetCurrent) {
    this.priceTargetCurrent = priceTargetCurrent;
  }


  public GetAnalystRatingsUsEquities200ResponseRatingsInner priceTargetPrior(@javax.annotation.Nullable Double priceTargetPrior) {
    this.priceTargetPrior = priceTargetPrior;
    return this;
  }

  /**
   * Prior firm&#39;s price target for the instrument
   * @return priceTargetPrior
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET_PRIOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPriceTargetPrior() {
    return priceTargetPrior;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE_TARGET_PRIOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceTargetPrior(@javax.annotation.Nullable Double priceTargetPrior) {
    this.priceTargetPrior = priceTargetPrior;
  }


  /**
   * Return true if this GetAnalystRatingsUsEquities_200_response_ratings_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAnalystRatingsUsEquities200ResponseRatingsInner getAnalystRatingsUsEquities200ResponseRatingsInner = (GetAnalystRatingsUsEquities200ResponseRatingsInner) o;
    return Objects.equals(this.date, getAnalystRatingsUsEquities200ResponseRatingsInner.date) &&
        Objects.equals(this.firm, getAnalystRatingsUsEquities200ResponseRatingsInner.firm) &&
        Objects.equals(this.analystName, getAnalystRatingsUsEquities200ResponseRatingsInner.analystName) &&
        Objects.equals(this.ratingChange, getAnalystRatingsUsEquities200ResponseRatingsInner.ratingChange) &&
        Objects.equals(this.ratingCurrent, getAnalystRatingsUsEquities200ResponseRatingsInner.ratingCurrent) &&
        Objects.equals(this.ratingPrior, getAnalystRatingsUsEquities200ResponseRatingsInner.ratingPrior) &&
        Objects.equals(this.time, getAnalystRatingsUsEquities200ResponseRatingsInner.time) &&
        Objects.equals(this.actionPriceTarget, getAnalystRatingsUsEquities200ResponseRatingsInner.actionPriceTarget) &&
        Objects.equals(this.priceTargetCurrent, getAnalystRatingsUsEquities200ResponseRatingsInner.priceTargetCurrent) &&
        Objects.equals(this.priceTargetPrior, getAnalystRatingsUsEquities200ResponseRatingsInner.priceTargetPrior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, firm, analystName, ratingChange, ratingCurrent, ratingPrior, time, actionPriceTarget, priceTargetCurrent, priceTargetPrior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAnalystRatingsUsEquities200ResponseRatingsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    firm: ").append(toIndentedString(firm)).append("\n");
    sb.append("    analystName: ").append(toIndentedString(analystName)).append("\n");
    sb.append("    ratingChange: ").append(toIndentedString(ratingChange)).append("\n");
    sb.append("    ratingCurrent: ").append(toIndentedString(ratingCurrent)).append("\n");
    sb.append("    ratingPrior: ").append(toIndentedString(ratingPrior)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actionPriceTarget: ").append(toIndentedString(actionPriceTarget)).append("\n");
    sb.append("    priceTargetCurrent: ").append(toIndentedString(priceTargetCurrent)).append("\n");
    sb.append("    priceTargetPrior: ").append(toIndentedString(priceTargetPrior)).append("\n");
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

    // add `analyst_name` to the URL query string
    if (getAnalystName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sanalyst_name%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAnalystName()))));
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

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTime()))));
    }

    // add `action_price_target` to the URL query string
    if (getActionPriceTarget() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saction_price_target%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionPriceTarget()))));
    }

    // add `price_target_current` to the URL query string
    if (getPriceTargetCurrent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_target_current%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceTargetCurrent()))));
    }

    // add `price_target_prior` to the URL query string
    if (getPriceTargetPrior() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprice_target_prior%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPriceTargetPrior()))));
    }

    return joiner.toString();
  }
}

