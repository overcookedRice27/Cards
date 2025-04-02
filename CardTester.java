import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.api.Test;

public class CardTester {

    CardDeck testDeck = new CardDeck();

    @Test 
    public void testDeckCreation()
    {
        AssertEquals(52,testDeck.getDeckSize());
    }
    
    
    
    
}
