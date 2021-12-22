//Name:ASMA ABID KARIM
//ERP ID:19685S

public class A1_Q3
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int num;
		int temp;
		if(n<-9999||n>9999) 
		{
			System.out.println("INVALID NUMBER AS INPUT");
		}
		String[] ones={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
		String[] ele={"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY"};
		String[] tens={"TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		String[] hund={"HUNDRED","THOUSAND"};
		
		if(n<0)
		{
			System.out.println("NUMBER IS LESS THAN ZERO");
			System.out.print("(negative)");
			
		}
		if(n==0)
		{
			System.out.print(ones[0]);
		}
		n=Math.abs(n);
		if(n>=1&&n<=10)
		{
			for(int i=1;i<11;i++)
			{
				if(n==i)
				{
					System.out.print(ones[i]+" ");	
				}
			}
		}
		if(n>=11&&n<=20)
		{
			for(int i=0;i<ele.length;i++)
			{
				if(n==(i+11))
				{
					System.out.print(ele[i]+" ");	
				}
			}
		}
		if(n>=21&&n<=99)
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
		if(n==100)
		{
			System.out.print(ones[1]+" " +hund[0]+" ");
		}
		if((n>=101)&&(n<=999))
		{
			for(int i=1;i<10;i++)
			{
				if((int)(n/100)==i)
				{
					System.out.print(ones[i]+" "+hund[0]+" ");
				}
			}
			for(int j=1;j<ones.length;j++)
			{
				if((n%100)<11)
				{
					if(((n%100)==j)&&(n%100)!=1&&(n%100)!=9)
					{
						System.out.print("AND "+ones[j]);
					}
				}
				
			}
			for(int z=0;z<ele.length;z++)
			{
				if(((n%100)>=11)&&((n%100)<20))
				{
					if((n%100)==(z+11))
					{
						System.out.print("AND "+ele[z]);
					}
				}
			}
	
			for(int z=1;z<2;z++)
			{
				num=n%100;
				for(int x=1;x<9;x++)
				{
					if((int)(num/10)==(x+1))
					{
						System.out.print(" AND "+tens[x]+" ");
					}
					
				}
				for(int x=1;x<ones.length;x++)
				{
					if((num%10)==x)
					{
						System.out.print(ones[x]);
					}
				}
			}		
		}
		if(n==1000)
		{
			System.out.print(ones[1]+" "+hund[1]+" ");
		}
		if(n>=1001&&n<=9999)
		{
			for(int i=1;i<10;i++)
			{
				if((int)(n/1000)==i)
				{
					System.out.print(ones[i]+" "+hund[1]+" ");
				}
			}
			for(int j=1;j<ones.length;j++)
			{
				if((n%1000)<11)
				{
					if((n%1000)==j)
					{
						System.out.print("AND "+ones[j]);
					}
				}
				
			}
			for(int z=0;z<ele.length;z++)
			{
				if(((n%1000)>=11)&&((n%1000)<=20))
				{
					if((n%1000)==(z+11))
					{
						System.out.print("AND "+ele[z]);
					}
				}
			}
			
			if((n>=1021&&n<=1099)||(n>=2021&&n<=2099)||(n>=3021&&n<=3099)||(n>=4021&&n<=4099)||(n>=5021&&n<=5099)||(n>=6021&&n<=6099)||(n>=7021&&n<=7099)||(n>=8021&&n<=8099)||(n>=9021&&n<=9099))
			{
				num=n%100;
				for(int x=1;x<9;x++)
				{
					if((int)(num/10)==(x+1))
					{
						System.out.print(" AND "+tens[x]+" ");
					}
					
				}
				for(int x=1;x<ones.length;x++)
				{
					if((num%10)==x)
					{
						System.out.print(ones[x]);
					}
				}
			}		
			
			if(((n%1000)>=101)&&((n%1000)<=999))
			{
				num=n%1000;
				for(int z=1;z<ones.length;z++)
				{	
					if((num/100)==z)
					{
						System.out.print("AND "+ones[z]+" "+hund[0]+" ");
					}

					if(((num%100)>=1)||((num%100)<=9))
					{
						if((num%100)==z)
						{
							System.out.print("AND "+ones[z]);
						}		
					}
					if(((num%100)>=11)||((num%100)<=19))
					{
						if((num%100)==z+10)
						{
							System.out.print("AND "+ele[z-1]);
						}
					}
				}
				temp=num%100;
				if((temp>=21)&&(temp<=99))
				{
					for(int i=1;i<10;i++)
					{	
						if((int)(temp/10)==i)
						{
							System.out.print("AND "+tens[i-1]+" ");
						}
					}
					for(int j=1;j<10;j++)
					{
						if((temp%10)==j)
						{
							System.out.print(ones[j]);
						}
					}
				}			
		
			}
		}

	}
}