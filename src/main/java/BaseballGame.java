import Judge.JudgeBall;
import ball.Ball;
import util.Constant;
import view.InputView;
import view.ResultView;

import java.util.List;

public class BaseballGame {

    public static void main(String[] args) {

        Ball ball = new Ball();

        InputView inView = new InputView();
        ResultView resView = new ResultView();

        JudgeBall judge = new JudgeBall();

        do {
            List<Integer> randomBall = ball.makeRandom();

            while (true) {

                List<Integer> playerBall = inView.printInputNumber();

                int ballCnt = judge.judgeBall(playerBall, randomBall);
                int strikeCnt = judge.judgeStrike(playerBall, randomBall);

                if(strikeCnt == Constant.NUMBER_LENGTH) {
                    resView.printGameOver();
                    break;
                }

                resView.printResult(ballCnt, strikeCnt);
            }

        } while(inView.printRestartGame());

    }
}
