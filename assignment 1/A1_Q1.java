//Name:ASMA ABID KARIM
//ERP ID:19685S
public class A1_Q1
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		double discriminant;
		double d;
		double root1;
		double root2;
		if(a!=0)
		{
			discriminant = Math.pow(b,2)-(4*a*c);
			if(discriminant<0)
			{
				System.out.println("Equation Have IMAGINARY ROOTS");
			}
			else if (discriminant>=0)
			{
				d=Math.sqrt(discriminant);
				root1=((-b+d)/(2*a));
				root2=((-b-d)/(2*a));
				System.out.println("Root 1 " + "= " + root1);
				System.out.println("Root 2 " + "= " + root2);
			}
		}
		else
		{
			System.out.println("Division By Zero ");
			System.out.print("Roots Not Possible");
		}	
	}
}