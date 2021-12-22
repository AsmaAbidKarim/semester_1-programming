public class  MyProgram2
{
	public static void main(String[] args)
		{
			int a;
			int b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			int c=a+b;
			int d=a-b;
			int e=a*b;
			int f=a/b;
			System.out.println("Sum" + "=" + c);
			System.out.println("Difference" + "=" + d);
			System.out.println("Product" + "=" + e);
			System.out.println("Quotient" + "=" + f);
		}
}