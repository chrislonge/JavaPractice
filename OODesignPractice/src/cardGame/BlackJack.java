package cardGame;

public class BlackJack{
	
	public Deck bjDeck;
	public int numPlayers;
	public BlackJack(int num){
		numPlayers = num;
		bjDeck = new Deck();
	}
	/*
	public int value(){
		int num = super.value();
		if(num == 1)
			return 11;
		if(num < 10)
			return num;
		
		return 10;
	}
	
	boolean isAce(){
		return super.value() == 1;
	}
	*/
}
