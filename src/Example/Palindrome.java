package Example;

import java.util.stream.IntStream;

public class Palindrome {
    static void main() {
        String str="anil";
        String reverse  ="";
        for(int i =str.length()-1;i>=0;i--){
            reverse  =reverse+str.charAt(i);
        }


        if(str.equals(reverse))
            System.out.println("is palindrome");
        else System.out.println("is not palindrome");
        System.out.println(reverse);


        boolean isPalindrom = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(isPalindrom?"palindrome":"not palindrome");


        boolean result = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(result?"palindrome":"not palindrome");

        StringBuilder builder = new StringBuilder(str).reverse();
        if(str.equals(builder.toString()))
        System.out.println("hello");
        else System.out.println("hi");

    }
}
