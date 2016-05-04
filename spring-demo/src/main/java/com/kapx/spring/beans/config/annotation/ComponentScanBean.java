package com.kapx.spring.beans.config.annotation;

import org.springframework.stereotype.Component;

@Component
public class ComponentScanBean implements HelloBean {
    public void sayHello(){
        System.out.println("-- Hello, I'm a Component Scan Bean --");
    }
}