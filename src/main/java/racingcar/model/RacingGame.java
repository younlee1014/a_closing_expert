package racingcar.model;

import racingcar.util.RandomGenerator;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final static int RANDOM_NUMBER_RANGE = 10;

    private int attempts;
    private List<RacingCar> cars;

    public RacingGame() {
        cars = new ArrayList<>();
    }

    public List<RacingCar> playGame() {
        for (int i = 0; i < attempts; i++) {
            moveCars();
        }
        return cars;
    }

    public void readGame(int cars, int attempts) {
        this.attempts = attempts;
        for (int i = 0; i < cars; i++) {
            this.cars.add(new RacingCar());
        }
    }

    private void moveCars() {
        ResultView resultView = new ResultView();
        for (RacingCar car : cars) {
            moveOrStopCar(car);
        }
        resultView.showRacingCarOutPut(cars);
    }

    private void moveOrStopCar(RacingCar car) {
        int randomInt = getRandomInt();

        car.move(randomInt);

    }


    private int getRandomInt() {
        return RandomGenerator.getRandomNumber(RANDOM_NUMBER_RANGE);
    }

}
