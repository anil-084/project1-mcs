package Example;

import java.util.Arrays;
import java.util.List;

public class ODDNumbers {
    static void main() {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        List<Integer> result = numbers.stream().filter(n-> n%2 != 0).toList();
        System.out.println(result);
    }
}
