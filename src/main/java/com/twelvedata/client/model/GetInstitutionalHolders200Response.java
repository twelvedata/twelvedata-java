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
import com.twelvedata.client.model.GetFundHolders200ResponseMeta;
import com.twelvedata.client.model.InstitutionalHolderItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetInstitutionalHolders200Response
 */
@JsonPropertyOrder({
  GetInstitutionalHolders200Response.JSON_PROPERTY_META,
  GetInstitutionalHolders200Response.JSON_PROPERTY_INSTITUTIONAL_HOLDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetInstitutionalHolders200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetFundHolders200ResponseMeta meta;

  public static final String JSON_PROPERTY_INSTITUTIONAL_HOLDERS = "institutional_holders";
  @javax.annotation.Nonnull
  private List<InstitutionalHolderItem> institutionalHolders = new ArrayList<>();

  public GetInstitutionalHolders200Response() { 
  }

  public GetInstitutionalHolders200Response meta(@javax.annotation.Nonnull GetFundHolders200ResponseMeta meta) {
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
  public GetFundHolders200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetFundHolders200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetInstitutionalHolders200Response institutionalHolders(@javax.annotation.Nonnull List<InstitutionalHolderItem> institutionalHolders) {
    this.institutionalHolders = institutionalHolders;
    return this;
  }

  public GetInstitutionalHolders200Response addInstitutionalHoldersItem(InstitutionalHolderItem institutionalHoldersItem) {
    if (this.institutionalHolders == null) {
      this.institutionalHolders = new ArrayList<>();
    }
    this.institutionalHolders.add(institutionalHoldersItem);
    return this;
  }

  /**
   * List of institutional holders for the financial instrument
   * @return institutionalHolders
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_INSTITUTIONAL_HOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<InstitutionalHolderItem> getInstitutionalHolders() {
    return institutionalHolders;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTITUTIONAL_HOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionalHolders(@javax.annotation.Nonnull List<InstitutionalHolderItem> institutionalHolders) {
    this.institutionalHolders = institutionalHolders;
  }


  /**
   * Return true if this GetInstitutionalHolders_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstitutionalHolders200Response getInstitutionalHolders200Response = (GetInstitutionalHolders200Response) o;
    return Objects.equals(this.meta, getInstitutionalHolders200Response.meta) &&
        Objects.equals(this.institutionalHolders, getInstitutionalHolders200Response.institutionalHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, institutionalHolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstitutionalHolders200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    institutionalHolders: ").append(toIndentedString(institutionalHolders)).append("\n");
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

    // add `institutional_holders` to the URL query string
    if (getInstitutionalHolders() != null) {
      for (int i = 0; i < getInstitutionalHolders().size(); i++) {
        if (getInstitutionalHolders().get(i) != null) {
          joiner.add(getInstitutionalHolders().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sinstitutional_holders%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

