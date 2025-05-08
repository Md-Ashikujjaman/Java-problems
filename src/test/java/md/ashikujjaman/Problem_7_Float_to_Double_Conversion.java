package md.ashikujjaman;
/*Problem 7: Float to Double Conversion
Take a float value as input and convert it to a double.
Print both values to demonstrate precision retention.*/
import java.util.Scanner;
public class Problem_7_Float_to_Double_Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a float number: ");
        float float_number = scanner.nextFloat();

        double double_number = float_number;

        System.out.println("Float number is " + float_number);
        System.out.println("Double number is " + double_number);

        scanner.close();
    }
}
