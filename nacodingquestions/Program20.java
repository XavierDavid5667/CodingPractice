package nacodingquestions;

import java.util.Scanner;

/**
 * Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
 */
public class Program20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the count of numbers");
        int count= scanner.nextInt();
        int[] intArray=new int[count];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.println("Enter the numbers");
        for(int i=0;i<count;i++){
            intArray[i]= scanner.nextInt();
        }
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]<min){
                min=intArray[i];
            }
            if(intArray[i]>max){
                max=intArray[i];
            }
        }
        System.out.println("Maximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);

    }
}
