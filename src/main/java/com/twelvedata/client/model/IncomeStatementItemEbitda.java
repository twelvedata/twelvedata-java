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
 * EBITDA information
 */
@JsonPropertyOrder({
  IncomeStatementItemEbitda.JSON_PROPERTY_EBITDA_VALUE,
  IncomeStatementItemEbitda.JSON_PROPERTY_NORMALIZED_EBITDA_VALUE,
  IncomeStatementItemEbitda.JSON_PROPERTY_EBIT_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemEbitda {
  public static final String JSON_PROPERTY_EBITDA_VALUE = "ebitda_value";
  @javax.annotation.Nullable
  private Double ebitdaValue;

  public static final String JSON_PROPERTY_NORMALIZED_EBITDA_VALUE = "normalized_ebitda_value";
  @javax.annotation.Nullable
  private Double normalizedEbitdaValue;

  public static final String JSON_PROPERTY_EBIT_VALUE = "ebit_value";
  @javax.annotation.Nullable
  private Double ebitValue;

  public IncomeStatementItemEbitda() { 
  }

  public IncomeStatementItemEbitda ebitdaValue(@javax.annotation.Nullable Double ebitdaValue) {
    this.ebitdaValue = ebitdaValue;
    return this;
  }

  /**
   * EBITDA value
   * @return ebitdaValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBITDA_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEbitdaValue() {
    return ebitdaValue;
  }


  @JsonProperty(value = JSON_PROPERTY_EBITDA_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitdaValue(@javax.annotation.Nullable Double ebitdaValue) {
    this.ebitdaValue = ebitdaValue;
  }


  public IncomeStatementItemEbitda normalizedEbitdaValue(@javax.annotation.Nullable Double normalizedEbitdaValue) {
    this.normalizedEbitdaValue = normalizedEbitdaValue;
    return this;
  }

  /**
   * Normalized EBITDA value
   * @return normalizedEbitdaValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_EBITDA_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNormalizedEbitdaValue() {
    return normalizedEbitdaValue;
  }


  @JsonProperty(value = JSON_PROPERTY_NORMALIZED_EBITDA_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizedEbitdaValue(@javax.annotation.Nullable Double normalizedEbitdaValue) {
    this.normalizedEbitdaValue = normalizedEbitdaValue;
  }


  public IncomeStatementItemEbitda ebitValue(@javax.annotation.Nullable Double ebitValue) {
    this.ebitValue = ebitValue;
    return this;
  }

  /**
   * EBIT value
   * @return ebitValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EBIT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEbitValue() {
    return ebitValue;
  }


  @JsonProperty(value = JSON_PROPERTY_EBIT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitValue(@javax.annotation.Nullable Double ebitValue) {
    this.ebitValue = ebitValue;
  }


  /**
   * Return true if this IncomeStatementItem_ebitda object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemEbitda incomeStatementItemEbitda = (IncomeStatementItemEbitda) o;
    return Objects.equals(this.ebitdaValue, incomeStatementItemEbitda.ebitdaValue) &&
        Objects.equals(this.normalizedEbitdaValue, incomeStatementItemEbitda.normalizedEbitdaValue) &&
        Objects.equals(this.ebitValue, incomeStatementItemEbitda.ebitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebitdaValue, normalizedEbitdaValue, ebitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemEbitda {\n");
    sb.append("    ebitdaValue: ").append(toIndentedString(ebitdaValue)).append("\n");
    sb.append("    normalizedEbitdaValue: ").append(toIndentedString(normalizedEbitdaValue)).append("\n");
    sb.append("    ebitValue: ").append(toIndentedString(ebitValue)).append("\n");
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

    // add `ebitda_value` to the URL query string
    if (getEbitdaValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sebitda_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEbitdaValue()))));
    }

    // add `normalized_ebitda_value` to the URL query string
    if (getNormalizedEbitdaValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snormalized_ebitda_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNormalizedEbitdaValue()))));
    }

    // add `ebit_value` to the URL query string
    if (getEbitValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sebit_value%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEbitValue()))));
    }

    return joiner.toString();
  }
}

