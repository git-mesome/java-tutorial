package java_tutorial.collection.array;

public class MyArrayListV3Main {
  public static void main(String[] args) {
    MyArrayListV3 list = new MyArrayListV3();
    System.out.println(list);
    list.add("a");
    list.add("b");
    list.add("c");
    System.out.println("addLast");
    list.add(3, "addLast");
    System.out.println(list);
    System.out.println("addFirst");
    list.add(0, "addFirst");
    System.out.println(list);
    Object removed1 = list.remove(4);
    System.out.println("removed(4) = " + removed1); // O(1)
    System.out.println(list);

    Object removed2 = list.remove(0);
    System.out.println("removed(0) = " + removed2); // O(n)
    System.out.println(list);
  }
}
