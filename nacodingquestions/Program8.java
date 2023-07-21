package nacodingquestions;

import java.util.Scanner;

/**
 * Count the no of vowels and constants in a string
 */
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to find the count of vowels and consonant");
        String str=scanner.nextLine().toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)) {
                if (String.valueOf(c).matches("[aeiou]")) {
                    ;
                    vowelCount++;
                }else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of Vowels: "+vowelCount);
        System.out.println("Number of Consonant: "+consonantCount);


    }
}