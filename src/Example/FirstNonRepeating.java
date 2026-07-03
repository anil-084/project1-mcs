package Example;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    static void main() {
        String input = "apple";

        Optional<Character> result = input.chars().mapToObj(n-> (char)n)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1)
                .map(entry -> entry.getKey()).findFirst();

        result.ifPresentOrElse(character -> System.out.println("First non-repeating character: " + character),
                ()-> System.out.println("No non-repeating character found"));








        /*Optional<Character> firstNonRepeating = input.chars().mapToObj(n->(char) n)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey()).findFirst();
        // Output results safely
        firstNonRepeating.ifPresentOrElse(
                ch -> System.out.println("First non-repeating character: " + ch),
                () -> System.out.println("No non-repeating character found.")
        );*/
    }
}
