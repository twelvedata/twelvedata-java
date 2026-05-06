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
import com.twelvedata.client.model.ResponseMutualFundWorldComposition;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund information
 */
@JsonPropertyOrder({
  GetMutualFundsWorldComposition200ResponseMutualFund.JSON_PROPERTY_COMPOSITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorldComposition200ResponseMutualFund {
  public static final String JSON_PROPERTY_COMPOSITION = "composition";
  @javax.annotation.Nullable
  private ResponseMutualFundWorldComposition composition;

  public GetMutualFundsWorldComposition200ResponseMutualFund() { 
  }

  public GetMutualFundsWorldComposition200ResponseMutualFund composition(@javax.annotation.Nullable ResponseMutualFundWorldComposition composition) {
    this.composition = composition;
    return this;
  }

  /**
   * Get composition
   * @return composition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPOSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseMutualFundWorldComposition getComposition() {
    return composition;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPOSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposition(@javax.annotation.Nullable ResponseMutualFundWorldComposition composition) {
    this.composition = composition;
  }


  /**
   * Return true if this GetMutualFundsWorldComposition_200_response_mutual_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorldComposition200ResponseMutualFund getMutualFundsWorldComposition200ResponseMutualFund = (GetMutualFundsWorldComposition200ResponseMutualFund) o;
    return Objects.equals(this.composition, getMutualFundsWorldComposition200ResponseMutualFund.composition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(composition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorldComposition200ResponseMutualFund {\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
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

    // add `composition` to the URL query string
    if (getComposition() != null) {
      joiner.add(getComposition().toUrlQueryString(prefix + "composition" + suffix));
    }

    return joiner.toString();
  }
}

