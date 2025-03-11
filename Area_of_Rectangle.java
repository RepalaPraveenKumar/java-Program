package basicprogram;

import java.util.Scanner;

public class Area_of_Rectangle
{
	public static void main(String[] args)
	{
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

	// Prompt the user to enter length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

	System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

	// Calculate area of the Rectangle
        double area = length * width;

	// Display the result
        System.out.println("The area of the Rectangle is: " + area);

	// Close the scanner to prevent resource leak
        scanner.close();
	}   
}
