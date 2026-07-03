package Example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeros {

    static void main() {
       int[] numbers  ={1,2,0,3,4,5,0,6,6,72,0,3,4,5,0,6};
        System.out.println("Original Values"+Arrays.toString(numbers));
        movingtoZeros(numbers);
        System.out.println("Modified Values"+Arrays.toString(numbers));
        System.out.println("Stream Operations");
        int[] result =  IntStream.concat(Arrays.stream(numbers).filter(n->n!=0),
                Arrays.stream(numbers).filter(n->n==0)).toArray();
        System.out.println("Stream OutPut"+Arrays.toString(result));
    }

    private static void movingtoZeros(int[] numbers) {
        int count = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]!=0){
                numbers[count]=numbers[i];
                count++;
            }
        }
        while (count<numbers.length){
            numbers[count]=0;
            count++;
        }
    }
}
