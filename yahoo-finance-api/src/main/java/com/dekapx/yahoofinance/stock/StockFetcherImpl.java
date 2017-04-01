package com.dekapx.yahoofinance.stock;

import com.dekapx.yahoofinance.util.CsvFileWriter;
import com.dekapx.yahoofinance.util.FileWriter;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.quotes.stock.StockQuote;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StockFetcherImpl implements StockFetcher {
    @Override
    public StockQuote getStock(String symbol) throws Exception {
        final Stock stock = YahooFinance.get(symbol);
        return stock.getQuote();
    }

    @Override
    public List<HistoricalQuote> getHistoricalQuote(String symbol, Calendar from, Calendar to, Interval interval) throws Exception {
        final Stock stock = YahooFinance.get(symbol);
        return stock.getHistory(from, to, interval);
    }

    private static String getLine(final HistoricalQuote historicalQuote) {
        final StringBuilder quoteBuilder = new StringBuilder();
        quoteBuilder
                .append(historicalQuote.getSymbol())
                .append(", ")
                .append(historicalQuote.getLow())
                .append(", ")
                .append(historicalQuote.getHigh())
                .append(", ")
                .append(historicalQuote.getDate().getTime());
        return quoteBuilder.toString();
    }

    public static void main(String[] args) throws Exception {
        final StockFetcher stockFetcher = new StockFetcherImpl();
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.add(Calendar.YEAR, -1); // from 1 years ago

        final String symbol = "GOOG";
        final String fileName = "src/main/resources/csv/stock-quote.csv";
        final File csvFile = new File(fileName);
        if (csvFile.exists()) {
            csvFile.delete();
        }

        FileWriter fileWriter = new CsvFileWriter(csvFile);
        final List<HistoricalQuote> historicalQuotes = stockFetcher.getHistoricalQuote(symbol, from, to, Interval.DAILY);
        final List<String> lines = new ArrayList<>();
        for (HistoricalQuote historicalQuote : historicalQuotes) {
            final String line = getLine(historicalQuote);
            lines.add(line);
        }
        fileWriter.write(lines);
    }
}
