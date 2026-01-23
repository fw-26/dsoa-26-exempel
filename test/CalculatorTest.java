import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CC_CalculatorTest {

    @Test
    void testMultiplyTwoFactors() {
        CC_Calculator calculator = new CC_Calculator();
        assertEquals(20, calculator.multiply(5, 4));
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void testMultiplyThreeFactors() {
        // man behöver inte instansiera ett namngivet objekt
        assertEquals(40, (new CC_Calculator()).multiply(5, 4, 2));
    }
}