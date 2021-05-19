import generics.MyCustomList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hi Software Design - Exercises");
    MyCustomList<String> list1 = new MyCustomList<>();
    list1.add("a");
    list1.add("b");
    list1.addFirst("c");
    list1.addLast("d");
    list1.addFirst("e");
    list1.print();
    
    MyCustomList<Integer> list2 = new MyCustomList<>();
    list2.add(1);
    list2.addFirst(2);
    list2.addLast(0);
    list2.print();
    
    MyCustomList<Boolean> list3 = new MyCustomList<>();
    list3.add(true);
    list3.addFirst(false);
    list3.addLast(false);
    list3.print();
    
    MyCustomList<String> list4 = new MyCustomList<>();
    list4.add("x");
    list4.addFirst("y");
    list4.addLast("z");
    list4.print();
  }
}
