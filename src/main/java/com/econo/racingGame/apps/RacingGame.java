package com.econo.racingGame.apps;

import com.econo.racingGame.controller.GameController;
import com.econo.racingGame.controller.RankController;
import com.econo.racingGame.view.InputView;
import com.econo.racingGame.view.ResultView;

public class RacingGame {

    public static void play() {
        GameController gameController = new GameController();
        RankController rankController = new RankController();
        gameController.makeCars(InputView.driversName());
        gameController.accerateCars(InputView.tryNumber());
        ResultView.printResult(gameController.getCars());
        ResultView.printWinner(rankController.findWinner(gameController.getCars()));
    }

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.play();
    }

}
