package java_adv2.was.httpserver.servlet;

import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;
import java_adv2.was.httpserver.HttpServlet;

public class DiscardServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) {
    // empty ex)favicon.ico
  }
}
