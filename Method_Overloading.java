package basicprogram;

public class Method_Overloading
{
	static void add(int a, int b)
	{
		System.out.println("output 1");
	}
	static void add(int a, double b)
	{
		System.out.println("Output 2");
	}
	void add(double a, int b)
	{
		System.out.println("Output 3");
	}
	void add (char a, boolean b)
	{
		System.out.println("Output 4");
	}
	public static void main(String[] args)
	{
		add(3,6);
		add(5,4.5);
		Method_Overloading mo=new Method_Overloading ();
		mo.add(3.5,8);
		mo.add('M', true);
		
	}
}
