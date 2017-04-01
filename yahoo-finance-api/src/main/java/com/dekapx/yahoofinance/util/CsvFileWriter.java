package com.dekapx.yahoofinance.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter implements FileWriter {
    private File csvFile;
    private java.io.FileWriter fileWriter;

    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Symbol,Low,High,Date";


    public CsvFileWriter(final File csvFile) {
        this.csvFile = csvFile;
        try {
            fileWriter = new java.io.FileWriter(csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(final List<String> lines) {
        try {
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (String line: lines) {
                fileWriter.append(line);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
