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
import com.twelvedata.client.model.AssetsInfo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Balance sheet for a specific fiscal date
 */
@JsonPropertyOrder({
  BalanceSheetConsolidatedItem.JSON_PROPERTY_FISCAL_DATE,
  BalanceSheetConsolidatedItem.JSON_PROPERTY_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class BalanceSheetConsolidatedItem {
  public static final String JSON_PROPERTY_FISCAL_DATE = "fiscal_date";
  @javax.annotation.Nonnull
  private String fiscalDate;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  @javax.annotation.Nullable
  private AssetsInfo assets;

  public BalanceSheetConsolidatedItem() { 
  }

  public BalanceSheetConsolidatedItem fiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
    return this;
  }

  /**
   * Date of fiscal period ending
   * @return fiscalDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFiscalDate() {
    return fiscalDate;
  }


  @JsonProperty(value = JSON_PROPERTY_FISCAL_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiscalDate(@javax.annotation.Nonnull String fiscalDate) {
    this.fiscalDate = fiscalDate;
  }


  public BalanceSheetConsolidatedItem assets(@javax.annotation.Nullable AssetsInfo assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetsInfo getAssets() {
    return assets;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssets(@javax.annotation.Nullable AssetsInfo assets) {
    this.assets = assets;
  }


  /**
   * Return true if this BalanceSheetConsolidatedItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceSheetConsolidatedItem balanceSheetConsolidatedItem = (BalanceSheetConsolidatedItem) o;
    return Objects.equals(this.fiscalDate, balanceSheetConsolidatedItem.fiscalDate) &&
        Objects.equals(this.assets, balanceSheetConsolidatedItem.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalDate, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceSheetConsolidatedItem {\n");
    sb.append("    fiscalDate: ").append(toIndentedString(fiscalDate)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

    // add `fiscal_date` to the URL query string
    if (getFiscalDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiscal_date%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiscalDate()))));
    }

    // add `assets` to the URL query string
    if (getAssets() != null) {
      joiner.add(getAssets().toUrlQueryString(prefix + "assets" + suffix));
    }

    return joiner.toString();
  }
}

