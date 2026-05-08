package com.twelvedata.integration;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AdvancedApi.*;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.AnalysisApi.*;
import com.twelvedata.client.api.CurrenciesApi;
import com.twelvedata.client.api.CurrenciesApi.*;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.EtfsApi.*;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.FundamentalsApi.*;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MarketDataApi.*;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.MutualFundsApi.*;
import com.twelvedata.client.api.ReferenceDataApi;
import com.twelvedata.client.api.ReferenceDataApi.*;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.RegulatoryApi.*;
import com.twelvedata.client.api.TechnicalIndicatorApi;
import com.twelvedata.client.api.TechnicalIndicatorApi.*;
import com.twelvedata.client.model.EndpointEnum;
import com.twelvedata.client.model.IntervalEnum;
import com.twelvedata.client.model.MarketEnum;
import com.twelvedata.client.model.SourceEnum;

public final class Endpoints {

  private static final String SYMBOL_STOCK = "AAPL";
  private static final String SYMBOL_ETF = "SPY";
  private static final String SYMBOL_FOREX = "EUR/USD";
  private static final String SYMBOL_CRYPTO = "BTC/USD";
  private static final String SYMBOL_MUTUAL_FUND = "VFINX";
  private static final IntervalEnum INTERVAL = IntervalEnum._1DAY;
  private static final String TIMEZONE = "UTC";
  private static final long OUTPUTSIZE = 10L;
  private static final double CURRENCY_AMOUNT = 100;
  private static final String START_DATE = "2025-01-01";
  private static final String END_DATE = "2025-01-31";
  private static final String FOREX_BASE = "EUR";
  private static final String FOREX_QUOTE = "USD";
  private static final String COUNTRY = "United States";
  private static final String MIC_CODE = "XNYS";
  private static final EndpointEnum LAST_CHANGES_ENDPOINT = EndpointEnum.PROFILE;
  private static final SourceEnum SANCTIONS_SOURCE = SourceEnum.OFAC;
  private static final long DELAY_MS = 200L;

  private static int passed = 0;
  private static int failed = 0;

  @FunctionalInterface
  private interface ThrowingRunnable {
    void run() throws Exception;
  }

  private static void assertTrue(boolean condition, String message) {
    if (!condition) {
      throw new AssertionError(message);
    }
  }

  private static void runTest(String name, ThrowingRunnable test) {
    try {
      test.run();
      System.out.println("✓ " + name);
      passed++;
    } catch (Throwable e) {
      String msg = e.getClass().getSimpleName();
      if (e.getMessage() != null) {
        msg += ": " + e.getMessage();
      }
      System.out.println("✗ " + name + ": " + msg);
      failed++;
    }
    try {
      Thread.sleep(DELAY_MS);
    } catch (InterruptedException ignored) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) {
    System.out.println("Running Twelvedata API tests...\n");

    ApiClient client = Twelvedata.newApiClient();

    final MarketDataApi marketDataApi = new MarketDataApi(client);
    final CurrenciesApi currenciesApi = new CurrenciesApi(client);
    final FundamentalsApi fundamentalsApi = new FundamentalsApi(client);
    final AnalysisApi analysisApi = new AnalysisApi(client);
    final EtfsApi etfsApi = new EtfsApi(client);
    final MutualFundsApi mutualFundsApi = new MutualFundsApi(client);
    final ReferenceDataApi referenceDataApi = new ReferenceDataApi(client);
    final RegulatoryApi regulatoryApi = new RegulatoryApi(client);
    final TechnicalIndicatorApi technicalIndicatorApi = new TechnicalIndicatorApi(client);
    final AdvancedApi advancedApi = new AdvancedApi(client);

    // --- MarketDataApi ---

    runTest("MarketData.getTimeSeries", () -> {
      var r = marketDataApi.getTimeSeries(APIGetTimeSeriesRequest.newBuilder()
          .interval(INTERVAL).symbol(SYMBOL_STOCK).outputsize(OUTPUTSIZE).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
    });

    runTest("MarketData.getPrice", () -> {
      var r = marketDataApi.getPrice(APIGetPriceRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getPrice() != null, "expected price to be present");
    });

    runTest("MarketData.getQuote", () -> {
      var r = marketDataApi.getQuote(APIGetQuoteRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getSymbol() != null, "expected symbol to be present");
    });

    runTest("MarketData.getEod", () -> {
      var r = marketDataApi.getEod(APIGetEodRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getClose() != null, "expected close to be present");
    });

    runTest("MarketData.getMarketMovers", () -> {
      var r = marketDataApi.getMarketMovers(APIGetMarketMoversRequest.newBuilder()
          .market(MarketEnum.STOCKS).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
    });

    runTest("MarketData.getTimeSeriesCross", () -> {
      var r = marketDataApi.getTimeSeriesCross(APIGetTimeSeriesCrossRequest.newBuilder()
          .base(FOREX_BASE).quote(FOREX_QUOTE).interval(INTERVAL).outputsize(OUTPUTSIZE).build());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
    });

    // --- CurrenciesApi ---

    runTest("Currencies.getExchangeRate", () -> {
      var r = currenciesApi.getExchangeRate(APIGetExchangeRateRequest.newBuilder()
          .symbol(SYMBOL_FOREX).build());
      assertTrue(r.getRate() != null, "expected rate to be present");
    });

    runTest("Currencies.getCurrencyConversion", () -> {
      var r = currenciesApi.getCurrencyConversion(APIGetCurrencyConversionRequest.newBuilder()
          .symbol(SYMBOL_FOREX).amount(CURRENCY_AMOUNT).build());
      assertTrue(r.getRate() != null, "expected rate to be present");
    });

    // --- FundamentalsApi ---

    runTest("Fundamentals.getIpoCalendar", () -> {
      var r = fundamentalsApi.getIpoCalendar(APIGetIpoCalendarRequest.newBuilder()
          .startDate(START_DATE).endDate(END_DATE).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Fundamentals.getEarningsCalendar", () -> {
      var r = fundamentalsApi.getEarningsCalendar(APIGetEarningsCalendarRequest.newBuilder().build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarnings() != null, "expected earnings map");
    });

    runTest("Fundamentals.getDividendsCalendar", () -> {
      var r = fundamentalsApi.getDividendsCalendar(APIGetDividendsCalendarRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Fundamentals.getSplitsCalendar", () -> {
      var r = fundamentalsApi.getSplitsCalendar(APIGetSplitsCalendarRequest.newBuilder()
          .startDate(START_DATE).endDate(END_DATE).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Fundamentals.getEarnings", () -> {
      var r = fundamentalsApi.getEarnings(APIGetEarningsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarnings() != null, "expected earnings to be present");
    });

    runTest("Fundamentals.getDividends", () -> {
      var r = fundamentalsApi.getDividends(APIGetDividendsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getDividends() != null, "expected dividends to be present");
    });

    runTest("Fundamentals.getSplits", () -> {
      var r = fundamentalsApi.getSplits(APIGetSplitsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getSplits() != null, "expected splits to be present");
    });

    runTest("Fundamentals.getBalanceSheet", () -> {
      var r = fundamentalsApi.getBalanceSheet(APIGetBalanceSheetRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getBalanceSheet() != null, "expected balanceSheet to be present");
    });

    runTest("Fundamentals.getCashFlow", () -> {
      var r = fundamentalsApi.getCashFlow(APIGetCashFlowRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getCashFlow() != null, "expected cashFlow to be present");
    });

    runTest("Fundamentals.getIncomeStatement", () -> {
      var r = fundamentalsApi.getIncomeStatement(APIGetIncomeStatementRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getIncomeStatement() != null, "expected incomeStatement to be present");
    });

    runTest("Fundamentals.getProfile", () -> {
      var r = fundamentalsApi.getProfile(APIGetProfileRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getSymbol() != null, "expected symbol to be present");
    });

    runTest("Fundamentals.getStatistics", () -> {
      var r = fundamentalsApi.getStatistics(APIGetStatisticsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getStatistics() != null, "expected statistics to be present");
    });

    runTest("Fundamentals.getMarketCap", () -> {
      var r = fundamentalsApi.getMarketCap(APIGetMarketCapRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getMarketCap() != null, "expected marketCap to be present");
    });

    runTest("Fundamentals.getKeyExecutives", () -> {
      var r = fundamentalsApi.getKeyExecutives(APIGetKeyExecutivesRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getKeyExecutives() != null, "expected keyExecutives to be present");
    });

    runTest("Fundamentals.getLogo", () -> {
      var r = fundamentalsApi.getLogo(APIGetLogoRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getUrl() != null, "expected url to be present");
    });

    runTest("Fundamentals.pressReleasesListParameters", () -> {
      var r = fundamentalsApi.pressReleasesListParameters(APIPressReleasesListParametersRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getPressReleases() != null, "expected pressReleases to be present");
    });

    runTest("Fundamentals.getBalanceSheetConsolidated", () -> {
      var r = fundamentalsApi.getBalanceSheetConsolidated(APIGetBalanceSheetConsolidatedRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getBalanceSheet() != null && !r.getBalanceSheet().isEmpty(),
          "expected non-empty balanceSheet array");
    });

    runTest("Fundamentals.getCashFlowConsolidated", () -> {
      var r = fundamentalsApi.getCashFlowConsolidated(APIGetCashFlowConsolidatedRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getCashFlow() != null && !r.getCashFlow().isEmpty(),
          "expected non-empty cashFlow array");
    });

    runTest("Fundamentals.getIncomeStatementConsolidated", () -> {
      var r = fundamentalsApi.getIncomeStatementConsolidated(APIGetIncomeStatementConsolidatedRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getIncomeStatement() != null && !r.getIncomeStatement().isEmpty(),
          "expected non-empty incomeStatement array");
    });

    runTest("Fundamentals.getLastChanges", () -> {
      var r = fundamentalsApi.getLastChanges(APIGetLastChangesRequest.newBuilder()
          .endpoint(LAST_CHANGES_ENDPOINT).build());
      assertTrue(r.getData() != null, "expected data array");
    });

    // --- AnalysisApi ---

    runTest("Analysis.getAnalystRatingsUsEquities", () -> {
      var r = analysisApi.getAnalystRatingsUsEquities(APIGetAnalystRatingsUsEquitiesRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRatings() != null, "expected ratings to be present");
    });

    runTest("Analysis.getPriceTarget", () -> {
      var r = analysisApi.getPriceTarget(APIGetPriceTargetRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getPriceTarget() != null, "expected priceTarget to be present");
    });

    runTest("Analysis.getRecommendations", () -> {
      var r = analysisApi.getRecommendations(APIGetRecommendationsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getTrends() != null, "expected trends to be present");
    });

    runTest("Analysis.getEarningsEstimate", () -> {
      var r = analysisApi.getEarningsEstimate(APIGetEarningsEstimateRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarningsEstimate() != null, "expected earningsEstimate to be present");
    });

    runTest("Analysis.getEpsRevisions", () -> {
      var r = analysisApi.getEpsRevisions(APIGetEpsRevisionsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEpsRevision() != null, "expected epsRevision to be present");
    });

    runTest("Analysis.getEpsTrend", () -> {
      var r = analysisApi.getEpsTrend(APIGetEpsTrendRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEpsTrend() != null, "expected epsTrend to be present");
    });

    runTest("Analysis.getGrowthEstimates", () -> {
      var r = analysisApi.getGrowthEstimates(APIGetGrowthEstimatesRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getGrowthEstimates() != null, "expected growthEstimates to be present");
    });

    runTest("Analysis.getRevenueEstimate", () -> {
      var r = analysisApi.getRevenueEstimate(APIGetRevenueEstimateRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRevenueEstimate() != null, "expected revenueEstimate to be present");
    });

    runTest("Analysis.getAnalystRatingsLight", () -> {
      var r = analysisApi.getAnalystRatingsLight(APIGetAnalystRatingsLightRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRatings() != null, "expected ratings to be present");
    });

    // --- EtfsApi ---

    runTest("Etfs.getETFsList", () -> {
      var r = etfsApi.getETFsList(APIGetETFsListRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
    });

    runTest("Etfs.getETFsWorld", () -> {
      var r = etfsApi.getETFsWorld(APIGetETFsWorldRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
    });

    runTest("Etfs.getETFsWorldSummary", () -> {
      var r = etfsApi.getETFsWorldSummary(APIGetETFsWorldSummaryRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
    });

    runTest("Etfs.getETFsWorldComposition", () -> {
      var r = etfsApi.getETFsWorldComposition(APIGetETFsWorldCompositionRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
    });

    runTest("Etfs.getETFsWorldPerformance", () -> {
      var r = etfsApi.getETFsWorldPerformance(APIGetETFsWorldPerformanceRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
    });

    runTest("Etfs.getETFsWorldRisk", () -> {
      var r = etfsApi.getETFsWorldRisk(APIGetETFsWorldRiskRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
    });

    runTest("Etfs.getETFsFamily", () -> {
      var r = etfsApi.getETFsFamily(APIGetETFsFamilyRequest.newBuilder()
          .country(COUNTRY).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
    });

    runTest("Etfs.getETFsType", () -> {
      var r = etfsApi.getETFsType(APIGetETFsTypeRequest.newBuilder()
          .country(COUNTRY).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
    });

    // --- MutualFundsApi ---

    runTest("MutualFunds.getMutualFundsWorld", () -> {
      var r = mutualFundsApi.getMutualFundsWorld(APIGetMutualFundsWorldRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldSummary", () -> {
      var r = mutualFundsApi.getMutualFundsWorldSummary(APIGetMutualFundsWorldSummaryRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldComposition", () -> {
      var r = mutualFundsApi.getMutualFundsWorldComposition(APIGetMutualFundsWorldCompositionRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldPerformance", () -> {
      var r = mutualFundsApi.getMutualFundsWorldPerformance(APIGetMutualFundsWorldPerformanceRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldRisk", () -> {
      var r = mutualFundsApi.getMutualFundsWorldRisk(APIGetMutualFundsWorldRiskRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldRatings", () -> {
      var r = mutualFundsApi.getMutualFundsWorldRatings(APIGetMutualFundsWorldRatingsRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldPurchaseInfo", () -> {
      var r = mutualFundsApi.getMutualFundsWorldPurchaseInfo(APIGetMutualFundsWorldPurchaseInfoRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsWorldSustainability", () -> {
      var r = mutualFundsApi.getMutualFundsWorldSustainability(APIGetMutualFundsWorldSustainabilityRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
    });

    runTest("MutualFunds.getMutualFundsFamily", () -> {
      var r = mutualFundsApi.getMutualFundsFamily(APIGetMutualFundsFamilyRequest.newBuilder()
          .country(COUNTRY).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
    });

    runTest("MutualFunds.getMutualFundsList", () -> {
      var r = mutualFundsApi.getMutualFundsList(APIGetMutualFundsListRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
    });

    runTest("MutualFunds.getMutualFundsType", () -> {
      var r = mutualFundsApi.getMutualFundsType(APIGetMutualFundsTypeRequest.newBuilder()
          .country(COUNTRY).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
    });

    // --- ReferenceDataApi ---

    runTest("ReferenceData.getStocks", () -> {
      var r = referenceDataApi.getStocks(APIGetStocksRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getCryptocurrencies", () -> {
      var r = referenceDataApi.getCryptocurrencies(APIGetCryptocurrenciesRequest.newBuilder()
          .symbol(SYMBOL_CRYPTO).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getForexPairs", () -> {
      var r = referenceDataApi.getForexPairs(APIGetForexPairsRequest.newBuilder()
          .symbol(SYMBOL_FOREX).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getExchanges", () -> {
      var r = referenceDataApi.getExchanges(APIGetExchangesRequest.newBuilder().build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getMarketState", () -> {
      var r = referenceDataApi.getMarketState(APIGetMarketStateRequest.newBuilder().build());
      assertTrue(r != null && !r.isEmpty(), "expected non-empty market state array");
    });

    runTest("ReferenceData.getEarliestTimestamp", () -> {
      var r = referenceDataApi.getEarliestTimestamp(APIGetEarliestTimestampRequest.newBuilder()
          .interval(INTERVAL).symbol(SYMBOL_STOCK).build());
      assertTrue(r.getDatetime() != null, "expected datetime to be present");
    });

    runTest("ReferenceData.getSymbolSearch", () -> {
      var r = referenceDataApi.getSymbolSearch(APIGetSymbolSearchRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null, "expected data to be present");
    });

    runTest("ReferenceData.getCrossListings", () -> {
      var r = referenceDataApi.getCrossListings(APIGetCrossListingsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getResult() != null, "expected result to be present");
    });

    runTest("ReferenceData.getBonds", () -> {
      var r = referenceDataApi.getBonds(APIGetBondsRequest.newBuilder().build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
    });

    runTest("ReferenceData.getCommodities", () -> {
      var r = referenceDataApi.getCommodities(APIGetCommoditiesRequest.newBuilder().build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getCryptocurrencyExchanges", () -> {
      var r = referenceDataApi.getCryptocurrencyExchanges(APIGetCryptocurrencyExchangesRequest.newBuilder().build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getEtf", () -> {
      var r = referenceDataApi.getEtf(APIGetEtfRequest.newBuilder()
          .symbol(SYMBOL_ETF).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getExchangeSchedule", () -> {
      var r = referenceDataApi.getExchangeSchedule(APIGetExchangeScheduleRequest.newBuilder()
          .micCode(MIC_CODE).build());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getFunds", () -> {
      var r = referenceDataApi.getFunds(APIGetFundsRequest.newBuilder()
          .symbol(SYMBOL_MUTUAL_FUND).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
    });

    runTest("ReferenceData.getCountries", () -> {
      var r = referenceDataApi.getCountries();
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getInstrumentType", () -> {
      var r = referenceDataApi.getInstrumentType();
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(), "expected non-empty result array");
    });

    runTest("ReferenceData.getIntervals", () -> {
      var r = referenceDataApi.getIntervals();
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
    });

    runTest("ReferenceData.getTechnicalIndicators", () -> {
      var r = referenceDataApi.getTechnicalIndicators();
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data map");
    });

    // --- RegulatoryApi ---

    runTest("Regulatory.getDirectHolders", () -> {
      var r = regulatoryApi.getDirectHolders(APIGetDirectHoldersRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Regulatory.getFundHolders", () -> {
      var r = regulatoryApi.getFundHolders(APIGetFundHoldersRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Regulatory.getInstitutionalHolders", () -> {
      var r = regulatoryApi.getInstitutionalHolders(APIGetInstitutionalHoldersRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Regulatory.getInsiderTransactions", () -> {
      var r = regulatoryApi.getInsiderTransactions(APIGetInsiderTransactionsRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r != null, "expected response data");
    });

    runTest("Regulatory.getTaxInfo", () -> {
      var r = regulatoryApi.getTaxInfo(APIGetTaxInfoRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null, "expected data to be present");
    });

    runTest("Regulatory.getSourceSanctionedEntities", () -> {
      var r = regulatoryApi.getSourceSanctionedEntities(APIGetSourceSanctionedEntitiesRequest.newBuilder()
          .source(SANCTIONS_SOURCE).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getSanctions() != null, "expected sanctions to be present");
    });

    runTest("Regulatory.getEdgarFilingsArchive", () -> {
      var r = regulatoryApi.getEdgarFilingsArchive(APIGetEdgarFilingsArchiveRequest.newBuilder()
          .symbol(SYMBOL_STOCK).build());
      assertTrue(r.getMeta() != null, "expected meta to be present");
      assertTrue(r.getValues() != null, "expected values array");
    });

    // --- TechnicalIndicatorApi (2 only) ---

    runTest("TechnicalIndicator.getTimeSeriesRsi", () -> {
      var r = technicalIndicatorApi.getTimeSeriesRsi(APIGetTimeSeriesRsiRequest.newBuilder()
          .interval(INTERVAL).symbol(SYMBOL_STOCK).outputsize(OUTPUTSIZE).timezone(TIMEZONE).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
    });

    runTest("TechnicalIndicator.getTimeSeriesMacd", () -> {
      var r = technicalIndicatorApi.getTimeSeriesMacd(APIGetTimeSeriesMacdRequest.newBuilder()
          .interval(INTERVAL).symbol(SYMBOL_STOCK).outputsize(OUTPUTSIZE).timezone(TIMEZONE).build());
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
    });

    // --- AdvancedApi ---

    runTest("Advanced.getApiUsage", () -> {
      var r = advancedApi.getApiUsage(APIGetApiUsageRequest.newBuilder().build());
      assertTrue(r != null, "expected response data");
    });

    int total = passed + failed;
    System.out.println();
    System.out.println("Passed: " + passed + " / " + total);
    if (failed > 0) {
      System.exit(1);
    }
  }

  private Endpoints() {}
}
