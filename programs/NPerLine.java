public class NPerLine
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int j=0;
		for(int i=10;i<=99;i++)
		{ 
			System.out.print(i+ " ");
			j=j+1;
			if(j==n)
			{	
				System.out.println();
				j=0;
			}
		
			
		}
	
	}
}