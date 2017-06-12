package war;

public class PeaceCard extends Cards{

	
	public PeaceCard(int index) {
		super(index);
	}

	public PeaceCard(Suit suit, Value rank) {
		super(suit, rank);
	}

	@Override
	public boolean isWinner(Cards other) {
		if (myValue.ordinal() == other.myValue.ordinal()) {
	        return mySuit.ordinal() < other.mySuit.ordinal();
	    }
	    else {
	        return myValue.ordinal() < other.myValue.ordinal();
	    }
	}
             
    
}
