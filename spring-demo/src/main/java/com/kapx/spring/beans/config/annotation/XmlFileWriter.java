package com.kapx.spring.beans.config.annotation;

import org.springframework.stereotype.Component;

@Component("xmlFileWriter")
public class XmlFileWriter implements FileWriter
{
    @Override
    public void write(String contents) {
        final String output = String.format("-- Write contents %s by %s --", contents, this.getClass().getSimpleName());
        System.out.println(output);
    }
}