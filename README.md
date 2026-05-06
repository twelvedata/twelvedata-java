# Twelve Data API client for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.twelvedata/twelvedata-java)](https://central.sonatype.com/artifact/com.twelvedata/twelvedata-java)
[![License](https://img.shields.io/github/license/twelvedata/twelvedata-java)](https://github.com/twelvedata/twelvedata-java/blob/master/LICENSE)
[![Issues](https://img.shields.io/github/issues/twelvedata/twelvedata-java)](https://github.com/twelvedata/twelvedata-java/issues)

Twelve Data official library. This package supports all main features of the service:
- Real-time and historical market data: time series, quotes, end-of-day prices, exchange rates, and market movers.
- Fundamentals: financial statements, earnings, dividends, splits, company profiles, and key statistics.
- 100+ technical indicators: SMA, EMA, RSI, MACD, Bollinger Bands, Ichimoku, and many more.
- Analysis & estimates: analyst ratings, price targets, EPS trends, revenue and growth estimates.
- ETFs and mutual funds: summaries, composition, performance, risk, and ratings.

🔑 **API key** is required. If you don't have it yet, get it by [signing up here](https://twelvedata.com/pricing).

## Requirements
Java 11 or later.

## Installation

Maven (`pom.xml`):

```xml
<dependency>
  <groupId>com.twelvedata</groupId>
  <artifactId>twelvedata-java</artifactId>
  <version>LATEST</version>
</dependency>
```

Gradle (`build.gradle`):

```groovy
implementation 'com.twelvedata:twelvedata-java:LATEST'
```

🔗 View the package on [Maven Central](https://central.sonatype.com/artifact/com.twelvedata/twelvedata-java).

## Quick start

### 1. Set up a new project

**Maven** (`pom.xml`):

```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
cd my-app
```

Add the Twelve Data dependency to `pom.xml` inside `<dependencies>`:

```xml
<dependency>
  <groupId>com.twelvedata</groupId>
  <artifactId>twelvedata-java</artifactId>
  <version>LATEST</version>
</dependency>
```

**Gradle** (`build.gradle`):

```bash
mkdir my-app && cd my-app
gradle init --type java-application --dsl groovy \
    --package com.example --project-name my-app \
    --java-version 11 --test-framework junit-jupiter \
    --no-split-project
```

Add the Twelve Data dependency to `build.gradle` inside `dependencies { ... }`:

```groovy
implementation 'com.twelvedata:twelvedata-java:LATEST'
```

### 2. Replace `src/main/java/com/example/App.java`

```java
package com.example;

import com.twelvedata.client.ApiClient;
import com.twelvedata.client.Twelvedata;
import com.twelvedata.client.api.MarketDataApi;
import com.twelvedata.client.errors.TwelvedataApiException;
import com.twelvedata.client.model.GetTimeSeries200Response;
import com.twelvedata.client.model.IntervalEnum;

public class App {
    public static void main(String[] args) {
        ApiClient client = Twelvedata.newApiClient("YOUR_API_KEY_HERE"); // defaults to System.getenv("TWELVEDATA_API_KEY")
        MarketDataApi api = new MarketDataApi(client);

        try {
            GetTimeSeries200Response response = api.getTimeSeries(
                IntervalEnum._1DAY, // interval (required)
                "AAPL",             // symbol
                null, null, null,   // isin, figi, cusip
                5L,                 // outputsize
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null
            );
            System.out.println(response);
        } catch (TwelvedataApiException e) {
            System.err.println("API error [" + e.getStatusCode() + "]: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e);
        }
    }
}
```

### 3. Run

Maven:

```bash
mvn -q compile exec:java -Dexec.mainClass=com.example.App
```

Gradle:

```bash
./gradlew run
```

👀 Check the full example and other examples [here](https://github.com/twelvedata/twelvedata-java/tree/master/examples).

## Error Handling

See [error_handling.md](error_handling.md) for error types, properties, and usage examples.

For the complete list of API error codes and their meanings, see the [Twelve Data Errors documentation](https://twelvedata.com/docs/introduction/errors).

## API Reference

See [api_reference.md](api_reference.md) for the complete list of API endpoints and models.

## Documentation
Delve deeper with our [official documentation](https://twelvedata.com/docs).

## Examples
Explore practical scenarios in the [examples](https://github.com/twelvedata/twelvedata-java/tree/master/examples) directory.

## Support
- 🌐 Visit our [contact page](https://twelvedata.com/contact).
- 🛠 Or our [support center](https://support.twelvedata.com/).

## Stay updated
- Follow us on [𝕏](https://twitter.com/TwelveData).
- Follow us on [Telegram](https://t.me/twelvedata).

## Contributing
1. Fork and clone: `$ git clone https://github.com/twelvedata/twelvedata-java .`.
2. Branch out: `$ git checkout -b my-feature`.
3. Commit changes and test.
4. Push your branch and open a pull request with a comprehensive description.

For more guidance on contributing, see the [GitHub Docs](https://docs.github.com/en/get-started/quickstart/contributing-to-projects) on GitHub.

## License

This project is licensed under the MIT. See the `LICENSE` file in this repository for more details.