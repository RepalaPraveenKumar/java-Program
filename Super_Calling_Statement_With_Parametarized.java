package basicprogram;

class Parent_class
{
	Parent_class(String name)
	{
		System.out.println("This is Parent Class Constructor");
	}
}


public class Super_Calling_Statement_With_Parametarized extends Parent_class
{
	Super_Calling_Statement_With_Parametarized ()
	{
		super("Praveen");
		System.out.println("This is Child Class Consturctor");
	}
	public static void main(String[] args)
	{
		new Super_Calling_Statement_With_Parametarized();
	}
}
