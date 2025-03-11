package basicprogram;

import java.util.Scanner;

public class Circumference_of_Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the side length of the Square: ");
		double a= sc.nextDouble();
		
		double Circumference = 4*a;
		
		System.out.println("The circumference (perimeter) of the Squar is: " + Circumference);
		
		sc.close();
	}
}
