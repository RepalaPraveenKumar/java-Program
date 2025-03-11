package advanced_concepts;

import java.util.Date;

public class Past_Prasent_Future_Date
{

	public static void main(String[] args)
	{
		Date d1= new Date();
		System.out.println(d1);
		
		Date d2= new Date (d1.getTime() +(1000*60*60*24*0));
		//System.out.println(d2);
		String format1 = d2.toString();
		String month = format1.substring(4, 7);
		System.out.println(month);
		String date = format1.substring(8, 10);
		System.out.println(date);
		String year = format1.substring(format1.length() - 4);
		System.out.println(year);
		String format2 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println("Present Date: "+ format2);

		Date d3 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 4));
		//System.out.println(d3);
		String format3 = d3.toString();
		String date1=format3.substring(8, 10);
		String month1=format3.substring(4, 7);
		String year1=format3.substring(format3.length()-4);
		String format4 = date1.concat("-").concat(month1).concat("-").concat(year1);
		System.out.println("Future Date:  " +format4);
		
		Date d4 = new Date(d1.getTime() - (1000 * 60 * 60 * 24 * 4));
		//System.out.println(d4);
		String format5 = d4.toString();
		String date2=format5.substring(8, 10);
		String month2=format5.substring(4, 7);
		String year2=format5.substring(format3.length()-4);
		String format6 = date2.concat("-").concat(month2).concat("-").concat(year2);
		System.out.println("Past Date:    " +format6);
	}

}
