package basicprogram;

import java.util.Scanner;

public class Problem_On_Scanner
{
	static void add (int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int c, int d)
	{
		int sub=c-d;
		System.out.println(sub);
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Static Value a Hear");
		int a=		s1.nextInt();
		System.out.println("Enter Static Value b Hear");
		int b= s1.nextInt();
		System.out.print("Static Output value is = ");
		add(a,b);
		System.out.println("Enter Non Static value a Hear");
		int c= s1.nextInt();
		System.out.println("Enter Non Static value b Hear");
		int d= s1.nextInt();
		Problem_On_Scanner s2=new Problem_On_Scanner();
		System.out.print("NonStatic Output value is = ");
		s2.sub(c,d);
		s1.close();
	}

}
