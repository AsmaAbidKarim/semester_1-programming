public class SumOdd
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		
		int sum=0;
		int i=1;
		do
		{
			sum=sum+i;
			i=i+2;
					
		}while(i<=n);
		System.out.println("The Sum Of Odd Numbers = " + sum);
	}
}