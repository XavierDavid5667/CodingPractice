package nacodingquestions;

import java.util.Scanner;

/**
 * Write a Java program to check whether the first two characters present at the end
 * of a given string.
 */
public class Program42 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the given string");
        String str = scanner.next();
        String substring = str.substring(0, 2);
       if(str.endsWith(substring)){
           System.out.println("The string ends with the first two characters");
       }else{
           System.out.println("The string does not end with the first two characters");
       }
    }
}
