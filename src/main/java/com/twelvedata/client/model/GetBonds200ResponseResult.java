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
import com.twelvedata.client.model.BondResponseItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * GetBonds200ResponseResult
 */
@JsonPropertyOrder({
  GetBonds200ResponseResult.JSON_PROPERTY_COUNT,
  GetBonds200ResponseResult.JSON_PROPERTY_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class GetBonds200ResponseResult {
  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nonnull
  private Long count;

  public static final String JSON_PROPERTY_LIST = "list";
  @javax.annotation.Nonnull
  private List<BondResponseItem> _list = new ArrayList<>();

  public GetBonds200ResponseResult() { 
  }

  public GetBonds200ResponseResult count(@javax.annotation.Nonnull Long count) {
    this.count = count;
    return this;
  }

  /**
   * Total number of matching instruments
   * @return count
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(@javax.annotation.Nonnull Long count) {
    this.count = count;
  }


  public GetBonds200ResponseResult _list(@javax.annotation.Nonnull List<BondResponseItem> _list) {
    this._list = _list;
    return this;
  }

  public GetBonds200ResponseResult addListItem(BondResponseItem _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * List of bonds
   * @return _list
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LIST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<BondResponseItem> getList() {
    return _list;
  }


  @JsonProperty(value = JSON_PROPERTY_LIST, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setList(@javax.annotation.Nonnull List<BondResponseItem> _list) {
    this._list = _list;
  }


  /**
   * Return true if this GetBonds_200_response_result object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBonds200ResponseResult getBonds200ResponseResult = (GetBonds200ResponseResult) o;
    return Objects.equals(this.count, getBonds200ResponseResult.count) &&
        Objects.equals(this._list, getBonds200ResponseResult._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBonds200ResponseResult {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

    // add `count` to the URL query string
    if (getCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCount()))));
    }

    // add `list` to the URL query string
    if (getList() != null) {
      for (int i = 0; i < getList().size(); i++) {
        if (getList().get(i) != null) {
          joiner.add(getList().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%slist%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

