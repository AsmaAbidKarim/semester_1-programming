
public class MinAndMax
{
	public static void main(String[] args)
	{
		int SizeOfArray=Integer.parseInt(args[0]);
		int[] array=new int[SizeOfArray];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*100);
			System.out.println(array[i]);
		}
		int max=array[0];
		int min=array[0];
		for(int j=0;j<(array.length);j++)
		{
			if(max<(array[j]))
			{
				max=array[j];
			}
			else
			{
				max=max;
			}
			if(min>array[j])
			{
				min=array[j];
			}
			else
			{
				min=min;
			}
		}
		System.out.println("The Minimum Value Is " + min);
		System.out.println("The Maximum Value Is " + max);
	}
	
}






















