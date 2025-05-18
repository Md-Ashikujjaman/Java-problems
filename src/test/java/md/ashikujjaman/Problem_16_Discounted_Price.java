/*Problem 16: Discounted Price
Given a product price and a discount percentage,
calculate the final price after discount using arithmetic operators.
Print the result with two decimal places.*/
package md.ashikujjaman;
import java.util.Scanner;
public class Problem_16_Discounted_Price {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Price: ");
        float ProductPrice = scanner.nextFloat();
        System.out.println("Enter Discount Percentage: ");
        int Percentage = scanner.nextInt();

        float DiscountPrice = (Percentage * ProductPrice) / 100;
        float FinalPrice = ProductPrice - DiscountPrice;

        System.out.printf("Final Price After Discount: %.2f\n", FinalPrice);
        scanner.close();

    }
}
