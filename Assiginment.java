package basicprogram;

public class Assiginment {
	void start()
	{
 	 String s1 = "s";
	 String s2 = fix(s1);
	 System.out.println(s1 + " " + s2);
	}
	String fix(String s1)
	{
	 s1 = s1 + "st";
	 System.out.print(s1 + " ");
	 return "st";
	}
	public static void main(String[] args) {
		Assiginment p = new Assiginment();
		 p.start();

	}

}
/*Explanation: When the fix() method is first entered, start()'s s1 and fix()'s s1 reference variables
  both refer to the same String object (with a value of ""s""). Fix()'s s1 is reassigned to a new object
  that is created when the concatenation occurs (this second String object has a value of ""sst"").
  When the program returns to start(), another String object is created, referred to by s2 and with a value
   of ""st"".*/
