package md.ashikujjaman;
/* Problem 4: Temperature Range Check
Take a double value representing a temperature in Celsius.
Check if it is within a valid range (-50 to 50). Print "Valid" or "Invalid".*/
import java.util.Scanner;

public class Problem_4_Temperature_Range_Check {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a temperature: ");
        double temp = scanner.nextDouble();

        if (temp <51 && temp> -51){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
        scanner.close();
    }
}
