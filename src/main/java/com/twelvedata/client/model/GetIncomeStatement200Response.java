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
import com.twelvedata.client.model.GetIncomeStatement200ResponseMeta;
import com.twelvedata.client.model.IncomeStatementBlock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetIncomeStatement200Response
 */
@JsonPropertyOrder({
  GetIncomeStatement200Response.JSON_PROPERTY_META,
  GetIncomeStatement200Response.JSON_PROPERTY_INCOME_STATEMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetIncomeStatement200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetIncomeStatement200ResponseMeta meta;

  public static final String JSON_PROPERTY_INCOME_STATEMENT = "income_statement";
  @javax.annotation.Nullable
  private List<IncomeStatementBlock> incomeStatement = new ArrayList<>();

  public GetIncomeStatement200Response() { 
  }

  public GetIncomeStatement200Response meta(@javax.annotation.Nonnull GetIncomeStatement200ResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GetIncomeStatement200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetIncomeStatement200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetIncomeStatement200Response incomeStatement(@javax.annotation.Nullable List<IncomeStatementBlock> incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

  public GetIncomeStatement200Response addIncomeStatementItem(IncomeStatementBlock incomeStatementItem) {
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
  public List<IncomeStatementBlock> getIncomeStatement() {
    return incomeStatement;
  }


  @JsonProperty(value = JSON_PROPERTY_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomeStatement(@javax.annotation.Nullable List<IncomeStatementBlock> incomeStatement) {
    this.incomeStatement = incomeStatement;
  }


  /**
   * Return true if this GetIncomeStatement_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncomeStatement200Response getIncomeStatement200Response = (GetIncomeStatement200Response) o;
    return Objects.equals(this.meta, getIncomeStatement200Response.meta) &&
        Objects.equals(this.incomeStatement, getIncomeStatement200Response.incomeStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, incomeStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncomeStatement200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
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

    // add `meta` to the URL query string
    if (getMeta() != null) {
      joiner.add(getMeta().toUrlQueryString(prefix + "meta" + suffix));
    }

    // add `income_statement` to the URL query string
    if (getIncomeStatement() != null) {
      for (int i = 0; i < getIncomeStatement().size(); i++) {
        if (getIncomeStatement().get(i) != null) {
          joiner.add(getIncomeStatement().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sincome_statement%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

