package md.ashikujjaman;
/*
Problem 9: Kelvin to Celsius
Take a temperature in Kelvin as a double and convert it to Celsius (C = K - 273.15).
Print the result with two decimal places, ensuring it’s not below absolute zero.*/
import java.util.Scanner;
public class Problem_9_Kelvin_to_Celsius {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = (kelvin - 273.15);
        // Calculates Celsius from Kelvin using the conversion formula.

        if (celsius < -273.15) {
            // Checks if the calculated Celsius temperature is below absolute zero.
            System.out.println("Error: Temperature cannot be below absolute zero (-273.15°C).");
        } else {
            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        }

        scanner.close();
    }
}
