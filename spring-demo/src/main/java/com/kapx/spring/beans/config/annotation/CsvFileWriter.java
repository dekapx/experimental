package com.kapx.spring.beans.config.annotation;

import org.springframework.stereotype.Component;

@Component("csvFileWriter")
public class CsvFileWriter implements FileWriter
{
    @Override
    public void write(String contents) {
        final String output = String.format("-- Write contents %s by %s --", contents, this.getClass().getSimpleName());
        System.out.println(output);
    }
}
