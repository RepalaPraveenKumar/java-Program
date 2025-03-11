package advanced_concepts;

public class AvarageOnArray
{

	public static void main(String[] args)
	{
		double[ ] value=new double[4];
		value[0]=42;
		value[1]=80;
		value[2]=25;
		value[3]=64;
		double sum=0;
		double avarage=0;
		for(int i=0; i<=value.length-1; i++)
		{
			sum=sum+value[i];
		}
		
		System.out.println(sum);
		avarage=sum/value.length;
		System.out.println(avarage);
	}

}