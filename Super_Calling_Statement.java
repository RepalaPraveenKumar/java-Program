package basicprogram;

class Parent_Constructor
{
	Parent_Constructor()
	{
		System.out.println("This is parent Construcor");
	}
}
public class Super_Calling_Statement extends Parent_Constructor
{
		Super_Calling_Statement()
	{
		// super calling statement [super();] should Hear always be 1st line in every constructor
		// it is used to call the parent class constructor from child class constructor 
		//super() can be written implicit way or explicit way 
		System.out.println("This is Child Constructor");
	}
	
	public static void main(String[] args)
	{
		new Super_Calling_Statement ();
	}
}
