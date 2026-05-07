# Twelve Data API client for Java integration tests

Hits every generated endpoint once against the live Twelve Data API. Used to catch regressions before publishing a new client version.

> **Warning:** running this suite spends live API quota.

## Prerequisites

Java 11 or later. We recommend the latest LTS release.

## Setup

All commands below run from this folder (`tests/integration/`).

This subproject pulls the parent client in via a Gradle composite build (`includeBuild('../..')` in `settings.gradle`); no separate install step is needed. The first run cold-compiles the parent client and may take 10–20 seconds.

Export your API key:

```bash
export TWELVEDATA_API_KEY=<your-api-key>
```

On Windows `cmd`: `set TWELVEDATA_API_KEY=<your-api-key>`. 

In PowerShell: `$env:TWELVEDATA_API_KEY="<your-api-key>"`.

## Run

**Linux / macOS** — make the parent's Gradle wrapper executable once, then run:

```bash
chmod +x ../../gradlew
../../gradlew run
```

**Windows** (`cmd` or PowerShell):

```bat
..\..\gradlew.bat run
```

Each endpoint prints `✓ <name>` on success or `✗ <name>: <message>` on failure, followed by a one-row sample. The final line reads `Passed: N / N`; the process exits non-zero if any case fails.
