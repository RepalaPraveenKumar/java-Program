package advanced_concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Testcase2
{
    public static void main(String[] args)
    {
        Map<Integer, String> m1 = new HashMap<>();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter how many key-value pairs you want to enter:");
        int a = 0;

        // Validate the input for the number of pairs
        while (true)
        {
            try
            {
                a = Integer.parseInt(s1.nextLine());
                if (a <= 0)
                {
                    System.out.println("Please enter a positive number:");
                    continue;
                }
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Please enter a valid number:");
            }
        }

        for (int i = 0; i < a; i++)
        {
            while (true)
            {
                try
                {
                    System.out.println("Enter the key (integer):");
                    int key = Integer.parseInt(s1.nextLine());
                    System.out.println("Enter the value (string):");
                    String value = s1.nextLine();
                    m1.put(key, value);
                    break;
                } catch (NumberFormatException e)
                {
                    System.out.println("Invalid input. Please enter a valid integer for the key.");
                }
            }
        }

        System.out.println("The key-value pairs are: " + m1);
        s1.close();
    }
}
