package nacodingquestions;

import java.util.Scanner;

/**
 * Write a program that reads a set of integers, and then prints the sum of the even and odd
 * integers
 */
public class Program17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total count of integers");
        int count=scanner.nextInt();
        int[] intArray=new int[count];
        int evenSum=0;
        int oddSum=0;
        for( int i=0;i<count;i++){
            intArray[i]=scanner.nextInt();
        }

        for(int i=0;i<intArray.length;i++){
            if(intArray[i]% 2==0){
                evenSum=evenSum+intArray[i];
            }else{
                oddSum=oddSum+intArray[i];
            }
        }
        System.out.println("Even sum = "+evenSum);
        System.out.println("Odd sum = "+oddSum);
    }
}
