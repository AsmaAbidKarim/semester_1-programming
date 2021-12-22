public class Distance
{
	public static void main(String[] args)
	{
		int x;
		int y;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		int a=(x*x)+(y*y);
		System.out.print("The"+" " + "euclidean" + " " +"Distance" + " " + "Is"+ " " );
		System.out.println(Math.sqrt(a));

	}
}