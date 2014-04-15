package com.kapx.jboss.javaee6.rest.contact;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.kapx.jboss.javaee6.ejb.HelloWorldLocal;

@Path("/contact")
@RequestScoped
public class ContactResource {

	@Inject
	private HelloWorldLocal helloWorldEJB;

	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() {
		return helloWorldEJB.sayHello("KAPX");
	}
}
