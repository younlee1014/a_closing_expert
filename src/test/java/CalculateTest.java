import calculate.CalculateMain;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    public void executeTest(){
        CalculateMain.execute("1 * 3 - 1 / 2");
    }

    @Test
    public void inputSplit(){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> CalculateMain.inputSplit(""));

    }

    @Test
    public void operationTest(){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> CalculateMain.operation("]", 1, 3));

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
    public void multiplyTest(){
        double number = 10;
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("*", 5, 2));
    }
    @Test
    public void divideTest(){
        double number = 2;
        assertThat(number).as("should be same").isEqualTo(CalculateMain.operation("/", 10, 5));
    }
}
