package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.TechnicalIndicatorApi;
import com.twelvedata.client.api.TechnicalIndicatorApi.APIGetTimeSeriesEmaRequest;
import com.twelvedata.client.model.IntervalEnum;

public final class TiEma {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    TechnicalIndicatorApi api = new TechnicalIndicatorApi(client);

    var response = api.getTimeSeriesEma(
        APIGetTimeSeriesEmaRequest.newBuilder()
            .interval(IntervalEnum._1DAY)
            .symbol("AAPL")
            .outputsize(10L)
            .build());
    System.out.println(response);
  }

  private TiEma() {}
}
