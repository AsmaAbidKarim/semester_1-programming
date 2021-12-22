//Name:ASMA ABID KARIM
//ERP ID:19685S
public class A2_Q3
{
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int gcd=1;
		int temp=0;
		System.out.print("Greatest Common Divisor Between "+x +" And "+ y+" Is " );
		if(x==0)
		{
			gcd=y;
			System.out.print(y);
		}
		if(y==0)
		{
			gcd=x;
			System.out.print(x);
		}
		if((x!=0)&&(y!=0))
		{
			while (x != y)
			{
        			if(x > y)
                		x = x - y;
				else
               			y = y -x ;
       			}
			System.out.print(y);
		}
		
	
		
	}
}