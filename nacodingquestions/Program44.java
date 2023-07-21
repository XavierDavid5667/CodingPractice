package nacodingquestions;

import java.util.Arrays;

/**
 * Write a Java program that checks if 2 array contains the same element.
 */
public class Program44 {
    public static void main(String[] args) {
        int[]intArray1=new int[]{1,2,3,4,5};
        int[] intArray2=new int[]{1,2,3,4,5};

        boolean equals = Arrays.equals(intArray1, intArray2);
        if(equals){
            System.out.println("Both the arrays are equal");
        }else {
            System.out.println("Both the array are not equal");
        }
    }
}
