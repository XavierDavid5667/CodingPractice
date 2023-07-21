package nacodingquestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * Finding Prime Factors of a number
 */
public class Program26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        List<Integer>primeFactors=new ArrayList<>();
        //factors of the given number
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {       //checking if the remainder is zero
                primeFactors.add(i);
                num /= i;               //getting the quotient
            }
        }
        System.out.println(primeFactors);

    }
}
