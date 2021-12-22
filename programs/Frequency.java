public class Frequency
{
	public static void main(String[] args)
	{
		int FrequencyOf1=0;
		int FrequencyOf2=0;
		int FrequencyOf3=0;
		int FrequencyOf4=0;
		int FrequencyOf5=0;
		int FrequencyOf6=0;
		int FrequencyOf7=0;
		int FrequencyOf8=0;
		int FrequencyOf9=0;
		int inputNumber=Integer.parseInt(args[0]);
		for(int i=0;i==0;i++)
		{
			//Take out the lastDigit of inputNumber.
			int lastDigit =(inputNumber % 10);
			if (lastDigit==1)
			{
				FrequencyOf1=FrequencyOf1+1;
			}
			else if (lastDigit==2)
			{
				FrequencyOf2=FrequencyOf2+1;
			}
			else if (lastDigit==3)
			{
				FrequencyOf3=FrequencyOf3+1;
			}
			else if (lastDigit==4)
			{
				FrequencyOf4=FrequencyOf4+1;
			}
			
			else if (lastDigit==5)
			{
				FrequencyOf5=FrequencyOf5+1;
			}
			else if (lastDigit==6)
			{
				FrequencyOf6=FrequencyOf6+1;
			}
			else if (lastDigit==7)
			{
				FrequencyOf7=FrequencyOf7+1;
			}
			else if (lastDigit==8)
			{
				FrequencyOf8=FrequencyOf8+1;
			}
			else if (lastDigit==9)
			{
				FrequencyOf9=FrequencyOf9+1;
			}
			inputNumber=(inputNumber/10);
		}
		System.out.println("The Frequency Of 1 is "+FrequencyOf1);
		System.out.println("The Frequency Of 2 is "+FrequencyOf2);
		System.out.println("The Frequency Of 3 is "+FrequencyOf3);
		System.out.println("The Frequency Of 4 is "+FrequencyOf4);
		System.out.println("The Frequency Of 5 is "+FrequencyOf5);
		System.out.println("The Frequency Of 6 is "+FrequencyOf6);
		System.out.println("The Frequency Of 7 is "+FrequencyOf7);
		System.out.println("The Frequency Of 8 is "+FrequencyOf8);
		System.out.println("The Frequency Of 9 is "+FrequencyOf9);  
	}
}