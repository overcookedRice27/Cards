import java.util.ArrayList;

public class CardDeck
{
    public static final int DEFAULT_SIZE = 52;
    private final ArrayList<Card> deck = new ArrayList<>();
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
        for(int i=13;i>=2;i--)
        {
            for(int j=4;j>=1;j--)
            {
                Card c = new Card(faces[j], i);
                deck.add(0,c);
            }
        }
    }

    public int getDeckSize()
    {
        return deck.size();
    }



}