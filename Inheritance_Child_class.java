package basicprogram;

import java.util.Scanner;

public class Inheritance_Child_class extends ParentClass//Multi level inheritance
{
	
	static void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a value");
		 a= sc.nextInt();
		System.out.println("Enter b value");
		 b= sc.nextInt();
		System.out.println("The sum of a and b is: ");
		add();
		sub();
		mul();
		sc.close();
	}
}	
class ParentClass extends GrandParentClass 
{
	//static int a,b;
	Scanner sc=new Scanner (System.in);
	static void sub()
	{
	System.out.println(a-b);
	}
}
	
class GrandParentClass 
{
	static int a,b;
	Scanner sc=new Scanner (System.in);
	static void mul()
	{
	System.out.println(a*b);
	}
}	
	

