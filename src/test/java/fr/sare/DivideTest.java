package fr.sare;

import org.junit.jupiter.api.Test;

import static fr.sare.Divider.divide;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {

    @Test
    void testDivision() {
        double result = divide(10, 2);

        assertEquals(5, result);
    }
}
