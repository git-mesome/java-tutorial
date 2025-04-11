package java_adv2.chat.server.command;

import java_adv2.chat.server.Session;
import java_adv2.chat.server.SessionManager;

public class ChangeCommand implements Command {

  private final SessionManager sessionManager;

  public ChangeCommand(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  @Override
  public void execute(String[] args, Session session) {
    String changeName = args[1];
    sessionManager.sendAll(session.getUsername() + "님이 " + changeName + "으로 변경했습니다.");
    session.setUsername(changeName);
  }
}
