public class SumDigits
{
 	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int sum=0;
		int a=1;
		  while(a > 0)
       		 {
			a=(n % 10);            		
			sum = sum +a;
            		n = n / 10;
            		
		}
		System.out.println("The Sum Of Digits are " + sum);
	}
}