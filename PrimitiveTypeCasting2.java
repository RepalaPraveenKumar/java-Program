package advanced_concepts;

public class PrimitiveTypeCasting2 //Primitive TypeCasting (Narrowing)
{

	public static void main(String[] args)
	{
		
	System.out.println("converting double into int");//converting double into int	
	int a=	(int) 12.5;
		System.out.println(a);
	
	System.out.println("---------------------");
	System.out.println("converting double into float"); //converting double into float
	float f1= (float) 45.6;
		System.out.println(f1);
	
	System.out.println("---------------------");
	System.out.println("converting int into byte"); //converting int into byte
	byte b1=(byte) 250;
		System.out.println(b1);
	
	System.out.println("---------------------");
	System.out.println("converting int into byte where int value is 100000"); //converting int into byte where int value is 100000
	byte b2= (byte) 100000;
		System.out.println(b2);
	
	System.out.println("---------------------");
	System.out.println("converting short into byte"); //converting short into byte 
	byte b3 =(byte) 2558;      //Explicit way of creating
		System.out.println(b3);

	}

}
