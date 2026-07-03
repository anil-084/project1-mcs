package Example;

import java.util.function.BinaryOperator;

public class AdditionTwoNumbers {

    static void main() {
        BinaryOperator<Integer> add =  (a,b)->a+b;
        System.out.println(add.apply(10,20));

        Addition addition  =(a,b)->a+b;
        System.out.println(addition.add(10,20));
    }
}
