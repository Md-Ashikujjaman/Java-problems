package md.ashikujjaman;
/*Problem 10: Even or Odd
Take an integer as input and use the modulo operator to determine if it is even or odd.
Print "Even" or "Odd".*/

import java.util.Scanner;
public class Problem_10_Even_or_Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is Even.");
        }
        else
            System.out.println(number + " is Odd.");

        scanner.close();
    }
}
