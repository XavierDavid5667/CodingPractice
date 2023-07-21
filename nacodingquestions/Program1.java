package nacodingquestions;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Check Two String which are reverse of each other or not
 */
public class Program1 {

    public static String stringReverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two string values");
        System.out.println("String1 : ");
        String string1 = scanner.next().toLowerCase();
        System.out.println("String2 : ");
        String string2 = scanner.next().toLowerCase();
        if (string1.length() == string2.length()) {
            String string3 = stringReverse(string2);
            if (string1.equals(string3)) {
                System.out.println("Both the strings are reverse of each other");
            }else{
                System.out.println("Both the strings are not the reverse of each other");
            }
        }else{
            System.out.println("Both the strings should be equal in length");
        }
    }
}
