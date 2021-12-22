public class PrimeFactorization
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		System.out.print("The Prime Factors are"+"[");
		for(int i=2;i<=n;i++)
		{
			while(0==(n%i))
			{
				System.out.print(i +" x "+" ");
				n=n/2;
			}

		}
		System.out.println("1]");
	
		
		
	}
}