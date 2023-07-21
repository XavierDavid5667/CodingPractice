package nacodingquestions;

import java.util.Scanner;

/**
 * Take 10 integers from keyboard using loop and print their average value on the screen
 */
public class Program16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] intArray=new int[10];
        for(int i=0;i<10;i++){
            intArray[i]= scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum=sum+intArray[i];
        }
        System.out.println("Average of 10 numbers is "+sum/10);

    }
}
