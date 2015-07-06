package org.yazh.embeded.tomcat;

import java.io.File; 
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import org.yazh.basic.SimpleServlet;

public class ServletRunner {
	public static void main(String args[]){
		try {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		File base = new File(System.getProperty("java.io.tmpdir"));
		Context rootCtx = tomcat.addContext("/app", base.getAbsolutePath());
		Tomcat.addServlet(rootCtx, "SimpleServlet", new SimpleServlet());
		tomcat.addWebapp("jenkins", args[0] + "/war/jenkins.war");
		rootCtx.addServletMapping("/date", "SimpleServlet");
		tomcat.start();
		tomcat.getServer().await();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}