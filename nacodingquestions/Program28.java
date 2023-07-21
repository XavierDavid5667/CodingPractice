package nacodingquestions;

import java.util.Scanner;

/**
 * Find Strong number
 * Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
 */
public class Program28 {
    public static boolean checkStrong(int num){
        int temp=num;
        int remainder=0;
        int sum=0;
        while(num>0){
            remainder=num%10;
            int fact=1;
            for(int i=1;i<=remainder;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        boolean isStrong=checkStrong(num);
        if(isStrong){
            System.out.println(num+" is a strong number");
        }else{
            System.out.println(num+" is not a strong number");
        }
    }
}
