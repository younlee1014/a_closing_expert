package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    @Test
    public void 자동차의_출발_위치는_0이다() {
        RacingCar rcCar = new RacingCar();
        assertThat(rcCar.getPosition()).isEqualTo(0);
    }

    @Test
    public void random_4이상_이면_전진_한다() {
        RacingCar rcCar = new RacingCar();
        rcCar.move(5);
        assertThat(rcCar.getPosition()).isEqualTo(1);
    }

    @Test
    public void random_4이하_이면_정지_한다() {
        RacingCar rcCar = new RacingCar();
        rcCar.move(3);
        assertThat(rcCar.getPosition()).isEqualTo(0);
    }
}