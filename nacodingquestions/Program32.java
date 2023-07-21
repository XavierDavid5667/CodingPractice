package nacodingquestions;

import java.util.Scanner;

/**
 * Calculate the number of digits in an integer
 */
public class Program32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("The number of digits are "+count);
    }
}
