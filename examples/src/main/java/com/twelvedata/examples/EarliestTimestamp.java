package com.twelvedata.examples;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.ReferenceDataApi;
import com.twelvedata.client.model.IntervalEnum;

public final class EarliestTimestamp {
  public static void main(String[] args) throws Exception {
    ApiClient client = Twelvedata.newApiClient();
    ReferenceDataApi api = new ReferenceDataApi(client);

    var response = api.getEarliestTimestamp(
        IntervalEnum._1DAY, "AAPL", null, null, null, null, null, null);
    System.out.println(response);
  }

  private EarliestTimestamp() {}
}
