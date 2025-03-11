package basicprogram;

public class Calling_NonStatic_Parameterized_Methods
{
	void add (int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	void student (String name)
	{
		System.out.println(name);
	}
	
	void sub (int a, long b, float c, double d, char e, String name, boolean answer )
	{
		System.out.println("Return types");
	}
	public static void main(String[] args)
	{
		Calling_NonStatic_Parameterized_Methods np=new Calling_NonStatic_Parameterized_Methods();
		np.add(40, 20);
		np.student("Praveen");
		np.sub(40, 5899588555566662225l, 20.54f, 55.66, 'P', "Praveen", true);

	}

}
