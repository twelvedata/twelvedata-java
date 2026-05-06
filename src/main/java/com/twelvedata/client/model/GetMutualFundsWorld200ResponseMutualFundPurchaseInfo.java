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
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPurchaseInfoExpenses;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums;
import com.twelvedata.client.model.GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Purchase information of a mutual fund
 */
@JsonPropertyOrder({
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfo.JSON_PROPERTY_EXPENSES,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfo.JSON_PROPERTY_MINIMUMS,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfo.JSON_PROPERTY_PRICING,
  GetMutualFundsWorld200ResponseMutualFundPurchaseInfo.JSON_PROPERTY_BROKERAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorld200ResponseMutualFundPurchaseInfo {
  public static final String JSON_PROPERTY_EXPENSES = "expenses";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundPurchaseInfoExpenses expenses;

  public static final String JSON_PROPERTY_MINIMUMS = "minimums";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums minimums;

  public static final String JSON_PROPERTY_PRICING = "pricing";
  @javax.annotation.Nullable
  private GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing pricing;

  public static final String JSON_PROPERTY_BROKERAGES = "brokerages";
  @javax.annotation.Nullable
  private List<String> brokerages = new ArrayList<>();

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo() { 
  }

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo expenses(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoExpenses expenses) {
    this.expenses = expenses;
    return this;
  }

  /**
   * Get expenses
   * @return expenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoExpenses getExpenses() {
    return expenses;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenses(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoExpenses expenses) {
    this.expenses = expenses;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo minimums(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums minimums) {
    this.minimums = minimums;
    return this;
  }

  /**
   * Get minimums
   * @return minimums
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums getMinimums() {
    return minimums;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimums(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoMinimums minimums) {
    this.minimums = minimums;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo pricing(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRICING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing getPricing() {
    return pricing;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricing(@javax.annotation.Nullable GetMutualFundsWorld200ResponseMutualFundPurchaseInfoPricing pricing) {
    this.pricing = pricing;
  }


  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo brokerages(@javax.annotation.Nullable List<String> brokerages) {
    this.brokerages = brokerages;
    return this;
  }

  public GetMutualFundsWorld200ResponseMutualFundPurchaseInfo addBrokeragesItem(String brokeragesItem) {
    if (this.brokerages == null) {
      this.brokerages = new ArrayList<>();
    }
    this.brokerages.add(brokeragesItem);
    return this;
  }

  /**
   * List of brokerages where mutual fund can be purchased
   * @return brokerages
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BROKERAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBrokerages() {
    return brokerages;
  }


  @JsonProperty(value = JSON_PROPERTY_BROKERAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrokerages(@javax.annotation.Nullable List<String> brokerages) {
    this.brokerages = brokerages;
  }


  /**
   * Return true if this GetMutualFundsWorld_200_response_mutual_fund_purchase_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorld200ResponseMutualFundPurchaseInfo getMutualFundsWorld200ResponseMutualFundPurchaseInfo = (GetMutualFundsWorld200ResponseMutualFundPurchaseInfo) o;
    return Objects.equals(this.expenses, getMutualFundsWorld200ResponseMutualFundPurchaseInfo.expenses) &&
        Objects.equals(this.minimums, getMutualFundsWorld200ResponseMutualFundPurchaseInfo.minimums) &&
        Objects.equals(this.pricing, getMutualFundsWorld200ResponseMutualFundPurchaseInfo.pricing) &&
        Objects.equals(this.brokerages, getMutualFundsWorld200ResponseMutualFundPurchaseInfo.brokerages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenses, minimums, pricing, brokerages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorld200ResponseMutualFundPurchaseInfo {\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    minimums: ").append(toIndentedString(minimums)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    brokerages: ").append(toIndentedString(brokerages)).append("\n");
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

    // add `expenses` to the URL query string
    if (getExpenses() != null) {
      joiner.add(getExpenses().toUrlQueryString(prefix + "expenses" + suffix));
    }

    // add `minimums` to the URL query string
    if (getMinimums() != null) {
      joiner.add(getMinimums().toUrlQueryString(prefix + "minimums" + suffix));
    }

    // add `pricing` to the URL query string
    if (getPricing() != null) {
      joiner.add(getPricing().toUrlQueryString(prefix + "pricing" + suffix));
    }

    // add `brokerages` to the URL query string
    if (getBrokerages() != null) {
      for (int i = 0; i < getBrokerages().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sbrokerages%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getBrokerages().get(i)))));
      }
    }

    return joiner.toString();
  }
}

