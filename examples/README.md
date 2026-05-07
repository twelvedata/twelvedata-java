# Twelve Data API client for Java examples

This package contains usage examples for Java language.

## Prerequisites

Java 11 or later. We recommend the latest LTS release.

## Setup

All commands below run from this folder (`examples/`).

This subproject pulls the parent client in via a Gradle composite build (`includeBuild('..')` in `settings.gradle`); no separate install step is needed. The first run cold-compiles the parent client and may take 10–20 seconds.

Export your API key:

```bash
export TWELVEDATA_API_KEY=<your-api-key>
```

On Windows `cmd`: `set TWELVEDATA_API_KEY=<your-api-key>`.

In PowerShell: `$env:TWELVEDATA_API_KEY="<your-api-key>"`.

## Run

**Linux / macOS** — make the parent's Gradle wrapper executable once, then run any example:

```bash
chmod +x ../gradlew
../gradlew runTimeSeries
```

**Windows** (`cmd` or PowerShell):

```bat
..\gradlew.bat runTimeSeries
```

Each example is a single `run<Name>` task. List them all with `../gradlew tasks --group examples`.
