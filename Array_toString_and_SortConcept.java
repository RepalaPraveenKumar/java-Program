package advanced_concepts;

import java.util.Arrays;

public class Array_toString_and_SortConcept
{
	public static void main(String[] args)
	{
		int[] age= new int[4];
		age[0]=42;
		age[1]=80;
		age[2]=25;
		age[3]=64;
		System.out.println(Arrays.toString(age));
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
	}
}