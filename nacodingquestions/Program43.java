package nacodingquestions;

import java.util.Scanner;

/**
 * Write a Java program that keeps a number from the user and generates an integer between 1
 * and 7 and displays the name of the weekday.
 */
public class Program43 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num= scanner.nextInt();
        switch (num){
            case 1:
                System.out.println(num+ " Monday");
                break;
            case 2:
                System.out.println(num+" Tuesday");
                break;
            case 3:
                System.out.println(num+" Wednesday");
                break;
            case 4:
                System.out.println(num+" Thursday");
                break;
            case 5:
                System.out.println(num+" Friday");
                break;
            case 6:
                System.out.println(num+" Saturday");
                break;
            case 7:
                System.out.println(num+" Sunday");
                break;
            default:
                System.out.println("Enter a number between 1 and 7");
                break;
        }

    }
}
