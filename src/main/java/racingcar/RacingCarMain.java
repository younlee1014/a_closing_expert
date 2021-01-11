package racingcar;

import racingcar.model.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingCarMain {
    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame();
        ResultView resultView = new ResultView();

        racingGame.readGame(InputView.inputCars(), InputView.inputAttempt());
        resultView.showRacingCarOutPut(racingGame.playGame());

    }

}
