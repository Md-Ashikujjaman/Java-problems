package md.ashikujjaman;
/* Problem 3: Boolean Opposite
Write a program that takes a boolean value as input (true/false) and prints its opposite value. */
import java.util.Scanner;  // Importing the Scanner class to enable user input
public class Problem_3_Boolean_Opposite {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Creating a Scanner object, which will be used to take input from the keyboard

        System.out.println("Input a boolean value (true/false): ");
        boolean input = scanner.nextBoolean();
        // Taking boolean input (true or false) from the user

        System.out.println("Opposite value of input is: " + !input);
        // !input means "not input" => if true, it will return false; and if false, it will return true

        scanner.close(); // Closing the Scanner object
    }
}
