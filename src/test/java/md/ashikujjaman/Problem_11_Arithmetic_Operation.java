package md.ashikujjaman;
/*Problem 11: Arithmetic Operation
Take two integers and a character (+, -, *, /) as input.
Perform the specified arithmetic operation and print the result.*/

import java.util.Scanner;
public class Problem_11_Arithmetic_Operation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter Operation: ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation){
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                else
                    System.out.println("Error: Division by zero is not allowed.");

                break;

            default:
                System.out.println("Error: Invalid Operation.");
        }
        scanner.close();

    }
}
