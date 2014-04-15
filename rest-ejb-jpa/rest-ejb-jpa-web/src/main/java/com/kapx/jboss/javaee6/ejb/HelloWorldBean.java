package com.kapx.jboss.javaee6.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(HelloWorldLocal.class)
public class HelloWorldBean implements HelloWorldLocal {

	@Override
	public String sayHello(String arg) {
		return "Hello !!! " + arg;
	}

}
