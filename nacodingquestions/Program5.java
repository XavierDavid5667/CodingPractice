package nacodingquestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find the unique Character in the String
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=scanner.next();
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        List<Map.Entry<Character, Long>> collect1 = collect.entrySet().stream().filter(entry -> entry.getValue() == 1).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
