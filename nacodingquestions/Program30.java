package nacodingquestions;

import java.util.Scanner;

/**
 * Check Armstrong number.
 * Armstrong number is a number that is equal to the sum of cubes of its digits
 */
public class Program30 {
    public static boolean checkArmstrong(int number){
        int temp=number;
        int sum=0;
        int remainder=0;
        int count=0;
        while(number>0){
            number=number/10;
            count++;
            System.out.println("The number of digits are "+count);
        }
        number=temp;
        while(number>0) {
            remainder=number%10;
            sum = (int) (sum + Math.pow(remainder, count));
            number=number/10;
        }
        System.out.println(sum);
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number or not");
        int number= scanner.nextInt();
        boolean isArmstrong=checkArmstrong(number);
        if(isArmstrong){
            System.out.println(number+" is an Armstrong number");
        }else{
            System.out.println(number+" is not an Armstrong number");
        }
    }
}
