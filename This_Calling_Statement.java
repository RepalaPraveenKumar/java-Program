package basicprogram;

public class This_Calling_Statement
{
	This_Calling_Statement()
	{
		this("Hello");
		System.out.println("Printing 1");
	}
	This_Calling_Statement(String name)
	{
		System.out.println("Printing 2");
	}
	
	public static void main(String[] args)
	{
		new This_Calling_Statement ();
	}
}
