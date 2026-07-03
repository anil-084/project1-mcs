package Example;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateValues {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,3,2,4,1,6,3);

        Set<Integer> unique = new HashSet<>();

        Set<Integer> duplicates = list.stream()
                .filter(n-> Collections.frequency(list,n)>1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

        // Approach -2
        Set<Integer> duplicateNumbers = list.
                stream().filter(n->!unique.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicateNumbers);
    }
}
