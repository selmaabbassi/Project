
public class Cards {
	public int rank, suit;
	
	private String[] ranks = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
	
	public Cards(int suit, int rank){
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){
		return ranks[rank] + "of" + suits[suit];
	}
	
	public int getRank(){
		return rank;
	}
	
	public int getSuit(){
		return suit;
	}
	
	
}
