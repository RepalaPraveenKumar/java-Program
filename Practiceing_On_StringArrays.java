package advanced_concepts;

import java.util.Arrays;

public class Practiceing_On_StringArrays
{
	
	public static void main(String[] args)
	{
		/*int[] arr = {20, 50, 40, 30, 60};
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr)
        {
            if (num > firstMax)
            {
                secondMax = firstMax;
                firstMax = num;
            } 
            else if (num > secondMax && num != firstMax)
            {
                secondMax = num;
            }
        }
        */
/*
        if (secondMax == Integer.MIN_VALUE)
         {
            System.out.println("No second largest number found.");
         } 
         else 
         {
            System.out.println("The second largest number is: " + secondMax);
         }
         */
        int[] a = {20, 50, 40, 30, 60};

        Arrays.sort(a);
        System.out.println("The second largest number is: " + a[a.length - 2]);

	}

}
