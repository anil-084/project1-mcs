package Example;

import java.util.Arrays;
import java.util.List;

public class NumberStartWithOne {
    static void main() {
        List<Integer> numbers = Arrays.asList(13,22,34,18,145,101);
        List<Integer> result =numbers.stream().
                filter(n-> String.valueOf(n)
                        .startsWith("1")).toList();
        long count = numbers.stream().filter(n->String.valueOf(n).startsWith("1")).count();
        System.out.println(result);
        System.out.println(count);
    }
}
