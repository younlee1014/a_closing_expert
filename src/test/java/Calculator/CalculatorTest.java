package Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculatorTest {

    @Test
    public void 더하기() {
        assertEquals(10, Calculator.addition(5, 5));
    }

    @Test
    public void 빼기() {
        assertEquals(0, Calculator.subtraction(5, 5));
    }

    @Test
    public void 곱하기() {
        assertEquals(25, Calculator.multiplication(5, 5));
    }

    @Test
    public void 나누기() {
        assertEquals(5, Calculator.division(25, 5));
    }

    @Test
    public void makeResultTest() {
        assertEquals(10, Calculator.makeResult("2 + 3 * 4 / 2"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    @NullSource
    public void 공백널체크(String input) {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Calculator.isBlank(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+"})
    public void 사칙연산(char operator) {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Calculator.calculate(2, operator, 5));
    }

}
