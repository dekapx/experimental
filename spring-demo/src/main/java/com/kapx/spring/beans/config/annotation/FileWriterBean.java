package com.kapx.spring.beans.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileWriterBean")
public class FileWriterBean {

    @Autowired
    @Qualifier("xmlFileWriter")
    private FileWriter fileWriter;

    public void writeToFile(final String contents) {
        fileWriter.write(contents);
    }
}
