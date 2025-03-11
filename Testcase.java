package advanced_concepts;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Testcase
{
	public static void main(String[] args)
	{
		Map<Integer, String> m1=new HashMap <Integer, String>();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter how many key value pairs you want to enter ");
		int a=s1.nextInt();
		try
		{
			for (int i=0; i<a; i++)
			{
				System.out.println("Enter the key and values");
				m1.put(s1.nextInt(), s1.next());
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Enter numaric values");
		}
		System.out.println(m1);
		s1.close();
	}

}
