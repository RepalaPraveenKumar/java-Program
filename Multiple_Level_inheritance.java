package basicprogram;
// Multiple level inheritance by using the concept of interface
interface Abc
{
	void method1();
	void method2();
}
interface Def
{
	void method3();
	void method4();
}
public class Multiple_Level_inheritance implements Abc,Def
{

	public void method3()
	{
		System.out.println("Printing 3");
	}

	
	public void method4()
	{
		System.out.println("Printing 4");
	}

	public void method1()
	{
		System.out.println("Printing 1");
	}

	public void method2()
	{
		System.out.println("Printing 2");
	}
	public static void main(String[] args)
	{
		Multiple_Level_inheritance mli=new Multiple_Level_inheritance();
		mli.method1();
		mli.method2();
		mli.method3();
		mli.method4();
	}
}
