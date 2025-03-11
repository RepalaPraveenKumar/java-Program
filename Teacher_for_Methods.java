package Package1;

public class Teacher_for_Methods //Using all Access specifiers within the Package for Methods
{
	static double a=Math.random();
	static double b=Math.random();
	public static void add()
	{
		double addition=(a+b);
		System.out.println(addition);
	}
	protected static void sub()
	{
		double subtraction=(a-b);
		System.out.println(subtraction);
	}
	static void mul()
	{
		double multiply=(a*b);
		System.out.println(multiply);
	}
	private static void div()
	{
		double division=(a/b);
		System.out.println(division);
	}
}
