package basicprogram;

public class Delering_Global_Variable
{

	final int a1=10;
	int b=20;
	public void add()
	{
		final int a=12;
		//int a=10;
		System.out.println(a1+b+a);
	}
	static void sub()
	{
		Delering_Global_Variable gv=new Delering_Global_Variable();
		System.out.println(gv.a1-gv.b);
	}
	public static void main(String[] args)
	{
		
		Delering_Global_Variable obj_var=new Delering_Global_Variable();
		obj_var.add();
		sub();
		
	}
}
