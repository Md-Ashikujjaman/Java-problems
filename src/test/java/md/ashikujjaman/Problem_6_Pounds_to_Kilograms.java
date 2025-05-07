package md.ashikujjaman;
/*Problem 6: Pounds to Kilograms
Write a program that takes a weight in pounds as a double and converts it to kilograms
(1 pound = 0.453592 kg). Print the result with two decimal places.*/

import java.util.Scanner;
public class Problem_6_Pounds_to_Kilograms {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter a weight(Pounds): ");
        double weight = scanner.nextDouble();

        double weight_in_kg = weight * 0.453592; // Converts the weight from pounds to kilograms using the conversion factor.
        System.out.println("Weight is: " + weight_in_kg + "KG");
        scanner.close();
    }
}
