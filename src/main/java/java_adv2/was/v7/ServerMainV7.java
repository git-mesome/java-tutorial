package java_adv2.was.v7;

import java.io.IOException;
import java.util.List;
import java_adv2.was.httpserver.HttpServer;
import java_adv2.was.httpserver.HttpServlet;
import java_adv2.was.httpserver.ServletManager;
import java_adv2.was.httpserver.servlet.DiscardServlet;
import java_adv2.was.httpserver.servlet.annotation.AnnotationServletV1;

public class ServerMainV7 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    List<Object> controllers = List.of(new SiteControllerV7(), new SearchControllerV7());
    HttpServlet annotationServlet = new AnnotationServletV1(controllers);

    ServletManager servletManager = new ServletManager();
    servletManager.setDefaultServlet(annotationServlet);
    servletManager.add("/favicon.ico", new DiscardServlet());

    new HttpServer(PORT, servletManager).start();
  }

}
