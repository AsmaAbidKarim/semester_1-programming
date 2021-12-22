//Name:ASMA ABID KARIM
//ERP ID:19685S

public class A1_Q2
{
	public static void main(String[] args)
	{
		System.out.println("0 Represents ROCK");
		System.out.println("1 Represents PAPER");
		System.out.println("2 Represents SCISSOR");
		System.out.println();
		int player=Integer.parseInt(args[0]);
		int computer=(int)(Math.random()*2);
		if((player==0)||(player==1)||(player==2))
		{
			if(computer==0)
				System.out.print("THE COMPUTER IS ROCK.");
			else if(computer==1)
				System.out.print("THE COMPUTER IS PAPER.");
			else if(computer==2)
				System.out.print("THE COMPUTER IS SCISSOR.");
			if(player==0)
				System.out.print("YOU ARE ROCK.");
			else if(player==1)
				System.out.print("YOU ARE PAPER.");
			else if(player==2)
				System.out.print("YOU ARE SCISSOR.");
			if(computer==player)
			{
				System.out.println("GAME IS DRAW");
			}
			else if((computer==2 && player==1)||(computer==0 && player==2)||(computer==1 && player==0))
			{
				System.out.println("COMPUTER WON!!!");
			}
			else if((computer==2 && player==0)||(computer==0 && player==1)||(computer==1 && player==2))
			{
				System.out.println("YOU WON!!!");
			}
		
		}

		else
		{
			System.out.println("INVALID INPUT");
		}

		
	}
}