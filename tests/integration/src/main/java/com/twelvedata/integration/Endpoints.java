package com.twelvedata.integration;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.AdvancedApi;
import com.twelvedata.client.api.AnalysisApi;
import com.twelvedata.client.api.CurrenciesApi;
import com.twelvedata.client.api.EtfsApi;
import com.twelvedata.client.api.FundamentalsApi;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.api.MutualFundsApi;
import com.twelvedata.client.api.ReferenceDataApi;
import com.twelvedata.client.api.RegulatoryApi;
import com.twelvedata.client.api.TechnicalIndicatorApi;
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
      var r = marketDataApi.getTimeSeries(
          INTERVAL, SYMBOL_STOCK, null, null, null, OUTPUTSIZE,
          null, null, null, null, null, null, null, null, null, null,
          null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
      // System.out.println(r.getValues().get(0));
    });

    runTest("MarketData.getPrice", () -> {
      var r = marketDataApi.getPrice(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getPrice() != null, "expected price to be present");
      // System.out.println(r);
    });

    runTest("MarketData.getQuote", () -> {
      var r = marketDataApi.getQuote(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null,
          null, null, null, null, null, null, null);
      assertTrue(r.getSymbol() != null, "expected symbol to be present");
      // System.out.println(r);
    });

    runTest("MarketData.getEod", () -> {
      var r = marketDataApi.getEod(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getClose() != null, "expected close to be present");
      // System.out.println(r);
    });

    runTest("MarketData.getMarketMovers", () -> {
      var r = marketDataApi.getMarketMovers(MarketEnum.STOCKS, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
      // System.out.println(r.getValues().get(0));
    });

    runTest("MarketData.getTimeSeriesCross", () -> {
      var r = marketDataApi.getTimeSeriesCross(
          FOREX_BASE, FOREX_QUOTE, INTERVAL, null, null, null, null, null, null,
          OUTPUTSIZE, null, null, null, null, null, null, null, null);
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
      // System.out.println(r.getValues().get(0));
    });

    // --- CurrenciesApi ---

    runTest("Currencies.getExchangeRate", () -> {
      var r = currenciesApi.getExchangeRate(SYMBOL_FOREX, null, null, null, null, null);
      assertTrue(r.getRate() != null, "expected rate to be present");
      // System.out.println(r);
    });

    runTest("Currencies.getCurrencyConversion", () -> {
      var r = currenciesApi.getCurrencyConversion(
          SYMBOL_FOREX, CURRENCY_AMOUNT, null, null, null, null, null);
      assertTrue(r.getRate() != null, "expected rate to be present");
      // System.out.println(r);
    });

    // --- FundamentalsApi ---

    runTest("Fundamentals.getIpoCalendar", () -> {
      var r = fundamentalsApi.getIpoCalendar(null, null, null, START_DATE, END_DATE);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Fundamentals.getEarningsCalendar", () -> {
      var r = fundamentalsApi.getEarningsCalendar(
          null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarnings() != null, "expected earnings map");
      // System.out.println(r);
    });

    runTest("Fundamentals.getDividendsCalendar", () -> {
      var r = fundamentalsApi.getDividendsCalendar(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Fundamentals.getSplitsCalendar", () -> {
      var r = fundamentalsApi.getSplitsCalendar(
          null, null, null, null, null, null, null, START_DATE, END_DATE, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Fundamentals.getEarnings", () -> {
      var r = fundamentalsApi.getEarnings(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null,
          null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarnings() != null, "expected earnings to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getDividends", () -> {
      var r = fundamentalsApi.getDividends(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getDividends() != null, "expected dividends to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getSplits", () -> {
      var r = fundamentalsApi.getSplits(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getSplits() != null, "expected splits to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getBalanceSheet", () -> {
      var r = fundamentalsApi.getBalanceSheet(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getBalanceSheet() != null, "expected balanceSheet to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getCashFlow", () -> {
      var r = fundamentalsApi.getCashFlow(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getCashFlow() != null, "expected cashFlow to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getIncomeStatement", () -> {
      var r = fundamentalsApi.getIncomeStatement(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getIncomeStatement() != null, "expected incomeStatement to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getProfile", () -> {
      var r = fundamentalsApi.getProfile(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r.getSymbol() != null, "expected symbol to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getStatistics", () -> {
      var r = fundamentalsApi.getStatistics(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r.getStatistics() != null, "expected statistics to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getMarketCap", () -> {
      var r = fundamentalsApi.getMarketCap(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getMarketCap() != null, "expected marketCap to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getKeyExecutives", () -> {
      var r = fundamentalsApi.getKeyExecutives(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r.getKeyExecutives() != null, "expected keyExecutives to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getLogo", () -> {
      var r = fundamentalsApi.getLogo(SYMBOL_STOCK, null, null, null);
      assertTrue(r.getUrl() != null, "expected url to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.pressReleasesListParameters", () -> {
      var r = fundamentalsApi.pressReleasesListParameters(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getPressReleases() != null, "expected pressReleases to be present");
      // System.out.println(r);
    });

    runTest("Fundamentals.getBalanceSheetConsolidated", () -> {
      var r = fundamentalsApi.getBalanceSheetConsolidated(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getBalanceSheet() != null && !r.getBalanceSheet().isEmpty(),
          "expected non-empty balanceSheet array");
      // System.out.println(r.getBalanceSheet().get(0));
    });

    runTest("Fundamentals.getCashFlowConsolidated", () -> {
      var r = fundamentalsApi.getCashFlowConsolidated(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getCashFlow() != null && !r.getCashFlow().isEmpty(),
          "expected non-empty cashFlow array");
      // System.out.println(r.getCashFlow().get(0));
    });

    runTest("Fundamentals.getIncomeStatementConsolidated", () -> {
      var r = fundamentalsApi.getIncomeStatementConsolidated(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getIncomeStatement() != null && !r.getIncomeStatement().isEmpty(),
          "expected non-empty incomeStatement array");
      // System.out.println(r.getIncomeStatement().get(0));
    });

    runTest("Fundamentals.getLastChanges", () -> {
      var r = fundamentalsApi.getLastChanges(
          LAST_CHANGES_ENDPOINT, null, null, null, null, null, null, null);
      assertTrue(r.getData() != null, "expected data array");
      // System.out.println(r.getData().isEmpty() ? r : r.getData().get(0));
    });

    // --- AnalysisApi ---

    runTest("Analysis.getAnalystRatingsUsEquities", () -> {
      var r = analysisApi.getAnalystRatingsUsEquities(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRatings() != null, "expected ratings to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getPriceTarget", () -> {
      var r = analysisApi.getPriceTarget(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getPriceTarget() != null, "expected priceTarget to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getRecommendations", () -> {
      var r = analysisApi.getRecommendations(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getTrends() != null, "expected trends to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getEarningsEstimate", () -> {
      var r = analysisApi.getEarningsEstimate(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEarningsEstimate() != null, "expected earningsEstimate to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getEpsRevisions", () -> {
      var r = analysisApi.getEpsRevisions(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEpsRevision() != null, "expected epsRevision to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getEpsTrend", () -> {
      var r = analysisApi.getEpsTrend(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEpsTrend() != null, "expected epsTrend to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getGrowthEstimates", () -> {
      var r = analysisApi.getGrowthEstimates(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getGrowthEstimates() != null, "expected growthEstimates to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getRevenueEstimate", () -> {
      var r = analysisApi.getRevenueEstimate(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRevenueEstimate() != null, "expected revenueEstimate to be present");
      // System.out.println(r);
    });

    runTest("Analysis.getAnalystRatingsLight", () -> {
      var r = analysisApi.getAnalystRatingsLight(
          SYMBOL_STOCK, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getRatings() != null, "expected ratings to be present");
      // System.out.println(r);
    });

    // --- EtfsApi ---

    runTest("Etfs.getETFsList", () -> {
      var r = etfsApi.getETFsList(
          SYMBOL_ETF, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsWorld", () -> {
      var r = etfsApi.getETFsWorld(SYMBOL_ETF, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsWorldSummary", () -> {
      var r = etfsApi.getETFsWorldSummary(SYMBOL_ETF, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsWorldComposition", () -> {
      var r = etfsApi.getETFsWorldComposition(SYMBOL_ETF, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsWorldPerformance", () -> {
      var r = etfsApi.getETFsWorldPerformance(SYMBOL_ETF, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsWorldRisk", () -> {
      var r = etfsApi.getETFsWorldRisk(SYMBOL_ETF, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getEtf() != null, "expected etf to be present");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsFamily", () -> {
      var r = etfsApi.getETFsFamily(COUNTRY, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
      // System.out.println(r);
    });

    runTest("Etfs.getETFsType", () -> {
      var r = etfsApi.getETFsType(COUNTRY, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
      // System.out.println(r);
    });

    // --- MutualFundsApi ---

    runTest("MutualFunds.getMutualFundsWorld", () -> {
      var r = mutualFundsApi.getMutualFundsWorld(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldSummary", () -> {
      var r = mutualFundsApi.getMutualFundsWorldSummary(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldComposition", () -> {
      var r = mutualFundsApi.getMutualFundsWorldComposition(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldPerformance", () -> {
      var r = mutualFundsApi.getMutualFundsWorldPerformance(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldRisk", () -> {
      var r = mutualFundsApi.getMutualFundsWorldRisk(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldRatings", () -> {
      var r = mutualFundsApi.getMutualFundsWorldRatings(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldPurchaseInfo", () -> {
      var r = mutualFundsApi.getMutualFundsWorldPurchaseInfo(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsWorldSustainability", () -> {
      var r = mutualFundsApi.getMutualFundsWorldSustainability(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getMutualFund() != null, "expected mutualFund to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsFamily", () -> {
      var r = mutualFundsApi.getMutualFundsFamily(null, COUNTRY);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsList", () -> {
      var r = mutualFundsApi.getMutualFundsList(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
      // System.out.println(r);
    });

    runTest("MutualFunds.getMutualFundsType", () -> {
      var r = mutualFundsApi.getMutualFundsType(null, COUNTRY);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null && !r.getResult().isEmpty(),
          "expected non-empty result map");
      // System.out.println(r);
    });

    // --- ReferenceDataApi ---

    runTest("ReferenceData.getStocks", () -> {
      var r = referenceDataApi.getStocks(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getCryptocurrencies", () -> {
      var r = referenceDataApi.getCryptocurrencies(
          SYMBOL_CRYPTO, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getForexPairs", () -> {
      var r = referenceDataApi.getForexPairs(SYMBOL_FOREX, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getExchanges", () -> {
      var r = referenceDataApi.getExchanges(null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getMarketState", () -> {
      var r = referenceDataApi.getMarketState(null, null, null);
      assertTrue(r != null && !r.isEmpty(), "expected non-empty market state array");
      // System.out.println(r.get(0));
    });

    runTest("ReferenceData.getEarliestTimestamp", () -> {
      var r = referenceDataApi.getEarliestTimestamp(
          INTERVAL, SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r.getDatetime() != null, "expected datetime to be present");
      // System.out.println(r);
    });

    runTest("ReferenceData.getSymbolSearch", () -> {
      var r = referenceDataApi.getSymbolSearch(SYMBOL_STOCK, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null, "expected data to be present");
      // System.out.println(r);
    });

    runTest("ReferenceData.getCrossListings", () -> {
      var r = referenceDataApi.getCrossListings(SYMBOL_STOCK, null, null, null);
      assertTrue(r.getResult() != null, "expected result to be present");
      // System.out.println(r);
    });

    runTest("ReferenceData.getBonds", () -> {
      var r = referenceDataApi.getBonds(null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
      // System.out.println(r);
    });

    runTest("ReferenceData.getCommodities", () -> {
      var r = referenceDataApi.getCommodities(null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getCryptocurrencyExchanges", () -> {
      var r = referenceDataApi.getCryptocurrencyExchanges(null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getEtf", () -> {
      var r = referenceDataApi.getEtf(
          SYMBOL_ETF, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getExchangeSchedule", () -> {
      var r = referenceDataApi.getExchangeSchedule(null, MIC_CODE, null, null);
      assertTrue(r.getData() != null && !r.getData().isEmpty(), "expected non-empty data array");
      // System.out.println(r.getData().get(0));
    });

    runTest("ReferenceData.getFunds", () -> {
      var r = referenceDataApi.getFunds(
          SYMBOL_MUTUAL_FUND, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getResult() != null, "expected result to be present");
      // System.out.println(r);
    });

    // --- RegulatoryApi ---

    runTest("Regulatory.getDirectHolders", () -> {
      var r = regulatoryApi.getDirectHolders(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Regulatory.getFundHolders", () -> {
      var r = regulatoryApi.getFundHolders(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Regulatory.getInstitutionalHolders", () -> {
      var r = regulatoryApi.getInstitutionalHolders(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Regulatory.getInsiderTransactions", () -> {
      var r = regulatoryApi.getInsiderTransactions(
          SYMBOL_STOCK, null, null, null, null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
    });

    runTest("Regulatory.getTaxInfo", () -> {
      var r = regulatoryApi.getTaxInfo(SYMBOL_STOCK, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getData() != null, "expected data to be present");
      // System.out.println(r);
    });

    runTest("Regulatory.getSourceSanctionedEntities", () -> {
      var r = regulatoryApi.getSourceSanctionedEntities(SANCTIONS_SOURCE);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getSanctions() != null, "expected sanctions to be present");
      // System.out.println(r);
    });

    runTest("Regulatory.getEdgarFilingsArchive", () -> {
      var r = regulatoryApi.getEdgarFilingsArchive(
          SYMBOL_STOCK, null, null, null, null, null, null, null, null, null, null, null);
      assertTrue(r.getMeta() != null, "expected meta to be present");
      assertTrue(r.getValues() != null, "expected values array");
      // System.out.println(r.getValues().isEmpty() ? r.getMeta() : r.getValues().get(0));
    });

    // --- TechnicalIndicatorApi (2 only) ---

    runTest("TechnicalIndicator.getTimeSeriesRsi", () -> {
      var r = technicalIndicatorApi.getTimeSeriesRsi(
          INTERVAL, SYMBOL_STOCK, null, null, null, OUTPUTSIZE,
          null, null, null, null, TIMEZONE, null, null, null, null, null,
          null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
      // System.out.println(r.getValues().get(0));
    });

    runTest("TechnicalIndicator.getTimeSeriesMacd", () -> {
      var r = technicalIndicatorApi.getTimeSeriesMacd(
          INTERVAL, SYMBOL_STOCK, null, null, null, OUTPUTSIZE,
          null, null, null, null, TIMEZONE, null, null, null, null, null,
          null, null, null, null, null, null, null, null, null, null);
      assertTrue("ok".equals(r.getStatus()), "expected status ok, got " + r.getStatus());
      assertTrue(r.getValues() != null && !r.getValues().isEmpty(), "expected non-empty values array");
      // System.out.println(r.getValues().get(0));
    });

    // --- AdvancedApi ---

    runTest("Advanced.getApiUsage", () -> {
      var r = advancedApi.getApiUsage(null, null, null);
      assertTrue(r != null, "expected response data");
      // System.out.println(r);
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
