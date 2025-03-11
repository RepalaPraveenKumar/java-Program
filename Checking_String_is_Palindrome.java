package advanced_concepts;

public class Checking_String_is_Palindrome
{

	public static void main(String[] args)
	{
		String input="anayana";
		String reverse="";
		for(int i= input.length()-1; i>=0; i--)
		{
			char c=input.charAt(i);
			reverse=reverse + c;
		}
		System.out.println("The Given word is: " + input);
		System.out.println("Reverse of the given word is: " + reverse);
		System.out.println();
		if (input.equals(reverse))
		{
			System.out.println("Given word is Palindrom");
		}
		else
		{
			System.out.println("Given word is Not Palindrom");
		}
	}

}
