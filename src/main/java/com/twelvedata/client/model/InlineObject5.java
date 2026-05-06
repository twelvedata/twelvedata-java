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
import com.twelvedata.client.model.OptionSide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * InlineObject5
 */
@JsonPropertyOrder({
  InlineObject5.JSON_PROPERTY_CALLS,
  InlineObject5.JSON_PROPERTY_PUTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class InlineObject5 {
  public static final String JSON_PROPERTY_CALLS = "calls";
  @javax.annotation.Nullable
  private List<OptionSide> calls = new ArrayList<>();

  public static final String JSON_PROPERTY_PUTS = "puts";
  @javax.annotation.Nullable
  private List<OptionSide> puts = new ArrayList<>();

  public InlineObject5() { 
  }

  public InlineObject5 calls(@javax.annotation.Nullable List<OptionSide> calls) {
    this.calls = calls;
    return this;
  }

  public InlineObject5 addCallsItem(OptionSide callsItem) {
    if (this.calls == null) {
      this.calls = new ArrayList<>();
    }
    this.calls.add(callsItem);
    return this;
  }

  /**
   * Get calls
   * @return calls
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CALLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OptionSide> getCalls() {
    return calls;
  }


  @JsonProperty(value = JSON_PROPERTY_CALLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalls(@javax.annotation.Nullable List<OptionSide> calls) {
    this.calls = calls;
  }


  public InlineObject5 puts(@javax.annotation.Nullable List<OptionSide> puts) {
    this.puts = puts;
    return this;
  }

  public InlineObject5 addPutsItem(OptionSide putsItem) {
    if (this.puts == null) {
      this.puts = new ArrayList<>();
    }
    this.puts.add(putsItem);
    return this;
  }

  /**
   * Get puts
   * @return puts
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OptionSide> getPuts() {
    return puts;
  }


  @JsonProperty(value = JSON_PROPERTY_PUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPuts(@javax.annotation.Nullable List<OptionSide> puts) {
    this.puts = puts;
  }


  /**
   * Return true if this inline_object_5 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.calls, inlineObject5.calls) &&
        Objects.equals(this.puts, inlineObject5.puts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, puts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    puts: ").append(toIndentedString(puts)).append("\n");
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

    // add `calls` to the URL query string
    if (getCalls() != null) {
      for (int i = 0; i < getCalls().size(); i++) {
        if (getCalls().get(i) != null) {
          joiner.add(getCalls().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scalls%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `puts` to the URL query string
    if (getPuts() != null) {
      for (int i = 0; i < getPuts().size(); i++) {
        if (getPuts().get(i) != null) {
          joiner.add(getPuts().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sputs%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

