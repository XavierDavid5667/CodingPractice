package nacodingquestions;

import java.util.Scanner;

/**
 * . Remove Spaces from string.
 */
public class Program37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= scanner.nextLine();
        System.out.println("Before removing the spaces "+str);
        String str2=str.replaceAll("\\s","");
        System.out.println("After removing all the spaces "+str2);

    }
}
