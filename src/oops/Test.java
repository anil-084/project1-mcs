package oops;

public class Test {
    static void main() {
        Parent parent= new Parent();
        parent.methodOne();
        Parent parent1 = new Child();
        parent1.methodOne();
        Child child = new Child();
        child.methodOne();
        child.methodTwo();
       /* Child child1 = new Parent();
        child1.methodTwo();*/

        Parent parent2  =new Parent();
        parent2.property();
        parent2.marry();
        Parent parent3  =new Child();
        parent3.property();
        parent3.marry();
        Child child1= new Child();
        child1.property();
        child1.marry();

    }
}
