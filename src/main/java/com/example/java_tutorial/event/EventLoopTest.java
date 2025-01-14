package com.example.java_tutorial.event;

import java.util.LinkedList;
import java.util.Queue;

interface Action {
  void execute(Event event);
}

class Event {
  private String name;
  private Action action;
  private Event nextEvent;

  public Event(String name, Action action, Event nextEvent) {
    this.name = name;
    this.action = action;
    this.nextEvent = nextEvent;
  }

  public void executeAction() {
    action.execute(this);
    if (nextEvent != null) {
      EventLoop.registerEvent(nextEvent);
    }
  }

  public String getName() {
    return name;
  }
}

class EventLoop {
  private static Queue<Event> events = new LinkedList<>();

  public static void registerEvent(Event event) {
    events.offer(event);
  }

  public static void runForever() {
    System.out.println("Queue running with " + events.size() + " events");
    while (true) {
      try {
        Event event = events.poll();
        if (event != null) {
          event.executeAction();
        }
      } catch (Exception e) {
        // continue if an event is not available
      }
    }
  }
}

public class EventLoopTest {
  public static void main(String[] args) {
    EventLoop eventLoop = new EventLoop();

    // Define knock action
    Action knockAction = event -> {
      System.out.println(event.getName());
      try {
        Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    // Define who action
    Action whoAction = event -> {
      System.out.println(event.getName());
      try {
        Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    // Create events
    Event replying = new Event("Who's there?", whoAction, null);
    Event knocking = new Event("Knock-knock", knockAction, replying);

    // Register several events
    for (int i = 0; i < 2; i++) {
      EventLoop.registerEvent(knocking);
    }

    // Start the event loop
    EventLoop.runForever();
  }
}