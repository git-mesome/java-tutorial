package java_adv2.reflection;

import java_adv2.reflection.data.Team;
import java_adv2.reflection.data.User;

public class FieldV3 {

  public static void main(String[] args) {
    User user = new User("id1", null, null);
    Team team = new Team("team1", null);

    System.out.println("===== before =====");
    System.out.println("user = " + user);
    System.out.println("team = " + team);

    if (user.getName() == null) {
      user.setName("");
    }
    if (team.getName() == null) {
      team.setName("");
    }

    if (user.getAge() == null) {
      user.setAge(0);
    }

    System.out.println("===== after =====");
    System.out.println("user = " + user);
    System.out.println("team = " + team);


  }
}
