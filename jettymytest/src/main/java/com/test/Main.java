package com.test;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by joe on 2017/7/13.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Server server=new Server(8122);
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8123);
        ServerConnector connector1 = new ServerConnector(server);
        connector1.setPort(8124);
        server.addConnector(connector);
        server.addConnector(connector1);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setResourceBase("D://");
        webAppContext.setContextPath("/D");
        server.setHandler(webAppContext);

        WebAppContext webAppContext1 = new WebAppContext();
        webAppContext1.setResourceBase("E://");
        webAppContext1.setContextPath("/E");
        server.setHandler(webAppContext1);
        ServletContextHandler servletContextHandler = new ServletContextHandler();
//        servletContextHandler.set
        server.start();
    }
}
