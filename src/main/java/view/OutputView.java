package view;

import domain.Result;
import util.BallStatus;
import util.Constant;

public class OutputView {

    public void printResult(Result result) {

        int ball = result.getBall();
        int strike = result.getStrike();

        if(result.isNothing()) {
            System.out.println(BallStatus.NOTHING.getValue());
            return;
        }

        if(ball>0 && strike>0) {
            System.out.println(ball+BallStatus.BALL.getValue()+" "+strike+BallStatus.STRIKE.getValue());
            return;
        }

        if(ball>0) {
            System.out.println(ball+BallStatus.BALL.getValue());
            return;
        }

        if(strike>0) {
            System.out.println(strike+BallStatus.STRIKE.getValue());
            return;
        }

    }

    public void printGameOver() {
        System.out.println(Constant.GAME_OVER_MESSAGE);
    }

    public void printInputNumber() {
        System.out.println(Constant.INPUT_NUMBER_MESSAGE);
    }

    public void printRestartGame() {
        System.out.println(Constant.RESTART_GAME_MESSAGE);
    }
}
