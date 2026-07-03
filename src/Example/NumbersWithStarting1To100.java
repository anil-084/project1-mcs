package Example;

import java.util.List;
import java.util.stream.IntStream;

public class NumbersWithStarting1To100 {
    static void main() {
        List<Integer> result = IntStream.rangeClosed(1,100)
                .boxed().filter(n->String.valueOf(n).startsWith("1")).toList();
//Step-by-Step Explanation
//IntStream.rangeClosed(1,100)
//
//Creates a stream of integers from 1 to 100 inclusive.
//
//So the stream is: 1, 2, 3, 4, ..., 100.
//
//.boxed()
//
//Converts the primitive int values into their wrapper class Integer.
//
//After this step, the stream is: Integer objects instead of int.
//
//.filter(n -> String.valueOf(n).startsWith("1"))
//
//For each number, it converts it to a String using String.valueOf(n).
//
//Then checks if the string starts with "1".
//
//Examples:
//
//String.valueOf(1) → "1" → starts with "1" ✅
//
//String.valueOf(12) → "12" → starts with "1" ✅
//
//String.valueOf(25) → "25" → does not start with "1" ❌
//
//So only numbers like 1, 10, 11, 12, ..., 19, 100 pass through.
//
//.toList()
//
//Collects the filtered stream into a List<Integer>.

        long count  = IntStream.rangeClosed(1,100).boxed().
                filter(n->String.valueOf(n).startsWith("1")).count();
        System.out.println(result);
        System.out.println(count);
    }
}
