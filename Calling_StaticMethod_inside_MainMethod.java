package basicprogram;

public class Calling_StaticMethod_inside_MainMethod
{
   static void add()
   {
	   int a=100;
	   int b=200;
	   System.out.println(a+b);
   }
   static void sub()
   {
	   int a=10;
	   int b=20;
	   int c=a-b;
	   System.out.println(c);
   }
   static void mul()
   {
	   int a=10;
	   int b=20;
	   int c=a*b;
	   System.out.println(c);
   }
	public static void main(String[] args)
	{
		
      add(); //this is how we calling the Static methods
      sub();
      mul();
	}

}
