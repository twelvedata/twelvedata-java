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
import com.twelvedata.client.model.ResponseSanctionItemList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * ResponseSanctionItem
 */
@JsonPropertyOrder({
  ResponseSanctionItem.JSON_PROPERTY_SOURCE,
  ResponseSanctionItem.JSON_PROPERTY_PROGRAM,
  ResponseSanctionItem.JSON_PROPERTY_NOTES,
  ResponseSanctionItem.JSON_PROPERTY_LISTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class ResponseSanctionItem {
  public static final String JSON_PROPERTY_SOURCE = "source";
  @javax.annotation.Nonnull
  private String source;

  public static final String JSON_PROPERTY_PROGRAM = "program";
  @javax.annotation.Nonnull
  private String program;

  public static final String JSON_PROPERTY_NOTES = "notes";
  @javax.annotation.Nonnull
  private String notes;

  public static final String JSON_PROPERTY_LISTS = "lists";
  @javax.annotation.Nonnull
  private List<ResponseSanctionItemList> lists = new ArrayList<>();

  public ResponseSanctionItem() { 
  }

  public ResponseSanctionItem source(@javax.annotation.Nonnull String source) {
    this.source = source;
    return this;
  }

  /**
   * The sanction source
   * @return source
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SOURCE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(@javax.annotation.Nonnull String source) {
    this.source = source;
  }


  public ResponseSanctionItem program(@javax.annotation.Nonnull String program) {
    this.program = program;
    return this;
  }

  /**
   * The sanction program
   * @return program
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PROGRAM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProgram() {
    return program;
  }


  @JsonProperty(value = JSON_PROPERTY_PROGRAM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgram(@javax.annotation.Nonnull String program) {
    this.program = program;
  }


  public ResponseSanctionItem notes(@javax.annotation.Nonnull String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes for the sanction
   * @return notes
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NOTES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNotes() {
    return notes;
  }


  @JsonProperty(value = JSON_PROPERTY_NOTES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotes(@javax.annotation.Nonnull String notes) {
    this.notes = notes;
  }


  public ResponseSanctionItem lists(@javax.annotation.Nonnull List<ResponseSanctionItemList> lists) {
    this.lists = lists;
    return this;
  }

  public ResponseSanctionItem addListsItem(ResponseSanctionItemList listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

  /**
   * Sanction lists
   * @return lists
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LISTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ResponseSanctionItemList> getLists() {
    return lists;
  }


  @JsonProperty(value = JSON_PROPERTY_LISTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLists(@javax.annotation.Nonnull List<ResponseSanctionItemList> lists) {
    this.lists = lists;
  }


  /**
   * Return true if this ResponseSanctionItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSanctionItem responseSanctionItem = (ResponseSanctionItem) o;
    return Objects.equals(this.source, responseSanctionItem.source) &&
        Objects.equals(this.program, responseSanctionItem.program) &&
        Objects.equals(this.notes, responseSanctionItem.notes) &&
        Objects.equals(this.lists, responseSanctionItem.lists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, program, notes, lists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSanctionItem {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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

    // add `source` to the URL query string
    if (getSource() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssource%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSource()))));
    }

    // add `program` to the URL query string
    if (getProgram() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprogram%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProgram()))));
    }

    // add `notes` to the URL query string
    if (getNotes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snotes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNotes()))));
    }

    // add `lists` to the URL query string
    if (getLists() != null) {
      for (int i = 0; i < getLists().size(); i++) {
        if (getLists().get(i) != null) {
          joiner.add(getLists().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%slists%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

