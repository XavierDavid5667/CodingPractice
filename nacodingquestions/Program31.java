package nacodingquestions;

import java.util.Scanner;

/**
 * Armstrong number in given range.
 */
public class Program31 {
    public static boolean checkArmstrong(int number){
        int temp=number;
        int sum=0;
        int remainder=0;
        int count=0;
        while(number>0){
            number=number/10;
            count++;
           // System.out.println("The number of digits are "+count);
        }
        number=temp;
        while(number>0) {
            remainder=number%10;
            sum = (int) (sum + Math.pow(remainder, count));
            number=number/10;
        }
       // System.out.println(sum);
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("The first number and second number should be a two digit number");
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        System.out.println("Armstrong number in the given range is ");
        for(int i=num1;i<=num2;i++){
            boolean isArmsStrong=checkArmstrong(i);
            if (isArmsStrong){
                System.out.println(i);
            }
        }
    }
}
