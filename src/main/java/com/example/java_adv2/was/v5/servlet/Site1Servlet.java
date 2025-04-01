package com.example.java_adv2.was.v5.servlet;

import com.example.java_adv2.was.httpserver.HttpRequest;
import com.example.java_adv2.was.httpserver.HttpResponse;
import com.example.java_adv2.was.httpserver.HttpServlet;

public class Site1Servlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>site1</h1>");
  }
}
