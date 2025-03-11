package advanced_concepts;
class Encapsul
{
	private long MobileNo=9290301798l;
	public long getMobileNO()
	{
		return MobileNo;
	}
	public void setMobileNo(long phone)
	{
		this.MobileNo = phone;
	}
	private String Gender="male";
	public String getGender()
	{
		return Gender;
	}
	public void setGender(String str)
	{
		this.Gender=str;
	}
}

public class EncapsulationProgam //Encapsulation Program
{
	public static void main(String[] args)
	{
		Encapsul e1= new Encapsul();
		e1.setMobileNo(7989295337l);
		System.out.println(e1.getMobileNO());
		e1.setGender("Female");
		System.out.println(e1.getGender());
		//e1.getGender();
		
	}
}
