package basicprogram;

public class Globalandlocal1 
{
	/*
	int a1=10;
	public void add()
	{
		//int a1=50;
		System.out.println(a1);
	}
	public static void main(String[] args) {
		
		Globalandlocal1 obj_var=new Globalandlocal1();
		obj_var.add();
		//System.out.println(a);
	}
	*/
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Non Static Method_add is" + c);
	}
	void mod()
	{
		int a=15;
		int b=20;
		int c=a%b;
		System.out.println("Non Static Method_mod is" + c);
	}
	void mul()
	{
		int a=20;
		int b=20;
		int c=a*b;
		System.out.println("Non Static Method_mul is" + c);
	}
	public static void main(String[] args)
	{
		Globalandlocal1 ns1 = new Globalandlocal1();
		ns1.add();
		ns1.mod();
		ns1.mul();
	}
}
