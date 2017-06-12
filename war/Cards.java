package war;

public class Cards {
	public enum Value {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    public enum Suit {Spade,Hearts,Diamonds,Clubs};
    protected Suit mySuit;
    protected Value myValue;

Cards(Suit suit, Value rank){
        this.mySuit = suit;
        this.myValue = rank;           
}


public Cards(int index){
index = index % 52;
mySuit = Suit.values()[index / 13];
myValue = Value.values() [index % 13];
}

@Override
public String toString(){
        return myValue.name() + " of " + mySuit.name();
    }

public boolean isWinner(Cards other){

    if (myValue.ordinal() == other.myValue.ordinal()) {
        return mySuit.ordinal() > other.mySuit.ordinal();
    }
    else {
        return myValue.ordinal() > other.myValue.ordinal();
    }
}

}

