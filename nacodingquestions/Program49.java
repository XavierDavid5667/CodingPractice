package nacodingquestions;

import java.util.Scanner;

/**
 * Write a Java program to check whether a given string starts with the contents of another string.
 */
public class Program49{
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter the first String");
                String s1=scanner.nextLine();
                System.out.println("Enter the second string");
                String s2=scanner.nextLine();
                if(s2.startsWith(s1)){
                        System.out.println("The second string starts with the contents of the first string");
                }
        }
}
