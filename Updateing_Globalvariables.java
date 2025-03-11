package basicprogram;

public class Updateing_Globalvariables
{
	// Static global variable
    static int a = 100;
    
    // Non-static global variable
    int b = 200;
 // Static method to update static variable
    static void updateStaticVar(int a)
    {
        
        System.out.println("Updated Static Variable: " + a);
    }
    // Non-static method to update non-static variable
    void updateNonStaticVar(int b)
    {
        
        System.out.println("Updated Non-Static Variable: " + b);
    }
	public static void main(String[] args)
	{
		updateStaticVar(500);
		Updateing_Globalvariables obj1=new Updateing_Globalvariables();
		obj1.updateNonStaticVar(400);

	}

}
