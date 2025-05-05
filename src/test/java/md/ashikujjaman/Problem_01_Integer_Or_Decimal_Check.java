package md.ashikujjaman;

/* Write a program that takes a number as input and determines if it is an integer or a decimal number.
Print "Integer" or "Decimal" accordingly. */

import java.util.Scanner;

public class Problem_01_Integer_Or_Decimal_Check {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a nimber: ");
        double number = scanner.nextDouble();

        if (number == Math.floor(number)){ /*Math.floor(number), This function converts
        any decimal number to the nearest lower integer by removing the decimal part.*/
            System.out.println(number + " is an integer number.");
        }
        else{
            System.out.println(number + " is a decimal number.");
        }
    }
    
}
