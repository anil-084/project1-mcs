package Example;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = list.stream().filter(n -> n % 2 == 0)
                .map(m->m*m).toList();
        System.out.println(result);
    }
}
