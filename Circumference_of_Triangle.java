package basicprogram;

import java.util.Scanner;

public class Circumference_of_Triangle
{
	public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangle
        System.out.print("Enter the first side of the triangle: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double c = scanner.nextDouble();

        // Calculate the circumference of the triangle
        double circumference = a + b + c;

        // Display the result
        System.out.println("The circumference (perimeter) of the triangle is: " + circumference);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
