package nacodingquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Printing only not-repeated digits in the array.
 */
public class Program21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the count of digits");
        int count=scanner.nextInt();
        int[] intArray=new int[count];
        for(int i=0;i<count;i++){
            intArray[i]=scanner.nextInt();
        }
        Map<Integer, Long> collect = Arrays.stream(intArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        List<Integer> collect1 = collect.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
