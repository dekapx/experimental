package net.kapx.java.basics;

public class HelloWorld {
	public String sayHello(String arg) {
		if (arg == null || arg.isEmpty()) {
			throw new IllegalArgumentException("Argument must not be null or empty.");
		}
		return "Hello ! " + arg;
	}
}
