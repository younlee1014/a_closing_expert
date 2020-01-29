import calculate.CalculateMain;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    public void executeTest(){
        CalculateMain.execute("1 * 3 - 1 / 2");
    }

    @ParameterizedTest
    @ValueSource(strings = {""," "})
    @NullSource
    public void inputSplit(String input){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> CalculateMain.inputSplit(input));

    }

    @ParameterizedTest
    @ValueSource(strings = {"]", "[","*"})
    @NullSource
    public void operationTest(String input){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> CalculateMain.operation(input, 1, 3));

    }

    @Test
    public void toDoubleTest(){
        double number = 30;
        assertThat(number).as("should not be same Object").isNotSameAs(CalculateMain.toDouble("30"));
    }

    @Test
    public void plusTest(){
        double number = 4;
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("+", 1, 3));
    }
    @Test
    public void minusTest(){
        double number = 3;
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("-", 5, 2));
    }

    @Test
    public void 곱하기테스트(){
        double number = 10;
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("*", 5, 2));
    }

    @Test
    public void 나누기(){
        double number = 2;
        assertEquals(2, CalculateMain.operation("/", 10, 5));
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("/", 10, 5));
    }
}
