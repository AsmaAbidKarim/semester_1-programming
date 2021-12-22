public class SpringSeason
{
	public static void main(String[] args)
	{
		int m;
		int d;
		m=0;
		d=0;
		boolean c;
		
		m=Integer.parseInt(args[0]);
		d=Integer.parseInt(args[1]);
		c= (m <= 6 ) && (m >= 3) && (d <= 20);
		
		System.out.print(c);
	}
}