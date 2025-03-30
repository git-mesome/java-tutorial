package com.example.java_adv2.chat.server.command;

import com.example.java_adv2.chat.server.Session;
import com.example.java_adv2.chat.server.SessionManager;

public class MessageCommand implements Command {

  private final SessionManager sessionManager;

  public MessageCommand(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  @Override
  public void execute(String[] args, Session session) {
    String message = args[1];
    sessionManager.sendAll("[" + session.getUsername() + "] " + message);
  }
}
