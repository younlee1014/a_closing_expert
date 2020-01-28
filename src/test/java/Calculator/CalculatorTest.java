package Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest() {
        assertEquals(30, Calculator.add(10, 20));
    }

    @Test
    public void subtractTest() {
        assertEquals(10, Calculator.subtract(40, 30));
    }

    @Test
    public void multiplyTest() {
        assertEquals(25, Calculator.multiply(5, 5));
    }

    @Test
    public void divisionTest() {
        assertEquals(5, Calculator.division(10, 2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "*"})
    @NullSource
    public void nullCheckTest(String text) {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Calculator.calculator(2, text, 4));
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "$"})
    public void 사칙연산(String symbol) {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Calculator.calculator(2, symbol, 5));
    }
}
