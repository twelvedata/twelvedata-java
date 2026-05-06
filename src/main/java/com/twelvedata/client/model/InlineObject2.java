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
import com.twelvedata.client.model.InlineObject2Expenses;
import com.twelvedata.client.model.InlineObject2Minimums;
import com.twelvedata.client.model.InlineObject2Pricing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * InlineObject2
 */
@JsonPropertyOrder({
  InlineObject2.JSON_PROPERTY_BROKERAGES,
  InlineObject2.JSON_PROPERTY_EXPENSES,
  InlineObject2.JSON_PROPERTY_MINIMUMS,
  InlineObject2.JSON_PROPERTY_PRICING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject2 {
  public static final String JSON_PROPERTY_BROKERAGES = "brokerages";
  @javax.annotation.Nullable
  private List<String> brokerages = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPENSES = "expenses";
  @javax.annotation.Nullable
  private InlineObject2Expenses expenses;

  public static final String JSON_PROPERTY_MINIMUMS = "minimums";
  @javax.annotation.Nullable
  private InlineObject2Minimums minimums;

  public static final String JSON_PROPERTY_PRICING = "pricing";
  @javax.annotation.Nullable
  private InlineObject2Pricing pricing;

  public InlineObject2() { 
  }

  public InlineObject2 brokerages(@javax.annotation.Nullable List<String> brokerages) {
    this.brokerages = brokerages;
    return this;
  }

  public InlineObject2 addBrokeragesItem(String brokeragesItem) {
    if (this.brokerages == null) {
      this.brokerages = new ArrayList<>();
    }
    this.brokerages.add(brokeragesItem);
    return this;
  }

  /**
   * Get brokerages
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


  public InlineObject2 expenses(@javax.annotation.Nullable InlineObject2Expenses expenses) {
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
  public InlineObject2Expenses getExpenses() {
    return expenses;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenses(@javax.annotation.Nullable InlineObject2Expenses expenses) {
    this.expenses = expenses;
  }


  public InlineObject2 minimums(@javax.annotation.Nullable InlineObject2Minimums minimums) {
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
  public InlineObject2Minimums getMinimums() {
    return minimums;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimums(@javax.annotation.Nullable InlineObject2Minimums minimums) {
    this.minimums = minimums;
  }


  public InlineObject2 pricing(@javax.annotation.Nullable InlineObject2Pricing pricing) {
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
  public InlineObject2Pricing getPricing() {
    return pricing;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricing(@javax.annotation.Nullable InlineObject2Pricing pricing) {
    this.pricing = pricing;
  }


  /**
   * Return true if this inline_object_2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.brokerages, inlineObject2.brokerages) &&
        Objects.equals(this.expenses, inlineObject2.expenses) &&
        Objects.equals(this.minimums, inlineObject2.minimums) &&
        Objects.equals(this.pricing, inlineObject2.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerages, expenses, minimums, pricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    sb.append("    brokerages: ").append(toIndentedString(brokerages)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    minimums: ").append(toIndentedString(minimums)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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

    // add `brokerages` to the URL query string
    if (getBrokerages() != null) {
      for (int i = 0; i < getBrokerages().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sbrokerages%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getBrokerages().get(i)))));
      }
    }

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

    return joiner.toString();
  }
}

