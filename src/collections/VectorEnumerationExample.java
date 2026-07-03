package collections;


import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationExample {
    static void main() {
        Vector vector=new Vector();
        for(int i=0;i<=10;i++){
            vector.addElement(i);
        }
        System.out.println(vector.toString());
         Enumeration enumeration =vector.elements();
        while (enumeration.hasMoreElements()){
            Integer i = (Integer) enumeration.nextElement();
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println(vector.toString());
    }
}
