
public class countVowels
{
	public static void main(String[] args)
	{
		
		int SizeOfArray=Integer.parseInt(args[0]);
		String alphabet="aAbBcCdDeEFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxyYzZ"; 
		char[] array1=new char[SizeOfArray];
		for(int i=0;i<SizeOfArray;i++)
		{
			int r=(int)(Math.random()*52);
			array1[i]=alphabet.charAt(r);
			System.out.println(array1[i]);		
		
		}
		int vowelA=0;
		int vowelE=0;
		int vowelI=0;
		int vowelO=0;
		int vowelU=0;
		for(int j=0;j<SizeOfArray;j++)
		{
			if((array[j]==A)||(array[j]==a))
			{
				vowelA=1;
			}
			if((array[j]==E)||(array[j]==e))
			{
				vowelE=1;
			}
			if((array[j]==I)||(array[j]==i))
			{
				vowelI=1;
			}
			if((array[j]==O)||(array[j]==o))
			{
				vowelO=1;
			}
			if((array[j]==U)||(array[j]==u))
			{
				vowelU=1;
			}
		}
		System.out.println("Number of Vowel A Is " + vowelA);
		System.out.println("Number of Vowel E Is " + vowelE);
		System.out.println("Number of Vowel I Is " + vowelI);
		System.out.println("Number of Vowel O Is " + vowelo);
		System.out.println("Number of Vowel U Is " + vowelu);
		
	}
	
}