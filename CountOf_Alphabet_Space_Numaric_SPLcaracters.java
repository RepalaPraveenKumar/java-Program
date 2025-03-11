package advanced_concepts;

import java.util.Arrays;

public class CountOf_Alphabet_Space_Numaric_SPLcaracters
{

	public static void main(String[] args)
	{
		int count_of_alphabet=0;
		int count_of_int=0;
		int count_of_space=0;
		int count_of_SPLcaracter=0;
		String s1="praveen kumar @ 123*";
		char c1[] =s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<s1.length(); i++)
		{
			boolean b1=	Character.isAlphabetic(c1[i]);
			boolean b2= Character.isDigit(c1[i]);
			boolean b3= Character.isWhitespace(c1[i]);
			
				if(b1==true)
				{
					count_of_alphabet++;
				}
				if(b2==true)
				{
					count_of_int++;
				}
				if (b3==true)
				{
					count_of_space++;
				}
			count_of_SPLcaracter=s1.length()-(count_of_alphabet + count_of_int + count_of_space);
		}
		System.out.println("Count of Alphabet is: " + count_of_alphabet);
		System.out.println("Count of Digit is: " + count_of_int);
		System.out.println("Count of Space is: " + count_of_space );
		System.out.println("Count of SPLcaracter is: " + count_of_SPLcaracter);
	}

}
