/*
Problem 20: Factorial Calculation
Take a non-negative integer n and calculate its factorial using a while loop. Print the result.
*/

package md.ashikujjaman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem_20_Factorial_Calculation {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else
            while (n != 0) {
                return n * factorial(n - 1);
            }
        return n;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        if (number >= 0){
            System.out.println("Factorial of " + number + " is: " + result);
        }
        else System.out.println("This is not a positive number.");
    }
}

