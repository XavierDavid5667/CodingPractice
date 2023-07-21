package nacodingquestions;

import java.util.Scanner;

/**
 * Find the negative Power without using math.pow function
 */
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the power");
        int num= scanner.nextInt();
        System.out.println("Enter the power for the number");
        int pow= scanner.nextInt();
        int positivePower=-(pow);
        double product=1.0;
        for(int i=1;i<=positivePower;i++){
            product=(product*num);
        }
        System.out.println(product);
        double result=(1/product);
        System.out.println(result);
        System.out.println("The negative power is %.2d "+result);

    }
}
