package Package1;

public class Public_AccessSpecifier_for_Class //Public class - Accessing within the same package
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
