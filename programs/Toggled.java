
public class Toggled 
{
	public static void main(String[] args)
	{
	
		boolean a=true;
		boolean[] doors=new boolean[101];
		System.out.println("Original Condition Of The Doors");
		System.out.println("True=Open And False=Closed");
		for(int j=1;j<doors.length;j++)
		{
			doors[j]=a;
		}
		for(int i=1;i<101;i++)
		{
			if((i%2)==0)
			{
				doors[i]=false;
				
			}
			else
			{	
				doors[i]=a;
			}
			
		}
		for(int i=1;i<101;i++)
		{
			if((i%3)==0)
			{
				if(doors[i]==false)
				{
					doors[i]=true;
				}
				if(doors[i]==true)
				{
					doors[i]=false;
				}
				
			}
			
			
		}
		for(int n=4;n<101;n++)
		{
			for(int i=1;i<101;i++)
			{
				if((i%n)==0)
				{
					if(doors[i]==false)
					{
						doors[i]=true;
					}
					if(doors[i]==true)
					{
						doors[i]=false;
					}
		
				}
				
			}
			
		}
		System.out.println("Locker Numbers That Are Open");
		for(int k=1;k<101;k++)
		{
			if(doors[k]==true)
			{
				System.out.println(k);
			}
		}
	}
	
}