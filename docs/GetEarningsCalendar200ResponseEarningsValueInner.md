

# GetEarningsCalendar200ResponseEarningsValueInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Instrument symbol (ticker) |  [optional] |
|**name** | **String** | Full name of instrument |  [optional] |
|**currency** | **String** | Currency in which instrument is traded by ISO 4217 standard |  [optional] |
|**exchange** | **String** | Exchange where instrument is traded |  [optional] |
|**micCode** | **String** | Market identifier code (MIC) under ISO 10383 standard |  [optional] |
|**country** | **String** | Country where exchange is located |  [optional] |
|**time** | **String** | Can be either of the following values: &#x60;Pre Market&#x60;, &#x60;After Hours&#x60;, &#x60;Time Not Supplied&#x60; |  [optional] |
|**epsEstimate** | **Double** | Analyst estimate of the future company earning |  [optional] |
|**epsActual** | **Double** | Actual value of reported earning |  [optional] |
|**difference** | **Double** | Delta between &#x60;eps_actual&#x60; and &#x60;eps_estimate&#x60; |  [optional] |
|**surprisePrc** | **Double** | Surprise in percentage of the &#x60;eps_actual&#x60; related to &#x60;eps_estimate&#x60; |  [optional] |



