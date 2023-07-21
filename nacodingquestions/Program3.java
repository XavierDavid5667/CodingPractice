package nacodingquestions;

import java.util.Scanner;

/**
 * Find the Power without using math.pow function.
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the power");
        int num= scanner.nextInt();
        System.out.println("Enter the power for the number");
        int pow= scanner.nextInt();
        int product=1;
        for(int i=1;i<=pow;i++){
            product=(product*num);
        }
        System.out.println("The result is "+product);

    }
}
