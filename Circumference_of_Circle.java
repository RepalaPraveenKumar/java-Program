package basicprogram;

import java.util.Scanner;
public class Circumference_of_Circle
{
	// Method to calculate circumference
    static double cir(double r)
    {
        return 2 * Math.PI * r;
    }
	public static void main(String[] args)
	{
		// Create a new Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the Circumference of the circle
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        // Calculate the Circumference of the circle using the formula: 2πr
        double Circumference = cir(r);
        
        // Print the Circumference of the circle
        System.out.println("The Circumference of the circle is: " + Circumference);

        // Close the Scanner object
        sc.close();
    
	}

}
