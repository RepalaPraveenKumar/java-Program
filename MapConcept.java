package advanced_concepts;

import java.util.HashMap;
import java.util.Map;

public class MapConcept
{

	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11223344, "praveen");
		m1.put(22334455, "naveen");
		m1.put(33445566, "madhava");
		m1.put(44556677, "madhusudhana");
		m1.put(55667788, "srinivasa");
		m1.put(66778899, "govinda");
		m1.put(77889900, null);
		System.out.println(m1);
		
		m1.putIfAbsent(77889900, "venkataramana");
		System.out.println(m1);
		
		String s1=m1.get(33445566);
		System.out.println(s1);
		
		boolean b1=m1.containsKey(22334455);
		System.out.println(b1);
		
		boolean b2= m1.containsValue("madhava");
		System.out.println(b2);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(11223344, "praveen");
		m2.put(22334455, "naveen");
		m2.put(33445566, "madhava");
		m2.put(44556677, "madhusudhana");
		
		boolean b3=m1.equals(m2);
		System.out.println(b3);
		
	}

}
