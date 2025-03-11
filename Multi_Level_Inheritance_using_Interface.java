package basicprogram;

interface Interface1
{
	void method1();
}
interface Interface2 extends Interface1
{
	void method2();
}
public class Multi_Level_Inheritance_using_Interface implements Interface2
{
	
	public void method1()
	{
		System.out.println("Print 1");
	}

	public void method2()
	{
		System.out.println("Print 2");
	}
	
	public static void main(String[] args)
	{
		Multi_Level_Inheritance_using_Interface mli=new Multi_Level_Inheritance_using_Interface();
		mli.method1();
		mli.method2();
	}
}
