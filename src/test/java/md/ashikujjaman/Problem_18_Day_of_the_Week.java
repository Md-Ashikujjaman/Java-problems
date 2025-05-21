package md.ashikujjaman;
/*Problem 18: Day of the Week
Take an integer (1-7) and use a switch statement to print the corresponding day of the week (1 = Monday, 7 = Sunday).*/
import java.util.Scanner;
public class Problem_18_Day_of_the_Week {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Take an integer (1-7): ");
        int day = scanner.nextInt();

        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
        }
        System.out.println("Day of the week is " + dayName);
        scanner.close();

    }
}
