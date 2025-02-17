package com.example.java_tutorial.collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

  private String id;

  public MemberOnlyHash(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public int hashCode() {
    //    return Objects.hashCode(id);
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "MemberOnlyHash{" + "id='" + id + '\'' + '}';
  }
}
