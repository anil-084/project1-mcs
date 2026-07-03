package collections;

import java.util.LinkedList;

public class LinkedListExample {
    static void main() {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add("durga");
        list.add(4);
        list.add(null);
        list.add("durga");
        list.add(0,"software");
        list.add(0,"venky");
        list.removeLast();
        list.addFirst("ccc");
        System.out.println(list.toString());
    }
}
