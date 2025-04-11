package java_adv2.was.httpserver.servlet;

import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;
import java_adv2.was.httpserver.HttpServlet;

public class InternalErrorServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) {
    response.setStatusCode(500);
    response.writeBody("<h1>내부 서버 오류</h1>");
  }
}
