package fr.sare;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;

import static fr.sare.Divider.divide;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideTest {

    @Test
    void testDivision() {
        double result = divide(10, 2);

        assertEquals(5, result);
    }

    @Property
    void fuzzTestDivision(@ForAll int value) {
        double result = divide(value, value);

        assertEquals(1, result);
    }


    @Property
    void divisionShouldNotBePossibleByZero(@ForAll int numerator) {
        assertThrows(DivideByZeroException.class, () -> divide(numerator, 0));
    }
}
