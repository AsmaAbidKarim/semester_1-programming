//Name:ASMA ABID KARIM
//ERP ID:19685S

public class A2_Q1
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		System.out.println("PRIME NUMBERS TILL "+ n+ " ARE:");
		int count=0;
		if(n==1)
		{
			System.out.print("1");
			count=0;
		}
		else if(n==2)
		{
			System.out.print("2");
			count=1;
		}
		else if(n==3||n==4)
		{
			System.out.print("2 3");
			count=2;
		}
		
		else if(n==5||n==6)
		{
			System.out.print("2 3 5");
			count=3;
		}
		
		else if(n>=7)
		{
			System.out.print("2 3 5 7 ");
			count=4;
		}
		
		
		if(n>=11)
		{
			for(int i=2;i<=n;i++)
			{
				if(((i%2)!=0)&&((i%3)!=0)&&((i%5)!=0)&&((i%7)!=0))
				{
					System.out.print(i +" ");
					count=count+1;
				}
			}
		}
		System.out.println();
		System.out.println("COUNT OF PRIME NUMBERS TILL "+n+" IS " + count );
	}
}