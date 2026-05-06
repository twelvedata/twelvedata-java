

# MarketStateResponseItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The full name of exchange |  |
|**code** | **String** | Market identifier code (MIC) under ISO 10383 standard |  |
|**country** | **String** | Country where the exchange is located |  |
|**isMarketOpen** | **Boolean** | Indicates if the market is currently open |  |
|**timeAfterOpen** | **String** | Time after market opening in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently closed - returns &lt;code&gt;00:00:00&lt;/code&gt; |  |
|**timeToOpen** | **String** | Time to market opening in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently open - returns &lt;code&gt;00:00:00&lt;/code&gt; |  |
|**timeToClose** | **String** | Time to market closing in &lt;code&gt;HH:MM:SS&lt;/code&gt; format; if currently closed - returns &lt;code&gt;00:00:00&lt;/code&gt; |  |



