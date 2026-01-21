import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testGetName() {
        Bike bike = new Bike("Foo");
        //          expected value, actual value
        assertEquals("Foo", bike.getName());
    }

    @Test
    void testTrue() {
        assertTrue(1 == 1);
    }

}