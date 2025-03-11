package advanced_concepts;

public class PrimitiveTypeCasting1  //Primitive TypeCasting (Widening)
{
	public static void main(String[] args)
	{
		System.out.println("converting int into double"); //converting int into double
		double d1=100;           //implicit way of creating
			System.out.println(d1);
		double d2= (double)200;  //Explicit way of creating
			System.out.println(d2);
		
		int a=300;
		double d3=a;
		System.out.println(d3);
		
		System.out.println("---------------------");
		System.out.println("converting byte into int"); //converting byte into int
		int i1=55;              //implicit way of creating
			System.out.println(i1);
		int i2= (int)120;      //Explicit way of creating
			System.out.println(i2);
		
		System.out.println("---------------------");
		System.out.println("converting short into int"); //converting short into int
		int i3=56458;              //implicit way of creating
			System.out.println(i3);
		int i4 = (int)6647892;     //Explicit way of creating
			System.out.println(i4);
		
		System.out.println("---------------------");
		System.out.println("converting float into double"); //converting float into double
		double d4= 5.6;           //implicit way of creating
			System.out.println(d4);
		double d5= (double)252.55;//Explicit way of creating
			System.out.println(d5);
	}

}
