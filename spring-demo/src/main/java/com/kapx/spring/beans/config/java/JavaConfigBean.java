package com.kapx.spring.beans.config.java;

public class JavaConfigBean implements HelloBean {
    @Override
    public void sayHello() {
        System.out.println("-- Hello, I'm a Java Config bean --");
    }
}
