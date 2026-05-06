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
 * GetApiUsage200Response
 */
@JsonPropertyOrder({
  GetApiUsage200Response.JSON_PROPERTY_TIMESTAMP,
  GetApiUsage200Response.JSON_PROPERTY_CURRENT_USAGE,
  GetApiUsage200Response.JSON_PROPERTY_PLAN_LIMIT,
  GetApiUsage200Response.JSON_PROPERTY_DAILY_USAGE,
  GetApiUsage200Response.JSON_PROPERTY_PLAN_DAILY_LIMIT,
  GetApiUsage200Response.JSON_PROPERTY_PLAN_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetApiUsage200Response {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @javax.annotation.Nonnull
  private String timestamp;

  public static final String JSON_PROPERTY_CURRENT_USAGE = "current_usage";
  @javax.annotation.Nonnull
  private Long currentUsage;

  public static final String JSON_PROPERTY_PLAN_LIMIT = "plan_limit";
  @javax.annotation.Nonnull
  private Long planLimit;

  public static final String JSON_PROPERTY_DAILY_USAGE = "daily_usage";
  @javax.annotation.Nullable
  private Long dailyUsage;

  public static final String JSON_PROPERTY_PLAN_DAILY_LIMIT = "plan_daily_limit";
  @javax.annotation.Nullable
  private Long planDailyLimit;

  public static final String JSON_PROPERTY_PLAN_CATEGORY = "plan_category";
  @javax.annotation.Nullable
  private String planCategory;

  public GetApiUsage200Response() { 
  }

  public GetApiUsage200Response timestamp(@javax.annotation.Nonnull String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Current timestamp in UTC timezone
   * @return timestamp
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimestamp() {
    return timestamp;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(@javax.annotation.Nonnull String timestamp) {
    this.timestamp = timestamp;
  }


  public GetApiUsage200Response currentUsage(@javax.annotation.Nonnull Long currentUsage) {
    this.currentUsage = currentUsage;
    return this;
  }

  /**
   * Number of requests made in last minute
   * @return currentUsage
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENT_USAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCurrentUsage() {
    return currentUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_USAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentUsage(@javax.annotation.Nonnull Long currentUsage) {
    this.currentUsage = currentUsage;
  }


  public GetApiUsage200Response planLimit(@javax.annotation.Nonnull Long planLimit) {
    this.planLimit = planLimit;
    return this;
  }

  /**
   * Your personal API limit (requests/minute) depending on the plan
   * @return planLimit
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PLAN_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPlanLimit() {
    return planLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_LIMIT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanLimit(@javax.annotation.Nonnull Long planLimit) {
    this.planLimit = planLimit;
  }


  public GetApiUsage200Response dailyUsage(@javax.annotation.Nullable Long dailyUsage) {
    this.dailyUsage = dailyUsage;
    return this;
  }

  /**
   * Number of requests made in the current day. Returned only when the plan has a daily limit.
   * @return dailyUsage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DAILY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDailyUsage() {
    return dailyUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_DAILY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyUsage(@javax.annotation.Nullable Long dailyUsage) {
    this.dailyUsage = dailyUsage;
  }


  public GetApiUsage200Response planDailyLimit(@javax.annotation.Nullable Long planDailyLimit) {
    this.planDailyLimit = planDailyLimit;
    return this;
  }

  /**
   * Your personal API limit (requests/day) depending on the plan. Returned only when the plan has a daily limit.
   * @return planDailyLimit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_DAILY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPlanDailyLimit() {
    return planDailyLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_DAILY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanDailyLimit(@javax.annotation.Nullable Long planDailyLimit) {
    this.planDailyLimit = planDailyLimit;
  }


  public GetApiUsage200Response planCategory(@javax.annotation.Nullable String planCategory) {
    this.planCategory = planCategory;
    return this;
  }

  /**
   * Plan category name
   * @return planCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlanCategory() {
    return planCategory;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_CATEGORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanCategory(@javax.annotation.Nullable String planCategory) {
    this.planCategory = planCategory;
  }


  /**
   * Return true if this GetApiUsage_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetApiUsage200Response getApiUsage200Response = (GetApiUsage200Response) o;
    return Objects.equals(this.timestamp, getApiUsage200Response.timestamp) &&
        Objects.equals(this.currentUsage, getApiUsage200Response.currentUsage) &&
        Objects.equals(this.planLimit, getApiUsage200Response.planLimit) &&
        Objects.equals(this.dailyUsage, getApiUsage200Response.dailyUsage) &&
        Objects.equals(this.planDailyLimit, getApiUsage200Response.planDailyLimit) &&
        Objects.equals(this.planCategory, getApiUsage200Response.planCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, currentUsage, planLimit, dailyUsage, planDailyLimit, planCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApiUsage200Response {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    currentUsage: ").append(toIndentedString(currentUsage)).append("\n");
    sb.append("    planLimit: ").append(toIndentedString(planLimit)).append("\n");
    sb.append("    dailyUsage: ").append(toIndentedString(dailyUsage)).append("\n");
    sb.append("    planDailyLimit: ").append(toIndentedString(planDailyLimit)).append("\n");
    sb.append("    planCategory: ").append(toIndentedString(planCategory)).append("\n");
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

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimestamp()))));
    }

    // add `current_usage` to the URL query string
    if (getCurrentUsage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrent_usage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentUsage()))));
    }

    // add `plan_limit` to the URL query string
    if (getPlanLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan_limit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanLimit()))));
    }

    // add `daily_usage` to the URL query string
    if (getDailyUsage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdaily_usage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDailyUsage()))));
    }

    // add `plan_daily_limit` to the URL query string
    if (getPlanDailyLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan_daily_limit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanDailyLimit()))));
    }

    // add `plan_category` to the URL query string
    if (getPlanCategory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan_category%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanCategory()))));
    }

    return joiner.toString();
  }
}

