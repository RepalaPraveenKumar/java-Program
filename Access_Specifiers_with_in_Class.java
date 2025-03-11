package basicprogram;

public class Access_Specifiers_with_in_Class // Using all access specifiers with in the class for Methods
{
	static double a= Math.random();
	static double b= Math.random();
	
	public static void add()
	{
		 double addition = (a+b);
		 System.out.println("Addition of a and b is:       " + addition);
	}
	protected static void sub()
	{
		double subtraction =(a-b);
		System.out.println("Subtraction of a and b is:    " + subtraction);
	}
	static void mul()
	{
		double multiplication = (a*b);
		System.out.println("Multiplication of a and b is: " + multiplication);
	}
	private static void div()
	{
		double division = (a/b);
		System.out.println("Division of a and b is:       " + division);
	}
	public static void main(String[] args)
	{
		add();
		sub();
		//Access_Specifiers_with_in_Class aswc= new Access_Specifiers_with_in_Class();
		mul();
		div();
		
	}
}
