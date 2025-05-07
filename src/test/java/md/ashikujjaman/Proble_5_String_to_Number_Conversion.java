package md.ashikujjaman;
/*Problem 5: String to Number Conversion
Take a string input that represents a number and convert it to an integer or double
based on whether it contains a decimal point.
Print the converted value.*/
import java.util.Scanner;

public class Proble_5_String_to_Number_Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string number :");
        String number = scanner.nextLine();

        if(number.contains(".")){
            // Checks if the input string 'number' contains a decimal point (".")

            double double_number = Double.parseDouble(number);
            // It attempts to parse the string into a double and stores it in 'int_number'.
            System.out.println("Double: " + double_number);
        }
        else {
            int int_number = Integer.parseInt(number);
            //It attempts to parse the string into an integer and stores it in 'int_number'.
            System.out.println("Integer: " + int_number);
        }
        scanner.close();
    }
}
