public class OddSum
{
 	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int sum=0;
		int a=1;
		
		while (a<=n)
		{
			sum=sum+a;
			a=a+2;
		}
		System.out.println(sum);
		
		
	}
}