package com.example.java_adv2.chat.server.command;

import com.example.java_adv2.chat.server.Session;
import com.example.java_adv2.chat.server.SessionManager;

public class JoinCommand implements Command {

  private final SessionManager sessionManager;

  public JoinCommand(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  @Override
  public void execute(String[] args, Session session) {
    String username = args[1];
    session.setUsername(username);
    sessionManager.sendAll(username + "님이 입장했습니다.");
  }
}
