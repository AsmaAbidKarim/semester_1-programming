public class Grades
{
	public static void main(String[] args)
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if (a>b)
		{
			System.out.println("Invalid Input");
		}
		else 
		{	double c=(double)a/b*100;
	
			if ((c>=80)&&(a<=100))
			{
				System.out.println("pass");
				System.out.println("Grade:A");
			}	
			if ((c>=60)&&(a<=79))
			{
				System.out.println("pass");
				System.out.println("Grade:B");
			}
			if (c<60)
			{
				System.out.println("Fail");
			
			}
		}
		
	}
}