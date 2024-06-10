package br.com.erudio;

import br.com.erudio.math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        Double result = math.sum(6.2, 2D);
        assertEquals(8.2, result, "The result of 6.2 + 2 must be 8.2");
        assertNotEquals(9.2, result, "The result of 6.2 + 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

}
