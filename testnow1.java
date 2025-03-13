package advanced_concepts;

class MJ
{
	private int e = 85254562;

	// Setter method for email
	public void setno(int  e_no)
	{
		this.e = e_no;
	}

	// Getter method for email
	public int getno()
	{
		return e;
	}
}
public class testnow1
{
	
	public static void main(String[] args)
	{
		
		MJ j1 = new MJ();

		// Updating email using setter method
		j1.setno(12345678);
		// Retrieving and printing email using getter method
		System.out.println(j1.getno());
	}
	
	
	
	
	
	
}
	
