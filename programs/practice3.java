public class practice3
{
	public static void main(String[] args)
	{
		int a;
		int b;	
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int c=(a/b);
		a=0;
		b=0;

		
		System.out.print("The"+" "+ "Quotient"+" " +"of"+" "+args[0]+" "+"and"+" " + args[1]+ " " +"is"+ " " + c);
	}
}