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
 * Expenses information
 */
@JsonPropertyOrder({
  IncomeStatementItemExpenses.JSON_PROPERTY_TOTAL_EXPENSES,
  IncomeStatementItemExpenses.JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATION_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_SELLING_AND_MARKETING_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_GENERAL_AND_ADMINISTRATIVE_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_OTHER_GENERAL_AND_ADMINISTRATIVE_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION_INCOME_STATEMENT,
  IncomeStatementItemExpenses.JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_INSURANCE_AND_CLAIMS_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_RENT_AND_LANDING_FEES,
  IncomeStatementItemExpenses.JSON_PROPERTY_SALARIES_AND_WAGES_EXPENSE,
  IncomeStatementItemExpenses.JSON_PROPERTY_RENT_EXPENSE_SUPPLEMENTAL,
  IncomeStatementItemExpenses.JSON_PROPERTY_PROVISION_FOR_DOUBTFUL_ACCOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.19.0")
public class IncomeStatementItemExpenses {
  public static final String JSON_PROPERTY_TOTAL_EXPENSES = "total_expenses";
  @javax.annotation.Nullable
  private Double totalExpenses;

  public static final String JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATION_EXPENSE = "selling_general_and_administration_expense";
  @javax.annotation.Nullable
  private Double sellingGeneralAndAdministrationExpense;

  public static final String JSON_PROPERTY_SELLING_AND_MARKETING_EXPENSE = "selling_and_marketing_expense";
  @javax.annotation.Nullable
  private Double sellingAndMarketingExpense;

  public static final String JSON_PROPERTY_GENERAL_AND_ADMINISTRATIVE_EXPENSE = "general_and_administrative_expense";
  @javax.annotation.Nullable
  private Double generalAndAdministrativeExpense;

  public static final String JSON_PROPERTY_OTHER_GENERAL_AND_ADMINISTRATIVE_EXPENSE = "other_general_and_administrative_expense";
  @javax.annotation.Nullable
  private Double otherGeneralAndAdministrativeExpense;

  public static final String JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION_INCOME_STATEMENT = "depreciation_amortization_depletion_income_statement";
  @javax.annotation.Nullable
  private Double depreciationAmortizationDepletionIncomeStatement;

  public static final String JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT_EXPENSE = "research_and_development_expense";
  @javax.annotation.Nullable
  private Double researchAndDevelopmentExpense;

  public static final String JSON_PROPERTY_INSURANCE_AND_CLAIMS_EXPENSE = "insurance_and_claims_expense";
  @javax.annotation.Nullable
  private Double insuranceAndClaimsExpense;

  public static final String JSON_PROPERTY_RENT_AND_LANDING_FEES = "rent_and_landing_fees";
  @javax.annotation.Nullable
  private Double rentAndLandingFees;

  public static final String JSON_PROPERTY_SALARIES_AND_WAGES_EXPENSE = "salaries_and_wages_expense";
  @javax.annotation.Nullable
  private Double salariesAndWagesExpense;

  public static final String JSON_PROPERTY_RENT_EXPENSE_SUPPLEMENTAL = "rent_expense_supplemental";
  @javax.annotation.Nullable
  private Double rentExpenseSupplemental;

  public static final String JSON_PROPERTY_PROVISION_FOR_DOUBTFUL_ACCOUNTS = "provision_for_doubtful_accounts";
  @javax.annotation.Nullable
  private Double provisionForDoubtfulAccounts;

  public IncomeStatementItemExpenses() { 
  }

  public IncomeStatementItemExpenses totalExpenses(@javax.annotation.Nullable Double totalExpenses) {
    this.totalExpenses = totalExpenses;
    return this;
  }

  /**
   * Total expenses
   * @return totalExpenses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalExpenses() {
    return totalExpenses;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_EXPENSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalExpenses(@javax.annotation.Nullable Double totalExpenses) {
    this.totalExpenses = totalExpenses;
  }


  public IncomeStatementItemExpenses sellingGeneralAndAdministrationExpense(@javax.annotation.Nullable Double sellingGeneralAndAdministrationExpense) {
    this.sellingGeneralAndAdministrationExpense = sellingGeneralAndAdministrationExpense;
    return this;
  }

  /**
   * Selling general and administration expense
   * @return sellingGeneralAndAdministrationExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATION_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSellingGeneralAndAdministrationExpense() {
    return sellingGeneralAndAdministrationExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_SELLING_GENERAL_AND_ADMINISTRATION_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellingGeneralAndAdministrationExpense(@javax.annotation.Nullable Double sellingGeneralAndAdministrationExpense) {
    this.sellingGeneralAndAdministrationExpense = sellingGeneralAndAdministrationExpense;
  }


  public IncomeStatementItemExpenses sellingAndMarketingExpense(@javax.annotation.Nullable Double sellingAndMarketingExpense) {
    this.sellingAndMarketingExpense = sellingAndMarketingExpense;
    return this;
  }

  /**
   * Selling and marketing expense
   * @return sellingAndMarketingExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SELLING_AND_MARKETING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSellingAndMarketingExpense() {
    return sellingAndMarketingExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_SELLING_AND_MARKETING_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellingAndMarketingExpense(@javax.annotation.Nullable Double sellingAndMarketingExpense) {
    this.sellingAndMarketingExpense = sellingAndMarketingExpense;
  }


  public IncomeStatementItemExpenses generalAndAdministrativeExpense(@javax.annotation.Nullable Double generalAndAdministrativeExpense) {
    this.generalAndAdministrativeExpense = generalAndAdministrativeExpense;
    return this;
  }

  /**
   * General and administrative expense
   * @return generalAndAdministrativeExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GENERAL_AND_ADMINISTRATIVE_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGeneralAndAdministrativeExpense() {
    return generalAndAdministrativeExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_GENERAL_AND_ADMINISTRATIVE_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralAndAdministrativeExpense(@javax.annotation.Nullable Double generalAndAdministrativeExpense) {
    this.generalAndAdministrativeExpense = generalAndAdministrativeExpense;
  }


  public IncomeStatementItemExpenses otherGeneralAndAdministrativeExpense(@javax.annotation.Nullable Double otherGeneralAndAdministrativeExpense) {
    this.otherGeneralAndAdministrativeExpense = otherGeneralAndAdministrativeExpense;
    return this;
  }

  /**
   * Other general and administrative expense
   * @return otherGeneralAndAdministrativeExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_GENERAL_AND_ADMINISTRATIVE_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getOtherGeneralAndAdministrativeExpense() {
    return otherGeneralAndAdministrativeExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_GENERAL_AND_ADMINISTRATIVE_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherGeneralAndAdministrativeExpense(@javax.annotation.Nullable Double otherGeneralAndAdministrativeExpense) {
    this.otherGeneralAndAdministrativeExpense = otherGeneralAndAdministrativeExpense;
  }


  public IncomeStatementItemExpenses depreciationAmortizationDepletionIncomeStatement(@javax.annotation.Nullable Double depreciationAmortizationDepletionIncomeStatement) {
    this.depreciationAmortizationDepletionIncomeStatement = depreciationAmortizationDepletionIncomeStatement;
    return this;
  }

  /**
   * Depreciation amortization depletion income statement
   * @return depreciationAmortizationDepletionIncomeStatement
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDepreciationAmortizationDepletionIncomeStatement() {
    return depreciationAmortizationDepletionIncomeStatement;
  }


  @JsonProperty(value = JSON_PROPERTY_DEPRECIATION_AMORTIZATION_DEPLETION_INCOME_STATEMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepreciationAmortizationDepletionIncomeStatement(@javax.annotation.Nullable Double depreciationAmortizationDepletionIncomeStatement) {
    this.depreciationAmortizationDepletionIncomeStatement = depreciationAmortizationDepletionIncomeStatement;
  }


  public IncomeStatementItemExpenses researchAndDevelopmentExpense(@javax.annotation.Nullable Double researchAndDevelopmentExpense) {
    this.researchAndDevelopmentExpense = researchAndDevelopmentExpense;
    return this;
  }

  /**
   * Research and development expense
   * @return researchAndDevelopmentExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getResearchAndDevelopmentExpense() {
    return researchAndDevelopmentExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_RESEARCH_AND_DEVELOPMENT_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResearchAndDevelopmentExpense(@javax.annotation.Nullable Double researchAndDevelopmentExpense) {
    this.researchAndDevelopmentExpense = researchAndDevelopmentExpense;
  }


  public IncomeStatementItemExpenses insuranceAndClaimsExpense(@javax.annotation.Nullable Double insuranceAndClaimsExpense) {
    this.insuranceAndClaimsExpense = insuranceAndClaimsExpense;
    return this;
  }

  /**
   * Insurance and claims expense
   * @return insuranceAndClaimsExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INSURANCE_AND_CLAIMS_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInsuranceAndClaimsExpense() {
    return insuranceAndClaimsExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_INSURANCE_AND_CLAIMS_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsuranceAndClaimsExpense(@javax.annotation.Nullable Double insuranceAndClaimsExpense) {
    this.insuranceAndClaimsExpense = insuranceAndClaimsExpense;
  }


  public IncomeStatementItemExpenses rentAndLandingFees(@javax.annotation.Nullable Double rentAndLandingFees) {
    this.rentAndLandingFees = rentAndLandingFees;
    return this;
  }

  /**
   * Rent and landing fees
   * @return rentAndLandingFees
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RENT_AND_LANDING_FEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRentAndLandingFees() {
    return rentAndLandingFees;
  }


  @JsonProperty(value = JSON_PROPERTY_RENT_AND_LANDING_FEES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRentAndLandingFees(@javax.annotation.Nullable Double rentAndLandingFees) {
    this.rentAndLandingFees = rentAndLandingFees;
  }


  public IncomeStatementItemExpenses salariesAndWagesExpense(@javax.annotation.Nullable Double salariesAndWagesExpense) {
    this.salariesAndWagesExpense = salariesAndWagesExpense;
    return this;
  }

  /**
   * Salaries and wages expense
   * @return salariesAndWagesExpense
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SALARIES_AND_WAGES_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSalariesAndWagesExpense() {
    return salariesAndWagesExpense;
  }


  @JsonProperty(value = JSON_PROPERTY_SALARIES_AND_WAGES_EXPENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalariesAndWagesExpense(@javax.annotation.Nullable Double salariesAndWagesExpense) {
    this.salariesAndWagesExpense = salariesAndWagesExpense;
  }


  public IncomeStatementItemExpenses rentExpenseSupplemental(@javax.annotation.Nullable Double rentExpenseSupplemental) {
    this.rentExpenseSupplemental = rentExpenseSupplemental;
    return this;
  }

  /**
   * Rent expense supplemental
   * @return rentExpenseSupplemental
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RENT_EXPENSE_SUPPLEMENTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRentExpenseSupplemental() {
    return rentExpenseSupplemental;
  }


  @JsonProperty(value = JSON_PROPERTY_RENT_EXPENSE_SUPPLEMENTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRentExpenseSupplemental(@javax.annotation.Nullable Double rentExpenseSupplemental) {
    this.rentExpenseSupplemental = rentExpenseSupplemental;
  }


  public IncomeStatementItemExpenses provisionForDoubtfulAccounts(@javax.annotation.Nullable Double provisionForDoubtfulAccounts) {
    this.provisionForDoubtfulAccounts = provisionForDoubtfulAccounts;
    return this;
  }

  /**
   * Provision for doubtful accounts
   * @return provisionForDoubtfulAccounts
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_FOR_DOUBTFUL_ACCOUNTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProvisionForDoubtfulAccounts() {
    return provisionForDoubtfulAccounts;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_FOR_DOUBTFUL_ACCOUNTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionForDoubtfulAccounts(@javax.annotation.Nullable Double provisionForDoubtfulAccounts) {
    this.provisionForDoubtfulAccounts = provisionForDoubtfulAccounts;
  }


  /**
   * Return true if this IncomeStatementItem_expenses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeStatementItemExpenses incomeStatementItemExpenses = (IncomeStatementItemExpenses) o;
    return Objects.equals(this.totalExpenses, incomeStatementItemExpenses.totalExpenses) &&
        Objects.equals(this.sellingGeneralAndAdministrationExpense, incomeStatementItemExpenses.sellingGeneralAndAdministrationExpense) &&
        Objects.equals(this.sellingAndMarketingExpense, incomeStatementItemExpenses.sellingAndMarketingExpense) &&
        Objects.equals(this.generalAndAdministrativeExpense, incomeStatementItemExpenses.generalAndAdministrativeExpense) &&
        Objects.equals(this.otherGeneralAndAdministrativeExpense, incomeStatementItemExpenses.otherGeneralAndAdministrativeExpense) &&
        Objects.equals(this.depreciationAmortizationDepletionIncomeStatement, incomeStatementItemExpenses.depreciationAmortizationDepletionIncomeStatement) &&
        Objects.equals(this.researchAndDevelopmentExpense, incomeStatementItemExpenses.researchAndDevelopmentExpense) &&
        Objects.equals(this.insuranceAndClaimsExpense, incomeStatementItemExpenses.insuranceAndClaimsExpense) &&
        Objects.equals(this.rentAndLandingFees, incomeStatementItemExpenses.rentAndLandingFees) &&
        Objects.equals(this.salariesAndWagesExpense, incomeStatementItemExpenses.salariesAndWagesExpense) &&
        Objects.equals(this.rentExpenseSupplemental, incomeStatementItemExpenses.rentExpenseSupplemental) &&
        Objects.equals(this.provisionForDoubtfulAccounts, incomeStatementItemExpenses.provisionForDoubtfulAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalExpenses, sellingGeneralAndAdministrationExpense, sellingAndMarketingExpense, generalAndAdministrativeExpense, otherGeneralAndAdministrativeExpense, depreciationAmortizationDepletionIncomeStatement, researchAndDevelopmentExpense, insuranceAndClaimsExpense, rentAndLandingFees, salariesAndWagesExpense, rentExpenseSupplemental, provisionForDoubtfulAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStatementItemExpenses {\n");
    sb.append("    totalExpenses: ").append(toIndentedString(totalExpenses)).append("\n");
    sb.append("    sellingGeneralAndAdministrationExpense: ").append(toIndentedString(sellingGeneralAndAdministrationExpense)).append("\n");
    sb.append("    sellingAndMarketingExpense: ").append(toIndentedString(sellingAndMarketingExpense)).append("\n");
    sb.append("    generalAndAdministrativeExpense: ").append(toIndentedString(generalAndAdministrativeExpense)).append("\n");
    sb.append("    otherGeneralAndAdministrativeExpense: ").append(toIndentedString(otherGeneralAndAdministrativeExpense)).append("\n");
    sb.append("    depreciationAmortizationDepletionIncomeStatement: ").append(toIndentedString(depreciationAmortizationDepletionIncomeStatement)).append("\n");
    sb.append("    researchAndDevelopmentExpense: ").append(toIndentedString(researchAndDevelopmentExpense)).append("\n");
    sb.append("    insuranceAndClaimsExpense: ").append(toIndentedString(insuranceAndClaimsExpense)).append("\n");
    sb.append("    rentAndLandingFees: ").append(toIndentedString(rentAndLandingFees)).append("\n");
    sb.append("    salariesAndWagesExpense: ").append(toIndentedString(salariesAndWagesExpense)).append("\n");
    sb.append("    rentExpenseSupplemental: ").append(toIndentedString(rentExpenseSupplemental)).append("\n");
    sb.append("    provisionForDoubtfulAccounts: ").append(toIndentedString(provisionForDoubtfulAccounts)).append("\n");
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

    // add `total_expenses` to the URL query string
    if (getTotalExpenses() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal_expenses%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalExpenses()))));
    }

    // add `selling_general_and_administration_expense` to the URL query string
    if (getSellingGeneralAndAdministrationExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sselling_general_and_administration_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSellingGeneralAndAdministrationExpense()))));
    }

    // add `selling_and_marketing_expense` to the URL query string
    if (getSellingAndMarketingExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sselling_and_marketing_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSellingAndMarketingExpense()))));
    }

    // add `general_and_administrative_expense` to the URL query string
    if (getGeneralAndAdministrativeExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgeneral_and_administrative_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGeneralAndAdministrativeExpense()))));
    }

    // add `other_general_and_administrative_expense` to the URL query string
    if (getOtherGeneralAndAdministrativeExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sother_general_and_administrative_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtherGeneralAndAdministrativeExpense()))));
    }

    // add `depreciation_amortization_depletion_income_statement` to the URL query string
    if (getDepreciationAmortizationDepletionIncomeStatement() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdepreciation_amortization_depletion_income_statement%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDepreciationAmortizationDepletionIncomeStatement()))));
    }

    // add `research_and_development_expense` to the URL query string
    if (getResearchAndDevelopmentExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresearch_and_development_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResearchAndDevelopmentExpense()))));
    }

    // add `insurance_and_claims_expense` to the URL query string
    if (getInsuranceAndClaimsExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinsurance_and_claims_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInsuranceAndClaimsExpense()))));
    }

    // add `rent_and_landing_fees` to the URL query string
    if (getRentAndLandingFees() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srent_and_landing_fees%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRentAndLandingFees()))));
    }

    // add `salaries_and_wages_expense` to the URL query string
    if (getSalariesAndWagesExpense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssalaries_and_wages_expense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSalariesAndWagesExpense()))));
    }

    // add `rent_expense_supplemental` to the URL query string
    if (getRentExpenseSupplemental() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srent_expense_supplemental%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRentExpenseSupplemental()))));
    }

    // add `provision_for_doubtful_accounts` to the URL query string
    if (getProvisionForDoubtfulAccounts() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovision_for_doubtful_accounts%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionForDoubtfulAccounts()))));
    }

    return joiner.toString();
  }
}

