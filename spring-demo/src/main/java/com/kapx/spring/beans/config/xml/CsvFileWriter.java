package com.kapx.spring.beans.config.xml;

public class CsvFileWriter implements FileWriter {
    @Override
    public void write(String contents) {
        final String output = String.format("-- Write contents %s by %s --", contents, this.getClass().getSimpleName());
        System.out.println(output);
    }
}
