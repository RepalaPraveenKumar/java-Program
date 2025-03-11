package advanced_concepts;

import java.util.Arrays;

public class Problem_on_Annagram
{

	public static void main(String[] args)
	{
		String s1="listen";
		String s2="silent";
		if(s1.length() != s2.length())
		{
			System.out.println("Given Strings are not an Anagram");
		}
		else
		{
			char c1[]= s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting c1: " + Arrays.toString(c1));
			System.out.println("After sorting c2: " + Arrays.toString(c2));
			
			boolean b1=Arrays.equals(c1, c2);
			System.out.println(b1);
			
			if(b1==true)
			{
				System.out.println("Given Strings are an Anagram");
			}
			else
			{
				System.out.println("Given Strings are not an Anagram");
			}
		}
	}

}
