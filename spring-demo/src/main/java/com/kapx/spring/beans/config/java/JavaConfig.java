package com.kapx.spring.beans.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public JavaConfigBean javaConfigBean(){
        return new JavaConfigBean();
    }

    @Bean
    public CsvFileWriter getCsvFileWriter() {
        return new CsvFileWriter();
    }

    @Bean
    public TextFileWriter getTextFileWriter() {
        return new TextFileWriter();
    }

    @Bean
    public XmlFileWriter getXmlFileWriter() {
        return new XmlFileWriter();
    }

    @Bean
    public FileWriterBean getFileWriterBean() {
        return new FileWriterBean();
    }

}
