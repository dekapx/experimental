package com.kapx.spring.beans.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration
{
    @Bean(name = "javaConfigBean")
    public JavaConfigBean javaConfigBean(){
        return new JavaConfigBean();
    }

    @Bean(name = "csvFileWriter")
    public CsvFileWriter getCsvFileWriter() {
        return new CsvFileWriter();
    }

    @Bean(name = "textFileWriter")
    public TextFileWriter getTextFileWriter() {
        return new TextFileWriter();
    }

    @Bean(name = "xmlFileWriter")
    public XmlFileWriter getXmlFileWriter() {
        return new XmlFileWriter();
    }

    @Bean(name = "fileWriterBean")
    public FileWriterBean getFileWriterBean() {
        return new FileWriterBean();
    }

}
