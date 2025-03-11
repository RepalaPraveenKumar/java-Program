package basicprogram;

public class Constructor_Overloading
{
	Constructor_Overloading()
	{
		System.out.println("1st Constructor");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("2nd Constructor");
	}
	Constructor_Overloading(String name)
	{
		System.out.println("3rd Constructor");
	}
	public static void main(String[] args)
	{
		new Constructor_Overloading();
		new Constructor_Overloading(54);
		new Constructor_Overloading("Praveen");
	}

}
