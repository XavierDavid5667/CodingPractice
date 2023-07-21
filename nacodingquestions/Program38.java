package nacodingquestions;

import java.util.Scanner;

/**
 * Check if given string is Palindrome or not.
 */
public class Program38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string which has to be reversed");
        String str=scanner.next();
        System.out.println("The string before reversing "+str);
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("The string after reversing "+reverse);
    }
}
