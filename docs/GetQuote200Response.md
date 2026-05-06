

# GetQuote200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol passed |  |
|**name** | **String** | Name of the instrument |  |
|**exchange** | **String** | Exchange where instrument is traded |  |
|**micCode** | **String** | Market identifier code (MIC) under ISO 10383 standard. Available for stocks, ETFs, mutual funds, bonds |  [optional] |
|**currency** | **String** | Currency in which the equity is denominated. Available for stocks, ETFs, mutual funds, bonds |  [optional] |
|**datetime** | **String** | Datetime in defined timezone referring to when the bar with specified interval was opened |  |
|**timestamp** | **Long** | Unix timestamp representing the opening candle of the specified interval |  |
|**lastQuoteAt** | **Long** | Unix timestamp of last minute candle |  [optional] |
|**open** | **String** | Price at the opening of current bar |  |
|**high** | **String** | Highest price which occurred during the current bar |  |
|**low** | **String** | Lowest price which occurred during the current bar |  |
|**close** | **String** | Close price at the end of the bar |  |
|**volume** | **String** | Trading volume during the bar. Available not for all instrument types |  [optional] |
|**previousClose** | **String** | Close price at the end of the previous bar |  |
|**change** | **String** | Close - previous_close |  |
|**percentChange** | **String** | (Close - previous_close) / previous_close * 100 |  |
|**averageVolume** | **String** | Average volume of the specified period. Available not for all instrument types |  [optional] |
|**rolling1dChange** | **String** | Percent change in price between the current and the backward one, where period is 1 day. Available for crypto |  [optional] |
|**rolling7dChange** | **String** | Percent change in price between the current and the backward one, where period is 7 days. Available for crypto |  [optional] |
|**rollingChange** | **String** | Percent change in price between the current and the backward one, where period specified in request param rolling_period. Available for crypto |  [optional] |
|**isMarketOpen** | **Boolean** | True if market is open; false if closed |  |
|**fiftyTwoWeek** | [**GetQuote200ResponseFiftyTwoWeek**](GetQuote200ResponseFiftyTwoWeek.md) |  |  |
|**extendedChange** | **String** | Diff between the regular close price and the latest extended price. Displayed only if prepost is true |  [optional] |
|**extendedPercentChange** | **String** | Percent change in price between the regular close price and the latest extended price. Displayed only if prepost is true |  [optional] |
|**extendedPrice** | **String** | Latest extended price. Displayed only if prepost is true |  [optional] |
|**extendedTimestamp** | **Long** | Unix timestamp of the last extended price. Displayed only if prepost is true |  [optional] |



