package advanced_concepts;

class  FacebookLogin
{
	void login()
	{
		System.out.println("Login with Emailid ");
	}
}

public class CPT_Polymorphism extends FacebookLogin //Run time polymorphism (Method overriding)
{

	void login()
	{
		System.out.println("Login with PhoneNumber");
	}
	public static void main(String[] args)
	{
		
		FacebookLogin p1 =new FacebookLogin();
		p1.login();
		
	}

}
