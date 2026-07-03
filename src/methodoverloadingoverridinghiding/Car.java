package methodoverloadingoverridinghiding;

import static java.lang.IO.println;

public class Car extends Vechical{


    public static void drive(){
        println("hello super");
    }

    public void test(){
        println("test car");
    }
}
