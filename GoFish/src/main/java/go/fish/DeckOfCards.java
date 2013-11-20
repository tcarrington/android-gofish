package go.fish;

/**
 * Created by Taylor on 11/18/13.
 */
public class DeckOfCards {

    public Card[] deck;

    // public Card[] deck = new Card[52];
    int cardNumber = 0;

    public DeckOfCards() {
        deck = new Card[52];

        for(int rank = 0; rank < 13; rank++) {
            for(int suit = 0; suit < 4; suit++){
                Card card = new Card(rank, suit);
                this.deck[cardNumber] = card;
                cardNumber++;
            }

        }
    }
}
