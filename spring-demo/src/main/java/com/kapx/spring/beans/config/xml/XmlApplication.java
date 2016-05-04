package com.kapx.spring.beans.config.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring-context/applicationContext.xml")
public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(XmlApplication.class, args);
        XmlBean bean = (XmlBean) ctx.getBean("xmlBean");
        bean.sayHello();
    }
}
