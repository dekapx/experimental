package com.kapx.spring.beans.config.xml;

public class XmlBean implements HelloBean {
    @Override
    public void sayHello() {
        System.out.println("-- Hello, I'm a XML Bean --");
    }
}
