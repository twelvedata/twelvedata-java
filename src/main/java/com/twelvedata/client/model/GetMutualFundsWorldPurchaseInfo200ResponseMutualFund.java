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
import com.twelvedata.client.model.ResponseMutualFundWorldPurchaseInfo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Mutual fund information
 */
@JsonPropertyOrder({
  GetMutualFundsWorldPurchaseInfo200ResponseMutualFund.JSON_PROPERTY_PURCHASE_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetMutualFundsWorldPurchaseInfo200ResponseMutualFund {
  public static final String JSON_PROPERTY_PURCHASE_INFO = "purchase_info";
  @javax.annotation.Nullable
  private ResponseMutualFundWorldPurchaseInfo purchaseInfo;

  public GetMutualFundsWorldPurchaseInfo200ResponseMutualFund() { 
  }

  public GetMutualFundsWorldPurchaseInfo200ResponseMutualFund purchaseInfo(@javax.annotation.Nullable ResponseMutualFundWorldPurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
    return this;
  }

  /**
   * Get purchaseInfo
   * @return purchaseInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PURCHASE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseMutualFundWorldPurchaseInfo getPurchaseInfo() {
    return purchaseInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_PURCHASE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseInfo(@javax.annotation.Nullable ResponseMutualFundWorldPurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
  }


  /**
   * Return true if this GetMutualFundsWorldPurchaseInfo_200_response_mutual_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMutualFundsWorldPurchaseInfo200ResponseMutualFund getMutualFundsWorldPurchaseInfo200ResponseMutualFund = (GetMutualFundsWorldPurchaseInfo200ResponseMutualFund) o;
    return Objects.equals(this.purchaseInfo, getMutualFundsWorldPurchaseInfo200ResponseMutualFund.purchaseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMutualFundsWorldPurchaseInfo200ResponseMutualFund {\n");
    sb.append("    purchaseInfo: ").append(toIndentedString(purchaseInfo)).append("\n");
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

    // add `purchase_info` to the URL query string
    if (getPurchaseInfo() != null) {
      joiner.add(getPurchaseInfo().toUrlQueryString(prefix + "purchase_info" + suffix));
    }

    return joiner.toString();
  }
}

