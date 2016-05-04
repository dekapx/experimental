package com.kapx.spring.beans.config.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kapx.spring.beans.config.annotation")
public class ComponentScanApplication {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(ComponentScanApplication.class, args);
        final ComponentScanBean bean = (ComponentScanBean) ctx.getBean("componentScanBean");
        bean.sayHello();
    }
}
