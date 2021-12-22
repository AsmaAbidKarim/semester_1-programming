public class Result2
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
		double c=(double)a/b*100;
	
		if (c>=50.0)
		{
			System.out.println("pass");
		}	
		else
		{
			System.out.println("Fail");
		}
		
	}
}