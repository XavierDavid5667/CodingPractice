package nacodingquestions;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * How many times a particular character is repeated in a string
 */
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=scanner.next();
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

    }
}
