package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

    static void main() {
        LinkedList list = new LinkedList();

        list.add("balla");
        list.add("vemki");
        list.add("chriu");
        list.add("anil");
        list.add("siri");
        System.out.println(list);
        ListIterator listIterator= list.listIterator();
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            System.out.println(str);
            if(str.equals("venki")){
                listIterator.remove();
            }else if(str.equals("anil")){
                listIterator.remove();
            }else if(str.equals("siri")){
                listIterator.add("Suvi");
            }
        }
        System.out.println(list);

    }
}
