package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {
    static void main() {
        List<String > language  = Arrays.asList("Java", "Python", "JavaScript", "C++");
        System.out.println("Languages which starts with 'J':");
       // filterMethod(language,(str) -> str.startsWith("J"));
        List<String> data = language.stream().filter(s -> s.startsWith("J")).toList();
        System.out.println(data);
    }

    private static void filterMethod(List<String> language, Predicate<String> condition) {
        for(String name:language){
            if(condition.test(name)){
                System.out.println(name + " ");
            }
        }
    }
}
