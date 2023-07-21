package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Printing Second largest no. in the array.
 */
public class Program22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the count of the number of elements");
        int count=scanner.nextInt();
        int[] intArray=new int[count];
        for(int i=0;i<count;i++){
            intArray[i]= scanner.nextInt();
        }
        Arrays.sort(intArray);
        System.out.println("The second largest element in the array is "+intArray[intArray.length-2]);

    }
}
