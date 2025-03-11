package advanced_concepts;

public class String_Concat_and_Contains
{

	public static void main(String[] args)
	{
		String input="Praveen";
		System.out.println(input.concat(" Kumar Repala"));
		
		String a="Praveen Kumar Repala";
		boolean b1= a.contains("Repala");
		System.out.println(b1);
	}

}
