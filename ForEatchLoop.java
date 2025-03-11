package advanced_concepts;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class ForEatchLoop
{
	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11223344, "praveen");
		m1.put(22334455, "narayana");
		m1.put(33445566, "madhava");
		m1.put(44556677, "madhusudhana");
		m1.put(88990011, "mukunda");
		
		System.out.println("Fetching Values");
		for(String s1: m1.values())
		{
			System.out.println(s1);
		}
		System.out.println("-----------------------");
		System.out.println("Fetching Keys");
		for(Integer i1: m1.keySet())
		{
			System.out.println(i1);
		}
		System.out.println("-----------------------");
		System.out.println("Fetching all Keys and values");
		for(Entry<Integer, String>e1: m1.entrySet())
		{
			System.out.println(e1);
		}
		
		
	}
}
