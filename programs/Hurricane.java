public class Hurricane
{
 	public static void main
	{
		int windspeed=Integer.parseInt(args[0]);
		if (windspeed<74)
		{
			System.out.println("Not a Hurricane");

		}
		else 
		{
			System.out.println("A Hurricane");
		}
		if (windspeed>=74 && windspeed<=95)
		{	
			System.out.println("Category:1");
		}
		else 
		{
			if (windspeed>=96 && windspeed<=110)
			{	
				System.out.println("Category:2");
			}
			else
			{ 
				if (windspeed>=111 && windspeed<=130)
				{	
					System.out.println("Category:3");
				}
				else
				{ 
					if (windspeed>=131 && windspeed<=155)
					{	
						System.out.println("Category:4");
					}
						else 
						{	
							if (windspeed>155)
							{	
								System.out.println("Category:5");
							}
						}
				}
			}
		}
	}
}