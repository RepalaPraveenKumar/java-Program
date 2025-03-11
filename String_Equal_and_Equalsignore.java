package advanced_concepts;

public class String_Equal_and_Equalsignore
{

	public static void main(String[] args)
	{
		String input="praveen";
		boolean b1=input.equals("Manish");
		System.out.println(b1);
		
		boolean b2=input.equalsIgnoreCase("PRAVEEN");
		System.out.println(b2);
	}

}
