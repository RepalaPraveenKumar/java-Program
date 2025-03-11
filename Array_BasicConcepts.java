package advanced_concepts;
public class Array_BasicConcepts
{
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException
	{
		int Rollno []=new int[3];
		Rollno[0]=58;
		Rollno[1]=68;
		Rollno[2]=88;
		try
		{
		Rollno[3]=98;
		}
		catch (ArrayIndexOutOfBoundsException a1)
		{
			System.out.println(Rollno[2]);
		}
		String name[]= new String[3];
		name[0]="Praveen";
		name[1]="Damodar";
		name[2]="Suvarna";
		for(int i=0; i<=2; i++)
		{
			System.out.print(name [i]);
			System.out.print(" ");
			System.out.println(Rollno [i]);
		}
	}

}
