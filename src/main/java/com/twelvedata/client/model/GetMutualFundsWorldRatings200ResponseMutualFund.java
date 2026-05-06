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
import com.twelvedata.client.model.ResponseMutualFundWorldRatings;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund information
 */
@JsonPropertyOrder({
  GetMutualFundsWorldRatings200ResponseMutualFund.JSON_PROPERTY_RATINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorldRatings200ResponseMutualFund {
  public static final String JSON_PROPERTY_RATINGS = "ratings";
  @javax.annotation.Nullable
  private ResponseMutualFundWorldRatings ratings;

  public GetMutualFundsWorldRatings200ResponseMutualFund() { 
  }

  public GetMutualFundsWorldRatings200ResponseMutualFund ratings(@javax.annotation.Nullable ResponseMutualFundWorldRatings ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * Get ratings
   * @return ratings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseMutualFundWorldRatings getRatings() {
    return ratings;
  }


  @JsonProperty(value = JSON_PROPERTY_RATINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatings(@javax.annotation.Nullable ResponseMutualFundWorldRatings ratings) {
    this.ratings = ratings;
  }


  /**
   * Return true if this GetMutualFundsWorldRatings_200_response_mutual_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorldRatings200ResponseMutualFund getMutualFundsWorldRatings200ResponseMutualFund = (GetMutualFundsWorldRatings200ResponseMutualFund) o;
    return Objects.equals(this.ratings, getMutualFundsWorldRatings200ResponseMutualFund.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorldRatings200ResponseMutualFund {\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

    // add `ratings` to the URL query string
    if (getRatings() != null) {
      joiner.add(getRatings().toUrlQueryString(prefix + "ratings" + suffix));
    }

    return joiner.toString();
  }
}

