public class GradeDescription
{
	public static void main(String[] args)
	{
		char c=args[0].charAt(0);
		switch(c)
		{
			case 'E':
			case 'e':System.out.println("Excellent");break;
			case 'V':
			case 'v':System.out.println("Very Good");break;
			case 'G':
			case 'g':System.out.println("Good");break;
			case 'A':
			case 'a':System.out.println("Average");break;
			case 'F':
			case 'f':System.out.println("Fail");break;
			default:System.out.print("Input Character Invalid");break;
		}
	}
}