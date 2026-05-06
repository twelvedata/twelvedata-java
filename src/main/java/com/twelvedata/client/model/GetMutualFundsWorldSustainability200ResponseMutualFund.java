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
import com.twelvedata.client.model.ResponseMutualFundWorldSustainability;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund information
 */
@JsonPropertyOrder({
  GetMutualFundsWorldSustainability200ResponseMutualFund.JSON_PROPERTY_SUSTAINABILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorldSustainability200ResponseMutualFund {
  public static final String JSON_PROPERTY_SUSTAINABILITY = "sustainability";
  @javax.annotation.Nullable
  private ResponseMutualFundWorldSustainability sustainability;

  public GetMutualFundsWorldSustainability200ResponseMutualFund() { 
  }

  public GetMutualFundsWorldSustainability200ResponseMutualFund sustainability(@javax.annotation.Nullable ResponseMutualFundWorldSustainability sustainability) {
    this.sustainability = sustainability;
    return this;
  }

  /**
   * Get sustainability
   * @return sustainability
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUSTAINABILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseMutualFundWorldSustainability getSustainability() {
    return sustainability;
  }


  @JsonProperty(value = JSON_PROPERTY_SUSTAINABILITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSustainability(@javax.annotation.Nullable ResponseMutualFundWorldSustainability sustainability) {
    this.sustainability = sustainability;
  }


  /**
   * Return true if this GetMutualFundsWorldSustainability_200_response_mutual_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorldSustainability200ResponseMutualFund getMutualFundsWorldSustainability200ResponseMutualFund = (GetMutualFundsWorldSustainability200ResponseMutualFund) o;
    return Objects.equals(this.sustainability, getMutualFundsWorldSustainability200ResponseMutualFund.sustainability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sustainability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorldSustainability200ResponseMutualFund {\n");
    sb.append("    sustainability: ").append(toIndentedString(sustainability)).append("\n");
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

    // add `sustainability` to the URL query string
    if (getSustainability() != null) {
      joiner.add(getSustainability().toUrlQueryString(prefix + "sustainability" + suffix));
    }

    return joiner.toString();
  }
}

