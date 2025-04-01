
public class Card
{
    private final char face;//'D' for diamonds, 'S' for spades, 'C' for clubs, 'H' for heart
    private final int value;

    public Card(char f, int val)
    {
        this.face = f;
        value = val;
    }

    public int getValue()
    {
        return value;
    }

    public char getFace()
    {
        return face;
    }

}