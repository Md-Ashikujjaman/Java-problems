/*Problem 22: Sum of Even Numbers
Take an integer n and calculate the sum of all even numbers from 1 to n using a for loop.
Print the sum.*/
package md.ashikujjaman;

import java.util.Scanner;

public class Problem_22_Sum_of_Even_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<= number; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Some of all even numbers up to" + number + "is: " + sum);
    }
}
