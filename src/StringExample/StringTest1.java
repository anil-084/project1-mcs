package StringExample;

public class StringTest1 {

    static void main() {
        String str  ="Java";
        String str1= "Java";
        String str2 = new String("Java");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        System.out.println(str.equals(str2));
        System.out.println(str==str2);

    }
}
