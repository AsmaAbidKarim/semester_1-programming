public class Cards
{
	public static void main(String[] args)
	{
		String[] SUITS = { "Clubs","Diamond","Hearts","Spades"};
		String[] RANKS = { "2","3","4","5","6","7","8","9","10","jack","king","queen","ace"};
		String[] Decks1 = new String[SUITS.length*RANKS.length];
		for(int i=0;i<SUITS.length;i++)
		{	for(int j=0;j<RANKS.length;j++)
			{
				Decks1[RANKS.length*i+j]=RANKS[j]+" "+"Of"+" "+SUITS[i];
				System.out.println(RANKS[j]+" "+"Of"+" "+SUITS[i]);
			
			}
			
		}
		System.out.println();
		String[] Decks2 = new String[SUITS.length*RANKS.length];
		for(int i=0;i<RANKS.length;i++)
		{	for(int j=0;j<SUITS.length;j++)
			{
				Decks2[SUITS.length*i+j]=RANKS[i]+" "+"Of"+" "+SUITS[j];
				System.out.println(RANKS[i]+" "+"Of"+" "+SUITS[j]);
			
			}
		}
		System.out.println();
		String temp;
		for(int i=0;i<10;i++)
		{int r = i+(int)(Math.random()*(Decks1.length-i));
			temp=Decks1[r];
			Decks1[r] = Decks1[i];
			Decks1[i] = temp;
				
		}
		for(int n=0;n<51;n++)
		{
			System.out.println(Decks1[n]);

		}
	}
}