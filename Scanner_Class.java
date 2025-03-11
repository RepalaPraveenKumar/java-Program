package basicprogram;
import java.util.Scanner;

public class Scanner_Class
{
	    public static void main(String[] args) {
	        // Create a new Scanner object to read from the keyboard
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter their name
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();

	        // Prompt the user to enter their age
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        // Print out the user's name and age
	        System.out.println("Hello, " + name + "! You are " + age + " years old.");

	        // Close the Scanner object
	        sc.close();
	    }
	
}
