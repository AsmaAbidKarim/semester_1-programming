
public class Reverse
{
	public static void main(String[] args)
	{
		System.out.println("array");
		int SizeOfArray=Integer.parseInt(args[0]);
		int[] array1=new int[SizeOfArray];
		int[] array2=new int[SizeOfArray];
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=(int)(Math.random()*100);
			System.out.println(array1[i]);
		}
		System.out.println();
		System.out.println("reversed array");
		int n=1;
		for(int j=0;j<SizeOfArray;j++)
		{
			
			array2[j]=array1[SizeOfArray-n];
			n++;
			System.out.println(array2[j]);
			
		
		}
	}
	
}
