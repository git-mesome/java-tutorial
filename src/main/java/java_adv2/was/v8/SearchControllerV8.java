package java_adv2.was.v8;

import java_adv2.was.httpserver.HttpRequest;
import java_adv2.was.httpserver.HttpResponse;
import java_adv2.was.httpserver.servlet.annotation.Mapping;

public class SearchControllerV8 {

  @Mapping("/search")
  public void search(HttpRequest request, HttpResponse response) {
    String query = request.getParameter("q");
    response.writeBody("<h1>Search</h1>");
    response.writeBody("<ul>");
    response.writeBody("<li>검색어: " + query + "</li>");
    response.writeBody("</ul>");
  }

}
