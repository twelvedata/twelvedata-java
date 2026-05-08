package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.TechnicalIndicatorApi;
import com.twelvedata.client.api.TechnicalIndicatorApi.APIGetTimeSeriesBBandsRequest;
import com.twelvedata.client.model.IntervalEnum;

public final class TiBbands {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    TechnicalIndicatorApi api = new TechnicalIndicatorApi(client);

    var response = api.getTimeSeriesBBands(
        APIGetTimeSeriesBBandsRequest.newBuilder()
            .interval(IntervalEnum._1DAY)
            .symbol("AAPL")
            .outputsize(10L)
            .build());
    System.out.println(response);
  }

  private TiBbands() {}
}
