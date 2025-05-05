/*Problem 2: Area of a Circle
Calculate the area of a circle given its radius as a double.
Use the formula A = π * r² and output the result with two decimal places.*/

package md.ashikujjaman;
import java.util.Scanner;
public class Problem_2_Aria_of_Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a radius number: ");
        double redius = scanner.nextDouble();

        double circle = Math.PI * Math.pow(redius,2); //Calculate  A = π * r²

        System.out.printf("The area of the circle is: %.2f\n", + circle);
        // output the result with two decimal.
        scanner.close();
    }
}
