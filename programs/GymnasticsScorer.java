public class GymnasticsScorer
{
	public static void main(String[] args)
	{	
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int f=Integer.parseInt(args[5]);
		double totalsum=(a+b+c+d+e+f);
		int z=(Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f))))));
		int x=(Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, f))))));
		totalsum=(totalsum-z-x);
		double average=totalsum/4;
		System.out.println(average);
	}
}