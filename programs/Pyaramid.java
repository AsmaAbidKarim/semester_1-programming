public class Pyaramid
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int k=n+4-1;
		
		for(int i=1;i<=n;i++)

		{
			for(int space=(k);space!=0;space--)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
					
			
				System.out.print("  " + i);
					
			}	
		System.out.println();
		k--;
		}
		
	}
}