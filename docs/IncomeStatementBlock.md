

# IncomeStatementBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fiscalDate** | **String** | Date of fiscal period ending |  |
|**quarter** | **Long** | Fiscal quarter. Visible when &#x60;&amp;period&#x3D;quarterly&#x60; |  [optional] |
|**year** | **Long** | Fiscal year |  [optional] |
|**sales** | **Long** | Refers to total reported revenue |  [optional] |
|**costOfGoods** | **Long** | Refers to cost of revenue |  [optional] |
|**grossProfit** | **Long** | Refers to net gross profit: &#x60;sales&#x60; - &#x60;cost_of_goods&#x60; |  [optional] |
|**operatingExpense** | [**IncomeStatementBlockOperatingExpense**](IncomeStatementBlockOperatingExpense.md) |  |  [optional] |
|**operatingIncome** | **Long** | Refers to net operating income: &#x60;gross_profit&#x60; - &#x60;research_and_development&#x60; - &#x60;selling_general_and_administrative&#x60; |  [optional] |
|**nonOperatingInterest** | [**IncomeStatementBlockNonOperatingInterest**](IncomeStatementBlockNonOperatingInterest.md) |  |  [optional] |
|**otherIncomeExpense** | **Long** | Refers to other incomes or expenses |  [optional] |
|**pretaxIncome** | **Long** | Refers to earnings before tax: &#x60;operating_income&#x60; + &#x60;net_non_operating_interest&#x60; - &#x60;other_income_expense&#x60; |  [optional] |
|**incomeTax** | **Long** | Refers to a tax provision |  [optional] |
|**netIncome** | **Long** | Refers to net income: &#x60;pretax_income&#x60; - &#x60;income_tax&#x60; |  [optional] |
|**epsBasic** | **Double** | Refers to earnings per share (EPS) |  [optional] |
|**epsDiluted** | **Double** | Refers to diluted earnings per share (EPS) |  [optional] |
|**basicSharesOutstanding** | **Long** | Refers for the shares outstanding held by all its shareholders |  [optional] |
|**dilutedSharesOutstanding** | **Long** | Refers to the total number of shares a company would have if all dilutive securities were exercised and converted into shares |  [optional] |
|**ebit** | **Long** | Refers to earnings before interest and taxes (EBIT) measure |  [optional] |
|**ebitda** | **Long** | Refers to EBITDA (earnings before interest, taxes, depreciation, and amortization) measure |  [optional] |
|**netIncomeContinuousOperations** | **Long** | Refers to the after-tax earnings that a business has generated from its operational activities |  [optional] |
|**minorityInterests** | **Long** | Refers to amount of minority interests paid out |  [optional] |
|**preferredStockDividends** | **Long** | Refers to dividend that is allocated to and paid on a company&#39;s preferred shares |  [optional] |



