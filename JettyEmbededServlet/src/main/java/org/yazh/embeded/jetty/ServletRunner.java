package org.yazh.embeded.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import org.yazh.basic.SimpleServlet;

public class ServletRunner {
	public static void main(String args[]){

		try {
			Server server = new Server();
			ServerConnector c = new ServerConnector(server);
			c.setIdleTimeout(1000);
			c.setAcceptQueueSize(10);
			c.setPort(8080);
			c.setHost("localhost");
			ServletContextHandler handler = new ServletContextHandler(server,"/app", true, false);
			ServletHolder servletHolder = new ServletHolder(SimpleServlet.class);
			handler.addServlet(servletHolder, "/date");
			server.addConnector(c);
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}