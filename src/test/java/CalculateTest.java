import calculate.CalculateMain;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

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
}
