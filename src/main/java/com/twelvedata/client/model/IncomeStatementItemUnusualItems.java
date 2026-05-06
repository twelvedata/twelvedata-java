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
 * Unusual items information
 */
@JsonPropertyOrder({
  IncomeStatementItemUnusualItems.JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS,
  IncomeStatementItemUnusualItems.JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS_EXCLUDING_GOODWILL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemUnusualItems {
  public static final String JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS = "total_unusual_items";
  @javax.annotation.Nullable
  private Double totalUnusualItems;

  public static final String JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS_EXCLUDING_GOODWILL = "total_unusual_items_excluding_goodwill";
  @javax.annotation.Nullable
  private Double totalUnusualItemsExcludingGoodwill;

  public IncomeStatementItemUnusualItems() { 
  }

  public IncomeStatementItemUnusualItems totalUnusualItems(@javax.annotation.Nullable Double totalUnusualItems) {
    this.totalUnusualItems = totalUnusualItems;
    return this;
  }

  /**
   * Total unusual items
   * @return totalUnusualItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalUnusualItems() {
    return totalUnusualItems;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalUnusualItems(@javax.annotation.Nullable Double totalUnusualItems) {
    this.totalUnusualItems = totalUnusualItems;
  }


  public IncomeStatementItemUnusualItems totalUnusualItemsExcludingGoodwill(@javax.annotation.Nullable Double totalUnusualItemsExcludingGoodwill) {
    this.totalUnusualItemsExcludingGoodwill = totalUnusualItemsExcludingGoodwill;
    return this;
  }

  /**
   * Total unusual items excluding goodwill
   * @return totalUnusualItemsExcludingGoodwill
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS_EXCLUDING_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalUnusualItemsExcludingGoodwill() {
    return totalUnusualItemsExcludingGoodwill;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_UNUSUAL_ITEMS_EXCLUDING_GOODWILL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalUnusualItemsExcludingGoodwill(@javax.annotation.Nullable Double totalUnusualItemsExcludingGoodwill) {
    this.totalUnusualItemsExcludingGoodwill = totalUnusualItemsExcludingGoodwill;
  }


  /**
   * Return true if this IncomeStatementItem_unusual_items object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemUnusualItems incomeStatementItemUnusualItems = (IncomeStatementItemUnusualItems) o;
    return Objects.equals(this.totalUnusualItems, incomeStatementItemUnusualItems.totalUnusualItems) &&
        Objects.equals(this.totalUnusualItemsExcludingGoodwill, incomeStatementItemUnusualItems.totalUnusualItemsExcludingGoodwill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUnusualItems, totalUnusualItemsExcludingGoodwill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemUnusualItems {\n");
    sb.append("    totalUnusualItems: ").append(toIndentedString(totalUnusualItems)).append("\n");
    sb.append("    totalUnusualItemsExcludingGoodwill: ").append(toIndentedString(totalUnusualItemsExcludingGoodwill)).append("\n");
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

    // add `total_unusual_items` to the URL query string
    if (getTotalUnusualItems() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_unusual_items%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalUnusualItems()))));
    }

    // add `total_unusual_items_excluding_goodwill` to the URL query string
    if (getTotalUnusualItemsExcludingGoodwill() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_unusual_items_excluding_goodwill%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalUnusualItemsExcludingGoodwill()))));
    }

    return joiner.toString();
  }
}

