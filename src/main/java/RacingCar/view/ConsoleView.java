package RacingCar.view;

import RacingCar.domain.Car;
import RacingCar.domain.RacingCar;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    static Scanner scanner = new Scanner(System.in);

    public static void printCarsPosition(List<Car> cars) {
        RacingCar.carPositionList(cars)
                .forEach(ConsoleView::visiblePosition);
    }

    private static void visiblePosition(Integer position) {
        String visiblePosition = new String(new char[position]).replace("\0", "-");
        System.out.println(visiblePosition);
    }

    public static int getCarNo() {
        System.out.println("자동차는 몇대 ?");
        return scanner.nextInt();
    }

    public static int getTryNo() {
        System.out.println("시도할 횟수는 ?");
        return scanner.nextInt();
    }
}
