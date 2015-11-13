package net.kapx.java.basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld helloWorld;

	@Before
	public void setUp() throws Exception {
		helloWorld = new HelloWorld();
	}

	@After
	public void tearDown() throws Exception {
		helloWorld = null;
	}

	@Test(expected=IllegalArgumentException.class)
	public void sayHello_withNullArgument_throwsIllegalArgumentException() {
		helloWorld.sayHello(null);
	}

}
