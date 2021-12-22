public class random1
{
	public static void main(String[] args)
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=a*b;
		double d=(c+Math.random());
		System.out.println("c=" + c);
		System.out.println("random =" + Math.random());
		System.out.println("d=c+random" +"="+ d);
		
	}
}