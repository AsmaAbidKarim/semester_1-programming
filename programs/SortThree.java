public class SortThree
{
	public static void main(String[] args)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if (a>b)
			{int t=a;
			a=b;
			b=t;	
			}
			else
			{
			}
			if (b>c)
			{int t=b;
			b=c;
			c=t;
			}
			if (a>b)
			{int t=a;
			a=b;
			b=t;	
			}
			else
			{
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);


		}
}