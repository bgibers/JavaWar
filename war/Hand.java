package war;

import java.util.*;

public class Hand extends Deck {
	Hand(){
        myCards = new ArrayList<Cards>();
    }

    public void addCard(Cards card){
        myCards.add(card);
    }

   
    public boolean isEmpty(){
        return myCards.isEmpty();
    }
}
	
