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
 * GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner.JSON_PROPERTY_PERIOD,
  GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner.JSON_PROPERTY_RETURN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner {
  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
  private String period;

  public static final String JSON_PROPERTY_RETURN = "return";
  @javax.annotation.Nullable
  private Double _return;

  public GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner period(@javax.annotation.Nullable String period) {
    this.period = period;
    return this;
  }

  /**
   * Period of a load adjusted return
   * @return period
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPeriod() {
    return period;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(@javax.annotation.Nullable String period) {
    this.period = period;
  }


  public GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner _return(@javax.annotation.Nullable Double _return) {
    this._return = _return;
    return this;
  }

  /**
   * Actual return (%) an investor sees after accounting for fees and sales charges are deducted from a mutual fund&#39;s performance
   * @return _return
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getReturn() {
    return _return;
  }


  @JsonProperty(value = JSON_PROPERTY_RETURN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturn(@javax.annotation.Nullable Double _return) {
    this._return = _return;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_performance_load_adjusted_return_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner getMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner = (GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner) o;
    return Objects.equals(this.period, getMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner.period) &&
        Objects.equals(this._return, getMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, _return);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPerformanceLoadAdjustedReturnInner {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%speriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPeriod()))));
    }

    // add `return` to the URL query string
    if (getReturn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreturn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReturn()))));
    }

    return joiner.toString();
  }
}

