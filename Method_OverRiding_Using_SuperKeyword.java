package basicprogram;

class Facebook_Login1
{
	void login()
	{
		System.out.println("Login with mail ID");
	}
}

public class Method_OverRiding_Using_SuperKeyword extends Facebook_Login1
{
	void login()
	{
		//super.login();
		System.out.println("Login with Moblile Number");
		super.login();
	}
	
	public static void main(String[] args)
	{
		Method_OverRiding_Using_SuperKeyword m1= new Method_OverRiding_Using_SuperKeyword();
		m1.login();
	}
}
