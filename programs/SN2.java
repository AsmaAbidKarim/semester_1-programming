public class SN2
{
	public static void main(String[] args)
		{
			int n=Integer.parseInt(args[0]);
			for(int i=n;i<=n;i--)
			{
				for(int space=1;space<=n;space++)
				{
				
					System.out.println(" ");
				}
				for(int j=n;j<=i;j++)
				{
					System.out.print("*  ");

				}
				System.out.println();
			}					
			
			

		}

}