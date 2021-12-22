public class Result1
{
	public static void main(String[] args)
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>b)
		{
			int t=a;
			a=b;
			b=t;
		}
	
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