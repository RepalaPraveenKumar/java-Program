package basicprogram;

public class Calling_NonstaticMethod_inside_MainMethod
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Non Static Method_add is = " + c);
	}
	void mod()
	{
		int a=10;
		int b=20;
		int c=a%b;
		System.out.println("Non Static Method_mod is = " + c);
	}
	void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Non Static Method_mul is = " + c);
	}
	void div()
	{
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println("Non Static Method_div is = " + c);
	}
	public static void main(String[] args)
	{
		Calling_NonstaticMethod_inside_MainMethod ns1 = new Calling_NonstaticMethod_inside_MainMethod();
		
		ns1.add();
		ns1.mod();
		ns1.mul();
		ns1.div();
		
		
	}
	

}