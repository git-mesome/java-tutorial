package com.example.java_adv2.was.v6;

import com.example.java_adv2.was.httpserver.HttpRequest;
import com.example.java_adv2.was.httpserver.HttpResponse;

public class SiteControllerV6 {

  public void site1(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>site1</h1>");
  }

  public void site2(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>site2</h1>");
  }

}
