package racingcar.view;

import racingcar.model.RacingCar;

import java.util.List;

public class ResultView {
    private static final char HYPHEN = '-';

    public static void showRacingCarOutPut(List<RacingCar> cars) {
        for (RacingCar car : cars) {
            System.out.println(car.showMove(HYPHEN));
        }
    }
}
