package md.ashikujjaman;
/*Problem 13: Largest of Three Numbers
Take three integers as input and use relational operators to find and print the largest number.*/

import java.util.Scanner;
public class Problem_13_Largest_of_Three_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second integer number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third integer number: ");
        int thirdNumber = scanner.nextInt();

        if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println(firstNumber + " is the largest number.");
        }
        else if (secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " is the largest number.");
        }
        else
            System.out.println(thirdNumber + " is the largest number.");
        scanner.close();
    }
}
