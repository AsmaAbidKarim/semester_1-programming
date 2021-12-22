public class DoubleVariables
{
	public static void main(String[] args)
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		if (((a>=0)&&(a<=1))||((b>=0)&&(b<=1)))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}