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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * PressRelease
 */
@JsonPropertyOrder({
  PressRelease.JSON_PROPERTY_ID,
  PressRelease.JSON_PROPERTY_DATETIME,
  PressRelease.JSON_PROPERTY_TITLE,
  PressRelease.JSON_PROPERTY_BODY,
  PressRelease.JSON_PROPERTY_STYLE,
  PressRelease.JSON_PROPERTY_LANGUAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class PressRelease {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_DATETIME = "datetime";
  @javax.annotation.Nonnull
  private String datetime;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_BODY = "body";
  @javax.annotation.Nonnull
  private String body;

  public static final String JSON_PROPERTY_STYLE = "style";
  @javax.annotation.Nullable
  private String style;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private List<String> language = new ArrayList<>();

  public PressRelease() { 
  }

  public PressRelease id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Press release unique identifier
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public PressRelease datetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Press release date in ISO 8601 format
   * @return datetime
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatetime() {
    return datetime;
  }


  @JsonProperty(value = JSON_PROPERTY_DATETIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatetime(@javax.annotation.Nonnull String datetime) {
    this.datetime = datetime;
  }


  public PressRelease title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Press release title
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public PressRelease body(@javax.annotation.Nonnull String body) {
    this.body = body;
    return this;
  }

  /**
   * Press release body in html format
   * @return body
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BODY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBody() {
    return body;
  }


  @JsonProperty(value = JSON_PROPERTY_BODY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(@javax.annotation.Nonnull String body) {
    this.body = body;
  }


  public PressRelease style(@javax.annotation.Nullable String style) {
    this.style = style;
    return this;
  }

  /**
   * Custom style applied to the release
   * @return style
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStyle() {
    return style;
  }


  @JsonProperty(value = JSON_PROPERTY_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(@javax.annotation.Nullable String style) {
    this.style = style;
  }


  public PressRelease language(@javax.annotation.Nullable List<String> language) {
    this.language = language;
    return this;
  }

  public PressRelease addLanguageItem(String languageItem) {
    if (this.language == null) {
      this.language = new ArrayList<>();
    }
    this.language.add(languageItem);
    return this;
  }

  /**
   * Press release language codes
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LANGUAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLanguage() {
    return language;
  }


  @JsonProperty(value = JSON_PROPERTY_LANGUAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable List<String> language) {
    this.language = language;
  }


  /**
   * Return true if this PressRelease object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PressRelease pressRelease = (PressRelease) o;
    return Objects.equals(this.id, pressRelease.id) &&
        Objects.equals(this.datetime, pressRelease.datetime) &&
        Objects.equals(this.title, pressRelease.title) &&
        Objects.equals(this.body, pressRelease.body) &&
        Objects.equals(this.style, pressRelease.style) &&
        Objects.equals(this.language, pressRelease.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datetime, title, body, style, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PressRelease {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `datetime` to the URL query string
    if (getDatetime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdatetime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDatetime()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `body` to the URL query string
    if (getBody() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbody%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBody()))));
    }

    // add `style` to the URL query string
    if (getStyle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstyle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStyle()))));
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      for (int i = 0; i < getLanguage().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%slanguage%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getLanguage().get(i)))));
      }
    }

    return joiner.toString();
  }
}

