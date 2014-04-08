package com.kapx.jboss.jee6.web.servlet;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class ApplicationEJB {
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationEJB.class);

	public void execute() {
		LOG.info("executing ApplicationEJB.execute() method...");
	}
}
