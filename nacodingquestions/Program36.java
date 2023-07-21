package nacodingquestions;

import java.util.Scanner;

/**
 * Find length of string without using function.
 */
public class Program36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        int count=0;
        String str=scanner.next();
        char[] chars = str.toCharArray();
        for(char c:chars){
            count++;
        }
        System.out.println("The length of the string is "+count);


    }
}
