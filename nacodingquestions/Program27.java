package nacodingquestions;

import java.util.Scanner;

/**
 * Find Prime number within a given range or between two numbers.
 */
public class Program27 {
    public static boolean checkPrime(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
               count++;
            }
        }
        if(count<=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        for (int i=num1;i<=num2;i++){
            boolean isPrime=checkPrime(i);
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
