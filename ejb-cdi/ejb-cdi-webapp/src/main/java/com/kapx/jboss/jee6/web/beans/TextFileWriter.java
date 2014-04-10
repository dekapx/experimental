package com.kapx.jboss.jee6.web.beans;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("textFileWriter")
public class TextFileWriter implements FileWriter {
	private static final Logger LOG = LoggerFactory.getLogger(TextFileWriter.class);

	@Override
	public void write(String contents) {
		LOG.info("Writing contents {} to text file...", contents);
	}

}
