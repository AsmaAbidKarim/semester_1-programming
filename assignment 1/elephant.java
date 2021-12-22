//Name:ASMA ABID KARIM
//ERP ID:19685S

public class elephant
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int num;
		if(n<-9999||n>9999)
		{
			System.out.println("INVALID NUMBER AS INPUT");
		}
		String[] ones={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
		String[] ele={"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY"};
		String[] tens={"TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		String[] hund={"HUNDRED","THOUSAND"};
		if(n==0)
		{
			System.out.print(ones[0]);
		}
		
		
		else if(n>=21||n<=99)
		{
			for(int i=1;i<9;i++)
			{	
				if((int)(n/10)==(i+1))
				{
					System.out.print(tens[i]+" ");
				}
			}
			for(int j=1;j<10;j++)
			{
				if((n%10)==j)
				{
					System.out.print(ones[j]);
				}
			}
		}
		
		
		
	
	}
}