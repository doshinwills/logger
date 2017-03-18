package com.init;

//Import required java libraries
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doshin.util.HelloUtil;

//Extend HttpServlet class
public class HelloWorld extends HttpServlet {
	java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(HelloWorld.class.getName());
	Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	private String message;

	public void init() throws ServletException {
		log.log(Level.SEVERE, "JUL init");
		log.log(Level.WARNING, "JUL init");
		log.log(Level.CONFIG, "JUL init");
		log.log(Level.FINE, "JUL init");
		log.log(Level.FINER, "JUL init");
		log.log(Level.FINEST, "JUL init");
		logger.error("slf4j init");
		logger.warn("slf4j init");
		logger.info("slf4j init");
		logger.debug("slf4j init");
		logger.trace("slf4j init");

		// Do required initialization
		message = "Hello World Test";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type

		log.log(Level.SEVERE, "JUL doGet");
		log.log(Level.WARNING, "JUL doGet");
		log.log(Level.CONFIG, "JUL doGet");
		log.log(Level.FINE, "JUL doGet");
		log.log(Level.FINER, "JUL doGet");
		log.log(Level.FINEST, "JUL doGet");
		logger.error("slf4j doGet");
		logger.warn("slf4j doGet");
		logger.info("slf4j doGet");
		logger.debug("slf4j doGet");
		logger.trace("slf4j doGet");

		HelloUtil.testMethod();

		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}
}
