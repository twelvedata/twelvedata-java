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
 * Pretax income information
 */
@JsonPropertyOrder({
  IncomeStatementItemPretaxIncome.JSON_PROPERTY_PRETAX_INCOME_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemPretaxIncome {
  public static final String JSON_PROPERTY_PRETAX_INCOME_VALUE = "pretax_income_value";
  @javax.annotation.Nullable
  private Double pretaxIncomeValue;

  public IncomeStatementItemPretaxIncome() { 
  }

  public IncomeStatementItemPretaxIncome pretaxIncomeValue(@javax.annotation.Nullable Double pretaxIncomeValue) {
    this.pretaxIncomeValue = pretaxIncomeValue;
    return this;
  }

  /**
   * Pretax income value
   * @return pretaxIncomeValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPretaxIncomeValue() {
    return pretaxIncomeValue;
  }


  @JsonProperty(value = JSON_PROPERTY_PRETAX_INCOME_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPretaxIncomeValue(@javax.annotation.Nullable Double pretaxIncomeValue) {
    this.pretaxIncomeValue = pretaxIncomeValue;
  }


  /**
   * Return true if this IncomeStatementItem_pretax_income object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemPretaxIncome incomeStatementItemPretaxIncome = (IncomeStatementItemPretaxIncome) o;
    return Objects.equals(this.pretaxIncomeValue, incomeStatementItemPretaxIncome.pretaxIncomeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pretaxIncomeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemPretaxIncome {\n");
    sb.append("    pretaxIncomeValue: ").append(toIndentedString(pretaxIncomeValue)).append("\n");
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

    // add `pretax_income_value` to the URL query string
    if (getPretaxIncomeValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spretax_income_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPretaxIncomeValue()))));
    }

    return joiner.toString();
  }
}

