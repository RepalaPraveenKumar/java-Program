package advanced_concepts;

import java.util.Arrays;
import java.util.Random;

public class Copy_OneArray_to_Another_in_reverseOrder
{

	public static void main(String[] args)
	{
		int array[]=new int[5];
		Random r1 = new Random();
		for (int i = 0; i < array.length; i++)
		{
			array[i] = r1.nextInt(100) + 1; // Generates numbers between 1 and 100
		} 
		
		int reverse[ ]=new int[array.length];
		for(int i=0,j=array.length-1; i<array.length; i++,j--)
		{
			reverse[j]=array[i];
		}
		System.out.println("Input Array:  "+ Arrays.toString(array));
		System.out.println("Reverse Array: "+Arrays.toString(reverse));
	}

}
