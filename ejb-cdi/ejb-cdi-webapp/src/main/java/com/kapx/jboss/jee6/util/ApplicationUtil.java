package com.kapx.jboss.jee6.util;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("applicationUtil")
public class ApplicationUtil {
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationUtil.class);

	public boolean isValidString(final String arg) {
		LOG.info("performing validation check for argument [{}]", arg);
		if (arg == null || arg.isEmpty()) {
			return false;
		}

		return true;
	}
}
