package war;

import java.util.*;

public class Deck {  
	    protected final int NUM_CARDS = 52;
	    protected final Random myRandom = new Random();

	    protected ArrayList<Cards> myCards;

	    public Deck() {
	        myCards = new ArrayList<Cards>();
	        for (int i = 0; i < NUM_CARDS; i++) {
	            myCards.add(new Cards(i));
	        }
	    }

	    public Cards draw() {
	        int randomIndex = myRandom.nextInt(myCards.size());
	        Cards card = myCards.get(randomIndex);
	        myCards.remove(randomIndex);
	        return card;
	    }

	    public Hand[] split() {
	        Hand[] hands = new Hand[2];
	        hands[0] = new Hand();
	        hands[1] = new Hand();

	        for (int i = 0; i < NUM_CARDS; ++i) {
	            hands[i % 2].addCard(draw());
	        }
	        return hands;
	    }
	}
	
