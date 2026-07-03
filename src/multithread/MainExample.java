package multithread;

public class MainExample {
    static void main() {
        Example example =new Example();
        example.run();

        for(int i=0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}
