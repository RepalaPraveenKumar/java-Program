package advanced_concepts;

import java.util.Arrays;

public class String_ToCharArray //toCharArray Converts this string to a new character array.
{
	public static void main(String[] args)
	{
		String input="Praveen Kumar";
		char [] c1=input.toCharArray();
		for (int i=0; i<input.length(); i++)	
		{
			System.out.print(c1[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(c1));
	}

}
