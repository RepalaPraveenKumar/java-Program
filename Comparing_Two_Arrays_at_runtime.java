package advanced_concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Comparing_Two_Arrays_at_runtime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of your subj1 Array ");
		int []subj1=new int[sc.nextInt()];
		for(int i=0; i<=subj1.length-1; i++)
		{
			System.out.println("Please enter subj1 of the value at index " + i);
			subj1[i]=sc.nextInt();
		}
		System.out.println("Please enter the size of your subj2 Array ");
		int []subj2=new int[sc.nextInt()];
		for(int i=0; i<subj2.length; i++)
		{
			System.out.println("Please enter the subj2 of the value at index " + i);
			subj2[i]=sc.nextInt();
		}
		sc.close();
		System.out.println();
		boolean b1=Arrays.equals(subj1, subj2);
		System.out.println(b1);
		if (b1==true)
		{
			System.out.print("Index values of the Given two Arrays are Equals to each other");
		}
		else
		{
			System.out.print("Index values of the Given two Arrays are Not equals to each other");
		}
		
	}

}
