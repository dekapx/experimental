package com.kapx.spring.beans.config.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JavaConfig.class)
public class FileWriterApplication {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(FileWriterApplication.class, args);
        final FileWriterBean bean = ctx.getBean(FileWriterBean.class);
        bean.writeToFile("Sample Text");
    }
}