public class SumAverage
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[i]);
		double [] a=new double[args[i].lenght];
		double sum=0.0;
		for(int i=0;i<n;i++)
		{

			sum=sum+i;
		}
		double average=sum/(n-1);
		System.out.println("The Sum Of " + n + " Inputs = " + sum);
		System.out.println("The average Of " + n + " Inputs = " + average);		
	}
}