package basicprogram;

public class Calling_Both_Static_n_NonStatic_in_MainMethod
{
	static void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	void mul()
	{
		int a=200;
		int b=400;
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		add();
		Calling_Both_Static_n_NonStatic_in_MainMethod cb=new Calling_Both_Static_n_NonStatic_in_MainMethod();
		cb.mul();
	}

}
