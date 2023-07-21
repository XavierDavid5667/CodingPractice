package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAP to read a number (28156437) and it should print digits order wise(12345678)
 */
public class Program15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String string=new String(chars);
        System.out.println(string);

    }
}
