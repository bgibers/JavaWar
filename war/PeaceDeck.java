package war;

public class PeaceDeck extends Deck{

	public PeaceDeck() {
		
		for(int i=0; i < NUM_CARDS; i++)
		{
		    myCards.set(i, new PeaceCard(i));
		}
	}

	
}
