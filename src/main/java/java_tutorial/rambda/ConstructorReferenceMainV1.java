package java_tutorial.rambda;

public class ConstructorReferenceMainV1 {

  public static void main(String[] args) {
    PersonV5 person = new PersonV5();

    Member member1 = person.getMember1(Member::new);
    System.out.println("member1 = " + member1);

    Member member2 = person.getMember2(Member::new);
    System.out.println("member2 = " + member2);
  }

}
