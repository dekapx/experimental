package com.kapx.spring.beans.config.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FileWriterBean {

    @Autowired
    @Qualifier("textFileWriter")
    private FileWriter fileWriter;

    public void writeToFile(final String contents) {
        fileWriter.write(contents);
    }
}
