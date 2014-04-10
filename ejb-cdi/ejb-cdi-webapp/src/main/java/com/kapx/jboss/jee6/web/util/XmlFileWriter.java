package com.kapx.jboss.jee6.web.util;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("xmlFileWriter")
public class XmlFileWriter implements FileWriter {
	private static final Logger LOG = LoggerFactory.getLogger(XmlFileWriter.class);

	@Override
	public void write(String contents) {
		LOG.info("Writing contents {} to xml file...", contents);
	}
}
