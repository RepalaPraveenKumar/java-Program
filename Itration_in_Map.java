package advanced_concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Itration_in_Map
{

	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11223344, "praveen");
		m1.put(22334455, "narayana");
		m1.put(33445566, "madhava");
		m1.put(44556677, "madhusudhana");
		m1.put(88990011, "mukunda");
		
		System.out.println("Iteration using Iterator");
		Set <Entry <Integer, String>> s1= m1.entrySet();
		
		Iterator <Entry <Integer, String>> s2=s1.iterator();
		while (s2.hasNext())
		{
			System.out.println(s2.next());
		}
	}

}
