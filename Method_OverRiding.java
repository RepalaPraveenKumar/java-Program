package basicprogram;
class Facebook_Login
{
	void login()
	{
		System.out.println("Login with mail ID");
	}
}

public class Method_OverRiding extends Facebook_Login
{
	void login()
	{
		System.out.println("Login with Moblile Number");
	}
	
	public static void main(String[] args)
	{
		Method_OverRiding m1= new Method_OverRiding();
		m1.login();
	}
}
