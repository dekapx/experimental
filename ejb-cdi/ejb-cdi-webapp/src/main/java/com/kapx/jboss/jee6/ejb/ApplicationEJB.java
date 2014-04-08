package com.kapx.jboss.jee6.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kapx.jboss.jee6.util.ApplicationUtil;

@Stateless
public class ApplicationEJB {
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationEJB.class);

	@Inject
	private ApplicationUtil applicationUtil;

	public void execute(final String arg) {
		if (applicationUtil.isValidString(arg)) {
			LOG.info("executing ApplicationEJB.execute() method with argument [{}]", arg);
		}
	}
}
