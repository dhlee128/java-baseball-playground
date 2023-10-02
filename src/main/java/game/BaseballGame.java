package game;

import domain.Balls;
import domain.Result;
import util.Constant;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseballGame {

    public void exec() {

        InputView inView = new InputView();
        ResultView resView = new ResultView();

        do {

            Balls randomBalls = new Balls(makeRandom());

            while (true) {

                Balls playerBalls = inView.printInputNumber();

                Result result = playerBalls.judge(randomBalls);

                if(result.is3Strike()) {
                    resView.printGameOver();
                    break;
                }

                resView.printResult(result);
            }

        } while(inView.printRestartGame());
    }

    public List<Integer> makeRandom() {

        List<Integer> randomBalls = new ArrayList<>();
        Random random = new Random();

        while (randomBalls.size()!=Constant.NUMBER_LENGTH) {
            int num = random.nextInt(9)+1;

            if(!randomBalls.contains(num)) {
                randomBalls.add(num);
            }
        }

        return randomBalls;
    }

}
