package com.example.java_adv2.chat.server.command;

import com.example.java_adv2.chat.server.Session;
import java.io.IOException;

public interface Command {

  void execute(String[] args, Session session) throws IOException;

}
