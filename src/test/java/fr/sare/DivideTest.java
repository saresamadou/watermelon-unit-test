package fr.sare;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;

import static fr.sare.Divider.divide;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {

    @Test
    void testDivision() {
        double result = divide(10, 2);

        assertEquals(5, result);
    }// There is a bug even if it is tested

    @Property(tries = 100000)
    void fuzzTestDivision(@ForAll int numerator, @ForAll int denominator) {
       divide(numerator, denominator);
    }
}
