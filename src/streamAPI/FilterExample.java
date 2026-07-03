package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    static void main() {
        List<String> names = Arrays.asList("John", "Sara", "Mark", "Jennifer", "Paul", "Jane");

        List result= names.stream().filter(n-> n.startsWith("J")).toList();
        System.out.println(result);
    }


}
