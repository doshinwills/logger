package com.doshin.util;

import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloUtil {
	static java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(HelloUtil.class.getName());

	static Logger logger = LoggerFactory.getLogger(HelloUtil.class);

	public static String testMethod() {
		log.log(Level.SEVERE, "JUL Log");
		log.log(Level.WARNING, "JUL Log");
		log.log(Level.CONFIG, "JUL Log");
		log.log(Level.FINE, "JUL Log");
		log.log(Level.FINER, "JUL Log");
		log.log(Level.FINEST, "JUL Log");
		logger.error("slf4j Doshin");
		logger.warn("slf4j Doshin");
		logger.info("slf4j Doshin");
		logger.debug("slf4j Doshin");
		logger.trace("slf4j Doshin");
		return "Doshin";
	}

}
