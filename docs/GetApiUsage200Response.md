

# GetApiUsage200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **String** | Current timestamp in UTC timezone |  |
|**currentUsage** | **Long** | Number of requests made in last minute |  |
|**planLimit** | **Long** | Your personal API limit (requests/minute) depending on the plan |  |
|**dailyUsage** | **Long** | Number of requests made in the current day. Returned only when the plan has a daily limit. |  [optional] |
|**planDailyLimit** | **Long** | Your personal API limit (requests/day) depending on the plan. Returned only when the plan has a daily limit. |  [optional] |
|**planCategory** | **String** | Plan category name |  [optional] |



