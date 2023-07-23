package nacodingquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the array pairs whose sum is equal to the given number
 */
public class Program46 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        int[] intArray=new int[length];
        System.out.println("Enter the array");
        for(int i=0;i<length;i++){
            intArray[i]= scanner.nextInt();
        }
        System.out.println("Enter the sum");
        int sum=scanner.nextInt();

        System.out.println("The entered array is: "+ Arrays.toString(intArray));

        for(int i=0;i<intArray.length;i++){
            for(int j=i;j<intArray.length;j++){
                if(i==j){
                    continue;
                }
                if(intArray[i]+intArray[j]==sum){
                    System.out.println("("+i+","+j+")");
                }
            }
        }

    }
}
