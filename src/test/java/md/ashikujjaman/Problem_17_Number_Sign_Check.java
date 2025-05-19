package md.ashikujjaman;
/*Problem 17: Number Sign Check
Take an integer as input and use an if statement to print "Positive", "Negative", or "Zero".*/

import java.util.Scanner;
public class Problem_17_Number_Sign_Check {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Negative");
        }
        else if (number > 0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
        scanner.close();
    }
}
