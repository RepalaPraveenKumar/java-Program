package basicprogram;

public class Calling_Static_Parameterized_Methods
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void mul(double a, int b)
	{
		double d=a*b;
		System.out.println(d);
	}
	static void name(String n, boolean b)
	{
		String a=n+b;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		add(40,50);
		mul(3.24,32);
		name("Praveen ", true);

	}

}
