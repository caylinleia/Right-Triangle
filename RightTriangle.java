import java.util.Scanner;

/**
 * Caylin Leia (Student ID: 261125917)
 */

public class RightTriangle {
    /**
     * This program will have a size input
     * and will determine print out a right triangle
     * that is greater than the size of 0
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner used to obtain the input of the size of the triangle
        System.out.println("Enter Size of Triangle: "); // Prints a prompt for the user to input a size
        int size = scan.nextInt(); // Integer used to return the size of the triangle
        if (size >= 0) { // Verifying to determine if the size of the triangle is >= 0
            printRightTriangle(size); // Prints the right triangle according to the size that was inputted
        } else {
            System.out.println("Error: Input value must be >= 0"); // Prints an error message if the size of the triangle is not >= 0
        }
        scan.close(); // Closes and ends the scanner
    }
    // Method to print a right triangle
    public static void printRightTriangle(int x) {
        for (int i = 1; i <= x; i++) { // Loop used to determine how many rows will be used for the triangle
            for (int j = 1; j <= 2 * (x - i); j++) { // Nested loop used to determine how many spaces to include on the left-hand side of the triangle
                System.out.print(" "); // Prints the exact amount of spaces in accordance to the inputted size of the triangle
            }
            for (int j = 1; j <= i; j++) { // Nested loop used to determine how many columns and stars to include on the right-hand side of the triangle
                System.out.print("* "); // Prints the exact amount of stars in accordance to the inputted size of the triangle
            }
            System.out.println(); // Proceeds to move on to the next row to continue printing the remainder of the triangle
        }
    }
}