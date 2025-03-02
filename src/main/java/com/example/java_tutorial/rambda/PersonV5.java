package com.example.java_tutorial.rambda;

public class PersonV5 {

  public Member getMember1(Creatable1 creatable) {
    String id = "winter";
    return creatable.create(id);
  }

  public Member getMember2(Creatable2 creatable) {
    String id = "winter";
    String name = "겨울";
    return creatable.create(id, name);
  }

}
