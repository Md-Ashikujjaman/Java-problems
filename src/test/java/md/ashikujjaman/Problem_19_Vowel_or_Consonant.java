package md.ashikujjaman;
/*Problem 19: Vowel or Consonant
Take a character and use a switch statement to determine if it is a vowel (a, e, i, o, u).
Print "Vowel" or "Consonant".*/

import java.util.Scanner;
public class Problem_19_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single Character(a-z): ");
        char character = scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            switch (Character.toLowerCase(character)) {  // Convert to lowercase to simplify
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(character + " is Vowel");
                    break;
                default:
                    System.out.println(character + " is Consonant");
            }
        } else {
            System.out.println("Input a correct character.");
        }
            scanner.close();
        }

    }
