package com.example.java_adv2.was.v6;

import com.example.java_adv2.was.httpserver.HttpRequest;
import com.example.java_adv2.was.httpserver.HttpResponse;

public class SearchControllerV6 {

  public void search(HttpRequest request, HttpResponse response) {
    String query = request.getParameter("q");
    response.writeBody("<h1>Search</h1>");
    response.writeBody("<ul>");
    response.writeBody("<li>검색어: " + query + "</li>");
    response.writeBody("</ul>");
  }

}
