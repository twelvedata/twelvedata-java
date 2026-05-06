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
 * Inventory information
 */
@JsonPropertyOrder({
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_TOTAL_INVENTORY,
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_INVENTORIES_ADJUSTMENTS_ALLOWANCES,
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_OTHER_INVENTORIES,
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_FINISHED_GOODS,
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_WORK_IN_PROCESS,
  AssetsInfoCurrentAssetsInventory.JSON_PROPERTY_RAW_MATERIALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class AssetsInfoCurrentAssetsInventory {
  public static final String JSON_PROPERTY_TOTAL_INVENTORY = "total_inventory";
  @javax.annotation.Nullable
  private Double totalInventory;

  public static final String JSON_PROPERTY_INVENTORIES_ADJUSTMENTS_ALLOWANCES = "inventories_adjustments_allowances";
  @javax.annotation.Nullable
  private Double inventoriesAdjustmentsAllowances;

  public static final String JSON_PROPERTY_OTHER_INVENTORIES = "other_inventories";
  @javax.annotation.Nullable
  private Double otherInventories;

  public static final String JSON_PROPERTY_FINISHED_GOODS = "finished_goods";
  @javax.annotation.Nullable
  private Double finishedGoods;

  public static final String JSON_PROPERTY_WORK_IN_PROCESS = "work_in_process";
  @javax.annotation.Nullable
  private Double workInProcess;

  public static final String JSON_PROPERTY_RAW_MATERIALS = "raw_materials";
  @javax.annotation.Nullable
  private Double rawMaterials;

  public AssetsInfoCurrentAssetsInventory() { 
  }

  public AssetsInfoCurrentAssetsInventory totalInventory(@javax.annotation.Nullable Double totalInventory) {
    this.totalInventory = totalInventory;
    return this;
  }

  /**
   * Total inventory
   * @return totalInventory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalInventory() {
    return totalInventory;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_INVENTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalInventory(@javax.annotation.Nullable Double totalInventory) {
    this.totalInventory = totalInventory;
  }


  public AssetsInfoCurrentAssetsInventory inventoriesAdjustmentsAllowances(@javax.annotation.Nullable Double inventoriesAdjustmentsAllowances) {
    this.inventoriesAdjustmentsAllowances = inventoriesAdjustmentsAllowances;
    return this;
  }

  /**
   * Inventories adjustments allowances
   * @return inventoriesAdjustmentsAllowances
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INVENTORIES_ADJUSTMENTS_ALLOWANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInventoriesAdjustmentsAllowances() {
    return inventoriesAdjustmentsAllowances;
  }


  @JsonProperty(value = JSON_PROPERTY_INVENTORIES_ADJUSTMENTS_ALLOWANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventoriesAdjustmentsAllowances(@javax.annotation.Nullable Double inventoriesAdjustmentsAllowances) {
    this.inventoriesAdjustmentsAllowances = inventoriesAdjustmentsAllowances;
  }


  public AssetsInfoCurrentAssetsInventory otherInventories(@javax.annotation.Nullable Double otherInventories) {
    this.otherInventories = otherInventories;
    return this;
  }

  /**
   * Other inventories
   * @return otherInventories
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_INVENTORIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherInventories() {
    return otherInventories;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_INVENTORIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherInventories(@javax.annotation.Nullable Double otherInventories) {
    this.otherInventories = otherInventories;
  }


  public AssetsInfoCurrentAssetsInventory finishedGoods(@javax.annotation.Nullable Double finishedGoods) {
    this.finishedGoods = finishedGoods;
    return this;
  }

  /**
   * Finished goods
   * @return finishedGoods
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FINISHED_GOODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFinishedGoods() {
    return finishedGoods;
  }


  @JsonProperty(value = JSON_PROPERTY_FINISHED_GOODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedGoods(@javax.annotation.Nullable Double finishedGoods) {
    this.finishedGoods = finishedGoods;
  }


  public AssetsInfoCurrentAssetsInventory workInProcess(@javax.annotation.Nullable Double workInProcess) {
    this.workInProcess = workInProcess;
    return this;
  }

  /**
   * Work in process
   * @return workInProcess
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WORK_IN_PROCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWorkInProcess() {
    return workInProcess;
  }


  @JsonProperty(value = JSON_PROPERTY_WORK_IN_PROCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkInProcess(@javax.annotation.Nullable Double workInProcess) {
    this.workInProcess = workInProcess;
  }


  public AssetsInfoCurrentAssetsInventory rawMaterials(@javax.annotation.Nullable Double rawMaterials) {
    this.rawMaterials = rawMaterials;
    return this;
  }

  /**
   * Raw materials
   * @return rawMaterials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RAW_MATERIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRawMaterials() {
    return rawMaterials;
  }


  @JsonProperty(value = JSON_PROPERTY_RAW_MATERIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawMaterials(@javax.annotation.Nullable Double rawMaterials) {
    this.rawMaterials = rawMaterials;
  }


  /**
   * Return true if this AssetsInfo_current_assets_inventory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsInfoCurrentAssetsInventory assetsInfoCurrentAssetsInventory = (AssetsInfoCurrentAssetsInventory) o;
    return Objects.equals(this.totalInventory, assetsInfoCurrentAssetsInventory.totalInventory) &&
        Objects.equals(this.inventoriesAdjustmentsAllowances, assetsInfoCurrentAssetsInventory.inventoriesAdjustmentsAllowances) &&
        Objects.equals(this.otherInventories, assetsInfoCurrentAssetsInventory.otherInventories) &&
        Objects.equals(this.finishedGoods, assetsInfoCurrentAssetsInventory.finishedGoods) &&
        Objects.equals(this.workInProcess, assetsInfoCurrentAssetsInventory.workInProcess) &&
        Objects.equals(this.rawMaterials, assetsInfoCurrentAssetsInventory.rawMaterials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalInventory, inventoriesAdjustmentsAllowances, otherInventories, finishedGoods, workInProcess, rawMaterials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsInfoCurrentAssetsInventory {\n");
    sb.append("    totalInventory: ").append(toIndentedString(totalInventory)).append("\n");
    sb.append("    inventoriesAdjustmentsAllowances: ").append(toIndentedString(inventoriesAdjustmentsAllowances)).append("\n");
    sb.append("    otherInventories: ").append(toIndentedString(otherInventories)).append("\n");
    sb.append("    finishedGoods: ").append(toIndentedString(finishedGoods)).append("\n");
    sb.append("    workInProcess: ").append(toIndentedString(workInProcess)).append("\n");
    sb.append("    rawMaterials: ").append(toIndentedString(rawMaterials)).append("\n");
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

    // add `total_inventory` to the URL query string
    if (getTotalInventory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_inventory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalInventory()))));
    }

    // add `inventories_adjustments_allowances` to the URL query string
    if (getInventoriesAdjustmentsAllowances() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinventories_adjustments_allowances%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInventoriesAdjustmentsAllowances()))));
    }

    // add `other_inventories` to the URL query string
    if (getOtherInventories() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_inventories%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherInventories()))));
    }

    // add `finished_goods` to the URL query string
    if (getFinishedGoods() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinished_goods%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinishedGoods()))));
    }

    // add `work_in_process` to the URL query string
    if (getWorkInProcess() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swork_in_process%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWorkInProcess()))));
    }

    // add `raw_materials` to the URL query string
    if (getRawMaterials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sraw_materials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRawMaterials()))));
    }

    return joiner.toString();
  }
}

