public class SquarePattern
{
	public static void main(String[] args)
	{	
		int prod=1;
		int prod1=1;
		int row=1;
		int col=1;
		int n=Integer.parseInt(args[0]);
		while(row<=2 && col<=2)
		{	
			prod=n*n;
			System.out.print(prod);
			row++;
			System.out.print("  ");
			prod1=n*n;
			System.out.println(prod1);
			col++;	
			
		}
		
				
	}
}