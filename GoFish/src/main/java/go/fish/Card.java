package go.fish;

/**
 * Created by Taylor on 11/18/13.
 */
public class Card {
    public final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public String suit;
    public String rank;

    public Card(int rank, int suit) {
        this.suit = suits[suit];
        this.rank = ranks[rank];
    }
}
