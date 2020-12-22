package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void 더하기() {
        assertEquals(10, Calculator.plus(5, 5));
    }

    @Test
    public void 빼기() {
        assertEquals(0, Calculator.minus(5, 5));
    }

    @Test
    public void 곱하기() {
        assertEquals(25, Calculator.mul(5, 5));
    }

    @Test
    public void 나누기() {
        assertEquals(5, Calculator.divide(25, 5));
    }
}
