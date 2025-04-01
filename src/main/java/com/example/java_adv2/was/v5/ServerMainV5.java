package com.example.java_adv2.was.v5;

import com.example.java_adv2.was.httpserver.HttpServer;
import com.example.java_adv2.was.httpserver.ServletManager;
import com.example.java_adv2.was.httpserver.servlet.DiscardServlet;
import com.example.java_adv2.was.v5.servlet.HomeServlet;
import com.example.java_adv2.was.v5.servlet.SearchServlet;
import com.example.java_adv2.was.v5.servlet.Site1Servlet;
import com.example.java_adv2.was.v5.servlet.Site2Servlet;
import java.io.IOException;

public class ServerMainV5 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    ServletManager servletManager = new ServletManager();
    servletManager.add("/", new HomeServlet());
    servletManager.add("/site1", new Site1Servlet());
    servletManager.add("/site2", new Site2Servlet());
    servletManager.add("/search", new SearchServlet());
    servletManager.add("/favicon.ico", new DiscardServlet());

    HttpServer server = new HttpServer(PORT, servletManager);
    server.start();
  }

}
