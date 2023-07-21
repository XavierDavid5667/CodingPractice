package nacodingquestions;

import java.util.Scanner;

/**
 * Capitalize the first and last character of each word of String
 */
public class Program39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder();
        String[] split = str.split("\\s+");
        for(String s:split){
            char c=Character.toUpperCase(s.charAt(0));
            char c1 = Character.toUpperCase(s.charAt(s.length() - 1));
            stringBuilder.append(c).append(s.substring(1,s.length()-1)).append(c1);
            stringBuilder.append(" ");
        }
        String resultant = stringBuilder.toString().trim();
        System.out.println(resultant);

    }
}
