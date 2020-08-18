import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute() {
        int number=1;
        int example=1;
        assertEquals(example,AbsoluteNumberCalculator.findAbsolute(number));
    }
    @Test
    void findAbsoluteNegative() {
        int number=-4;
        int example=4;
        assertEquals(example,AbsoluteNumberCalculator.findAbsolute(number));
    }

    @Test
    void findAbsolute0() {
        int number=0;
        int example=0;
        assertEquals(example,AbsoluteNumberCalculator.findAbsolute(number));
    }
}