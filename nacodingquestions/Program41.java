package nacodingquestions;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like right angle triangle with a number
 */
public class Program41 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= scanner.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
