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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Filing file object
 */
@JsonPropertyOrder({
  EdgarFilingFile.JSON_PROPERTY_NAME,
  EdgarFilingFile.JSON_PROPERTY_SIZE,
  EdgarFilingFile.JSON_PROPERTY_TYPE,
  EdgarFilingFile.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EdgarFilingFile {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable
  private Long size;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nonnull
  private String url;

  public EdgarFilingFile() { 
  }

  public EdgarFilingFile name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * File name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public EdgarFilingFile size(@javax.annotation.Nullable Long size) {
    this.size = size;
    return this;
  }

  /**
   * File size
   * @return size
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }


  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(@javax.annotation.Nullable Long size) {
    this.size = size;
  }


  public EdgarFilingFile type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * File type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public EdgarFilingFile url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * File full url
   * @return url
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(value = JSON_PROPERTY_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  /**
   * Return true if this EdgarFilingFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgarFilingFile edgarFilingFile = (EdgarFilingFile) o;
    return Objects.equals(this.name, edgarFilingFile.name) &&
        Objects.equals(this.size, edgarFilingFile.size) &&
        Objects.equals(this.type, edgarFilingFile.type) &&
        Objects.equals(this.url, edgarFilingFile.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgarFilingFile {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSize()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%surl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUrl()))));
    }

    return joiner.toString();
  }
}

