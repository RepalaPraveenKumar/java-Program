package basicprogram;

import java.util.Scanner;

class Parent_A 
{
	static int a,b;
	static void add()
	{
		System.out.println(a+b);
	}
}
public class Inheritance extends Parent_A //Single level inheritance 
{
	static void sub()
	{
		System.out.println(a-b);
	}

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b value");
		b=sc.nextInt();
		
		System.out.print("The sum of a and b is: ");
		sub();
		add();
		
		sc.close();
	}

}
