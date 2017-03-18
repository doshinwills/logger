package com.doshin.jcl;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.bridge.SLF4JBridgeHandler;

public class JclToSlfServlet extends HttpServlet {

	//For JUL to forward log to slf4j
	public void init() throws ServletException {

		LogManager.getLogManager().reset();
		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();
		Logger.getLogger("global").setLevel(Level.FINEST);
	}
}
