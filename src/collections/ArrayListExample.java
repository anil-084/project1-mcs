package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    static void main() {
        List list = new ArrayList();
        list.add(1);
        list.add("A");
        list.add("hello");
        list.add(4);
        System.out.println(list.toString());
        list.remove(3);
        System.out.println(list.toString());
        list.add(3,6);
        list.add(99);
        System.out.println(list.toString());
    }
}
