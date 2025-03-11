package basicprogram;

import java.util.Scanner;// Import Scanner class

public class Area_of_Square
{
	public static void main(String[] args)
	{
		// Create Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		//user to enter the side length of the square
		System.out.println("Enter the side length of the Square: ");
		double a= sc.nextDouble();
		
		// Calculate area of the Square
		double area=a*a;
		
		// Display the result
		System.out.println("Area of the Square is: " + area);
		
		// Close the scanner to prevent resource leak
		sc.close();
	}
}
