//Name:ASMA ABID KARIM
//ERP ID:19685S
public class A2_Q2
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		
		System.out.print("THE NUMBER ARE :");
		int median=0;
		int minindex=0;
		int temp;
		int[] array1=new int[n+1];
		
		for(int i=1;i<(array1.length);i++)
		{
			array1[i]=(Integer.parseInt(args[i]));
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.print("AFTER ARRANGING: ");
		for(int i=1;i<n;i++)
		{
			minindex=i;
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[j]<array1[minindex])
				{
					minindex=j;
				}
			}
			temp=array1[i];
			array1[i]=array1[minindex];
			array1[minindex]=temp;
		}
		for(int i=1;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		if((n%2)==0)
		{
			median=(array1[n/2]);
			System.out.print("MEDIAN OF "+n+" NUMBERS ARE "+ median+" AND ");
			median=(array1[(n/2)+1]);
			System.out.print(median);
		}
		else if((n%2)!=0)
		{
			median=(array1[((int)(n/2))+1]);
			System.out.print("MEDIAN OF "+n+" NUMBERS IS "+ median);
			
		}
	}
}