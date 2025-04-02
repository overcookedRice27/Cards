import java.util.ArrayList;
import java.util.List;

public class CardDeck
{
    public static final int DEFAULT_SIZE = 52;
    private List<Card> deck = new ArrayList<>();
    private static final char[] faces = {'D','S','H','C'};
    private final boolean[] deckStatus = new boolean[DEFAULT_SIZE];//keeps tract of which cards have been dealt

    public CardDeck()//constructs the deck of cards
    {
        constructDeck();
        for(int i=0;i<deckStatus.length;i++)
            deckStatus[i] = true;
    }

    public final void constructDeck()
    {
        for(int i=14;i>=2;i--)
        {
            for(int j=4;j>=1;j--)
            {
                Card c = new Card(faces[j], i);
                deck.add(0,c);
            }
        }
    }

    /**
     * returns the current actual deck size
     * @return actual deck size
     */
    public int getDeckSize()
    {
        return deck.size();
    }

    /**
     * Deals a card from the top(front) of the deck
     * @return the dealt card
     */
    public Card deal()
    {
        return deck.remove(0);
    }

    /**
     * retrieves a card and puts it in the bottom of the deck
     * @param c
     */
    public void collect(Card c)
    {
        deck.add(deck.size()-1,c);
    }

    /**
     * shuffles the deck using cusotm algorithm
     * @param amt amount of times to shuffle the deck
     */
    public void shuffle(int amt)
    {
        for(int i=0;i<amt;i++)
            shuffle_alg();
    }

    /**
     * Custom implemented algorithm for shuffling the deck
     * Made to be intentionally imperfect in shuffling
     */
    public void shuffle_alg()
    {
        //splits the deck in 2
        List<Card> firstHalf = deck.subList(0,25);
        List<Card> secondHalf = deck.subList(26, deck.size());

        //creates a random value to make mathematically imperfect shuffle
        double rand = Math.ceil(Math.random())+1.0;
        for(int i=(int)Math.ceil(Math.random());i<DEFAULT_SIZE;i+=rand)
            firstHalf.add(i,secondHalf.remove(i));

        //if the second half of deck isn't empty, add remianing cards to bottom of deck
        while(!(secondHalf.isEmpty()))
            firstHalf.add(firstHalf.size()-1,secondHalf.remove(0));

        deck = firstHalf;
    }

}