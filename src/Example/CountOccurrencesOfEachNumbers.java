package Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesOfEachNumbers {
    static void main() {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,3,2,4,1,6,3);

        Map<Integer,Long> result=list.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

//        list.stream()
//
//Converts your list (which is a List<Integer>) into a stream so you can process its elements in a functional style.
//
//Collectors.groupingBy(Function.identity(), Collectors.counting())
//
//This is the heart of the logic. It tells Java how to collect the stream elements into a Map.
//
//Function.identity()
//
//Means: use the element itself as the key in the map.
//
//Example: if the element is 10, the key will be 10.
//
//Collectors.counting()
//
//For each key, count how many times it appears in the stream.
//
//So the value in the map is the frequency of that number.
//
//Result
//
//The final result is a Map<Integer, Long> where:
//
//Key = Integer from the list
//
//Value = Count of occurrences of that integer
//
//System.out.println(result)
//
//Prints the map in {key=value, key=value, ...} format.

    }
}
