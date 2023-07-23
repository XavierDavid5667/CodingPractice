package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Write a Java program to divide a string in n equal parts.
 */
public class Program47 {
    public static String[] stringEqualDivision(String str,int length,int valueToDivide){
        String[] stringArray=new String[valueToDivide];
        int tmp=0,chars=length/valueToDivide;
        if(length % valueToDivide!=0){
            System.out.println("The given string cannnot be divide into "+valueToDivide+" equal parts");
            return null;
        }else {
            for(int i=0;i<str.length();i=i+chars){
                stringArray[tmp]=str.substring(i,i+chars);
                tmp++;
            }
        }
        return stringArray;


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scanner.nextLine();
        int length=str.length();
        System.out.println("Enter the value to divide the string into equal parts");
        int valueToDivide=scanner.nextInt();
        String[] strings = stringEqualDivision(str, length, valueToDivide);
        System.out.println(Arrays.toString(strings));


    }
}
