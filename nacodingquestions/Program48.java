package nacodingquestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a Java program to count and print all the duplicates in the input string
 */
public class Program48 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scanner.nextLine();
        LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        List<Map.Entry<Character, Long>> collect1 = collect.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect1);
    }
}

