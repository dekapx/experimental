package com.kapx.spring.beans.config.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring-context/applicationContext.xml")
public class FileWriterApplication {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(XmlApplication.class, args);

        final FileWriterBean fileWriterBean = ctx.getBean(FileWriterBean.class);
        fileWriterBean.writeToFile("Sample Text");
    }
}
