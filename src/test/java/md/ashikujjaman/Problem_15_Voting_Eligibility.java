package md.ashikujjaman;
/*Problem 15: Voting Eligibility
Take age and citizenship status (true/false) as inputs.
Use logical operators to determine if the person is eligible to vote (age >= 18 and citizen). Print "Eligible" or "Not Eligible"*/

import java.util.Scanner;
public class Problem_15_Voting_Eligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter citizenship status (true/false): ");
        boolean citizen = scanner.nextBoolean();

        if(age >= 18 && citizen){
            System.out.println("Eligible");
        }
        else
            System.out.println("Not Eligible");

        scanner.close();
    }
}
