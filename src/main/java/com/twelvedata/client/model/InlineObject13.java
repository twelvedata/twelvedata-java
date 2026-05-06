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
import com.twelvedata.client.model.InlineObject13Meta;
import com.twelvedata.client.model.InlineObject13ValuesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * InlineObject13
 */
@JsonPropertyOrder({
  InlineObject13.JSON_PROPERTY_META,
  InlineObject13.JSON_PROPERTY_VALUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject13 {
  public static final String JSON_PROPERTY_META = "meta";
  @javax.annotation.Nullable
  private InlineObject13Meta meta;

  public static final String JSON_PROPERTY_VALUES = "values";
  @javax.annotation.Nullable
  private List<InlineObject13ValuesInner> values = new ArrayList<>();

  public InlineObject13() { 
  }

  public InlineObject13 meta(@javax.annotation.Nullable InlineObject13Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_META, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public InlineObject13Meta getMeta() {
    return meta;
  }


  @JsonProperty(value = JSON_PROPERTY_META, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(@javax.annotation.Nullable InlineObject13Meta meta) {
    this.meta = meta;
  }


  public InlineObject13 values(@javax.annotation.Nullable List<InlineObject13ValuesInner> values) {
    this.values = values;
    return this;
  }

  public InlineObject13 addValuesItem(InlineObject13ValuesInner valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<InlineObject13ValuesInner> getValues() {
    return values;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(@javax.annotation.Nullable List<InlineObject13ValuesInner> values) {
    this.values = values;
  }


  /**
   * Return true if this inline_object_13 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject13 inlineObject13 = (InlineObject13) o;
    return Objects.equals(this.meta, inlineObject13.meta) &&
        Objects.equals(this.values, inlineObject13.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject13 {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

    // add `values` to the URL query string
    if (getValues() != null) {
      for (int i = 0; i < getValues().size(); i++) {
        if (getValues().get(i) != null) {
          joiner.add(getValues().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%svalues%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

