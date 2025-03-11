package advanced_concepts;

import java.util.Vector;

public class Vector_Practice
{

	public static void main(String[] args)
	{
		Vector <Object>v1= new Vector<>();
		v1.add("madava");
		v1.add("madusudhana");
		v1.add(100);
		v1.add(10);
		v1.add(55.45);
		v1.add(0,"mukunda");
		v1.add('A');
		v1.add("Hello");
		// Displaying the collection
        System.out.println("Collection after adding elements: " + v1);

        // Checking if a specific element exists
        System.out.println("Does collection contain 'A'? " + v1.contains('A'));
        System.out.println("Does collection contain 100? " + v1.contains(100));

        // Removing an element
        v1.remove((Object) 10);  // Remove Integer 10
        v1.remove("Hello");      // Remove String "Hello"

        // Displaying the collection after removal
        System.out.println("Collection after removing elements: " + v1);

	}
	

}
