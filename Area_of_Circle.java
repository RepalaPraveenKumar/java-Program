package basicprogram;
import java.util.Scanner;
public class Area_of_Circle
{
       public static void main(String[] args)
       {
	        // Create a new Scanner object
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter the radius of the circle
	        System.out.print("Enter the radius of the circle: ");
	        double radius = sc.nextDouble();

	        // Calculate the area of the circle using the formula: πr^2
	        double area = Math.PI * Math.pow(radius, 2);

	        // Print the area of the circle
	        System.out.println("The area of the circle is: " + area);

	        // Close the Scanner object
	        sc.close();
	    }
}
