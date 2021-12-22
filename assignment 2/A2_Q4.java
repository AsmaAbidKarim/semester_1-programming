//Name:ASMA ABID KARIM
//ERP ID:19685S
public class A2_Q4
{
	public static void main(String[] args)
	{
		//assuming integer to be 9 digit no.
		int n=Integer.parseInt(args[0]);
		int sum=0;
		int temp=0;
		int checksum=0;
		int k=100000000;
		int[] array1=new int[9];
		int[] array2=new int[9];
	     if((n/100000000)<10)
	     {
		
		for(int i=0;i<9;i++)
		{
			temp=0;
			array1[i]=n/k;
			temp=n%k;
			k=k/10;
			n=temp;
		}
		
		int j=10;
		for(int i=0;i<9;i++)
		{
			array2[i]=array1[i]*j;
			j--;
		}
		
		for(int i=0;i<9;i++)
		{
	
			sum=array2[i]+sum;
		}
		do
		{
			for(int i=0;i<11;i++)
			{
				checksum=i;
				sum=sum+checksum;
				if((sum%11)!=0)
				{
					sum=sum-checksum;
			
				}
				else
				{
					System.out.println("The Checksum Number Is "+checksum);
					break;
				}
				if(checksum==10)
				{
					System.out.println("The Checksum Number Is x");
				}
		
			}
		}while((sum%11)!=0);
		
	
		System.out.println();
		System.out.print("The ISBN Number Is: ");
		for(int i=0;i<9;i++)
		{
			System.out.print(array1[i]);
		}
		if(checksum<10)
		System.out.print(checksum);
		else if (checksum==10)
		System.out.print("x");
	    }
	    else 
	    {
		System.out.println("INVALID INPUT");
	     }


	}
}