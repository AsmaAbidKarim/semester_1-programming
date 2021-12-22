public class Result
{
	public static void main(String[] args)
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>b)
		{
			System.out.print("invalid Input");
		}
		else
		{
			if (a>=(0.5*b))
			{
				System.out.println("pass");
			}	
			else
			{
				System.out.println("Fail");
			}
		}
	}
}