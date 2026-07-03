package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void main() {
        List list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        Iterator lit= list.iterator();
        while (lit.hasNext()){
            Integer integer = (Integer) lit.next();
            if(integer%2==0){
                System.out.println(integer);
            }else lit.remove();

        }
        System.out.println(list);

    }
}
