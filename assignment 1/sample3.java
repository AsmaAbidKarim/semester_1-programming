public class sample3
{
	public static void main(String[] args)
	{
		int y=2000;
		int d=14;
		int y0;
		int d0;
		int m0;
		int x;
		int m=2;
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m +12 * ((14 - m) / 12) - 2;
		d0 = (d + x +(31 * m0) / 12) % 7;
		System.out.println(d0);

		
	}
}