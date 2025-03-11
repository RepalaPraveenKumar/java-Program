package advanced_concepts;
import java.util.Scanner;
public class ReverseString
{

	public static void main(String[] args)
	{
		// Create a new Scanner object to accept human input at the run time
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String input= sc.nextLine();
		
		String reverse=""; // Empty string to store the reversed result
		
		// Loop through the string from end to start
		for (int i=input.length()-1; i>=0; i--)
		{
			char c=input.charAt(i);
			reverse=reverse+c;      // Append each character to the new string
		}
		
		// Close the Scanner object
		sc.close();
		
		System.out.println("Reverse of the given String is: " + reverse);
	}

}


