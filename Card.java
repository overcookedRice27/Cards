
public class Card
{
    private final char suit;//'D' for diamonds, 'S' for spades, 'C' for clubs, 'H' for heart
    private String face = "";
    private final int value;

    public Card(char f, int val)
    {
        suit = f;
        value = val;
        if(val<=10)
            face = value + "";
        else
        {
            switch(value)
            {
                case 11: face = "J";
                    break;
                case 12: face = "Q";
                    break;
                case 13: face = "K";
                    break;
                case 14: face = "A";
                    break;
            }
        }
    }

    public int getValue()
    {
        return value;
    }

    public char getSuit()
    {
        return suit;
    }

    @Override
    public String toString()
    {
        return "Card face: " ;
    }

}