package cardGame;

public interface ICard extends Comparable{
	public enum Suit{
		SPADES (0), HEARTS (1), DIAMONDS (2), CLUBS (3);
		int value;
		
		private Suit(int v){
			value = v;
		}
	};
	
	public int getSuit();
	public int getRank();
}
