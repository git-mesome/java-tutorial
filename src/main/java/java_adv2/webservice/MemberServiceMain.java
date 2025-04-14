package java_adv2.webservice;

import java.io.IOException;
import java.util.List;
import java_adv2.io.member.MemberRepository;
import java_adv2.io.member.impl.FileMemberRepository;
import java_adv2.was.httpserver.HttpServer;
import java_adv2.was.httpserver.HttpServlet;
import java_adv2.was.httpserver.ServletManager;
import java_adv2.was.httpserver.servlet.DiscardServlet;
import java_adv2.was.httpserver.servlet.annotation.AnnotationServletV3;

public class MemberServiceMain {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    MemberRepository memberRepository = new FileMemberRepository();
    MemberController memberController = new MemberController(memberRepository);
    HttpServlet servlet = new AnnotationServletV3(List.of(memberController));
    ServletManager servletManager = new ServletManager();
    servletManager.add("/favicon.ico", new DiscardServlet());
    servletManager.setDefaultServlet(servlet);

    HttpServer server = new HttpServer(PORT, servletManager);
    server.start();
  }

}
