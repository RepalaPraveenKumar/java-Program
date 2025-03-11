package basicprogram;

public class Final_Variable
{
	final int a=100;
	static final int b=50;
	static void add()
	{
		//int b=20;
		Final_Variable fv=new Final_Variable();
		System.out.println(fv.a+b);
	}
	void sub()
	{
		//int a=40;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		add();
		Final_Variable fv=new Final_Variable();
		fv.sub();
	}

}