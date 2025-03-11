package basicprogram;

import java.util.Random;
import java.util.Vector;

public class ForPractice_Test1
{
	 public static void main(String[] args)
	 {
		Vector<String> v1 = new Vector<String>();
		v1.add("kumar");
		v1.add("raj");
		v1.add(0, "kishan");
		
		Vector<String> v2 = new Vector<String>(); 
		v2.add("kanaya");
		v2.add("Govardhan");
		v2.add("mukunda");
		v2.add("murari");
		v2.add(null);
		//System.out.println(v1.get(2));
	
		v1.addAll(0,v2);
		
		v1.remove(4);
//		Vector<String> v3=new Vector<String>();
//		v3.add("murari");
//		v3.add("mukunda");
		v1.set(6, "Praveen");
		//v1.removeAll(v2);
		System.out.println(v1);
		//v1.clear();
		System.out.println(v1.indexOf("Praveen"));
		//System.out.println(v1.contains("kanaya"));
		//System.out.println(v1.containsAll(v3));
		//System.out.println(v1.capacity());
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		System.out.println(v1.size());
	}
}
