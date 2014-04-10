package com.kapx.jboss.jee6.web.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kapx.jboss.jee6.web.util.ApplicationBeanManager;
import com.kapx.jboss.jee6.web.util.FileWriter;

@Stateless
public class ApplicationEJB {
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationEJB.class);

	@Inject
	ApplicationBeanManager beanManager;

	private FileWriter xmlFileWriter = null;

	public void execute() {
		LOG.info("executing ApplicationEJB.execute() method...");

		xmlFileWriter = beanManager.getBeanInstanceByName("xmlFileWriter");
		xmlFileWriter.write("test contents...");
	}
}
