package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAP to read name (program) and print letters in ascending order (agmoprr)
 */
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next().toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String string = new String(chars);
        System.out.println(string);


    }

}
