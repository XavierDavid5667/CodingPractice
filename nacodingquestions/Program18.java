package nacodingquestions;

import java.util.Scanner;

/**
 * Determine and print the number of times the character ‘a’ appears in the input entered by the
 * user.
 */
public class Program18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scanner.nextLine().toLowerCase();
        int count=0;
        for(char c:str.toCharArray()){
            if(c=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
