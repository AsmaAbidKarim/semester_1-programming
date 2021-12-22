public class Pattern2
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int space=n-1;
		int symbol=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k<=symbol;k++)
			{
				System.out.print(symbol+" ");
			}
			space--;
			symbol++;
			System.out.println();	
		}
	}
}