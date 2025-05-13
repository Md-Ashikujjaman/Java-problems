package md.ashikujjaman;
/*Problem 14: Compound Interest
Given principal, rate, and time as inputs, calculate compound interest
using the formula A = P(1 + r/100)^t and print the amount rounded to two decimal places.*/

import java.util.Scanner;
public class Problem_14_Compound_Interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time: ");
        int time = scanner.nextInt();

        double interest = principal * Math.pow ((1 + rate / 100), time);
         double compoundInterest = interest - principal;
        System.out.printf("Compound interest after %d years is = %.2f\n", time, compoundInterest);

        scanner.close();
    }
}
