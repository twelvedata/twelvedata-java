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
 * Interest income and expense information
 */
@JsonPropertyOrder({
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_INTEREST_INCOME,
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_INTEREST_EXPENSE,
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_NET_INTEREST_INCOME,
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_NET_NON_OPERATING_INTEREST_INCOME_EXPENSE,
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_INTEREST_EXPENSE_NON_OPERATING,
  IncomeStatementItemInterestIncomeAndExpense.JSON_PROPERTY_INTEREST_INCOME_NON_OPERATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemInterestIncomeAndExpense {
  public static final String JSON_PROPERTY_INTEREST_INCOME = "interest_income";
  @javax.annotation.Nullable
  private Double interestIncome;

  public static final String JSON_PROPERTY_INTEREST_EXPENSE = "interest_expense";
  @javax.annotation.Nullable
  private Double interestExpense;

  public static final String JSON_PROPERTY_NET_INTEREST_INCOME = "net_interest_income";
  @javax.annotation.Nullable
  private Double netInterestIncome;

  public static final String JSON_PROPERTY_NET_NON_OPERATING_INTEREST_INCOME_EXPENSE = "net_non_operating_interest_income_expense";
  @javax.annotation.Nullable
  private Double netNonOperatingInterestIncomeExpense;

  public static final String JSON_PROPERTY_INTEREST_EXPENSE_NON_OPERATING = "interest_expense_non_operating";
  @javax.annotation.Nullable
  private Double interestExpenseNonOperating;

  public static final String JSON_PROPERTY_INTEREST_INCOME_NON_OPERATING = "interest_income_non_operating";
  @javax.annotation.Nullable
  private Double interestIncomeNonOperating;

  public IncomeStatementItemInterestIncomeAndExpense() { 
  }

  public IncomeStatementItemInterestIncomeAndExpense interestIncome(@javax.annotation.Nullable Double interestIncome) {
    this.interestIncome = interestIncome;
    return this;
  }

  /**
   * Interest income
   * @return interestIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestIncome() {
    return interestIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestIncome(@javax.annotation.Nullable Double interestIncome) {
    this.interestIncome = interestIncome;
  }


  public IncomeStatementItemInterestIncomeAndExpense interestExpense(@javax.annotation.Nullable Double interestExpense) {
    this.interestExpense = interestExpense;
    return this;
  }

  /**
   * Interest expense
   * @return interestExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestExpense() {
    return interestExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestExpense(@javax.annotation.Nullable Double interestExpense) {
    this.interestExpense = interestExpense;
  }


  public IncomeStatementItemInterestIncomeAndExpense netInterestIncome(@javax.annotation.Nullable Double netInterestIncome) {
    this.netInterestIncome = netInterestIncome;
    return this;
  }

  /**
   * Net interest income
   * @return netInterestIncome
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_INTEREST_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetInterestIncome() {
    return netInterestIncome;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_INTEREST_INCOME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetInterestIncome(@javax.annotation.Nullable Double netInterestIncome) {
    this.netInterestIncome = netInterestIncome;
  }


  public IncomeStatementItemInterestIncomeAndExpense netNonOperatingInterestIncomeExpense(@javax.annotation.Nullable Double netNonOperatingInterestIncomeExpense) {
    this.netNonOperatingInterestIncomeExpense = netNonOperatingInterestIncomeExpense;
    return this;
  }

  /**
   * Net non operating interest income expense
   * @return netNonOperatingInterestIncomeExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NET_NON_OPERATING_INTEREST_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNetNonOperatingInterestIncomeExpense() {
    return netNonOperatingInterestIncomeExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_NET_NON_OPERATING_INTEREST_INCOME_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetNonOperatingInterestIncomeExpense(@javax.annotation.Nullable Double netNonOperatingInterestIncomeExpense) {
    this.netNonOperatingInterestIncomeExpense = netNonOperatingInterestIncomeExpense;
  }


  public IncomeStatementItemInterestIncomeAndExpense interestExpenseNonOperating(@javax.annotation.Nullable Double interestExpenseNonOperating) {
    this.interestExpenseNonOperating = interestExpenseNonOperating;
    return this;
  }

  /**
   * Interest expense non operating
   * @return interestExpenseNonOperating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_EXPENSE_NON_OPERATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestExpenseNonOperating() {
    return interestExpenseNonOperating;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_EXPENSE_NON_OPERATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestExpenseNonOperating(@javax.annotation.Nullable Double interestExpenseNonOperating) {
    this.interestExpenseNonOperating = interestExpenseNonOperating;
  }


  public IncomeStatementItemInterestIncomeAndExpense interestIncomeNonOperating(@javax.annotation.Nullable Double interestIncomeNonOperating) {
    this.interestIncomeNonOperating = interestIncomeNonOperating;
    return this;
  }

  /**
   * Interest income non operating
   * @return interestIncomeNonOperating
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME_NON_OPERATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterestIncomeNonOperating() {
    return interestIncomeNonOperating;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEREST_INCOME_NON_OPERATING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestIncomeNonOperating(@javax.annotation.Nullable Double interestIncomeNonOperating) {
    this.interestIncomeNonOperating = interestIncomeNonOperating;
  }


  /**
   * Return true if this IncomeStatementItem_interest_income_and_expense object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemInterestIncomeAndExpense incomeStatementItemInterestIncomeAndExpense = (IncomeStatementItemInterestIncomeAndExpense) o;
    return Objects.equals(this.interestIncome, incomeStatementItemInterestIncomeAndExpense.interestIncome) &&
        Objects.equals(this.interestExpense, incomeStatementItemInterestIncomeAndExpense.interestExpense) &&
        Objects.equals(this.netInterestIncome, incomeStatementItemInterestIncomeAndExpense.netInterestIncome) &&
        Objects.equals(this.netNonOperatingInterestIncomeExpense, incomeStatementItemInterestIncomeAndExpense.netNonOperatingInterestIncomeExpense) &&
        Objects.equals(this.interestExpenseNonOperating, incomeStatementItemInterestIncomeAndExpense.interestExpenseNonOperating) &&
        Objects.equals(this.interestIncomeNonOperating, incomeStatementItemInterestIncomeAndExpense.interestIncomeNonOperating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestIncome, interestExpense, netInterestIncome, netNonOperatingInterestIncomeExpense, interestExpenseNonOperating, interestIncomeNonOperating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemInterestIncomeAndExpense {\n");
    sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
    sb.append("    interestExpense: ").append(toIndentedString(interestExpense)).append("\n");
    sb.append("    netInterestIncome: ").append(toIndentedString(netInterestIncome)).append("\n");
    sb.append("    netNonOperatingInterestIncomeExpense: ").append(toIndentedString(netNonOperatingInterestIncomeExpense)).append("\n");
    sb.append("    interestExpenseNonOperating: ").append(toIndentedString(interestExpenseNonOperating)).append("\n");
    sb.append("    interestIncomeNonOperating: ").append(toIndentedString(interestIncomeNonOperating)).append("\n");
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

    // add `interest_income` to the URL query string
    if (getInterestIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestIncome()))));
    }

    // add `interest_expense` to the URL query string
    if (getInterestExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestExpense()))));
    }

    // add `net_interest_income` to the URL query string
    if (getNetInterestIncome() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_interest_income%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetInterestIncome()))));
    }

    // add `net_non_operating_interest_income_expense` to the URL query string
    if (getNetNonOperatingInterestIncomeExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snet_non_operating_interest_income_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNetNonOperatingInterestIncomeExpense()))));
    }

    // add `interest_expense_non_operating` to the URL query string
    if (getInterestExpenseNonOperating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_expense_non_operating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestExpenseNonOperating()))));
    }

    // add `interest_income_non_operating` to the URL query string
    if (getInterestIncomeNonOperating() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterest_income_non_operating%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterestIncomeNonOperating()))));
    }

    return joiner.toString();
  }
}

