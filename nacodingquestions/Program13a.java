package nacodingquestions;

import java.util.Scanner;

/**
 * Check whether the string is Anagram or not?
 */
public class Program13a {
    public static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] charCount1=new int[26];
        int[] charCount2=new int[26];
        for(char c:s1.toCharArray()){
            charCount1[c-'a']++;
        }
        for(char c: s2.toCharArray()){
            charCount2[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(charCount1[i]!=charCount2[i]){
                return false;
            }
        }
      return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1= scanner.next();
        System.out.println("Enter the second string");
        String str2=scanner.next();

        String newStr1=str1.replaceAll("[^a-zA-Z]","");
        String newStr2=str2.replaceAll("[^a-zA-Z]","");
        boolean isAnagrams=checkAnagram(newStr1,newStr2);
        if(isAnagrams){
            System.out.println("Both the strings are angrams");
        }else{
            System.out.println("Both the strings are not anagrams");
        }
    }
}
