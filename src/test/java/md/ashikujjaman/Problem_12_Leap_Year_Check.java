package md.ashikujjaman;
/*Problem 12: Leap Year Check
Given a year as input, use logical operators to determine if it is a leap year
(divisible by 4, but not 100 unless divisible by 400). Print "Leap" or "Not Leap".*/

import java.util.Scanner;
public class Problem_12_Leap_Year_Check {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Year: ");
        int year = scanner.nextInt();

        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap");
        }
        else
            System.out.println("Not Leap");

        scanner.close();
    }
}
