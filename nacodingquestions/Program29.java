package nacodingquestions;

import java.util.Scanner;

/**
 * Find Perfect number
 *Perfect numbers in math are the numbers (positive integers) that can be expressed as the
 * sum of their factors (excluding the number itself).
 */
public class Program29 {
    public static boolean checkPerfect(int number){
        int sumOfFactors=0;
        for(int i=1;i<number;i++){
            if(number%i ==0){
                sumOfFactors=sumOfFactors+i;
            }
        }
        if(number==sumOfFactors){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check if it is perfect or not");
        int num=scanner.nextInt();
        if(num>0) {
            boolean isPerfect = checkPerfect(num);
            if(isPerfect){
                System.out.println(num+" is a perfect number");
            }else{
                System.out.println(num+" is not a perfect number");
            }
        }else{
            System.out.println("Enter positive numbers only");
        }
    }
}
