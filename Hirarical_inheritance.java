package basicprogram;
class Parent_Super_class //Hierarchical inheritance concept
{
	double a= Math.random();
	double b= Math.random();
	double c= Math.random();
}

class Subclass_1 extends Parent_Super_class
{
	void add()
	{
		System.out.println("Value of a is ");
		System.out.println(a);
		System.out.println("Value of b is ");
		System.out.println(b);
		System.out.println("Value of c is ");
		System.out.println(c);
		System.out.println("----------------------");
		// Calculate the sum of a, b, c values
		double Addition= (a+b+c);
		
		// Display the result
		System.out.println("The Addition of a, b, c value is: " + Addition);
	}
}

class Subclass_2 extends Parent_Super_class
{
	static void sub()
	{
		// Calculate the subtraction of a, b, c values
		Subclass_2 Hi=new Subclass_2();
		double subtraction= (Hi.a-(Hi.b-Hi.c));
		
		// Display the result
		System.out.println("The subtraction of a, b, c value is: " + subtraction);
	}
}

class Subclass_3 extends Parent_Super_class
{
	static void mul()
	{
		//calculating the Multiplication of a, b, c values
		Subclass_3 Hi=new Subclass_3();
		double Multiplication = ((Hi.a*Hi.b)*Hi.c);
		
		// Display the result
		System.out.println("The Multiplication of a, b, c value is "+ Multiplication);
	}
}

public class Hirarical_inheritance
{
	public static void main(String[] args)
	{
		Subclass_1 Hi=new Subclass_1();
		Hi.add();
		System.out.println("----------------------");
		Subclass_2.sub();
		System.out.println("----------------------");
		Subclass_3.mul();
	}
	
	
}
