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
import com.twelvedata.client.model.GetLogo200ResponseMeta;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetLogo200Response
 */
@JsonPropertyOrder({
  GetLogo200Response.JSON_PROPERTY_META,
  GetLogo200Response.JSON_PROPERTY_URL,
  GetLogo200Response.JSON_PROPERTY_LOGO_BASE,
  GetLogo200Response.JSON_PROPERTY_LOGO_QUOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetLogo200Response {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nonnull
  private GetLogo200ResponseMeta meta;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_LOGO_BASE = "logo_base";
  @javax.annotation.Nullable
  private String logoBase;

  public static final String JSON_PROPERTY_LOGO_QUOTE = "logo_quote";
  @javax.annotation.Nullable
  private String logoQuote;

  public GetLogo200Response() { 
  }

  public GetLogo200Response meta(@javax.annotation.Nonnull GetLogo200ResponseMeta meta) {
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
  public GetLogo200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(@javax.annotation.Nonnull GetLogo200ResponseMeta meta) {
    this.meta = meta;
  }


  public GetLogo200Response url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Link to download the logo (for stocks only)
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public GetLogo200Response logoBase(@javax.annotation.Nullable String logoBase) {
    this.logoBase = logoBase;
    return this;
  }

  /**
   * Link to download the base currency logo (for &#x60;forex&#x60; and &#x60;crypto&#x60; only)
   * @return logoBase
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_BASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoBase() {
    return logoBase;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_BASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoBase(@javax.annotation.Nullable String logoBase) {
    this.logoBase = logoBase;
  }


  public GetLogo200Response logoQuote(@javax.annotation.Nullable String logoQuote) {
    this.logoQuote = logoQuote;
    return this;
  }

  /**
   * Link to download the quote currency logo (for &#x60;forex&#x60; and &#x60;crypto&#x60; only)
   * @return logoQuote
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGO_QUOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoQuote() {
    return logoQuote;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGO_QUOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoQuote(@javax.annotation.Nullable String logoQuote) {
    this.logoQuote = logoQuote;
  }


  /**
   * Return true if this GetLogo_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLogo200Response getLogo200Response = (GetLogo200Response) o;
    return Objects.equals(this.meta, getLogo200Response.meta) &&
        Objects.equals(this.url, getLogo200Response.url) &&
        Objects.equals(this.logoBase, getLogo200Response.logoBase) &&
        Objects.equals(this.logoQuote, getLogo200Response.logoQuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, url, logoBase, logoQuote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLogo200Response {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    logoBase: ").append(toIndentedString(logoBase)).append("\n");
    sb.append("    logoQuote: ").append(toIndentedString(logoQuote)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%surl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUrl()))));
    }

    // add `logo_base` to the URL query string
    if (getLogoBase() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slogo_base%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLogoBase()))));
    }

    // add `logo_quote` to the URL query string
    if (getLogoQuote() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slogo_quote%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLogoQuote()))));
    }

    return joiner.toString();
  }
}

