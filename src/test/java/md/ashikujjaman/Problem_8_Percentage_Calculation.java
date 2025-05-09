package md.ashikujjaman;
/*Problem 8: Percentage Calculation
Take a double value representing a score and a total possible score.
Calculate the percentage and print it rounded to one decimal place.*/

import java.util.Scanner;
public class Problem_8_Percentage_Calculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score number: ");
        double score = scanner.nextDouble();
        System.out.println("Enter total score number: ");
        double possibleScore = scanner.nextDouble();

        double percentage = (score / possibleScore) * 100;
        // Calculates the percentage by dividing the score by the possible score and multiplying by 100.
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();


    }
}
