/*Problem 21: Grade Points
Take a score (0-100) and use if-else statements to assign grade points:
A=4, B=3, C=2, D=1, F=0. Print the grade point. */
package md.ashikujjaman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem_21_Grade_Points {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input score: ");
        int score = scanner.nextInt();

        if (score>=0 && score<=39){
            System.out.println("Grade point: F");
        }
        else if (score>=40 && score<=49){
            System.out.println("Grade point: D");
        }
        else if (score>=50 && score<=64){
            System.out.println("Grade point: C");
        }
        else if (score>=65 && score<=79){
            System.out.println("Grade point: B");
        }
        else if (score>=80 && score<=100){
            System.out.println("Grade point: A");
        }
        else System.out.println("This is wrong score. Input a valid score");
        scanner.close();

    }
}
