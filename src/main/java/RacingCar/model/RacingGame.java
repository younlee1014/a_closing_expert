package racingcar.model;

import racingcar.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final static int NUMBER_OF_MOVES = 4;
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
        for (RacingCar car : cars) {
            moveOrStopCar(car);
        }
    }

    public boolean canMove(int number) {
        if (number >= NUMBER_OF_MOVES) {
            return true;
        }
        return false;
    }

    private void moveOrStopCar(RacingCar car) {
        if (canMove(RandomGenerator.getRandomNumber(RANDOM_NUMBER_RANGE))) {
            car.move();
        }
    }

}
