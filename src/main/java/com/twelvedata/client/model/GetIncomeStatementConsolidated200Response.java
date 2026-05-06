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
import com.twelvedata.client.model.IncomeStatementItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetIncomeStatementConsolidated200Response
 */
@JsonPropertyOrder({
  GetIncomeStatementConsolidated200Response.JSON_PROPERTY_INCOME_STATEMENT,
  GetIncomeStatementConsolidated200Response.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetIncomeStatementConsolidated200Response {
  public static final String JSON_PROPERTY_INCOME_STATEMENT = "income_statement";
  @javax.annotation.Nullable
  private List<IncomeStatementItem> incomeStatement = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private String status;

  public GetIncomeStatementConsolidated200Response() { 
  }

  public GetIncomeStatementConsolidated200Response incomeStatement(@javax.annotation.Nullable List<IncomeStatementItem> incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

  public GetIncomeStatementConsolidated200Response addIncomeStatementItem(IncomeStatementItem incomeStatementItem) {
    if (this.incomeStatement == null) {
      this.incomeStatement = new ArrayList<>();
    }
    this.incomeStatement.add(incomeStatementItem);
    return this;
  }

  /**
   * Income statement data
   * @return incomeStatement
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncomeStatementItem> getIncomeStatement() {
    return incomeStatement;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeStatement(@javax.annotation.Nullable List<IncomeStatementItem> incomeStatement) {
    this.incomeStatement = incomeStatement;
  }


  public GetIncomeStatementConsolidated200Response status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Response status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  /**
   * Return true if this GetIncomeStatementConsolidated_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncomeStatementConsolidated200Response getIncomeStatementConsolidated200Response = (GetIncomeStatementConsolidated200Response) o;
    return Objects.equals(this.incomeStatement, getIncomeStatementConsolidated200Response.incomeStatement) &&
        Objects.equals(this.status, getIncomeStatementConsolidated200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeStatement, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncomeStatementConsolidated200Response {\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `income_statement` to the URL query string
    if (getIncomeStatement() != null) {
      for (int i = 0; i < getIncomeStatement().size(); i++) {
        if (getIncomeStatement().get(i) != null) {
          joiner.add(getIncomeStatement().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sincome_statement%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

