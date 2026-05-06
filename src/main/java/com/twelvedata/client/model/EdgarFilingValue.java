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
import com.twelvedata.client.model.EdgarFilingFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.twelvedata.client.ApiClient;
/**
 * Filing value object
 */
@JsonPropertyOrder({
  EdgarFilingValue.JSON_PROPERTY_CIK,
  EdgarFilingValue.JSON_PROPERTY_FILED_AT,
  EdgarFilingValue.JSON_PROPERTY_FILES,
  EdgarFilingValue.JSON_PROPERTY_FILING_URL,
  EdgarFilingValue.JSON_PROPERTY_FORM_TYPE,
  EdgarFilingValue.JSON_PROPERTY_TICKER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class EdgarFilingValue {
  public static final String JSON_PROPERTY_CIK = "cik";
  @javax.annotation.Nonnull
  private Long cik;

  public static final String JSON_PROPERTY_FILED_AT = "filed_at";
  @javax.annotation.Nonnull
  private Long filedAt;

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable
  private List<EdgarFilingFile> files = new ArrayList<>();

  public static final String JSON_PROPERTY_FILING_URL = "filing_url";
  @javax.annotation.Nonnull
  private String filingUrl;

  public static final String JSON_PROPERTY_FORM_TYPE = "form_type";
  @javax.annotation.Nonnull
  private String formType;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  @javax.annotation.Nonnull
  private List<String> ticker = new ArrayList<>();

  public EdgarFilingValue() { 
  }

  public EdgarFilingValue cik(@javax.annotation.Nonnull Long cik) {
    this.cik = cik;
    return this;
  }

  /**
   * CIK code
   * @return cik
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CIK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCik() {
    return cik;
  }


  @JsonProperty(value = JSON_PROPERTY_CIK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCik(@javax.annotation.Nonnull Long cik) {
    this.cik = cik;
  }


  public EdgarFilingValue filedAt(@javax.annotation.Nonnull Long filedAt) {
    this.filedAt = filedAt;
    return this;
  }

  /**
   * Filing date in UNIX timestamp
   * @return filedAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FILED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFiledAt() {
    return filedAt;
  }


  @JsonProperty(value = JSON_PROPERTY_FILED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiledAt(@javax.annotation.Nonnull Long filedAt) {
    this.filedAt = filedAt;
  }


  public EdgarFilingValue files(@javax.annotation.Nullable List<EdgarFilingFile> files) {
    this.files = files;
    return this;
  }

  public EdgarFilingValue addFilesItem(EdgarFilingFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Filing files
   * @return files
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EdgarFilingFile> getFiles() {
    return files;
  }


  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(@javax.annotation.Nullable List<EdgarFilingFile> files) {
    this.files = files;
  }


  public EdgarFilingValue filingUrl(@javax.annotation.Nonnull String filingUrl) {
    this.filingUrl = filingUrl;
    return this;
  }

  /**
   * Full URL of the filing
   * @return filingUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FILING_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilingUrl() {
    return filingUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_FILING_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilingUrl(@javax.annotation.Nonnull String filingUrl) {
    this.filingUrl = filingUrl;
  }


  public EdgarFilingValue formType(@javax.annotation.Nonnull String formType) {
    this.formType = formType;
    return this;
  }

  /**
   * Filing form type
   * @return formType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FORM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormType() {
    return formType;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormType(@javax.annotation.Nonnull String formType) {
    this.formType = formType;
  }


  public EdgarFilingValue ticker(@javax.annotation.Nonnull List<String> ticker) {
    this.ticker = ticker;
    return this;
  }

  public EdgarFilingValue addTickerItem(String tickerItem) {
    if (this.ticker == null) {
      this.ticker = new ArrayList<>();
    }
    this.ticker.add(tickerItem);
    return this;
  }

  /**
   * Ticker symbols associated with the filing
   * @return ticker
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TICKER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTicker() {
    return ticker;
  }


  @JsonProperty(value = JSON_PROPERTY_TICKER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTicker(@javax.annotation.Nonnull List<String> ticker) {
    this.ticker = ticker;
  }


  /**
   * Return true if this EdgarFilingValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgarFilingValue edgarFilingValue = (EdgarFilingValue) o;
    return Objects.equals(this.cik, edgarFilingValue.cik) &&
        Objects.equals(this.filedAt, edgarFilingValue.filedAt) &&
        Objects.equals(this.files, edgarFilingValue.files) &&
        Objects.equals(this.filingUrl, edgarFilingValue.filingUrl) &&
        Objects.equals(this.formType, edgarFilingValue.formType) &&
        Objects.equals(this.ticker, edgarFilingValue.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cik, filedAt, files, filingUrl, formType, ticker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgarFilingValue {\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    filedAt: ").append(toIndentedString(filedAt)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    filingUrl: ").append(toIndentedString(filingUrl)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

    // add `cik` to the URL query string
    if (getCik() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scik%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCik()))));
    }

    // add `filed_at` to the URL query string
    if (getFiledAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiled_at%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFiledAt()))));
    }

    // add `files` to the URL query string
    if (getFiles() != null) {
      for (int i = 0; i < getFiles().size(); i++) {
        if (getFiles().get(i) != null) {
          joiner.add(getFiles().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sfiles%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `filing_url` to the URL query string
    if (getFilingUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfiling_url%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFilingUrl()))));
    }

    // add `form_type` to the URL query string
    if (getFormType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sform_type%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFormType()))));
    }

    // add `ticker` to the URL query string
    if (getTicker() != null) {
      for (int i = 0; i < getTicker().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sticker%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTicker().get(i)))));
      }
    }

    return joiner.toString();
  }
}

