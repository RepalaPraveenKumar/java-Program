package advanced_concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueAtRunTime
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter the Size of your Array");
		int age[]=new int[s1.nextInt()];
		for(int i=0; i<=age.length-1; i++)
		{
			System.out.println("Please enter the value at Index " +i);
			age[i]=s1.nextInt();
		}
		s1.close();
		System.out.println("Array of the Given Index values ");
		System.out.println(Arrays.toString(age));
	}

}
