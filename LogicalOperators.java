package basicprogram;

public class LogicalOperators
{
	
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		if (a!=b && b>a)
		{
			System.out.println("Executing AND Block");
		}
		if (a<b || a==b)
		{
			System.out.println("Executing OR Block");
		}
		if (!(a==b && b<a))
		{
			System.out.println("Executing AND NOT Block");
		}
		if (!(a>b || b==100))
		{
			System.out.println("Executing OR NOT Block");
		}
	}

}
