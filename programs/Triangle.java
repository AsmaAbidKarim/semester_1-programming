public class Triangle
{
	public static void main(String[] args)
	{	
		double a=Math.random();
		double b=Math.random();
		double c=Math.random();
		double nofpossibilities=0.0;
		double probability=(nofpossibilities/3.0);
		if(c<a+b)
		{
			nofpossibilities++;
		}
		if(a<b+c)
		{
			nofpossibilities++;
		}
		if(b<a+c)
		{
			nofpossibilities++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The Probability to be a triangle is "+probability);
		
	}
}