package basicprogram;

import java.util.Scanner;

public class Area_of_Triangle
{
	public static void main(String[] args)
	{
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

	    // Prompt the user to enter base and height
	    System.out.print("Enter the base of the triangle: ");
	    double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
