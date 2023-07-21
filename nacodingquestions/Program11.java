package nacodingquestions;

import java.util.Scanner;

/**
 * How to remove characters from the first String which are present in the second String?
 */
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("Enter the first string ");
        String string1=scanner.nextLine().toLowerCase();
        System.out.println("Enter the second string");
        String string2=scanner.nextLine().toLowerCase();
        String result=string1.replaceAll(string2,"");
        System.out.println(result);

    }
}
