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
 * Info on which plan symbol is available (displayed then &#x60;show_plan&#x60; is &#x60;true&#x60;)
 */
@JsonPropertyOrder({
  ExchangesResponseItemAccess.JSON_PROPERTY_GLOBAL,
  ExchangesResponseItemAccess.JSON_PROPERTY_PLAN,
  ExchangesResponseItemAccess.JSON_PROPERTY_PLAN_BUSINESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ExchangesResponseItemAccess {
  public static final String JSON_PROPERTY_GLOBAL = "global";
  @javax.annotation.Nonnull
  private String global;

  public static final String JSON_PROPERTY_PLAN = "plan";
  @javax.annotation.Nonnull
  private String plan;

  public static final String JSON_PROPERTY_PLAN_BUSINESS = "plan_business";
  @javax.annotation.Nonnull
  private String planBusiness;

  public ExchangesResponseItemAccess() { 
  }

  public ExchangesResponseItemAccess global(@javax.annotation.Nonnull String global) {
    this.global = global;
    return this;
  }

  /**
   * Level of access to the symbol
   * @return global
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_GLOBAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGlobal() {
    return global;
  }


  @JsonProperty(value = JSON_PROPERTY_GLOBAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGlobal(@javax.annotation.Nonnull String global) {
    this.global = global;
  }


  public ExchangesResponseItemAccess plan(@javax.annotation.Nonnull String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * The individual plan name for the symbol
   * @return plan
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PLAN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlan() {
    return plan;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlan(@javax.annotation.Nonnull String plan) {
    this.plan = plan;
  }


  public ExchangesResponseItemAccess planBusiness(@javax.annotation.Nonnull String planBusiness) {
    this.planBusiness = planBusiness;
    return this;
  }

  /**
   * The business plan name for the symbol
   * @return planBusiness
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PLAN_BUSINESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlanBusiness() {
    return planBusiness;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_BUSINESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanBusiness(@javax.annotation.Nonnull String planBusiness) {
    this.planBusiness = planBusiness;
  }


  /**
   * Return true if this ExchangesResponseItemAccess object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangesResponseItemAccess exchangesResponseItemAccess = (ExchangesResponseItemAccess) o;
    return Objects.equals(this.global, exchangesResponseItemAccess.global) &&
        Objects.equals(this.plan, exchangesResponseItemAccess.plan) &&
        Objects.equals(this.planBusiness, exchangesResponseItemAccess.planBusiness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, plan, planBusiness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangesResponseItemAccess {\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    planBusiness: ").append(toIndentedString(planBusiness)).append("\n");
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

    // add `global` to the URL query string
    if (getGlobal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sglobal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGlobal()))));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlan()))));
    }

    // add `plan_business` to the URL query string
    if (getPlanBusiness() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan_business%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanBusiness()))));
    }

    return joiner.toString();
  }
}

