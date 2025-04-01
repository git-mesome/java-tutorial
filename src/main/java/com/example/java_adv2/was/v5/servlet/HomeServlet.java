package com.example.java_adv2.was.v5.servlet;

import com.example.java_adv2.was.httpserver.HttpRequest;
import com.example.java_adv2.was.httpserver.HttpResponse;
import com.example.java_adv2.was.httpserver.HttpServlet;

public class HomeServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>Home</h1>");
    response.writeBody("<ul>");
    response.writeBody("<li><a href='/site1'>site1</a></li>");
    response.writeBody("<li><a href='/site2'>site2</a></li>");
    response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
    response.writeBody("</ul>");
  }
}
