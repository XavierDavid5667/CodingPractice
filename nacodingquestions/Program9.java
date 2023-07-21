package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Convert a String into integer?
 */
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str= scanner.nextLine();
        Integer integer = Integer.valueOf(str);
        System.out.println("Using valueOf() "+integer);
        int i = Integer.parseInt(str);
        System.out.println("Using parseInt() "+i);

        System.out.println("Enter the string to convert it to a integer array");
        String stringInput=scanner.next();
        char[] chars = stringInput.toCharArray();
        int[] intArray=new int[chars.length];
        for(int j=0;j< chars.length;j++){
            intArray[j]=(int)chars[j];
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(intArray));




    }
}
