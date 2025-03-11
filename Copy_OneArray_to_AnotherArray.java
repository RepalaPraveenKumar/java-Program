package advanced_concepts;

import java.util.Arrays;

public class Copy_OneArray_to_AnotherArray
{

	public static void main(String[] args)
	{
		int subj1[]= new int[4];
		subj1[0]=45;
		subj1[1]=25;
		subj1[2]=85;
		subj1[3]=65;
		int subj2[]=new int[subj1.length];
		for(int i=0; i<subj1.length; i++)
		{
			subj2[i]=subj1[i];
			
		}
		System.out.println("Input Array: " + Arrays.toString(subj1));
		System.out.println("Copied Array: "+ Arrays.toString(subj2));
	}

}