package basicprogram;

public class Global_Variable_Static_and_Nonstatic
{
	int a=5;
	int b=10;
	static double r=4.56;
	// Static method
    static void staticMethod()
    {
    	System.out.println(Math.PI*r*2);
    }
    // Non-static method
    void nonStaticMethod()
    {
    	
    	System.out.println(a*b);
    }
	public static void main(String[] args)
	{
		staticMethod();
		Global_Variable_Static_and_Nonstatic gv=new Global_Variable_Static_and_Nonstatic();
		gv.nonStaticMethod();
		
	}

}
