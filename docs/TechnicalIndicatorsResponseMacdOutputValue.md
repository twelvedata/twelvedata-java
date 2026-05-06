

# TechnicalIndicatorsResponseMacdOutputValue

Output parameter name. Example values: <code>ad</code>, <code>add</code>, <code>adxr</code>, <code>aroonosc</code>,  <code>macd</code>, <code>macd_signal</code>, <code>macd_hist</code>, etc

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultColor** | **String** | Suggested color for displaying returns hex color code |  [optional] |
|**display** | [**DisplayEnum**](#DisplayEnum) | How output value should be rendered |  [optional] |
|**minRange** | **Long** | If output value has minimum bound |  [optional] |
|**maxRange** | **Long** | If output value has maximum bound |  [optional] |



## Enum: DisplayEnum

| Name | Value |
|---- | -----|
| LINE | &quot;line&quot; |
| HISTOGRAM | &quot;histogram&quot; |
| CANDLE | &quot;candle&quot; |
| POINTS | &quot;points&quot; |



