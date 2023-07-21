package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Program13b {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next().toLowerCase();
        String str2=scanner.next().toLowerCase();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        if(chars1.length==chars2.length){
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            if(Arrays.equals(chars1,chars2)){
                System.out.println("Both the strings are anagrams");
            }else {
                System.out.println("Both the strings are not anagrams");
            }
        }else{
            System.out.println("Both the strings should be equal in length");
        }
    }
}
