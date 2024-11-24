package CalculateText;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTextTest {
    @Test
    public void testAddCharactersWithoutSpaces() {
        CalculateText counter = new CalculateText();
        counter.addCharacters("Hej på dig!");
        assertEquals(9, counter.getTotalCharacterCount());
        assertEquals(1, counter.getTotalLineCount());
    }
    @Test
    void testTotalCharacterCount_multipleInputs() {
        CalculateText calculator = new CalculateText();
        calculator.addCharacters("Hej");
        calculator.addCharacters("på dig!");
        assertEquals(9, calculator.getTotalCharacterCount());
    }
    @Test
    void TotalLineCount_multipleInputs() {
        CalculateText calculator = new CalculateText();
        calculator.addCharacters("Nu är det vinter!");
        calculator.addCharacters("Det är kallt och halt.");
        calculator.addCharacters("Längtar till våren.");
        assertEquals(3, calculator.getTotalLineCount());
    }

}