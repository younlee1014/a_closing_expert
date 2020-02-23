package RacingCar;

import RacingCar.domain.RacingCar;
import RacingCar.view.ConsoleView;

public class RacingMain {
    public static void main(String[] args) {
        int carNo = ConsoleView.getCarNo();
        int tryNo = ConsoleView.getTryNo();

        RacingCar racingCar = new RacingCar(carNo);
        System.out.println("\n실행결과");

        for (int i = 0; i < tryNo; i++) {
            racingCar.racing();
            ConsoleView.printCarsPosition(racingCar.getCars());
            System.out.println();
        }
    }
}
